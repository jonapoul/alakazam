package dev.jonpoulton.alakazam.tak.compose.icons.mapcontrol

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.MapControlTakIcons

val MapControlTakIcons.ZoomControl: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "ZoomControl",
      defaultWidth = 39.0.dp,
      defaultHeight = 74.0.dp,
      viewportWidth = 39.0f,
      viewportHeight = 74.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.25f, 5.25f)
        curveTo(12.4845f, 5.25f, 7.0f, 10.7345f, 7.0f, 17.5f)
        verticalLineTo(52.5f)
        curveTo(7.0f, 59.2655f, 12.4845f, 64.75f, 19.25f, 64.75f)
        curveTo(26.0155f, 64.75f, 31.5f, 59.2655f, 31.5f, 52.5f)
        verticalLineTo(17.5f)
        curveTo(31.5f, 10.7345f, 26.0155f, 5.25f, 19.25f, 5.25f)
        close()
        moveTo(19.25f, 6.75f)
        curveTo(25.1871f, 6.75f, 30.0f, 11.5629f, 30.0f, 17.5f)
        verticalLineTo(52.5f)
        curveTo(30.0f, 58.4371f, 25.1871f, 63.25f, 19.25f, 63.25f)
        curveTo(13.3129f, 63.25f, 8.5f, 58.4371f, 8.5f, 52.5f)
        verticalLineTo(17.5f)
        curveTo(8.5f, 11.5629f, 13.3129f, 6.75f, 19.25f, 6.75f)
        close()
        moveTo(24.8413f, 50.5f)
        curveTo(24.8413f, 49.9477f, 24.3936f, 49.5f, 23.8413f, 49.5f)
        horizontalLineTo(14.8413f)
        lineTo(14.7247f, 49.5067f)
        curveTo(14.2273f, 49.5645f, 13.8413f, 49.9872f, 13.8413f, 50.5f)
        curveTo(13.8413f, 51.0523f, 14.289f, 51.5f, 14.8413f, 51.5f)
        horizontalLineTo(23.8413f)
        lineTo(23.9579f, 51.4933f)
        curveTo(24.4553f, 51.4355f, 24.8413f, 51.0128f, 24.8413f, 50.5f)
        close()
        moveTo(19.3413f, 15.0f)
        curveTo(19.8541f, 15.0f, 20.2768f, 15.386f, 20.3346f, 15.8834f)
        lineTo(20.3413f, 16.0f)
        verticalLineTo(19.5f)
        horizontalLineTo(23.8413f)
        curveTo(24.3936f, 19.5f, 24.8413f, 19.9477f, 24.8413f, 20.5f)
        curveTo(24.8413f, 21.0128f, 24.4553f, 21.4355f, 23.9579f, 21.4933f)
        lineTo(23.8413f, 21.5f)
        horizontalLineTo(20.3413f)
        verticalLineTo(25.0f)
        curveTo(20.3413f, 25.5523f, 19.8936f, 26.0f, 19.3413f, 26.0f)
        curveTo(18.8285f, 26.0f, 18.4058f, 25.614f, 18.348f, 25.1166f)
        lineTo(18.3413f, 25.0f)
        verticalLineTo(21.5f)
        horizontalLineTo(14.8413f)
        curveTo(14.289f, 21.5f, 13.8413f, 21.0523f, 13.8413f, 20.5f)
        curveTo(13.8413f, 19.9872f, 14.2273f, 19.5645f, 14.7247f, 19.5067f)
        lineTo(14.8413f, 19.5f)
        horizontalLineTo(18.3413f)
        verticalLineTo(16.0f)
        curveTo(18.3413f, 15.4477f, 18.789f, 15.0f, 19.3413f, 15.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
