package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons

public val MarkersTakIcons.DoubleRoundYellow: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "DoubleRoundYellow",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFFDED618)),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0f, 4.5f)
        lineTo(16.0f, 4.5f)
        arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 16.5f)
        lineTo(28.0f, 16.5f)
        arcTo(12.0f, 12.0f, 0.0f, false, true, 16.0f, 28.5f)
        lineTo(16.0f, 28.5f)
        arcTo(12.0f, 12.0f, 0.0f, false, true, 4.0f, 16.5f)
        lineTo(4.0f, 16.5f)
        arcTo(12.0f, 12.0f, 0.0f, false, true, 16.0f, 4.5f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color(0xFFFDFFCB)),
        fillAlpha = 0.8f,
        strokeAlpha = 0.8f,
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0f, 23.75f)
        lineTo(16.0f, 23.75f)
        arcTo(7.25f, 7.25f, 0.0f, false, false, 23.25f, 16.5f)
        lineTo(23.25f, 16.5f)
        arcTo(7.25f, 7.25f, 0.0f, false, false, 16.0f, 9.25f)
        lineTo(16.0f, 9.25f)
        arcTo(7.25f, 7.25f, 0.0f, false, false, 8.75f, 16.5f)
        lineTo(8.75f, 16.5f)
        arcTo(7.25f, 7.25f, 0.0f, false, false, 16.0f, 23.75f)
        close()
      }
      path(
        fill = SolidColor(Color(0xFFFDFFCB)),
        stroke = null, fillAlpha = 0.8f,
        strokeAlpha = 0.8f,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0f, 20.5f)
        lineTo(16.0f, 20.5f)
        arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 16.5f)
        lineTo(20.0f, 16.5f)
        arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 12.5f)
        lineTo(16.0f, 12.5f)
        arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 16.5f)
        lineTo(12.0f, 16.5f)
        arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 20.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
