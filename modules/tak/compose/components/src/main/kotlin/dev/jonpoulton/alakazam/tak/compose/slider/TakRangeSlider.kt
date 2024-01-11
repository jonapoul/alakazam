@file:Suppress("LongMethod", "LongParameterList")

package dev.jonpoulton.alakazam.tak.compose.slider

import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredSizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakTypography
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview
import kotlinx.coroutines.launch
import kotlin.math.floor

@Composable
fun TakRangeSlider(
  state: MutableState<ClosedFloatingPointRange<Float>>,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  valueRange: ClosedFloatingPointRange<Float> = DefaultTrackRange,
  steps: Int = 0,
  colors: TakSliderColors = DefaultTakSliderColors(),
  dimensions: TakSliderDimensions = DefaultTakRangeSliderDimensions,
  startInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  endInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  onValueChangeFinished: (() -> Unit)? = null,
) {
  var value by state
  TakRangeSlider(
    value = value,
    onValueChange = { value = it },
    modifier,
    enabled,
    valueRange,
    steps,
    colors,
    dimensions,
    startInteractionSource,
    endInteractionSource,
    onValueChangeFinished,
  )
}

@Composable
fun TakRangeSlider(
  value: ClosedFloatingPointRange<Float>,
  onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  valueRange: ClosedFloatingPointRange<Float> = DefaultTrackRange,
  steps: Int = 0,
  colors: TakSliderColors = DefaultTakSliderColors(),
  dimensions: TakSliderDimensions = DefaultTakRangeSliderDimensions,
  startInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  endInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  onValueChangeFinished: (() -> Unit)? = null,
) {
  require(steps >= 0) { "steps should be >= 0" }
  val onValueChangeState = rememberUpdatedState(onValueChange)
  val tickFractions = remember(steps) { stepsToTickFractions(steps) }
  val thumbRadius = dimensions.thumbRadius

  BoxWithConstraints(
    modifier = modifier
      .minimumTouchTargetSize()
      .requiredSizeIn(minWidth = thumbRadius * 4, minHeight = thumbRadius * 2),
  ) {
    val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl
    val widthPx = constraints.maxWidth.toFloat()
    val maxPx: Float
    val minPx: Float

    with(LocalDensity.current) {
      maxPx = widthPx - thumbRadius.toPx()
      minPx = thumbRadius.toPx()
    }

    fun scaleToUserValue(offset: ClosedFloatingPointRange<Float>) =
      scale(minPx, maxPx, offset, valueRange.start, valueRange.endInclusive)

    fun scaleToOffset(userValue: Float) = scale(valueRange.start, valueRange.endInclusive, userValue, minPx, maxPx)

    val rawOffsetStart = remember { mutableStateOf(scaleToOffset(value.start)) }
    val rawOffsetEnd = remember { mutableStateOf(scaleToOffset(value.endInclusive)) }

    CorrectValueSideEffect(::scaleToOffset, valueRange, minPx..maxPx, rawOffsetStart, value.start)
    CorrectValueSideEffect(::scaleToOffset, valueRange, minPx..maxPx, rawOffsetEnd, value.endInclusive)

    val scope = rememberCoroutineScope()
    val gestureEndAction = rememberUpdatedState<(Boolean) -> Unit> { isStart ->
      val current = (if (isStart) rawOffsetStart else rawOffsetEnd).value
      // target is a closest anchor to the `current`, if exists
      val target = snapValueToTick(current, tickFractions, minPx, maxPx)
      if (current == target) {
        onValueChangeFinished?.invoke()
        return@rememberUpdatedState
      }

      scope.launch {
        Animatable(initialValue = current).animateTo(target, SliderToTickAnimation, 0f) {
          (if (isStart) rawOffsetStart else rawOffsetEnd).value = this.value
          onValueChangeState.value.invoke(
            scaleToUserValue(rawOffsetStart.value..rawOffsetEnd.value),
          )
        }

        onValueChangeFinished?.invoke()
      }
    }

    val onDrag = rememberUpdatedState<(Boolean, Float) -> Unit> { isStart, offset ->
      val offsetRange = if (isStart) {
        rawOffsetStart.value = (rawOffsetStart.value + offset)
        rawOffsetEnd.value = scaleToOffset(value.endInclusive)
        val offsetEnd = rawOffsetEnd.value
        val offsetStart = rawOffsetStart.value.coerceIn(minPx, offsetEnd)
        offsetStart..offsetEnd
      } else {
        rawOffsetEnd.value = (rawOffsetEnd.value + offset)
        rawOffsetStart.value = scaleToOffset(value.start)
        val offsetStart = rawOffsetStart.value
        val offsetEnd = rawOffsetEnd.value.coerceIn(offsetStart, maxPx)
        offsetStart..offsetEnd
      }

      onValueChangeState.value.invoke(scaleToUserValue(offsetRange))
    }

    val pressDrag = Modifier.rangeSliderPressDragModifier(
      startInteractionSource,
      endInteractionSource,
      rawOffsetStart,
      rawOffsetEnd,
      enabled,
      isRtl,
      widthPx,
      valueRange,
      gestureEndAction,
      onDrag,
    )

    // The positions of the thumbs are dependant on each other.
    val coercedStart = value.start.coerceIn(valueRange.start, value.endInclusive)
    val coercedEnd = value.endInclusive.coerceIn(value.start, valueRange.endInclusive)
    val fractionStart = calcFraction(valueRange.start, valueRange.endInclusive, coercedStart)
    val fractionEnd = calcFraction(valueRange.start, valueRange.endInclusive, coercedEnd)
    val startSteps = floor(steps * fractionEnd).toInt()
    val endSteps = floor(steps * (1f - fractionStart)).toInt()

    val startThumbSemantics = Modifier.sliderSemantics(
      coercedStart,
      enabled,
      onValueChange = { value -> onValueChangeState.value.invoke(value..coercedEnd) },
      onValueChangeFinished,
      valueRange = valueRange.start..coercedEnd,
      startSteps,
    )
    val endThumbSemantics = Modifier.sliderSemantics(
      coercedEnd,
      enabled,
      onValueChange = { value -> onValueChangeState.value.invoke(coercedStart..value) },
      onValueChangeFinished,
      valueRange = coercedStart..valueRange.endInclusive,
      endSteps,
    )

    RangeSliderImpl(
      enabled,
      fractionStart,
      fractionEnd,
      tickFractions,
      width = maxPx - minPx,
      startInteractionSource,
      endInteractionSource,
      modifier = pressDrag,
      startThumbSemantics,
      endThumbSemantics,
      dimensions,
      colors,
    )
  }
}

