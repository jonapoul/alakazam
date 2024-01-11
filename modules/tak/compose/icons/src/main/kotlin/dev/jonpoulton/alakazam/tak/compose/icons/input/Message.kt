package dev.jonpoulton.alakazam.tak.compose.icons.input

import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.InputTakIcons

val InputTakIcons.Message: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Message",
      defaultWidth = 24.0.dp,
      defaultHeight = 25.0.dp,
      viewportWidth = 24.0f,
      viewportHeight = 25.0f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(3.386f, 21.9391f)
        lineTo(22.1709f, 12.8391f)
        curveTo(22.6097f, 12.6258f, 22.6097f, 11.8742f, 22.1709f, 11.6609f)
        lineTo(3.386f, 2.5609f)
        curveTo(3.1732f, 2.4574f, 2.9228f, 2.4873f, 2.738f, 2.639f)
        curveTo(2.5539f, 2.7895f, 2.4694f, 3.0383f, 2.5125f, 3.2776f)
        lineTo(3.547f, 8.6793f)
        lineTo(12.0747f, 11.6336f)
        curveTo(12.5828f, 11.8101f, 12.5828f, 12.6899f, 12.0747f, 12.8663f)
        lineTo(3.547f, 15.8207f)
        lineTo(2.5125f, 21.2224f)
        curveTo(2.4665f, 21.4526f, 2.5487f, 21.7054f, 2.738f, 21.861f)
        curveTo(2.9228f, 22.0127f, 3.1732f, 22.0425f, 3.386f, 21.9391f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
