package dev.jonpoulton.alakazam.tak.compose.icons.radial

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
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

val RadialTakIcons.FovSize: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "FovSize",
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
        moveTo(9.6748f, 5.0269f)
        lineTo(9.1966f, 5.1277f)
        lineTo(4f, 29.7685f)
        lineTo(28.6399f, 24.5719f)
        lineTo(28.7407f, 24.0937f)
        curveTo(31.5355f, 10.8409f, 22.9273f, 2.2322f, 9.6748f, 5.0269f)
        close()
        moveTo(27.3678f, 23.3067f)
        lineTo(5.9428f, 27.8247f)
        lineTo(10.4608f, 6.3987f)
        lineTo(10.7103f, 6.3526f)
        curveTo(22.2387f, 4.2753f, 29.4923f, 11.5294f, 27.415f, 23.0581f)
        lineTo(27.3678f, 23.3067f)
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
        moveTo(15.1738f, 10.4024f)
        lineTo(15.5076f, 8.94f)
        lineTo(15.7539f, 9.0024f)
        curveTo(16.077f, 9.0909f, 16.5214f, 9.2355f, 17.0538f, 9.4462f)
        curveTo(18.1874f, 9.8948f, 19.3207f, 10.4951f, 20.3819f, 11.2705f)
        curveTo(22.7805f, 13.0231f, 24.451f, 15.3978f, 25.0493f, 18.4655f)
        lineTo(25.1159f, 18.837f)
        lineTo(23.6357f, 19.0796f)
        curveTo(23.1716f, 16.2486f, 21.692f, 14.0855f, 19.497f, 12.4816f)
        curveTo(18.5462f, 11.7869f, 17.5238f, 11.2454f, 16.5018f, 10.841f)
        curveTo(16.2343f, 10.7351f, 15.9817f, 10.6447f, 15.7478f, 10.5689f)
        lineTo(15.3402f, 10.4456f)
        lineTo(15.1738f, 10.4024f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(11.6238f, 8.8222f)
        lineTo(16.3731f, 12.1585f)
        lineTo(15.618f, 9.7348f)
        lineTo(17.3496f, 7.8781f)
        lineTo(11.6238f, 8.8222f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(24.9918f, 22.7204f)
        lineTo(21.957f, 17.774f)
        lineTo(24.3294f, 18.6776f)
        lineTo(26.2887f, 17.0639f)
        lineTo(24.9918f, 22.7204f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
