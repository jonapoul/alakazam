package dev.jonpoulton.alakazam.tak.compose.toggle

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Stable
interface TakToggleDimensions {
  val height: Dp
  val thumbElevation: Dp
  val thumbBorderWidth: Dp
  val thumbWidth: Dp
  val trackWidth: Dp
}

@Stable
@Immutable
data class DefaultTakToggleDimensions(
  override val height: Dp,
  override val thumbElevation: Dp,
  override val thumbBorderWidth: Dp,
  override val thumbWidth: Dp,
  override val trackWidth: Dp,
) : TakToggleDimensions {
  companion object {
    @Stable
    fun large(
      height: Dp = 29.dp,
      thumbElevation: Dp = 2.dp,
      thumbBorderWidth: Dp = 0.5.dp,
      thumbWidth: Dp = 70.dp,
      trackWidth: Dp = 140.dp,
    ): TakToggleDimensions =
      DefaultTakToggleDimensions(height, thumbElevation, thumbBorderWidth, thumbWidth, trackWidth)

    @Stable
    fun small(
      height: Dp = 17.dp,
      thumbElevation: Dp = 2.dp,
      thumbBorderWidth: Dp = 0.5.dp,
      thumbWidth: Dp = 28.dp,
      trackWidth: Dp = 47.dp,
    ): TakToggleDimensions =
      DefaultTakToggleDimensions(height, thumbElevation, thumbBorderWidth, thumbWidth, trackWidth)
  }
}
