@file:Suppress(
  "MatchingDeclarationName",
  "MagicNumber",
  "LongParameterList",
  "TooManyFunctions",
  "SwallowedException",
  "NestedBlockDepth",
  "ReturnCount",
)

package dev.jonpoulton.alakazam.tak.compose.slider

import android.annotation.SuppressLint
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.TweenSpec
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.MutatorMutex
import androidx.compose.foundation.gestures.DragScope
import androidx.compose.foundation.gestures.DraggableState
import androidx.compose.foundation.gestures.GestureCancellationException
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.forEachGesture
import androidx.compose.foundation.gestures.horizontalDrag
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.progressSemantics
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.LocalMinimumTouchTargetEnforcement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.AwaitPointerEventScope
import androidx.compose.ui.input.pointer.PointerEvent
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerId
import androidx.compose.ui.input.pointer.PointerInputChange
import androidx.compose.ui.input.pointer.PointerType
import androidx.compose.ui.input.pointer.changedToUpIgnoreConsumed
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.platform.LocalViewConfiguration
import androidx.compose.ui.platform.ViewConfiguration
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.setProgress
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.fastFirstOrNull
import androidx.compose.ui.util.lerp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakFonts
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.roundToInt
import kotlin.math.sign

/**
 * Most of this file has been copypasted from private/internal functions in [androidx.compose.material], since we need
 * access to them. Fuck off Google
 */

internal val ThumbDefaultElevation = 1.dp

internal val ThumbPressedElevation = 6.dp

internal val ThumbRippleRadius = 24.dp

internal val DefaultTrackRange = 0f..1f

internal val ThumbTextStyle = TextStyle(TakColors.Cloud, 10.sp, FontWeight.Bold, fontFamily = TakFonts.Family)

private val DefaultSliderHeight = 48.dp

private val DefaultSliderWidth = 144.dp

internal val DefaultSliderConstraints = Modifier
  .widthIn(min = DefaultSliderWidth)
  .heightIn(max = DefaultSliderHeight)


internal class SliderDraggableState(
  val onDelta: (Float) -> Unit,
) : DraggableState {

  var isDragging by mutableStateOf(false)
    private set

  private val dragScope: DragScope = object : DragScope {
    override fun dragBy(pixels: Float): Unit = onDelta(pixels)
  }

  private val scrollMutex = MutatorMutex()

  override suspend fun drag(
    dragPriority: MutatePriority,
    block: suspend DragScope.() -> Unit,
  ): Unit = coroutineScope {
    isDragging = true
    scrollMutex.mutateWith(dragScope, dragPriority, block)
    isDragging = false
  }

  override fun dispatchRawDelta(delta: Float) {
    return onDelta(delta)
  }
}

internal fun Modifier.sliderTapModifier(
  draggableState: DraggableState,
  interactionSource: MutableInteractionSource,
  maxPx: Float,
  isRtl: Boolean,
  rawOffset: State<Float>,
  gestureEndAction: State<(Float) -> Unit>,
  pressOffset: MutableState<Float>,
  enabled: Boolean,
) = composed(
  factory = {
    if (enabled) {
      val scope = rememberCoroutineScope()
      pointerInput(draggableState, interactionSource, maxPx, isRtl) {
        detectTapGestures(
          onPress = { pos ->
            val to = if (isRtl) maxPx - pos.x else pos.x
            pressOffset.value = to - rawOffset.value
            try {
              awaitRelease()
            } catch (_: GestureCancellationException) {
              pressOffset.value = 0f
            }
          },
          onTap = {
            scope.launch {
              draggableState.drag(MutatePriority.UserInput) {
                // just trigger animation, press offset will be applied
                dragBy(0f)
              }
              gestureEndAction.value.invoke(0f)
            }
          },
        )
      }
    } else {
      this
    }
  },
  inspectorInfo = debugInspectorInfo {
    name = "sliderTapModifier"
    properties["draggableState"] = draggableState
    properties["interactionSource"] = interactionSource
    properties["maxPx"] = maxPx
    properties["isRtl"] = isRtl
    properties["rawOffset"] = rawOffset
    properties["gestureEndAction"] = gestureEndAction
    properties["pressOffset"] = pressOffset
    properties["enabled"] = enabled
  },
)

