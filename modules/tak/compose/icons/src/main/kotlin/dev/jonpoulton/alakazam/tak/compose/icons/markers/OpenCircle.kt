package dev.jonpoulton.alakazam.tak.compose.icons.markers

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
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons

public val MarkersTakIcons.OpenCircle: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "OpenCircle",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      group {
        path(
          fill = SolidColor(Color.Black),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(16.0001f, 5.0f)
          curveTo(16.3405f, 5.0f, 16.6219f, 5.253f, 16.6664f, 5.5812f)
          lineTo(16.6725f, 5.6724f)
          lineTo(16.6723f, 7.0821f)
          curveTo(21.626f, 7.4129f, 25.5867f, 11.3731f, 25.918f, 16.327f)
          lineTo(27.3268f, 16.3275f)
          curveTo(27.6982f, 16.3275f, 27.9992f, 16.6286f, 27.9992f, 17.0f)
          curveTo(27.9992f, 17.3404f, 27.7463f, 17.6217f, 27.4181f, 17.6662f)
          lineTo(27.3268f, 17.6724f)
          lineTo(25.918f, 17.6722f)
          curveTo(25.5872f, 22.6265f, 21.6263f, 26.5871f, 16.6723f, 26.9179f)
          lineTo(16.6725f, 28.3276f)
          curveTo(16.6725f, 28.6989f, 16.3715f, 29.0f, 16.0001f, 29.0f)
          curveTo(15.6597f, 29.0f, 15.3784f, 28.747f, 15.3338f, 28.4188f)
          lineTo(15.3277f, 28.3276f)
          lineTo(15.327f, 26.9179f)
          curveTo(10.3728f, 26.5867f, 6.4122f, 22.6263f, 6.0814f, 17.6722f)
          lineTo(4.6724f, 17.6724f)
          curveTo(4.3011f, 17.6724f, 4.0f, 17.3713f, 4.0f, 17.0f)
          curveTo(4.0f, 16.6595f, 4.253f, 16.3782f, 4.5812f, 16.3337f)
          lineTo(4.6724f, 16.3275f)
          lineTo(6.0814f, 16.327f)
          curveTo(6.4127f, 11.3733f, 10.3731f, 7.4134f, 15.327f, 7.0822f)
          lineTo(15.3277f, 5.6724f)
          curveTo(15.3277f, 5.3011f, 15.6288f, 5.0f, 16.0001f, 5.0f)
          close()
          moveTo(16.6728f, 8.4305f)
          lineTo(16.6725f, 9.7923f)
          curveTo(16.6725f, 10.1637f, 16.3715f, 10.4647f, 16.0001f, 10.4647f)
          curveTo(15.6597f, 10.4647f, 15.3784f, 10.2118f, 15.3338f, 9.8836f)
          lineTo(15.3277f, 9.7923f)
          lineTo(15.3274f, 8.4305f)
          curveTo(11.1162f, 8.7565f, 7.7558f, 12.1165f, 7.4298f, 16.3274f)
          lineTo(8.7915f, 16.3275f)
          curveTo(9.1628f, 16.3275f, 9.4639f, 16.6286f, 9.4639f, 17.0f)
          curveTo(9.4639f, 17.3404f, 9.2109f, 17.6217f, 8.8827f, 17.6662f)
          lineTo(8.7915f, 17.6724f)
          lineTo(7.4298f, 17.6727f)
          curveTo(7.7558f, 21.8836f, 11.1162f, 25.2436f, 15.3274f, 25.5695f)
          lineTo(15.3277f, 24.2085f)
          curveTo(15.3277f, 23.8372f, 15.6288f, 23.5361f, 16.0001f, 23.5361f)
          curveTo(16.3405f, 23.5361f, 16.6219f, 23.7891f, 16.6664f, 24.1173f)
          lineTo(16.6725f, 24.2085f)
          lineTo(16.6728f, 25.5695f)
          curveTo(20.8833f, 25.2436f, 24.2436f, 21.8834f, 24.5696f, 17.6727f)
          lineTo(23.2078f, 17.6724f)
          curveTo(22.8364f, 17.6724f, 22.5353f, 17.3713f, 22.5353f, 17.0f)
          curveTo(22.5353f, 16.6595f, 22.7883f, 16.3782f, 23.1165f, 16.3337f)
          lineTo(23.2078f, 16.3275f)
          lineTo(24.5696f, 16.3274f)
          curveTo(24.2436f, 12.1166f, 20.8833f, 8.7565f, 16.6728f, 8.4305f)
          close()
          moveTo(16.0f, 11.6535f)
          curveTo(17.2043f, 11.6535f, 18.1958f, 12.5969f, 18.2732f, 13.7822f)
          lineTo(18.278f, 13.9315f)
          lineTo(18.2777f, 14.7761f)
          lineTo(19.0795f, 14.7761f)
          curveTo(19.42f, 14.7761f, 19.7013f, 15.0291f, 19.7458f, 15.3573f)
          lineTo(19.752f, 15.4485f)
          verticalLineTo(21.3388f)
          curveTo(19.752f, 21.7101f, 19.4509f, 22.0112f, 19.0795f, 22.0112f)
          horizontalLineTo(12.919f)
          curveTo(12.5476f, 22.0112f, 12.2466f, 21.7101f, 12.2466f, 21.3388f)
          verticalLineTo(15.4485f)
          curveTo(12.2466f, 15.0772f, 12.5476f, 14.7761f, 12.919f, 14.7761f)
          lineTo(13.7205f, 14.7761f)
          lineTo(13.7212f, 13.9315f)
          curveTo(13.7212f, 12.7273f, 14.6645f, 11.7358f, 15.8498f, 11.6584f)
          lineTo(16.0f, 11.6535f)
          close()
          moveTo(18.4068f, 16.1204f)
          horizontalLineTo(13.5914f)
          verticalLineTo(20.6659f)
          horizontalLineTo(18.4068f)
          verticalLineTo(16.1204f)
          close()
          moveTo(16.0f, 12.9984f)
          curveTo(15.5217f, 12.9984f, 15.1226f, 13.3655f, 15.0716f, 13.8305f)
          lineTo(15.066f, 13.9315f)
          lineTo(15.0653f, 14.7761f)
          horizontalLineTo(16.9328f)
          lineTo(16.9332f, 13.9315f)
          curveTo(16.9332f, 13.454f, 16.566f, 13.055f, 16.1011f, 13.0039f)
          lineTo(16.0f, 12.9984f)
          close()
        }
        path(
          fill = SolidColor(Color.Black),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(30.9253f, 1.4429f)
          horizontalLineTo(0.4424f)
          verticalLineTo(31.9258f)
          horizontalLineTo(30.9253f)
          verticalLineTo(1.4429f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
