package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.Devices: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Devices",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
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
        moveTo(7.0f, 6.0f)
        curveTo(7.0f, 4.8954f, 7.8954f, 4.0f, 9.0f, 4.0f)
        horizontalLineTo(21.0f)
        curveTo(22.1046f, 4.0f, 23.0f, 4.8954f, 23.0f, 6.0f)
        verticalLineTo(26.0f)
        curveTo(23.0f, 27.1046f, 22.1046f, 28.0f, 21.0f, 28.0f)
        horizontalLineTo(9.0f)
        curveTo(7.8954f, 28.0f, 7.0f, 27.1046f, 7.0f, 26.0f)
        verticalLineTo(6.0f)
        close()
        moveTo(9.0f, 7.0f)
        curveTo(9.0f, 6.4477f, 9.4477f, 6.0f, 10.0f, 6.0f)
        horizontalLineTo(20.0f)
        curveTo(20.5523f, 6.0f, 21.0f, 6.4477f, 21.0f, 7.0f)
        verticalLineTo(23.0f)
        curveTo(21.0f, 23.5523f, 20.5523f, 24.0f, 20.0f, 24.0f)
        horizontalLineTo(10.0f)
        curveTo(9.4477f, 24.0f, 9.0f, 23.5523f, 9.0f, 23.0f)
        verticalLineTo(7.0f)
        close()
        moveTo(15.0f, 25.0f)
        curveTo(14.4477f, 25.0f, 14.0f, 25.4477f, 14.0f, 26.0f)
        curveTo(14.0f, 26.5523f, 14.4477f, 27.0f, 15.0f, 27.0f)
        curveTo(15.5523f, 27.0f, 16.0f, 26.5523f, 16.0f, 26.0f)
        curveTo(16.0f, 25.4477f, 15.5523f, 25.0f, 15.0f, 25.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
