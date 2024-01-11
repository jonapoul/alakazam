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
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons

val MarkersTakIcons.Damaged: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Damaged",
      defaultWidth = 34.0.dp,
      defaultHeight = 35.0.dp,
      viewportWidth = 34.0f,
      viewportHeight = 35.0f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Alert),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(17.0f, 17.5f)
        moveToRelative(-16.0f, 0.0f)
        arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, 0.0f)
        arcToRelative(16.0f, 16.0f, 0.0f, true, true, -32.0f, 0.0f)
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
        moveTo(14.2413f, 8.1206f)
        horizontalLineToRelative(5.5172f)
        verticalLineToRelative(18.7586f)
        horizontalLineToRelative(-5.5172f)
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
        moveTo(26.3793f, 14.7415f)
        lineToRelative(-0.0f, 5.5172f)
        lineToRelative(-18.7586f, 0.0f)
        lineToRelative(-0.0f, -5.5172f)
        close()
      }
    }.build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
