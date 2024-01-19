package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val SideMenuTakIcons.Phone: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Phone",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(10f, 9f)
        curveTo(10f, 7.8954f, 10.8954f, 7f, 12f, 7f)
        horizontalLineTo(24f)
        curveTo(25.1046f, 7f, 26f, 7.8954f, 26f, 9f)
        verticalLineTo(29f)
        curveTo(26f, 30.1046f, 25.1046f, 31f, 24f, 31f)
        horizontalLineTo(12f)
        curveTo(10.8954f, 31f, 10f, 30.1046f, 10f, 29f)
        verticalLineTo(9f)
        close()
        moveTo(12f, 10f)
        curveTo(12f, 9.4477f, 12.4477f, 9f, 13f, 9f)
        horizontalLineTo(23f)
        curveTo(23.5523f, 9f, 24f, 9.4477f, 24f, 10f)
        verticalLineTo(26f)
        curveTo(24f, 26.5523f, 23.5523f, 27f, 23f, 27f)
        horizontalLineTo(13f)
        curveTo(12.4477f, 27f, 12f, 26.5523f, 12f, 26f)
        verticalLineTo(10f)
        close()
        moveTo(18f, 28f)
        curveTo(17.4477f, 28f, 17f, 28.4477f, 17f, 29f)
        curveTo(17f, 29.5523f, 17.4477f, 30f, 18f, 30f)
        curveTo(18.5523f, 30f, 19f, 29.5523f, 19f, 29f)
        curveTo(19f, 28.4477f, 18.5523f, 28f, 18f, 28f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Phone)
