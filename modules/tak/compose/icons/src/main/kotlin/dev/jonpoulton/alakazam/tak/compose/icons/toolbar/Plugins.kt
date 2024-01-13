package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.Plugins: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Plugins",
      defaultWidth = 40.0.dp,
      defaultHeight = 41.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 41.0f,
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
        moveTo(16.6911f, 6.9709f)
        curveTo(16.6911f, 5.2537f, 18.036f, 3.8499f, 19.7292f, 3.7551f)
        lineTo(19.9119f, 3.75f)
        curveTo(21.6907f, 3.75f, 23.1328f, 5.1921f, 23.1328f, 6.9709f)
        lineTo(23.1318f, 9.394f)
        lineTo(33.785f, 9.395f)
        verticalLineTo(20.5735f)
        horizontalLineTo(29.907f)
        curveTo(28.9314f, 20.5735f, 28.141f, 21.3644f, 28.141f, 22.3405f)
        curveTo(28.141f, 23.3166f, 28.9314f, 24.1074f, 29.907f, 24.1074f)
        horizontalLineTo(33.785f)
        verticalLineTo(35.285f)
        horizontalLineTo(21.6789f)
        verticalLineTo(31.407f)
        curveTo(21.6789f, 30.4311f, 20.8878f, 29.64f, 19.9119f, 29.64f)
        curveTo(18.9367f, 29.64f, 18.145f, 30.4315f, 18.145f, 31.407f)
        verticalLineTo(35.285f)
        horizontalLineTo(7.895f)
        lineTo(7.894f, 25.5604f)
        lineTo(5.4709f, 25.5613f)
        curveTo(3.7534f, 25.5613f, 2.3498f, 24.217f, 2.2551f, 22.5232f)
        lineTo(2.25f, 22.3405f)
        curveTo(2.25f, 20.5617f, 3.6921f, 19.1196f, 5.4709f, 19.1196f)
        horizontalLineTo(7.894f)
        lineTo(7.895f, 9.395f)
        lineTo(16.6901f, 9.394f)
        lineTo(16.6911f, 6.9709f)
        close()
        moveTo(21.6789f, 6.9709f)
        curveTo(21.6789f, 5.995f, 20.8878f, 5.2039f, 19.9119f, 5.2039f)
        curveTo(18.9367f, 5.2039f, 18.145f, 5.9954f, 18.145f, 6.9709f)
        verticalLineTo(10.8489f)
        lineTo(9.3479f, 10.8479f)
        lineTo(9.3489f, 20.5735f)
        horizontalLineTo(5.4709f)
        curveTo(4.495f, 20.5735f, 3.7039f, 21.3646f, 3.7039f, 22.3405f)
        curveTo(3.7039f, 23.3163f, 4.495f, 24.1074f, 5.4709f, 24.1074f)
        horizontalLineTo(9.3489f)
        lineTo(9.3479f, 33.8311f)
        horizontalLineTo(16.6901f)
        lineTo(16.6911f, 31.407f)
        curveTo(16.6911f, 29.6898f, 18.036f, 28.286f, 19.7292f, 28.1912f)
        lineTo(19.9119f, 28.1861f)
        curveTo(21.6907f, 28.1861f, 23.1328f, 29.6282f, 23.1328f, 31.407f)
        lineTo(23.1318f, 33.8311f)
        horizontalLineTo(32.3301f)
        verticalLineTo(25.5604f)
        lineTo(29.907f, 25.5613f)
        curveTo(28.1896f, 25.5613f, 26.7869f, 24.2171f, 26.6922f, 22.5233f)
        lineTo(26.6871f, 22.3405f)
        curveTo(26.6871f, 20.5616f, 28.1283f, 19.1196f, 29.907f, 19.1196f)
        horizontalLineTo(32.3301f)
        verticalLineTo(10.8479f)
        lineTo(21.6789f, 10.8489f)
        verticalLineTo(6.9709f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
