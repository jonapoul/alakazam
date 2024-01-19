package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.Radio: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Radio",
      defaultWidth = 40.0.dp,
      defaultHeight = 41.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 41.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(19.9775f, 12.778f)
        curveTo(21.5455f, 12.778f, 22.8215f, 14.054f, 22.8215f, 15.622f)
        curveTo(22.8215f, 16.9412f, 21.9194f, 18.0533f, 20.7002f, 18.374f)
        lineTo(27.115f, 35.355f)
        lineTo(27.1495f, 35.3731f)
        curveTo(27.4114f, 35.5387f, 27.5473f, 35.8541f, 27.4807f, 36.1646f)
        curveTo(27.4057f, 36.5096f, 27.1007f, 36.7556f, 26.7467f, 36.7556f)
        horizontalLineTo(13.2067f)
        curveTo(12.9607f, 36.7556f, 12.7307f, 36.6346f, 12.5897f, 36.4326f)
        curveTo(12.4507f, 36.2296f, 12.4177f, 35.9706f, 12.5057f, 35.7416f)
        lineTo(19.087f, 18.3242f)
        curveTo(17.9534f, 17.9496f, 17.1325f, 16.88f, 17.1325f, 15.622f)
        curveTo(17.1325f, 14.054f, 18.4095f, 12.778f, 19.9775f, 12.778f)
        close()
        moveTo(15.6237f, 31.7306f)
        lineTo(14.2917f, 35.2556f)
        horizontalLineTo(23.2827f)
        lineTo(15.8337f, 31.8736f)
        curveTo(15.7547f, 31.8366f, 15.6847f, 31.7896f, 15.6237f, 31.7306f)
        close()
        moveTo(23.181f, 29.181f)
        lineTo(18.0537f, 31.2346f)
        lineTo(25.179f, 34.47f)
        lineTo(23.181f, 29.181f)
        close()
        moveTo(18.0967f, 25.1886f)
        lineTo(16.1317f, 30.3876f)
        lineTo(21.7597f, 28.1346f)
        lineTo(18.0967f, 25.1886f)
        close()
        moveTo(27.4846f, 4.7693f)
        curveTo(31.1376f, 7.2213f, 33.3196f, 11.3083f, 33.3196f, 15.7033f)
        curveTo(33.3196f, 20.0823f, 31.1506f, 24.1613f, 27.5186f, 26.6153f)
        curveTo(27.3896f, 26.7023f, 27.2446f, 26.7443f, 27.0996f, 26.7443f)
        curveTo(26.8586f, 26.7443f, 26.6216f, 26.6293f, 26.4776f, 26.4143f)
        curveTo(26.2456f, 26.0713f, 26.3356f, 25.6043f, 26.6786f, 25.3733f)
        curveTo(29.8976f, 23.1973f, 31.8196f, 19.5833f, 31.8196f, 15.7033f)
        curveTo(31.8196f, 11.8093f, 29.8866f, 8.1873f, 26.6486f, 6.0143f)
        curveTo(26.3046f, 5.7843f, 26.2126f, 5.3173f, 26.4436f, 4.9733f)
        curveTo(26.6736f, 4.6303f, 27.1406f, 4.5363f, 27.4846f, 4.7693f)
        close()
        moveTo(19.884f, 20.455f)
        lineTo(18.6547f, 23.7116f)
        lineTo(22.189f, 26.555f)
        lineTo(19.884f, 20.455f)
        close()
        moveTo(14.1f, 4.8456f)
        curveTo(14.323f, 5.1946f, 14.223f, 5.6586f, 13.874f, 5.8816f)
        curveTo(10.509f, 8.0406f, 8.5f, 11.7116f, 8.5f, 15.7036f)
        curveTo(8.5f, 19.3866f, 10.271f, 22.8946f, 13.237f, 25.0856f)
        curveTo(13.571f, 25.3326f, 13.642f, 25.8016f, 13.395f, 26.1346f)
        curveTo(13.248f, 26.3346f, 13.021f, 26.4396f, 12.791f, 26.4396f)
        curveTo(12.637f, 26.4396f, 12.48f, 26.3916f, 12.347f, 26.2936f)
        curveTo(8.999f, 23.8196f, 7.0f, 19.8606f, 7.0f, 15.7036f)
        curveTo(7.0f, 11.1986f, 9.267f, 7.0546f, 13.063f, 4.6196f)
        curveTo(13.414f, 4.3946f, 13.877f, 4.4966f, 14.1f, 4.8456f)
        close()
        moveTo(25.4653f, 7.7601f)
        curveTo(28.1113f, 9.5361f, 29.6913f, 12.4971f, 29.6913f, 15.6801f)
        curveTo(29.6913f, 18.8521f, 28.1213f, 21.8061f, 25.4903f, 23.5831f)
        curveTo(25.3613f, 23.6701f, 25.2163f, 23.7121f, 25.0713f, 23.7121f)
        curveTo(24.8303f, 23.7121f, 24.5933f, 23.5971f, 24.4493f, 23.3821f)
        curveTo(24.2173f, 23.0381f, 24.3073f, 22.5721f, 24.6503f, 22.3411f)
        curveTo(26.8683f, 20.8431f, 28.1913f, 18.3531f, 28.1913f, 15.6801f)
        curveTo(28.1913f, 12.9971f, 26.8593f, 10.5021f, 24.6293f, 9.0051f)
        curveTo(24.2853f, 8.7741f, 24.1933f, 8.3081f, 24.4243f, 7.9641f)
        curveTo(24.6543f, 7.6211f, 25.1213f, 7.5281f, 25.4653f, 7.7601f)
        close()
        moveTo(16.0553f, 7.8782f)
        curveTo(16.2793f, 8.2262f, 16.1783f, 8.6902f, 15.8303f, 8.9142f)
        curveTo(13.5113f, 10.4012f, 12.1283f, 12.9302f, 12.1283f, 15.6802f)
        curveTo(12.1283f, 18.2172f, 13.3473f, 20.6342f, 15.3913f, 22.1432f)
        curveTo(15.7243f, 22.3912f, 15.7953f, 22.8592f, 15.5483f, 23.1932f)
        curveTo(15.4013f, 23.3922f, 15.1743f, 23.4972f, 14.9443f, 23.4972f)
        curveTo(14.7903f, 23.4972f, 14.6333f, 23.4492f, 14.4993f, 23.3512f)
        curveTo(12.0753f, 21.5592f, 10.6283f, 18.6902f, 10.6283f, 15.6802f)
        curveTo(10.6283f, 12.4162f, 12.2693f, 9.4152f, 15.0193f, 7.6512f)
        curveTo(15.3703f, 7.4272f, 15.8333f, 7.5292f, 16.0553f, 7.8782f)
        close()
        moveTo(19.9775f, 14.278f)
        curveTo(19.2365f, 14.278f, 18.6325f, 14.881f, 18.6325f, 15.622f)
        curveTo(18.6325f, 16.363f, 19.2365f, 16.967f, 19.9775f, 16.967f)
        curveTo(20.7185f, 16.967f, 21.3215f, 16.363f, 21.3215f, 15.622f)
        curveTo(21.3215f, 14.881f, 20.7185f, 14.278f, 19.9775f, 14.278f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(19.9775f, 12.778f)
        curveTo(21.5455f, 12.778f, 22.8215f, 14.054f, 22.8215f, 15.622f)
        curveTo(22.8215f, 16.9412f, 21.9194f, 18.0533f, 20.7002f, 18.374f)
        lineTo(27.115f, 35.355f)
        lineTo(27.1495f, 35.3731f)
        curveTo(27.4114f, 35.5387f, 27.5473f, 35.8541f, 27.4807f, 36.1646f)
        curveTo(27.4057f, 36.5096f, 27.1007f, 36.7556f, 26.7467f, 36.7556f)
        horizontalLineTo(13.2067f)
        curveTo(12.9607f, 36.7556f, 12.7307f, 36.6346f, 12.5897f, 36.4326f)
        curveTo(12.4507f, 36.2296f, 12.4177f, 35.9706f, 12.5057f, 35.7416f)
        lineTo(19.087f, 18.3242f)
        curveTo(17.9534f, 17.9496f, 17.1325f, 16.88f, 17.1325f, 15.622f)
        curveTo(17.1325f, 14.054f, 18.4095f, 12.778f, 19.9775f, 12.778f)
        close()
        moveTo(15.6237f, 31.7306f)
        lineTo(14.2917f, 35.2556f)
        horizontalLineTo(23.2827f)
        lineTo(15.8337f, 31.8736f)
        curveTo(15.7547f, 31.8366f, 15.6847f, 31.7896f, 15.6237f, 31.7306f)
        close()
        moveTo(23.181f, 29.181f)
        lineTo(18.0537f, 31.2346f)
        lineTo(25.179f, 34.47f)
        lineTo(23.181f, 29.181f)
        close()
        moveTo(18.0967f, 25.1886f)
        lineTo(16.1317f, 30.3876f)
        lineTo(21.7597f, 28.1346f)
        lineTo(18.0967f, 25.1886f)
        close()
        moveTo(27.4846f, 4.7693f)
        curveTo(31.1376f, 7.2213f, 33.3196f, 11.3083f, 33.3196f, 15.7033f)
        curveTo(33.3196f, 20.0823f, 31.1506f, 24.1613f, 27.5186f, 26.6153f)
        curveTo(27.3896f, 26.7023f, 27.2446f, 26.7443f, 27.0996f, 26.7443f)
        curveTo(26.8586f, 26.7443f, 26.6216f, 26.6293f, 26.4776f, 26.4143f)
        curveTo(26.2456f, 26.0713f, 26.3356f, 25.6043f, 26.6786f, 25.3733f)
        curveTo(29.8976f, 23.1973f, 31.8196f, 19.5833f, 31.8196f, 15.7033f)
        curveTo(31.8196f, 11.8093f, 29.8866f, 8.1873f, 26.6486f, 6.0143f)
        curveTo(26.3046f, 5.7843f, 26.2126f, 5.3173f, 26.4436f, 4.9733f)
        curveTo(26.6736f, 4.6303f, 27.1406f, 4.5363f, 27.4846f, 4.7693f)
        close()
        moveTo(19.884f, 20.455f)
        lineTo(18.6547f, 23.7116f)
        lineTo(22.189f, 26.555f)
        lineTo(19.884f, 20.455f)
        close()
        moveTo(14.1f, 4.8456f)
        curveTo(14.323f, 5.1946f, 14.223f, 5.6586f, 13.874f, 5.8816f)
        curveTo(10.509f, 8.0406f, 8.5f, 11.7116f, 8.5f, 15.7036f)
        curveTo(8.5f, 19.3866f, 10.271f, 22.8946f, 13.237f, 25.0856f)
        curveTo(13.571f, 25.3326f, 13.642f, 25.8016f, 13.395f, 26.1346f)
        curveTo(13.248f, 26.3346f, 13.021f, 26.4396f, 12.791f, 26.4396f)
        curveTo(12.637f, 26.4396f, 12.48f, 26.3916f, 12.347f, 26.2936f)
        curveTo(8.999f, 23.8196f, 7.0f, 19.8606f, 7.0f, 15.7036f)
        curveTo(7.0f, 11.1986f, 9.267f, 7.0546f, 13.063f, 4.6196f)
        curveTo(13.414f, 4.3946f, 13.877f, 4.4966f, 14.1f, 4.8456f)
        close()
        moveTo(25.4653f, 7.7601f)
        curveTo(28.1113f, 9.5361f, 29.6913f, 12.4971f, 29.6913f, 15.6801f)
        curveTo(29.6913f, 18.8521f, 28.1213f, 21.8061f, 25.4903f, 23.5831f)
        curveTo(25.3613f, 23.6701f, 25.2163f, 23.7121f, 25.0713f, 23.7121f)
        curveTo(24.8303f, 23.7121f, 24.5933f, 23.5971f, 24.4493f, 23.3821f)
        curveTo(24.2173f, 23.0381f, 24.3073f, 22.5721f, 24.6503f, 22.3411f)
        curveTo(26.8683f, 20.8431f, 28.1913f, 18.3531f, 28.1913f, 15.6801f)
        curveTo(28.1913f, 12.9971f, 26.8593f, 10.5021f, 24.6293f, 9.0051f)
        curveTo(24.2853f, 8.7741f, 24.1933f, 8.3081f, 24.4243f, 7.9641f)
        curveTo(24.6543f, 7.6211f, 25.1213f, 7.5281f, 25.4653f, 7.7601f)
        close()
        moveTo(16.0553f, 7.8782f)
        curveTo(16.2793f, 8.2262f, 16.1783f, 8.6902f, 15.8303f, 8.9142f)
        curveTo(13.5113f, 10.4012f, 12.1283f, 12.9302f, 12.1283f, 15.6802f)
        curveTo(12.1283f, 18.2172f, 13.3473f, 20.6342f, 15.3913f, 22.1432f)
        curveTo(15.7243f, 22.3912f, 15.7953f, 22.8592f, 15.5483f, 23.1932f)
        curveTo(15.4013f, 23.3922f, 15.1743f, 23.4972f, 14.9443f, 23.4972f)
        curveTo(14.7903f, 23.4972f, 14.6333f, 23.4492f, 14.4993f, 23.3512f)
        curveTo(12.0753f, 21.5592f, 10.6283f, 18.6902f, 10.6283f, 15.6802f)
        curveTo(10.6283f, 12.4162f, 12.2693f, 9.4152f, 15.0193f, 7.6512f)
        curveTo(15.3703f, 7.4272f, 15.8333f, 7.5292f, 16.0553f, 7.8782f)
        close()
        moveTo(19.9775f, 14.278f)
        curveTo(19.2365f, 14.278f, 18.6325f, 14.881f, 18.6325f, 15.622f)
        curveTo(18.6325f, 16.363f, 19.2365f, 16.967f, 19.9775f, 16.967f)
        curveTo(20.7185f, 16.967f, 21.3215f, 16.363f, 21.3215f, 15.622f)
        curveTo(21.3215f, 14.881f, 20.7185f, 14.278f, 19.9775f, 14.278f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Radio)
