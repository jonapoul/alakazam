package dev.jonpoulton.alakazam.tak.compose.toggle

import androidx.compose.material.SwitchColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors

@Stable
@Immutable
public interface TakToggleColors : SwitchColors {
  public val borderColor: Color
}

@Stable
@Immutable
public interface TakToggleSmallColors : TakToggleColors

@Stable
@Immutable
public interface TakToggleLargeColors : TakToggleColors {
  @Composable
  public fun textColor(enabled: Boolean, checked: Boolean): State<Color>
}

@Stable
@Immutable
internal data class DefaultTakToggleSmallColors(
  val checkedThumbColor: Color = TakColors.Cloud,
  val checkedTrackColor: Color = TakColors.Gamma,
  val checkedTrackAlpha: Float = 1f,
  val uncheckedThumbColor: Color = TakLegacyColors.PaleSilver,
  val uncheckedTrackColor: Color = TakLegacyColors.TrolleyGrey,
  val uncheckedTrackAlpha: Float = 1f,
  val disabledCheckedThumbColor: Color = Color(color = 0xFF505050),
  val disabledCheckedTrackColor: Color = Color(color = 0xFF404040),
  val disabledUncheckedThumbColor: Color = Color(color = 0xFF505050),
  val disabledUncheckedTrackColor: Color = Color(color = 0xFF404040),
  override val borderColor: Color = Color(color = 0x1A000000), // 10% alpha
) : TakToggleSmallColors {
  @Composable
  override fun thumbColor(enabled: Boolean, checked: Boolean): State<Color> = rememberUpdatedState(
    if (enabled) {
      if (checked) checkedThumbColor else uncheckedThumbColor
    } else {
      if (checked) disabledCheckedThumbColor else disabledUncheckedThumbColor
    },
  )

  @Composable
  override fun trackColor(enabled: Boolean, checked: Boolean): State<Color> = rememberUpdatedState(
    if (enabled) {
      if (checked) checkedTrackColor else uncheckedTrackColor
    } else {
      if (checked) disabledCheckedTrackColor else disabledUncheckedTrackColor
    },
  )
}

@Stable
@Immutable
public data class DefaultTakToggleLargeColors(
  val checkedThumbColor: Color = TakColors.Cloud,
  val checkedTrackColor: Color = TakColors.Gamma,
  val checkedTrackAlpha: Float = 1f,
  val uncheckedThumbColor: Color = TakLegacyColors.PaleSilver,
  val uncheckedTrackColor: Color = TakLegacyColors.TrolleyGrey,
  val uncheckedTrackAlpha: Float = 1f,
  val disabledCheckedThumbColor: Color = Color(color = 0xFF505050),
  val disabledCheckedTrackColor: Color = Color(color = 0xFF404040),
  val disabledUncheckedThumbColor: Color = Color(color = 0xFF505050),
  val disabledUncheckedTrackColor: Color = Color(color = 0xFF404040),
  val checkedTextColor: Color = Color(color = 0xFF808080),
  val uncheckedTextColor: Color = Color(color = 0xFF676458),
  val disabledCheckedTextColor: Color = TakLegacyColors.DarkGray,
  val disabledUncheckedTextColor: Color = TakLegacyColors.DarkGray,
  override val borderColor: Color = Color(color = 0x1A000000), // 10% alpha
) : TakToggleLargeColors {
  @Composable
  override fun thumbColor(enabled: Boolean, checked: Boolean): State<Color> = rememberUpdatedState(
    if (enabled) {
      if (checked) checkedThumbColor else uncheckedThumbColor
    } else {
      if (checked) disabledCheckedThumbColor else disabledUncheckedThumbColor
    },
  )

  @Composable
  override fun trackColor(enabled: Boolean, checked: Boolean): State<Color> = rememberUpdatedState(
    if (enabled) {
      if (checked) checkedTrackColor else uncheckedTrackColor
    } else {
      if (checked) disabledCheckedTrackColor else disabledUncheckedTrackColor
    },
  )

  @Composable
  override fun textColor(enabled: Boolean, checked: Boolean): State<Color> = rememberUpdatedState(
    if (enabled) {
      if (checked) checkedTextColor else uncheckedTextColor
    } else {
      if (checked) disabledCheckedTextColor else disabledUncheckedTextColor
    },
  )
}
