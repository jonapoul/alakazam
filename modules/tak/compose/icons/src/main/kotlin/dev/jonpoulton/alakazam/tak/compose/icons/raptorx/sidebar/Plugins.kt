package dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXSidebarTakIcons

public val RaptorXSidebarTakIcons.Plugins: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Plugins",
      defaultWidth = 30.0.dp,
      defaultHeight = 30.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 30.0f,
    ).apply {
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
          moveTo(9.6563f, 2.3438f)
          horizontalLineTo(2.3438f)
          verticalLineTo(9.6563f)
          horizontalLineTo(9.6563f)
          verticalLineTo(2.3438f)
          close()
          moveTo(0.0f, 0.0f)
          verticalLineTo(12.0f)
          horizontalLineTo(12.0f)
          verticalLineTo(0.0f)
          horizontalLineTo(0.0f)
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
          moveTo(27.6563f, 2.3438f)
          horizontalLineTo(20.3438f)
          verticalLineTo(9.6563f)
          horizontalLineTo(27.6563f)
          verticalLineTo(2.3438f)
          close()
          moveTo(18.0f, 0.0f)
          verticalLineTo(12.0f)
          horizontalLineTo(30.0f)
          verticalLineTo(0.0f)
          horizontalLineTo(18.0f)
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
          moveTo(9.6563f, 20.3438f)
          horizontalLineTo(2.3438f)
          verticalLineTo(27.6563f)
          horizontalLineTo(9.6563f)
          verticalLineTo(20.3438f)
          close()
          moveTo(0.0f, 18.0f)
          verticalLineTo(30.0f)
          horizontalLineTo(12.0f)
          verticalLineTo(18.0f)
          horizontalLineTo(0.0f)
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
          moveTo(25.1147f, 19.0273f)
          curveTo(25.0402f, 18.4472f, 24.5695f, 18.0f, 24.0f, 18.0f)
          curveTo(23.3787f, 18.0f, 22.875f, 18.5322f, 22.875f, 19.1886f)
          verticalLineTo(22.8751f)
          horizontalLineTo(19.1887f)
          lineTo(19.0274f, 22.8854f)
          curveTo(18.4472f, 22.9598f, 18.0f, 23.4305f, 18.0f, 24.0001f)
          curveTo(18.0f, 24.6214f, 18.5322f, 25.1251f, 19.1887f, 25.1251f)
          horizontalLineTo(22.875f)
          verticalLineTo(28.8114f)
          lineTo(22.8852f, 28.9727f)
          curveTo(22.9597f, 29.5528f, 23.4304f, 30.0f, 24.0f, 30.0f)
          curveTo(24.6213f, 30.0f, 25.125f, 29.4678f, 25.125f, 28.8114f)
          verticalLineTo(25.1251f)
          horizontalLineTo(28.8113f)
          lineTo(28.9726f, 25.1148f)
          curveTo(29.5528f, 25.0403f, 30.0f, 24.5696f, 30.0f, 24.0001f)
          curveTo(30.0f, 23.3788f, 29.4678f, 22.8751f, 28.8113f, 22.8751f)
          horizontalLineTo(25.125f)
          verticalLineTo(19.1886f)
          lineTo(25.1147f, 19.0273f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
