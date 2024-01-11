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

val ToolbarTakIcons.Power: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Power",
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
        moveTo(20.7294f, 6.1487f)
        curveTo(20.6797f, 5.7826f, 20.366f, 5.5005f, 19.9863f, 5.5005f)
        curveTo(19.572f, 5.5005f, 19.2363f, 5.8363f, 19.2363f, 6.2505f)
        verticalLineTo(22.1685f)
        lineTo(19.2431f, 22.2703f)
        curveTo(19.2928f, 22.6363f, 19.6066f, 22.9185f, 19.9863f, 22.9185f)
        curveTo(20.4005f, 22.9185f, 20.7363f, 22.5827f, 20.7363f, 22.1685f)
        verticalLineTo(6.2505f)
        lineTo(20.7294f, 6.1487f)
        close()
        moveTo(16.8625f, 8.9972f)
        curveTo(16.7425f, 8.6008f, 16.3237f, 8.3768f, 15.9273f, 8.4969f)
        curveTo(10.0769f, 10.2691f, 5.9998f, 15.6797f, 5.9998f, 21.8857f)
        curveTo(5.9998f, 29.6097f, 12.2624f, 35.8717f, 19.9868f, 35.8717f)
        curveTo(27.7111f, 35.8717f, 33.9738f, 29.6097f, 33.9738f, 21.8857f)
        curveTo(33.9738f, 15.7694f, 30.0122f, 10.4178f, 24.2808f, 8.5708f)
        curveTo(23.8865f, 8.4438f, 23.464f, 8.6604f, 23.3369f, 9.0547f)
        curveTo(23.2099f, 9.4489f, 23.4265f, 9.8715f, 23.8207f, 9.9985f)
        curveTo(28.9367f, 11.6472f, 32.4738f, 16.4253f, 32.4738f, 21.8857f)
        curveTo(32.4738f, 28.7813f, 26.8828f, 34.3717f, 19.9868f, 34.3717f)
        curveTo(13.0908f, 34.3717f, 7.4998f, 28.7813f, 7.4998f, 21.8857f)
        curveTo(7.4998f, 16.3452f, 11.14f, 11.5144f, 16.3622f, 9.9325f)
        curveTo(16.7586f, 9.8124f, 16.9826f, 9.3937f, 16.8625f, 8.9972f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
