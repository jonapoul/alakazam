package dev.jonpoulton.alakazam.tak.compose.dialog

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.button.DefaultTakButtonColors
import dev.jonpoulton.alakazam.tak.compose.button.TakButtonColors
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakFonts
import dev.jonpoulton.alakazam.tak.compose.icons.TakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.sidemenu.Close
import dev.jonpoulton.alakazam.tak.compose.icons.sidemenu.Confirm
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Immutable
public interface TakDialogButton {
  public val text: String
  public val icon: ImageVector?
  public val onClick: () -> Unit
}

@Immutable
public data class TakDialogPositiveButton(
  override val text: String = "OK",
  override val icon: ImageVector? = TakIcons.SideMenu.Confirm(strokeWidth = 4f),
  override val onClick: () -> Unit = {},
) : TakDialogButton

@Immutable
public data class TakDialogNeutralButton(
  override val text: String,
  override val icon: ImageVector?,
  override val onClick: () -> Unit = {},
) : TakDialogButton

@Immutable
public data class TakDialogNegativeButton(
  override val text: String = "Cancel",
  override val icon: ImageVector? = TakIcons.SideMenu.Close(strokeWidth = 4f),
  override val onClick: () -> Unit = {},
) : TakDialogButton

@Composable
internal fun RowScope.TakDialogButton(
  config: TakDialogButton,
  modifier: Modifier = Modifier,
  dismissDialog: () -> Unit = {},
  colors: TakButtonColors = DefaultTakButtonColors(),
) {
  val onClick = config.onClick
  val interactionSource = remember { MutableInteractionSource() }
  val isPressed by interactionSource.collectIsPressedAsState()
  val backgroundColor by colors.backgroundColor(enabled = true, pressed = isPressed, error = false)
  val foregroundColor by colors.foregroundColor(enabled = true, pressed = isPressed, error = false)
  Row(
    modifier
      .height(48.dp)
      .background(backgroundColor)
      .padding(16.dp)
      .weight(1f)
      .clickable(interactionSource, indication = null) {
        dismissDialog()
        onClick()
      },
    horizontalArrangement = Arrangement.Center,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    val icon = config.icon
    if (icon != null) {
      Image(
        modifier = Modifier.size(IconSize),
        imageVector = icon,
        contentDescription = config.text,
        colorFilter = ColorFilter.tint(foregroundColor),
      )
    }

    Text(
      modifier = Modifier
        .padding(horizontal = 4.dp)
        .height(IconSize),
      style = ButtonTextStyle,
      color = foregroundColor,
      text = config.text.uppercase(),
    )
  }
}

private val IconSize = 16.dp

private val ButtonTextStyle = TextStyle(
  fontFamily = TakFonts.Family,
  fontSize = 12.sp,
  fontWeight = FontWeight.Bold,
  color = TakColors.Ink,
)

@PreviewDark
@Composable
private fun PreviewDialogButton() = TakPreview {
  Row {
    TakDialogButton(PreviewPositiveButton)
  }
}
