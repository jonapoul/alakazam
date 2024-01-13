package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.Orientation: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Orientation",
      defaultWidth = 40.0.dp,
      defaultHeight = 41.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 41.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(18.9487f, 10.5811f)
        curveTo(18.9487f, 10.1668f, 18.6129f, 9.831f, 18.1987f, 9.831f)
        curveTo(13.2854f, 9.831f, 9.3027f, 13.8138f, 9.3027f, 18.7271f)
        curveTo(9.3027f, 19.1413f, 9.6384f, 19.4771f, 10.0527f, 19.4771f)
        curveTo(10.4669f, 19.4771f, 10.8027f, 19.1413f, 10.8027f, 18.7271f)
        curveTo(10.8027f, 14.6423f, 14.1139f, 11.3311f, 18.1987f, 11.3311f)
        curveTo(18.6129f, 11.3311f, 18.9487f, 10.9953f, 18.9487f, 10.5811f)
        close()
        moveTo(24.7378f, 22.0299f)
        horizontalLineTo(7.6838f)
        curveTo(6.7535f, 22.0299f, 5.9998f, 22.7836f, 5.9998f, 23.7139f)
        verticalLineTo(33.0049f)
        curveTo(5.9998f, 33.9343f, 6.7538f, 34.6879f, 7.6838f, 34.6879f)
        horizontalLineTo(24.7378f)
        curveTo(25.6677f, 34.6879f, 26.4218f, 33.9343f, 26.4218f, 33.0049f)
        verticalLineTo(23.7139f)
        curveTo(26.4218f, 22.7836f, 25.668f, 22.0299f, 24.7378f, 22.0299f)
        close()
        moveTo(7.6838f, 23.5299f)
        horizontalLineTo(24.7378f)
        curveTo(24.8395f, 23.5299f, 24.9218f, 23.6121f, 24.9218f, 23.7139f)
        verticalLineTo(33.0049f)
        curveTo(24.9218f, 33.1057f, 24.8395f, 33.1879f, 24.7378f, 33.1879f)
        horizontalLineTo(7.6838f)
        curveTo(7.582f, 33.1879f, 7.4998f, 33.1057f, 7.4998f, 33.0049f)
        verticalLineTo(23.7139f)
        curveTo(7.4998f, 23.6121f, 7.582f, 23.5299f, 7.6838f, 23.5299f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(22.9473f, 6.4998f)
        horizontalLineTo(32.2373f)
        curveTo(33.1675f, 6.4998f, 33.9213f, 7.2535f, 33.9213f, 8.1838f)
        verticalLineTo(25.2378f)
        curveTo(33.9213f, 26.168f, 33.1675f, 26.9218f, 32.2373f, 26.9218f)
        horizontalLineTo(22.9473f)
        curveTo(22.0171f, 26.9218f, 21.2633f, 26.168f, 21.2633f, 25.2378f)
        verticalLineTo(8.1838f)
        curveTo(21.2633f, 7.2535f, 22.0171f, 6.4998f, 22.9473f, 6.4998f)
        close()
        moveTo(32.2373f, 7.9998f)
        horizontalLineTo(22.9473f)
        curveTo(22.8455f, 7.9998f, 22.7633f, 8.082f, 22.7633f, 8.1838f)
        verticalLineTo(25.2378f)
        curveTo(22.7633f, 25.3395f, 22.8455f, 25.4218f, 22.9473f, 25.4218f)
        horizontalLineTo(32.2373f)
        curveTo(32.3391f, 25.4218f, 32.4213f, 25.3395f, 32.4213f, 25.2378f)
        verticalLineTo(8.1838f)
        curveTo(32.4213f, 8.082f, 32.3391f, 7.9998f, 32.2373f, 7.9998f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
