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

public val RadialTakIcons.Nm: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Nm",
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
        moveTo(10.6841f, 20.908f)
        curveTo(11.0621f, 20.908f, 11.3681f, 20.602f, 11.3681f, 20.224f)
        verticalLineTo(16.849f)
        lineTo(14.1401f, 20.485f)
        curveTo(14.3291f, 20.728f, 14.5271f, 20.89f, 14.8601f, 20.89f)
        horizontalLineTo(14.9051f)
        curveTo(15.2921f, 20.89f, 15.5981f, 20.584f, 15.5981f, 20.197f)
        verticalLineTo(15.184f)
        curveTo(15.5981f, 14.806f, 15.2921f, 14.5f, 14.9141f, 14.5f)
        curveTo(14.5361f, 14.5f, 14.2301f, 14.806f, 14.2301f, 15.184f)
        verticalLineTo(18.433f)
        lineTo(11.5571f, 14.923f)
        curveTo(11.3681f, 14.68f, 11.1701f, 14.518f, 10.8371f, 14.518f)
        horizontalLineTo(10.6931f)
        curveTo(10.3061f, 14.518f, 10.0001f, 14.824f, 10.0001f, 15.211f)
        verticalLineTo(20.224f)
        curveTo(10.0001f, 20.602f, 10.3061f, 20.908f, 10.6841f, 20.908f)
        close()
        moveTo(23.0921f, 20.908f)
        curveTo(23.4791f, 20.908f, 23.7851f, 20.602f, 23.7851f, 20.215f)
        verticalLineTo(15.211f)
        curveTo(23.7851f, 14.824f, 23.4791f, 14.518f, 23.0921f, 14.518f)
        horizontalLineTo(22.9391f)
        curveTo(22.6601f, 14.518f, 22.4621f, 14.635f, 22.3181f, 14.869f)
        lineTo(20.6351f, 17.605f)
        lineTo(18.9611f, 14.878f)
        curveTo(18.8351f, 14.671f, 18.6281f, 14.518f, 18.3311f, 14.518f)
        horizontalLineTo(18.1781f)
        curveTo(17.7911f, 14.518f, 17.4851f, 14.824f, 17.4851f, 15.211f)
        verticalLineTo(20.233f)
        curveTo(17.4851f, 20.611f, 17.7821f, 20.908f, 18.1601f, 20.908f)
        curveTo(18.5381f, 20.908f, 18.8441f, 20.611f, 18.8441f, 20.233f)
        verticalLineTo(17.101f)
        lineTo(20.0411f, 18.946f)
        curveTo(20.1851f, 19.162f, 20.3651f, 19.297f, 20.6171f, 19.297f)
        curveTo(20.8691f, 19.297f, 21.0491f, 19.162f, 21.1931f, 18.946f)
        lineTo(22.4081f, 17.074f)
        verticalLineTo(20.215f)
        curveTo(22.4081f, 20.593f, 22.7141f, 20.908f, 23.0921f, 20.908f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
