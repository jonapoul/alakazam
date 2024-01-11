package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

val SideMenuTakIcons.Id: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Id",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(6f, 9f)
        curveTo(5.4477f, 9f, 5f, 9.4477f, 5f, 10f)
        verticalLineTo(26f)
        curveTo(5f, 26.5523f, 5.4477f, 27f, 6f, 27f)
        horizontalLineTo(28f)
        curveTo(28.5523f, 27f, 29f, 26.5523f, 29f, 26f)
        verticalLineTo(10f)
        curveTo(29f, 9.4477f, 28.5523f, 9f, 28f, 9f)
        horizontalLineTo(6f)
        close()
        moveTo(16.0482f, 14.6632f)
        curveTo(16.0482f, 11.8689f, 15.0687f, 11f, 12.9136f, 11f)
        curveTo(10.7582f, 11f, 9.7781f, 11.869f, 9.7781f, 14.6632f)
        curveTo(9.7781f, 15.7358f, 10.0805f, 16.5826f, 10.6121f, 17.1972f)
        curveTo(10.52f, 17.2208f, 10.4308f, 17.2622f, 10.3493f, 17.3221f)
        lineTo(8.4712f, 18.7034f)
        lineTo(8.3349f, 18.8123f)
        curveTo(7.3644f, 19.6528f, 7.0244f, 21.4146f, 7.0001f, 23.7307f)
        curveTo(6.9934f, 24.4327f, 7.5548f, 25f, 8.2479f, 25f)
        horizontalLineTo(17.5445f)
        lineTo(17.6727f, 24.9935f)
        curveTo(18.305f, 24.9285f, 18.7977f, 24.3885f, 18.7914f, 23.7313f)
        curveTo(18.766f, 21.3094f, 18.3956f, 19.4938f, 17.3201f, 18.7033f)
        lineTo(15.4422f, 17.3221f)
        lineTo(15.3454f, 17.2614f)
        curveTo(15.301f, 17.2379f, 15.255f, 17.2192f, 15.2081f, 17.2077f)
        curveTo(15.7442f, 16.5883f, 16.0482f, 15.7385f, 16.0482f, 14.6632f)
        close()
        moveTo(24.8065f, 23.8805f)
        curveTo(24.8065f, 23.4521f, 24.4623f, 23.1047f, 24.0378f, 23.1047f)
        horizontalLineTo(21.3626f)
        lineTo(21.2583f, 23.1118f)
        curveTo(20.8831f, 23.1632f, 20.594f, 23.4878f, 20.594f, 23.8805f)
        curveTo(20.594f, 24.309f, 20.9381f, 24.6563f, 21.3626f, 24.6563f)
        horizontalLineTo(24.0378f)
        lineTo(24.1421f, 24.6492f)
        curveTo(24.5173f, 24.5979f, 24.8065f, 24.2733f, 24.8065f, 23.8805f)
        close()
        moveTo(11.5678f, 18.0157f)
        lineTo(11.5687f, 17.9525f)
        curveTo(12.0653f, 18.2111f, 12.5774f, 18.3264f, 12.9136f, 18.3264f)
        lineTo(12.9542f, 18.3254f)
        curveTo(13.3255f, 18.3058f, 13.7761f, 18.1997f, 14.2211f, 17.9703f)
        curveTo(14.2276f, 18.2023f, 14.3366f, 18.4289f, 14.5368f, 18.5761f)
        lineTo(16.415f, 19.9574f)
        lineTo(16.4863f, 20.0186f)
        curveTo(16.9062f, 20.4314f, 17.1769f, 21.6597f, 17.2407f, 23.2166f)
        lineTo(17.2483f, 23.448f)
        horizontalLineTo(8.5422f)
        lineTo(8.5508f, 23.2161f)
        curveTo(8.6181f, 21.5732f, 8.9159f, 20.2959f, 9.3764f, 19.9575f)
        lineTo(11.2547f, 18.5761f)
        lineTo(11.3415f, 18.5018f)
        curveTo(11.4752f, 18.3693f, 11.5524f, 18.1956f, 11.5678f, 18.0157f)
        close()
        moveTo(26.4834f, 20.1523f)
        curveTo(26.4834f, 19.7239f, 26.1393f, 19.3765f, 25.7148f, 19.3765f)
        horizontalLineTo(21.3626f)
        lineTo(21.2583f, 19.3836f)
        curveTo(20.8831f, 19.435f, 20.594f, 19.7596f, 20.594f, 20.1523f)
        curveTo(20.594f, 20.5808f, 20.9381f, 20.9281f, 21.3626f, 20.9281f)
        horizontalLineTo(25.7148f)
        lineTo(25.8191f, 20.921f)
        curveTo(26.1943f, 20.8697f, 26.4834f, 20.5451f, 26.4834f, 20.1523f)
        close()
        moveTo(25.0661f, 16.4233f)
        curveTo(25.0661f, 15.9949f, 24.7219f, 15.6475f, 24.2974f, 15.6475f)
        horizontalLineTo(21.3626f)
        lineTo(21.2583f, 15.6546f)
        curveTo(20.8831f, 15.706f, 20.594f, 16.0306f, 20.594f, 16.4233f)
        curveTo(20.594f, 16.8518f, 20.9381f, 17.1991f, 21.3626f, 17.1991f)
        horizontalLineTo(24.2974f)
        lineTo(24.4017f, 17.192f)
        curveTo(24.7769f, 17.1407f, 25.0661f, 16.8161f, 25.0661f, 16.4233f)
        close()
        moveTo(11.3195f, 14.2833f)
        curveTo(11.3568f, 12.7432f, 11.6623f, 12.5516f, 12.9136f, 12.5516f)
        lineTo(13.1858f, 12.5555f)
        curveTo(14.2952f, 12.5918f, 14.5109f, 12.9086f, 14.5109f, 14.6632f)
        curveTo(14.5109f, 16.1171f, 13.7934f, 16.6793f, 13.0005f, 16.7662f)
        lineTo(12.8867f, 16.7753f)
        curveTo(12.7893f, 16.7748f, 12.4236f, 16.6826f, 12.1163f, 16.4818f)
        curveTo(11.6139f, 16.1534f, 11.3154f, 15.6003f, 11.3154f, 14.6632f)
        lineTo(11.3195f, 14.2833f)
        close()
        moveTo(27f, 12.6952f)
        curveTo(27f, 12.2667f, 26.6559f, 11.9194f, 26.2314f, 11.9194f)
        horizontalLineTo(21.3626f)
        lineTo(21.2583f, 11.9265f)
        curveTo(20.8831f, 11.9779f, 20.594f, 12.3025f, 20.594f, 12.6952f)
        curveTo(20.594f, 13.1237f, 20.9381f, 13.471f, 21.3626f, 13.471f)
        horizontalLineTo(26.2314f)
        lineTo(26.3357f, 13.4639f)
        curveTo(26.7108f, 13.4125f, 27f, 13.088f, 27f, 12.6952f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
