package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

val ToolbarTakIcons.Toolbars: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Toolbars",
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
        moveTo(27.2875f, 16.8679f)
        lineTo(15.453f, 28.6997f)
        curveTo(15.3232f, 28.8295f, 15.2702f, 29.0178f, 15.315f, 29.1952f)
        curveTo(16.0308f, 32.0075f, 14.3321f, 34.8656f, 11.5216f, 35.5815f)
        curveTo(8.7111f, 36.2965f, 5.8521f, 34.5986f, 5.1353f, 31.7872f)
        curveTo(4.4203f, 28.9767f, 6.1191f, 26.1177f, 8.9305f, 25.4018f)
        curveTo(9.7808f, 25.1861f, 10.6713f, 25.1861f, 11.5216f, 25.4018f)
        curveTo(11.699f, 25.4457f, 11.8873f, 25.3936f, 12.0171f, 25.2647f)
        lineTo(23.8489f, 13.432f)
        curveTo(23.9787f, 13.3022f, 24.0308f, 13.1147f, 23.987f, 12.9365f)
        curveTo(23.2756f, 10.1579f, 24.9506f, 7.33f, 27.7291f, 6.6187f)
        curveTo(28.2548f, 6.4852f, 28.797f, 6.4331f, 29.3383f, 6.467f)
        lineTo(26.5854f, 9.2208f)
        curveTo(26.4464f, 9.3598f, 26.397f, 9.5664f, 26.4601f, 9.7538f)
        lineTo(27.5024f, 12.8843f)
        curveTo(27.5554f, 13.0398f, 27.6779f, 13.1614f, 27.8334f, 13.2135f)
        lineTo(30.9639f, 14.2576f)
        curveTo(31.1513f, 14.3198f, 31.357f, 14.2704f, 31.4969f, 14.1314f)
        lineTo(34.2489f, 11.3794f)
        curveTo(34.2553f, 11.4782f, 34.259f, 11.5778f, 34.259f, 11.6757f)
        curveTo(34.2736f, 14.5419f, 31.9614f, 16.8779f, 29.0951f, 16.8926f)
        curveTo(28.6516f, 16.8944f, 28.21f, 16.8405f, 27.7803f, 16.7307f)
        curveTo(27.603f, 16.6859f, 27.4146f, 16.7371f, 27.2848f, 16.8679f)
        horizontalLineTo(27.2875f)
        close()
        moveTo(25.181f, 22.115f)
        curveTo(24.6032f, 22.8034f, 24.6937f, 23.8311f, 25.3831f, 24.4089f)
        curveTo(25.9883f, 24.9163f, 26.8715f, 24.9163f, 27.4768f, 24.4071f)
        lineTo(33.331f, 30.2667f)
        curveTo(33.395f, 30.3307f, 33.4544f, 30.3984f, 33.512f, 30.4661f)
        lineTo(29.0512f, 34.9269f)
        curveTo(28.9826f, 34.8693f, 28.915f, 34.8098f, 28.8519f, 34.7467f)
        lineTo(22.9931f, 28.8871f)
        curveTo(23.571f, 28.1977f, 23.4795f, 27.171f, 22.7902f, 26.5931f)
        curveTo(22.1849f, 26.0848f, 21.3017f, 26.0857f, 20.6974f, 26.5941f)
        lineTo(19.8626f, 25.7593f)
        lineTo(24.3463f, 21.2821f)
        lineTo(25.181f, 22.115f)
        close()
        moveTo(31.091f, 35.6738f)
        curveTo(30.7124f, 35.6729f, 30.3367f, 35.6043f, 29.9819f, 35.4718f)
        lineTo(34.056f, 31.3968f)
        curveTo(34.6713f, 33.0325f, 33.8439f, 34.8565f, 32.2082f, 35.4718f)
        curveTo(31.8507f, 35.6053f, 31.4731f, 35.6738f, 31.091f, 35.6738f)
        close()
        moveTo(29.042f, 17.9358f)
        curveTo(32.4871f, 17.9477f, 35.2903f, 15.1637f, 35.3022f, 11.7177f)
        curveTo(35.304f, 11.1938f, 35.2391f, 10.6718f, 35.1102f, 10.1625f)
        curveTo(35.0398f, 9.8827f, 34.7572f, 9.7127f, 34.4775f, 9.7822f)
        curveTo(34.386f, 9.805f, 34.3019f, 9.8526f, 34.2352f, 9.9193f)
        lineTo(30.9876f, 13.165f)
        lineTo(28.4112f, 12.3065f)
        lineTo(27.5518f, 9.7301f)
        lineTo(30.7993f, 6.4825f)
        curveTo(31.0023f, 6.2786f, 31.0023f, 5.9486f, 30.7993f, 5.7447f)
        curveTo(30.7316f, 5.677f, 30.6475f, 5.6295f, 30.5543f, 5.6066f)
        curveTo(27.2135f, 4.7609f, 23.8187f, 6.7833f, 22.9721f, 10.1241f)
        curveTo(22.8441f, 10.6315f, 22.7792f, 11.1527f, 22.781f, 11.6757f)
        curveTo(22.7828f, 12.0871f, 22.8249f, 12.4958f, 22.9081f, 12.8981f)
        lineTo(11.4832f, 24.323f)
        curveTo(11.08f, 24.2398f, 10.6713f, 24.1986f, 10.2608f, 24.1968f)
        curveTo(6.803f, 24.1968f, 3.9998f, 26.9991f, 3.9998f, 30.4569f)
        curveTo(3.9998f, 33.9147f, 6.803f, 36.717f, 10.2608f, 36.717f)
        curveTo(13.7177f, 36.717f, 16.5209f, 33.9147f, 16.5209f, 30.4569f)
        curveTo(16.52f, 30.0464f, 16.477f, 29.6368f, 16.3938f, 29.2336f)
        lineTo(19.1294f, 26.499f)
        lineTo(20.3262f, 27.6958f)
        curveTo(20.5291f, 27.8987f, 20.8601f, 27.8987f, 21.0631f, 27.6958f)
        lineTo(21.3246f, 27.4352f)
        curveTo(21.5531f, 27.2075f, 21.9225f, 27.2075f, 22.152f, 27.4352f)
        curveTo(22.3806f, 27.6629f, 22.3806f, 28.0322f, 22.1529f, 28.2608f)
        lineTo(22.152f, 28.2617f)
        lineTo(21.8914f, 28.5223f)
        curveTo(21.6866f, 28.7271f, 21.6866f, 29.0562f, 21.8914f, 29.261f)
        lineTo(28.114f, 35.4837f)
        curveTo(29.7506f, 37.1358f, 32.4167f, 37.1477f, 34.0688f, 35.5111f)
        curveTo(35.7209f, 33.8745f, 35.7319f, 31.2085f, 34.0953f, 29.5563f)
        lineTo(34.0688f, 29.5298f)
        lineTo(27.8452f, 23.3063f)
        curveTo(27.6423f, 23.1015f, 27.3113f, 23.1015f, 27.1083f, 23.3063f)
        lineTo(26.8478f, 23.5669f)
        curveTo(26.6183f, 23.7936f, 26.248f, 23.7936f, 26.0194f, 23.5669f)
        curveTo(25.7908f, 23.3383f, 25.7899f, 22.9689f, 26.0185f, 22.7403f)
        curveTo(26.0185f, 22.7403f, 26.0185f, 22.7394f, 26.0194f, 22.7394f)
        lineTo(26.28f, 22.4789f)
        curveTo(26.4839f, 22.275f, 26.4839f, 21.9449f, 26.28f, 21.741f)
        lineTo(25.0841f, 20.5442f)
        lineTo(27.8196f, 17.8087f)
        curveTo(28.221f, 17.8919f, 28.6315f, 17.9349f, 29.042f, 17.9358f)
        close()
        moveTo(4.0688f, 8.2848f)
        lineTo(6.1561f, 11.9365f)
        curveTo(6.2256f, 12.0599f, 6.3435f, 12.1495f, 6.4825f, 12.1843f)
        lineTo(8.429f, 12.6707f)
        lineTo(15.106f, 19.3486f)
        lineTo(15.8448f, 18.6108f)
        lineTo(9.0626f, 11.8286f)
        curveTo(8.9959f, 11.7619f, 8.9118f, 11.7143f, 8.8194f, 11.6915f)
        lineTo(6.9488f, 11.2215f)
        lineTo(5.1723f, 8.1111f)
        lineTo(6.6955f, 6.5879f)
        lineTo(9.8078f, 8.3662f)
        lineTo(10.2777f, 10.2368f)
        curveTo(10.3006f, 10.3283f, 10.3481f, 10.4124f, 10.4148f, 10.4791f)
        lineTo(17.197f, 17.2613f)
        lineTo(17.9348f, 16.5235f)
        lineTo(11.2569f, 9.8455f)
        lineTo(10.7705f, 7.8999f)
        curveTo(10.7358f, 7.7619f, 10.6462f, 7.6439f, 10.5236f, 7.5735f)
        lineTo(6.8702f, 5.4862f)
        curveTo(6.6672f, 5.3701f, 6.4112f, 5.4058f, 6.2448f, 5.5703f)
        lineTo(4.1584f, 7.6567f)
        curveTo(3.9902f, 7.8222f, 3.9536f, 8.0791f, 4.0688f, 8.2848f)
        close()
        moveTo(25.7589f, 15.6964f)
        lineTo(14.281f, 27.1734f)
        lineTo(13.5441f, 26.4356f)
        lineTo(25.0211f, 14.9577f)
        lineTo(25.7589f, 15.6964f)
        close()
        moveTo(8.9914f, 32.5438f)
        horizontalLineTo(11.5304f)
        lineTo(12.782f, 30.4574f)
        lineTo(11.5304f, 28.3701f)
        horizontalLineTo(8.9914f)
        lineTo(7.7388f, 30.4574f)
        lineTo(8.9914f, 32.5438f)
        close()
        moveTo(11.8257f, 27.3269f)
        curveTo(12.0085f, 27.3269f, 12.1786f, 27.4219f, 12.2728f, 27.5792f)
        lineTo(13.8371f, 30.1886f)
        curveTo(13.9377f, 30.3531f, 13.9377f, 30.5598f, 13.8371f, 30.7262f)
        lineTo(12.2728f, 33.3337f)
        curveTo(12.1786f, 33.491f, 12.0085f, 33.587f, 11.8257f, 33.587f)
        horizontalLineTo(8.6952f)
        curveTo(8.5123f, 33.587f, 8.3432f, 33.491f, 8.2481f, 33.3337f)
        lineTo(6.6828f, 30.7262f)
        curveTo(6.5841f, 30.5598f, 6.5841f, 30.3531f, 6.6828f, 30.1886f)
        lineTo(8.2481f, 27.5792f)
        curveTo(8.3432f, 27.4219f, 8.5123f, 27.3269f, 8.6952f, 27.3269f)
        horizontalLineTo(11.8257f)
        close()
        moveTo(30.2381f, 32.3914f)
        lineTo(30.9759f, 31.6527f)
        lineTo(25.759f, 26.4358f)
        lineTo(25.0212f, 27.1745f)
        lineTo(30.2381f, 32.3914f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
