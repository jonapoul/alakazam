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
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.SyncFailed: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "SyncFailed",
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
        curveTo(18.6426f, 30f, 19.7074f, 29.839f, 20.7155f, 29.536f)
        curveTo(20.3507f, 29.2533f, 20.0146f, 28.9353f, 19.7124f, 28.5872f)
        curveTo(19.013f, 28.7448f, 18.2879f, 28.8272f, 17.5469f, 28.8272f)
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
        moveTo(31f, 24f)
        curveTo(31f, 27.3137f, 28.3137f, 30f, 25f, 30f)
        curveTo(21.6863f, 30f, 19f, 27.3137f, 19f, 24f)
        curveTo(19f, 20.6863f, 21.6863f, 18f, 25f, 18f)
        curveTo(28.3137f, 18f, 31f, 20.6863f, 31f, 24f)
        close()
        moveTo(21.895f, 27.105f)
        curveTo(22.1879f, 27.3979f, 22.6627f, 27.3979f, 22.9556f, 27.105f)
        lineTo(25f, 25.0607f)
        lineTo(27.0444f, 27.105f)
        curveTo(27.3373f, 27.3979f, 27.8121f, 27.3979f, 28.105f, 27.105f)
        curveTo(28.3979f, 26.8121f, 28.3979f, 26.3373f, 28.105f, 26.0444f)
        lineTo(26.0607f, 24f)
        lineTo(28.105f, 21.9556f)
        curveTo(28.3979f, 21.6627f, 28.3979f, 21.1879f, 28.105f, 20.895f)
        curveTo(27.8121f, 20.6021f, 27.3373f, 20.6021f, 27.0444f, 20.895f)
        lineTo(25f, 22.9393f)
        lineTo(22.9556f, 20.895f)
        curveTo(22.6627f, 20.6021f, 22.1879f, 20.6021f, 21.895f, 20.895f)
        curveTo(21.6021f, 21.1879f, 21.6021f, 21.6627f, 21.895f, 21.9556f)
        lineTo(23.9393f, 24f)
        lineTo(21.895f, 26.0444f)
        curveTo(21.6021f, 26.3373f, 21.6021f, 26.8121f, 21.895f, 27.105f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.SyncFailed)
