package dev.jonpoulton.alakazam.tak.compose.slider

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Stable
@Immutable
interface TakSliderDimensions {
  val activeThumbTextSize: TextUnit
  val inactiveThumbTextSize: TextUnit
  val trackHeight: Dp
  val thumbRadius: Dp
  val stepRadius: Dp
}

@Stable
@Immutable
data class DefaultTakSliderDimensions(
  override val activeThumbTextSize: TextUnit = 12.sp,
  override val inactiveThumbTextSize: TextUnit = 10.sp,
  override val trackHeight: Dp = 4.dp,
  override val thumbRadius: Dp = 16.dp,
  override val stepRadius: Dp = 10.dp,
) : TakSliderDimensions

val DefaultTakRangeSliderDimensions: TakSliderDimensions = DefaultTakSliderDimensions(thumbRadius = 12.dp)
