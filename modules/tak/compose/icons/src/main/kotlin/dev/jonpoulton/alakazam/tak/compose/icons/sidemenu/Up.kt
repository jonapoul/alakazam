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

public val SideMenuTakIcons.Up: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Up",
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
        moveTo(16.9578f, 8.0422f)
        lineTo(16.9588f, 8.0412f)
        curveTo(17.5446f, 7.4554f, 18.4944f, 7.4554f, 19.0802f, 8.0412f)
        lineTo(23.7995f, 12.7605f)
        curveTo(24.3853f, 13.3463f, 24.3853f, 14.296f, 23.7995f, 14.8818f)
        curveTo(23.2137f, 15.4676f, 22.264f, 15.4676f, 21.6782f, 14.8818f)
        lineTo(19.5183f, 12.722f)
        lineTo(19.5192f, 28.8978f)
        curveTo(19.5192f, 29.7262f, 18.8477f, 30.3978f, 18.0192f, 30.3978f)
        curveTo(17.1908f, 30.3979f, 16.5192f, 29.7263f, 16.5192f, 28.8979f)
        lineTo(16.5183f, 12.7243f)
        lineTo(14.3616f, 14.881f)
        curveTo(13.7758f, 15.4668f, 12.8261f, 15.4668f, 12.2403f, 14.881f)
        curveTo(11.6545f, 14.2952f, 11.6545f, 13.3455f, 12.2403f, 12.7597f)
        lineTo(16.9572f, 8.0428f)
        curveTo(16.9574f, 8.0426f, 16.9576f, 8.0424f, 16.9578f, 8.0422f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Up)
