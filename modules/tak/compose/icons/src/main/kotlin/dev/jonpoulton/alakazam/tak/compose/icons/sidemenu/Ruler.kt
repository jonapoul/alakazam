package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.Ruler: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Ruler",
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
        moveTo(24.7071f, 7.7071f)
        curveTo(24.3166f, 7.3166f, 23.6834f, 7.3166f, 23.2929f, 7.7071f)
        lineTo(22.6875f, 8.3125f)
        lineTo(25.3125f, 10.9375f)
        curveTo(25.5196f, 11.1446f, 25.5196f, 11.4804f, 25.3125f, 11.6875f)
        curveTo(25.1054f, 11.8946f, 24.7696f, 11.8946f, 24.5625f, 11.6875f)
        lineTo(21.9375f, 9.0625f)
        lineTo(20.25f, 10.75f)
        lineTo(21.375f, 11.875f)
        curveTo(21.5821f, 12.0821f, 21.5821f, 12.4179f, 21.375f, 12.625f)
        curveTo(21.1679f, 12.8321f, 20.8321f, 12.8321f, 20.625f, 12.625f)
        lineTo(19.5f, 11.5f)
        lineTo(17.8125f, 13.1875f)
        lineTo(20.4375f, 15.8125f)
        curveTo(20.6446f, 16.0196f, 20.6446f, 16.3554f, 20.4375f, 16.5625f)
        curveTo(20.2304f, 16.7696f, 19.8946f, 16.7696f, 19.6875f, 16.5625f)
        lineTo(17.0625f, 13.9375f)
        lineTo(15.375f, 15.625f)
        lineTo(16.5f, 16.75f)
        curveTo(16.7071f, 16.9571f, 16.7071f, 17.2929f, 16.5f, 17.5f)
        curveTo(16.2929f, 17.7071f, 15.9571f, 17.7071f, 15.75f, 17.5f)
        lineTo(14.625f, 16.375f)
        lineTo(12.9375f, 18.0625f)
        lineTo(15.5625f, 20.6875f)
        curveTo(15.7696f, 20.8946f, 15.7696f, 21.2304f, 15.5625f, 21.4375f)
        curveTo(15.3554f, 21.6446f, 15.0196f, 21.6446f, 14.8125f, 21.4375f)
        lineTo(12.1875f, 18.8125f)
        lineTo(10.5f, 20.5f)
        lineTo(11.625f, 21.625f)
        curveTo(11.8321f, 21.8321f, 11.8321f, 22.1679f, 11.625f, 22.375f)
        curveTo(11.4179f, 22.5821f, 11.0821f, 22.5821f, 10.875f, 22.375f)
        lineTo(9.75f, 21.25f)
        lineTo(8.0625f, 22.9375f)
        lineTo(10.6875f, 25.5625f)
        curveTo(10.8946f, 25.7696f, 10.8946f, 26.1054f, 10.6875f, 26.3125f)
        curveTo(10.4804f, 26.5196f, 10.1446f, 26.5196f, 9.9375f, 26.3125f)
        lineTo(7.3125f, 23.6875f)
        lineTo(6.7071f, 24.2929f)
        curveTo(6.3166f, 24.6834f, 6.3166f, 25.3166f, 6.7071f, 25.7071f)
        lineTo(11.2929f, 30.2929f)
        curveTo(11.6834f, 30.6834f, 12.3166f, 30.6834f, 12.7071f, 30.2929f)
        lineTo(29.2929f, 13.7071f)
        curveTo(29.6834f, 13.3166f, 29.6834f, 12.6834f, 29.2929f, 12.2929f)
        lineTo(24.7071f, 7.7071f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Ruler)
