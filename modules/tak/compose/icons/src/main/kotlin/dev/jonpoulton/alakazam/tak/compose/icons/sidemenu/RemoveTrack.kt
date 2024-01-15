package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

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
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.RemoveTrack: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RemoveTrack",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(7.5824f, 15.0985f)
        lineTo(6f, 13.58f)
        lineTo(12.8571f, 7f)
        lineTo(19.7143f, 13.58f)
        lineTo(18.1319f, 15.0985f)
        lineTo(12.8571f, 10.0369f)
        lineTo(7.5824f, 15.0985f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(7.5824f, 23.5554f)
        lineTo(6f, 21.8472f)
        lineTo(12.8571f, 14.4447f)
        lineTo(19.7143f, 21.8472f)
        lineTo(18.1319f, 23.5554f)
        lineTo(12.8571f, 17.8612f)
        lineTo(7.5824f, 23.5554f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(7.5824f, 31f)
        lineTo(6f, 29.4815f)
        lineTo(12.8571f, 22.9015f)
        lineTo(19.7143f, 29.4815f)
        lineTo(18.1319f, 31f)
        lineTo(12.8571f, 25.9385f)
        lineTo(7.5824f, 31f)
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
        moveTo(28.4853f, 13.4853f)
        curveTo(30.0474f, 11.9232f, 30.0474f, 9.3905f, 28.4853f, 7.8284f)
        curveTo(26.9232f, 6.2663f, 24.3905f, 6.2663f, 22.8284f, 7.8284f)
        curveTo(21.2663f, 9.3905f, 21.2663f, 11.9232f, 22.8284f, 13.4853f)
        curveTo(24.3905f, 15.0474f, 26.9232f, 15.0474f, 28.4853f, 13.4853f)
        close()
        moveTo(28.0843f, 11.1568f)
        curveTo(28.3604f, 11.1568f, 28.5843f, 10.9329f, 28.5843f, 10.6568f)
        curveTo(28.5843f, 10.3807f, 28.3604f, 10.1568f, 28.0843f, 10.1568f)
        lineTo(23.2293f, 10.1568f)
        curveTo(22.9532f, 10.1568f, 22.7293f, 10.3807f, 22.7293f, 10.6568f)
        curveTo(22.7293f, 10.9329f, 22.9532f, 11.1568f, 23.2293f, 11.1568f)
        lineTo(28.0843f, 11.1568f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.RemoveTrack)
