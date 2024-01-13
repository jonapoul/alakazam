package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons

public val MarkersTakIcons.FriendlyDirection: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "FriendlyDirection",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFF9DFBFF)),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(15.9077f, 5.0f)
        lineTo(7.0f, 29.0f)
        lineTo(15.9077f, 25.9524f)
        verticalLineTo(5.0f)
        close()
      }
      path(
        fill = SolidColor(Color(0xFF9DFBFF)),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(15.9066f, 5.0f)
        lineTo(24.8143f, 29.0f)
        lineTo(15.9066f, 25.9524f)
        verticalLineTo(5.0f)
        close()
      }
      group {
        path(
          fill = SolidColor(Color.Black),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(15.9065f, 5.0f)
          lineTo(16.844f, 4.652f)
          lineTo(14.9065f, 5.0f)
          horizontalLineTo(15.9065f)
          close()
          moveTo(15.9071f, 5.0016f)
          lineTo(14.9696f, 5.3496f)
          lineTo(15.9072f, 7.8755f)
          lineTo(16.8446f, 5.3495f)
          lineTo(15.9071f, 5.0016f)
          close()
          moveTo(15.9065f, 5.0032f)
          lineTo(16.844f, 5.3511f)
          lineTo(16.9065f, 5.1828f)
          verticalLineTo(5.0032f)
          horizontalLineTo(15.9065f)
          close()
          moveTo(7.0f, 29.0f)
          lineTo(6.0625f, 28.6521f)
          lineTo(5.3289f, 30.6287f)
          lineTo(7.3237f, 29.9462f)
          lineTo(7.0f, 29.0f)
          close()
          moveTo(15.9071f, 25.9526f)
          lineTo(16.2309f, 25.0064f)
          lineTo(15.9071f, 24.8957f)
          lineTo(15.5834f, 25.0064f)
          lineTo(15.9071f, 25.9526f)
          close()
          moveTo(24.8142f, 29.0f)
          lineTo(24.4905f, 29.9462f)
          lineTo(26.4854f, 30.6287f)
          lineTo(25.7517f, 28.652f)
          lineTo(24.8142f, 29.0f)
          close()
          moveTo(15.9077f, 5.0031f)
          horizontalLineTo(14.9077f)
          verticalLineTo(5.1827f)
          lineTo(14.9702f, 5.3511f)
          lineTo(15.9077f, 5.0031f)
          close()
          moveTo(15.9077f, 5.0f)
          horizontalLineTo(16.9077f)
          lineTo(14.9702f, 4.6521f)
          lineTo(15.9077f, 5.0f)
          close()
          moveTo(14.969f, 5.348f)
          lineTo(14.9696f, 5.3496f)
          lineTo(16.8446f, 4.6536f)
          lineTo(16.844f, 4.652f)
          lineTo(14.969f, 5.348f)
          close()
          moveTo(16.9065f, 5.0032f)
          verticalLineTo(5.0f)
          horizontalLineTo(14.9065f)
          verticalLineTo(5.0032f)
          horizontalLineTo(16.9065f)
          close()
          moveTo(14.969f, 4.6552f)
          lineTo(6.0625f, 28.6521f)
          lineTo(7.9375f, 29.348f)
          lineTo(16.844f, 5.3511f)
          lineTo(14.969f, 4.6552f)
          close()
          moveTo(7.3237f, 29.9462f)
          lineTo(16.2309f, 26.8988f)
          lineTo(15.5834f, 25.0064f)
          lineTo(6.6763f, 28.0539f)
          lineTo(7.3237f, 29.9462f)
          close()
          moveTo(25.1379f, 28.0538f)
          lineTo(16.2309f, 25.0064f)
          lineTo(15.5834f, 26.8988f)
          lineTo(24.4905f, 29.9462f)
          lineTo(25.1379f, 28.0538f)
          close()
          moveTo(14.9702f, 5.3511f)
          lineTo(23.8767f, 29.348f)
          lineTo(25.7517f, 28.652f)
          lineTo(16.8452f, 4.6552f)
          lineTo(14.9702f, 5.3511f)
          close()
          moveTo(16.9077f, 5.0031f)
          verticalLineTo(5.0f)
          horizontalLineTo(14.9077f)
          verticalLineTo(5.0031f)
          horizontalLineTo(16.9077f)
          close()
          moveTo(14.9702f, 4.6521f)
          lineTo(14.9696f, 4.6536f)
          lineTo(16.8446f, 5.3495f)
          lineTo(16.8452f, 5.348f)
          lineTo(14.9702f, 4.6521f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
