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

public val MarkersTakIcons.AlarmNeutron: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "AlarmNeutron",
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
        pathFillType = NonZero,
      ) {
        moveTo(2.0f, 1.0f)
        lineTo(30.0f, 1.0f)
        arcTo(2.0f, 2.0f, 0.0f, false, true, 32.0f, 3.0f)
        lineTo(32.0f, 31.0f)
        arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 33.0f)
        lineTo(2.0f, 33.0f)
        arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 31.0f)
        lineTo(0.0f, 3.0f)
        arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.0f)
        close()
      }
      path(
        fill = SolidColor(Color(0xFF3B01FF)),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(4.0f, 5.0f)
        horizontalLineToRelative(24.0f)
        verticalLineToRelative(24.0f)
        horizontalLineToRelative(-24.0f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(10.0f, 10.0f)
        horizontalLineTo(13.9223f)
        lineTo(19.0407f, 17.7449f)
        verticalLineTo(10.0f)
        horizontalLineTo(23.0f)
        verticalLineTo(24.0f)
        horizontalLineTo(19.0407f)
        lineTo(13.9501f, 16.3124f)
        verticalLineTo(24.0f)
        horizontalLineTo(10.0f)
        verticalLineTo(10.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
