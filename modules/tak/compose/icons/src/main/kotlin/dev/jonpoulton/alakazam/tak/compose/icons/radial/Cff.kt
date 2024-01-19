package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.runtime.Composable
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
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.Cff: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Cff",
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
          moveTo(21.76f, 3.7493f)
          curveTo(22.2329f, 3.2254f, 23.1018f, 3.5853f, 23.0658f, 4.2901f)
          lineTo(22.6932f, 11.5652f)
          lineTo(29.969f, 11.1934f)
          curveTo(30.6387f, 11.1592f, 30.9969f, 11.9416f, 30.5818f, 12.4254f)
          lineTo(30.5098f, 12.4991f)
          lineTo(25.1022f, 17.3782f)
          lineTo(30.5099f, 22.2609f)
          curveTo(31.0075f, 22.7102f, 30.7076f, 23.5168f, 30.072f, 23.5654f)
          lineTo(29.969f, 23.5666f)
          lineTo(22.6932f, 23.1932f)
          lineTo(23.0658f, 30.4684f)
          curveTo(23.1f, 31.138f, 22.3175f, 31.4962f, 21.8338f, 31.0812f)
          lineTo(21.76f, 31.0092f)
          lineTo(16.8792f, 25.6032f)
          lineTo(11.999f, 31.0092f)
          curveTo(11.5497f, 31.5069f, 10.7431f, 31.207f, 10.6945f, 30.5715f)
          lineTo(10.6932f, 30.4684f)
          lineTo(11.0642f, 23.1942f)
          lineTo(3.79f, 23.5666f)
          curveTo(3.1204f, 23.6009f, 2.7621f, 22.8185f, 3.1771f, 22.3347f)
          lineTo(3.2491f, 22.2609f)
          lineTo(8.6562f, 17.3792f)
          lineTo(3.2492f, 12.4991f)
          curveTo(2.7515f, 12.0499f, 3.0513f, 11.2433f, 3.6869f, 11.1946f)
          lineTo(3.79f, 11.1934f)
          lineTo(11.0642f, 11.5652f)
          lineTo(10.6932f, 4.2901f)
          curveTo(10.659f, 3.6205f, 11.4414f, 3.2623f, 11.9252f, 3.6772f)
          lineTo(11.999f, 3.7492f)
          lineTo(16.8792f, 9.1542f)
          lineTo(21.76f, 3.7493f)
          close()
          moveTo(21.4592f, 6.3202f)
          lineTo(17.4366f, 10.7772f)
          curveTo(17.1388f, 11.1072f, 16.621f, 11.1072f, 16.3232f, 10.7773f)
          lineTo(12.2982f, 6.3202f)
          lineTo(12.6052f, 12.318f)
          curveTo(12.6261f, 12.7277f, 12.3158f, 13.0712f, 11.9188f, 13.1037f)
          lineTo(11.8179f, 13.1053f)
          lineTo(5.8202f, 12.7992f)
          lineTo(10.2779f, 16.8225f)
          curveTo(10.5803f, 17.0955f, 10.6055f, 17.5533f, 10.3535f, 17.8571f)
          lineTo(10.2779f, 17.9359f)
          lineTo(5.8202f, 21.9602f)
          lineTo(11.8178f, 21.654f)
          curveTo(12.2275f, 21.633f, 12.571f, 21.9433f, 12.6036f, 22.3403f)
          lineTo(12.6052f, 22.4412f)
          lineTo(12.2982f, 28.4382f)
          lineTo(16.3232f, 23.9812f)
          curveTo(16.5962f, 23.6788f, 17.054f, 23.6536f, 17.3578f, 23.9056f)
          lineTo(17.4366f, 23.9812f)
          lineTo(21.4592f, 28.4372f)
          lineTo(21.1539f, 22.4412f)
          curveTo(21.1329f, 22.0315f, 21.4433f, 21.688f, 21.8403f, 21.6555f)
          lineTo(21.9412f, 21.654f)
          lineTo(27.9382f, 21.9602f)
          lineTo(23.4811f, 17.9359f)
          curveTo(23.1787f, 17.6629f, 23.1535f, 17.2051f, 23.4055f, 16.9013f)
          lineTo(23.4812f, 16.8225f)
          lineTo(27.9382f, 12.7992f)
          lineTo(21.9411f, 13.1053f)
          curveTo(21.5314f, 13.1262f, 21.188f, 12.8159f, 21.1554f, 12.4189f)
          lineTo(21.1539f, 12.318f)
          lineTo(21.4592f, 6.3202f)
          close()
          moveTo(18.3932f, 11.8782f)
          curveTo(18.8661f, 11.3543f, 19.735f, 11.7141f, 19.699f, 12.419f)
          lineTo(19.5832f, 14.6742f)
          lineTo(21.8401f, 14.5601f)
          curveTo(22.5098f, 14.5259f, 22.868f, 15.3084f, 22.4529f, 15.7922f)
          lineTo(22.3809f, 15.8659f)
          lineTo(20.7032f, 17.3792f)
          lineTo(22.381f, 18.8934f)
          curveTo(22.8786f, 19.3427f, 22.5787f, 20.1492f, 21.9432f, 20.1979f)
          lineTo(21.8401f, 20.1991f)
          lineTo(19.5832f, 20.0832f)
          lineTo(19.699f, 22.3395f)
          curveTo(19.7332f, 23.0091f, 18.9507f, 23.3673f, 18.467f, 22.9523f)
          lineTo(18.3932f, 22.8803f)
          lineTo(16.8792f, 21.2032f)
          lineTo(15.3657f, 22.8804f)
          curveTo(14.9164f, 23.378f, 14.1099f, 23.0781f, 14.0612f, 22.4426f)
          lineTo(14.06f, 22.3395f)
          lineTo(14.1752f, 20.0832f)
          lineTo(11.9189f, 20.1991f)
          curveTo(11.2493f, 20.2333f, 10.8911f, 19.451f, 11.306f, 18.9672f)
          lineTo(11.378f, 18.8934f)
          lineTo(13.0542f, 17.3792f)
          lineTo(11.3781f, 15.8659f)
          curveTo(10.8804f, 15.4167f, 11.1802f, 14.61f, 11.8158f, 14.5614f)
          lineTo(11.9189f, 14.5601f)
          lineTo(14.1752f, 14.6752f)
          lineTo(14.06f, 12.419f)
          curveTo(14.0258f, 11.7494f, 14.8081f, 11.3912f, 15.2919f, 11.8061f)
          lineTo(15.3657f, 11.8781f)
          lineTo(16.8792f, 13.5542f)
          lineTo(18.3932f, 11.8782f)
          close()
          moveTo(15.6652f, 14.4472f)
          lineTo(15.7156f, 15.4285f)
          curveTo(15.7383f, 15.8723f, 15.3722f, 16.2384f, 14.9284f, 16.2158f)
          lineTo(13.9482f, 16.1652f)
          lineTo(14.6766f, 16.8225f)
          curveTo(14.979f, 17.0955f, 15.0043f, 17.5533f, 14.7523f, 17.8571f)
          lineTo(14.6767f, 17.9359f)
          lineTo(13.9482f, 18.5932f)
          lineTo(14.9284f, 18.5435f)
          curveTo(15.3381f, 18.5226f, 15.6815f, 18.8329f, 15.7141f, 19.2299f)
          lineTo(15.7156f, 19.3308f)
          lineTo(15.6652f, 20.3102f)
          lineTo(16.3232f, 19.5817f)
          curveTo(16.5963f, 19.2793f, 17.0541f, 19.2541f, 17.3579f, 19.5061f)
          lineTo(17.4366f, 19.5818f)
          lineTo(18.0932f, 20.3092f)
          lineTo(18.0434f, 19.3308f)
          curveTo(18.0224f, 18.9211f, 18.3328f, 18.5776f, 18.7297f, 18.545f)
          lineTo(18.8306f, 18.5435f)
          lineTo(19.8102f, 18.5932f)
          lineTo(19.0823f, 17.9359f)
          curveTo(18.7799f, 17.6629f, 18.7548f, 17.2051f, 19.0068f, 16.9013f)
          lineTo(19.0824f, 16.8225f)
          lineTo(19.8102f, 16.1652f)
          lineTo(18.8306f, 16.2158f)
          curveTo(18.4209f, 16.2367f, 18.0775f, 15.9264f, 18.0449f, 15.5294f)
          lineTo(18.0434f, 15.4285f)
          lineTo(18.0932f, 14.4482f)
          lineTo(17.4366f, 15.1767f)
          curveTo(17.1637f, 15.4792f, 16.7058f, 15.5044f, 16.402f, 15.2524f)
          lineTo(16.3232f, 15.1768f)
          lineTo(15.6652f, 14.4472f)
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
          moveTo(34.1782f, -0.3218f)
          horizontalLineTo(0.1782f)
          verticalLineTo(33.6782f)
          horizontalLineTo(34.1782f)
          verticalLineTo(-0.3218f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.Cff)
