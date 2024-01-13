package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.Gallery: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Gallery",
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
        moveTo(6.7166f, 6.5f)
        horizontalLineTo(29.2834f)
        curveTo(29.6792f, 6.5f, 30f, 6.8208f, 30f, 7.2166f)
        verticalLineTo(29.7834f)
        curveTo(30f, 30.1792f, 29.6792f, 30.5f, 29.2834f, 30.5f)
        horizontalLineTo(6.7166f)
        curveTo(6.3208f, 30.5f, 6f, 30.1792f, 6f, 29.7834f)
        verticalLineTo(7.2166f)
        curveTo(6f, 6.8208f, 6.3208f, 6.5f, 6.7166f, 6.5f)
        close()
        moveTo(28.5665f, 29.0663f)
        verticalLineTo(7.9325f)
        horizontalLineTo(7.4327f)
        verticalLineTo(29.0663f)
        horizontalLineTo(28.5665f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(17.4187f, 20.9f)
        horizontalLineTo(6f)
        verticalLineTo(29.54f)
        horizontalLineTo(29.04f)
        verticalLineTo(20.9f)
        horizontalLineTo(28.5336f)
        lineTo(24.2034f, 17.3007f)
        curveTo(23.8654f, 17.0199f, 23.3838f, 16.9925f, 23.0162f, 17.2333f)
        lineTo(17.4187f, 20.9f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(22.4673f, 12.2891f)
        curveTo(22.4673f, 13.5717f, 21.4285f, 14.6104f, 20.146f, 14.6104f)
        curveTo(18.8634f, 14.6104f, 17.8237f, 13.5717f, 17.8237f, 12.2891f)
        curveTo(17.8237f, 11.0066f, 18.8634f, 9.9678f, 20.146f, 9.9678f)
        curveTo(21.4285f, 9.9678f, 22.4673f, 11.0066f, 22.4673f, 12.2891f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