internal fun Modifier.sliderSemantics(
  value: Float,
  enabled: Boolean,
  onValueChange: (Float) -> Unit,
  onValueChangeFinished: (() -> Unit)? = null,
  valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
  steps: Int = 0,
): Modifier {
  val coerced = value.coerceIn(valueRange.start, valueRange.endInclusive)
  return semantics {
    if (!enabled) disabled()
    setProgress(
      action = { targetValue ->
        var newValue = targetValue.coerceIn(valueRange.start, valueRange.endInclusive)
        val originalVal = newValue
        val resolvedValue = if (steps > 0) {
          var distance: Float = newValue
          for (i in 0..steps + 1) {
            val stepValue = lerp(
              valueRange.start,
              valueRange.endInclusive,
              i.toFloat() / (steps + 1),
            )
            if (abs(stepValue - originalVal) <= distance) {
              distance = abs(stepValue - originalVal)
              newValue = stepValue
            }
          }
          newValue
        } else {
          newValue
        }
        // This is to keep it consistent with AbsSeekbar.java: return false if no
        // change from current.
        if (resolvedValue == coerced) {
          false
        } else {
          onValueChange(resolvedValue)
          onValueChangeFinished?.invoke()
          true
        }
      },
    )
  }.progressSemantics(value, valueRange, steps)
}

internal fun calcFraction(a: Float, b: Float, pos: Float) =
  (if (b - a == 0f) 0f else (pos - a) / (b - a)).coerceIn(0f, 1f)

internal fun scale(a1: Float, b1: Float, x1: Float, a2: Float, b2: Float) =
  lerp(a2, b2, calcFraction(a1, b1, x1))

internal fun scale(a1: Float, b1: Float, x: ClosedFloatingPointRange<Float>, a2: Float, b2: Float) =
  scale(a1, b1, x.start, a2, b2)..scale(a1, b1, x.endInclusive, a2, b2)

@Stable
internal fun Float.mapToNewRange(inRange: ClosedRange<Float>, outRange: ClosedRange<Float>): Float {
  val inSize = inRange.endInclusive - inRange.start
  val outSize = outRange.endInclusive - outRange.start
  return (this - inRange.start) * outSize / inSize + outRange.start
}

internal fun stepsToTickFractions(steps: Int): ImmutableList<Float> {
  return if (steps == 0) persistentListOf() else List(steps + 2) { it.toFloat() / (steps + 1) }.toImmutableList()
}

@Composable
internal fun CorrectValueSideEffect(
  scaleToOffset: (Float) -> Float,
  valueRange: ClosedFloatingPointRange<Float>,
  trackRange: ClosedFloatingPointRange<Float>,
  valueState: MutableState<Float>,
  value: Float,
) {
  SideEffect {
    val error = (valueRange.endInclusive - valueRange.start) / 1000
    val newOffset = scaleToOffset(value)
    if (abs(newOffset - valueState.value) > error) {
      if (valueState.value in trackRange) {
        valueState.value = newOffset
      }
    }
  }
}

internal fun snapValueToTick(
  current: Float,
  tickFractions: ImmutableList<Float>,
  minPx: Float,
  maxPx: Float,
): Float {
  // target is a closest anchor to the `current`, if exists
  return tickFractions
    .minByOrNull { abs(lerp(minPx, maxPx, it) - current) }
    ?.run { lerp(minPx, maxPx, this) }
    ?: current
}

internal suspend fun animateToTarget(
  draggableState: DraggableState,
  current: Float,
  target: Float,
  velocity: Float,
) {
  draggableState.drag {
    var latestValue = current
    Animatable(initialValue = current).animateTo(target, SliderToTickAnimation, velocity) {
      dragBy(this.value - latestValue)
      latestValue = this.value
    }
  }
}

internal val SliderToTickAnimation = TweenSpec<Float>(durationMillis = 100)

