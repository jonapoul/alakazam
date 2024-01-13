package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.Grid: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Grid",
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
        pathFillType = NonZero,
      ) {
        moveTo(7f, 6.5f)
        lineTo(15.56f, 6.5f)
        arcTo(1f, 1f, 0f, false, true, 16.56f, 7.5f)
        lineTo(16.56f, 16.06f)
        arcTo(1f, 1f, 0f, false, true, 15.56f, 17.06f)
        lineTo(7f, 17.06f)
        arcTo(1f, 1f, 0f, false, true, 6f, 16.06f)
        lineTo(6f, 7.5f)
        arcTo(1f, 1f, 0f, false, true, 7f, 6.5f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(7f, 19.94f)
        lineTo(15.56f, 19.94f)
        arcTo(1f, 1f, 0f, false, true, 16.56f, 20.94f)
        lineTo(16.56f, 29.5f)
        arcTo(1f, 1f, 0f, false, true, 15.56f, 30.5f)
        lineTo(7f, 30.5f)
        arcTo(1f, 1f, 0f, false, true, 6f, 29.5f)
        lineTo(6f, 20.94f)
        arcTo(1f, 1f, 0f, false, true, 7f, 19.94f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(20.4399f, 6.5f)
        lineTo(28.9999f, 6.5f)
        arcTo(1f, 1f, 0f, false, true, 29.9999f, 7.5f)
        lineTo(29.9999f, 16.06f)
        arcTo(1f, 1f, 0f, false, true, 28.9999f, 17.06f)
        lineTo(20.4399f, 17.06f)
        arcTo(1f, 1f, 0f, false, true, 19.4399f, 16.06f)
        lineTo(19.4399f, 7.5f)
        arcTo(1f, 1f, 0f, false, true, 20.4399f, 6.5f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(20.4399f, 19.94f)
        lineTo(28.9999f, 19.94f)
        arcTo(1f, 1f, 0f, false, true, 29.9999f, 20.94f)
        lineTo(29.9999f, 29.5f)
        arcTo(1f, 1f, 0f, false, true, 28.9999f, 30.5f)
        lineTo(20.4399f, 30.5f)
        arcTo(1f, 1f, 0f, false, true, 19.4399f, 29.5f)
        lineTo(19.4399f, 20.94f)
        arcTo(1f, 1f, 0f, false, true, 20.4399f, 19.94f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
