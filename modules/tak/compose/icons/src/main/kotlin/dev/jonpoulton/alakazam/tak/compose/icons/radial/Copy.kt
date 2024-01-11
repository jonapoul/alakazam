package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

val RadialTakIcons.Copy: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Copy",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(9.95f, 11.3f)
        verticalLineTo(12.8f)
        horizontalLineTo(8.3167f)
        curveTo(7.3639f, 12.8f, 6.5819f, 13.5288f, 6.506f, 14.4503f)
        lineTo(6.5f, 14.5973f)
        verticalLineTo(27.1026f)
        curveTo(6.5f, 28.0428f, 7.2344f, 28.8188f, 8.1678f, 28.894f)
        lineTo(8.3167f, 28.9f)
        horizontalLineTo(19.9833f)
        curveTo(20.9361f, 28.9f, 21.7181f, 28.1711f, 21.794f, 27.2496f)
        lineTo(21.8f, 27.1026f)
        verticalLineTo(25.4816f)
        horizontalLineTo(23.3f)
        verticalLineTo(27.1026f)
        curveTo(23.3f, 28.8605f, 21.913f, 30.2978f, 20.1712f, 30.3948f)
        lineTo(19.9833f, 30.4f)
        horizontalLineTo(8.3167f)
        curveTo(6.5509f, 30.4f, 5.103f, 29.0234f, 5.0053f, 27.2896f)
        lineTo(5f, 27.1026f)
        verticalLineTo(14.5973f)
        curveTo(5f, 12.8393f, 6.387f, 11.4022f, 8.1288f, 11.3052f)
        lineTo(8.3167f, 11.3f)
        horizontalLineTo(9.95f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(25.3376f, 5.5f)
        horizontalLineTo(15.3626f)
        curveTo(13.5082f, 5.5f, 12f, 6.9817f, 12f, 8.8167f)
        verticalLineTo(20.4833f)
        curveTo(12f, 22.3183f, 13.5082f, 23.8f, 15.3626f, 23.8f)
        horizontalLineTo(25.3376f)
        curveTo(27.1918f, 23.8f, 28.7f, 22.3182f, 28.7f, 20.4833f)
        verticalLineTo(8.8167f)
        curveTo(28.7f, 6.9818f, 27.1918f, 5.5f, 25.3376f, 5.5f)
        close()
        moveTo(15.3626f, 7f)
        horizontalLineTo(25.3376f)
        curveTo(26.3693f, 7f, 27.2f, 7.8162f, 27.2f, 8.8167f)
        verticalLineTo(20.4833f)
        curveTo(27.2f, 21.4838f, 26.3693f, 22.3f, 25.3376f, 22.3f)
        horizontalLineTo(15.3626f)
        curveTo(14.3307f, 22.3f, 13.5f, 21.4838f, 13.5f, 20.4833f)
        verticalLineTo(8.8167f)
        curveTo(13.5f, 7.8162f, 14.3307f, 7f, 15.3626f, 7f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
