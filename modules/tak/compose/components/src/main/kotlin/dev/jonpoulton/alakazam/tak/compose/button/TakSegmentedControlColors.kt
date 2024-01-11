package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors

interface TakSegmentedControlColors {
  @Stable
  @Composable
  fun backgroundColor(enabled: Boolean, active: Boolean): State<Color>

  @Stable
  @Composable
  fun foregroundColor(enabled: Boolean, active: Boolean): State<Color>

  @Stable
  @Composable
  fun borderColor(enabled: Boolean, active: Boolean): State<Color>
}

@Stable
@Immutable
data class DefaultTakSegmentedControlColors(
  val activeBackgroundColor: Color = TakColors.Sand,
  val inactiveBackgroundColor: Color = Color.Transparent,
  val disabledBackgroundColor: Color = TakColors.Ash,
  val activeForegroundColor: Color = TakColors.Ink,
  val inactiveForegroundColor: Color = TakColors.Sand,
  val disabledForegroundColor: Color = TakLegacyColors.Gray,
  val activeBorderColor: Color = Color.Transparent,
  val inactiveBorderColor: Color = TakColors.Sand,
  val disabledBorderColor: Color = Color.Transparent,
) : TakSegmentedControlColors {
  @Stable
  @Composable
  override fun backgroundColor(enabled: Boolean, active: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> disabledBackgroundColor
      active -> activeBackgroundColor
      else -> inactiveBackgroundColor
    },
  )

  @Stable
  @Composable
  override fun foregroundColor(enabled: Boolean, active: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> disabledForegroundColor
      active -> activeForegroundColor
      else -> inactiveForegroundColor
    },
  )

  @Stable
  @Composable
  override fun borderColor(enabled: Boolean, active: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> disabledBorderColor
      active -> activeBorderColor
      else -> inactiveBorderColor
    },
  )
}
