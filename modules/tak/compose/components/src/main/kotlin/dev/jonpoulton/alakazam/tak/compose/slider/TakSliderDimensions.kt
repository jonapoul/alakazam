package dev.jonpoulton.alakazam.tak.compose.slider

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Stable
@Immutable
public interface TakSliderDimensions {
  public val activeThumbTextSize: TextUnit
  public val inactiveThumbTextSize: TextUnit
  public val trackHeight: Dp
  public val thumbRadius: Dp
  public val stepRadius: Dp
}

@Stable
@Immutable
public data class DefaultTakSliderDimensions(
  override val activeThumbTextSize: TextUnit = 12.sp,
  override val inactiveThumbTextSize: TextUnit = 10.sp,
  override val trackHeight: Dp = 4.dp,
  override val thumbRadius: Dp = 16.dp,
  override val stepRadius: Dp = 10.dp,
) : TakSliderDimensions

public val DefaultTakRangeSliderDimensions: TakSliderDimensions = DefaultTakSliderDimensions(thumbRadius = 12.dp)
