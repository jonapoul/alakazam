package dev.jonpoulton.alakazam.tak.compose.text

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Stable
interface TakIntegerPickerDimensions {
  val iconSize: Dp
  val iconPadding: PaddingValues
  val borderThickness: Dp
  val cornerRadius: Dp
}

@Stable
@Immutable
data class DefaultTakIntegerPickerDimensions(
  override val iconSize: Dp = 24.dp,
  override val iconPadding: PaddingValues = PaddingValues(all = 5.dp),
  override val borderThickness: Dp = 1.dp,
  override val cornerRadius: Dp = 2.dp,
) : TakIntegerPickerDimensions