@OptIn(ExperimentalMaterialApi::class)
@SuppressLint("ModifierFactoryUnreferencedReceiver")
@Suppress("ModifierInspectorInfo")
internal fun Modifier.minimumTouchTargetSize(): Modifier = composed(
  inspectorInfo = debugInspectorInfo {
    name = "minimumTouchTargetSize"
    properties["README"] = "Adds outer padding to measure at least 48.dp (default) in " +
      "size to disambiguate touch interactions if the element would measure smaller"
  },
) {
  if (LocalMinimumTouchTargetEnforcement.current) {
    // LocalViewConfiguration changes across devices / during runtime.
    val size = LocalViewConfiguration.current.minimumTouchTargetSize
    MinimumTouchTargetModifier(size)
  } else {
    Modifier
  }
}

internal class MinimumTouchTargetModifier(val size: DpSize) : LayoutModifier {
  override fun MeasureScope.measure(
    measurable: Measurable,
    constraints: Constraints,
  ): MeasureResult {

    val placeable = measurable.measure(constraints)

    // Be at least as big as the minimum dimension in both dimensions
    val width = maxOf(placeable.width, size.width.roundToPx())
    val height = maxOf(placeable.height, size.height.roundToPx())

    return layout(width, height) {
      val centerX = ((width - placeable.width) / 2f).roundToInt()
      val centerY = ((height - placeable.height) / 2f).roundToInt()
      placeable.place(centerX, centerY)
    }
  }

  override fun equals(other: Any?): Boolean {
    val otherModifier = other as? MinimumTouchTargetModifier ?: return false
    return size == otherModifier.size
  }

  override fun hashCode(): Int {
    return size.hashCode()
  }
}

internal fun Modifier.rangeSliderPressDragModifier(
  startInteractionSource: MutableInteractionSource,
  endInteractionSource: MutableInteractionSource,
  rawOffsetStart: State<Float>,
  rawOffsetEnd: State<Float>,
  enabled: Boolean,
  isRtl: Boolean,
  maxPx: Float,
  valueRange: ClosedFloatingPointRange<Float>,
  gestureEndAction: State<(Boolean) -> Unit>,
  onDrag: State<(Boolean, Float) -> Unit>,
): Modifier =
  if (enabled) {
    pointerInput(startInteractionSource, endInteractionSource, maxPx, isRtl, valueRange) {
      val rangeSliderLogic = RangeSliderLogic(
        startInteractionSource,
        endInteractionSource,
        rawOffsetStart,
        rawOffsetEnd,
        onDrag,
      )
      coroutineScope {
        forEachGesture {
          awaitPointerEventScope {
            val event = awaitFirstDown(requireUnconsumed = false)
            val interaction = DragInteraction.Start()
            var posX = if (isRtl) maxPx - event.position.x else event.position.x
            val compare = rangeSliderLogic.compareOffsets(posX)
            var draggingStart = if (compare != 0) {
              compare < 0
            } else {
              rawOffsetStart.value > posX
            }

            awaitSlop(event.id, event.type)?.let {
              val slop = viewConfiguration.pointerSlop(event.type)
              val shouldUpdateCapturedThumb = abs(rawOffsetEnd.value - posX) < slop &&
                abs(rawOffsetStart.value - posX) < slop
              if (shouldUpdateCapturedThumb) {
                val dir = it.second
                draggingStart = if (isRtl) dir >= 0f else dir < 0f
                posX += it.first.positionChange().x
              }
            }

            rangeSliderLogic.captureThumb(
              draggingStart,
              posX,
              interaction,
              this@coroutineScope,
            )

            val finishInteraction = try {
              val success = horizontalDrag(pointerId = event.id) {
                val deltaX = it.positionChange().x
                onDrag.value.invoke(draggingStart, if (isRtl) -deltaX else deltaX)
              }
              if (success) {
                DragInteraction.Stop(interaction)
              } else {
                DragInteraction.Cancel(interaction)
              }
            } catch (e: CancellationException) {
              DragInteraction.Cancel(interaction)
            }

            gestureEndAction.value.invoke(draggingStart)
            launch {
              rangeSliderLogic
                .activeInteraction(draggingStart)
                .emit(finishInteraction)
            }
          }
        }
      }
    }
  } else {
    this
  }

