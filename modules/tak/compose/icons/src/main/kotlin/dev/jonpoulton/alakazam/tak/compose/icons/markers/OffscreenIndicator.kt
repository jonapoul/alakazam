package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val MarkersTakIcons.OffscreenIndicator: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "OffscreenIndicator",
      defaultWidth = 47.0.dp,
      defaultHeight = 47.0.dp,
      viewportWidth = 47.0f,
      viewportHeight = 47.0f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(12.0f, 20.3137f)
        lineTo(23.3137f, 9.0f)
        lineTo(34.6274f, 20.3137f)
        lineTo(23.3137f, 31.6274f)
        lineTo(12.0f, 20.3137f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Bronze),
        strokeLineWidth = 1.0f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(11.6863f, 17.5f)
        lineTo(23.0f, 6.1863f)
        lineTo(34.3137f, 17.5f)
      }
      path(
        fill = SolidColor(TakColors.Gamma),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(19.3101f, 20.3101f)
        curveTo(19.3101f, 18.1009f, 21.1009f, 16.3101f, 23.3101f, 16.3101f)
        curveTo(25.5192f, 16.3101f, 27.3101f, 18.1009f, 27.3101f, 20.3101f)
        curveTo(27.3101f, 22.5192f, 25.5192f, 24.3101f, 23.3101f, 24.3101f)
        curveTo(21.1009f, 24.3101f, 19.3101f, 22.5192f, 19.3101f, 20.3101f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.8101f, 20.3101f)
        curveTo(19.8101f, 22.2431f, 21.3771f, 23.8101f, 23.3101f, 23.8101f)
        curveTo(25.2431f, 23.8101f, 26.8101f, 22.2431f, 26.8101f, 20.3101f)
        curveTo(26.8101f, 18.3771f, 25.2431f, 16.8101f, 23.3101f, 16.8101f)
        curveTo(21.3771f, 16.8101f, 19.8101f, 18.3771f, 19.8101f, 20.3101f)
        close()
        moveTo(23.3101f, 16.3101f)
        curveTo(21.1009f, 16.3101f, 19.3101f, 18.1009f, 19.3101f, 20.3101f)
        curveTo(19.3101f, 22.5192f, 21.1009f, 24.3101f, 23.3101f, 24.3101f)
        curveTo(25.5192f, 24.3101f, 27.3101f, 22.5192f, 27.3101f, 20.3101f)
        curveTo(27.3101f, 18.1009f, 25.5192f, 16.3101f, 23.3101f, 16.3101f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.OffscreenIndicator)
