package dev.jonpoulton.alakazam.tak.compose.slider

import androidx.compose.material.SliderColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import dev.jonpoulton.alakazam.tak.compose.core.TakColors

@Stable
@Immutable
public interface TakSliderColors : SliderColors {
  public val secondaryThumbColor: Color

  @Composable
  public fun textColor(enabled: Boolean, active: Boolean): State<Color>
}

@Stable
@Immutable
public data class DefaultTakSliderColors(
  val primaryThumbColor: Color = TakColors.Sand,
  override val secondaryThumbColor: Color = TakColors.Ink.copy(alpha = 0.65f),
  val thumbColorDisabled: Color = TakColors.Ash,
  val textColorActive: Color = TakColors.Sand,
  val textColorInactive: Color = TakColors.Ink,
  val textColorDisabled: Color = TakColors.Ink,
  val trackColorActive: Color = TakColors.Sand,
  val trackColorInactive: Color = TakColors.Ink,
  val trackColorDisabled: Color = TakColors.Ash,
  val tickColorActive: Color = TakColors.Sand,
  val tickColorInactive: Color = TakColors.Ink,
  val tickColorDisabled: Color = TakColors.Ash,
) : TakSliderColors {
  @Composable
  override fun thumbColor(enabled: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      enabled -> primaryThumbColor
      else -> thumbColorDisabled
    },
  )

  @Composable
  override fun tickColor(enabled: Boolean, active: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !enabled -> tickColorDisabled
      active -> tickColorActive
      else -> tickColorInactive
    },
  )

  @Composable
  override fun trackColor(enabled: Boolean, active: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !active -> trackColorInactive
      !enabled -> trackColorDisabled
      else -> trackColorActive
    },
  )

  @Composable
  override fun textColor(enabled: Boolean, active: Boolean): State<Color> = rememberUpdatedState(
    newValue = when {
      !active -> textColorInactive
      !enabled -> textColorDisabled
      else -> textColorActive
    },
  )
}
