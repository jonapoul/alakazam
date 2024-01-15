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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val ToolbarTakIcons.Center: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Center",
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
        moveTo(20.25f, 5.25f)
        curveTo(20.6297f, 5.25f, 20.9435f, 5.5321f, 20.9932f, 5.8982f)
        lineTo(21.0f, 6.0f)
        verticalLineTo(11.0f)
        curveTo(21.0f, 11.4142f, 20.6642f, 11.75f, 20.25f, 11.75f)
        curveTo(19.8703f, 11.75f, 19.5565f, 11.4678f, 19.5068f, 11.1018f)
        lineTo(19.5f, 11.0f)
        verticalLineTo(6.0f)
        curveTo(19.5f, 5.5858f, 19.8358f, 5.25f, 20.25f, 5.25f)
        close()
        moveTo(20.25f, 28.25f)
        curveTo(20.6297f, 28.25f, 20.9435f, 28.5322f, 20.9932f, 28.8982f)
        lineTo(21.0f, 29.0f)
        verticalLineTo(34.5f)
        curveTo(21.0f, 34.9142f, 20.6642f, 35.25f, 20.25f, 35.25f)
        curveTo(19.8703f, 35.25f, 19.5565f, 34.9678f, 19.5068f, 34.6018f)
        lineTo(19.5f, 34.5f)
        verticalLineTo(29.0f)
        curveTo(19.5f, 28.5858f, 19.8358f, 28.25f, 20.25f, 28.25f)
        close()
        moveTo(35.25f, 20.25f)
        curveTo(35.25f, 19.8358f, 34.9142f, 19.5f, 34.5f, 19.5f)
        horizontalLineTo(29.5f)
        lineTo(29.3982f, 19.5068f)
        curveTo(29.0322f, 19.5565f, 28.75f, 19.8703f, 28.75f, 20.25f)
        curveTo(28.75f, 20.6642f, 29.0858f, 21.0f, 29.5f, 21.0f)
        horizontalLineTo(34.5f)
        lineTo(34.6018f, 20.9932f)
        curveTo(34.9678f, 20.9435f, 35.25f, 20.6297f, 35.25f, 20.25f)
        close()
        moveTo(11.0f, 19.5f)
        curveTo(11.4142f, 19.5f, 11.75f, 19.8358f, 11.75f, 20.25f)
        curveTo(11.75f, 20.6297f, 11.4678f, 20.9435f, 11.1018f, 20.9932f)
        lineTo(11.0f, 21.0f)
        horizontalLineTo(6.0f)
        curveTo(5.5858f, 21.0f, 5.25f, 20.6642f, 5.25f, 20.25f)
        curveTo(5.25f, 19.8703f, 5.5321f, 19.5565f, 5.8982f, 19.5068f)
        lineTo(6.0f, 19.5f)
        horizontalLineTo(11.0f)
        close()
        moveTo(20.25f, 14.75f)
        curveTo(17.3505f, 14.75f, 15.0f, 17.1005f, 15.0f, 20.0f)
        curveTo(15.0f, 22.8995f, 17.3505f, 25.25f, 20.25f, 25.25f)
        curveTo(23.1495f, 25.25f, 25.5f, 22.8995f, 25.5f, 20.0f)
        curveTo(25.5f, 17.1005f, 23.1495f, 14.75f, 20.25f, 14.75f)
        close()
        moveTo(20.25f, 16.25f)
        curveTo(22.3211f, 16.25f, 24.0f, 17.9289f, 24.0f, 20.0f)
        curveTo(24.0f, 22.0711f, 22.3211f, 23.75f, 20.25f, 23.75f)
        curveTo(18.1789f, 23.75f, 16.5f, 22.0711f, 16.5f, 20.0f)
        curveTo(16.5f, 17.9289f, 18.1789f, 16.25f, 20.25f, 16.25f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Center)
