package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

val SideMenuTakIcons.SyncSuccess: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "SyncSuccess",
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
        moveTo(7.1544f, 26.3675f)
        lineTo(7.7701f, 23.9725f)
        curveTo(9.6039f, 27.6324f, 13.3611f, 30f, 17.5469f, 30f)
        curveTo(18.5562f, 30f, 19.5394f, 29.8634f, 20.4761f, 29.605f)
        curveTo(20.1123f, 29.3179f, 19.78f, 28.9928f, 19.4851f, 28.6356f)
        curveTo(18.8564f, 28.7616f, 18.2079f, 28.8272f, 17.5469f, 28.8272f)
        curveTo(13.7914f, 28.8272f, 10.4226f, 26.6924f, 8.7945f, 23.3987f)
        lineTo(11.5066f, 24.4741f)
        curveTo(11.8068f, 24.5938f, 12.1477f, 24.446f, 12.2673f, 24.145f)
        curveTo(12.2954f, 24.0746f, 12.3087f, 24.0011f, 12.3087f, 23.9292f)
        curveTo(12.3087f, 23.6962f, 12.1688f, 23.4757f, 11.9381f, 23.3842f)
        lineTo(7.9444f, 21.7994f)
        curveTo(7.8497f, 21.762f, 7.7511f, 21.7509f, 7.6566f, 21.7627f)
        curveTo(7.3677f, 21.7264f, 7.0895f, 21.9092f, 7.0144f, 22.1986f)
        lineTo(6.0183f, 26.075f)
        curveTo(5.9386f, 26.3862f, 6.1262f, 26.7083f, 6.4398f, 26.7897f)
        curveTo(6.7533f, 26.8694f, 7.0731f, 26.681f, 7.1544f, 26.3675f)
        close()
        moveTo(26.6517f, 15.5353f)
        lineTo(24.2536f, 14.0093f)
        curveTo(23.98f, 13.835f, 23.618f, 13.9163f, 23.4436f, 14.1892f)
        curveTo(23.2693f, 14.4628f, 23.3498f, 14.8256f, 23.6234f, 14.9992f)
        lineTo(27.2481f, 17.3056f)
        curveTo(27.3338f, 17.36f, 27.4282f, 17.3894f, 27.5228f, 17.3958f)
        curveTo(27.8003f, 17.4869f, 28.1081f, 17.3589f, 28.2361f, 17.0885f)
        lineTo(29.9437f, 13.4685f)
        curveTo(29.982f, 13.388f, 30f, 13.302f, 30f, 13.2191f)
        curveTo(30f, 12.9994f, 29.8757f, 12.7875f, 29.6638f, 12.6875f)
        curveTo(29.3706f, 12.5499f, 29.0219f, 12.6757f, 28.8835f, 12.9682f)
        lineTo(27.8029f, 15.2589f)
        curveTo(26.2197f, 10.9675f, 22.1784f, 8.1284f, 17.5472f, 8.1284f)
        curveTo(12.8123f, 8.1284f, 8.6372f, 11.1479f, 7.1579f, 15.642f)
        curveTo(7.0563f, 15.9523f, 7.2236f, 16.2807f, 7.5317f, 16.3816f)
        curveTo(7.8389f, 16.4832f, 8.1704f, 16.3159f, 8.2713f, 16.0086f)
        curveTo(9.5926f, 11.997f, 13.3197f, 9.3011f, 17.5472f, 9.3011f)
        curveTo(21.5669f, 9.3011f, 25.2105f, 11.8308f, 26.6517f, 15.5353f)
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
        moveTo(25f, 30f)
        curveTo(28.3137f, 30f, 31f, 27.3137f, 31f, 24f)
        curveTo(31f, 20.6863f, 28.3137f, 18f, 25f, 18f)
        curveTo(21.6863f, 18f, 19f, 20.6863f, 19f, 24f)
        curveTo(19f, 27.3137f, 21.6863f, 30f, 25f, 30f)
        close()
        moveTo(28.7965f, 22.0399f)
        curveTo(29.0487f, 21.7113f, 28.9868f, 21.2405f, 28.6582f, 20.9884f)
        curveTo(28.3296f, 20.7362f, 27.8588f, 20.7981f, 27.6066f, 21.1267f)
        lineTo(24.0185f, 25.802f)
        lineTo(22.514f, 24.386f)
        curveTo(22.2124f, 24.1021f, 21.7377f, 24.1165f, 21.4538f, 24.4181f)
        curveTo(21.17f, 24.7198f, 21.1843f, 25.1944f, 21.486f, 25.4783f)
        lineTo(23.5945f, 27.4628f)
        curveTo(23.7489f, 27.6081f, 23.9576f, 27.6813f, 24.1689f, 27.6642f)
        curveTo(24.3802f, 27.6472f, 24.5744f, 27.5415f, 24.7035f, 27.3733f)
        lineTo(28.7965f, 22.0399f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
