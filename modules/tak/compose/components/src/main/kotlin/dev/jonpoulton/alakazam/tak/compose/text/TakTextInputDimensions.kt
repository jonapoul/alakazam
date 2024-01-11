package dev.jonpoulton.alakazam.tak.compose.text

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Stable
interface TakTextInputDimensions {
  val iconSize: Dp
  val iconPadding: PaddingValues
  val textPadding: PaddingValues
  val borderThicknessSmall: Dp
  val borderThicknessLarge: Dp
}

@Stable
@Immutable
data class DefaultTakTextInputDimensions(
  override val iconSize: Dp = 24.dp,
  override val iconPadding: PaddingValues = PaddingValues(all = 10.dp),
  override val textPadding: PaddingValues = PaddingValues(horizontal = 10.dp, vertical = 12.dp),
  override val borderThicknessSmall: Dp = 1.dp,
  override val borderThicknessLarge: Dp = 3.dp,
) : TakTextInputDimensions
