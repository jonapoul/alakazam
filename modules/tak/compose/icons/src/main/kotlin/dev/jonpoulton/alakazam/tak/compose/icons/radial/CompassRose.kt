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

public val RadialTakIcons.CompassRose: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "CompassRose",
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
        moveTo(16.75f, 3.5f)
        curveTo(9.1561f, 3.5f, 3f, 9.6561f, 3f, 17.25f)
        curveTo(3f, 24.8439f, 9.1561f, 31f, 16.75f, 31f)
        curveTo(24.3439f, 31f, 30.5f, 24.8439f, 30.5f, 17.25f)
        curveTo(30.5f, 9.6561f, 24.3439f, 3.5f, 16.75f, 3.5f)
        close()
        moveTo(16.75f, 5f)
        curveTo(23.5155f, 5f, 29f, 10.4845f, 29f, 17.25f)
        curveTo(29f, 24.0155f, 23.5155f, 29.5f, 16.75f, 29.5f)
        curveTo(9.9845f, 29.5f, 4.5f, 24.0155f, 4.5f, 17.25f)
        curveTo(4.5f, 10.4845f, 9.9845f, 5f, 16.75f, 5f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(16.75f, 17.25f)
        lineTo(13.75f, 25.25f)
        lineTo(16.6087f, 22.9208f)
        lineTo(19.75f, 25.25f)
        lineTo(16.75f, 17.25f)
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
        moveTo(16.75f, 17.25f)
        lineTo(13.75f, 25.25f)
        lineTo(16.6087f, 22.9208f)
        lineTo(19.75f, 25.25f)
        lineTo(16.75f, 17.25f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(15.0579f, 14.2932f)
        curveTo(15.3603f, 14.2932f, 15.6051f, 14.0484f, 15.6051f, 13.746f)
        verticalLineTo(11.046f)
        lineTo(17.8227f, 13.9548f)
        curveTo(17.9739f, 14.1492f, 18.1323f, 14.2788f, 18.3987f, 14.2788f)
        horizontalLineTo(18.4347f)
        curveTo(18.7443f, 14.2788f, 18.9891f, 14.034f, 18.9891f, 13.7244f)
        verticalLineTo(9.714f)
        curveTo(18.9891f, 9.4116f, 18.7443f, 9.1668f, 18.4419f, 9.1668f)
        curveTo(18.1395f, 9.1668f, 17.8947f, 9.4116f, 17.8947f, 9.714f)
        verticalLineTo(12.3132f)
        lineTo(15.7563f, 9.5052f)
        curveTo(15.6051f, 9.3108f, 15.4467f, 9.1812f, 15.1803f, 9.1812f)
        horizontalLineTo(15.0651f)
        curveTo(14.7555f, 9.1812f, 14.5107f, 9.426f, 14.5107f, 9.7356f)
        verticalLineTo(13.746f)
        curveTo(14.5107f, 14.0484f, 14.7555f, 14.2932f, 15.0579f, 14.2932f)
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
        moveTo(15.0579f, 14.2932f)
        curveTo(15.3603f, 14.2932f, 15.6051f, 14.0484f, 15.6051f, 13.746f)
        verticalLineTo(11.046f)
        lineTo(17.8227f, 13.9548f)
        curveTo(17.9739f, 14.1492f, 18.1323f, 14.2788f, 18.3987f, 14.2788f)
        horizontalLineTo(18.4347f)
        curveTo(18.7443f, 14.2788f, 18.9891f, 14.034f, 18.9891f, 13.7244f)
        verticalLineTo(9.714f)
        curveTo(18.9891f, 9.4116f, 18.7443f, 9.1668f, 18.4419f, 9.1668f)
        curveTo(18.1395f, 9.1668f, 17.8947f, 9.4116f, 17.8947f, 9.714f)
        verticalLineTo(12.3132f)
        lineTo(15.7563f, 9.5052f)
        curveTo(15.6051f, 9.3108f, 15.4467f, 9.1812f, 15.1803f, 9.1812f)
        horizontalLineTo(15.0651f)
        curveTo(14.7555f, 9.1812f, 14.5107f, 9.426f, 14.5107f, 9.7356f)
        verticalLineTo(13.746f)
        curveTo(14.5107f, 14.0484f, 14.7555f, 14.2932f, 15.0579f, 14.2932f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
