package dev.jonpoulton.alakazam.tak.compose.menu

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.jonpoulton.alakazam.tak.compose.core.TakTypography
import dev.jonpoulton.alakazam.tak.compose.icons.TakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.utility.Walking
import dev.jonpoulton.alakazam.tak.compose.preview.EmptyCallback
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@SuppressLint("ModifierParameter")
@Composable
public fun TakDropdownMenuItem(
  icon: ImageVector,
  text: String,
  style: TextStyle = TakTypography.body1,
  color: Color = Color.White,
  onClick: () -> Unit,
) {
  DropdownMenuItem(onClick = { onClick() }) {
    Icon(
      modifier = Modifier.size(IconSize),
      imageVector = icon,
      contentDescription = null,
      tint = color
    )

    Spacer(modifier = Modifier.width(SpacerWidth))

    Text(
      modifier = Modifier,
      text = text,
      color = color,
      style = style,
      fontSize = FontSize,
    )
  }
}

private val SpacerWidth = 12.dp

private val IconSize = 24.dp

private val FontSize = 14.sp

@Composable
@PreviewDark
private fun Preview() = TakPreview {
  TakDropdownMenuItem(
    icon = TakIcons.Utility.Walking,
    text = "Something",
    onClick = EmptyCallback,
  )
}
