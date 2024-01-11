package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

val RaptorXTakIcons.Note: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Note",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      group {
        path(
          fill = SolidColor(Color.Transparent),
          stroke = SolidColor(Color.White),
          strokeLineWidth = 1.5f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = EvenOdd,
        ) {
          moveTo(17.5392f, 25.6537f)
          verticalLineTo(18.0386f)
          horizontalLineTo(25.1543f)
          lineTo(17.5392f, 25.6537f)
          close()
        }
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = EvenOdd,
        ) {
          moveTo(12.0593f, 19.0381f)
          horizontalLineTo(7.9712f)
          curveTo(7.4182f, 19.0381f, 6.9712f, 18.5911f, 6.9712f, 18.0381f)
          curveTo(6.9712f, 17.4861f, 7.4182f, 17.0381f, 7.9712f, 17.0381f)
          horizontalLineTo(12.0593f)
          curveTo(12.6113f, 17.0381f, 13.0593f, 17.4861f, 13.0593f, 18.0381f)
          curveTo(13.0593f, 18.5911f, 12.6113f, 19.0381f, 12.0593f, 19.0381f)
          close()
        }
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = EvenOdd,
        ) {
          moveTo(7.9712f, 12.4058f)
          horizontalLineTo(21.5125f)
          curveTo(22.0635f, 12.4058f, 22.5125f, 12.8528f, 22.5125f, 13.4058f)
          curveTo(22.5125f, 13.9578f, 22.0635f, 14.4058f, 21.5125f, 14.4058f)
          horizontalLineTo(7.9712f)
          curveTo(7.4182f, 14.4058f, 6.9712f, 13.9578f, 6.9712f, 13.4058f)
          curveTo(6.9712f, 12.8528f, 7.4182f, 12.4058f, 7.9712f, 12.4058f)
          close()
        }
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = EvenOdd,
        ) {
          moveTo(7.9712f, 7.8618f)
          horizontalLineTo(19.2064f)
          curveTo(19.7584f, 7.8618f, 20.2064f, 8.3088f, 20.2064f, 8.8618f)
          curveTo(20.2064f, 9.4138f, 19.7584f, 9.8618f, 19.2064f, 9.8618f)
          horizontalLineTo(7.9712f)
          curveTo(7.4182f, 9.8618f, 6.9712f, 9.4138f, 6.9712f, 8.8618f)
          curveTo(6.9712f, 8.3088f, 7.4182f, 7.8618f, 7.9712f, 7.8618f)
          close()
        }
        path(
          fill = SolidColor(Color.Transparent),
          stroke = SolidColor(Color.White),
          strokeLineWidth = 1.5f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(4.75f, 5.25f)
          horizontalLineTo(25.2504f)
          verticalLineTo(18.9126f)
          lineTo(18.4126f, 25.7504f)
          horizontalLineTo(4.75f)
          verticalLineTo(5.25f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
