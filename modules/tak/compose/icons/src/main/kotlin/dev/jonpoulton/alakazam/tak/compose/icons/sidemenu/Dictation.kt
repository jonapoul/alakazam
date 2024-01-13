package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val SideMenuTakIcons.Dictation: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Dictation",
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
        moveTo(18f, 23.5f)
        lineTo(18f, 23.5f)
        arcTo(1f, 1f, 0f, false, true, 19f, 24.5f)
        lineTo(19f, 29.5f)
        arcTo(1f, 1f, 0f, false, true, 18f, 30.5f)
        lineTo(18f, 30.5f)
        arcTo(1f, 1f, 0f, false, true, 17f, 29.5f)
        lineTo(17f, 24.5f)
        arcTo(1f, 1f, 0f, false, true, 18f, 23.5f)
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
        moveTo(18f, 6.5f)
        curveTo(15.7909f, 6.5f, 14f, 8.2909f, 14f, 10.5f)
        verticalLineTo(11.5f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 11.5f, 16f, 11.7239f, 16f, 12f)
        curveTo(16f, 12.2761f, 15.7761f, 12.5f, 15.5f, 12.5f)
        horizontalLineTo(14f)
        verticalLineTo(13.5f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 13.5f, 16f, 13.7239f, 16f, 14f)
        curveTo(16f, 14.2761f, 15.7761f, 14.5f, 15.5f, 14.5f)
        horizontalLineTo(14f)
        verticalLineTo(15.5f)
        horizontalLineTo(15.5f)
        curveTo(15.7761f, 15.5f, 16f, 15.7239f, 16f, 16f)
        curveTo(16f, 16.2761f, 15.7761f, 16.5f, 15.5f, 16.5f)
        horizontalLineTo(14f)
        verticalLineTo(18.5f)
        curveTo(14f, 20.7091f, 15.7909f, 22.5f, 18f, 22.5f)
        curveTo(20.2091f, 22.5f, 22f, 20.7091f, 22f, 18.5f)
        verticalLineTo(16.5f)
        horizontalLineTo(20.5f)
        curveTo(20.2239f, 16.5f, 20f, 16.2761f, 20f, 16f)
        curveTo(20f, 15.7239f, 20.2239f, 15.5f, 20.5f, 15.5f)
        horizontalLineTo(22f)
        verticalLineTo(14.5f)
        horizontalLineTo(20.5f)
        curveTo(20.2239f, 14.5f, 20f, 14.2761f, 20f, 14f)
        curveTo(20f, 13.7239f, 20.2239f, 13.5f, 20.5f, 13.5f)
        horizontalLineTo(22f)
        verticalLineTo(12.5f)
        horizontalLineTo(20.5f)
        curveTo(20.2239f, 12.5f, 20f, 12.2761f, 20f, 12f)
        curveTo(20f, 11.7239f, 20.2239f, 11.5f, 20.5f, 11.5f)
        horizontalLineTo(22f)
        verticalLineTo(10.5f)
        curveTo(22f, 8.2909f, 20.2091f, 6.5f, 18f, 6.5f)
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
        moveTo(13f, 18.5f)
        curveTo(13f, 21.2614f, 15.2386f, 23.5f, 18f, 23.5f)
        curveTo(20.7614f, 23.5f, 23f, 21.2614f, 23f, 18.5f)
        curveTo(23f, 18.5f, 23f, 17.5f, 24f, 17.5f)
        curveTo(25f, 17.5f, 25f, 18.5f, 25f, 18.5f)
        curveTo(25f, 22.366f, 21.866f, 25.5f, 18f, 25.5f)
        curveTo(14.134f, 25.5f, 11f, 22.366f, 11f, 18.5f)
        curveTo(11f, 18.5f, 11f, 17.5f, 12f, 17.5f)
        curveTo(13f, 17.5f, 13f, 18.5f, 13f, 18.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
