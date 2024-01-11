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

val ToolbarTakIcons.Draw: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Draw",
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
        moveTo(34.5878f, 5.4995f)
        curveTo(34.9675f, 5.4995f, 35.2813f, 5.7817f, 35.331f, 6.1477f)
        lineTo(35.3378f, 6.2495f)
        verticalLineTo(25.8605f)
        curveTo(35.3378f, 26.2402f, 35.0556f, 26.554f, 34.6896f, 26.6037f)
        lineTo(34.5878f, 26.6105f)
        horizontalLineTo(28.2448f)
        curveTo(27.8306f, 26.6105f, 27.4948f, 26.2747f, 27.4948f, 25.8605f)
        curveTo(27.4948f, 25.4808f, 27.777f, 25.167f, 28.143f, 25.1174f)
        lineTo(28.2448f, 25.1105f)
        lineTo(33.837f, 25.11f)
        verticalLineTo(6.999f)
        horizontalLineTo(15.727f)
        lineTo(15.7278f, 12.5945f)
        curveTo(15.7278f, 12.9742f, 15.4456f, 13.288f, 15.0796f, 13.3377f)
        lineTo(14.9778f, 13.3445f)
        curveTo(14.5981f, 13.3445f, 14.2843f, 13.0624f, 14.2346f, 12.6963f)
        lineTo(14.2278f, 12.5945f)
        verticalLineTo(6.2495f)
        curveTo(14.2278f, 5.8698f, 14.51f, 5.556f, 14.876f, 5.5064f)
        lineTo(14.9778f, 5.4995f)
        horizontalLineTo(34.5878f)
        close()
        moveTo(5.0f, 25.2833f)
        curveTo(5.0f, 19.4541f, 9.7258f, 14.7283f, 15.555f, 14.7283f)
        curveTo(21.3844f, 14.7283f, 26.111f, 19.4543f, 26.111f, 25.2833f)
        curveTo(26.111f, 31.1124f, 21.3844f, 35.8383f, 15.555f, 35.8383f)
        curveTo(9.7258f, 35.8383f, 5.0f, 31.1125f, 5.0f, 25.2833f)
        close()
        moveTo(24.611f, 25.2833f)
        curveTo(24.611f, 20.2827f, 20.556f, 16.2283f, 15.555f, 16.2283f)
        curveTo(10.5542f, 16.2283f, 6.5f, 20.2825f, 6.5f, 25.2833f)
        curveTo(6.5f, 30.2841f, 10.5542f, 34.3383f, 15.555f, 34.3383f)
        curveTo(20.556f, 34.3383f, 24.611f, 30.2839f, 24.611f, 25.2833f)
        close()
        moveTo(19.7563f, 21.0827f)
        curveTo(19.4634f, 20.7898f, 18.9885f, 20.7898f, 18.6956f, 21.0826f)
        lineTo(11.3536f, 28.4236f)
        lineTo(11.281f, 28.5078f)
        curveTo(11.0631f, 28.8014f, 11.0873f, 29.218f, 11.3535f, 29.4843f)
        curveTo(11.6464f, 29.7772f, 12.1213f, 29.7773f, 12.4142f, 29.4844f)
        lineTo(19.7562f, 22.1434f)
        lineTo(19.8288f, 22.0593f)
        curveTo(20.0467f, 21.7657f, 20.0225f, 21.349f, 19.7563f, 21.0827f)
        close()
        moveTo(14.2092f, 19.8591f)
        curveTo(14.5021f, 19.5662f, 14.9769f, 19.5662f, 15.2698f, 19.8591f)
        curveTo(15.5361f, 20.1253f, 15.5603f, 20.542f, 15.3424f, 20.8356f)
        lineTo(15.2698f, 20.9197f)
        lineTo(11.1918f, 24.9977f)
        curveTo(10.8989f, 25.2906f, 10.4241f, 25.2906f, 10.1312f, 24.9977f)
        curveTo(9.8649f, 24.7315f, 9.8407f, 24.3148f, 10.0586f, 24.0212f)
        lineTo(10.1312f, 23.9371f)
        lineTo(14.2092f, 19.8591f)
        close()
        moveTo(20.9798f, 25.5686f)
        curveTo(20.6869f, 25.2757f, 20.2121f, 25.2757f, 19.9192f, 25.5686f)
        lineTo(15.8402f, 29.6476f)
        lineTo(15.7676f, 29.7317f)
        curveTo(15.5497f, 30.0253f, 15.5739f, 30.442f, 15.8402f, 30.7082f)
        curveTo(16.1331f, 31.0011f, 16.6079f, 31.0011f, 16.9008f, 30.7082f)
        lineTo(20.9798f, 26.6292f)
        lineTo(21.0524f, 26.5451f)
        curveTo(21.2703f, 26.2515f, 21.2461f, 25.8348f, 20.9798f, 25.5686f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
