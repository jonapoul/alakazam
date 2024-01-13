package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.Search: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Search",
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
        moveTo(7.7932f, 16.93f)
        curveTo(5.5791f, 13.8825f, 6.2547f, 9.6173f, 9.3021f, 7.4032f)
        curveTo(12.3495f, 5.1891f, 16.6148f, 5.8647f, 18.8289f, 8.9121f)
        curveTo(21.0429f, 11.9595f, 20.3674f, 16.2248f, 17.32f, 18.4388f)
        curveTo(14.2726f, 20.6529f, 10.0073f, 19.9774f, 7.7932f, 16.93f)
        close()
        moveTo(8.3616f, 6.1087f)
        curveTo(4.5993f, 8.8422f, 3.7653f, 14.1081f, 6.4988f, 17.8704f)
        curveTo(9.2311f, 21.6311f, 14.4936f, 22.466f, 18.2556f, 19.7368f)
        lineTo(23.6939f, 26.2126f)
        curveTo(23.9781f, 26.5509f, 24.4827f, 26.5949f, 24.821f, 26.3107f)
        curveTo(25.1594f, 26.0266f, 25.2033f, 25.522f, 24.9192f, 25.1836f)
        lineTo(19.4569f, 18.6793f)
        curveTo(22.1688f, 15.7913f, 22.5378f, 11.2949f, 20.1233f, 7.9716f)
        curveTo(17.3898f, 4.2093f, 12.1239f, 3.3753f, 8.3616f, 6.1087f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
