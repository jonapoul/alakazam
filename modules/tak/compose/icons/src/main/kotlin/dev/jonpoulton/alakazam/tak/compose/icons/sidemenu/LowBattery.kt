package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

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
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

val SideMenuTakIcons.LowBattery: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "LowBattery",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(8f, 12.75f)
        lineTo(24.8696f, 12.75f)
        arcTo(1.25f, 1.25f, 0f, false, true, 26.1196f, 14f)
        lineTo(26.1196f, 22.5217f)
        arcTo(1.25f, 1.25f, 0f, false, true, 24.8696f, 23.7717f)
        lineTo(8f, 23.7717f)
        arcTo(1.25f, 1.25f, 0f, false, true, 6.75f, 22.5217f)
        lineTo(6.75f, 14f)
        arcTo(1.25f, 1.25f, 0f, false, true, 8f, 12.75f)
        close()
      }
      group {
        path(
          fill = SolidColor(Color.Transparent),
          stroke = SolidColor(TakColors.Sand),
          strokeLineWidth = 2.08696f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(27.9131f, 16.174f)
          horizontalLineTo(29f)
          curveTo(29.5523f, 16.174f, 30f, 16.6217f, 30f, 17.174f)
          verticalLineTo(19.3479f)
          curveTo(30f, 19.9001f, 29.5523f, 20.3479f, 29f, 20.3479f)
          horizontalLineTo(27.9131f)
          verticalLineTo(16.174f)
          close()
        }
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(8f, 14f)
          horizontalLineTo(10f)
          lineTo(12f, 22.52f)
          horizontalLineTo(8f)
          verticalLineTo(14f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
