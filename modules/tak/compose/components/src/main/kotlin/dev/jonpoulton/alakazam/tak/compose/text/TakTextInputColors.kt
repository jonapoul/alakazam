package dev.jonpoulton.alakazam.tak.compose.text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors

@Stable
interface TakTextInputColors {
  @Composable
  fun backgroundColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color>

  @Composable
  fun borderColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color>

  @Composable
  fun hintColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color>

  @Composable
  fun textColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color>
}

@Stable
@Immutable
data class DefaultTakTextInputColors(
  val normalBackgroundColor: Color = TakColors.Ink,
  val pressedBackgroundColor: Color = TakColors.Ash,
  val errorBackgroundColor: Color = normalBackgroundColor,
  val disabledBackgroundColor: Color = TakColors.Charcoal,
  val normalBorderColor: Color = TakColors.Sand,
  val pressedBorderColor: Color = TakColors.Sand,
  val errorBorderColor: Color = TakColors.Alert,
  val disabledBorderColor: Color = TakColors.Ash,
  val normalHintColor: Color = TakLegacyColors.Gray,
  val pressedHintColor: Color = normalHintColor,
  val errorHintColor: Color = normalHintColor,
  val disabledHintColor: Color = normalHintColor,
  val normalTextColor: Color = TakColors.Cloud,
  val pressedTextColor: Color = normalTextColor,
  val errorTextColor: Color = normalTextColor,
  val disabledTextColor: Color = TakColors.Ash,
) : TakTextInputColors {
  @Composable
  override fun backgroundColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color> =
    rememberUpdatedState(
      newValue = when {
        !enabled -> disabledBackgroundColor
        error -> errorBackgroundColor
        pressed -> pressedBackgroundColor
        else -> normalBackgroundColor
      },
    )

  @Composable
  override fun borderColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color> =
    rememberUpdatedState(
      newValue = when {
        !enabled -> disabledBorderColor
        error -> errorBorderColor
        pressed -> pressedBorderColor
        else -> normalBorderColor
      },
    )

  @Composable
  override fun hintColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color> =
    rememberUpdatedState(
      newValue = when {
        !enabled -> disabledHintColor
        error -> errorHintColor
        pressed -> pressedHintColor
        else -> normalHintColor
      },
    )

  @Composable
  override fun textColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color> =
    rememberUpdatedState(
      newValue = when {
        !enabled -> disabledTextColor
        error -> errorTextColor
        pressed -> pressedTextColor
        else -> normalTextColor
      },
    )
}
