package dev.jonpoulton.alakazam.tak.compose.toolbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.DropdownMenu
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Dangerous
import androidx.compose.material.icons.filled.Deblur
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Airplay
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.button.TakIconButtonLegacy
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.core.TakTypography
import dev.jonpoulton.alakazam.tak.compose.menu.TakDropdownMenuItem
import dev.jonpoulton.alakazam.tak.compose.preview.EmptyCallback
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
public fun TakToolbar(
  title: String,
  navigationButton: TakToolbarNavigationButton,
  onClickNavigate: () -> Unit,
  otherButtons: (@Composable RowScope.() -> Unit)? = null,
  menuOptions: (@Composable ColumnScope.() -> Unit)? = null,
) {
  TakToolbar(
    navigationButton = { navigationButton.content(onClickNavigate) },
    title = title,
    otherButtons = otherButtons,
    menuOptions = menuOptions,
  )
}

@Composable
public fun TakToolbar(
  title: String,
  style: TextStyle = TakTypography.h1,
  navigationButton: (@Composable () -> Unit)? = null,
  otherButtons: (@Composable RowScope.() -> Unit)? = null,
  menuOptions: (@Composable ColumnScope.() -> Unit)? = null,
) {
  Row(
    modifier = Modifier
      .fillMaxWidth()
      .background(Color.Black)
      .padding(2.dp),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    navigationButton?.invoke()

    Text(
      text = title,
      modifier = Modifier
        .weight(1f)
        .wrapContentHeight()
        .padding(horizontal = 8.dp),
      style = style,
    )

    if (otherButtons != null) {
      otherButtons()
    }

    if (menuOptions != null) {
      var expanded by remember { mutableStateOf(false) }

      TakIconButtonLegacy(
        icon = Icons.Filled.MoreVert,
        contentDescription = "Menu",
        onClick = { expanded = true },
      )

      DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false },
        content = { menuOptions() },
      )
    }
  }
}

@Stable
@Immutable
public enum class TakToolbarNavigationButton(
  internal val content: @Composable (onClick: () -> Unit) -> Unit,
) {
  Close(
    content = { onClick ->
      TakIconButtonLegacy(
        icon = Icons.Filled.Close,
        contentDescription = "Close",
        tint = TakColors.Alert,
        onClick = { onClick() },
      )
    },
  ),

  Back(
    content = { onClick ->
      TakIconButtonLegacy(
        icon = Icons.Filled.ArrowBack,
        contentDescription = "Back",
        onClick = { onClick() },
      )
    },
  )
}

@PreviewDark
@Composable
private fun PreviewFullWithClose() = TakPreview {
  TakToolbar(
    navigationButton = TakToolbarNavigationButton.Close,
    onClickNavigate = EmptyCallback,
    title = "Full Toolbar",
    otherButtons = {
      TakIconButtonLegacy(icon = Icons.Filled.Settings, contentDescription = "Settings", onClick = EmptyCallback)
      TakIconButtonLegacy(icon = Icons.Filled.Edit, contentDescription = "Edit", onClick = EmptyCallback)
    },
    menuOptions = {
      TakDropdownMenuItem(icon = Icons.Filled.Deblur, text = "Deblur", onClick = EmptyCallback)
      TakDropdownMenuItem(icon = Icons.Filled.Delete, text = "Delete", onClick = EmptyCallback)
      TakDropdownMenuItem(icon = Icons.Filled.Dangerous, text = "Dangerous", onClick = EmptyCallback)
    },
  )
}

@PreviewDark
@Composable
private fun PreviewMinimal() = TakPreview {
  TakToolbar(
    navigationButton = TakToolbarNavigationButton.Back,
    onClickNavigate = EmptyCallback,
    title = "Minimal Toolbar",
    otherButtons = null,
    menuOptions = null,
  )
}

@PreviewDark
@Composable
private fun PreviewWithNoNavButton() = TakPreview {
  TakToolbar(
    title = "No nav button",
    otherButtons = null,
    menuOptions = {
      TakDropdownMenuItem(icon = Icons.Filled.Deblur, text = "Deblur", onClick = EmptyCallback)
      TakDropdownMenuItem(icon = Icons.Filled.Dangerous, text = "Dangerous", onClick = EmptyCallback)
    },
  )
}

@PreviewDark
@Composable
private fun PreviewCustomNavButton() = TakPreview {
  TakToolbar(
    navigationButton = {
      TakIconButtonLegacy(
        icon = Icons.Outlined.Airplay,
        contentDescription = "Airplay",
        tint = TakLegacyColors.HansaYellow,
        onClick = { },
      )
    },
    title = "Toolbar With Funky Back Button",
    otherButtons = null,
    menuOptions = null,
  )
}

@PreviewDark
@Composable
private fun PreviewMenuItem() = TakPreview {
  TakDropdownMenuItem(
    icon = Icons.Filled.Edit,
    text = "Some Text",
    onClick = EmptyCallback,
  )
}
