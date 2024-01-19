package dev.jonpoulton.alakazam.tak.compose.icons.markers

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
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val MarkersTakIcons.Pin: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Pin",
      defaultWidth = 32.0.dp,
      defaultHeight = 35.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 35.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFFFFD982)),
        stroke = SolidColor(Color(0xFF231F20)),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(28.0f, 12.9201f)
        curveTo(28.0f, 19.5025f, 15.999f, 33.0f, 15.999f, 33.0f)
        curveTo(15.999f, 33.0f, 4.0f, 19.5025f, 4.0f, 12.9201f)
        curveTo(4.0f, 6.3358f, 9.3729f, 1.0f, 15.999f, 1.0f)
        curveTo(22.6271f, 1.0f, 28.0f, 6.3358f, 28.0f, 12.9201f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.Pin)
