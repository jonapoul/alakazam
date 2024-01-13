package dev.jonpoulton.alakazam.tak.compose.icons.markers

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

public val MarkersTakIcons.CheckpointGreen: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "CheckpointGreen",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFF5CFF00)),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(16.1235f, 31.1993f)
        curveTo(16.1235f, 31.1993f, 26.8517f, 19.0493f, 26.8517f, 13.1241f)
        curveTo(26.8517f, 7.1971f, 22.0486f, 2.394f, 16.1235f, 2.394f)
        curveTo(10.2001f, 2.394f, 5.3971f, 7.1971f, 5.3971f, 13.1241f)
        curveTo(5.3971f, 19.0493f, 16.1235f, 31.1993f, 16.1235f, 31.1993f)
        close()
        moveTo(16.1258f, 19.2857f)
        curveTo(19.5278f, 19.2857f, 22.2858f, 16.5278f, 22.2858f, 13.1257f)
        curveTo(22.2858f, 9.7237f, 19.5278f, 6.9658f, 16.1258f, 6.9658f)
        curveTo(12.7237f, 6.9658f, 9.9658f, 9.7237f, 9.9658f, 13.1257f)
        curveTo(9.9658f, 16.5278f, 12.7237f, 19.2857f, 16.1258f, 19.2857f)
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
        moveTo(16.1235f, 31.1993f)
        lineTo(15.5612f, 31.6956f)
        lineTo(16.1234f, 32.3324f)
        lineTo(16.6857f, 31.6957f)
        lineTo(16.1235f, 31.1993f)
        close()
        moveTo(26.1017f, 13.1241f)
        curveTo(26.1017f, 14.4188f, 25.5025f, 16.1557f, 24.5073f, 18.1073f)
        curveTo(23.5246f, 20.0343f, 22.2064f, 22.0755f, 20.876f, 23.9495f)
        curveTo(19.5476f, 25.8208f, 18.2175f, 27.5109f, 17.2188f, 28.7339f)
        curveTo(16.7198f, 29.345f, 16.3042f, 29.8386f, 16.0139f, 30.1788f)
        curveTo(15.8688f, 30.3489f, 15.755f, 30.4806f, 15.6778f, 30.5695f)
        curveTo(15.6392f, 30.6139f, 15.6097f, 30.6476f, 15.5901f, 30.67f)
        curveTo(15.5803f, 30.6812f, 15.5729f, 30.6896f, 15.5681f, 30.6951f)
        curveTo(15.5657f, 30.6979f, 15.5639f, 30.6999f, 15.5627f, 30.7012f)
        curveTo(15.5622f, 30.7018f, 15.5618f, 30.7023f, 15.5615f, 30.7026f)
        curveTo(15.5614f, 30.7027f, 15.5613f, 30.7028f, 15.5613f, 30.7028f)
        curveTo(15.5612f, 30.7029f, 15.5613f, 30.7029f, 16.1235f, 31.1993f)
        curveTo(16.6857f, 31.6957f, 16.6858f, 31.6956f, 16.6859f, 31.6954f)
        curveTo(16.686f, 31.6953f, 16.6862f, 31.6951f, 16.6864f, 31.6949f)
        curveTo(16.6868f, 31.6944f, 16.6874f, 31.6938f, 16.6881f, 31.6929f)
        curveTo(16.6895f, 31.6913f, 16.6916f, 31.6889f, 16.6944f, 31.6858f)
        curveTo(16.6999f, 31.6796f, 16.7079f, 31.6704f, 16.7184f, 31.6585f)
        curveTo(16.7393f, 31.6345f, 16.7701f, 31.5993f, 16.8101f, 31.5533f)
        curveTo(16.89f, 31.4613f, 17.0068f, 31.3261f, 17.155f, 31.1524f)
        curveTo(17.4514f, 30.8051f, 17.8739f, 30.3032f, 18.3807f, 29.6826f)
        curveTo(19.3935f, 28.4424f, 20.7455f, 26.7246f, 22.0991f, 24.8178f)
        curveTo(23.4508f, 22.9137f, 24.8146f, 20.8064f, 25.8435f, 18.7888f)
        curveTo(26.8598f, 16.7958f, 27.6017f, 14.792f, 27.6017f, 13.1241f)
        horizontalLineTo(26.1017f)
        close()
        moveTo(16.1235f, 3.144f)
        curveTo(21.6343f, 3.144f, 26.1017f, 7.6112f, 26.1017f, 13.1241f)
        horizontalLineTo(27.6017f)
        curveTo(27.6017f, 6.783f, 22.4629f, 1.644f, 16.1235f, 1.644f)
        verticalLineTo(3.144f)
        close()
        moveTo(6.1471f, 13.1241f)
        curveTo(6.1471f, 7.6111f, 10.6145f, 3.144f, 16.1235f, 3.144f)
        verticalLineTo(1.644f)
        curveTo(9.7858f, 1.644f, 4.6471f, 6.783f, 4.6471f, 13.1241f)
        horizontalLineTo(6.1471f)
        close()
        moveTo(16.1235f, 31.1993f)
        curveTo(16.6857f, 30.7029f, 16.6857f, 30.7029f, 16.6857f, 30.7029f)
        curveTo(16.6856f, 30.7028f, 16.6856f, 30.7028f, 16.6854f, 30.7026f)
        curveTo(16.6852f, 30.7023f, 16.6848f, 30.7019f, 16.6842f, 30.7012f)
        curveTo(16.6831f, 30.6999f, 16.6813f, 30.6979f, 16.6789f, 30.6952f)
        curveTo(16.674f, 30.6897f, 16.6667f, 30.6813f, 16.6569f, 30.6701f)
        curveTo(16.6372f, 30.6476f, 16.6078f, 30.6139f, 16.5692f, 30.5695f)
        curveTo(16.492f, 30.4807f, 16.3782f, 30.349f, 16.2331f, 30.1789f)
        curveTo(15.9429f, 29.8386f, 15.5274f, 29.345f, 15.0284f, 28.7339f)
        curveTo(14.0299f, 27.5109f, 12.7001f, 25.8209f, 11.3719f, 23.9495f)
        curveTo(10.0418f, 22.0755f, 8.7237f, 20.0343f, 7.7413f, 18.1074f)
        curveTo(6.7462f, 16.1558f, 6.1471f, 14.4188f, 6.1471f, 13.1241f)
        horizontalLineTo(4.6471f)
        curveTo(4.6471f, 14.792f, 5.3888f, 16.7958f, 6.4049f, 18.7887f)
        curveTo(7.4336f, 20.8063f, 8.7972f, 22.9136f, 10.1487f, 24.8177f)
        curveTo(11.5021f, 26.7245f, 12.8539f, 28.4423f, 13.8665f, 29.6826f)
        curveTo(14.3731f, 30.3031f, 14.7956f, 30.805f, 15.092f, 31.1524f)
        curveTo(15.2402f, 31.3261f, 15.3569f, 31.4612f, 15.4368f, 31.5532f)
        curveTo(15.4768f, 31.5992f, 15.5076f, 31.6345f, 15.5285f, 31.6584f)
        curveTo(15.539f, 31.6704f, 15.547f, 31.6795f, 15.5525f, 31.6857f)
        curveTo(15.5552f, 31.6888f, 15.5573f, 31.6912f, 15.5588f, 31.6929f)
        curveTo(15.5595f, 31.6937f, 15.5601f, 31.6944f, 15.5605f, 31.6948f)
        curveTo(15.5607f, 31.695f, 15.5609f, 31.6953f, 15.561f, 31.6954f)
        curveTo(15.5611f, 31.6955f, 15.5612f, 31.6956f, 16.1235f, 31.1993f)
        close()
        moveTo(21.5358f, 13.1257f)
        curveTo(21.5358f, 16.1136f, 19.1136f, 18.5357f, 16.1258f, 18.5357f)
        verticalLineTo(20.0357f)
        curveTo(19.9421f, 20.0357f, 23.0358f, 16.942f, 23.0358f, 13.1257f)
        horizontalLineTo(21.5358f)
        close()
        moveTo(16.1258f, 7.7158f)
        curveTo(19.1136f, 7.7158f, 21.5358f, 10.1379f, 21.5358f, 13.1257f)
        horizontalLineTo(23.0358f)
        curveTo(23.0358f, 9.3095f, 19.9421f, 6.2158f, 16.1258f, 6.2158f)
        verticalLineTo(7.7158f)
        close()
        moveTo(10.7158f, 13.1257f)
        curveTo(10.7158f, 10.1379f, 13.1379f, 7.7158f, 16.1258f, 7.7158f)
        verticalLineTo(6.2158f)
        curveTo(12.3095f, 6.2158f, 9.2158f, 9.3095f, 9.2158f, 13.1257f)
        horizontalLineTo(10.7158f)
        close()
        moveTo(16.1258f, 18.5357f)
        curveTo(13.1379f, 18.5357f, 10.7158f, 16.1136f, 10.7158f, 13.1257f)
        horizontalLineTo(9.2158f)
        curveTo(9.2158f, 16.942f, 12.3095f, 20.0357f, 16.1258f, 20.0357f)
        verticalLineTo(18.5357f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color(0xFF5CFF00)),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(13.8402f, 13.6455f)
        lineTo(15.4467f, 15.1575f)
        lineTo(18.5652f, 11.094f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
