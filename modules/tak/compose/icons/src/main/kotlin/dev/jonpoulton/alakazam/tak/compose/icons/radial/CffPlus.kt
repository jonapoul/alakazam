package dev.jonpoulton.alakazam.tak.compose.icons.radial

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RadialTakIcons.CffPlus: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "CffPlus",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(24.7312f, 20.7753f)
        curveTo(25.1109f, 20.7753f, 25.4247f, 21.0574f, 25.4744f, 21.4235f)
        lineTo(25.4812f, 21.5253f)
        verticalLineTo(27.2128f)
        curveTo(25.4812f, 27.627f, 25.1454f, 27.9628f, 24.7312f, 27.9628f)
        curveTo(24.3515f, 27.9628f, 24.0377f, 27.6806f, 23.988f, 27.3145f)
        lineTo(23.9812f, 27.2128f)
        verticalLineTo(21.5253f)
        curveTo(23.9812f, 21.111f, 24.317f, 20.7753f, 24.7312f, 20.7753f)
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
        moveTo(27.4495f, 23.619f)
        curveTo(27.8637f, 23.619f, 28.1995f, 23.9548f, 28.1995f, 24.369f)
        curveTo(28.1995f, 24.7487f, 27.9174f, 25.0625f, 27.5513f, 25.1122f)
        lineTo(27.4495f, 25.119f)
        horizontalLineTo(22.0129f)
        curveTo(21.5987f, 25.119f, 21.2629f, 24.7832f, 21.2629f, 24.369f)
        curveTo(21.2629f, 23.9893f, 21.5451f, 23.6755f, 21.9112f, 23.6259f)
        lineTo(22.0129f, 23.619f)
        horizontalLineTo(27.4495f)
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
        moveTo(15.9193f, 3.5002f)
        lineTo(16.0404f, 3.5086f)
        curveTo(16.4021f, 3.5512f, 16.7723f, 3.7498f, 17.1686f, 4.0696f)
        curveTo(17.8876f, 4.6499f, 18.6854f, 5.6369f, 19.3615f, 6.8118f)
        curveTo(20.6857f, 9.1128f, 21.3879f, 11.7475f, 21.2165f, 14.4105f)
        lineTo(21.1958f, 14.6553f)
        lineTo(21.2164f, 14.6279f)
        curveTo(21.6658f, 13.9717f, 22.0838f, 13.2955f, 22.3336f, 12.8096f)
        lineTo(22.4191f, 12.6367f)
        curveTo(22.783f, 11.8665f, 23.4286f, 11.4874f, 24.1443f, 11.828f)
        curveTo(24.5871f, 12.0387f, 24.9422f, 12.4958f, 25.2889f, 13.1763f)
        curveTo(25.7913f, 14.1625f, 26.275f, 15.6686f, 26.5996f, 17.1867f)
        lineTo(26.6774f, 17.5662f)
        lineTo(25.2054f, 17.8547f)
        curveTo(24.908f, 16.3373f, 24.4252f, 14.7854f, 23.9523f, 13.8573f)
        curveTo(23.8834f, 13.7219f, 23.8166f, 13.6049f, 23.7561f, 13.508f)
        lineTo(23.7018f, 13.4243f)
        lineTo(23.6778f, 13.4752f)
        curveTo(23.2903f, 14.2326f, 22.5828f, 15.3329f, 21.9096f, 16.2401f)
        lineTo(21.7271f, 16.4824f)
        curveTo(21.3098f, 17.0277f, 20.9647f, 17.4192f, 20.7f, 17.6235f)
        curveTo(20.2888f, 17.9407f, 19.8576f, 18.075f, 19.4461f, 17.5612f)
        curveTo(19.2228f, 17.2823f, 19.2132f, 17.033f, 19.2998f, 16.6789f)
        lineTo(19.3365f, 16.5409f)
        curveTo(20.2084f, 13.4723f, 19.6183f, 10.2654f, 18.0615f, 7.5599f)
        curveTo(17.5256f, 6.6288f, 16.9126f, 5.8461f, 16.3828f, 5.3703f)
        lineTo(16.2528f, 5.2593f)
        lineTo(16.2253f, 5.3992f)
        curveTo(15.8157f, 7.2845f, 14.7725f, 8.8127f, 12.7111f, 11.0125f)
        lineTo(11.3054f, 12.4891f)
        curveTo(10.3992f, 13.4512f, 9.8464f, 14.0955f, 9.3229f, 14.8238f)
        curveTo(8.1117f, 16.508f, 7.5f, 18.1632f, 7.5f, 20.1067f)
        curveTo(7.5f, 25.0703f, 11.5229f, 29.0935f, 16.4868f, 29.0935f)
        curveTo(17.6711f, 29.0935f, 18.8217f, 28.8646f, 19.8913f, 28.4264f)
        lineTo(20.2447f, 28.2726f)
        lineTo(20.8728f, 29.6348f)
        curveTo(19.5091f, 30.2635f, 18.0206f, 30.5935f, 16.4868f, 30.5935f)
        curveTo(10.6945f, 30.5935f, 6f, 25.8987f, 6f, 20.1067f)
        curveTo(6f, 17.8241f, 6.7214f, 15.872f, 8.105f, 13.9481f)
        lineTo(8.3892f, 13.5638f)
        curveTo(8.8702f, 12.9315f, 9.401f, 12.3246f, 10.1725f, 11.5041f)
        lineTo(11.3497f, 10.2694f)
        curveTo(13.6666f, 7.8345f, 14.6233f, 6.3836f, 14.8659f, 4.4535f)
        curveTo(14.9387f, 3.8774f, 15.3633f, 3.4905f, 15.9193f, 3.5002f)
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
        moveTo(15.7781f, 15.8676f)
        curveTo(16.0475f, 15.8995f, 16.293f, 16.0314f, 16.5461f, 16.2358f)
        curveTo(16.9554f, 16.5664f, 17.3956f, 17.1111f, 17.766f, 17.7549f)
        curveTo(18.2873f, 18.6611f, 18.6313f, 19.6635f, 18.7452f, 20.6998f)
        lineTo(18.7549f, 20.8163f)
        lineTo(20.0616f, 21.4333f)
        curveTo(19.8734f, 21.8318f, 19.4836f, 22.4489f, 19.104f, 22.9668f)
        lineTo(18.9626f, 23.1557f)
        curveTo(18.7283f, 23.4618f, 18.5347f, 23.6814f, 18.3651f, 23.8121f)
        curveTo(18.2738f, 23.8826f, 18.1813f, 23.9371f, 18.0623f, 23.9742f)
        curveTo(17.7761f, 24.0633f, 17.4408f, 24.0046f, 17.2124f, 23.7188f)
        curveTo(17.0046f, 23.4586f, 16.9938f, 23.2553f, 17.0618f, 22.9754f)
        lineTo(17.0907f, 22.8665f)
        curveTo(17.5122f, 21.3827f, 17.2252f, 19.8229f, 16.4658f, 18.503f)
        curveTo(16.3594f, 18.318f, 16.2471f, 18.1458f, 16.135f, 17.992f)
        lineTo(16.0219f, 17.8433f)
        lineTo(15.9896f, 17.935f)
        curveTo(15.6986f, 18.6829f, 15.1856f, 19.3761f, 14.3649f, 20.2611f)
        lineTo(13.7786f, 20.8784f)
        curveTo(12.2273f, 22.5005f, 11.6814f, 23.4035f, 11.6814f, 24.8091f)
        curveTo(11.6814f, 25.7722f, 12.3955f, 26.8273f, 13.6042f, 27.7801f)
        curveTo(14.4727f, 28.4647f, 15.5642f, 29.024f, 15.9099f, 29.0875f)
        lineTo(15.9658f, 29.0935f)
        verticalLineTo(30.5935f)
        curveTo(14.0861f, 30.5935f, 10.1814f, 27.5155f, 10.1814f, 24.8091f)
        curveTo(10.1814f, 22.9869f, 10.8348f, 21.8268f, 12.466f, 20.0832f)
        lineTo(13.0467f, 19.4734f)
        curveTo(14.1949f, 18.2668f, 14.6555f, 17.5685f, 14.7688f, 16.6708f)
        curveTo(14.8286f, 16.1951f, 15.1989f, 15.8572f, 15.6682f, 15.8606f)
        lineTo(15.7781f, 15.8676f)
        close()
      }
    }.build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.CffPlus)
