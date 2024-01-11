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

val SideMenuTakIcons.Opacity: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Opacity",
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
        moveTo(18.0002f, 29.9994f)
        curveTo(17.9945f, 29.9996f, 17.9889f, 29.9998f, 17.9832f, 30f)
        curveTo(17.2532f, 29.9989f, 16.5407f, 29.9268f, 15.8521f, 29.7906f)
        lineTo(15.7551f, 30.2811f)
        lineTo(15.6581f, 30.7716f)
        curveTo(16.4155f, 30.9214f, 17.1986f, 31f, 18f, 31f)
        curveTo(18.0001f, 31f, 18.0001f, 31f, 18.0002f, 31f)
        curveTo(24.6276f, 31f, 30.0002f, 25.6274f, 30.0002f, 19f)
        curveTo(30.0002f, 12.3726f, 24.6276f, 7f, 18.0002f, 7f)
        curveTo(18.0001f, 7f, 18.0001f, 7f, 18f, 7f)
        curveTo(17.1986f, 7f, 16.4155f, 7.0786f, 15.6581f, 7.2284f)
        lineTo(15.7551f, 7.7189f)
        lineTo(15.8521f, 8.2094f)
        curveTo(16.5407f, 8.0732f, 17.2532f, 8.0011f, 17.9832f, 8f)
        curveTo(17.9889f, 8.0002f, 17.9945f, 8.0004f, 18.0002f, 8.0006f)
        verticalLineTo(29.9994f)
        close()
        moveTo(11.6108f, 28.5633f)
        lineTo(11.3326f, 28.9788f)
        curveTo(10.024f, 28.1027f, 8.8973f, 26.976f, 8.0212f, 25.6674f)
        lineTo(8.4367f, 25.3892f)
        lineTo(8.8522f, 25.1111f)
        curveTo(9.6556f, 26.3111f, 10.6889f, 27.3444f, 11.8889f, 28.1478f)
        lineTo(11.6108f, 28.5633f)
        close()
        moveTo(6f, 19f)
        curveTo(6f, 19.8014f, 6.0786f, 20.5845f, 6.2284f, 21.3419f)
        lineTo(6.7189f, 21.2449f)
        lineTo(7.2094f, 21.1479f)
        curveTo(7.0721f, 20.454f, 7f, 19.7359f, 7f, 19f)
        curveTo(7f, 18.2641f, 7.0721f, 17.546f, 7.2094f, 16.8521f)
        lineTo(6.7189f, 16.7551f)
        lineTo(6.2284f, 16.6581f)
        curveTo(6.0786f, 17.4155f, 6f, 18.1986f, 6f, 19f)
        close()
        moveTo(8.4367f, 12.6108f)
        lineTo(8.0212f, 12.3326f)
        curveTo(8.8973f, 11.024f, 10.024f, 9.8973f, 11.3326f, 9.0212f)
        lineTo(11.6108f, 9.4367f)
        lineTo(11.8889f, 9.8522f)
        curveTo(10.6889f, 10.6556f, 9.6556f, 11.6889f, 8.8522f, 12.8889f)
        lineTo(8.4367f, 12.6108f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
