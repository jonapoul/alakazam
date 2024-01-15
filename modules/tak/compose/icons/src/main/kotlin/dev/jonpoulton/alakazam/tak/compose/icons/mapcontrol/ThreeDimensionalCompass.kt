package dev.jonpoulton.alakazam.tak.compose.icons.mapcontrol

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
import dev.jonpoulton.alakazam.tak.compose.icons.MapControlTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val MapControlTakIcons.ThreeDimensionalCompass: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "ThreeDimensionalCompass",
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
        moveTo(13.75f, 5.2588f)
        curveTo(6.1561f, 5.2588f, 0.0f, 11.4149f, 0.0f, 19.0088f)
        curveTo(0.0f, 26.6027f, 6.1561f, 32.7588f, 13.75f, 32.7588f)
        curveTo(21.3439f, 32.7588f, 27.5f, 26.6027f, 27.5f, 19.0088f)
        curveTo(27.5f, 11.4149f, 21.3439f, 5.2588f, 13.75f, 5.2588f)
        close()
        moveTo(13.75f, 6.7588f)
        curveTo(20.5155f, 6.7588f, 26.0f, 12.2433f, 26.0f, 19.0088f)
        curveTo(26.0f, 25.7743f, 20.5155f, 31.2588f, 13.75f, 31.2588f)
        curveTo(6.9845f, 31.2588f, 1.5f, 25.7743f, 1.5f, 19.0088f)
        curveTo(1.5f, 12.2433f, 6.9845f, 6.7588f, 13.75f, 6.7588f)
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
        moveTo(11.8572f, 8.8951f)
        lineTo(10.5228f, 17.8322f)
        lineTo(12.9646f, 14.7913f)
        lineTo(16.7283f, 16.5059f)
        lineTo(11.8572f, 8.8951f)
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
        moveTo(8.264f, 23.3359f)
        curveTo(8.6f, 23.4213f, 8.856f, 23.5839f, 9.032f, 23.8239f)
        curveTo(9.2133f, 24.0586f, 9.304f, 24.3519f, 9.304f, 24.7039f)
        curveTo(9.304f, 25.1893f, 9.1253f, 25.5759f, 8.768f, 25.8639f)
        curveTo(8.4107f, 26.1519f, 7.928f, 26.2959f, 7.32f, 26.2959f)
        curveTo(6.9733f, 26.2959f, 6.64f, 26.2426f, 6.32f, 26.1359f)
        curveTo(6.0f, 26.0293f, 5.728f, 25.8799f, 5.504f, 25.6879f)
        curveTo(5.3813f, 25.5813f, 5.32f, 25.4559f, 5.32f, 25.3119f)
        curveTo(5.32f, 25.1946f, 5.352f, 25.0959f, 5.416f, 25.0159f)
        curveTo(5.4853f, 24.9306f, 5.5653f, 24.8879f, 5.656f, 24.8879f)
        curveTo(5.7093f, 24.8879f, 5.7573f, 24.8986f, 5.8f, 24.9199f)
        curveTo(5.8427f, 24.9359f, 5.9013f, 24.9653f, 5.976f, 25.0079f)
        curveTo(6.2f, 25.1573f, 6.4133f, 25.2719f, 6.616f, 25.3519f)
        curveTo(6.8187f, 25.4319f, 7.04f, 25.4719f, 7.28f, 25.4719f)
        curveTo(7.632f, 25.4719f, 7.8933f, 25.4026f, 8.064f, 25.2639f)
        curveTo(8.2347f, 25.1199f, 8.32f, 24.9039f, 8.32f, 24.6159f)
        curveTo(8.32f, 24.3333f, 8.2293f, 24.1253f, 8.048f, 23.9919f)
        curveTo(7.872f, 23.8533f, 7.5973f, 23.7839f, 7.224f, 23.7839f)
        horizontalLineTo(6.768f)
        curveTo(6.6453f, 23.7839f, 6.5493f, 23.7439f, 6.48f, 23.6639f)
        curveTo(6.416f, 23.5786f, 6.384f, 23.4826f, 6.384f, 23.3759f)
        curveTo(6.384f, 23.2639f, 6.416f, 23.1679f, 6.48f, 23.0879f)
        curveTo(6.5493f, 23.0079f, 6.6453f, 22.9679f, 6.768f, 22.9679f)
        horizontalLineTo(7.088f)
        curveTo(7.8187f, 22.9679f, 8.184f, 22.6933f, 8.184f, 22.1439f)
        curveTo(8.184f, 21.8879f, 8.1067f, 21.6906f, 7.952f, 21.5519f)
        curveTo(7.7973f, 21.4133f, 7.584f, 21.3439f, 7.312f, 21.3439f)
        curveTo(6.9227f, 21.3439f, 6.5067f, 21.4986f, 6.064f, 21.8079f)
        curveTo(5.9893f, 21.8506f, 5.9307f, 21.8826f, 5.888f, 21.9039f)
        curveTo(5.8453f, 21.9199f, 5.7973f, 21.9279f, 5.744f, 21.9279f)
        curveTo(5.6533f, 21.9279f, 5.5733f, 21.8879f, 5.504f, 21.8079f)
        curveTo(5.44f, 21.7226f, 5.408f, 21.6213f, 5.408f, 21.5039f)
        curveTo(5.408f, 21.4239f, 5.4213f, 21.3573f, 5.448f, 21.3039f)
        curveTo(5.48f, 21.2453f, 5.528f, 21.1866f, 5.592f, 21.1279f)
        curveTo(5.816f, 20.9413f, 6.0827f, 20.7946f, 6.392f, 20.6879f)
        curveTo(6.7067f, 20.5759f, 7.0267f, 20.5199f, 7.352f, 20.5199f)
        curveTo(7.9067f, 20.5199f, 8.3467f, 20.6559f, 8.672f, 20.9279f)
        curveTo(9.0027f, 21.1999f, 9.168f, 21.5626f, 9.168f, 22.0159f)
        curveTo(9.1627f, 22.3253f, 9.08f, 22.5973f, 8.92f, 22.8319f)
        curveTo(8.7653f, 23.0613f, 8.5467f, 23.2293f, 8.264f, 23.3359f)
        close()
        moveTo(12.4929f, 22.6239f)
        curveTo(12.8449f, 22.6239f, 13.1542f, 22.7013f, 13.4209f, 22.8559f)
        curveTo(13.6929f, 23.0053f, 13.9035f, 23.2159f, 14.0529f, 23.4879f)
        curveTo(14.2022f, 23.7599f, 14.2769f, 24.0719f, 14.2769f, 24.4239f)
        curveTo(14.2769f, 24.7919f, 14.1915f, 25.1173f, 14.0209f, 25.3999f)
        curveTo(13.8555f, 25.6826f, 13.6182f, 25.9039f, 13.3089f, 26.0639f)
        curveTo(13.0049f, 26.2186f, 12.6529f, 26.2959f, 12.2529f, 26.2959f)
        curveTo(11.9222f, 26.2959f, 11.5969f, 26.2426f, 11.2769f, 26.1359f)
        curveTo(10.9622f, 26.0239f, 10.6929f, 25.8746f, 10.4689f, 25.6879f)
        curveTo(10.3462f, 25.5813f, 10.2849f, 25.4559f, 10.2849f, 25.3119f)
        curveTo(10.2849f, 25.1946f, 10.3169f, 25.0959f, 10.3809f, 25.0159f)
        curveTo(10.4502f, 24.9306f, 10.5302f, 24.8879f, 10.6209f, 24.8879f)
        curveTo(10.6742f, 24.8879f, 10.7249f, 24.8986f, 10.7729f, 24.9199f)
        curveTo(10.8209f, 24.9359f, 10.8769f, 24.9653f, 10.9409f, 25.0079f)
        curveTo(11.1542f, 25.1573f, 11.3622f, 25.2719f, 11.5649f, 25.3519f)
        curveTo(11.7675f, 25.4319f, 11.9835f, 25.4719f, 12.2129f, 25.4719f)
        curveTo(12.5649f, 25.4719f, 12.8342f, 25.3839f, 13.0209f, 25.2079f)
        curveTo(13.2075f, 25.0319f, 13.3009f, 24.7813f, 13.3009f, 24.4559f)
        curveTo(13.3009f, 24.1413f, 13.2049f, 23.8933f, 13.0129f, 23.7119f)
        curveTo(12.8262f, 23.5253f, 12.5675f, 23.4319f, 12.2369f, 23.4319f)
        curveTo(12.0289f, 23.4319f, 11.8422f, 23.4613f, 11.6769f, 23.5199f)
        curveTo(11.5169f, 23.5786f, 11.3515f, 23.6773f, 11.1809f, 23.8159f)
        curveTo(11.0795f, 23.8853f, 10.9755f, 23.9199f, 10.8689f, 23.9199f)
        curveTo(10.7622f, 23.9199f, 10.6715f, 23.8879f, 10.5969f, 23.8239f)
        curveTo(10.5222f, 23.7599f, 10.4849f, 23.6746f, 10.4849f, 23.5679f)
        verticalLineTo(21.0719f)
        curveTo(10.4849f, 20.9226f, 10.5275f, 20.8053f, 10.6129f, 20.7199f)
        curveTo(10.6982f, 20.6346f, 10.8182f, 20.5919f, 10.9729f, 20.5919f)
        horizontalLineTo(13.6369f)
        curveTo(13.9569f, 20.5919f, 14.1169f, 20.7253f, 14.1169f, 20.9919f)
        curveTo(14.1169f, 21.2586f, 13.9569f, 21.3919f, 13.6369f, 21.3919f)
        horizontalLineTo(11.4929f)
        verticalLineTo(22.9119f)
        curveTo(11.7649f, 22.7199f, 12.0982f, 22.6239f, 12.4929f, 22.6239f)
        close()
        moveTo(18.6018f, 25.3999f)
        curveTo(18.9218f, 25.3999f, 19.0818f, 25.5359f, 19.0818f, 25.8079f)
        curveTo(19.0818f, 26.0906f, 18.9218f, 26.2319f, 18.6018f, 26.2319f)
        horizontalLineTo(15.8978f)
        curveTo(15.5724f, 26.2319f, 15.4098f, 26.0906f, 15.4098f, 25.8079f)
        curveTo(15.4098f, 25.5359f, 15.5724f, 25.3999f, 15.8978f, 25.3999f)
        horizontalLineTo(16.7298f)
        verticalLineTo(21.7519f)
        lineTo(15.9618f, 22.2239f)
        curveTo(15.8871f, 22.2666f, 15.8204f, 22.2879f, 15.7618f, 22.2879f)
        curveTo(15.6498f, 22.2879f, 15.5538f, 22.2399f, 15.4738f, 22.1439f)
        curveTo(15.3991f, 22.0479f, 15.3618f, 21.9413f, 15.3618f, 21.8239f)
        curveTo(15.3618f, 21.6693f, 15.4311f, 21.5493f, 15.5698f, 21.4639f)
        lineTo(16.8098f, 20.6959f)
        curveTo(16.9698f, 20.5999f, 17.1218f, 20.5519f, 17.2658f, 20.5519f)
        curveTo(17.4151f, 20.5519f, 17.5351f, 20.5973f, 17.6258f, 20.6879f)
        curveTo(17.7164f, 20.7786f, 17.7618f, 20.9039f, 17.7618f, 21.0639f)
        verticalLineTo(25.3999f)
        horizontalLineTo(18.6018f)
        close()
        moveTo(20.8546f, 22.9279f)
        curveTo(20.6306f, 22.9279f, 20.428f, 22.8773f, 20.2466f, 22.7759f)
        curveTo(20.0653f, 22.6693f, 19.9213f, 22.5279f, 19.8146f, 22.3519f)
        curveTo(19.708f, 22.1706f, 19.6546f, 21.9679f, 19.6546f, 21.7439f)
        curveTo(19.6546f, 21.5199f, 19.708f, 21.3173f, 19.8146f, 21.1359f)
        curveTo(19.9213f, 20.9546f, 20.0653f, 20.8133f, 20.2466f, 20.7119f)
        curveTo(20.428f, 20.6053f, 20.6306f, 20.5519f, 20.8546f, 20.5519f)
        curveTo(21.0786f, 20.5519f, 21.2813f, 20.6053f, 21.4626f, 20.7119f)
        curveTo(21.6493f, 20.8133f, 21.796f, 20.9546f, 21.9026f, 21.1359f)
        curveTo(22.0093f, 21.3173f, 22.0626f, 21.5199f, 22.0626f, 21.7439f)
        curveTo(22.0626f, 21.9679f, 22.0093f, 22.1706f, 21.9026f, 22.3519f)
        curveTo(21.796f, 22.5279f, 21.6493f, 22.6693f, 21.4626f, 22.7759f)
        curveTo(21.2813f, 22.8773f, 21.0786f, 22.9279f, 20.8546f, 22.9279f)
        close()
        moveTo(20.8546f, 22.3839f)
        curveTo(21.036f, 22.3839f, 21.1853f, 22.3253f, 21.3026f, 22.2079f)
        curveTo(21.42f, 22.0853f, 21.4786f, 21.9306f, 21.4786f, 21.7439f)
        curveTo(21.4786f, 21.5519f, 21.42f, 21.3973f, 21.3026f, 21.2799f)
        curveTo(21.1853f, 21.1573f, 21.036f, 21.0959f, 20.8546f, 21.0959f)
        curveTo(20.6786f, 21.0959f, 20.532f, 21.1573f, 20.4146f, 21.2799f)
        curveTo(20.2973f, 21.3973f, 20.2386f, 21.5519f, 20.2386f, 21.7439f)
        curveTo(20.2386f, 21.9306f, 20.2973f, 22.0853f, 20.4146f, 22.2079f)
        curveTo(20.532f, 22.3253f, 20.6786f, 22.3839f, 20.8546f, 22.3839f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MapControlTakIcons.ThreeDimensionalCompass)
