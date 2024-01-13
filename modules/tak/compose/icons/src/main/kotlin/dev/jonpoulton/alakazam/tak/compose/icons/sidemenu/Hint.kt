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

public val SideMenuTakIcons.Hint: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Hint",
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
        moveTo(9.9918f, 20.6501f)
        curveTo(7.5147f, 17.2407f, 8.2705f, 12.4688f, 11.6799f, 9.9917f)
        curveTo(15.0893f, 7.5146f, 19.8612f, 8.2704f, 22.3383f, 11.6798f)
        curveTo(24.8154f, 15.0892f, 24.0596f, 19.8612f, 20.6502f, 22.3383f)
        curveTo(17.2408f, 24.8153f, 12.4689f, 24.0595f, 9.9918f, 20.6501f)
        close()
        moveTo(10.7982f, 8.7782f)
        curveTo(6.7186f, 11.7422f, 5.8142f, 17.4522f, 8.7782f, 21.5318f)
        curveTo(11.7423f, 25.6114f, 17.4523f, 26.5158f, 21.5319f, 23.5518f)
        curveTo(21.5629f, 23.5293f, 21.5936f, 23.5066f, 21.6243f, 23.4838f)
        lineTo(27.6832f, 30.6985f)
        curveTo(27.9496f, 31.0157f, 28.4226f, 31.0569f, 28.7398f, 30.7905f)
        curveTo(29.057f, 30.5241f, 29.0982f, 30.0511f, 28.8318f, 29.7339f)
        lineTo(22.7502f, 22.492f)
        curveTo(25.7625f, 19.3642f, 26.1933f, 14.4338f, 23.5518f, 10.7982f)
        curveTo(20.5878f, 6.7186f, 14.8778f, 5.8142f, 10.7982f, 8.7782f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(16.8217f, 17.0146f)
        curveTo(16.7791f, 17.3979f, 16.5236f, 17.6392f, 16.1688f, 17.6392f)
        curveTo(15.8139f, 17.6392f, 15.5584f, 17.3979f, 15.5158f, 17.0146f)
        lineTo(14.9055f, 11.6776f)
        curveTo(14.8629f, 11.266f, 15.09f, 10.9537f, 15.4733f, 10.9537f)
        horizontalLineTo(16.8643f)
        curveTo(17.2475f, 10.9537f, 17.4746f, 11.266f, 17.432f, 11.6776f)
        lineTo(16.8217f, 17.0146f)
        close()
        moveTo(17.4039f, 19.811f)
        curveTo(17.4039f, 20.4923f, 16.8787f, 21.0175f, 16.169f, 21.0175f)
        curveTo(15.4593f, 21.0175f, 14.9341f, 20.4923f, 14.9341f, 19.811f)
        verticalLineTo(19.7826f)
        curveTo(14.9341f, 19.1013f, 15.4593f, 18.5761f, 16.169f, 18.5761f)
        curveTo(16.8787f, 18.5761f, 17.4039f, 19.1013f, 17.4039f, 19.7826f)
        verticalLineTo(19.811f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
