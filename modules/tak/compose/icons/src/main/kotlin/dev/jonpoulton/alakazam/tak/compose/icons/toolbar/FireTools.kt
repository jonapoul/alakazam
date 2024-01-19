package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

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
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.FireTools: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "FireTools",
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
        moveTo(20.25f, 3.5f)
        curveTo(20.6297f, 3.5f, 20.9435f, 3.7822f, 20.9932f, 4.1482f)
        lineTo(21.0f, 4.25f)
        verticalLineTo(6.5194f)
        curveTo(28.2732f, 6.8965f, 34.1035f, 12.7268f, 34.4806f, 20.0f)
        horizontalLineTo(36.75f)
        curveTo(37.1642f, 20.0f, 37.5f, 20.3358f, 37.5f, 20.75f)
        curveTo(37.5f, 21.1297f, 37.2178f, 21.4435f, 36.8518f, 21.4932f)
        lineTo(36.75f, 21.5f)
        horizontalLineTo(34.4806f)
        curveTo(34.1035f, 28.7732f, 28.2732f, 34.6035f, 21.0f, 34.9806f)
        verticalLineTo(37.25f)
        curveTo(21.0f, 37.6642f, 20.6642f, 38.0f, 20.25f, 38.0f)
        curveTo(19.8703f, 38.0f, 19.5565f, 37.7178f, 19.5068f, 37.3518f)
        lineTo(19.5f, 37.25f)
        verticalLineTo(34.9806f)
        curveTo(12.2268f, 34.6035f, 6.3965f, 28.7732f, 6.0194f, 21.5f)
        horizontalLineTo(3.75f)
        curveTo(3.3358f, 21.5f, 3.0f, 21.1642f, 3.0f, 20.75f)
        curveTo(3.0f, 20.3703f, 3.2822f, 20.0565f, 3.6482f, 20.0068f)
        lineTo(3.75f, 20.0f)
        horizontalLineTo(6.0194f)
        curveTo(6.3965f, 12.7268f, 12.2268f, 6.8965f, 19.5f, 6.5194f)
        verticalLineTo(4.25f)
        curveTo(19.5f, 3.8358f, 19.8358f, 3.5f, 20.25f, 3.5f)
        close()
        moveTo(21.0f, 8.0217f)
        curveTo(27.4445f, 8.3955f, 32.6045f, 13.5555f, 32.9783f, 20.0f)
        horizontalLineTo(30.75f)
        lineTo(30.6482f, 20.0068f)
        curveTo(30.2822f, 20.0565f, 30.0f, 20.3703f, 30.0f, 20.75f)
        curveTo(30.0f, 21.1642f, 30.3358f, 21.5f, 30.75f, 21.5f)
        horizontalLineTo(32.9783f)
        curveTo(32.6045f, 27.9445f, 27.4445f, 33.1045f, 21.0f, 33.4783f)
        verticalLineTo(31.25f)
        lineTo(20.9932f, 31.1482f)
        curveTo(20.9435f, 30.7822f, 20.6297f, 30.5f, 20.25f, 30.5f)
        curveTo(19.8358f, 30.5f, 19.5f, 30.8358f, 19.5f, 31.25f)
        verticalLineTo(33.4783f)
        curveTo(13.0555f, 33.1045f, 7.8955f, 27.9445f, 7.5217f, 21.5f)
        horizontalLineTo(9.75f)
        lineTo(9.8518f, 21.4932f)
        curveTo(10.2178f, 21.4435f, 10.5f, 21.1297f, 10.5f, 20.75f)
        curveTo(10.5f, 20.3358f, 10.1642f, 20.0f, 9.75f, 20.0f)
        horizontalLineTo(7.5217f)
        curveTo(7.8955f, 13.5555f, 13.0555f, 8.3955f, 19.5f, 8.0217f)
        verticalLineTo(10.25f)
        lineTo(19.5068f, 10.3518f)
        curveTo(19.5565f, 10.7178f, 19.8703f, 11.0f, 20.25f, 11.0f)
        curveTo(20.6642f, 11.0f, 21.0f, 10.6642f, 21.0f, 10.25f)
        verticalLineTo(8.0217f)
        close()
        moveTo(20.25f, 13.5f)
        curveTo(16.2458f, 13.5f, 13.0f, 16.7458f, 13.0f, 20.75f)
        curveTo(13.0f, 24.7542f, 16.2458f, 28.0f, 20.25f, 28.0f)
        curveTo(24.2542f, 28.0f, 27.5f, 24.7542f, 27.5f, 20.75f)
        curveTo(27.5f, 16.7458f, 24.2542f, 13.5f, 20.25f, 13.5f)
        close()
        moveTo(20.25f, 15.0f)
        curveTo(23.4258f, 15.0f, 26.0f, 17.5742f, 26.0f, 20.75f)
        curveTo(26.0f, 23.9258f, 23.4258f, 26.5f, 20.25f, 26.5f)
        curveTo(17.0742f, 26.5f, 14.5f, 23.9258f, 14.5f, 20.75f)
        curveTo(14.5f, 17.5742f, 17.0742f, 15.0f, 20.25f, 15.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.FireTools)
