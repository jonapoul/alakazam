package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.Export: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Export",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      group {
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = EvenOdd,
        ) {
          moveTo(9.1627f, 26.6406f)
          verticalLineTo(10.3092f)
          curveTo(9.1627f, 10.1003f, 9.3323f, 9.9306f, 9.5413f, 9.9306f)
          horizontalLineTo(22.0594f)
          curveTo(22.2691f, 9.9306f, 22.438f, 9.761f, 22.438f, 9.552f)
          verticalLineTo(7.6356f)
          curveTo(22.438f, 7.4266f, 22.2691f, 7.257f, 22.0594f, 7.257f)
          horizontalLineTo(6.3785f)
          curveTo(6.1695f, 7.257f, 5.9999f, 7.4266f, 5.9999f, 7.6356f)
          verticalLineTo(29.4521f)
          curveTo(5.9999f, 29.661f, 6.1695f, 29.8307f, 6.3785f, 29.8307f)
          horizontalLineTo(22.0594f)
          curveTo(22.2691f, 29.8307f, 22.438f, 29.661f, 22.438f, 29.4521f)
          verticalLineTo(27.5242f)
          curveTo(22.438f, 27.316f, 22.2714f, 27.1471f, 22.0632f, 27.1456f)
          lineTo(9.5375f, 27.0192f)
          curveTo(9.3301f, 27.0169f, 9.1627f, 26.848f, 9.1627f, 26.6406f)
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
          moveTo(16.47f, 21.1256f)
          horizontalLineTo(22.1114f)
          curveTo(22.3701f, 21.1256f, 22.5816f, 21.2756f, 22.5816f, 21.4603f)
          verticalLineTo(22.8145f)
          curveTo(22.5816f, 23.105f, 23.065f, 23.2576f, 23.3669f, 23.0628f)
          lineTo(26.4063f, 21.1089f)
          lineTo(29.8453f, 18.8986f)
          curveTo(30.0513f, 18.7654f, 30.0513f, 18.5345f, 29.8453f, 18.402f)
          lineTo(26.4063f, 16.191f)
          lineTo(23.3669f, 14.2371f)
          curveTo(23.065f, 14.0423f, 22.5816f, 14.1956f, 22.5816f, 14.4855f)
          verticalLineTo(15.8396f)
          curveTo(22.5816f, 16.0244f, 22.3701f, 16.1743f, 22.1114f, 16.1743f)
          horizontalLineTo(17.47f)
          curveTo(17.2104f, 16.1743f, 16.9998f, 16.3242f, 16.9998f, 16.509f)
          verticalLineTo(20.7909f)
          curveTo(16.9998f, 20.9757f, 17.2104f, 21.1256f, 17.47f, 21.1256f)
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
          moveTo(14.5805f, 16.15f)
          horizontalLineTo(13.4195f)
          curveTo(13.1879f, 16.15f, 13f, 16.3023f, 13f, 16.4899f)
          verticalLineTo(20.8102f)
          curveTo(13f, 20.9984f, 13.1879f, 21.15f, 13.4195f, 21.15f)
          horizontalLineTo(14.5805f)
          curveTo(14.8121f, 21.15f, 15f, 20.9984f, 15f, 20.8102f)
          verticalLineTo(16.4899f)
          curveTo(15f, 16.3023f, 14.8121f, 16.15f, 14.5805f, 16.15f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
