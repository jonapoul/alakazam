package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
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
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.GeoPackage: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "GeoPackage",
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
          pathFillType = NonZero,
        ) {
          moveTo(17.8261f, 18.7326f)
          curveTo(17.4613f, 19.1822f, 17.122f, 19.6064f, 16.7826f, 20.039f)
          curveTo(16.0615f, 20.9468f, 15.3319f, 21.846f, 14.6193f, 22.7538f)
          curveTo(14.4496f, 22.9659f, 14.3139f, 23.0252f, 14.0594f, 22.881f)
          curveTo(11.4889f, 21.4049f, 8.9184f, 19.9372f, 6.3393f, 18.4611f)
          curveTo(6.246f, 18.4102f, 6.1612f, 18.3338f, 6f, 18.2235f)
          curveTo(7.1877f, 17.0189f, 8.3499f, 15.8397f, 9.5716f, 14.6011f)
          curveTo(8.5111f, 14.6859f, 7.5355f, 14.7622f, 6.5514f, 14.8471f)
          curveTo(6.5345f, 14.7962f, 6.5175f, 14.7453f, 6.5005f, 14.6944f)
          curveTo(8.6638f, 13.4727f, 10.8271f, 12.2511f, 12.9905f, 11.0295f)
          curveTo(13.0159f, 11.0634f, 13.0414f, 11.0889f, 13.0668f, 11.1228f)
          curveTo(12.9989f, 11.2161f, 12.9311f, 11.3179f, 12.8717f, 11.4112f)
          curveTo(12.6257f, 11.8185f, 12.3118f, 12.2087f, 12.1421f, 12.6498f)
          curveTo(11.947f, 13.1589f, 11.6416f, 13.4982f, 11.158f, 13.7357f)
          curveTo(10.7084f, 13.9563f, 10.2842f, 14.2448f, 9.7921f, 14.5332f)
          curveTo(9.9533f, 14.618f, 10.0551f, 14.6859f, 10.1569f, 14.7368f)
          curveTo(12.5663f, 15.9415f, 14.9841f, 17.1376f, 17.3934f, 18.3423f)
          curveTo(17.6819f, 18.4865f, 17.9194f, 18.5035f, 18.2163f, 18.3593f)
          curveTo(20.6426f, 17.1885f, 23.0859f, 16.0433f, 25.5207f, 14.881f)
          curveTo(25.631f, 14.8301f, 25.7413f, 14.7707f, 25.9279f, 14.6774f)
          curveTo(25.1983f, 14.3126f, 24.5281f, 13.9733f, 23.8494f, 13.6509f)
          curveTo(23.5779f, 13.5236f, 23.4252f, 13.3455f, 23.3065f, 13.0571f)
          curveTo(23.1029f, 12.565f, 22.8229f, 12.1069f, 22.5684f, 11.6318f)
          curveTo(22.509f, 11.5215f, 22.4411f, 11.4282f, 22.3818f, 11.3264f)
          curveTo(22.4072f, 11.2925f, 22.4327f, 11.2585f, 22.4581f, 11.2246f)
          curveTo(24.5366f, 12.2596f, 26.6151f, 13.2946f, 28.6935f, 14.3211f)
          curveTo(28.685f, 14.372f, 28.6766f, 14.4229f, 28.6681f, 14.4738f)
          curveTo(27.93f, 14.5586f, 27.1835f, 14.6435f, 26.3181f, 14.7453f)
          curveTo(27.5822f, 15.8057f, 28.7699f, 16.7983f, 29.9915f, 17.8248f)
          curveTo(29.8218f, 17.9351f, 29.7285f, 18.0115f, 29.6182f, 18.0708f)
          curveTo(27.1071f, 19.513f, 24.596f, 20.9383f, 22.0933f, 22.3975f)
          curveTo(21.7625f, 22.5926f, 21.5843f, 22.5247f, 21.3383f, 22.2787f)
          curveTo(20.2863f, 21.1928f, 19.2174f, 20.1323f, 18.1485f, 19.0549f)
          curveTo(18.0636f, 18.9446f, 17.9618f, 18.8598f, 17.8261f, 18.7326f)
          close()
        }
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(17.8262f, 19.4027f)
          curveTo(18.3437f, 19.9032f, 18.8103f, 20.3529f, 19.2769f, 20.811f)
          curveTo(19.9895f, 21.5151f, 20.7021f, 22.2277f, 21.3893f, 22.9488f)
          curveTo(21.5929f, 23.1694f, 21.7456f, 23.1694f, 22.0001f, 23.0252f)
          curveTo(23.1878f, 22.3211f, 24.3924f, 21.6424f, 25.5971f, 20.9552f)
          curveTo(25.7244f, 20.8789f, 25.8601f, 20.8195f, 26.0722f, 20.7261f)
          curveTo(26.0722f, 21.5066f, 26.0807f, 22.2023f, 26.0637f, 22.8979f)
          curveTo(26.0637f, 22.9913f, 25.928f, 23.11f, 25.8262f, 23.1694f)
          curveTo(23.4168f, 24.5607f, 21.0075f, 25.9435f, 18.6067f, 27.3433f)
          curveTo(18.0807f, 27.6487f, 17.6226f, 27.6063f, 17.0966f, 27.3094f)
          curveTo(14.7636f, 25.986f, 12.4221f, 24.6795f, 10.0722f, 23.3815f)
          curveTo(9.7244f, 23.1864f, 9.5886f, 22.9658f, 9.6141f, 22.5756f)
          curveTo(9.648f, 22.0581f, 9.6226f, 21.5406f, 9.6226f, 20.9382f)
          curveTo(9.8516f, 21.057f, 10.0043f, 21.1249f, 10.1401f, 21.2097f)
          curveTo(11.4296f, 21.9902f, 12.7275f, 22.7707f, 14.017f, 23.5597f)
          curveTo(14.28f, 23.7208f, 14.4158f, 23.6954f, 14.6024f, 23.4579f)
          curveTo(15.5526f, 22.2447f, 16.5197f, 21.0485f, 17.4783f, 19.8439f)
          curveTo(17.5717f, 19.6912f, 17.6904f, 19.5554f, 17.8262f, 19.4027f)
          close()
        }
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(22.0594f, 16.0348f)
          curveTo(21.8304f, 15.3561f, 21.245f, 15.6785f, 20.8123f, 15.5682f)
          curveTo(20.5069f, 15.4833f, 20.1761f, 15.4833f, 19.8622f, 15.4664f)
          curveTo(19.7434f, 15.4579f, 19.6077f, 15.4833f, 19.5228f, 15.5512f)
          curveTo(19.4719f, 15.5851f, 19.4634f, 15.7803f, 19.5059f, 15.8142f)
          curveTo(19.5907f, 15.8821f, 19.7349f, 15.916f, 19.8452f, 15.9075f)
          curveTo(20.0743f, 15.8821f, 20.2948f, 15.8227f, 20.5493f, 15.8312f)
          curveTo(20.3118f, 16.3826f, 20.21f, 16.9849f, 19.5992f, 17.2564f)
          curveTo(19.1495f, 17.46f, 18.7084f, 17.6806f, 18.2588f, 17.8927f)
          curveTo(17.6989f, 18.1557f, 17.0965f, 17.9266f, 16.9184f, 17.3497f)
          curveTo(16.7657f, 16.8322f, 16.3839f, 16.7644f, 15.9428f, 16.7135f)
          curveTo(15.1538f, 16.6117f, 14.6957f, 16.2384f, 14.5769f, 15.5427f)
          curveTo(14.4072f, 14.5502f, 15.052f, 13.7357f, 16.07f, 13.617f)
          curveTo(16.2227f, 13.6f, 16.4009f, 13.6763f, 16.5451f, 13.7527f)
          curveTo(16.7063f, 13.8375f, 16.842f, 13.9648f, 16.9862f, 14.0751f)
          curveTo(17.6734f, 14.6435f, 18.1824f, 14.652f, 18.8357f, 14.0411f)
          curveTo(19.0138f, 13.8715f, 19.0562f, 13.5576f, 19.192f, 13.2437f)
          curveTo(19.0902f, 13.2352f, 18.9205f, 13.1758f, 18.8526f, 13.2352f)
          curveTo(18.7169f, 13.3455f, 18.5642f, 13.5152f, 18.5387f, 13.6763f)
          curveTo(18.4624f, 14.0666f, 18.3351f, 14.1684f, 18.0127f, 13.9393f)
          curveTo(17.7837f, 13.7782f, 17.614f, 13.5406f, 17.4274f, 13.337f)
          curveTo(17.105f, 12.9892f, 16.9608f, 12.9977f, 16.6723f, 13.3625f)
          curveTo(16.4348f, 13.6594f, 16.1039f, 13.6594f, 15.7901f, 13.337f)
          curveTo(15.9003f, 13.2522f, 16.0106f, 13.1758f, 16.1379f, 13.0825f)
          curveTo(16.07f, 12.9722f, 16.0021f, 12.8619f, 15.9088f, 12.6923f)
          curveTo(16.0955f, 12.6414f, 16.2566f, 12.6159f, 16.4009f, 12.565f)
          curveTo(16.5451f, 12.5141f, 16.7317f, 12.4632f, 16.7996f, 12.3444f)
          curveTo(16.9862f, 12.0221f, 17.1983f, 12.1069f, 17.4359f, 12.2426f)
          curveTo(17.6395f, 12.3614f, 17.86f, 12.4547f, 18.0297f, 12.2002f)
          curveTo(18.0891f, 12.1154f, 18.0891f, 11.9966f, 18.1146f, 11.8948f)
          curveTo(18.0127f, 11.8778f, 17.9109f, 11.8524f, 17.8176f, 11.8524f)
          curveTo(17.7413f, 11.8524f, 17.6564f, 11.8778f, 17.4953f, 11.9118f)
          curveTo(17.5377f, 11.3179f, 17.9873f, 11.1482f, 18.3351f, 10.8768f)
          curveTo(18.7678f, 10.5459f, 19.175f, 10.9107f, 19.6586f, 10.9362f)
          curveTo(18.9968f, 10.1896f, 16.3585f, 10.0284f, 14.9502f, 11.1822f)
          curveTo(15.0859f, 11.7082f, 14.509f, 12.5735f, 13.8304f, 12.7432f)
          curveTo(13.4231f, 12.8365f, 13.2789f, 13.074f, 13.1601f, 13.3964f)
          curveTo(13.0923f, 13.583f, 13.0329f, 13.7697f, 12.9735f, 13.9563f)
          curveTo(12.8887f, 14.2363f, 12.8547f, 14.4823f, 13.1856f, 14.6689f)
          curveTo(13.3977f, 14.7877f, 13.491f, 15.0083f, 13.2959f, 15.2458f)
          curveTo(13.1177f, 15.4579f, 13.0159f, 15.7633f, 12.6002f, 15.5258f)
          curveTo(11.93f, 15.144f, 11.9131f, 15.1779f, 12.0318f, 14.389f)
          curveTo(12.456f, 11.5724f, 14.7975f, 9.4939f, 17.5462f, 9.477f)
          curveTo(20.4221f, 9.4431f, 22.7975f, 11.4621f, 23.2641f, 14.3126f)
          curveTo(23.4507f, 15.4579f, 23.3235f, 15.653f, 22.0594f, 16.0348f)
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
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.GeoPackage)
