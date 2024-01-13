package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.TakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.sidemenu.Add
import dev.jonpoulton.alakazam.tak.compose.icons.sidemenu.Alpha
import dev.jonpoulton.alakazam.tak.compose.icons.sidemenu.Settings
import dev.jonpoulton.alakazam.tak.compose.preview.EmptyCallback
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
public fun TakIconButton(
  icon: ImageVector,
  isError: Boolean = false,
  isDisabled: Boolean = false,
  colors: TakButtonColors = defaultTakIconButtonColors(),
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  onClick: () -> Unit,
) {
  val isPressed by interactionSource.collectIsPressedAsState()
  val backgroundColor by colors.backgroundColor(!isDisabled, isPressed, isError)

  Image(
    modifier = Modifier
      .padding(5.dp)
      .clickable(interactionSource, enabled = !isDisabled, onClick = onClick, indication = null),
    imageVector = icon,
    contentDescription = null,
    colorFilter = ColorFilter.tint(backgroundColor),
  )
}

@Stable
@Composable
public fun defaultTakIconButtonColors(
  normalBackgroundColor: Color = TakColors.Sand,
  pressedBackgroundColor: Color = TakColors.Cyber,
  errorBackgroundColor: Color = TakColors.Alert,
  disabledBackgroundColor: Color = TakColors.Ash,
  normalForegroundColor: Color = TakColors.Ink,
  pressedForegroundColor: Color = normalForegroundColor,
  errorForegroundColor: Color = normalForegroundColor,
  disabledForegroundColor: Color = TakLegacyColors.Gray,
): TakButtonColors = DefaultTakButtonColors(
  normalBackgroundColor = normalBackgroundColor,
  pressedBackgroundColor = pressedBackgroundColor,
  errorBackgroundColor = errorBackgroundColor,
  disabledBackgroundColor = disabledBackgroundColor,
  normalForegroundColor = normalForegroundColor,
  pressedForegroundColor = pressedForegroundColor,
  errorForegroundColor = errorForegroundColor,
  disabledForegroundColor = disabledForegroundColor,
)

@PreviewDark
@Composable
private fun Add() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Add,
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun Alpha() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Alpha,
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun Settings() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Settings,
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun SettingsError() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Settings,
    onClick = EmptyCallback,
    isError = true,
  )
}

@PreviewDark
@Composable
private fun SettingsDisabled() = TakPreview {
  TakIconButton(
    icon = TakIcons.SideMenu.Settings,
    onClick = EmptyCallback,
    isDisabled = true,
  )
}
