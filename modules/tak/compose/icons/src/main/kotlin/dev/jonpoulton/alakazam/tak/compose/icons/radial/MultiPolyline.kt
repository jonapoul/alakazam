package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.MultiPolyline: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "MultiPolyline",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Round,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(29.3494f, 23.9762f)
        lineTo(27.6625f, 22.2893f)
        lineTo(25.2364f, 24.7146f)
        lineTo(22.8111f, 22.2893f)
        lineTo(21.1243f, 23.9762f)
        lineTo(23.5495f, 26.4023f)
        lineTo(21.1243f, 28.8267f)
        lineTo(22.8111f, 30.5144f)
        lineTo(25.2364f, 28.0892f)
        lineTo(27.6625f, 30.5144f)
        lineTo(29.3494f, 28.8267f)
        lineTo(26.9233f, 26.4023f)
        lineTo(29.3494f, 23.9762f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Round,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(12.3362f, 6.9629f)
        lineTo(10.6493f, 5.276f)
        lineTo(8.2232f, 7.7013f)
        lineTo(5.798f, 5.276f)
        lineTo(4.1111f, 6.9629f)
        lineTo(6.5363f, 9.389f)
        lineTo(4.1111f, 11.8134f)
        lineTo(5.798f, 13.5011f)
        lineTo(8.2232f, 11.0759f)
        lineTo(10.6493f, 13.5011f)
        lineTo(12.3362f, 11.8134f)
        lineTo(9.9101f, 9.389f)
        lineTo(12.3362f, 6.9629f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(12.778f, 26.5431f)
        curveTo(12.778f, 28.9675f, 10.8121f, 30.9317f, 8.3886f, 30.9317f)
        curveTo(5.965f, 30.9317f, 4f, 28.9675f, 4f, 26.5431f)
        curveTo(4f, 24.1187f, 5.965f, 22.1537f, 8.3886f, 22.1537f)
        curveTo(10.8121f, 22.1537f, 12.778f, 24.1187f, 12.778f, 26.5431f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = StrokeCap.Companion.Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(13.3573f, 19.312f)
        lineTo(19.9011f, 9.3652f)
        lineTo(25.5943f, 9.3655f)
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
        moveTo(30.9999f, 9.3649f)
        lineTo(23.3823f, 12.4771f)
        lineTo(25.1899f, 9.3655f)
        lineTo(23.3823f, 6.2527f)
        lineTo(30.9999f, 9.3649f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
