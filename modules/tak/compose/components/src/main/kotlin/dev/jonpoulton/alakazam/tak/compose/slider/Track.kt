package dev.jonpoulton.alakazam.tak.compose.slider

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.lerp
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview
import dev.jonpoulton.alakazam.tak.compose.slider.TakSliderTextPosition.AboveThumb
import dev.jonpoulton.alakazam.tak.compose.slider.TakSliderTextPosition.BelowThumb
import dev.jonpoulton.alakazam.tak.compose.slider.TakSliderTextPosition.None
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

@Composable
internal fun LinearTrack(
  modifier: Modifier,
  positionFraction: Float,
  enabled: Boolean,
  textPosition: TakSliderTextPosition,
  stepFractions: ImmutableList<Float> = persistentListOf(),
  dimensions: TakSliderDimensions = DefaultTakSliderDimensions(),
  colors: TakSliderColors = DefaultTakSliderColors(),
) {
  val topPadding = when (textPosition) {
    AboveThumb -> dimensions.thumbRadius
    BelowThumb, None -> 0.dp
  }
  val bottomPadding = when (textPosition) {
    BelowThumb -> dimensions.thumbRadius
    AboveThumb, None -> 0.dp
  }
  RangeTrack(
    modifier,
    fractionStart = 0f,
    fractionEnd = positionFraction,
    enabled,
    stepFractions,
    topPadding,
    bottomPadding,
    dimensions,
    colors,
  )
}

@Composable
internal fun RangeTrack(
  modifier: Modifier,
  fractionStart: Float,
  fractionEnd: Float,
  enabled: Boolean,
  tickFractions: ImmutableList<Float>,
  topPadding: Dp = 0.dp,
  bottomPadding: Dp = 0.dp,
  dimensions: TakSliderDimensions = DefaultTakSliderDimensions(),
  colors: TakSliderColors = DefaultTakSliderColors(),
) {
  require(fractionStart in 0f..1f) { "Lower bound must be from 0 to 1 inclusive, got $fractionStart" }
  require(fractionEnd in 0f..1f) { "Upper bound must be from 0 to 1 inclusive, got $fractionEnd" }
  require(fractionStart <= fractionEnd) { "Lower bound ($fractionStart) must be below upper bound ($fractionEnd)" }

  val inactiveTrackColor = colors.trackColor(enabled, active = false)
  val activeTrackColor = colors.trackColor(enabled, active = true)
  val inactiveTickColor = colors.tickColor(enabled, active = false)
  val activeTickColor = colors.tickColor(enabled, active = true)

  val thumbPx: Float
  val trackStrokeWidthPx: Float
  val stepRadiusPx: Float
  with(LocalDensity.current) {
    thumbPx = dimensions.thumbRadius.toPx()
    trackStrokeWidthPx = dimensions.trackHeight.toPx()
    stepRadiusPx = dimensions.stepRadius.toPx()
  }

  Canvas(modifier.padding(top = topPadding, bottom = bottomPadding)) {
    val isRtl = layoutDirection == LayoutDirection.Rtl
    val sliderLeft = Offset(thumbPx, center.y)
    val sliderRight = Offset(size.width - thumbPx, center.y)
    val sliderStart = if (isRtl) sliderRight else sliderLeft
    val sliderEnd = if (isRtl) sliderLeft else sliderRight
    drawLine(
      inactiveTrackColor.value,
      sliderStart,
      sliderEnd,
      trackStrokeWidthPx,
      StrokeCap.Round,
    )
    val sliderValueEnd = Offset(
      sliderStart.x + (sliderEnd.x - sliderStart.x) * fractionEnd,
      center.y,
    )

    val sliderValueStart = Offset(
      sliderStart.x + (sliderEnd.x - sliderStart.x) * fractionStart,
      center.y,
    )

    drawLine(
      activeTrackColor.value,
      sliderValueStart,
      sliderValueEnd,
      trackStrokeWidthPx,
      StrokeCap.Round,
    )
    tickFractions
      .groupBy { pos -> pos > fractionEnd || pos < fractionStart }
      .forEach { (outsideFraction, list) ->
        drawPoints(
          list.map { pos -> Offset(lerp(sliderStart, sliderEnd, pos).x, center.y) },
          PointMode.Points,
          (if (outsideFraction) inactiveTickColor else activeTickColor).value,
          stepRadiusPx,
          StrokeCap.Round,
        )
      }
  }
}

private val DefaultPreviewModifier = Modifier
  .width(400.dp)
  .wrapContentHeight()
  .padding(10.dp)

@PreviewDark
@Composable
private fun LinearTrackFull() = TakPreview {
  LinearTrack(DefaultPreviewModifier, positionFraction = 1f, enabled = true, textPosition = BelowThumb)
}

@PreviewDark
@Composable
private fun LinearTrackDisabled() = TakPreview {
  LinearTrack(DefaultPreviewModifier, positionFraction = 0.5f, enabled = false, textPosition = AboveThumb)
}

@PreviewDark
@Composable
private fun TrackEmpty() = TakPreview {
  RangeTrack(
    modifier = DefaultPreviewModifier,
    fractionStart = 0f,
    fractionEnd = 0f,
    enabled = true,
    tickFractions = persistentListOf(),
  )
}

@PreviewDark
@Composable
private fun TrackHalfway() = TakPreview {
  RangeTrack(
    modifier = DefaultPreviewModifier,
    fractionStart = 0f,
    fractionEnd = 0.5f,
    enabled = true,
    tickFractions = persistentListOf(),
  )
}

@PreviewDark
@Composable
private fun TrackHalfwayDisabled() = TakPreview {
  RangeTrack(
    modifier = DefaultPreviewModifier,
    fractionStart = 0f,
    fractionEnd = 0.5f,
    enabled = false,
    tickFractions = persistentListOf(),
  )
}

@PreviewDark
@Composable
private fun TrackFull() = TakPreview {
  RangeTrack(
    modifier = DefaultPreviewModifier,
    fractionStart = 0f,
    fractionEnd = 1f,
    enabled = true,
    tickFractions = persistentListOf(),
  )
}

@PreviewDark
@Composable
private fun RangePartial() = TakPreview {
  RangeTrack(
    modifier = DefaultPreviewModifier,
    fractionStart = 0.25f,
    fractionEnd = 0.75f,
    enabled = true,
    tickFractions = persistentListOf(),
  )
}

@PreviewDark
@Composable
private fun RangeStepped() = TakPreview {
  RangeTrack(
    modifier = DefaultPreviewModifier,
    fractionStart = 0.2f,
    fractionEnd = 0.8f,
    enabled = true,
    tickFractions = persistentListOf(0f, 0.2f, 0.4f, 0.6f, 0.8f, 1f),
  )
}
