package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.radialGradient
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

public val MarkersTakIcons.MapPingFlash: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "MapPingFlash",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = radialGradient(
          0.322917f to Color.Transparent, 1.0f to Color.White,
          center = Offset(16.0f, 17.0f), radius = 12.0f,
        ),
        stroke =
        SolidColor(Color.Black),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0f, 5.0f)
        lineTo(16.0f, 5.0f)
        arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 17.0f)
        lineTo(28.0f, 17.0f)
        arcTo(12.0f, 12.0f, 0.0f, false, true, 16.0f, 29.0f)
        lineTo(16.0f, 29.0f)
        arcTo(12.0f, 12.0f, 0.0f, false, true, 4.0f, 17.0f)
        lineTo(4.0f, 17.0f)
        arcTo(12.0f, 12.0f, 0.0f, false, true, 16.0f, 5.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
