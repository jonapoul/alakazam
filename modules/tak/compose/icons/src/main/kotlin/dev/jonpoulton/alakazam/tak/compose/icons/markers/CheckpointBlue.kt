package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val MarkersTakIcons.CheckpointBlue: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "CheckpointBlue",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFF3B01FF)),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(16.1233f, 31.1993f)
        curveTo(16.1233f, 31.1993f, 26.8516f, 19.0493f, 26.8516f, 13.1241f)
        curveTo(26.8516f, 7.1971f, 22.0485f, 2.394f, 16.1233f, 2.394f)
        curveTo(10.2f, 2.394f, 5.397f, 7.1971f, 5.397f, 13.1241f)
        curveTo(5.397f, 19.0493f, 16.1233f, 31.1993f, 16.1233f, 31.1993f)
        close()
        moveTo(16.1256f, 19.2857f)
        curveTo(19.5277f, 19.2857f, 22.2856f, 16.5278f, 22.2856f, 13.1257f)
        curveTo(22.2856f, 9.7237f, 19.5277f, 6.9658f, 16.1256f, 6.9658f)
        curveTo(12.7236f, 6.9658f, 9.9656f, 9.7237f, 9.9656f, 13.1257f)
        curveTo(9.9656f, 16.5278f, 12.7236f, 19.2857f, 16.1256f, 19.2857f)
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
        moveTo(16.1233f, 31.1993f)
        lineTo(15.5611f, 31.6956f)
        lineTo(16.1233f, 32.3324f)
        lineTo(16.6855f, 31.6957f)
        lineTo(16.1233f, 31.1993f)
        close()
        moveTo(26.1016f, 13.1241f)
        curveTo(26.1016f, 14.4188f, 25.5024f, 16.1557f, 24.5071f, 18.1073f)
        curveTo(23.5245f, 20.0343f, 22.2062f, 22.0755f, 20.8759f, 23.9495f)
        curveTo(19.5474f, 25.8208f, 18.2174f, 27.5109f, 17.2187f, 28.7339f)
        curveTo(16.7197f, 29.345f, 16.3041f, 29.8386f, 16.0138f, 30.1788f)
        curveTo(15.8686f, 30.3489f, 15.7549f, 30.4806f, 15.6777f, 30.5695f)
        curveTo(15.6391f, 30.6139f, 15.6096f, 30.6476f, 15.59f, 30.67f)
        curveTo(15.5802f, 30.6812f, 15.5728f, 30.6896f, 15.568f, 30.6951f)
        curveTo(15.5655f, 30.6979f, 15.5638f, 30.6999f, 15.5626f, 30.7012f)
        curveTo(15.562f, 30.7018f, 15.5616f, 30.7023f, 15.5614f, 30.7026f)
        curveTo(15.5613f, 30.7027f, 15.5612f, 30.7028f, 15.5611f, 30.7028f)
        curveTo(15.5611f, 30.7029f, 15.5611f, 30.7029f, 16.1233f, 31.1993f)
        curveTo(16.6855f, 31.6957f, 16.6856f, 31.6956f, 16.6858f, 31.6954f)
        curveTo(16.6859f, 31.6953f, 16.6861f, 31.6951f, 16.6863f, 31.6949f)
        curveTo(16.6867f, 31.6944f, 16.6872f, 31.6938f, 16.688f, 31.6929f)
        curveTo(16.6894f, 31.6913f, 16.6915f, 31.6889f, 16.6943f, 31.6858f)
        curveTo(16.6997f, 31.6796f, 16.7078f, 31.6704f, 16.7182f, 31.6585f)
        curveTo(16.7392f, 31.6345f, 16.77f, 31.5993f, 16.81f, 31.5533f)
        curveTo(16.8899f, 31.4613f, 17.0066f, 31.3261f, 17.1548f, 31.1524f)
        curveTo(17.4512f, 30.8051f, 17.8738f, 30.3032f, 18.3805f, 29.6826f)
        curveTo(19.3934f, 28.4424f, 20.7454f, 26.7246f, 22.099f, 24.8178f)
        curveTo(23.4507f, 22.9137f, 24.8145f, 20.8064f, 25.8434f, 18.7888f)
        curveTo(26.8597f, 16.7958f, 27.6016f, 14.792f, 27.6016f, 13.1241f)
        horizontalLineTo(26.1016f)
        close()
        moveTo(16.1233f, 3.144f)
        curveTo(21.6342f, 3.144f, 26.1016f, 7.6112f, 26.1016f, 13.1241f)
        horizontalLineTo(27.6016f)
        curveTo(27.6016f, 6.783f, 22.4628f, 1.644f, 16.1233f, 1.644f)
        verticalLineTo(3.144f)
        close()
        moveTo(6.147f, 13.1241f)
        curveTo(6.147f, 7.6111f, 10.6144f, 3.144f, 16.1233f, 3.144f)
        verticalLineTo(1.644f)
        curveTo(9.7856f, 1.644f, 4.647f, 6.783f, 4.647f, 13.1241f)
        horizontalLineTo(6.147f)
        close()
        moveTo(16.1233f, 31.1993f)
        curveTo(16.6856f, 30.7029f, 16.6856f, 30.7029f, 16.6856f, 30.7029f)
        curveTo(16.6855f, 30.7028f, 16.6854f, 30.7028f, 16.6853f, 30.7026f)
        curveTo(16.6851f, 30.7023f, 16.6847f, 30.7019f, 16.6841f, 30.7012f)
        curveTo(16.683f, 30.6999f, 16.6812f, 30.6979f, 16.6788f, 30.6952f)
        curveTo(16.6739f, 30.6897f, 16.6666f, 30.6813f, 16.6567f, 30.6701f)
        curveTo(16.6371f, 30.6476f, 16.6077f, 30.6139f, 16.5691f, 30.5695f)
        curveTo(16.4919f, 30.4807f, 16.3781f, 30.349f, 16.233f, 30.1789f)
        curveTo(15.9428f, 29.8386f, 15.5273f, 29.345f, 15.0283f, 28.7339f)
        curveTo(14.0297f, 27.5109f, 12.7f, 25.8209f, 11.3718f, 23.9495f)
        curveTo(10.0416f, 22.0755f, 8.7236f, 20.0343f, 7.7411f, 18.1074f)
        curveTo(6.7461f, 16.1558f, 6.147f, 14.4188f, 6.147f, 13.1241f)
        horizontalLineTo(4.647f)
        curveTo(4.647f, 14.792f, 5.3887f, 16.7958f, 6.4048f, 18.7887f)
        curveTo(7.4335f, 20.8063f, 8.7971f, 22.9136f, 10.1485f, 24.8177f)
        curveTo(11.5019f, 26.7245f, 12.8537f, 28.4423f, 13.8664f, 29.6826f)
        curveTo(14.373f, 30.3031f, 14.7955f, 30.805f, 15.0919f, 31.1524f)
        curveTo(15.24f, 31.3261f, 15.3567f, 31.4612f, 15.4367f, 31.5532f)
        curveTo(15.4767f, 31.5992f, 15.5074f, 31.6345f, 15.5284f, 31.6584f)
        curveTo(15.5389f, 31.6704f, 15.5469f, 31.6795f, 15.5524f, 31.6857f)
        curveTo(15.5551f, 31.6888f, 15.5572f, 31.6912f, 15.5587f, 31.6929f)
        curveTo(15.5594f, 31.6937f, 15.56f, 31.6944f, 15.5604f, 31.6948f)
        curveTo(15.5606f, 31.695f, 15.5607f, 31.6953f, 15.5608f, 31.6954f)
        curveTo(15.561f, 31.6955f, 15.5611f, 31.6956f, 16.1233f, 31.1993f)
        close()
        moveTo(21.5356f, 13.1257f)
        curveTo(21.5356f, 16.1136f, 19.1135f, 18.5357f, 16.1256f, 18.5357f)
        verticalLineTo(20.0357f)
        curveTo(19.9419f, 20.0357f, 23.0356f, 16.942f, 23.0356f, 13.1257f)
        horizontalLineTo(21.5356f)
        close()
        moveTo(16.1256f, 7.7158f)
        curveTo(19.1135f, 7.7158f, 21.5356f, 10.1379f, 21.5356f, 13.1257f)
        horizontalLineTo(23.0356f)
        curveTo(23.0356f, 9.3095f, 19.9419f, 6.2158f, 16.1256f, 6.2158f)
        verticalLineTo(7.7158f)
        close()
        moveTo(10.7156f, 13.1257f)
        curveTo(10.7156f, 10.1379f, 13.1378f, 7.7158f, 16.1256f, 7.7158f)
        verticalLineTo(6.2158f)
        curveTo(12.3094f, 6.2158f, 9.2156f, 9.3095f, 9.2156f, 13.1257f)
        horizontalLineTo(10.7156f)
        close()
        moveTo(16.1256f, 18.5357f)
        curveTo(13.1378f, 18.5357f, 10.7156f, 16.1136f, 10.7156f, 13.1257f)
        horizontalLineTo(9.2156f)
        curveTo(9.2156f, 16.942f, 12.3094f, 20.0357f, 16.1256f, 20.0357f)
        verticalLineTo(18.5357f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color(0xFF3B01FF)),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(13.8401f, 13.6455f)
        lineTo(15.4466f, 15.1575f)
        lineTo(18.5651f, 11.094f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.CheckpointBlue)
