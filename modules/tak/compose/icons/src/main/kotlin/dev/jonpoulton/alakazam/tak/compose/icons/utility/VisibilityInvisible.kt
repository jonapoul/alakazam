package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons

val UtilityTakIcons.VisibilityInvisible: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "VisibilityInvisible",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        fillAlpha = 0.6f,
        strokeAlpha = 0.6f,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(26.0303f, 5.0303f)
        curveTo(26.3232f, 4.7374f, 26.3232f, 4.2626f, 26.0303f, 3.9697f)
        curveTo(25.7374f, 3.6768f, 25.2626f, 3.6768f, 24.9697f, 3.9697f)
        lineTo(20.0559f, 8.8834f)
        curveTo(18.369f, 8.0844f, 16.463f, 7.523f, 14.4341f, 7.523f)
        curveTo(10.7912f, 7.523f, 7.5441f, 9.3336f, 5.2506f, 11.0791f)
        curveTo(4.096f, 11.9579f, 3.1629f, 12.8355f, 2.5179f, 13.4938f)
        curveTo(2.1951f, 13.8233f, 1.9434f, 14.0989f, 1.7714f, 14.2935f)
        curveTo(1.6853f, 14.3908f, 1.6191f, 14.468f, 1.5737f, 14.5216f)
        curveTo(1.551f, 14.5485f, 1.5335f, 14.5694f, 1.5214f, 14.584f)
        lineTo(1.5072f, 14.6012f)
        lineTo(1.5031f, 14.6062f)
        lineTo(1.5018f, 14.6078f)
        lineTo(1.5014f, 14.6083f)
        curveTo(1.5012f, 14.6085f, 1.5011f, 14.6087f, 2.0249f, 15.0344f)
        lineTo(1.5011f, 14.6087f)
        lineTo(1.1552f, 15.0344f)
        lineTo(1.501f, 15.4601f)
        lineTo(2.0249f, 15.0344f)
        curveTo(1.501f, 15.4601f, 1.5012f, 15.4602f, 1.5014f, 15.4605f)
        lineTo(1.5018f, 15.461f)
        lineTo(1.5031f, 15.4626f)
        lineTo(1.5071f, 15.4675f)
        lineTo(1.5213f, 15.4847f)
        curveTo(1.5335f, 15.4994f, 1.551f, 15.5203f, 1.5737f, 15.5471f)
        curveTo(1.619f, 15.6008f, 1.6853f, 15.678f, 1.7713f, 15.7753f)
        curveTo(1.9434f, 15.9699f, 2.1951f, 16.2455f, 2.5179f, 16.5751f)
        curveTo(3.1629f, 17.2335f, 4.096f, 18.1112f, 5.2506f, 18.9902f)
        curveTo(6.0855f, 19.6256f, 7.0467f, 20.2697f, 8.1074f, 20.832f)
        lineTo(3.9697f, 24.9697f)
        curveTo(3.6768f, 25.2626f, 3.6768f, 25.7374f, 3.9697f, 26.0303f)
        curveTo(4.2626f, 26.3232f, 4.7375f, 26.3232f, 5.0303f, 26.0303f)
        lineTo(9.548f, 21.5127f)
        curveTo(11.046f, 22.134f, 12.695f, 22.5467f, 14.4341f, 22.5467f)
        curveTo(18.0775f, 22.5467f, 21.3248f, 20.7359f, 23.6184f, 18.9902f)
        curveTo(24.7731f, 18.1113f, 25.7062f, 17.2335f, 26.3512f, 16.5751f)
        curveTo(26.6741f, 16.2455f, 26.9257f, 15.9699f, 27.0978f, 15.7753f)
        curveTo(27.1839f, 15.678f, 27.2501f, 15.6008f, 27.2955f, 15.5471f)
        lineTo(27.3212f, 15.5166f)
        lineTo(27.3478f, 15.4847f)
        lineTo(27.362f, 15.4675f)
        lineTo(27.3661f, 15.4626f)
        lineTo(27.3673f, 15.461f)
        lineTo(27.3678f, 15.4605f)
        curveTo(27.3679f, 15.4602f, 27.3681f, 15.4601f, 26.8442f, 15.0344f)
        lineTo(27.3681f, 15.4601f)
        lineTo(27.714f, 15.0344f)
        lineTo(27.3681f, 14.6087f)
        lineTo(26.8442f, 15.0344f)
        curveTo(27.3681f, 14.6087f, 27.3679f, 14.6085f, 27.3677f, 14.6083f)
        lineTo(27.3673f, 14.6078f)
        lineTo(27.366f, 14.6062f)
        lineTo(27.362f, 14.6012f)
        lineTo(27.3478f, 14.584f)
        curveTo(27.3356f, 14.5694f, 27.3181f, 14.5485f, 27.2955f, 14.5216f)
        curveTo(27.2501f, 14.468f, 27.1838f, 14.3908f, 27.0978f, 14.2935f)
        curveTo(26.9257f, 14.0989f, 26.674f, 13.8233f, 26.3512f, 13.4938f)
        curveTo(25.7062f, 12.8355f, 24.7731f, 11.9579f, 23.6184f, 11.0791f)
        curveTo(22.9662f, 10.5827f, 22.2369f, 10.0811f, 21.4433f, 9.6174f)
        lineTo(26.0303f, 5.0303f)
        close()
        moveTo(19.0365f, 9.9029f)
        curveTo(17.6103f, 9.2824f, 16.0544f, 8.873f, 14.4341f, 8.873f)
        curveTo(11.2236f, 8.873f, 8.266f, 10.4806f, 6.0683f, 12.1533f)
        curveTo(4.9773f, 12.9836f, 4.0931f, 13.8151f, 3.4822f, 14.4386f)
        curveTo(3.2555f, 14.67f, 3.067f, 14.8722f, 2.92f, 15.0344f)
        curveTo(3.067f, 15.1966f, 3.2555f, 15.3989f, 3.4823f, 15.6304f)
        curveTo(4.0932f, 16.254f, 4.9773f, 17.0855f, 6.0683f, 17.9159f)
        curveTo(6.9667f, 18.5998f, 7.9921f, 19.2728f, 9.1098f, 19.8295f)
        lineTo(10.0807f, 18.8587f)
        curveTo(9.1191f, 17.8519f, 8.5286f, 16.4876f, 8.5286f, 14.9853f)
        curveTo(8.5286f, 11.8872f, 11.0395f, 9.3765f, 14.1383f, 9.3765f)
        curveTo(15.6401f, 9.3765f, 17.0042f, 9.9668f, 18.0111f, 10.9282f)
        lineTo(19.0365f, 9.9029f)
        close()
        moveTo(18.9534f, 12.1073f)
        lineTo(20.4538f, 10.6068f)
        curveTo(21.3039f, 11.0811f, 22.0919f, 11.6138f, 22.8008f, 12.1533f)
        curveTo(23.8918f, 12.9836f, 24.776f, 13.8151f, 25.3869f, 14.4386f)
        curveTo(25.6136f, 14.67f, 25.8022f, 14.8722f, 25.9491f, 15.0344f)
        curveTo(25.8022f, 15.1966f, 25.6136f, 15.3989f, 25.3869f, 15.6304f)
        curveTo(24.7759f, 16.254f, 23.8918f, 17.0855f, 22.8007f, 17.9159f)
        curveTo(20.6029f, 19.5888f, 17.6451f, 21.1967f, 14.4341f, 21.1967f)
        curveTo(13.0965f, 21.1967f, 11.8028f, 20.9176f, 10.5897f, 20.471f)
        lineTo(11.26f, 19.8007f)
        curveTo(12.1014f, 20.3045f, 13.0859f, 20.5941f, 14.1383f, 20.5941f)
        curveTo(17.2353f, 20.5941f, 19.7471f, 18.0833f, 19.7471f, 14.9853f)
        curveTo(19.7471f, 13.9331f, 19.4574f, 12.9486f, 18.9534f, 12.1073f)
        close()
        moveTo(17.0562f, 11.8832f)
        curveTo(16.2939f, 11.1659f, 15.2673f, 10.7265f, 14.1383f, 10.7265f)
        curveTo(11.7849f, 10.7265f, 9.8786f, 12.6329f, 9.8786f, 14.9853f)
        curveTo(9.8786f, 16.1148f, 10.3181f, 17.1415f, 11.0356f, 17.9037f)
        lineTo(17.0562f, 11.8832f)
        close()
        moveTo(12.2544f, 18.8062f)
        lineTo(17.959f, 13.1017f)
        curveTo(18.2395f, 13.6696f, 18.3971f, 14.309f, 18.3971f, 14.9853f)
        curveTo(18.3971f, 17.3376f, 16.4899f, 19.2441f, 14.1383f, 19.2441f)
        curveTo(13.4619f, 19.2441f, 12.8224f, 19.0866f, 12.2544f, 18.8062f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
