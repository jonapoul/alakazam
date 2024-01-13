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

public val RadialTakIcons.HostileList: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "HostileList",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
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
          moveTo(29.9589f, 24.2389f)
          curveTo(30.3731f, 24.2389f, 30.7089f, 24.5747f, 30.7089f, 24.9889f)
          curveTo(30.7089f, 25.3686f, 30.4267f, 25.6824f, 30.0606f, 25.7321f)
          lineTo(29.9589f, 25.7389f)
          horizontalLineTo(20.6956f)
          curveTo(20.2814f, 25.7389f, 19.9456f, 25.4031f, 19.9456f, 24.9889f)
          curveTo(19.9456f, 24.6092f, 20.2277f, 24.2954f, 20.5938f, 24.2458f)
          lineTo(20.6956f, 24.2389f)
          horizontalLineTo(29.9589f)
          close()
          moveTo(10.3243f, 10.6308f)
          curveTo(10.6172f, 10.3379f, 11.0922f, 10.3379f, 11.3851f, 10.6308f)
          lineTo(17.4898f, 16.7364f)
          curveTo(17.7826f, 17.0292f, 17.7826f, 17.5039f, 17.4899f, 17.7968f)
          lineTo(11.3852f, 23.9024f)
          curveTo(11.0923f, 24.1954f, 10.6173f, 24.1955f, 10.3243f, 23.9025f)
          lineTo(4.2196f, 17.797f)
          curveTo(3.9268f, 17.5041f, 3.9268f, 17.0293f, 4.2196f, 16.7364f)
          lineTo(10.3243f, 10.6308f)
          close()
          moveTo(10.8541f, 12.2208f)
          lineTo(5.8101f, 17.2668f)
          lineTo(10.8541f, 22.3118f)
          lineTo(15.8981f, 17.2668f)
          lineTo(10.8541f, 12.2208f)
          close()
          moveTo(29.9589f, 19.3257f)
          curveTo(30.3731f, 19.3257f, 30.7089f, 19.6614f, 30.7089f, 20.0757f)
          curveTo(30.7089f, 20.4554f, 30.4267f, 20.7692f, 30.0606f, 20.8188f)
          lineTo(29.9589f, 20.8257f)
          horizontalLineTo(20.6956f)
          curveTo(20.2814f, 20.8257f, 19.9456f, 20.4899f, 19.9456f, 20.0757f)
          curveTo(19.9456f, 19.696f, 20.2277f, 19.3822f, 20.5938f, 19.3325f)
          lineTo(20.6956f, 19.3257f)
          horizontalLineTo(29.9589f)
          close()
          moveTo(29.9589f, 14.4133f)
          curveTo(30.3731f, 14.4133f, 30.7089f, 14.749f, 30.7089f, 15.1633f)
          curveTo(30.7089f, 15.543f, 30.4267f, 15.8567f, 30.0606f, 15.9064f)
          lineTo(29.9589f, 15.9133f)
          horizontalLineTo(20.6956f)
          curveTo(20.2814f, 15.9133f, 19.9456f, 15.5775f, 19.9456f, 15.1633f)
          curveTo(19.9456f, 14.7836f, 20.2277f, 14.4698f, 20.5938f, 14.4201f)
          lineTo(20.6956f, 14.4133f)
          horizontalLineTo(29.9589f)
          close()
          moveTo(29.9589f, 9.5f)
          curveTo(30.3731f, 9.5f, 30.7089f, 9.8358f, 30.7089f, 10.25f)
          curveTo(30.7089f, 10.6297f, 30.4267f, 10.9435f, 30.0606f, 10.9932f)
          lineTo(29.9589f, 11f)
          horizontalLineTo(20.6956f)
          curveTo(20.2814f, 11f, 19.9456f, 10.6642f, 19.9456f, 10.25f)
          curveTo(19.9456f, 9.8703f, 20.2277f, 9.5565f, 20.5938f, 9.5069f)
          lineTo(20.6956f, 9.5f)
          horizontalLineTo(29.9589f)
          close()
        }
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(33.8621f, 0.2628f)
          horizontalLineTo(-0.1379f)
          verticalLineTo(34.2628f)
          horizontalLineTo(33.8621f)
          verticalLineTo(0.2628f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
