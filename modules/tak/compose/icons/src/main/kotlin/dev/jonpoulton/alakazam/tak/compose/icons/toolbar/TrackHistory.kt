package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.TrackHistory: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "TrackHistory",
      defaultWidth = 40.0.dp,
      defaultHeight = 41.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 41.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Round,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(20.4304f, 35.0f)
        curveTo(12.4607f, 35.0f, 6.0f, 28.732f, 6.0f, 21.0f)
        curveTo(6.0f, 13.268f, 12.4607f, 7.0f, 20.4304f, 7.0f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Round,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(19.5696f, 35.0f)
        curveTo(27.5393f, 35.0f, 34.0f, 28.732f, 34.0f, 21.0f)
        curveTo(34.0f, 13.268f, 27.5393f, 7.0f, 19.5696f, 7.0f)
      }
      group {
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = EvenOdd,
        ) {
          moveTo(16.4102f, 17.8333f)
          lineTo(15.3333f, 16.8333f)
          lineTo(19.9999f, 12.4999f)
          lineTo(24.6666f, 16.8333f)
          lineTo(23.5897f, 17.8333f)
          lineTo(19.9999f, 14.4999f)
          lineTo(16.4102f, 17.8333f)
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
          moveTo(16.4102f, 23.4028f)
          lineTo(15.3333f, 22.2778f)
          lineTo(19.9999f, 17.4028f)
          lineTo(24.6666f, 22.2778f)
          lineTo(23.5897f, 23.4028f)
          lineTo(19.9999f, 19.6528f)
          lineTo(16.4102f, 23.4028f)
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
          moveTo(16.4102f, 28.3054f)
          lineTo(15.3333f, 27.3054f)
          lineTo(19.9999f, 22.9721f)
          lineTo(24.6666f, 27.3054f)
          lineTo(23.5897f, 28.3054f)
          lineTo(19.9999f, 24.9721f)
          lineTo(16.4102f, 28.3054f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
