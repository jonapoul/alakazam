package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.PluginManager: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "PluginManager",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
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
        moveTo(13.9905f, 5.9513f)
        curveTo(13.9905f, 4.6444f, 15.0141f, 3.576f, 16.3027f, 3.5039f)
        lineTo(16.4418f, 3.5f)
        curveTo(17.7955f, 3.5f, 18.893f, 4.5975f, 18.893f, 5.9513f)
        lineTo(18.8923f, 7.7954f)
        lineTo(27.0f, 7.7962f)
        verticalLineTo(16.3037f)
        horizontalLineTo(24.0486f)
        curveTo(23.3061f, 16.3037f, 22.7046f, 16.9056f, 22.7046f, 17.6485f)
        curveTo(22.7046f, 18.3913f, 23.3061f, 18.9932f, 24.0486f, 18.9932f)
        horizontalLineTo(27.0f)
        verticalLineTo(27.5f)
        horizontalLineTo(17.7865f)
        verticalLineTo(24.5486f)
        curveTo(17.7865f, 23.8059f, 17.1844f, 23.2038f, 16.4418f, 23.2038f)
        curveTo(15.6995f, 23.2038f, 15.097f, 23.8062f, 15.097f, 24.5486f)
        verticalLineTo(27.5f)
        horizontalLineTo(7.2962f)
        lineTo(7.2954f, 20.099f)
        lineTo(5.4513f, 20.0997f)
        curveTo(4.1442f, 20.0997f, 3.076f, 19.0766f, 3.0039f, 17.7876f)
        lineTo(3.0f, 17.6485f)
        curveTo(3.0f, 16.2947f, 4.0975f, 15.1972f, 5.4513f, 15.1972f)
        horizontalLineTo(7.2954f)
        lineTo(7.2962f, 7.7962f)
        lineTo(13.9898f, 7.7954f)
        lineTo(13.9905f, 5.9513f)
        close()
        moveTo(17.7865f, 5.9514f)
        curveTo(17.7865f, 5.2087f, 17.1844f, 4.6067f, 16.4417f, 4.6067f)
        curveTo(15.6995f, 4.6067f, 15.097f, 5.209f, 15.097f, 5.9514f)
        verticalLineTo(8.9028f)
        lineTo(8.4019f, 8.9021f)
        lineTo(8.4026f, 16.3038f)
        horizontalLineTo(5.4512f)
        curveTo(4.7086f, 16.3038f, 4.1065f, 16.9059f, 4.1065f, 17.6486f)
        curveTo(4.1065f, 18.3913f, 4.7086f, 18.9934f, 5.4512f, 18.9934f)
        horizontalLineTo(8.4026f)
        lineTo(8.4019f, 26.3937f)
        horizontalLineTo(13.9897f)
        lineTo(13.9905f, 24.5487f)
        curveTo(13.9905f, 23.2419f, 15.0141f, 22.1735f, 16.3027f, 22.1014f)
        lineTo(16.4417f, 22.0975f)
        curveTo(17.7955f, 22.0975f, 18.893f, 23.195f, 18.893f, 24.5487f)
        lineTo(18.8923f, 26.3937f)
        horizontalLineTo(25.8927f)
        verticalLineTo(20.0991f)
        lineTo(24.0486f, 20.0999f)
        curveTo(22.7415f, 20.0999f, 21.674f, 19.0768f, 21.6019f, 17.7877f)
        lineTo(21.598f, 17.6486f)
        curveTo(21.598f, 16.2948f, 22.6949f, 15.1973f, 24.0486f, 15.1973f)
        horizontalLineTo(25.8927f)
        verticalLineTo(8.9021f)
        lineTo(17.7865f, 8.9028f)
        verticalLineTo(5.9514f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.PluginManager)
