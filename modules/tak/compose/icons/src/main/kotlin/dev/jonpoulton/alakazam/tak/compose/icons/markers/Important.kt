package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons

public val MarkersTakIcons.Important: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Important",
      defaultWidth = 34.0.dp,
      defaultHeight = 35.0.dp,
      viewportWidth = 34.0f,
      viewportHeight = 35.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFF2D71F5)),
        stroke = SolidColor(Color.Black),
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
        pathFillType = EvenOdd,
      ) {
        moveTo(18.271f, 19.2551f)
        curveTo(18.1837f, 20.0405f, 17.6601f, 20.5351f, 16.9328f, 20.5351f)
        curveTo(16.2055f, 20.5351f, 15.6819f, 20.0405f, 15.5946f, 19.2551f)
        lineTo(14.3437f, 8.3169f)
        curveTo(14.2564f, 7.4732f, 14.7219f, 6.8333f, 15.5073f, 6.8333f)
        horizontalLineTo(18.3582f)
        curveTo(19.1437f, 6.8333f, 19.6092f, 7.4732f, 19.5219f, 8.3169f)
        lineTo(18.271f, 19.2551f)
        close()
        moveTo(19.4638f, 24.9859f)
        curveTo(19.4638f, 26.3822f, 18.3874f, 27.4586f, 16.9329f, 27.4586f)
        curveTo(15.4783f, 27.4586f, 14.402f, 26.3822f, 14.402f, 24.9859f)
        verticalLineTo(24.9277f)
        curveTo(14.402f, 23.5313f, 15.4783f, 22.455f, 16.9329f, 22.455f)
        curveTo(18.3874f, 22.455f, 19.4638f, 23.5313f, 19.4638f, 24.9277f)
        verticalLineTo(24.9859f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
