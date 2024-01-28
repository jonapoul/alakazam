@file:Suppress("MagicNumber", "UnusedReceiverParameter", "FunctionName")

package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public fun SideMenuTakIcons.Confirm(strokeWidth: Float): ImageVector {
  return Builder(
    name = "Confirm",
    defaultWidth = 36.dp,
    defaultHeight = 37.dp,
    viewportWidth = 36f,
    viewportHeight = 37f,
  ).apply {
    path(
      fill = SolidColor(Color.Transparent),
      stroke = SolidColor(TakColors.Sand),
      strokeLineWidth = strokeWidth,
      strokeLineCap = Round,
      strokeLineJoin = Miter,
      strokeLineMiter = 4f,
      pathFillType = NonZero,
    ) {
      moveTo(9f, 20.5465f)
      lineTo(15.3256f, 26.5f)
      lineTo(27.6047f, 10.5f)
    }
  }
    .build()
}

public val SideMenuTakIcons.Confirm: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Confirm(strokeWidth = 1.5f)
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Confirm)

@Composable
@PreviewDark
private fun PreviewThicker() = PreviewIcon(icon = SideMenuTakIcons.Confirm(strokeWidth = 4f))
