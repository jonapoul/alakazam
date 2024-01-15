package dev.jonpoulton.alakazam.tak.compose.icons.radial

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
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RadialTakIcons.Hostile: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Hostile",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
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
        moveTo(16.2929f, 5.2071f)
        curveTo(16.6834f, 4.8166f, 17.3166f, 4.8166f, 17.7071f, 5.2071f)
        lineTo(29.3005f, 16.8005f)
        curveTo(29.6911f, 17.1911f, 29.6911f, 17.8242f, 29.3005f, 18.2147f)
        lineTo(17.7181f, 29.7971f)
        curveTo(17.3276f, 30.1877f, 16.6944f, 30.1877f, 16.3039f, 29.7971f)
        lineTo(4.7105f, 18.2037f)
        curveTo(4.32f, 17.8132f, 4.32f, 17.18f, 4.7105f, 16.7895f)
        lineTo(16.2929f, 5.2071f)
        close()
        moveTo(17.0006f, 6.0297f)
        lineTo(5.533f, 17.4973f)
        lineTo(17.0104f, 28.9746f)
        lineTo(28.478f, 17.507f)
        lineTo(17.0006f, 6.0297f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.Hostile)
