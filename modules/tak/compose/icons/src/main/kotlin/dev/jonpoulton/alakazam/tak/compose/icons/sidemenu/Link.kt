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

public val SideMenuTakIcons.Link: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Link",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(22.2028f, 10.9185f)
        lineTo(20.0815f, 13.0398f)
        curveTo(19.6135f, 13.5079f, 19.3698f, 14.1153f, 19.3505f, 14.7285f)
        curveTo(19.0923f, 14.8257f, 18.8502f, 14.9782f, 18.6424f, 15.186f)
        lineTo(17.985f, 15.8434f)
        curveTo(17.6286f, 14.5089f, 17.9739f, 13.0261f, 19.0208f, 11.9792f)
        lineTo(21.1422f, 9.8579f)
        curveTo(22.7043f, 8.2957f, 25.2369f, 8.2957f, 26.799f, 9.8579f)
        curveTo(28.3611f, 11.4199f, 28.3611f, 13.9526f, 26.799f, 15.5147f)
        lineTo(24.6777f, 17.636f)
        curveTo(23.6308f, 18.6829f, 22.1479f, 19.0282f, 20.8134f, 18.6718f)
        lineTo(21.4708f, 18.0144f)
        curveTo(21.6786f, 17.8067f, 21.8311f, 17.5645f, 21.9284f, 17.3063f)
        curveTo(22.5415f, 17.2871f, 23.149f, 17.0434f, 23.617f, 16.5754f)
        lineTo(25.7383f, 14.454f)
        curveTo(26.7147f, 13.4777f, 26.7147f, 11.8948f, 25.7383f, 10.9185f)
        curveTo(24.762f, 9.9422f, 23.1791f, 9.9422f, 22.2028f, 10.9185f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(10.8891f, 22.2322f)
        lineTo(13.0104f, 20.1109f)
        curveTo(13.5384f, 19.583f, 14.2437f, 19.3405f, 14.9345f, 19.3835f)
        curveTo(15.0067f, 19.0024f, 15.1903f, 18.6381f, 15.4853f, 18.3431f)
        lineTo(15.814f, 18.0144f)
        curveTo(14.4795f, 17.6581f, 12.9967f, 18.0033f, 11.9497f, 19.0503f)
        lineTo(9.8284f, 21.1716f)
        curveTo(8.2663f, 22.7337f, 8.2663f, 25.2663f, 9.8284f, 26.8284f)
        curveTo(11.3905f, 28.3905f, 13.9232f, 28.3905f, 15.4853f, 26.8284f)
        lineTo(17.6066f, 24.7071f)
        curveTo(18.6535f, 23.6602f, 18.9988f, 22.1773f, 18.6424f, 20.8429f)
        lineTo(18.3137f, 21.1716f)
        curveTo(18.0187f, 21.4666f, 17.6545f, 21.6502f, 17.2733f, 21.7223f)
        curveTo(17.3163f, 22.4132f, 17.0739f, 23.1185f, 16.5459f, 23.6464f)
        lineTo(14.4246f, 25.7678f)
        curveTo(13.4483f, 26.7441f, 11.8654f, 26.7441f, 10.8891f, 25.7678f)
        curveTo(9.9128f, 24.7915f, 9.9128f, 23.2085f, 10.8891f, 22.2322f)
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
        moveTo(16.1923f, 19.0503f)
        lineTo(19.0207f, 16.2219f)
        arcTo(1f, 1f, 107.9862f, false, true, 20.4349f, 16.2219f)
        lineTo(20.4349f, 16.2219f)
        arcTo(1f, 1f, 107.9862f, false, true, 20.4349f, 17.6361f)
        lineTo(17.6065f, 20.4645f)
        arcTo(1f, 1f, 0f, false, true, 16.1923f, 20.4645f)
        lineTo(16.1923f, 20.4645f)
        arcTo(1f, 1f, 107.9862f, false, true, 16.1923f, 19.0503f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
