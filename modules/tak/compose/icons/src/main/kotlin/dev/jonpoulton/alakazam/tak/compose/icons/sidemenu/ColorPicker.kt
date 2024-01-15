package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.ColorPicker: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "ColorPicker",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      group {
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(26.3139f, 8f)
          horizontalLineTo(25.4587f)
          curveTo(24.4904f, 8.263f, 23.7347f, 8.8515f, 23.0478f, 9.5556f)
          curveTo(22.3376f, 10.2831f, 21.6065f, 10.9908f, 20.8975f, 11.7195f)
          curveTo(20.6972f, 11.9259f, 20.5411f, 12.0525f, 20.2413f, 11.8608f)
          curveTo(19.7866f, 11.5708f, 19.3431f, 11.6912f, 18.9609f, 12.0316f)
          curveTo(18.6574f, 12.3019f, 18.3711f, 12.5907f, 18.0823f, 12.8782f)
          curveTo(17.1055f, 13.8514f, 17.1386f, 14.3356f, 18.2298f, 15.1625f)
          curveTo(18.2138f, 15.1994f, 18.2052f, 15.2436f, 18.1794f, 15.2694f)
          curveTo(15.2512f, 18.1804f, 12.3218f, 21.0889f, 9.3937f, 23.9999f)
          curveTo(8.8235f, 24.5664f, 8.3689f, 25.2127f, 8.1452f, 25.9893f)
          curveTo(7.9855f, 26.5447f, 7.7188f, 27.0362f, 7.3981f, 27.5056f)
          curveTo(6.8575f, 28.2957f, 6.8673f, 29.0022f, 7.4215f, 29.5392f)
          curveTo(7.9879f, 30.0885f, 8.6847f, 30.0848f, 9.4576f, 29.5122f)
          curveTo(9.7844f, 29.2701f, 10.0965f, 28.9949f, 10.5045f, 28.9113f)
          curveTo(11.5379f, 28.7f, 12.3587f, 28.1433f, 13.096f, 27.4122f)
          curveTo(15.8091f, 24.7175f, 18.5333f, 22.0351f, 21.255f, 19.3477f)
          curveTo(21.448f, 19.1573f, 21.6519f, 18.9754f, 21.851f, 18.7887f)
          curveTo(22.5698f, 19.682f, 23.0982f, 19.8466f, 23.7077f, 19.3207f)
          curveTo(24.2287f, 18.871f, 24.6993f, 18.3586f, 25.1675f, 17.8511f)
          curveTo(25.4157f, 17.5832f, 25.5508f, 17.2121f, 25.3174f, 16.9025f)
          curveTo(24.9745f, 16.4478f, 25.2252f, 16.2193f, 25.5213f, 15.9072f)
          curveTo(26.7366f, 14.6231f, 28.2443f, 13.5909f, 28.9988f, 11.9063f)
          verticalLineTo(10.8078f)
          curveTo(28.8636f, 9.4487f, 27.743f, 8.1524f, 26.3127f, 8f)
          lineTo(26.3139f, 8f)
          close()
          moveTo(20.7267f, 18.4114f)
          curveTo(17.871f, 21.2462f, 15.0239f, 24.092f, 12.1695f, 26.9293f)
          curveTo(11.8377f, 27.2586f, 11.4555f, 27.5363f, 11.0046f, 27.685f)
          curveTo(10.2133f, 27.9455f, 9.4649f, 28.292f, 8.7707f, 28.754f)
          curveTo(8.6724f, 28.8191f, 8.5556f, 28.856f, 8.4598f, 28.9002f)
          curveTo(8.0936f, 28.7958f, 7.9916f, 28.5537f, 8.2104f, 28.3055f)
          curveTo(8.8063f, 27.626f, 9.0607f, 26.8027f, 9.3175f, 25.9696f)
          curveTo(9.4637f, 25.4953f, 9.7758f, 25.1144f, 10.1236f, 24.7679f)
          curveTo(12.9252f, 21.965f, 15.7317f, 19.1647f, 18.5259f, 16.3544f)
          curveTo(18.768f, 16.1111f, 18.913f, 16.0153f, 19.1895f, 16.3237f)
          curveTo(19.6773f, 16.8681f, 20.2032f, 17.3792f, 20.734f, 17.8818f)
          curveTo(20.9552f, 18.0907f, 20.9319f, 18.2087f, 20.7267f, 18.4126f)
          verticalLineTo(18.4114f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.ColorPicker)
