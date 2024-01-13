package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import dev.jonpoulton.alakazam.tak.compose.core.TakColors

public interface TakButtonColors {
  @Stable
  @Composable
  public fun backgroundColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color>

  @Stable
  @Composable
  public fun foregroundColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color>
}

@Stable
@Immutable
public data class DefaultTakButtonColors(
  val normalBackgroundColor: Color = TakColors.Sand,
  val pressedBackgroundColor: Color = TakColors.Ash,
  val errorBackgroundColor: Color = TakColors.Alert,
  val disabledBackgroundColor: Color = TakColors.Ash,
  val normalForegroundColor: Color = TakColors.Ink,
  val pressedForegroundColor: Color = normalForegroundColor,
  val errorForegroundColor: Color = normalForegroundColor,
  val disabledForegroundColor: Color = TakColors.Stone,
) : TakButtonColors {
  @Stable
  @Composable
  override fun backgroundColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color> =
    rememberUpdatedState(
      newValue = when {
        !enabled -> disabledBackgroundColor
        pressed -> pressedBackgroundColor
        error -> errorBackgroundColor
        else -> normalBackgroundColor
      },
    )

  @Stable
  @Composable
  override fun foregroundColor(enabled: Boolean, pressed: Boolean, error: Boolean): State<Color> =
    rememberUpdatedState(
      newValue = when {
        !enabled -> disabledForegroundColor
        pressed -> pressedForegroundColor
        error -> errorForegroundColor
        else -> normalForegroundColor
      },
    )
}
