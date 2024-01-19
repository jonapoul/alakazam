package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.ServerPassword: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "ServerPassword",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(21.7143f, 12.8936f)
        curveTo(21.8971f, 12.701f, 21.976f, 12.5232f, 21.976f, 12.3779f)
        verticalLineTo(8.9312f)
        curveTo(21.5149f, 9.2334f, 21.019f, 9.4776f, 20.4985f, 9.6584f)
        curveTo(19.0232f, 10.1924f, 17.0696f, 10.4871f, 15.0022f, 10.4871f)
        curveTo(12.9354f, 10.4871f, 10.9832f, 10.1924f, 9.5078f, 9.6584f)
        curveTo(8.9874f, 9.4776f, 8.4915f, 9.2334f, 8.0311f, 8.9312f)
        verticalLineTo(12.3779f)
        curveTo(8.0311f, 12.7387f, 8.5174f, 13.3001f, 9.8762f, 13.7912f)
        curveTo(11.2363f, 14.2837f, 13.0595f, 14.5545f, 15.0042f, 14.5545f)
        curveTo(15.3031f, 14.5545f, 15.5991f, 14.5481f, 15.891f, 14.5355f)
        curveTo(15.6789f, 14.8816f, 15.5203f, 15.2512f, 15.4139f, 15.632f)
        curveTo(15.2772f, 15.6346f, 15.1399f, 15.6359f, 15.0022f, 15.6359f)
        curveTo(12.9347f, 15.6359f, 10.9832f, 15.3419f, 9.5078f, 14.8085f)
        curveTo(8.9874f, 14.6271f, 8.4908f, 14.3829f, 8.0311f, 14.0814f)
        verticalLineTo(17.5274f)
        curveTo(8.0311f, 17.8882f, 8.5174f, 18.4489f, 9.8762f, 18.9407f)
        curveTo(11.2363f, 19.4332f, 13.0595f, 19.704f, 15.0042f, 19.704f)
        curveTo(15.4367f, 19.704f, 15.863f, 19.6906f, 16.2796f, 19.6644f)
        curveTo(16.5275f, 19.9526f, 16.8192f, 20.2106f, 17.1536f, 20.4277f)
        curveTo(17.2506f, 20.4802f, 17.3315f, 20.5568f, 17.3881f, 20.6493f)
        curveTo(16.6261f, 20.7385f, 15.8231f, 20.7847f, 15.0022f, 20.7847f)
        curveTo(12.9347f, 20.7847f, 10.9832f, 20.4914f, 9.5078f, 19.9566f)
        curveTo(8.9874f, 19.7759f, 8.4908f, 19.5317f, 8.0311f, 19.2302f)
        verticalLineTo(22.711f)
        curveTo(8.0311f, 23.0732f, 8.5174f, 23.6339f, 9.8755f, 24.1257f)
        curveTo(11.2356f, 24.6174f, 13.0588f, 24.8889f, 15.0035f, 24.8889f)
        curveTo(15.8303f, 24.8919f, 16.6563f, 24.8393f, 17.4752f, 24.7318f)
        curveTo(17.4718f, 24.8675f, 17.4675f, 25.0032f, 17.4621f, 25.1389f)
        curveTo(17.452f, 25.3755f, 17.4531f, 25.6037f, 17.4739f, 25.8215f)
        curveTo(16.6545f, 25.9232f, 15.8291f, 25.9729f, 15.0022f, 25.9701f)
        curveTo(12.9347f, 25.9701f, 10.9832f, 25.6754f, 9.5078f, 25.142f)
        curveTo(7.3947f, 24.3774f, 6.95f, 23.3986f, 6.95f, 22.711f)
        verticalLineTo(7.2286f)
        curveTo(6.95f, 6.5417f, 7.3954f, 5.5629f, 9.5085f, 4.7983f)
        curveTo(10.9839f, 4.2642f, 12.9375f, 3.9702f, 15.0042f, 3.9702f)
        curveTo(17.0717f, 3.9702f, 19.0232f, 4.2642f, 20.4993f, 4.7983f)
        curveTo(22.6117f, 5.5629f, 23.0571f, 6.5417f, 23.0571f, 7.2286f)
        verticalLineTo(13.845f)
        curveTo(23.0542f, 13.8419f, 23.0512f, 13.8388f, 23.0482f, 13.8358f)
        curveTo(22.6524f, 13.4288f, 22.199f, 13.1163f, 21.7143f, 12.8936f)
        close()
        moveTo(15.0028f, 5.051f)
        curveTo(13.0588f, 5.051f, 11.2383f, 5.3225f, 9.8775f, 5.8142f)
        curveTo(8.5188f, 6.3067f, 8.0351f, 6.8674f, 8.0351f, 7.2283f)
        curveTo(8.0351f, 7.5884f, 8.5188f, 8.1498f, 9.8775f, 8.6409f)
        curveTo(11.2383f, 9.134f, 13.0588f, 9.4048f, 15.0028f, 9.4048f)
        curveTo(16.9482f, 9.4048f, 18.7687f, 9.134f, 20.1288f, 8.6409f)
        verticalLineTo(8.6416f)
        curveTo(21.4876f, 8.1498f, 21.9719f, 7.5891f, 21.9719f, 7.2283f)
        curveTo(21.9719f, 6.8674f, 21.4876f, 6.3067f, 20.1288f, 5.8149f)
        curveTo(18.7687f, 5.3225f, 16.9482f, 5.051f, 15.0028f, 5.051f)
        close()
      }
      group {
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(19.08f, 14.6364f)
          curveTo(18.6552f, 15.0612f, 18.6513f, 15.6254f, 19.0733f, 16.0463f)
          curveTo(19.4954f, 16.4673f, 20.059f, 16.4747f, 20.4827f, 16.0576f)
          curveTo(20.9064f, 15.6404f, 20.9099f, 15.0779f, 20.4856f, 14.6536f)
          curveTo(20.0614f, 14.2294f, 19.5026f, 14.2171f, 19.08f, 14.6364f)
          close()
          moveTo(20.0629f, 15.6735f)
          curveTo(19.8779f, 15.8477f, 19.6097f, 15.7938f, 19.4498f, 15.622f)
          curveTo(19.2899f, 15.4502f, 19.3332f, 15.2013f, 19.4895f, 15.0384f)
          curveTo(19.6767f, 14.8414f, 19.9015f, 14.9255f, 20.1194f, 15.0612f)
          curveTo(20.242f, 15.2714f, 20.2323f, 15.5128f, 20.0629f, 15.6735f)
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
          moveTo(16.7275f, 14.5929f)
          curveTo(15.5509f, 16.2656f, 15.918f, 18.7268f, 17.627f, 19.8677f)
          curveTo(17.7141f, 19.9161f, 17.7855f, 19.9885f, 17.8328f, 20.0761f)
          curveTo(17.8802f, 20.1637f, 17.9014f, 20.263f, 17.8941f, 20.362f)
          curveTo(17.8825f, 21.5408f, 17.929f, 22.7203f, 17.8837f, 23.899f)
          curveTo(17.849f, 24.73f, 17.9729f, 25.4415f, 18.7363f, 25.9073f)
          curveTo(18.9337f, 26.1048f, 19.1317f, 26.3027f, 19.3297f, 26.5007f)
          curveTo(19.6663f, 26.8287f, 19.9533f, 26.8332f, 20.2834f, 26.5097f)
          curveTo(20.6627f, 26.138f, 21.0224f, 25.7445f, 21.4143f, 25.3864f)
          curveTo(22.1227f, 24.7389f, 22.2487f, 24.3812f, 21.4503f, 23.7862f)
          curveTo(21.3008f, 23.6746f, 21.2946f, 23.5677f, 21.4303f, 23.4134f)
          curveTo(22.1076f, 22.6481f, 22.1027f, 22.6432f, 21.4159f, 21.8201f)
          curveTo(21.3512f, 21.7424f, 21.2462f, 21.6569f, 21.3556f, 21.565f)
          curveTo(21.7681f, 21.2199f, 21.7142f, 20.7527f, 21.6957f, 20.3002f)
          curveTo(21.6876f, 20.1038f, 21.7769f, 20.0015f, 21.9204f, 19.907f)
          curveTo(22.2767f, 19.669f, 22.5852f, 19.3664f, 22.83f, 19.0148f)
          curveTo(23.8728f, 17.6119f, 23.735f, 15.4991f, 22.5312f, 14.2271f)
          curveTo(20.877f, 12.4776f, 18.0123f, 12.7686f, 16.7275f, 14.5929f)
          close()
          moveTo(22.8304f, 16.4255f)
          curveTo(23.0224f, 17.6997f, 22.3254f, 18.9842f, 21.2396f, 19.5108f)
          curveTo(21.0532f, 19.6004f, 20.9716f, 19.7136f, 20.9993f, 19.9198f)
          curveTo(21.0153f, 20.0321f, 20.9885f, 20.1481f, 21.0056f, 20.2616f)
          curveTo(21.0719f, 20.725f, 20.9502f, 21.1044f, 20.5539f, 21.3801f)
          curveTo(20.3199f, 21.5422f, 20.2975f, 21.7006f, 20.5335f, 21.9182f)
          curveTo(20.7695f, 22.1358f, 21.1644f, 22.3326f, 21.1501f, 22.6429f)
          curveTo(21.1399f, 22.9217f, 20.7694f, 23.1215f, 20.5356f, 23.327f)
          curveTo(20.3017f, 23.5326f, 20.3504f, 23.671f, 20.5527f, 23.8701f)
          curveTo(21.2554f, 24.563f, 21.2505f, 24.5679f, 20.559f, 25.2594f)
          lineTo(20.4508f, 25.3676f)
          curveTo(19.8015f, 26.017f, 19.8015f, 26.017f, 19.0944f, 25.3099f)
          curveTo(18.6321f, 25.064f, 18.5609f, 24.5783f, 18.5735f, 24.0055f)
          curveTo(18.6036f, 22.6494f, 18.5703f, 21.2893f, 18.5793f, 19.9347f)
          curveTo(18.5884f, 19.8431f, 18.568f, 19.7508f, 18.521f, 19.6714f)
          curveTo(18.4741f, 19.5919f, 18.403f, 19.5294f, 18.3183f, 19.493f)
          curveTo(16.4685f, 18.4732f, 16.1242f, 16.01f, 17.6551f, 14.5725f)
          curveTo(18.5557f, 13.7275f, 19.6465f, 13.4851f, 20.8216f, 13.9232f)
          curveTo(21.9771f, 14.3461f, 22.6449f, 15.2011f, 22.8304f, 16.4255f)
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
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.ServerPassword)
