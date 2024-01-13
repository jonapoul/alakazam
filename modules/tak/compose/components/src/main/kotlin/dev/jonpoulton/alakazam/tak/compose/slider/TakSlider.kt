package dev.jonpoulton.alakazam.tak.compose.slider

import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredSizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview
import kotlinx.coroutines.launch
import kotlin.math.max
import kotlin.math.min

@Composable
public fun TakSlider(
  state: MutableState<Float>,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  valueRange: ClosedFloatingPointRange<Float> = DefaultTrackRange,
  steps: Int = 0,
  decimalPoints: Int = 1,
  colors: TakSliderColors = DefaultTakSliderColors(),
  dimensions: TakSliderDimensions = DefaultTakSliderDimensions(),
  textPosition: TakSliderTextPosition = TakSliderTextPosition.AboveThumb,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  onValueChangeFinished: (() -> Unit)? = null,
) {
  TakSlider(
    value = state.value,
    onValueChange = { state.value = it },
    modifier,
    enabled,
    valueRange,
    steps,
    decimalPoints,
    colors,
    dimensions,
    textPosition,
    interactionSource,
    onValueChangeFinished,
  )
}

@Composable
public fun TakSlider(
  value: Float,
  onValueChange: (Float) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  valueRange: ClosedFloatingPointRange<Float> = DefaultTrackRange,
  steps: Int = 0,
  decimalPoints: Int = 1,
  colors: TakSliderColors = DefaultTakSliderColors(),
  dimensions: TakSliderDimensions = DefaultTakSliderDimensions(),
  textPosition: TakSliderTextPosition = TakSliderTextPosition.AboveThumb,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  onValueChangeFinished: (() -> Unit)? = null,
) {
  require(value in valueRange) { "$value is not in the given range $valueRange" }
  require(decimalPoints >= 0) { "Must have at least 0 decimal places, not $decimalPoints" }
  val onValueChangeState = rememberUpdatedState(onValueChange)
  val tickFractions = remember(steps) { stepsToTickFractions(steps) }

  BoxWithConstraints(
    modifier = modifier
      .minimumTouchTargetSize()
      .requiredSizeIn(minWidth = dimensions.thumbRadius * 2, minHeight = dimensions.thumbRadius * 2)
      .sliderSemantics(value, enabled, onValueChange, onValueChangeFinished, valueRange, steps)
      .focusable(enabled, interactionSource),
  ) {
    val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl
    val widthPx = constraints.maxWidth.toFloat()
    val maxPx: Float
    val minPx: Float

    with(LocalDensity.current) {
      maxPx = max(widthPx - dimensions.thumbRadius.toPx(), 0f)
      minPx = min(dimensions.thumbRadius.toPx(), maxPx)
    }
    val pixelRange = minPx..maxPx

    fun scaleToUserValue(offset: Float) = scale(minPx, maxPx, offset, valueRange.start, valueRange.endInclusive)
    fun scaleToOffset(userValue: Float) = scale(valueRange.start, valueRange.endInclusive, userValue, minPx, maxPx)

    val scope = rememberCoroutineScope()
    val rawOffset = remember { mutableStateOf(scaleToOffset(value)) }
    val pressOffset = remember { mutableStateOf(0f) }

    val draggableState = remember(minPx, maxPx, valueRange) {
      SliderDraggableState { delta ->
        rawOffset.value = (rawOffset.value + delta + pressOffset.value).coerceIn(pixelRange)
        pressOffset.value = 0f
        val offsetInTrack = rawOffset.value.coerceIn(minPx, maxPx)
        onValueChangeState.value.invoke(scaleToUserValue(offsetInTrack))
      }
    }

    CorrectValueSideEffect(::scaleToOffset, valueRange, minPx..maxPx, rawOffset, value)

    val gestureEndAction = rememberUpdatedState<(Float) -> Unit> { velocity: Float ->
      val current = rawOffset.value
      val target = snapValueToTick(current, tickFractions, minPx, maxPx)
      if (current != target) {
        scope.launch {
          animateToTarget(draggableState, current, target, velocity)
          onValueChangeFinished?.invoke()
        }
      } else if (!draggableState.isDragging) {
        // check ifDragging in case the change is still in progress (touch -> drag case)
        onValueChangeFinished?.invoke()
      }
    }

    val press = Modifier.sliderTapModifier(
      draggableState,
      interactionSource,
      widthPx,
      isRtl,
      rawOffset,
      gestureEndAction,
      pressOffset,
      enabled,
    )

    val drag = Modifier.draggable(
      orientation = Orientation.Horizontal,
      reverseDirection = isRtl,
      interactionSource = interactionSource,
      onDragStopped = { velocity -> gestureEndAction.value.invoke(velocity) },
      startDragImmediately = draggableState.isDragging,
      state = draggableState,
    )

    val coerced = value.coerceIn(valueRange.start, valueRange.endInclusive)
    val fraction = calcFraction(valueRange.start, valueRange.endInclusive, coerced)

    Box(
      modifier = press
        .then(drag)
        .then(DefaultSliderConstraints),
      contentAlignment = when (textPosition) {
        TakSliderTextPosition.AboveThumb -> Alignment.BottomStart
        TakSliderTextPosition.BelowThumb -> Alignment.TopStart
        TakSliderTextPosition.None -> Alignment.CenterStart
      },
    ) {
      LinearTrack(
        Modifier.fillMaxSize(),
        fraction,
        enabled,
        textPosition,
        tickFractions,
        dimensions,
        colors,
      )
      LinearThumb(
        rawOffset,
        decimalPoints,
        enabled,
        interactionSource,
        valueRange,
        pixelRange,
        textPosition,
        dimensions,
        colors,
      )
    }
  }
}

private val PreviewModifier = Modifier
  .width(500.dp)
  .wrapContentHeight()

@PreviewDark
@Composable
private fun SliderWithTextAbove() = TakPreview {
  val state = remember { mutableStateOf(0f) }
  Box(modifier = PreviewModifier) {
    TakSlider(
      state = state,
      textPosition = TakSliderTextPosition.AboveThumb,
    )
  }
}

@PreviewDark
@Composable
private fun SliderWithTextBelow() = TakPreview {
  val state = remember { mutableStateOf(1f) }
  Box(modifier = PreviewModifier) {
    TakSlider(
      state = state,
      textPosition = TakSliderTextPosition.BelowThumb,
    )
  }
}

@PreviewDark
@Composable
private fun SliderWithNoText() = TakPreview {
  val state = remember { mutableStateOf(0.5f) }
  Box(modifier = PreviewModifier) {
    TakSlider(
      state = state,
      textPosition = TakSliderTextPosition.None,
    )
  }
}

@PreviewDark
@Composable
private fun Disabled() = TakPreview {
  val state = remember { mutableStateOf(0.5f) }
  Box(modifier = PreviewModifier) {
    TakSlider(
      state = state,
      enabled = false,
    )
  }
}
