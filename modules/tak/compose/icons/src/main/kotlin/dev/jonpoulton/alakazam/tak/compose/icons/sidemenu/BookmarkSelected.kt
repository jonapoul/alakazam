package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.BookmarkSelected: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Selected",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(6.75f, 7.5f)
        curveTo(6.75f, 7.3619f, 6.8619f, 7.25f, 7f, 7.25f)
        horizontalLineTo(29f)
        curveTo(29.1381f, 7.25f, 29.25f, 7.3619f, 29.25f, 7.5f)
        verticalLineTo(28.6798f)
        curveTo(29.25f, 28.877f, 29.0324f, 28.9965f, 28.8659f, 28.8908f)
        lineTo(18.9385f, 22.5828f)
        curveTo(18.3658f, 22.2188f, 17.6342f, 22.2188f, 17.0615f, 22.5828f)
        lineTo(7.1341f, 28.8908f)
        curveTo(6.9676f, 28.9965f, 6.75f, 28.877f, 6.75f, 28.6798f)
        verticalLineTo(7.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.BookmarkSelected)
