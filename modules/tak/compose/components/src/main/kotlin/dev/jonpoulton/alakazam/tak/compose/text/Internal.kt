package dev.jonpoulton.alakazam.tak.compose.text

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Stable
@Composable
internal fun calculateTextPadding(
  padding: PaddingValues,
  startIcon: ImageVector?,
  endIcon: ImageVector?,
): PaddingValues {
  val layoutDirection = LocalLayoutDirection.current
  return when {
    // no icons, so no truncation necessary
    startIcon == null && endIcon == null -> padding

    // truncate end padding
    startIcon == null -> PaddingValues(
      start = padding.calculateStartPadding(layoutDirection),
      top = padding.calculateTopPadding(),
      end = 0.dp,
      bottom = padding.calculateBottomPadding(),
    )

    // truncate start padding
    endIcon == null -> PaddingValues(
      start = 0.dp,
      top = padding.calculateTopPadding(),
      end = padding.calculateEndPadding(layoutDirection),
      bottom = padding.calculateBottomPadding(),
    )

    // truncate start and end
    else -> PaddingValues(
      start = 0.dp,
      top = padding.calculateTopPadding(),
      end = 0.dp,
      bottom = padding.calculateBottomPadding(),
    )
  }
}

@Composable
internal fun TakTextInputIcon(
  icon: ImageVector?,
  color: Color,
  iconPadding: PaddingValues,
  iconSize: Dp,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  onClick: (() -> Unit)? = null,
) {
  if (icon != null) {
    val modifier = Modifier
      .padding(iconPadding)
      .sizeIn(maxWidth = iconSize, maxHeight = iconSize)
      .apply { if (onClick != null) clickable(interactionSource, indication = null, onClick = onClick) }

    Image(
      modifier = modifier,
      imageVector = icon,
      contentDescription = null,
      colorFilter = ColorFilter.tint(color),
    )
  }
}
