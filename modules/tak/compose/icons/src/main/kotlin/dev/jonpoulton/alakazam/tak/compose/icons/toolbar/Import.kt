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

val ToolbarTakIcons.Import: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Import",
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
        moveTo(27.9498f, 26.5898f)
        horizontalLineTo(35.6348f)
        curveTo(36.0488f, 26.5898f, 36.3848f, 26.2538f, 36.3848f, 25.8398f)
        verticalLineTo(5.2498f)
        curveTo(36.3848f, 4.8358f, 36.0488f, 4.4998f, 35.6348f, 4.4998f)
        horizontalLineTo(15.0448f)
        curveTo(14.6308f, 4.4998f, 14.2948f, 4.8358f, 14.2948f, 5.2498f)
        verticalLineTo(12.9648f)
        curveTo(14.2948f, 13.3788f, 14.6308f, 13.7148f, 15.0448f, 13.7148f)
        curveTo(15.4588f, 13.7148f, 15.7948f, 13.3788f, 15.7948f, 12.9648f)
        verticalLineTo(5.9998f)
        horizontalLineTo(34.8848f)
        verticalLineTo(25.0898f)
        horizontalLineTo(27.9498f)
        curveTo(27.5358f, 25.0898f, 27.1998f, 25.4258f, 27.1998f, 25.8398f)
        curveTo(27.1998f, 26.2538f, 27.5358f, 26.5898f, 27.9498f, 26.5898f)
        close()
        moveTo(3.9998f, 36.1357f)
        curveTo(3.9998f, 36.5497f, 4.3358f, 36.8857f, 4.7498f, 36.8857f)
        horizontalLineTo(25.3398f)
        curveTo(25.7538f, 36.8857f, 26.0898f, 36.5497f, 26.0898f, 36.1357f)
        verticalLineTo(22.0647f)
        curveTo(26.0898f, 21.6507f, 25.7538f, 21.3147f, 25.3398f, 21.3147f)
        curveTo(24.9258f, 21.3147f, 24.5898f, 21.6507f, 24.5898f, 22.0647f)
        verticalLineTo(35.3857f)
        horizontalLineTo(5.4998f)
        verticalLineTo(16.2947f)
        horizontalLineTo(19.1198f)
        curveTo(19.5338f, 16.2947f, 19.8698f, 15.9587f, 19.8698f, 15.5447f)
        curveTo(19.8698f, 15.1307f, 19.5338f, 14.7947f, 19.1198f, 14.7947f)
        horizontalLineTo(4.7498f)
        curveTo(4.3358f, 14.7947f, 3.9998f, 15.1307f, 3.9998f, 15.5447f)
        verticalLineTo(36.1357f)
        close()
        moveTo(12.7764f, 29.2343f)
        curveTo(12.5824f, 29.2343f, 12.3944f, 29.1593f, 12.2554f, 29.0233f)
        curveTo(12.1054f, 28.8793f, 12.0234f, 28.6793f, 12.0264f, 28.4713f)
        lineTo(12.1724f, 19.6023f)
        curveTo(12.1784f, 19.1933f, 12.5124f, 18.8653f, 12.9224f, 18.8653f)
        horizontalLineTo(12.9344f)
        curveTo(13.3484f, 18.8723f, 13.6784f, 19.2133f, 13.6724f, 19.6283f)
        lineTo(13.5613f, 26.3669f)
        lineTo(29.407f, 10.5203f)
        curveTo(29.7f, 10.2273f, 30.175f, 10.2273f, 30.468f, 10.5203f)
        curveTo(30.761f, 10.8133f, 30.761f, 11.2873f, 30.468f, 11.5803f)
        lineTo(14.3935f, 27.6547f)
        lineTo(21.3374f, 27.3173f)
        curveTo(21.7214f, 27.2843f, 22.1014f, 27.6163f, 22.1224f, 28.0303f)
        curveTo(22.1424f, 28.4433f, 21.8234f, 28.7953f, 21.4094f, 28.8153f)
        lineTo(12.8124f, 29.2333f)
        curveTo(12.8004f, 29.2343f, 12.7884f, 29.2343f, 12.7764f, 29.2343f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