private class RangeSliderLogic(
  val startInteractionSource: MutableInteractionSource,
  val endInteractionSource: MutableInteractionSource,
  val rawOffsetStart: State<Float>,
  val rawOffsetEnd: State<Float>,
  val onDrag: State<(Boolean, Float) -> Unit>,
) {
  fun activeInteraction(draggingStart: Boolean): MutableInteractionSource =
    if (draggingStart) startInteractionSource else endInteractionSource

  fun compareOffsets(eventX: Float): Int {
    val diffStart = abs(rawOffsetStart.value - eventX)
    val diffEnd = abs(rawOffsetEnd.value - eventX)
    return diffStart.compareTo(diffEnd)
  }

  fun captureThumb(
    draggingStart: Boolean,
    posX: Float,
    interaction: Interaction,
    scope: CoroutineScope,
  ) {
    onDrag.value.invoke(
      draggingStart,
      posX - if (draggingStart) rawOffsetStart.value else rawOffsetEnd.value,
    )
    scope.launch {
      activeInteraction(draggingStart).emit(interaction)
    }
  }
}

private suspend fun AwaitPointerEventScope.awaitSlop(
  id: PointerId,
  type: PointerType,
): Pair<PointerInputChange, Float>? {
  var initialDelta = 0f
  val postPointerSlop = { pointerInput: PointerInputChange, offset: Float ->
    pointerInput.consume()
    initialDelta = offset
  }
  val afterSlopResult = awaitHorizontalPointerSlopOrCancellation(id, type, postPointerSlop)
  return if (afterSlopResult != null) afterSlopResult to initialDelta else null
}

private suspend fun AwaitPointerEventScope.awaitHorizontalPointerSlopOrCancellation(
  pointerId: PointerId,
  pointerType: PointerType,
  onPointerSlopReached: (change: PointerInputChange, overSlop: Float) -> Unit,
) = awaitPointerSlopOrCancellation(
  pointerId = pointerId,
  pointerType = pointerType,
  onPointerSlopReached = onPointerSlopReached,
  getDragDirectionValue = { it.x },
)

private suspend inline fun AwaitPointerEventScope.awaitPointerSlopOrCancellation(
  pointerId: PointerId,
  pointerType: PointerType,
  onPointerSlopReached: (PointerInputChange, Float) -> Unit,
  getDragDirectionValue: (Offset) -> Float,
): PointerInputChange? {
  if (currentEvent.isPointerUp(pointerId)) {
    return null // The pointer has already been lifted, so the gesture is canceled
  }
  val touchSlop = viewConfiguration.pointerSlop(pointerType)
  var pointer: PointerId = pointerId
  var totalPositionChange = 0f

  while (true) {
    val event = awaitPointerEvent()
    val dragEvent = event.changes.fastFirstOrNull { it.id == pointer }!!
    if (dragEvent.isConsumed) {
      return null
    } else if (dragEvent.changedToUpIgnoreConsumed()) {
      val otherDown = event.changes.fastFirstOrNull { it.pressed }
      if (otherDown == null) {
        // This is the last "up"
        return null
      } else {
        pointer = otherDown.id
      }
    } else {
      val currentPosition = dragEvent.position
      val previousPosition = dragEvent.previousPosition
      val positionChange = getDragDirectionValue(currentPosition) -
        getDragDirectionValue(previousPosition)
      totalPositionChange += positionChange

      val inDirection = abs(totalPositionChange)
      if (inDirection < touchSlop) {
        // verify that nothing else consumed the drag event
        awaitPointerEvent(PointerEventPass.Final)
        if (dragEvent.isConsumed) {
          return null
        }
      } else {
        onPointerSlopReached(
          dragEvent,
          totalPositionChange - (sign(totalPositionChange) * touchSlop),
        )
        if (dragEvent.isConsumed) {
          return dragEvent
        } else {
          totalPositionChange = 0f
        }
      }
    }
  }
}

private fun PointerEvent.isPointerUp(pointerId: PointerId): Boolean =
  changes.fastFirstOrNull { it.id == pointerId }?.pressed != true

private val mouseSlop = 0.125.dp
private val defaultTouchSlop = 18.dp // The default touch slop on Android devices
private val mouseToTouchSlopRatio = mouseSlop / defaultTouchSlop

private fun ViewConfiguration.pointerSlop(pointerType: PointerType): Float {
  return when (pointerType) {
    PointerType.Mouse -> touchSlop * mouseToTouchSlopRatio
    else -> touchSlop
  }
}
