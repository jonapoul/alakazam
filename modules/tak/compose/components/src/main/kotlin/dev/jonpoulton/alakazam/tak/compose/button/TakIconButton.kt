package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakToast
import dev.jonpoulton.alakazam.tak.compose.icons.TakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.sidemenu.Add
import dev.jonpoulton.alakazam.tak.compose.icons.sidemenu.Alpha
import dev.jonpoulton.alakazam.tak.compose.icons.sidemenu.Settings
import dev.jonpoulton.alakazam.tak.compose.preview.EmptyCallback
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
public fun TakIconButton(
  icon: ImageVector,
  contentDescription: String,
  modifier: Modifier = Modifier,
  isError: Boolean = false,
  isDisabled: Boolean = false,
  shape: Shape = RoundedShape,
  colors: TakButtonColors = DefaultTakIconButtonColors(),
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  onClick: () -> Unit,
) {
  val isPressed by interactionSource.collectIsPressedAsState()
  val backgroundColor by colors.backgroundColor(!isDisabled, isPressed, isError)
  val foregroundColor by colors.foregroundColor(!isDisabled, isPressed, isError)

  var isLongPressed by remember { mutableStateOf(false) }
  val haptics = LocalHapticFeedback.current

  Box(
    modifier = modifier.background(backgroundColor, shape),
  ) {
    Image(
      modifier = Modifier
        .padding(5.dp)
        .combinedClickable(
          interactionSource,
          enabled = !isDisabled,
          onClick = onClick,
          onLongClick = {
            haptics.performHapticFeedback(HapticFeedbackType.LongPress)
            isLongPressed = true
          },
          indication = null,
        ),
      imageVector = icon,
      contentDescription = contentDescription,
      colorFilter = ColorFilter.tint(foregroundColor),
    )
  }

  if (isLongPressed) {
    TakToast(text = contentDescription)
    isLongPressed = false
  }
}

private val RoundedShape = RoundedCornerShape(corner = CornerSize(5.dp))

@Stable
@Immutable
public data class DefaultTakIconButtonColors(
  val normalBackgroundColor: Color = Color.Transparent,
  val pressedBackgroundColor: Color = TakColors.Ash,
  val errorBackgroundColor: Color = TakColors.Charcoal,
  val disabledBackgroundColor: Color = TakColors.Charcoal,
  val normalForegroundColor: Color = TakColors.Sand,
  val pressedForegroundColor: Color = TakColors.Cyber,
  val errorForegroundColor: Color = TakColors.Alert,
  val disabledForegroundColor: Color = TakColors.Ash,
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

@PreviewDark
@Composable
private fun Add() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Add,
    contentDescription = "",
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun Alpha() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Alpha,
    contentDescription = "",
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun Settings() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Settings,
    contentDescription = "",
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun SettingsError() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Settings,
    contentDescription = "",
    onClick = EmptyCallback,
    isError = true,
  )
}

@PreviewDark
@Composable
private fun SettingsDisabled() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Settings,
    contentDescription = "",
    onClick = EmptyCallback,
    isDisabled = true,
  )
}
