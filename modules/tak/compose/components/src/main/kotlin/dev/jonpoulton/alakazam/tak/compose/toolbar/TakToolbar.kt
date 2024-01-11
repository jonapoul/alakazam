package dev.jonpoulton.alakazam.tak.compose.toolbar

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.button.TakIconButtonLegacy
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.preview.EmptyCallback
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
fun TakToolbar(
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
fun TakToolbar(
  title: String,
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
      color = Color.White,
      fontWeight = FontWeight.Bold,
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
enum class TakToolbarNavigationButton(
  internal val content: @Composable (onClick: () -> Unit) -> Unit,
) {
  Close(
    content = { onClick ->
      TakIconButtonLegacy(
        icon = Icons.Filled.Close,
        contentDescription = "Back",
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

@SuppressLint("ModifierParameter")
@Composable
fun TakToolbarMenuItem(
  icon: ImageVector,
  text: String,
  iconModifier: Modifier = Modifier,
  textModifier: Modifier = Modifier,
  contentColour: Color = Color.White,
  onClick: () -> Unit,
) {
  DropdownMenuItem(onClick = { onClick() }) {
    Icon(modifier = iconModifier, imageVector = icon, contentDescription = null, tint = contentColour)
    Text(modifier = textModifier, text = text, color = contentColour)
  }
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
      TakToolbarMenuItem(icon = Icons.Filled.Deblur, text = "Deblur", onClick = EmptyCallback)
      TakToolbarMenuItem(icon = Icons.Filled.Delete, text = "Delete", onClick = EmptyCallback)
      TakToolbarMenuItem(icon = Icons.Filled.Dangerous, text = "Dangerous", onClick = EmptyCallback)
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
      TakToolbarMenuItem(icon = Icons.Filled.Deblur, text = "Deblur", onClick = EmptyCallback)
      TakToolbarMenuItem(icon = Icons.Filled.Dangerous, text = "Dangerous", onClick = EmptyCallback)
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
