package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.HandleShade: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "HandleShade",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Bronze),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(7.5527f, 24.3066f)
        curveTo(7.8008f, 24.5406f, 8.1218f, 24.8489f, 8.4428f, 25.1572f)
        curveTo(8.9571f, 25.6512f, 9.4714f, 26.1451f, 9.6857f, 26.3333f)
        horizontalLineTo(9.7714f)
        curveTo(9.8297f, 26.2859f, 9.8906f, 26.2407f, 9.9516f, 26.1956f)
        curveTo(10.0849f, 26.0969f, 10.2183f, 25.9981f, 10.3242f, 25.8752f)
        curveTo(10.6508f, 25.4945f, 11.0253f, 25.2903f, 11.5404f, 25.2755f)
        curveTo(12.4507f, 25.2503f, 13.2221f, 24.9357f, 13.894f, 24.2394f)
        curveTo(14.4015f, 23.7138f, 14.9105f, 23.1897f, 15.4206f, 22.6666f)
        horizontalLineTo(27.0879f)
        curveTo(27.6269f, 22.6666f, 28.0998f, 23.0327f, 28.2441f, 23.5617f)
        lineTo(30f, 30f)
        horizontalLineTo(6f)
        lineTo(7.5527f, 24.3066f)
        close()
        moveTo(20.2589f, 27.8423f)
        curveTo(20.2589f, 28.0012f, 20.1325f, 28.1299f, 19.9765f, 28.1299f)
        horizontalLineTo(16.0236f)
        curveTo(15.8676f, 28.1299f, 15.7412f, 28.0012f, 15.7412f, 27.8423f)
        curveTo(15.7412f, 27.6835f, 15.8676f, 27.5548f, 16.0236f, 27.5548f)
        horizontalLineTo(19.9765f)
        curveTo(20.1324f, 27.5548f, 20.2589f, 27.6835f, 20.2589f, 27.8423f)
        close()
        moveTo(17.8972f, 24.6337f)
        curveTo(17.955f, 24.5784f, 18.045f, 24.5784f, 18.1028f, 24.6337f)
        lineTo(20.1246f, 26.5718f)
        curveTo(20.2235f, 26.6666f, 20.1576f, 26.8358f, 20.0218f, 26.8358f)
        horizontalLineTo(15.9782f)
        curveTo(15.8424f, 26.8358f, 15.7765f, 26.6666f, 15.8754f, 26.5718f)
        lineTo(17.8972f, 24.6337f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Bronze),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(24.3503f, 8.4715f)
        curveTo(24.0338f, 8.2723f, 23.6678f, 8.1544f, 23.3236f, 8f)
        horizontalLineTo(22.7986f)
        curveTo(22.1064f, 8.1392f, 21.6024f, 8.5666f, 21.1292f, 9.0693f)
        curveTo(20.4497f, 9.791f, 19.7403f, 10.4839f, 18.9963f, 11.2376f)
        curveTo(18.7826f, 10.9995f, 18.5913f, 10.7676f, 18.3806f, 10.5554f)
        curveTo(17.9561f, 10.1295f, 17.3966f, 10.1127f, 17.0149f, 10.4999f)
        curveTo(16.6294f, 10.8908f, 16.6444f, 11.4528f, 17.0614f, 11.884f)
        curveTo(17.2759f, 12.1061f, 17.5039f, 12.3137f, 17.7499f, 12.5518f)
        curveTo(17.5946f, 12.6947f, 17.4896f, 12.7845f, 17.3929f, 12.8826f)
        curveTo(14.9495f, 15.3649f, 12.5091f, 17.8504f, 10.0627f, 20.3297f)
        curveTo(9.6592f, 20.7381f, 9.3892f, 21.2005f, 9.3547f, 21.7876f)
        curveTo(9.3127f, 22.4949f, 9.1972f, 23.168f, 8.5538f, 23.606f)
        curveTo(8.4863f, 23.6517f, 8.4503f, 23.746f, 8.4f, 23.8182f)
        verticalLineTo(24.1224f)
        curveTo(8.775f, 24.4517f, 9.15f, 24.7818f, 9.525f, 25.1111f)
        horizontalLineTo(9.6f)
        curveTo(9.7627f, 24.9788f, 9.9487f, 24.867f, 10.0837f, 24.7103f)
        curveTo(10.3694f, 24.3772f, 10.6972f, 24.1985f, 11.1479f, 24.1855f)
        curveTo(11.9444f, 24.1635f, 12.6193f, 23.8882f, 13.2073f, 23.279f)
        curveTo(15.5922f, 20.8088f, 18.0153f, 18.3759f, 20.4205f, 15.9262f)
        curveTo(20.5165f, 15.8289f, 20.5772f, 15.6958f, 20.7092f, 15.4973f)
        curveTo(21.0167f, 15.8471f, 21.223f, 16.1186f, 21.4667f, 16.3506f)
        curveTo(21.8807f, 16.7438f, 22.5181f, 16.6677f, 22.8459f, 16.2099f)
        curveTo(23.1286f, 15.8152f, 23.0821f, 15.336f, 22.6951f, 14.9398f)
        curveTo(22.0847f, 14.3147f, 21.4599f, 13.7032f, 20.842f, 13.0856f)
        curveTo(20.8637f, 13.0606f, 20.8855f, 13.0355f, 20.9072f, 13.0104f)
        curveTo(21.3512f, 13.3594f, 21.7952f, 13.7085f, 22.2564f, 14.0713f)
        curveTo(22.8894f, 13.4271f, 23.5029f, 12.7784f, 24.1441f, 12.1586f)
        curveTo(24.6293f, 11.6893f, 25.0448f, 11.1881f, 25.2f, 10.5082f)
        verticalLineTo(9.8237f)
        curveTo(25.0283f, 9.3005f, 24.8363f, 8.775f, 24.3518f, 8.47f)
        lineTo(24.3503f, 8.4715f)
        close()
        moveTo(19.5625f, 15.2189f)
        curveTo(18.3236f, 16.489f, 17.0801f, 17.7553f, 15.8329f, 19.017f)
        curveTo(15.5712f, 19.2817f, 15.3147f, 19.2741f, 15.0455f, 19.02f)
        curveTo(14.8812f, 18.8649f, 14.7282f, 18.6968f, 14.567f, 18.5379f)
        curveTo(14.2723f, 18.2466f, 14.0285f, 18.2435f, 13.7308f, 18.544f)
        curveTo(12.8541f, 19.4292f, 11.9849f, 20.3213f, 11.1074f, 21.2058f)
        curveTo(11.0167f, 21.2971f, 10.8937f, 21.3549f, 10.7864f, 21.4279f)
        curveTo(10.7579f, 21.3952f, 10.7287f, 21.3625f, 10.7002f, 21.329f)
        curveTo(10.7684f, 21.2362f, 10.8269f, 21.1336f, 10.9072f, 21.0522f)
        curveTo(13.2876f, 18.6269f, 15.6687f, 16.2031f, 18.0528f, 13.7823f)
        curveTo(18.3761f, 13.4537f, 18.5928f, 13.4568f, 18.9176f, 13.7754f)
        curveTo(19.1328f, 13.9869f, 19.3465f, 14.2006f, 19.5535f, 14.4211f)
        curveTo(19.807f, 14.6919f, 19.8168f, 14.9581f, 19.5625f, 15.2189f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Bronze),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(23.8534f, 9.3404f)
        lineTo(23.8175f, 9.3178f)
        curveTo(23.7275f, 9.2611f, 23.615f, 9.2065f, 23.4576f, 9.1399f)
        curveTo(23.4163f, 9.1224f, 23.3618f, 9.1001f, 23.3008f, 9.0751f)
        curveTo(23.2437f, 9.0518f, 23.181f, 9.0261f, 23.1183f, 9f)
        horizontalLineTo(22.9123f)
        curveTo(22.5696f, 9.0924f, 22.2618f, 9.3251f, 21.8573f, 9.7547f)
        curveTo(21.377f, 10.2649f, 20.8758f, 10.7673f, 20.3704f, 11.2738f)
        curveTo(20.1499f, 11.4947f, 19.9287f, 11.7165f, 19.708f, 11.9401f)
        lineTo(19.1451f, 12.5103f)
        lineTo(19.2064f, 12.5697f)
        lineTo(19.0902f, 12.6768f)
        curveTo(19.2979f, 12.7768f, 19.4603f, 12.9119f, 19.5752f, 13.0205f)
        lineTo(20.7758f, 11.635f)
        lineTo(22.1678f, 12.7295f)
        curveTo(22.5865f, 12.2986f, 23.0144f, 11.8598f, 23.4489f, 11.4397f)
        moveTo(20.9072f, 13.0104f)
        lineTo(20.842f, 13.0856f)
        curveTo(20.8431f, 13.0868f, 20.8442f, 13.0879f, 20.8454f, 13.089f)
        curveTo(21.0387f, 13.2823f, 21.2328f, 13.4749f, 21.4268f, 13.6676f)
        curveTo(21.6416f, 13.8807f, 21.8563f, 14.094f, 22.0702f, 14.308f)
        curveTo(22.2796f, 14.5176f, 22.4882f, 14.7279f, 22.6951f, 14.9398f)
        curveTo(22.7137f, 14.9588f, 22.7314f, 14.978f, 22.7484f, 14.9973f)
        curveTo(23.0858f, 15.3818f, 23.1151f, 15.8341f, 22.8459f, 16.2099f)
        curveTo(22.5181f, 16.6677f, 21.8807f, 16.7438f, 21.4667f, 16.3506f)
        curveTo(21.4433f, 16.3283f, 21.4203f, 16.3057f, 21.3975f, 16.2827f)
        curveTo(21.261f, 16.145f, 21.1325f, 15.9931f, 20.9857f, 15.8196f)
        curveTo(20.9013f, 15.7198f, 20.8108f, 15.6128f, 20.7092f, 15.4973f)
        curveTo(20.6623f, 15.5678f, 20.6244f, 15.6301f, 20.5907f, 15.6855f)
        curveTo(20.5296f, 15.7859f, 20.4824f, 15.8635f, 20.4205f, 15.9262f)
        curveTo(20.3031f, 16.0458f, 20.1857f, 16.1653f, 20.0682f, 16.2848f)
        curveTo(19.4274f, 16.9366f, 18.7855f, 17.5875f, 18.1435f, 18.2384f)
        curveTo(16.4922f, 19.9127f, 14.8408f, 21.5871f, 13.2073f, 23.279f)
        curveTo(12.6193f, 23.8882f, 11.9444f, 24.1635f, 11.1479f, 24.1855f)
        curveTo(10.6972f, 24.1985f, 10.3694f, 24.3772f, 10.0837f, 24.7103f)
        curveTo(9.991f, 24.8179f, 9.8743f, 24.9043f, 9.7576f, 24.9907f)
        curveTo(9.7043f, 25.0301f, 9.651f, 25.0696f, 9.6f, 25.1111f)
        horizontalLineTo(9.525f)
        curveTo(9.3372f, 24.9462f, 9.1495f, 24.7812f, 8.9618f, 24.6161f)
        curveTo(8.7745f, 24.4515f, 8.5873f, 24.2869f, 8.4f, 24.1224f)
        verticalLineTo(23.8182f)
        curveTo(8.4157f, 23.7957f, 8.43f, 23.771f, 8.4442f, 23.7464f)
        curveTo(8.4758f, 23.6919f, 8.5073f, 23.6374f, 8.5538f, 23.606f)
        curveTo(9.1972f, 23.168f, 9.3127f, 22.4949f, 9.3547f, 21.7876f)
        curveTo(9.3892f, 21.2005f, 9.6592f, 20.7381f, 10.0627f, 20.3297f)
        curveTo(11.6937f, 18.6767f, 13.322f, 17.0211f, 14.9504f, 15.3654f)
        curveTo(15.6443f, 14.6599f, 16.3382f, 13.9543f, 17.0323f, 13.249f)
        curveTo(17.1525f, 13.1268f, 17.2727f, 13.0047f, 17.3929f, 12.8826f)
        curveTo(17.4577f, 12.8168f, 17.5262f, 12.7549f, 17.6111f, 12.6781f)
        curveTo(17.6529f, 12.6403f, 17.6986f, 12.5989f, 17.7499f, 12.5518f)
        curveTo(17.6691f, 12.4736f, 17.5903f, 12.3988f, 17.5133f, 12.3256f)
        curveTo(17.3557f, 12.1759f, 17.2055f, 12.0332f, 17.0614f, 11.884f)
        curveTo(17.0514f, 11.8737f, 17.0417f, 11.8634f, 17.0322f, 11.8529f)
        curveTo(16.6439f, 11.4261f, 16.6386f, 10.8814f, 17.0149f, 10.4999f)
        curveTo(17.3789f, 10.1307f, 17.9045f, 10.1288f, 18.3206f, 10.4987f)
        curveTo(18.3408f, 10.5167f, 18.3609f, 10.5356f, 18.3806f, 10.5554f)
        curveTo(18.5243f, 10.7f, 18.6589f, 10.8539f, 18.7977f, 11.0126f)
        curveTo(18.8626f, 11.0867f, 18.9283f, 11.1618f, 18.9963f, 11.2376f)
        curveTo(19.2256f, 11.0053f, 19.4516f, 10.7788f, 19.6745f, 10.5554f)
        curveTo(19.6839f, 10.546f, 19.6933f, 10.5366f, 19.7026f, 10.5272f)
        curveTo(20.1929f, 10.0358f, 20.668f, 9.5592f, 21.1292f, 9.0693f)
        curveTo(21.6024f, 8.5666f, 22.1064f, 8.1392f, 22.7986f, 8f)
        horizontalLineTo(23.3236f)
        curveTo(23.4299f, 8.0477f, 23.5383f, 8.0919f, 23.6466f, 8.1361f)
        curveTo(23.8892f, 8.235f, 24.1316f, 8.3338f, 24.3503f, 8.4715f)
        lineTo(24.3518f, 8.47f)
        curveTo(24.5399f, 8.5884f, 24.6838f, 8.74f, 24.7997f, 8.9118f)
        curveTo(24.8017f, 8.9147f, 24.8036f, 8.9177f, 24.8056f, 8.9206f)
        curveTo(24.8747f, 9.0244f, 24.9338f, 9.1355f, 24.9862f, 9.2509f)
        curveTo(25.0696f, 9.4345f, 25.1362f, 9.6293f, 25.2f, 9.8237f)
        verticalLineTo(10.5082f)
        curveTo(25.0448f, 11.1881f, 24.6293f, 11.6893f, 24.1441f, 12.1586f)
        curveTo(23.6953f, 12.5924f, 23.26f, 13.0404f, 22.8222f, 13.4911f)
        curveTo(22.7968f, 13.5172f, 22.7714f, 13.5434f, 22.746f, 13.5696f)
        curveTo(22.5835f, 13.7367f, 22.4206f, 13.9042f, 22.2564f, 14.0713f)
        lineTo(20.9072f, 13.0104f)
        close()
        moveTo(24.2f, 10.3808f)
        verticalLineTo(9.9867f)
        curveTo(24.1364f, 9.8015f, 24.0816f, 9.6637f, 24.0183f, 9.5493f)
        curveTo(23.9596f, 9.4433f, 23.906f, 9.3814f, 23.8534f, 9.3404f)
        moveTo(24.2f, 10.3808f)
        curveTo(24.0948f, 10.7317f, 23.8571f, 11.0449f, 23.4489f, 11.4397f)
        lineTo(24.2f, 10.3808f)
        close()
        moveTo(18.0528f, 13.7823f)
        curveTo(18.3761f, 13.4537f, 18.5928f, 13.4568f, 18.9176f, 13.7754f)
        curveTo(19.1328f, 13.9869f, 19.3465f, 14.2006f, 19.5535f, 14.4211f)
        curveTo(19.807f, 14.6919f, 19.8168f, 14.9581f, 19.5625f, 15.2189f)
        curveTo(18.3236f, 16.489f, 17.0801f, 17.7553f, 15.8329f, 19.017f)
        curveTo(15.5712f, 19.2817f, 15.3147f, 19.2741f, 15.0455f, 19.02f)
        curveTo(14.9499f, 18.9298f, 14.8582f, 18.8351f, 14.7664f, 18.7405f)
        curveTo(14.7353f, 18.7084f, 14.7042f, 18.6763f, 14.673f, 18.6444f)
        curveTo(14.6379f, 18.6086f, 14.6027f, 18.573f, 14.567f, 18.5379f)
        curveTo(14.2723f, 18.2466f, 14.0285f, 18.2435f, 13.7308f, 18.544f)
        curveTo(13.3143f, 18.9645f, 12.8996f, 19.3865f, 12.4848f, 19.8086f)
        curveTo(12.1698f, 20.1291f, 11.8548f, 20.4496f, 11.5391f, 20.7695f)
        curveTo(11.5333f, 20.7754f, 11.5275f, 20.7812f, 11.5217f, 20.7871f)
        curveTo(11.3838f, 20.9268f, 11.2457f, 21.0664f, 11.1074f, 21.2058f)
        curveTo(11.1002f, 21.213f, 11.0928f, 21.2201f, 11.0852f, 21.2269f)
        curveTo(11.0851f, 21.2271f, 11.0854f, 21.2268f, 11.0852f, 21.2269f)
        curveTo(11.0277f, 21.2787f, 10.9596f, 21.3202f, 10.8921f, 21.3612f)
        curveTo(10.8651f, 21.3776f, 10.838f, 21.394f, 10.8117f, 21.4111f)
        curveTo(10.8032f, 21.4166f, 10.7948f, 21.4222f, 10.7864f, 21.4279f)
        curveTo(10.7766f, 21.4166f, 10.7666f, 21.4052f, 10.7566f, 21.3939f)
        curveTo(10.7378f, 21.3725f, 10.7188f, 21.3509f, 10.7002f, 21.329f)
        curveTo(10.7035f, 21.3245f, 10.7067f, 21.3201f, 10.71f, 21.3156f)
        curveTo(10.7278f, 21.2908f, 10.745f, 21.2654f, 10.7623f, 21.2401f)
        curveTo(10.8071f, 21.1741f, 10.852f, 21.1081f, 10.9072f, 21.0522f)
        curveTo(10.9146f, 21.0446f, 10.9221f, 21.037f, 10.9296f, 21.0294f)
        curveTo(10.9295f, 21.0294f, 10.9296f, 21.0293f, 10.9296f, 21.0294f)
        curveTo(11.8021f, 20.1403f, 12.675f, 19.2513f, 13.5478f, 18.3628f)
        curveTo(13.5478f, 18.3628f, 13.5479f, 18.3628f, 13.5478f, 18.3628f)
        curveTo(13.873f, 18.0318f, 14.1983f, 17.7008f, 14.5235f, 17.3699f)
        curveTo(15.6994f, 16.1734f, 16.8757f, 14.9775f, 18.0528f, 13.7823f)
        close()
        moveTo(10.3012f, 22.3932f)
        curveTo(10.25f, 22.7517f, 10.152f, 23.1463f, 9.9474f, 23.5219f)
        curveTo(10.2811f, 23.3189f, 10.6686f, 23.1989f, 11.1192f, 23.186f)
        curveTo(11.6648f, 23.1709f, 12.089f, 22.9977f, 12.4878f, 22.5845f)
        curveTo(13.2886f, 21.7551f, 14.0944f, 20.9291f, 14.9022f, 20.1055f)
        curveTo(14.6782f, 20.0139f, 14.4964f, 19.8768f, 14.3592f, 19.7474f)
        curveTo(14.2998f, 19.6913f, 14.2249f, 19.6165f, 14.1509f, 19.5414f)
        curveTo(13.839f, 19.8573f, 13.5213f, 20.1806f, 13.2027f, 20.5048f)
        curveTo(12.7378f, 20.9778f, 12.2709f, 21.4529f, 11.8173f, 21.9101f)
        lineTo(11.8165f, 21.9109f)
        curveTo(11.6908f, 22.0374f, 11.5614f, 22.1223f, 11.4864f, 22.1696f)
        curveTo(11.4251f, 22.2082f, 11.4018f, 22.2219f, 11.3871f, 22.2305f)
        curveTo(11.3743f, 22.238f, 11.3681f, 22.2416f, 11.3492f, 22.2545f)
        lineTo(10.6156f, 22.7539f)
        lineTo(10.3012f, 22.3932f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
