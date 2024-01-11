package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors

interface TakMarkerButtonColors {
  @Stable
  @Composable
  fun backgroundColor(enabled: Boolean, pressed: Boolean): State<Color>

  @Stable
  @Composable
  fun borderColor(enabled: Boolean, pressed: Boolean): State<Color>
}

@Stable
@Immutable
data class DefaultTakMarkerButtonColors(
  val normalBackgroundColor: Color = TakColors.Ink,
  val pressedBackgroundColor: Color = TakColors.Ash,
  val disabledBackgroundColor: Color = TakColors.Ash,
  val normalBorderColor: Color = TakLegacyColors.PaleSilver,
  val pressedBorderColor: Color = normalBorderColor,
  val disabledBorderColor: Color = TakLegacyColors.Gray,
) : TakMarkerButtonColors {
  @Composable
  override fun backgroundColor(enabled: Boolean, pressed: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> disabledBackgroundColor
      pressed -> pressedBackgroundColor
      else -> normalBackgroundColor
    },
  )

  @Composable
  override fun borderColor(enabled: Boolean, pressed: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> disabledBorderColor
      pressed -> pressedBorderColor
      else -> normalBorderColor
    },
  )
}
