package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.DistanceLock: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "DistanceLock",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(27.75f, 17.3288f)
        curveTo(28.1297f, 17.3288f, 28.4435f, 17.611f, 28.4932f, 17.977f)
        lineTo(28.5f, 18.0788f)
        verticalLineTo(28.0788f)
        curveTo(28.5f, 28.493f, 28.1642f, 28.8288f, 27.75f, 28.8288f)
        curveTo(27.3703f, 28.8288f, 27.0565f, 28.5466f, 27.0068f, 28.1806f)
        lineTo(27f, 28.0788f)
        verticalLineTo(23.8288f)
        horizontalLineTo(6.5f)
        verticalLineTo(28.0788f)
        curveTo(6.5f, 28.493f, 6.1642f, 28.8288f, 5.75f, 28.8288f)
        curveTo(5.3703f, 28.8288f, 5.0565f, 28.5466f, 5.0068f, 28.1806f)
        lineTo(5f, 28.0788f)
        verticalLineTo(18.0788f)
        curveTo(5f, 17.6646f, 5.3358f, 17.3288f, 5.75f, 17.3288f)
        curveTo(6.1297f, 17.3288f, 6.4435f, 17.611f, 6.4932f, 17.977f)
        lineTo(6.5f, 18.0788f)
        verticalLineTo(22.3288f)
        horizontalLineTo(27f)
        verticalLineTo(18.0788f)
        curveTo(27f, 17.6646f, 27.3358f, 17.3288f, 27.75f, 17.3288f)
        close()
      }
      group {
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(16.6345f, 5.5f)
          curveTo(17.9777f, 5.5f, 19.0836f, 6.5522f, 19.1699f, 7.8742f)
          lineTo(19.1753f, 8.0408f)
          lineTo(19.175f, 8.982f)
          lineTo(20.0693f, 8.9829f)
          curveTo(20.449f, 8.9829f, 20.7628f, 9.265f, 20.8125f, 9.6311f)
          lineTo(20.8193f, 9.7329f)
          verticalLineTo(16.3027f)
          curveTo(20.8193f, 16.7169f, 20.4835f, 17.0527f, 20.0693f, 17.0527f)
          horizontalLineTo(13.198f)
          curveTo(12.7838f, 17.0527f, 12.448f, 16.7169f, 12.448f, 16.3027f)
          verticalLineTo(9.7329f)
          curveTo(12.448f, 9.3186f, 12.7838f, 8.9829f, 13.198f, 8.9829f)
          lineTo(14.092f, 8.982f)
          lineTo(14.0928f, 8.0408f)
          curveTo(14.0928f, 6.6977f, 15.1449f, 5.5918f, 16.467f, 5.5054f)
          lineTo(16.6345f, 5.5f)
          close()
          moveTo(19.319f, 10.4822f)
          horizontalLineTo(13.948f)
          verticalLineTo(15.5522f)
          horizontalLineTo(19.319f)
          verticalLineTo(10.4822f)
          close()
          moveTo(16.6345f, 7f)
          curveTo(16.101f, 7f, 15.6559f, 7.4095f, 15.5989f, 7.9281f)
          lineTo(15.5928f, 8.0408f)
          lineTo(15.592f, 8.982f)
          horizontalLineTo(17.675f)
          lineTo(17.6753f, 8.0408f)
          curveTo(17.6753f, 7.5082f, 17.2658f, 7.0631f, 16.7472f, 7.0062f)
          lineTo(16.6345f, 7f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
