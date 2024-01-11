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

val ToolbarTakIcons.Camera: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Camera",
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
        moveTo(23.25f, 7.5f)
        horizontalLineTo(16.25f)
        curveTo(15.9188f, 7.5f, 15.6268f, 7.7172f, 15.5316f, 8.0345f)
        lineTo(14.192f, 12.5f)
        horizontalLineTo(12.5f)
        verticalLineTo(10.25f)
        curveTo(12.5f, 9.8358f, 12.1642f, 9.5f, 11.75f, 9.5f)
        horizontalLineTo(7.75f)
        curveTo(7.3358f, 9.5f, 7.0f, 9.8358f, 7.0f, 10.25f)
        verticalLineTo(12.5f)
        horizontalLineTo(5.75f)
        curveTo(5.3358f, 12.5f, 5.0f, 12.8358f, 5.0f, 13.25f)
        verticalLineTo(33.25f)
        curveTo(5.0f, 33.6642f, 5.3358f, 34.0f, 5.75f, 34.0f)
        horizontalLineTo(33.75f)
        curveTo(34.1642f, 34.0f, 34.5f, 33.6642f, 34.5f, 33.25f)
        verticalLineTo(13.25f)
        curveTo(34.5f, 12.8358f, 34.1642f, 12.5f, 33.75f, 12.5f)
        horizontalLineTo(25.308f)
        lineTo(23.9684f, 8.0345f)
        curveTo(23.8732f, 7.7172f, 23.5812f, 7.5f, 23.25f, 7.5f)
        close()
        moveTo(7.75f, 14.0f)
        horizontalLineTo(11.75f)
        horizontalLineTo(14.75f)
        horizontalLineTo(24.75f)
        horizontalLineTo(33.0f)
        verticalLineTo(32.5f)
        horizontalLineTo(6.5f)
        verticalLineTo(14.0f)
        horizontalLineTo(7.75f)
        close()
        moveTo(11.0f, 11.0f)
        verticalLineTo(12.5f)
        horizontalLineTo(8.5f)
        verticalLineTo(11.0f)
        horizontalLineTo(11.0f)
        close()
        moveTo(15.758f, 12.5f)
        horizontalLineTo(23.741f)
        lineTo(22.691f, 9.0f)
        horizontalLineTo(16.808f)
        lineTo(15.758f, 12.5f)
        close()
        moveTo(19.75f, 16.5f)
        curveTo(16.0228f, 16.5f, 13.0f, 19.5228f, 13.0f, 23.25f)
        curveTo(13.0f, 26.9772f, 16.0228f, 30.0f, 19.75f, 30.0f)
        curveTo(23.4772f, 30.0f, 26.5f, 26.9772f, 26.5f, 23.25f)
        curveTo(26.5f, 19.5228f, 23.4772f, 16.5f, 19.75f, 16.5f)
        close()
        moveTo(19.75f, 18.0f)
        curveTo(22.6488f, 18.0f, 25.0f, 20.3512f, 25.0f, 23.25f)
        curveTo(25.0f, 26.1488f, 22.6488f, 28.5f, 19.75f, 28.5f)
        curveTo(16.8512f, 28.5f, 14.5f, 26.1488f, 14.5f, 23.25f)
        curveTo(14.5f, 20.3512f, 16.8512f, 18.0f, 19.75f, 18.0f)
        close()
        moveTo(28.25f, 17.25f)
        curveTo(28.25f, 16.4216f, 28.9211f, 15.75f, 29.75f, 15.75f)
        curveTo(30.5789f, 15.75f, 31.25f, 16.4216f, 31.25f, 17.25f)
        curveTo(31.25f, 18.0784f, 30.5789f, 18.75f, 29.75f, 18.75f)
        curveTo(28.9211f, 18.75f, 28.25f, 18.0784f, 28.25f, 17.25f)
        close()
        moveTo(30.25f, 17.25f)
        curveTo(30.25f, 16.9737f, 30.0264f, 16.75f, 29.75f, 16.75f)
        curveTo(29.4736f, 16.75f, 29.25f, 16.9737f, 29.25f, 17.25f)
        curveTo(29.25f, 17.5263f, 29.4736f, 17.75f, 29.75f, 17.75f)
        curveTo(30.0264f, 17.75f, 30.25f, 17.5263f, 30.25f, 17.25f)
        close()
        moveTo(9.9931f, 16.6482f)
        curveTo(9.9435f, 16.2822f, 9.6297f, 16.0f, 9.25f, 16.0f)
        curveTo(8.8358f, 16.0f, 8.5f, 16.3358f, 8.5f, 16.75f)
        verticalLineTo(29.75f)
        lineTo(8.5069f, 29.8518f)
        curveTo(8.5565f, 30.2178f, 8.8703f, 30.5f, 9.25f, 30.5f)
        curveTo(9.6642f, 30.5f, 10.0f, 30.1642f, 10.0f, 29.75f)
        verticalLineTo(16.75f)
        lineTo(9.9931f, 16.6482f)
        close()
        moveTo(17.0f, 23.25f)
        curveTo(17.0f, 21.7318f, 18.2318f, 20.5f, 19.75f, 20.5f)
        curveTo(21.2682f, 20.5f, 22.5f, 21.7318f, 22.5f, 23.25f)
        curveTo(22.5f, 24.7682f, 21.2682f, 26.0f, 19.75f, 26.0f)
        curveTo(18.2318f, 26.0f, 17.0f, 24.7682f, 17.0f, 23.25f)
        close()
        moveTo(21.0f, 23.25f)
        curveTo(21.0f, 22.5602f, 20.4398f, 22.0f, 19.75f, 22.0f)
        curveTo(19.0602f, 22.0f, 18.5f, 22.5602f, 18.5f, 23.25f)
        curveTo(18.5f, 23.9398f, 19.0602f, 24.5f, 19.75f, 24.5f)
        curveTo(20.4398f, 24.5f, 21.0f, 23.9398f, 21.0f, 23.25f)
        close()
        moveTo(22.0f, 10.75f)
        curveTo(22.0f, 10.3358f, 21.6642f, 10.0f, 21.25f, 10.0f)
        horizontalLineTo(18.25f)
        lineTo(18.1482f, 10.0068f)
        curveTo(17.7822f, 10.0565f, 17.5f, 10.3703f, 17.5f, 10.75f)
        curveTo(17.5f, 11.1642f, 17.8358f, 11.5f, 18.25f, 11.5f)
        horizontalLineTo(21.25f)
        lineTo(21.3518f, 11.4932f)
        curveTo(21.7178f, 11.4435f, 22.0f, 11.1297f, 22.0f, 10.75f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
