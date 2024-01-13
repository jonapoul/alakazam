package dev.jonpoulton.alakazam.tak.compose.icons.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.NavigationTakIcons

public val NavigationTakIcons.RouteNavigationHardLeft: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RouteNavigationHardLeft",
      defaultWidth = 29.0.dp,
      defaultHeight = 29.0.dp,
      viewportWidth = 29.0f,
      viewportHeight = 29.0f,
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
        moveTo(1.2084f, 9.8959f)
        lineTo(9.6667f, 18.9584f)
        verticalLineTo(14.5f)
        horizontalLineTo(16.9167f)
        verticalLineTo(26.5834f)
        horizontalLineTo(26.5834f)
        verticalLineTo(14.5f)
        verticalLineTo(13.2917f)
        verticalLineTo(6.8334f)
        curveTo(26.5834f, 5.7288f, 25.6879f, 4.8334f, 24.5834f, 4.8334f)
        horizontalLineTo(9.6667f)
        lineTo(9.6667f, 0.8334f)
        lineTo(1.2084f, 9.8959f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
