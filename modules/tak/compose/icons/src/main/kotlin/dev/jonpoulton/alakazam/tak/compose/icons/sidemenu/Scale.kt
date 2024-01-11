package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

val SideMenuTakIcons.Scale: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Scale",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(6.7511f, 6f)
        horizontalLineTo(10.5009f)
        curveTo(10.9151f, 6f, 11.2509f, 6.3358f, 11.2509f, 6.75f)
        curveTo(11.2509f, 7.1642f, 10.9151f, 7.5f, 10.5009f, 7.5f)
        horizontalLineTo(8.5617f)
        lineTo(11.969f, 10.9072f)
        curveTo(12.2619f, 11.2001f, 12.2619f, 11.675f, 11.969f, 11.9679f)
        curveTo(11.6761f, 12.2608f, 11.2012f, 12.2608f, 10.9083f, 11.9679f)
        lineTo(7.5f, 8.5596f)
        verticalLineTo(10.5009f)
        curveTo(7.5f, 10.9151f, 7.1642f, 11.2509f, 6.75f, 11.2509f)
        curveTo(6.3358f, 11.2509f, 6f, 10.9151f, 6f, 10.5009f)
        verticalLineTo(6.75f)
        curveTo(6f, 6.3358f, 6.3358f, 6f, 6.75f, 6f)
        horizontalLineTo(6.7511f)
        close()
        moveTo(29.2515f, 6f)
        horizontalLineTo(25.5016f)
        curveTo(25.0874f, 6f, 24.7516f, 6.3358f, 24.7516f, 6.75f)
        curveTo(24.7516f, 7.1642f, 25.0874f, 7.5f, 25.5016f, 7.5f)
        horizontalLineTo(27.4408f)
        lineTo(24.0336f, 10.9072f)
        curveTo(23.7407f, 11.2001f, 23.7407f, 11.675f, 24.0336f, 11.9679f)
        curveTo(24.3265f, 12.2608f, 24.8013f, 12.2608f, 25.0942f, 11.9679f)
        lineTo(28.5025f, 8.5596f)
        verticalLineTo(10.5009f)
        curveTo(28.5025f, 10.9151f, 28.8383f, 11.2509f, 29.2525f, 11.2509f)
        curveTo(29.6668f, 11.2509f, 30.0025f, 10.9151f, 30.0025f, 10.5009f)
        verticalLineTo(6.75f)
        curveTo(30.0025f, 6.3358f, 29.6668f, 6f, 29.2525f, 6f)
        horizontalLineTo(29.2515f)
        close()
        moveTo(13.3141f, 13.3124f)
        horizontalLineTo(22.6892f)
        verticalLineTo(22.6875f)
        horizontalLineTo(13.3141f)
        verticalLineTo(13.3124f)
        close()
        moveTo(25.5016f, 30f)
        horizontalLineTo(29.2515f)
        horizontalLineTo(29.2525f)
        curveTo(29.6668f, 30f, 30.0025f, 29.6642f, 30.0025f, 29.25f)
        verticalLineTo(25.4991f)
        curveTo(30.0025f, 25.0849f, 29.6668f, 24.7491f, 29.2525f, 24.7491f)
        curveTo(28.8383f, 24.7491f, 28.5025f, 25.0849f, 28.5025f, 25.4991f)
        verticalLineTo(27.4404f)
        lineTo(25.0942f, 24.0321f)
        curveTo(24.8013f, 23.7392f, 24.3265f, 23.7392f, 24.0336f, 24.0321f)
        curveTo(23.7407f, 24.325f, 23.7407f, 24.7999f, 24.0336f, 25.0928f)
        lineTo(27.4408f, 28.5f)
        horizontalLineTo(25.5016f)
        curveTo(25.0874f, 28.5f, 24.7516f, 28.8358f, 24.7516f, 29.25f)
        curveTo(24.7516f, 29.6642f, 25.0874f, 30f, 25.5016f, 30f)
        close()
        moveTo(10.5009f, 30f)
        horizontalLineTo(6.7511f)
        horizontalLineTo(6.75f)
        curveTo(6.3358f, 30f, 6f, 29.6642f, 6f, 29.25f)
        verticalLineTo(25.4991f)
        curveTo(6f, 25.0849f, 6.3358f, 24.7491f, 6.75f, 24.7491f)
        curveTo(7.1642f, 24.7491f, 7.5f, 25.0849f, 7.5f, 25.4991f)
        verticalLineTo(27.4404f)
        lineTo(10.9083f, 24.0321f)
        curveTo(11.2012f, 23.7392f, 11.6761f, 23.7392f, 11.969f, 24.0321f)
        curveTo(12.2619f, 24.325f, 12.2619f, 24.7999f, 11.969f, 25.0928f)
        lineTo(8.5617f, 28.5f)
        horizontalLineTo(10.5009f)
        curveTo(10.9151f, 28.5f, 11.2509f, 28.8358f, 11.2509f, 29.25f)
        curveTo(11.2509f, 29.6642f, 10.9151f, 30f, 10.5009f, 30f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
