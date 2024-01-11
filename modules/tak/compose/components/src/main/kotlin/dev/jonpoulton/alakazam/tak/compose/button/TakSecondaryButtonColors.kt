package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors

interface TakSecondaryButtonColors {
  @Stable
  @Composable
  fun backgroundColor(enabled: Boolean, pressed: Boolean): State<Color>

  @Stable
  @Composable
  fun foregroundColor(enabled: Boolean, pressed: Boolean): State<Color>

  @Stable
  @Composable
  fun borderColor(enabled: Boolean, pressed: Boolean): State<Color>
}

@Stable
@Immutable
data class DefaultTakSecondaryButtonColors(
  val normalBackgroundColor: Color = Color.Transparent,
  val pressedBackgroundColor: Color = TakColors.Sand,
  val disabledBackgroundColor: Color = TakColors.Ash,
  val normalForegroundColor: Color = TakColors.Sand,
  val pressedForegroundColor: Color = TakColors.Ink,
  val disabledForegroundColor: Color = TakLegacyColors.Gray,
  val normalBorderColor: Color = TakColors.Sand,
  val pressedBorderColor: Color = Color.Transparent,
  val disabledBorderColor: Color = TakLegacyColors.Gray,
) : TakSecondaryButtonColors {
  @Stable
  @Composable
  override fun backgroundColor(enabled: Boolean, pressed: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> disabledBackgroundColor
      pressed -> pressedBackgroundColor
      else -> normalBackgroundColor
    },
  )

  @Stable
  @Composable
  override fun foregroundColor(enabled: Boolean, pressed: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> disabledForegroundColor
      pressed -> pressedForegroundColor
      else -> normalForegroundColor
    },
  )

  @Stable
  @Composable
  override fun borderColor(enabled: Boolean, pressed: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> disabledBorderColor
      pressed -> pressedBorderColor
      else -> normalBorderColor
    },
  )
}
