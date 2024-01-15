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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RadialTakIcons.BlastRings: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "BlastRings",
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
          moveTo(17.4996f, 13.0111f)
          lineTo(15.5257f, 10.825f)
          lineTo(15.4295f, 10.7311f)
          curveTo(14.7986f, 10.19f, 13.7783f, 10.6572f, 13.8229f, 11.5305f)
          lineTo(13.9731f, 14.4732f)
          lineTo(11.0304f, 14.3231f)
          lineTo(10.896f, 14.3247f)
          curveTo(10.0671f, 14.3882f, 9.676f, 15.4403f, 10.3252f, 16.0262f)
          lineTo(12.5111f, 17.9999f)
          lineTo(10.325f, 19.9749f)
          lineTo(10.2311f, 20.0711f)
          curveTo(9.69f, 20.7021f, 10.1572f, 21.7225f, 11.0304f, 21.6779f)
          lineTo(13.9731f, 21.5266f)
          lineTo(13.8229f, 24.4695f)
          lineTo(13.8245f, 24.6039f)
          curveTo(13.8879f, 25.4328f, 14.9397f, 25.824f, 15.5257f, 25.175f)
          lineTo(17.4996f, 22.9874f)
          lineTo(19.4742f, 25.1748f)
          lineTo(19.5703f, 25.2688f)
          curveTo(20.2013f, 25.8101f, 21.2217f, 25.3429f, 21.1771f, 24.4695f)
          lineTo(21.0261f, 21.5266f)
          lineTo(23.9696f, 21.6779f)
          lineTo(24.104f, 21.6763f)
          curveTo(24.9328f, 21.6128f, 25.3239f, 20.5609f, 24.675f, 19.9749f)
          lineTo(22.4868f, 17.9999f)
          lineTo(24.6748f, 16.0262f)
          lineTo(24.7688f, 15.93f)
          curveTo(25.3101f, 15.299f, 24.8429f, 14.2785f, 23.9696f, 14.3231f)
          lineTo(21.0261f, 14.4719f)
          lineTo(21.1771f, 11.5305f)
          curveTo(21.2241f, 10.6112f, 20.0909f, 10.1418f, 19.4742f, 10.8252f)
          lineTo(17.4996f, 13.0111f)
          close()
          moveTo(15.6361f, 13.5f)
          lineTo(16.6464f, 14.6201f)
          lineTo(16.7674f, 14.7361f)
          curveTo(17.2339f, 15.1229f, 17.9367f, 15.0842f, 18.3558f, 14.6199f)
          lineTo(19.3639f, 13.5015f)
          lineTo(19.2874f, 15.0064f)
          lineTo(19.2897f, 15.1613f)
          curveTo(19.3397f, 15.7706f, 19.867f, 16.247f, 20.4961f, 16.2149f)
          lineTo(22f, 16.1372f)
          lineTo(20.8826f, 17.1462f)
          lineTo(20.7665f, 17.2672f)
          curveTo(20.3796f, 17.7335f, 20.4182f, 18.4363f, 20.8824f, 18.8554f)
          lineTo(22f, 19.8643f)
          lineTo(20.4961f, 19.788f)
          lineTo(20.3411f, 19.7904f)
          curveTo(19.7317f, 19.8404f, 19.2552f, 20.3676f, 19.2874f, 20.9966f)
          lineTo(19.3639f, 22.4985f)
          lineTo(18.3558f, 21.3819f)
          lineTo(18.2349f, 21.2658f)
          curveTo(17.7685f, 20.8789f, 17.0656f, 20.9175f, 16.6464f, 21.3817f)
          lineTo(15.6361f, 22.5f)
          lineTo(15.7136f, 20.9966f)
          lineTo(15.7112f, 20.8417f)
          curveTo(15.6612f, 20.2323f, 15.1339f, 19.7559f, 14.5049f, 19.788f)
          lineTo(13f, 19.8643f)
          lineTo(14.1185f, 18.8554f)
          lineTo(14.2345f, 18.7344f)
          curveTo(14.6214f, 18.268f, 14.5827f, 17.5653f, 14.1183f, 17.1462f)
          lineTo(13f, 16.1372f)
          lineTo(14.5049f, 16.2149f)
          curveTo(15.1863f, 16.2497f, 15.7484f, 15.6877f, 15.7136f, 15.0064f)
          lineTo(15.6361f, 13.5f)
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
          moveTo(17.3776f, 4.5f)
          curveTo(9.9893f, 4.5f, 4f, 10.4893f, 4f, 17.8776f)
          curveTo(4f, 25.2661f, 9.9894f, 31.2559f, 17.3776f, 31.2559f)
          curveTo(24.7659f, 31.2559f, 30.7559f, 25.2659f, 30.7559f, 17.8776f)
          curveTo(30.7559f, 10.4894f, 24.7661f, 4.5f, 17.3776f, 4.5f)
          close()
          moveTo(17.3776f, 6f)
          curveTo(23.9377f, 6f, 29.2559f, 11.3178f, 29.2559f, 17.8776f)
          curveTo(29.2559f, 24.4375f, 23.9375f, 29.7559f, 17.3776f, 29.7559f)
          curveTo(10.8178f, 29.7559f, 5.5f, 24.4377f, 5.5f, 17.8776f)
          curveTo(5.5f, 11.3177f, 10.8177f, 6f, 17.3776f, 6f)
          close()
        }
      }
    }.build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.BlastRings)
