package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.MiddlePoint: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "MiddlePoint",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(16.75f, 12.5f)
        curveTo(14.1266f, 12.5f, 12f, 14.6266f, 12f, 17.25f)
        curveTo(12f, 19.8734f, 14.1266f, 22f, 16.75f, 22f)
        curveTo(19.3734f, 22f, 21.5f, 19.8734f, 21.5f, 17.25f)
        curveTo(21.5f, 14.6266f, 19.3734f, 12.5f, 16.75f, 12.5f)
        close()
        moveTo(16.75f, 14f)
        curveTo(18.5449f, 14f, 20f, 15.4551f, 20f, 17.25f)
        curveTo(20f, 19.0449f, 18.5449f, 20.5f, 16.75f, 20.5f)
        curveTo(14.9551f, 20.5f, 13.5f, 19.0449f, 13.5f, 17.25f)
        curveTo(13.5f, 15.4551f, 14.9551f, 14f, 16.75f, 14f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(16.75f, 24.5f)
        curveTo(17.1297f, 24.5f, 17.4435f, 24.7822f, 17.4932f, 25.1482f)
        lineTo(17.5f, 25.25f)
        verticalLineTo(30.25f)
        curveTo(17.5f, 30.6642f, 17.1642f, 31f, 16.75f, 31f)
        curveTo(16.3703f, 31f, 16.0565f, 30.7178f, 16.0068f, 30.3518f)
        lineTo(16f, 30.25f)
        verticalLineTo(25.25f)
        curveTo(16f, 24.8358f, 16.3358f, 24.5f, 16.75f, 24.5f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(16.75f, 3.5f)
        curveTo(17.1297f, 3.5f, 17.4435f, 3.7822f, 17.4932f, 4.1482f)
        lineTo(17.5f, 4.25f)
        verticalLineTo(9.25f)
        curveTo(17.5f, 9.6642f, 17.1642f, 10f, 16.75f, 10f)
        curveTo(16.3703f, 10f, 16.0565f, 9.7178f, 16.0068f, 9.3518f)
        lineTo(16f, 9.25f)
        verticalLineTo(4.25f)
        curveTo(16f, 3.8358f, 16.3358f, 3.5f, 16.75f, 3.5f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(8.75f, 16.5f)
        curveTo(9.1642f, 16.5f, 9.5f, 16.8358f, 9.5f, 17.25f)
        curveTo(9.5f, 17.6297f, 9.2178f, 17.9435f, 8.8518f, 17.9932f)
        lineTo(8.75f, 18f)
        horizontalLineTo(3.75f)
        curveTo(3.3358f, 18f, 3f, 17.6642f, 3f, 17.25f)
        curveTo(3f, 16.8703f, 3.2822f, 16.5565f, 3.6482f, 16.5068f)
        lineTo(3.75f, 16.5f)
        horizontalLineTo(8.75f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(29.75f, 16.5f)
        curveTo(30.1642f, 16.5f, 30.5f, 16.8358f, 30.5f, 17.25f)
        curveTo(30.5f, 17.6297f, 30.2178f, 17.9435f, 29.8518f, 17.9932f)
        lineTo(29.75f, 18f)
        horizontalLineTo(24.75f)
        curveTo(24.3358f, 18f, 24f, 17.6642f, 24f, 17.25f)
        curveTo(24f, 16.8703f, 24.2822f, 16.5565f, 24.6482f, 16.5068f)
        lineTo(24.75f, 16.5f)
        horizontalLineTo(29.75f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
