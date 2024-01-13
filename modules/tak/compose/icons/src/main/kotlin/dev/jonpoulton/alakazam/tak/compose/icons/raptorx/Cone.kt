package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.Cone: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Cone",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(7.5879f, 24.6493f)
        lineTo(15.0f, 5.3919f)
        lineTo(22.4121f, 24.6493f)
        curveTo(21.306f, 25.6625f, 20.2414f, 26.3786f, 19.1078f, 26.8509f)
        curveTo(17.8929f, 27.3571f, 16.5732f, 27.594f, 15.0f, 27.594f)
        curveTo(13.4268f, 27.594f, 12.1071f, 27.3571f, 10.8922f, 26.8509f)
        curveTo(9.7586f, 26.3786f, 8.694f, 25.6625f, 7.5879f, 24.6493f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 0.75f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(7.5f, 24.6281f)
        curveTo(8.6323f, 23.6773f, 11.5631f, 23.0f, 15.0f, 23.0f)
        curveTo(18.4369f, 23.0f, 21.3677f, 23.6773f, 22.5f, 24.6281f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
