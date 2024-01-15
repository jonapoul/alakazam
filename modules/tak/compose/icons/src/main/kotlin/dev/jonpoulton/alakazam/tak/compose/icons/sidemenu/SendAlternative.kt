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

public val SideMenuTakIcons.SendAlternate: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "SendAlternative",
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
        moveTo(6.9723f, 17.6883f)
        curveTo(6.0427f, 17.4593f, 5.9354f, 16.1807f, 6.8137f, 15.7999f)
        lineTo(26.8764f, 7.1012f)
        curveTo(27.6325f, 6.7734f, 28.4383f, 7.4495f, 28.2469f, 8.251f)
        lineTo(23.0864f, 29.8629f)
        curveTo(22.8733f, 30.7553f, 21.6712f, 30.9136f, 21.2344f, 30.1067f)
        lineTo(16.1707f, 20.7538f)
        lineTo(24.8041f, 10.9971f)
        lineTo(13.5339f, 19.3053f)
        lineTo(6.9723f, 17.6883f)
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
        moveTo(16.1705f, 20.7538f)
        lineTo(14.9749f, 25.6747f)
        curveTo(14.6904f, 26.8456f, 16.3374f, 27.4271f, 16.8512f, 26.3372f)
        lineTo(17.9999f, 23.9002f)
        lineTo(16.1705f, 20.7538f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.SendAlternate)
