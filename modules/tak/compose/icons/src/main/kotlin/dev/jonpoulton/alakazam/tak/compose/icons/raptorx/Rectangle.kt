package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.Rectangle: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Rectangle",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.5133f, 16.8428f)
        curveTo(24.893f, 16.8428f, 25.2068f, 17.1249f, 25.2565f, 17.491f)
        lineTo(25.2633f, 17.5928f)
        verticalLineTo(23.6646f)
        curveTo(25.2633f, 24.0788f, 24.9275f, 24.4146f, 24.5133f, 24.4146f)
        curveTo(24.1336f, 24.4146f, 23.8198f, 24.1324f, 23.7702f, 23.7664f)
        lineTo(23.7633f, 23.6646f)
        verticalLineTo(17.5928f)
        curveTo(23.7633f, 17.1786f, 24.0991f, 16.8428f, 24.5133f, 16.8428f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(27.5483f, 19.8784f)
        curveTo(27.9625f, 19.8784f, 28.2983f, 20.2142f, 28.2983f, 20.6284f)
        curveTo(28.2983f, 21.0081f, 28.0161f, 21.3219f, 27.6501f, 21.3716f)
        lineTo(27.5483f, 21.3784f)
        horizontalLineTo(21.4773f)
        curveTo(21.0631f, 21.3784f, 20.7273f, 21.0426f, 20.7273f, 20.6284f)
        curveTo(20.7273f, 20.2487f, 21.0094f, 19.9349f, 21.3755f, 19.8853f)
        lineTo(21.4773f, 19.8784f)
        horizontalLineTo(27.5483f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(28.0f, 5.25f)
        curveTo(28.3797f, 5.25f, 28.6935f, 5.5321f, 28.7432f, 5.8982f)
        lineTo(28.75f, 6.0f)
        verticalLineTo(15.4807f)
        curveTo(28.75f, 15.8949f, 28.4142f, 16.2307f, 28.0f, 16.2307f)
        curveTo(27.6203f, 16.2307f, 27.3065f, 15.9486f, 27.2568f, 15.5825f)
        lineTo(27.25f, 15.4807f)
        verticalLineTo(6.75f)
        horizontalLineTo(2.75f)
        verticalLineTo(24.25f)
        horizontalLineTo(18.8703f)
        curveTo(19.25f, 24.25f, 19.5638f, 24.5322f, 19.6134f, 24.8982f)
        lineTo(19.6203f, 25.0f)
        curveTo(19.6203f, 25.3797f, 19.3381f, 25.6935f, 18.9721f, 25.7432f)
        lineTo(18.8703f, 25.75f)
        horizontalLineTo(2.0f)
        curveTo(1.6203f, 25.75f, 1.3065f, 25.4678f, 1.2569f, 25.1018f)
        lineTo(1.25f, 25.0f)
        verticalLineTo(6.0f)
        curveTo(1.25f, 5.6203f, 1.5322f, 5.3065f, 1.8982f, 5.2568f)
        lineTo(2.0f, 5.25f)
        horizontalLineTo(28.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.Rectangle)
