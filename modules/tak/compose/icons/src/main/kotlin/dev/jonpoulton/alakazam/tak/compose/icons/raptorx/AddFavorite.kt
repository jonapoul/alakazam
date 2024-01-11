package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

val RaptorXTakIcons.AddFavorite: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "AddFavorite",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(22.8462f, 15.1502f)
        lineTo(24.0106f, 14.0151f)
        curveTo(24.6041f, 13.4366f, 24.2766f, 12.4286f, 23.4564f, 12.3094f)
        lineTo(18.753f, 11.626f)
        curveTo(18.4273f, 11.5787f, 18.1458f, 11.3741f, 18.0001f, 11.079f)
        lineTo(15.8967f, 6.817f)
        curveTo(15.5299f, 6.0737f, 14.47f, 6.0737f, 14.1032f, 6.817f)
        lineTo(11.9998f, 11.079f)
        curveTo(11.8541f, 11.3741f, 11.5726f, 11.5787f, 11.2469f, 11.626f)
        lineTo(6.5435f, 12.3094f)
        curveTo(5.7233f, 12.4286f, 5.3958f, 13.4366f, 5.9893f, 14.0151f)
        lineTo(9.3927f, 17.3326f)
        curveTo(9.6284f, 17.5624f, 9.7359f, 17.8934f, 9.6803f, 18.2178f)
        lineTo(8.8768f, 22.9021f)
        curveTo(8.7367f, 23.719f, 9.5942f, 24.342f, 10.3278f, 23.9563f)
        lineTo(14.5346f, 21.7446f)
        curveTo(14.8259f, 21.5915f, 15.174f, 21.5915f, 15.4653f, 21.7446f)
        lineTo(19.6721f, 23.9563f)
        curveTo(20.4057f, 24.342f, 21.2632f, 23.719f, 21.1231f, 22.9021f)
        lineTo(20.8482f, 21.2994f)
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(20.5f, 15.0f)
        curveTo(20.7531f, 15.0f, 20.9623f, 15.1863f, 20.9954f, 15.4281f)
        lineTo(21.0f, 15.4953f)
        verticalLineTo(19.5047f)
        curveTo(21.0f, 19.7783f, 20.7761f, 20.0f, 20.5f, 20.0f)
        curveTo(20.2469f, 20.0f, 20.0377f, 19.8137f, 20.0046f, 19.5719f)
        lineTo(20.0f, 19.5047f)
        verticalLineTo(15.4953f)
        curveTo(20.0f, 15.2217f, 20.2239f, 15.0f, 20.5f, 15.0f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(22.5047f, 17.0f)
        curveTo(22.7782f, 17.0f, 23.0f, 17.2239f, 23.0f, 17.5f)
        curveTo(23.0f, 17.7531f, 22.8137f, 17.9623f, 22.5719f, 17.9954f)
        lineTo(22.5047f, 18.0f)
        horizontalLineTo(18.4953f)
        curveTo(18.2218f, 18.0f, 18.0f, 17.7761f, 18.0f, 17.5f)
        curveTo(18.0f, 17.2469f, 18.1863f, 17.0377f, 18.4281f, 17.0046f)
        lineTo(18.4953f, 17.0f)
        horizontalLineTo(22.5047f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
