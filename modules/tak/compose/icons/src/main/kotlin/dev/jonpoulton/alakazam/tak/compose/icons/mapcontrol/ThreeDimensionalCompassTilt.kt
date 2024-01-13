package dev.jonpoulton.alakazam.tak.compose.icons.mapcontrol

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.MapControlTakIcons

public val MapControlTakIcons.ThreeDimensionalCompassTilt: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "ThreeDimensionalCompassTilt",
      defaultWidth = 32.0.dp,
      defaultHeight = 42.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 42.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(11.8578f, 8.3765f)
        lineTo(10.5234f, 17.3136f)
        lineTo(12.9652f, 14.2728f)
        lineTo(16.7289f, 15.9874f)
        lineTo(11.8578f, 8.3765f)
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
        moveTo(9.0191f, 21.8184f)
        curveTo(9.3551f, 21.9038f, 9.6111f, 22.0664f, 9.7871f, 22.3064f)
        curveTo(9.9684f, 22.5411f, 10.0591f, 22.8344f, 10.0591f, 23.1864f)
        curveTo(10.0591f, 23.6718f, 9.8804f, 24.0584f, 9.5231f, 24.3464f)
        curveTo(9.1657f, 24.6344f, 8.6831f, 24.7784f, 8.0751f, 24.7784f)
        curveTo(7.7284f, 24.7784f, 7.3951f, 24.7251f, 7.0751f, 24.6184f)
        curveTo(6.7551f, 24.5118f, 6.4831f, 24.3624f, 6.2591f, 24.1704f)
        curveTo(6.1364f, 24.0638f, 6.0751f, 23.9384f, 6.0751f, 23.7944f)
        curveTo(6.0751f, 23.6771f, 6.1071f, 23.5784f, 6.1711f, 23.4984f)
        curveTo(6.2404f, 23.4131f, 6.3204f, 23.3704f, 6.4111f, 23.3704f)
        curveTo(6.4644f, 23.3704f, 6.5124f, 23.3811f, 6.5551f, 23.4024f)
        curveTo(6.5977f, 23.4184f, 6.6564f, 23.4478f, 6.7311f, 23.4904f)
        curveTo(6.9551f, 23.6398f, 7.1684f, 23.7544f, 7.3711f, 23.8344f)
        curveTo(7.5737f, 23.9144f, 7.7951f, 23.9544f, 8.0351f, 23.9544f)
        curveTo(8.3871f, 23.9544f, 8.6484f, 23.8851f, 8.8191f, 23.7464f)
        curveTo(8.9897f, 23.6024f, 9.0751f, 23.3864f, 9.0751f, 23.0984f)
        curveTo(9.0751f, 22.8158f, 8.9844f, 22.6078f, 8.8031f, 22.4744f)
        curveTo(8.6271f, 22.3358f, 8.3524f, 22.2664f, 7.9791f, 22.2664f)
        horizontalLineTo(7.5231f)
        curveTo(7.4004f, 22.2664f, 7.3044f, 22.2264f, 7.2351f, 22.1464f)
        curveTo(7.1711f, 22.0611f, 7.1391f, 21.9651f, 7.1391f, 21.8584f)
        curveTo(7.1391f, 21.7464f, 7.1711f, 21.6504f, 7.2351f, 21.5704f)
        curveTo(7.3044f, 21.4904f, 7.4004f, 21.4504f, 7.5231f, 21.4504f)
        horizontalLineTo(7.8431f)
        curveTo(8.5737f, 21.4504f, 8.9391f, 21.1758f, 8.9391f, 20.6264f)
        curveTo(8.9391f, 20.3704f, 8.8617f, 20.1731f, 8.7071f, 20.0344f)
        curveTo(8.5524f, 19.8958f, 8.3391f, 19.8264f, 8.0671f, 19.8264f)
        curveTo(7.6777f, 19.8264f, 7.2617f, 19.9811f, 6.8191f, 20.2904f)
        curveTo(6.7444f, 20.3331f, 6.6857f, 20.3651f, 6.6431f, 20.3864f)
        curveTo(6.6004f, 20.4024f, 6.5524f, 20.4104f, 6.4991f, 20.4104f)
        curveTo(6.4084f, 20.4104f, 6.3284f, 20.3704f, 6.2591f, 20.2904f)
        curveTo(6.1951f, 20.2051f, 6.1631f, 20.1038f, 6.1631f, 19.9864f)
        curveTo(6.1631f, 19.9064f, 6.1764f, 19.8398f, 6.2031f, 19.7864f)
        curveTo(6.2351f, 19.7278f, 6.2831f, 19.6691f, 6.3471f, 19.6104f)
        curveTo(6.5711f, 19.4238f, 6.8377f, 19.2771f, 7.1471f, 19.1704f)
        curveTo(7.4617f, 19.0584f, 7.7817f, 19.0024f, 8.1071f, 19.0024f)
        curveTo(8.6617f, 19.0024f, 9.1017f, 19.1384f, 9.4271f, 19.4104f)
        curveTo(9.7577f, 19.6824f, 9.9231f, 20.0451f, 9.9231f, 20.4984f)
        curveTo(9.9177f, 20.8078f, 9.8351f, 21.0798f, 9.6751f, 21.3144f)
        curveTo(9.5204f, 21.5438f, 9.3017f, 21.7118f, 9.0191f, 21.8184f)
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
        moveTo(13.2479f, 21.1064f)
        curveTo(13.5999f, 21.1064f, 13.9093f, 21.1838f, 14.1759f, 21.3384f)
        curveTo(14.4479f, 21.4878f, 14.6586f, 21.6984f, 14.8079f, 21.9704f)
        curveTo(14.9573f, 22.2424f, 15.0319f, 22.5544f, 15.0319f, 22.9064f)
        curveTo(15.0319f, 23.2744f, 14.9466f, 23.5998f, 14.7759f, 23.8824f)
        curveTo(14.6106f, 24.1651f, 14.3733f, 24.3864f, 14.0639f, 24.5464f)
        curveTo(13.7599f, 24.7011f, 13.4079f, 24.7784f, 13.0079f, 24.7784f)
        curveTo(12.6773f, 24.7784f, 12.3519f, 24.7251f, 12.0319f, 24.6184f)
        curveTo(11.7173f, 24.5064f, 11.4479f, 24.3571f, 11.2239f, 24.1704f)
        curveTo(11.1013f, 24.0638f, 11.0399f, 23.9384f, 11.0399f, 23.7944f)
        curveTo(11.0399f, 23.6771f, 11.0719f, 23.5784f, 11.1359f, 23.4984f)
        curveTo(11.2053f, 23.4131f, 11.2853f, 23.3704f, 11.3759f, 23.3704f)
        curveTo(11.4293f, 23.3704f, 11.4799f, 23.3811f, 11.5279f, 23.4024f)
        curveTo(11.5759f, 23.4184f, 11.6319f, 23.4478f, 11.6959f, 23.4904f)
        curveTo(11.9093f, 23.6398f, 12.1173f, 23.7544f, 12.3199f, 23.8344f)
        curveTo(12.5226f, 23.9144f, 12.7386f, 23.9544f, 12.9679f, 23.9544f)
        curveTo(13.3199f, 23.9544f, 13.5893f, 23.8664f, 13.7759f, 23.6904f)
        curveTo(13.9626f, 23.5144f, 14.0559f, 23.2638f, 14.0559f, 22.9384f)
        curveTo(14.0559f, 22.6238f, 13.9599f, 22.3758f, 13.7679f, 22.1944f)
        curveTo(13.5813f, 22.0078f, 13.3226f, 21.9144f, 12.9919f, 21.9144f)
        curveTo(12.7839f, 21.9144f, 12.5973f, 21.9438f, 12.4319f, 22.0024f)
        curveTo(12.2719f, 22.0611f, 12.1066f, 22.1598f, 11.9359f, 22.2984f)
        curveTo(11.8346f, 22.3678f, 11.7306f, 22.4024f, 11.6239f, 22.4024f)
        curveTo(11.5173f, 22.4024f, 11.4266f, 22.3704f, 11.3519f, 22.3064f)
        curveTo(11.2773f, 22.2424f, 11.2399f, 22.1571f, 11.2399f, 22.0504f)
        verticalLineTo(19.5544f)
        curveTo(11.2399f, 19.4051f, 11.2826f, 19.2878f, 11.3679f, 19.2024f)
        curveTo(11.4533f, 19.1171f, 11.5733f, 19.0744f, 11.7279f, 19.0744f)
        horizontalLineTo(14.3919f)
        curveTo(14.7119f, 19.0744f, 14.8719f, 19.2078f, 14.8719f, 19.4744f)
        curveTo(14.8719f, 19.7411f, 14.7119f, 19.8744f, 14.3919f, 19.8744f)
        horizontalLineTo(12.2479f)
        verticalLineTo(21.3944f)
        curveTo(12.5199f, 21.2024f, 12.8533f, 21.1064f, 13.2479f, 21.1064f)
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
        moveTo(19.3568f, 23.8824f)
        curveTo(19.6768f, 23.8824f, 19.8368f, 24.0184f, 19.8368f, 24.2904f)
        curveTo(19.8368f, 24.5731f, 19.6768f, 24.7144f, 19.3568f, 24.7144f)
        horizontalLineTo(16.6528f)
        curveTo(16.3275f, 24.7144f, 16.1648f, 24.5731f, 16.1648f, 24.2904f)
        curveTo(16.1648f, 24.0184f, 16.3275f, 23.8824f, 16.6528f, 23.8824f)
        horizontalLineTo(17.4848f)
        verticalLineTo(20.2344f)
        lineTo(16.7168f, 20.7064f)
        curveTo(16.6422f, 20.7491f, 16.5755f, 20.7704f, 16.5168f, 20.7704f)
        curveTo(16.4048f, 20.7704f, 16.3088f, 20.7224f, 16.2288f, 20.6264f)
        curveTo(16.1542f, 20.5304f, 16.1168f, 20.4238f, 16.1168f, 20.3064f)
        curveTo(16.1168f, 20.1518f, 16.1862f, 20.0318f, 16.3248f, 19.9464f)
        lineTo(17.5648f, 19.1784f)
        curveTo(17.7248f, 19.0824f, 17.8768f, 19.0344f, 18.0208f, 19.0344f)
        curveTo(18.1702f, 19.0344f, 18.2902f, 19.0798f, 18.3808f, 19.1704f)
        curveTo(18.4715f, 19.2611f, 18.5168f, 19.3864f, 18.5168f, 19.5464f)
        verticalLineTo(23.8824f)
        horizontalLineTo(19.3568f)
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
        moveTo(21.6097f, 21.4104f)
        curveTo(21.3857f, 21.4104f, 21.183f, 21.3598f, 21.0017f, 21.2584f)
        curveTo(20.8204f, 21.1518f, 20.6764f, 21.0104f, 20.5697f, 20.8344f)
        curveTo(20.463f, 20.6531f, 20.4097f, 20.4504f, 20.4097f, 20.2264f)
        curveTo(20.4097f, 20.0024f, 20.463f, 19.7998f, 20.5697f, 19.6184f)
        curveTo(20.6764f, 19.4371f, 20.8204f, 19.2958f, 21.0017f, 19.1944f)
        curveTo(21.183f, 19.0878f, 21.3857f, 19.0344f, 21.6097f, 19.0344f)
        curveTo(21.8337f, 19.0344f, 22.0364f, 19.0878f, 22.2177f, 19.1944f)
        curveTo(22.4044f, 19.2958f, 22.551f, 19.4371f, 22.6577f, 19.6184f)
        curveTo(22.7644f, 19.7998f, 22.8177f, 20.0024f, 22.8177f, 20.2264f)
        curveTo(22.8177f, 20.4504f, 22.7644f, 20.6531f, 22.6577f, 20.8344f)
        curveTo(22.551f, 21.0104f, 22.4044f, 21.1518f, 22.2177f, 21.2584f)
        curveTo(22.0364f, 21.3598f, 21.8337f, 21.4104f, 21.6097f, 21.4104f)
        close()
        moveTo(21.6097f, 20.8664f)
        curveTo(21.791f, 20.8664f, 21.9404f, 20.8078f, 22.0577f, 20.6904f)
        curveTo(22.175f, 20.5678f, 22.2337f, 20.4131f, 22.2337f, 20.2264f)
        curveTo(22.2337f, 20.0344f, 22.175f, 19.8798f, 22.0577f, 19.7624f)
        curveTo(21.9404f, 19.6398f, 21.791f, 19.5784f, 21.6097f, 19.5784f)
        curveTo(21.4337f, 19.5784f, 21.287f, 19.6398f, 21.1697f, 19.7624f)
        curveTo(21.0524f, 19.8798f, 20.9937f, 20.0344f, 20.9937f, 20.2264f)
        curveTo(20.9937f, 20.4131f, 21.0524f, 20.5678f, 21.1697f, 20.6904f)
        curveTo(21.287f, 20.8078f, 21.4337f, 20.8664f, 21.6097f, 20.8664f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Alert),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(18.766f, 4.5134f)
        curveTo(19.5414f, 4.7369f, 20.2939f, 4.4878f, 20.4469f, 3.9571f)
        lineTo(20.9815f, -3.1737f)
        lineTo(17.6389f, 3.1478f)
        curveTo(17.2871f, 3.8133f, 18.2437f, 4.3355f, 18.766f, 4.5134f)
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
        moveTo(13.75f, 4.7407f)
        curveTo(6.1561f, 4.7407f, 0.0f, 10.8968f, 0.0f, 18.4907f)
        curveTo(0.0f, 26.0846f, 6.1561f, 32.2407f, 13.75f, 32.2407f)
        curveTo(21.3439f, 32.2407f, 27.5f, 26.0846f, 27.5f, 18.4907f)
        curveTo(27.5f, 10.8968f, 21.3439f, 4.7407f, 13.75f, 4.7407f)
        close()
        moveTo(13.75f, 6.2407f)
        curveTo(20.5155f, 6.2407f, 26.0f, 11.7252f, 26.0f, 18.4907f)
        curveTo(26.0f, 25.2562f, 20.5155f, 30.7407f, 13.75f, 30.7407f)
        curveTo(6.9845f, 30.7407f, 1.5f, 25.2562f, 1.5f, 18.4907f)
        curveTo(1.5f, 11.7252f, 6.9845f, 6.2407f, 13.75f, 6.2407f)
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
        moveTo(13.75f, 0.7227f)
        curveTo(14.0064f, 0.7227f, 14.2178f, 0.9639f, 14.2466f, 1.2748f)
        lineTo(14.25f, 1.3477f)
        verticalLineTo(5.0977f)
        curveTo(14.25f, 5.4428f, 14.0261f, 5.7227f, 13.75f, 5.7227f)
        curveTo(13.4936f, 5.7227f, 13.2822f, 5.4814f, 13.2534f, 5.1705f)
        lineTo(13.25f, 5.0977f)
        verticalLineTo(1.3477f)
        curveTo(13.25f, 1.0025f, 13.4739f, 0.7227f, 13.75f, 0.7227f)
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
        moveTo(26.7551f, 18.7227f)
        curveTo(26.7551f, 18.4662f, 26.9964f, 18.2549f, 27.3072f, 18.226f)
        lineTo(27.3801f, 18.2227f)
        horizontalLineTo(31.1301f)
        curveTo(31.4753f, 18.2227f, 31.7551f, 18.4465f, 31.7551f, 18.7227f)
        curveTo(31.7551f, 18.9791f, 31.5139f, 19.1904f, 31.203f, 19.2193f)
        lineTo(31.1301f, 19.2227f)
        horizontalLineTo(27.3801f)
        curveTo(27.0349f, 19.2227f, 26.7551f, 18.9988f, 26.7551f, 18.7227f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
