package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons

val MarkersTakIcons.TeamHuman: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "TeamHuman",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
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
        moveTo(22.9536f, 7.218f)
        curveTo(18.2672f, 3.8782f, 11.7191f, 4.3105f, 7.5146f, 8.5149f)
        curveTo(3.3102f, 12.7194f, 2.8779f, 19.2676f, 6.2177f, 23.954f)
        lineTo(22.9536f, 7.218f)
        close()
        moveTo(9.0461f, 26.7824f)
        curveTo(13.7326f, 30.1222f, 20.2807f, 29.6899f, 24.4852f, 25.4855f)
        curveTo(28.6896f, 21.281f, 29.1219f, 14.7329f, 25.7821f, 10.0465f)
        lineTo(9.0461f, 26.7824f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(22.9536f, 7.218f)
        lineTo(23.484f, 7.7484f)
        lineTo(24.1107f, 7.1217f)
        lineTo(23.3889f, 6.6073f)
        lineTo(22.9536f, 7.218f)
        close()
        moveTo(6.2177f, 23.954f)
        lineTo(5.6069f, 24.3892f)
        lineTo(6.1213f, 25.111f)
        lineTo(6.748f, 24.4843f)
        lineTo(6.2177f, 23.954f)
        close()
        moveTo(9.0461f, 26.7824f)
        lineTo(8.5158f, 26.2521f)
        lineTo(7.8891f, 26.8788f)
        lineTo(8.6109f, 27.3932f)
        lineTo(9.0461f, 26.7824f)
        close()
        moveTo(25.7821f, 10.0465f)
        lineTo(26.3928f, 9.6112f)
        lineTo(25.8784f, 8.8894f)
        lineTo(25.2517f, 9.5161f)
        lineTo(25.7821f, 10.0465f)
        close()
        moveTo(8.0449f, 9.0453f)
        curveTo(11.9861f, 5.1041f, 18.1253f, 4.698f, 22.5184f, 7.8288f)
        lineTo(23.3889f, 6.6073f)
        curveTo(18.4091f, 3.0583f, 11.452f, 3.5168f, 6.9843f, 7.9846f)
        lineTo(8.0449f, 9.0453f)
        close()
        moveTo(6.8285f, 23.5187f)
        curveTo(3.6977f, 19.1256f, 4.1038f, 12.9864f, 8.0449f, 9.0453f)
        lineTo(6.9843f, 7.9846f)
        curveTo(2.5165f, 12.4524f, 2.058f, 19.4095f, 5.6069f, 24.3892f)
        lineTo(6.8285f, 23.5187f)
        close()
        moveTo(6.748f, 24.4843f)
        lineTo(23.484f, 7.7484f)
        lineTo(22.4233f, 6.6877f)
        lineTo(5.6874f, 23.4236f)
        lineTo(6.748f, 24.4843f)
        close()
        moveTo(23.9548f, 24.9552f)
        curveTo(20.0137f, 28.8963f, 13.8745f, 29.3024f, 9.4814f, 26.1716f)
        lineTo(8.6109f, 27.3932f)
        curveTo(13.5906f, 30.9421f, 20.5477f, 30.4836f, 25.0155f, 26.0158f)
        lineTo(23.9548f, 24.9552f)
        close()
        moveTo(25.1713f, 10.4817f)
        curveTo(28.3021f, 14.8748f, 27.896f, 21.014f, 23.9548f, 24.9552f)
        lineTo(25.0155f, 26.0158f)
        curveTo(29.4833f, 21.5481f, 29.9418f, 14.591f, 26.3928f, 9.6112f)
        lineTo(25.1713f, 10.4817f)
        close()
        moveTo(25.2517f, 9.5161f)
        lineTo(8.5158f, 26.2521f)
        lineTo(9.5765f, 27.3127f)
        lineTo(26.3124f, 10.5768f)
        lineTo(25.2517f, 9.5161f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
