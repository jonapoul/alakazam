package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.PairingLineToSelf: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "PairingLineToSelf",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp, viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(14.4326f, 20.8668f)
        lineTo(19.6126f, 15.6868f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(9.41f, 26.5113f)
        lineTo(8.155f, 31.2993f)
        lineTo(6.078f, 26.1993f)
        lineTo(4f, 21.1013f)
        lineTo(9.099f, 23.1783f)
        lineTo(14.198f, 25.2563f)
        lineTo(9.41f, 26.5113f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(30.7996f, 6.483f)
        lineTo(28.8166f, 4.5f)
        lineTo(25.9646f, 7.351f)
        lineTo(23.1136f, 4.5f)
        lineTo(21.1306f, 6.483f)
        lineTo(23.9816f, 9.335f)
        lineTo(21.1306f, 12.185f)
        lineTo(23.1136f, 14.169f)
        lineTo(25.9646f, 11.318f)
        lineTo(28.8166f, 14.169f)
        lineTo(30.7996f, 12.185f)
        lineTo(27.9476f, 9.335f)
        lineTo(30.7996f, 6.483f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
