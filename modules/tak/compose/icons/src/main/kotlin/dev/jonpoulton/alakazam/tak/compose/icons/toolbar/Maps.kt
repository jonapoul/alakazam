package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val ToolbarTakIcons.Maps: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Maps",
      defaultWidth = 40.0.dp,
      defaultHeight = 41.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 41.0f,
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
        moveTo(24.913f, 11.8259f)
        lineTo(32.7263f, 8.5586f)
        curveTo(33.2205f, 8.3519f, 33.7658f, 8.7149f, 33.7658f, 9.2505f)
        verticalLineTo(29.3965f)
        curveTo(33.7658f, 29.6989f, 33.5842f, 29.9717f, 33.3052f, 30.0884f)
        lineTo(25.2132f, 33.4734f)
        curveTo(25.0342f, 33.5483f, 24.8332f, 33.5509f, 24.6523f, 33.4807f)
        lineTo(16.421f, 30.2839f)
        lineTo(8.0225f, 33.5632f)
        curveTo(7.5635f, 33.7424f, 7.0704f, 33.4384f, 7.0067f, 32.9678f)
        lineTo(6.9998f, 32.8645f)
        verticalLineTo(12.7175f)
        curveTo(6.9998f, 12.4086f, 7.1892f, 12.1313f, 7.477f, 12.0189f)
        lineTo(16.147f, 8.6339f)
        curveTo(16.322f, 8.5656f, 16.5162f, 8.5654f, 16.6913f, 8.6334f)
        lineTo(24.913f, 11.8259f)
        close()
        moveTo(24.009f, 13.0848f)
        lineTo(17.0871f, 10.3957f)
        verticalLineTo(28.9341f)
        lineTo(24.009f, 31.621f)
        verticalLineTo(13.0848f)
        close()
        moveTo(25.509f, 13.2037f)
        verticalLineTo(31.7227f)
        lineTo(32.265f, 28.8969f)
        verticalLineTo(10.3769f)
        lineTo(25.509f, 13.2037f)
        close()
        moveTo(8.499f, 13.2299f)
        lineTo(15.5871f, 10.4625f)
        verticalLineTo(28.9994f)
        lineTo(8.499f, 31.7659f)
        verticalLineTo(13.2299f)
        close()
      }
    }.build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Maps)