@Composable
private fun RangeSliderImpl(
  enabled: Boolean,
  positionFractionStart: Float,
  positionFractionEnd: Float,
  tickFractions: List<Float>,
  width: Float,
  startInteractionSource: MutableInteractionSource,
  endInteractionSource: MutableInteractionSource,
  modifier: Modifier,
  startThumbSemantics: Modifier,
  endThumbSemantics: Modifier,
  dimensions: TakSliderDimensions = DefaultTakRangeSliderDimensions,
  colors: TakSliderColors = DefaultTakSliderColors(),
) {

  Box(modifier.then(DefaultSliderConstraints)) {
    val widthDp = with(LocalDensity.current) { width.toDp() }
    val thumbSize = dimensions.thumbRadius * 2
    val offsetStart = widthDp * positionFractionStart
    val offsetEnd = widthDp * positionFractionEnd

    RangeTrack(
      Modifier
        .align(Alignment.CenterStart)
        .fillMaxSize(),
      positionFractionStart,
      positionFractionEnd,
      enabled,
      tickFractions,
      dimensions = dimensions,
      colors = colors,
    )

    RangeThumb(
      Modifier
        .semantics(mergeDescendants = true) { /* No-op */ }
        .focusable(true, startInteractionSource)
        .then(startThumbSemantics),
      offsetStart,
      startInteractionSource,
      colors,
      enabled,
      thumbSize,
    )
    RangeThumb(
      Modifier
        .semantics(mergeDescendants = true) { /* No-op */ }
        .focusable(true, endInteractionSource)
        .then(endThumbSemantics),
      offsetEnd,
      endInteractionSource,
      colors,
      enabled,
      thumbSize,
    )
  }
}

@PreviewDark
@Composable
private fun Zero() = TakPreview {
  Column(modifier = Modifier.width(500.dp)) {
    var value by remember { mutableStateOf(0f..0f) }
    Text("State = $value", style = TakTypography.body2)
    TakRangeSlider(
      value = value,
      onValueChange = { value = it },
    )
  }
}

@PreviewDark
@Composable
private fun Half() = TakPreview {
  Column(modifier = Modifier.width(500.dp)) {
    var value by remember { mutableStateOf(0f..0.5f) }
    Text("State = $value", style = TakTypography.body2)
    TakRangeSlider(
      value = value,
      onValueChange = { value = it },
    )
  }
}

@PreviewDark
@Composable
private fun Full() = TakPreview {
  Column(modifier = Modifier.width(500.dp)) {
    var value by remember { mutableStateOf(0f..1f) }
    Text("State = $value", style = TakTypography.body2)
    TakRangeSlider(
      value = value,
      onValueChange = { value = it },
    )
  }
}


@PreviewDark
@Composable
private fun Partial() = TakPreview {
  Column(modifier = Modifier.width(500.dp)) {
    var value by remember { mutableStateOf(0.2f..0.8f) }
    Text("State = $value", style = TakTypography.body2)
    TakRangeSlider(
      value = value,
      onValueChange = { value = it },
      steps = 4,
    )
  }
}
