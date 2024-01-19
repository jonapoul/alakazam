package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val MarkersTakIcons.PicMarker: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "PicMarker",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(26.8517f, 13.1241f)
        curveTo(26.8517f, 21.0f, 16.1235f, 31.1993f, 16.1235f, 31.1993f)
        curveTo(16.1235f, 31.1993f, 5.3971f, 21.0f, 5.3971f, 13.1241f)
        curveTo(5.3971f, 7.1971f, 10.2001f, 2.394f, 16.1235f, 2.394f)
        curveTo(22.0486f, 2.394f, 26.8517f, 7.1971f, 26.8517f, 13.1241f)
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
        moveTo(26.8517f, 13.1241f)
        horizontalLineTo(26.1017f)
        horizontalLineTo(26.8517f)
        close()
        moveTo(16.1235f, 31.1993f)
        lineTo(15.6066f, 31.7428f)
        lineTo(16.1234f, 32.2342f)
        lineTo(16.6402f, 31.7428f)
        lineTo(16.1235f, 31.1993f)
        close()
        moveTo(26.1017f, 13.1241f)
        curveTo(26.1017f, 14.9335f, 25.482f, 16.9299f, 24.5012f, 18.9424f)
        curveTo(23.5241f, 20.9474f, 22.2135f, 22.9179f, 20.8901f, 24.6618f)
        curveTo(19.5684f, 26.4035f, 18.2448f, 27.9049f, 17.2511f, 28.9712f)
        curveTo(16.7546f, 29.504f, 16.3414f, 29.9271f, 16.0533f, 30.2161f)
        curveTo(15.9092f, 30.3606f, 15.7965f, 30.4716f, 15.7203f, 30.5458f)
        curveTo(15.6822f, 30.583f, 15.6533f, 30.611f, 15.6341f, 30.6294f)
        curveTo(15.6245f, 30.6386f, 15.6174f, 30.6455f, 15.6128f, 30.6499f)
        curveTo(15.6105f, 30.6521f, 15.6088f, 30.6537f, 15.6078f, 30.6546f)
        curveTo(15.6073f, 30.6551f, 15.607f, 30.6555f, 15.6068f, 30.6556f)
        curveTo(15.6067f, 30.6557f, 15.6067f, 30.6557f, 15.6066f, 30.6558f)
        curveTo(15.6066f, 30.6558f, 15.6067f, 30.6557f, 16.1235f, 31.1993f)
        curveTo(16.6402f, 31.7428f, 16.6404f, 31.7427f, 16.6405f, 31.7425f)
        curveTo(16.6407f, 31.7424f, 16.6409f, 31.7422f, 16.6411f, 31.742f)
        curveTo(16.6416f, 31.7415f, 16.6422f, 31.7409f, 16.643f, 31.7402f)
        curveTo(16.6446f, 31.7387f, 16.6468f, 31.7366f, 16.6496f, 31.7338f)
        curveTo(16.6554f, 31.7284f, 16.6636f, 31.7204f, 16.6743f, 31.7101f)
        curveTo(16.6958f, 31.6895f, 16.7271f, 31.6592f, 16.7676f, 31.6198f)
        curveTo(16.8485f, 31.5408f, 16.9663f, 31.4249f, 17.1156f, 31.2751f)
        curveTo(17.4142f, 30.9756f, 17.8391f, 30.5404f, 18.3484f, 29.9939f)
        curveTo(19.3662f, 28.9018f, 20.7247f, 27.3611f, 22.085f, 25.5685f)
        curveTo(23.4437f, 23.7781f, 24.8152f, 21.7221f, 25.8496f, 19.5996f)
        curveTo(26.8803f, 17.4847f, 27.6017f, 15.2527f, 27.6017f, 13.1241f)
        horizontalLineTo(26.1017f)
        close()
        moveTo(16.1235f, 31.1993f)
        curveTo(16.6403f, 30.6558f, 16.6403f, 30.6558f, 16.6403f, 30.6558f)
        curveTo(16.6403f, 30.6558f, 16.6403f, 30.6558f, 16.6402f, 30.6557f)
        curveTo(16.64f, 30.6555f, 16.6396f, 30.6552f, 16.6391f, 30.6547f)
        curveTo(16.6381f, 30.6537f, 16.6364f, 30.6521f, 16.6341f, 30.6499f)
        curveTo(16.6295f, 30.6455f, 16.6224f, 30.6387f, 16.6128f, 30.6295f)
        curveTo(16.5937f, 30.611f, 16.5647f, 30.583f, 16.5267f, 30.5459f)
        curveTo(16.4505f, 30.4716f, 16.3378f, 30.3607f, 16.1938f, 30.2162f)
        curveTo(15.9057f, 29.9271f, 15.4926f, 29.504f, 14.9962f, 28.9713f)
        curveTo(14.0026f, 27.9049f, 12.6793f, 26.4035f, 11.3578f, 24.6618f)
        curveTo(10.0346f, 22.9179f, 8.7243f, 20.9474f, 7.7473f, 18.9425f)
        curveTo(6.7667f, 16.9299f, 6.1471f, 14.9335f, 6.1471f, 13.1241f)
        horizontalLineTo(4.6471f)
        curveTo(4.6471f, 15.2527f, 5.3683f, 17.4846f, 6.3989f, 19.5995f)
        curveTo(7.4331f, 21.722f, 8.8043f, 23.7781f, 10.1628f, 25.5685f)
        curveTo(11.5229f, 27.3611f, 12.8812f, 28.9017f, 13.8987f, 29.9939f)
        curveTo(14.4079f, 30.5403f, 14.8328f, 30.9756f, 15.1314f, 31.2751f)
        curveTo(15.2806f, 31.4249f, 15.3984f, 31.5408f, 15.4793f, 31.6197f)
        curveTo(15.5198f, 31.6592f, 15.5511f, 31.6894f, 15.5725f, 31.7101f)
        curveTo(15.5832f, 31.7204f, 15.5915f, 31.7283f, 15.5972f, 31.7338f)
        curveTo(15.6001f, 31.7365f, 15.6023f, 31.7386f, 15.6039f, 31.7401f)
        curveTo(15.6047f, 31.7409f, 15.6053f, 31.7415f, 15.6057f, 31.7419f)
        curveTo(15.606f, 31.7421f, 15.6062f, 31.7424f, 15.6063f, 31.7425f)
        curveTo(15.6065f, 31.7426f, 15.6066f, 31.7428f, 16.1235f, 31.1993f)
        close()
        moveTo(6.1471f, 13.1241f)
        curveTo(6.1471f, 7.6111f, 10.6145f, 3.144f, 16.1235f, 3.144f)
        verticalLineTo(1.644f)
        curveTo(9.7858f, 1.644f, 4.6471f, 6.783f, 4.6471f, 13.1241f)
        horizontalLineTo(6.1471f)
        close()
        moveTo(16.1235f, 3.144f)
        curveTo(21.6343f, 3.144f, 26.1017f, 7.6112f, 26.1017f, 13.1241f)
        horizontalLineTo(27.6017f)
        curveTo(27.6017f, 6.783f, 22.4629f, 1.644f, 16.1235f, 1.644f)
        verticalLineTo(3.144f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(21.7484f, 9.0085f)
        horizontalLineTo(10.5016f)
        curveTo(10.2936f, 9.0085f, 10.125f, 9.1771f, 10.125f, 9.3851f)
        verticalLineTo(17.4186f)
        curveTo(10.125f, 17.6266f, 10.2936f, 17.7952f, 10.5016f, 17.7952f)
        horizontalLineTo(21.7484f)
        curveTo(21.9564f, 17.7952f, 22.125f, 17.6266f, 22.125f, 17.4186f)
        verticalLineTo(9.3851f)
        curveTo(22.125f, 9.1771f, 21.9564f, 9.0085f, 21.7484f, 9.0085f)
        close()
        moveTo(13.3382f, 13.4009f)
        curveTo(13.3382f, 11.8622f, 14.5861f, 10.6143f, 16.1248f, 10.6143f)
        curveTo(17.6635f, 10.6143f, 18.9114f, 11.8622f, 18.9114f, 13.4009f)
        curveTo(18.9114f, 14.9396f, 17.6635f, 16.1875f, 16.1248f, 16.1875f)
        curveTo(14.5861f, 16.1875f, 13.3382f, 14.9396f, 13.3382f, 13.4009f)
        close()
        moveTo(18.1583f, 13.4009f)
        curveTo(18.1583f, 12.2781f, 17.2476f, 11.3674f, 16.1248f, 11.3674f)
        curveTo(15.002f, 11.3674f, 14.0913f, 12.2781f, 14.0913f, 13.4009f)
        curveTo(14.0913f, 14.5237f, 15.002f, 15.4344f, 16.1248f, 15.4344f)
        curveTo(17.2476f, 15.4344f, 18.1583f, 14.5237f, 18.1583f, 13.4009f)
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
        moveTo(17.5309f, 7.0f)
        horizontalLineTo(14.7192f)
        curveTo(14.5529f, 7.0f, 14.4063f, 7.1091f, 14.3585f, 7.2684f)
        lineTo(13.756f, 9.2767f)
        curveTo(13.6835f, 9.5183f, 13.8644f, 9.7615f, 14.1167f, 9.7615f)
        horizontalLineTo(18.1334f)
        curveTo(18.3857f, 9.7615f, 18.5666f, 9.5183f, 18.4941f, 9.2767f)
        lineTo(17.8916f, 7.2684f)
        curveTo(17.8438f, 7.1091f, 17.6972f, 7.0f, 17.5309f, 7.0f)
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
        moveTo(11.305f, 7.8035f)
        horizontalLineTo(12.9117f)
        curveTo(13.1197f, 7.8035f, 13.2883f, 7.9721f, 13.2883f, 8.18f)
        verticalLineTo(9.3851f)
        curveTo(13.2883f, 9.593f, 13.1197f, 9.7616f, 12.9117f, 9.7616f)
        horizontalLineTo(11.305f)
        curveTo(11.0971f, 9.7616f, 10.9285f, 9.593f, 10.9285f, 9.3851f)
        verticalLineTo(8.18f)
        curveTo(10.9285f, 7.9721f, 11.0971f, 7.8035f, 11.305f, 7.8035f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.PicMarker)
