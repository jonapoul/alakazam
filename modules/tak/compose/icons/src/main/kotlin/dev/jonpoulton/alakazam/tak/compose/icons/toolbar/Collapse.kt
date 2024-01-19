package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.Collapse: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Collapse",
      defaultWidth = 40.0.dp,
      defaultHeight = 40.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 40.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        fillAlpha = 0.7f,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(0.0f, 0.0f)
        horizontalLineToRelative(40.0f)
        verticalLineToRelative(40.0f)
        horizontalLineToRelative(-40.0f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(28.0424f, 9.8786f)
        curveTo(27.6603f, 9.4605f, 27.032f, 9.4014f, 26.5814f, 9.7204f)
        lineTo(26.4727f, 9.8081f)
        lineTo(16.4727f, 18.9478f)
        curveTo(16.0348f, 19.348f, 15.9933f, 20.0137f, 16.3558f, 20.4638f)
        lineTo(16.4466f, 20.5636f)
        lineTo(26.4466f, 30.3127f)
        curveTo(26.886f, 30.7411f, 27.5895f, 30.7321f, 28.0178f, 30.2927f)
        curveTo(28.4133f, 29.8871f, 28.4361f, 29.2565f, 28.0916f, 28.825f)
        lineTo(27.9979f, 28.7215f)
        lineTo(18.8411f, 19.7927f)
        lineTo(27.9719f, 11.4484f)
        curveTo(28.39f, 11.0662f, 28.4491f, 10.438f, 28.1301f, 9.9873f)
        lineTo(28.0424f, 9.8786f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(12.2223f, 7.7778f)
        curveTo(11.6524f, 7.7778f, 11.1828f, 8.2068f, 11.1186f, 8.7594f)
        lineTo(11.1112f, 8.8889f)
        verticalLineTo(30.145f)
        curveTo(11.1112f, 30.7586f, 11.6086f, 31.2561f, 12.2223f, 31.2561f)
        curveTo(12.7921f, 31.2561f, 13.2617f, 30.8272f, 13.3259f, 30.2746f)
        lineTo(13.3334f, 30.145f)
        verticalLineTo(8.8889f)
        curveTo(13.3334f, 8.2753f, 12.8359f, 7.7778f, 12.2223f, 7.7778f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Collapse)
