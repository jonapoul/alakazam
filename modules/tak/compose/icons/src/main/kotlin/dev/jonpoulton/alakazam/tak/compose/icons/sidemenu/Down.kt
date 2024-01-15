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
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.Down: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Down",
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
        moveTo(16.9578f, 28.9578f)
        lineTo(16.9588f, 28.9588f)
        curveTo(17.5446f, 29.5446f, 18.4944f, 29.5446f, 19.0802f, 28.9588f)
        lineTo(23.7995f, 24.2395f)
        curveTo(24.3853f, 23.6537f, 24.3853f, 22.704f, 23.7995f, 22.1182f)
        curveTo(23.2137f, 21.5324f, 22.264f, 21.5324f, 21.6782f, 22.1182f)
        lineTo(19.5183f, 24.278f)
        lineTo(19.5192f, 8.1022f)
        curveTo(19.5192f, 7.2738f, 18.8477f, 6.6022f, 18.0192f, 6.6022f)
        curveTo(17.1908f, 6.6021f, 16.5192f, 7.2737f, 16.5192f, 8.1021f)
        lineTo(16.5183f, 24.2757f)
        lineTo(14.3616f, 22.119f)
        curveTo(13.7758f, 21.5332f, 12.8261f, 21.5332f, 12.2403f, 22.119f)
        curveTo(11.6545f, 22.7048f, 11.6545f, 23.6545f, 12.2403f, 24.2403f)
        lineTo(16.9572f, 28.9572f)
        curveTo(16.9574f, 28.9574f, 16.9576f, 28.9576f, 16.9578f, 28.9578f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Down)
