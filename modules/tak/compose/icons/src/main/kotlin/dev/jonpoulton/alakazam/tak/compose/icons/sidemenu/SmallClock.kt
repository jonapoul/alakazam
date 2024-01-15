package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.SmallClock: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "SmallClock",
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
        moveTo(17.5001f, 10.5f)
        curveTo(17.5001f, 10.3883f, 17.5367f, 10.2851f, 17.5986f, 10.2019f)
        curveTo(16.3789f, 10.2602f, 15.2273f, 10.5828f, 14.1999f, 11.1135f)
        curveTo(14.2946f, 11.1547f, 14.3774f, 11.2255f, 14.4331f, 11.3218f)
        lineTo(14.9331f, 12.1878f)
        curveTo(15.0711f, 12.427f, 14.9892f, 12.7328f, 14.75f, 12.8709f)
        curveTo(14.5109f, 13.0089f, 14.2051f, 12.927f, 14.067f, 12.6878f)
        lineTo(13.567f, 11.8218f)
        curveTo(13.5117f, 11.726f, 13.4917f, 11.6196f, 13.503f, 11.5175f)
        curveTo(12.5088f, 12.16f, 11.66f, 13.0088f, 11.0175f, 14.003f)
        curveTo(11.1196f, 13.9917f, 11.2261f, 14.0117f, 11.3219f, 14.067f)
        lineTo(12.1879f, 14.567f)
        curveTo(12.4271f, 14.7051f, 12.509f, 15.0109f, 12.3709f, 15.25f)
        curveTo(12.2328f, 15.4892f, 11.9271f, 15.5711f, 11.6879f, 15.433f)
        lineTo(10.8219f, 14.933f)
        curveTo(10.7255f, 14.8774f, 10.6547f, 14.7946f, 10.6135f, 14.6999f)
        curveTo(10.0828f, 15.7273f, 9.7602f, 16.8789f, 9.7019f, 18.0986f)
        curveTo(9.7851f, 18.0367f, 9.8883f, 18f, 10.0001f, 18f)
        horizontalLineTo(11.0001f)
        curveTo(11.2762f, 18f, 11.5001f, 18.2239f, 11.5001f, 18.5f)
        curveTo(11.5001f, 18.7761f, 11.2762f, 19f, 11.0001f, 19f)
        horizontalLineTo(10.0001f)
        curveTo(9.8883f, 19f, 9.7851f, 18.9634f, 9.7019f, 18.9014f)
        curveTo(9.7602f, 20.1211f, 10.0828f, 21.2728f, 10.6135f, 22.3002f)
        curveTo(10.6547f, 22.2055f, 10.7256f, 22.1226f, 10.8219f, 22.067f)
        lineTo(11.6879f, 21.567f)
        curveTo(11.9271f, 21.429f, 12.2328f, 21.5109f, 12.3709f, 21.75f)
        curveTo(12.509f, 21.9892f, 12.4271f, 22.295f, 12.1879f, 22.433f)
        lineTo(11.3219f, 22.933f)
        curveTo(11.2261f, 22.9884f, 11.1196f, 23.0084f, 11.0175f, 22.9971f)
        curveTo(11.66f, 23.9913f, 12.5089f, 24.8401f, 13.503f, 25.4826f)
        curveTo(13.4918f, 25.3805f, 13.5118f, 25.274f, 13.5671f, 25.1782f)
        lineTo(14.0671f, 24.3122f)
        curveTo(14.2052f, 24.073f, 14.511f, 23.9911f, 14.7501f, 24.1292f)
        curveTo(14.9892f, 24.2672f, 15.0712f, 24.573f, 14.9331f, 24.8122f)
        lineTo(14.4331f, 25.6782f)
        curveTo(14.3775f, 25.7745f, 14.2947f, 25.8453f, 14.1999f, 25.8866f)
        curveTo(15.2273f, 26.4173f, 16.3789f, 26.7398f, 17.5986f, 26.7981f)
        curveTo(17.5367f, 26.7149f, 17.5001f, 26.6117f, 17.5001f, 26.5f)
        verticalLineTo(25.5f)
        curveTo(17.5001f, 25.2239f, 17.7239f, 25f, 18.0001f, 25f)
        curveTo(18.2762f, 25f, 18.5001f, 25.2239f, 18.5001f, 25.5f)
        verticalLineTo(26.5f)
        curveTo(18.5001f, 26.6117f, 18.4634f, 26.7149f, 18.4015f, 26.7981f)
        curveTo(19.6212f, 26.7398f, 20.7728f, 26.4172f, 21.8001f, 25.8865f)
        curveTo(21.7054f, 25.8453f, 21.6226f, 25.7745f, 21.567f, 25.6782f)
        lineTo(21.067f, 24.8122f)
        curveTo(20.929f, 24.573f, 21.0109f, 24.2672f, 21.25f, 24.1292f)
        curveTo(21.4892f, 23.9911f, 21.795f, 24.073f, 21.9331f, 24.3122f)
        lineTo(22.4331f, 25.1782f)
        curveTo(22.4883f, 25.274f, 22.5084f, 25.3804f, 22.4971f, 25.4825f)
        curveTo(23.4912f, 24.8401f, 24.3401f, 23.9912f, 24.9825f, 22.9971f)
        curveTo(24.8805f, 23.0083f, 24.774f, 22.9883f, 24.6783f, 22.933f)
        lineTo(23.8122f, 22.433f)
        curveTo(23.5731f, 22.295f, 23.4912f, 21.9892f, 23.6292f, 21.75f)
        curveTo(23.7673f, 21.5109f, 24.0731f, 21.429f, 24.3122f, 21.567f)
        lineTo(25.1783f, 22.067f)
        curveTo(25.2746f, 22.1226f, 25.3454f, 22.2054f, 25.3866f, 22.3001f)
        curveTo(25.9173f, 21.2727f, 26.2398f, 20.1211f, 26.2981f, 18.9015f)
        curveTo(26.2149f, 18.9634f, 26.1118f, 19f, 26.0001f, 19f)
        horizontalLineTo(25.0001f)
        curveTo(24.7239f, 19f, 24.5001f, 18.7761f, 24.5001f, 18.5f)
        curveTo(24.5001f, 18.2239f, 24.7239f, 18f, 25.0001f, 18f)
        horizontalLineTo(26.0001f)
        curveTo(26.1118f, 18f, 26.2149f, 18.0366f, 26.2981f, 18.0985f)
        curveTo(26.2398f, 16.8789f, 25.9173f, 15.7273f, 25.3866f, 14.7f)
        curveTo(25.3454f, 14.7947f, 25.2746f, 14.8775f, 25.1783f, 14.933f)
        lineTo(24.3122f, 15.433f)
        curveTo(24.0731f, 15.5711f, 23.7673f, 15.4892f, 23.6292f, 15.25f)
        curveTo(23.4912f, 15.0109f, 23.5731f, 14.7051f, 23.8122f, 14.567f)
        lineTo(24.6783f, 14.067f)
        curveTo(24.774f, 14.0117f, 24.8805f, 13.9917f, 24.9826f, 14.003f)
        curveTo(24.3401f, 13.0089f, 23.4913f, 12.16f, 22.4972f, 11.5175f)
        curveTo(22.5084f, 11.6196f, 22.4884f, 11.7261f, 22.4331f, 11.8218f)
        lineTo(21.9331f, 12.6878f)
        curveTo(21.795f, 12.927f, 21.4892f, 13.0089f, 21.2501f, 12.8709f)
        curveTo(21.011f, 12.7328f, 20.929f, 12.427f, 21.0671f, 12.1878f)
        lineTo(21.5671f, 11.3218f)
        curveTo(21.6227f, 11.2255f, 21.7055f, 11.1547f, 21.8001f, 11.1135f)
        curveTo(20.7728f, 10.5828f, 19.6212f, 10.2602f, 18.4015f, 10.2019f)
        curveTo(18.4634f, 10.2851f, 18.5001f, 10.3883f, 18.5001f, 10.5f)
        verticalLineTo(11.5f)
        curveTo(18.5001f, 11.7761f, 18.2762f, 12f, 18.0001f, 12f)
        curveTo(17.7239f, 12f, 17.5001f, 11.7761f, 17.5001f, 11.5f)
        verticalLineTo(10.5f)
        close()
        moveTo(18.2644f, 20.4953f)
        curveTo(18.5874f, 20.3207f, 18.7887f, 19.9829f, 18.7887f, 19.6157f)
        verticalLineTo(13.2969f)
        curveTo(18.7887f, 12.8567f, 18.4319f, 12.5f, 17.9918f, 12.5f)
        curveTo(17.5582f, 12.5f, 17.2041f, 12.8467f, 17.1951f, 13.2803f)
        lineTo(17.0887f, 18.3952f)
        curveTo(17.0814f, 18.7465f, 16.8902f, 19.0683f, 16.5851f, 19.2426f)
        lineTo(14.6571f, 20.3443f)
        curveTo(14.2106f, 20.5995f, 14.0582f, 21.17f, 14.3179f, 21.6138f)
        curveTo(14.5696f, 22.0439f, 15.117f, 22.1971f, 15.5554f, 21.9601f)
        lineTo(18.2644f, 20.4953f)
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
        moveTo(18f, 6.5f)
        curveTo(21.2053f, 6.5f, 24.2188f, 7.7482f, 26.4853f, 10.0147f)
        curveTo(28.7518f, 12.2812f, 30f, 15.2947f, 30f, 18.5f)
        curveTo(30f, 21.7053f, 28.7518f, 24.7188f, 26.4853f, 26.9853f)
        curveTo(24.2188f, 29.2518f, 21.2053f, 30.5f, 18f, 30.5f)
        curveTo(14.7947f, 30.5f, 11.7812f, 29.2518f, 9.5147f, 26.9853f)
        curveTo(7.2482f, 24.7188f, 6f, 21.7053f, 6f, 18.5f)
        curveTo(6f, 15.2947f, 7.2482f, 12.2812f, 9.5147f, 10.0147f)
        curveTo(11.7812f, 7.7482f, 14.7947f, 6.5f, 18f, 6.5f)
        close()
        moveTo(7.8461f, 18.5f)
        curveTo(7.8461f, 24.0989f, 12.4011f, 28.6538f, 18f, 28.6538f)
        curveTo(23.5989f, 28.6538f, 28.1538f, 24.0989f, 28.1538f, 18.5f)
        curveTo(28.1538f, 12.9011f, 23.5989f, 8.3462f, 18f, 8.3462f)
        curveTo(12.4011f, 8.3462f, 7.8461f, 12.9011f, 7.8461f, 18.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.SmallClock)
