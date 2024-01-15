package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val ToolbarTakIcons.GoTo: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "GoTo",
      defaultWidth = 40.0.dp,
      defaultHeight = 41.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 41.0f,
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
        moveTo(20.5245f, 4.5005f)
        curveTo(25.2053f, 4.5005f, 29.4314f, 6.4461f, 32.4382f, 9.5728f)
        curveTo(32.5803f, 9.6286f, 32.7066f, 9.7282f, 32.7951f, 9.8667f)
        curveTo(32.8327f, 9.9255f, 32.8611f, 9.9876f, 32.8806f, 10.0512f)
        curveTo(35.4748f, 12.9696f, 37.0505f, 16.8134f, 37.0505f, 21.0255f)
        curveTo(37.0505f, 23.2902f, 36.5942f, 25.4924f, 35.7208f, 27.5291f)
        curveTo(35.5575f, 27.9098f, 35.1166f, 28.086f, 34.7359f, 27.9228f)
        curveTo(34.3552f, 27.7595f, 34.1789f, 27.3186f, 34.3422f, 26.9379f)
        curveTo(35.1359f, 25.0872f, 35.5505f, 23.086f, 35.5505f, 21.0255f)
        curveTo(35.5505f, 18.6558f, 35.002f, 16.4143f, 34.0249f, 14.421f)
        lineTo(31.5524f, 15.2848f)
        curveTo(31.2751f, 15.3816f, 30.9802f, 15.417f, 30.6873f, 15.3903f)
        lineTo(30.5119f, 15.3667f)
        lineTo(28.2049f, 14.9501f)
        curveTo(27.7708f, 14.8729f, 27.3756f, 14.6575f, 27.0733f, 14.3373f)
        lineTo(26.9497f, 14.1938f)
        lineTo(26.3889f, 13.4743f)
        curveTo(26.2965f, 13.3565f, 26.1609f, 13.2819f, 26.0146f, 13.2655f)
        lineTo(25.9258f, 13.2627f)
        lineTo(23.9918f, 13.3598f)
        curveTo(23.8942f, 13.3646f, 23.8006f, 13.395f, 23.72f, 13.4474f)
        lineTo(23.644f, 13.507f)
        lineTo(22.851f, 14.2499f)
        curveTo(22.7544f, 14.3401f, 22.6942f, 14.462f, 22.6796f, 14.5919f)
        lineTo(22.6774f, 14.6906f)
        lineTo(22.8354f, 16.9595f)
        curveTo(22.8478f, 17.1395f, 22.9478f, 17.3003f, 23.0999f, 17.392f)
        lineTo(23.1801f, 17.4319f)
        lineTo(26.4135f, 18.7326f)
        curveTo(26.5128f, 18.7725f, 26.6195f, 18.7829f, 26.7217f, 18.7641f)
        lineTo(26.822f, 18.7356f)
        lineTo(27.2086f, 18.5837f)
        curveTo(27.7211f, 18.3822f, 28.29f, 18.3956f, 28.7879f, 18.6162f)
        lineTo(28.9511f, 18.6973f)
        lineTo(30.1231f, 19.3454f)
        curveTo(30.7581f, 19.6965f, 31.1558f, 20.3527f, 31.1804f, 21.0698f)
        lineTo(31.1794f, 21.2363f)
        lineTo(31.1303f, 22.3006f)
        curveTo(31.1272f, 22.3627f, 31.1349f, 22.4242f, 31.153f, 22.4837f)
        lineTo(31.188f, 22.5713f)
        lineTo(33.0015f, 26.1983f)
        curveTo(33.1982f, 26.5933f, 33.2628f, 27.0414f, 33.1856f, 27.4758f)
        curveTo(33.1132f, 27.8836f, 32.7239f, 28.1555f, 32.3161f, 28.0831f)
        curveTo(31.9422f, 28.0168f, 31.6826f, 27.6841f, 31.6977f, 27.315f)
        lineTo(31.7087f, 27.2136f)
        curveTo(31.7244f, 27.1253f, 31.7185f, 27.0346f, 31.6923f, 26.9502f)
        lineTo(31.6594f, 26.8681f)
        lineTo(29.8464f, 23.2421f)
        curveTo(29.7149f, 22.9792f, 29.6417f, 22.6935f, 29.6309f, 22.4035f)
        lineTo(29.632f, 22.2291f)
        lineTo(29.681f, 21.1669f)
        curveTo(29.6894f, 20.986f, 29.6102f, 20.8161f, 29.4715f, 20.7072f)
        lineTo(29.3973f, 20.658f)
        lineTo(28.2244f, 20.0096f)
        curveTo(28.1103f, 19.9463f, 27.9781f, 19.9265f, 27.8512f, 19.9521f)
        lineTo(27.7574f, 19.9798f)
        lineTo(27.3689f, 20.1324f)
        curveTo(26.9422f, 20.2989f, 26.4752f, 20.3175f, 26.0391f, 20.1887f)
        lineTo(25.8543f, 20.1245f)
        lineTo(22.6219f, 18.8242f)
        curveTo(21.9401f, 18.5517f, 21.4602f, 17.9362f, 21.3556f, 17.2182f)
        lineTo(21.339f, 17.0628f)
        lineTo(21.1808f, 14.7923f)
        curveTo(21.144f, 14.2374f, 21.3321f, 13.6947f, 21.6979f, 13.2856f)
        lineTo(21.8264f, 13.1544f)
        lineTo(22.6182f, 12.4126f)
        curveTo(22.9283f, 12.1217f, 23.3199f, 11.9362f, 23.7373f, 11.8785f)
        lineTo(23.9176f, 11.8616f)
        lineTo(25.851f, 11.7646f)
        curveTo(26.4616f, 11.7343f, 27.0511f, 11.9777f, 27.4629f, 12.4239f)
        lineTo(27.5707f, 12.5506f)
        lineTo(28.1309f, 13.2693f)
        curveTo(28.1948f, 13.3506f, 28.278f, 13.4115f, 28.372f, 13.4469f)
        lineTo(28.4695f, 13.4736f)
        lineTo(30.7761f, 13.8902f)
        curveTo(30.8398f, 13.9015f, 30.9044f, 13.9019f, 30.9667f, 13.8917f)
        lineTo(31.0578f, 13.8687f)
        lineTo(33.2865f, 13.0901f)
        curveTo(32.8911f, 12.4556f, 32.4497f, 11.8527f, 31.9669f, 11.2861f)
        lineTo(31.2116f, 11.7688f)
        curveTo(30.7736f, 12.0483f, 30.2493f, 12.1531f, 29.7423f, 12.0665f)
        lineTo(29.5533f, 12.0251f)
        lineTo(26.766f, 11.279f)
        curveTo(26.71f, 11.264f, 26.6521f, 11.2576f, 26.594f, 11.26f)
        lineTo(26.5069f, 11.2701f)
        lineTo(24.5392f, 11.6486f)
        curveTo(24.186f, 11.7152f, 23.8234f, 11.6903f, 23.4693f, 11.5703f)
        lineTo(23.2931f, 11.5024f)
        curveTo(22.2739f, 11.0565f, 21.7942f, 9.8923f, 22.1791f, 8.868f)
        lineTo(22.24f, 8.7227f)
        lineTo(22.2878f, 8.619f)
        curveTo(22.606f, 7.9331f, 23.2687f, 7.4775f, 24.0143f, 7.4198f)
        lineTo(24.1752f, 7.4136f)
        horizontalLineTo(25.1612f)
        curveTo(25.2234f, 7.4136f, 25.2844f, 7.4039f, 25.3426f, 7.3849f)
        lineTo(25.4277f, 7.3494f)
        lineTo(26.0292f, 7.0406f)
        curveTo(24.3246f, 6.3692f, 22.4676f, 6.0005f, 20.5245f, 6.0005f)
        curveTo(19.1344f, 6.0005f, 17.7883f, 6.1893f, 16.5107f, 6.5426f)
        lineTo(16.891f, 6.7919f)
        lineTo(19.347f, 7.3339f)
        curveTo(19.9925f, 7.477f, 20.3694f, 8.1358f, 20.1846f, 8.754f)
        lineTo(20.1433f, 8.8693f)
        lineTo(19.7152f, 9.8895f)
        curveTo(19.6078f, 10.1451f, 19.411f, 10.3503f, 19.1614f, 10.4701f)
        lineTo(19.0324f, 10.5228f)
        lineTo(17.787f, 10.9359f)
        lineTo(16.5392f, 13.3451f)
        curveTo(16.4616f, 13.4953f, 16.3514f, 13.6255f, 16.2185f, 13.7258f)
        lineTo(16.1148f, 13.7952f)
        lineTo(13.611f, 15.2883f)
        curveTo(13.5102f, 15.3502f, 13.4021f, 15.394f, 13.2882f, 15.4211f)
        lineTo(13.1726f, 15.4427f)
        lineTo(10.057f, 15.8519f)
        lineTo(10.122f, 16.5709f)
        lineTo(10.7093f, 17.1933f)
        curveTo(10.8857f, 17.3775f, 10.9928f, 17.6155f, 11.016f, 17.867f)
        lineTo(11.0205f, 17.9937f)
        lineTo(11.0106f, 18.4678f)
        curveTo(11.7765f, 18.0818f, 12.748f, 18.2967f, 13.2634f, 19.0443f)
        lineTo(13.678f, 19.6424f)
        curveTo(13.7281f, 19.7146f, 13.8081f, 19.7579f, 13.8948f, 19.7603f)
        lineTo(16.6404f, 19.8333f)
        curveTo(17.2743f, 19.8506f, 17.8514f, 20.2054f, 18.1512f, 20.7633f)
        lineTo(19.0214f, 22.3788f)
        curveTo(19.0688f, 22.4669f, 19.1592f, 22.521f, 19.2589f, 22.521f)
        horizontalLineTo(19.6939f)
        curveTo(20.795f, 22.521f, 21.6284f, 23.5148f, 21.4375f, 24.5991f)
        lineTo(21.1052f, 26.4859f)
        curveTo(21.0239f, 26.941f, 20.7681f, 27.3471f, 20.3906f, 27.6184f)
        lineTo(18.7306f, 28.8034f)
        curveTo(18.6461f, 28.8638f, 18.6031f, 28.9675f, 18.6193f, 29.0665f)
        lineTo(18.6746f, 29.392f)
        curveTo(18.7803f, 30.0228f, 18.5369f, 30.6611f, 18.038f, 31.0644f)
        lineTo(16.7487f, 32.1014f)
        curveTo(16.6898f, 32.1485f, 16.654f, 32.2184f, 16.6497f, 32.297f)
        lineTo(16.6007f, 33.1489f)
        curveTo(16.5392f, 34.2471f, 15.5144f, 34.9961f, 14.4839f, 34.7859f)
        curveTo(16.3324f, 35.5984f, 18.3757f, 36.0495f, 20.5245f, 36.0495f)
        curveTo(21.7878f, 36.0495f, 23.0294f, 35.8943f, 24.2294f, 35.5904f)
        curveTo(24.6309f, 35.4888f, 25.0389f, 35.7318f, 25.1405f, 36.1334f)
        curveTo(25.2422f, 36.5349f, 24.9991f, 36.9429f, 24.5976f, 37.0445f)
        curveTo(23.2774f, 37.3788f, 21.9122f, 37.5495f, 20.5245f, 37.5495f)
        curveTo(11.3983f, 37.5495f, 4.0005f, 30.1517f, 4.0005f, 21.0255f)
        curveTo(4.0005f, 11.8984f, 11.3981f, 4.5005f, 20.5245f, 4.5005f)
        close()
        moveTo(27.744f, 7.845f)
        curveTo(28.9042f, 8.4817f, 29.9711f, 9.2671f, 30.9192f, 10.1755f)
        lineTo(30.4043f, 10.5046f)
        lineTo(30.3184f, 10.5498f)
        curveTo(30.2f, 10.6001f, 30.0673f, 10.61f, 29.9418f, 10.5763f)
        lineTo(27.1541f, 9.8301f)
        lineTo(26.9706f, 9.7897f)
        curveTo(26.7241f, 9.7472f, 26.4713f, 9.7495f, 26.2238f, 9.797f)
        lineTo(24.2585f, 10.1751f)
        lineTo(24.171f, 10.1849f)
        curveTo(24.0832f, 10.1882f, 23.9953f, 10.1721f, 23.9163f, 10.1378f)
        lineTo(23.8262f, 10.0898f)
        curveTo(23.5734f, 9.9284f, 23.4782f, 9.6181f, 23.6016f, 9.3522f)
        lineTo(23.6494f, 9.2485f)
        lineTo(23.6964f, 9.1658f)
        curveTo(23.8029f, 9.0101f, 23.9816f, 8.9136f, 24.1752f, 8.9136f)
        horizontalLineTo(25.1612f)
        lineTo(25.3591f, 8.9042f)
        curveTo(25.6214f, 8.8793f, 25.8768f, 8.8049f, 26.1126f, 8.6838f)
        lineTo(27.7277f, 7.8548f)
        lineTo(27.744f, 7.845f)
        close()
        moveTo(6.6915f, 15.1524f)
        curveTo(8.2209f, 11.5539f, 11.1131f, 8.6747f, 14.7204f, 7.1626f)
        lineTo(16.1235f, 8.0823f)
        lineTo(16.2418f, 8.151f)
        curveTo(16.3245f, 8.1924f, 16.4143f, 8.2246f, 16.5086f, 8.2447f)
        lineTo(18.587f, 8.7019f)
        lineTo(18.397f, 9.1529f)
        lineTo(17.17f, 9.5614f)
        lineTo(17.0526f, 9.6089f)
        curveTo(16.8248f, 9.7153f, 16.6405f, 9.8903f, 16.5255f, 10.1125f)
        lineTo(15.255f, 12.5609f)
        lineTo(12.9f, 13.9649f)
        lineTo(9.5058f, 14.4125f)
        lineTo(9.3882f, 14.4347f)
        curveTo(8.851f, 14.5652f, 8.4815f, 15.0694f, 8.5317f, 15.63f)
        lineTo(8.6407f, 16.8375f)
        lineTo(8.6599f, 16.9639f)
        curveTo(8.7032f, 17.1715f, 8.8033f, 17.3621f, 8.9504f, 17.5144f)
        lineTo(9.517f, 18.1149f)
        lineTo(9.502f, 18.8219f)
        lineTo(7.656f, 17.4519f)
        lineTo(6.7004f, 15.1702f)
        lineTo(6.6915f, 15.1524f)
        close()
        moveTo(5.5005f, 21.0255f)
        curveTo(5.5005f, 19.7391f, 5.6621f, 18.4906f, 5.9661f, 17.299f)
        lineTo(6.306f, 18.11f)
        lineTo(6.3513f, 18.2148f)
        curveTo(6.4233f, 18.3548f, 6.5396f, 18.4929f, 6.6842f, 18.5989f)
        lineTo(8.9704f, 20.2949f)
        lineTo(8.8836f, 20.377f)
        curveTo(8.5955f, 20.6495f, 8.408f, 21.0093f, 8.3492f, 21.4019f)
        lineTo(8.1612f, 22.6536f)
        curveTo(8.0866f, 23.1552f, 8.2299f, 23.6643f, 8.5541f, 24.0526f)
        lineTo(9.3667f, 25.0195f)
        curveTo(9.6217f, 25.3262f, 9.9789f, 25.5383f, 10.3746f, 25.6182f)
        lineTo(12.0541f, 25.9535f)
        curveTo(12.1772f, 25.9783f, 12.2675f, 26.0852f, 12.2712f, 26.212f)
        lineTo(12.3982f, 30.5261f)
        curveTo(12.4016f, 30.6559f, 12.4204f, 30.7878f, 12.4535f, 30.9165f)
        lineTo(13.1177f, 33.4913f)
        curveTo(13.2128f, 33.8602f, 13.4235f, 34.184f, 13.7119f, 34.4198f)
        curveTo(8.8383f, 31.9362f, 5.5005f, 26.8708f, 5.5005f, 21.0255f)
        close()
        moveTo(12.0284f, 19.8956f)
        lineTo(12.4455f, 20.4973f)
        curveTo(12.7677f, 20.9615f, 13.2898f, 21.2441f, 13.8542f, 21.2597f)
        lineTo(16.5999f, 21.3327f)
        curveTo(16.6966f, 21.3354f, 16.7849f, 21.3896f, 16.8302f, 21.474f)
        lineTo(17.7006f, 23.0897f)
        curveTo(18.0091f, 23.6634f, 18.6069f, 24.021f, 19.2589f, 24.021f)
        horizontalLineTo(19.6939f)
        curveTo(19.8623f, 24.021f, 19.9895f, 24.1727f, 19.9602f, 24.339f)
        lineTo(19.6283f, 26.2239f)
        curveTo(19.6159f, 26.2931f, 19.5757f, 26.3569f, 19.5171f, 26.399f)
        lineTo(17.8591f, 27.5826f)
        curveTo(17.3089f, 27.9754f, 17.0304f, 28.647f, 17.1398f, 29.3134f)
        lineTo(17.1955f, 29.6415f)
        curveTo(17.2113f, 29.736f, 17.1739f, 29.8341f, 17.0964f, 29.8967f)
        lineTo(15.8098f, 30.9316f)
        curveTo(15.4187f, 31.2448f, 15.1798f, 31.7106f, 15.152f, 32.2125f)
        lineTo(15.1031f, 33.064f)
        curveTo(15.0927f, 33.2491f, 14.9041f, 33.3693f, 14.7322f, 33.3006f)
        curveTo(14.6523f, 33.2685f, 14.5915f, 33.1994f, 14.5701f, 33.1166f)
        lineTo(13.9061f, 30.5426f)
        lineTo(13.8976f, 30.4843f)
        lineTo(13.7706f, 26.1679f)
        curveTo(13.7463f, 25.3435f, 13.1573f, 24.6458f, 12.3492f, 24.4828f)
        lineTo(10.6697f, 24.1475f)
        curveTo(10.61f, 24.1355f, 10.5555f, 24.1031f, 10.5176f, 24.0575f)
        lineTo(9.7041f, 23.0895f)
        curveTo(9.6555f, 23.0313f, 9.6333f, 22.9523f, 9.6447f, 22.8754f)
        lineTo(9.8326f, 21.6244f)
        curveTo(9.8418f, 21.5629f, 9.8701f, 21.5087f, 9.9142f, 21.4669f)
        lineTo(11.6202f, 19.854f)
        curveTo(11.7411f, 19.7396f, 11.9348f, 19.7598f, 12.0284f, 19.8956f)
        close()
        moveTo(34.0881f, 33.1154f)
        curveTo(34.1042f, 32.9047f, 34.0318f, 32.6885f, 33.8706f, 32.5274f)
        lineTo(31.5166f, 30.1734f)
        lineTo(31.4325f, 30.1007f)
        curveTo(31.1389f, 29.8829f, 30.7222f, 29.9071f, 30.456f, 30.1734f)
        curveTo(30.1631f, 30.4663f, 30.1631f, 30.9411f, 30.456f, 31.234f)
        lineTo(31.5296f, 32.3077f)
        horizontalLineTo(25.5831f)
        lineTo(25.4813f, 32.3145f)
        curveTo(25.1152f, 32.3642f, 24.8331f, 32.678f, 24.8331f, 33.0577f)
        curveTo(24.8331f, 33.4719f, 25.1689f, 33.8077f, 25.5831f, 33.8077f)
        horizontalLineTo(31.6517f)
        lineTo(30.4565f, 35.003f)
        lineTo(30.3838f, 35.0871f)
        curveTo(30.166f, 35.3807f, 30.1902f, 35.7974f, 30.4565f, 36.0636f)
        curveTo(30.7494f, 36.3565f, 31.2242f, 36.3565f, 31.5171f, 36.0636f)
        lineTo(33.8711f, 33.7096f)
        lineTo(33.9437f, 33.6255f)
        curveTo(34.0551f, 33.4754f, 34.1032f, 33.2932f, 34.0881f, 33.1154f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.GoTo)
