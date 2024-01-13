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

public val ToolbarTakIcons.Grid: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Grid",
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
        moveTo(9.2431f, 6.8982f)
        curveTo(9.1935f, 6.5321f, 8.8797f, 6.25f, 8.5f, 6.25f)
        curveTo(8.0858f, 6.25f, 7.75f, 6.5858f, 7.75f, 7.0f)
        verticalLineTo(8.5f)
        horizontalLineTo(6.25f)
        lineTo(6.1482f, 8.5069f)
        curveTo(5.7821f, 8.5565f, 5.5f, 8.8703f, 5.5f, 9.25f)
        curveTo(5.5f, 9.6642f, 5.8358f, 10.0f, 6.25f, 10.0f)
        horizontalLineTo(7.75f)
        verticalLineTo(20.0f)
        horizontalLineTo(6.25f)
        lineTo(6.1482f, 20.0068f)
        curveTo(5.7821f, 20.0565f, 5.5f, 20.3703f, 5.5f, 20.75f)
        curveTo(5.5f, 21.1642f, 5.8358f, 21.5f, 6.25f, 21.5f)
        horizontalLineTo(7.75f)
        verticalLineTo(32.0f)
        horizontalLineTo(6.25f)
        lineTo(6.1482f, 32.0068f)
        curveTo(5.7821f, 32.0565f, 5.5f, 32.3703f, 5.5f, 32.75f)
        curveTo(5.5f, 33.1642f, 5.8358f, 33.5f, 6.25f, 33.5f)
        horizontalLineTo(7.75f)
        verticalLineTo(35.0f)
        lineTo(7.7568f, 35.1018f)
        curveTo(7.8065f, 35.4678f, 8.1203f, 35.75f, 8.5f, 35.75f)
        curveTo(8.9142f, 35.75f, 9.25f, 35.4142f, 9.25f, 35.0f)
        verticalLineTo(33.5f)
        horizontalLineTo(19.25f)
        verticalLineTo(35.0f)
        lineTo(19.2568f, 35.1018f)
        curveTo(19.3065f, 35.4678f, 19.6203f, 35.75f, 20.0f, 35.75f)
        curveTo(20.4142f, 35.75f, 20.75f, 35.4142f, 20.75f, 35.0f)
        verticalLineTo(33.5f)
        horizontalLineTo(31.25f)
        verticalLineTo(35.0f)
        lineTo(31.2568f, 35.1018f)
        curveTo(31.3065f, 35.4678f, 31.6203f, 35.75f, 32.0f, 35.75f)
        curveTo(32.4142f, 35.75f, 32.75f, 35.4142f, 32.75f, 35.0f)
        verticalLineTo(33.5f)
        horizontalLineTo(34.25f)
        lineTo(34.3518f, 33.4932f)
        curveTo(34.7178f, 33.4435f, 35.0f, 33.1297f, 35.0f, 32.75f)
        curveTo(35.0f, 32.3358f, 34.6642f, 32.0f, 34.25f, 32.0f)
        horizontalLineTo(32.75f)
        verticalLineTo(21.5f)
        horizontalLineTo(34.25f)
        lineTo(34.3518f, 21.4932f)
        curveTo(34.7178f, 21.4435f, 35.0f, 21.1297f, 35.0f, 20.75f)
        curveTo(35.0f, 20.3358f, 34.6642f, 20.0f, 34.25f, 20.0f)
        horizontalLineTo(32.75f)
        verticalLineTo(10.0f)
        horizontalLineTo(34.25f)
        lineTo(34.3518f, 9.9931f)
        curveTo(34.7178f, 9.9435f, 35.0f, 9.6297f, 35.0f, 9.25f)
        curveTo(35.0f, 8.8358f, 34.6642f, 8.5f, 34.25f, 8.5f)
        horizontalLineTo(32.75f)
        verticalLineTo(7.0f)
        lineTo(32.7432f, 6.8982f)
        curveTo(32.6935f, 6.5321f, 32.3797f, 6.25f, 32.0f, 6.25f)
        curveTo(31.5858f, 6.25f, 31.25f, 6.5858f, 31.25f, 7.0f)
        verticalLineTo(8.5f)
        horizontalLineTo(20.75f)
        verticalLineTo(7.0f)
        lineTo(20.7432f, 6.8982f)
        curveTo(20.6935f, 6.5321f, 20.3797f, 6.25f, 20.0f, 6.25f)
        curveTo(19.5858f, 6.25f, 19.25f, 6.5858f, 19.25f, 7.0f)
        verticalLineTo(8.5f)
        horizontalLineTo(9.25f)
        verticalLineTo(7.0f)
        lineTo(9.2431f, 6.8982f)
        close()
        moveTo(31.25f, 32.0f)
        verticalLineTo(21.5f)
        horizontalLineTo(20.75f)
        verticalLineTo(32.0f)
        horizontalLineTo(31.25f)
        close()
        moveTo(19.25f, 32.0f)
        verticalLineTo(21.5f)
        horizontalLineTo(9.25f)
        verticalLineTo(32.0f)
        horizontalLineTo(19.25f)
        close()
        moveTo(19.25f, 20.0f)
        horizontalLineTo(9.25f)
        verticalLineTo(10.0f)
        horizontalLineTo(19.25f)
        verticalLineTo(20.0f)
        close()
        moveTo(31.25f, 20.0f)
        horizontalLineTo(20.75f)
        verticalLineTo(10.0f)
        horizontalLineTo(31.25f)
        verticalLineTo(20.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
