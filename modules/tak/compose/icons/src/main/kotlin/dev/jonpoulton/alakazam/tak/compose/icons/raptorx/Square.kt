package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.Square: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Square",
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
        moveTo(24.5132f, 20.3428f)
        curveTo(24.8929f, 20.3428f, 25.2067f, 20.6249f, 25.2563f, 20.991f)
        lineTo(25.2632f, 21.0928f)
        verticalLineTo(27.1646f)
        curveTo(25.2632f, 27.5788f, 24.9274f, 27.9146f, 24.5132f, 27.9146f)
        curveTo(24.1335f, 27.9146f, 23.8197f, 27.6324f, 23.77f, 27.2664f)
        lineTo(23.7632f, 27.1646f)
        verticalLineTo(21.0928f)
        curveTo(23.7632f, 20.6786f, 24.099f, 20.3428f, 24.5132f, 20.3428f)
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
        moveTo(27.5483f, 23.3784f)
        curveTo(27.9625f, 23.3784f, 28.2983f, 23.7142f, 28.2983f, 24.1284f)
        curveTo(28.2983f, 24.5081f, 28.0161f, 24.8219f, 27.6501f, 24.8716f)
        lineTo(27.5483f, 24.8784f)
        horizontalLineTo(21.4773f)
        curveTo(21.0631f, 24.8784f, 20.7273f, 24.5426f, 20.7273f, 24.1284f)
        curveTo(20.7273f, 23.7487f, 21.0094f, 23.4349f, 21.3755f, 23.3853f)
        lineTo(21.4773f, 23.3784f)
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
        moveTo(28.0f, 1.75f)
        curveTo(28.3797f, 1.75f, 28.6935f, 2.0322f, 28.7432f, 2.3982f)
        lineTo(28.75f, 2.5f)
        verticalLineTo(18.9807f)
        curveTo(28.75f, 19.3949f, 28.4142f, 19.7307f, 28.0f, 19.7307f)
        curveTo(27.6203f, 19.7307f, 27.3065f, 19.4486f, 27.2568f, 19.0825f)
        lineTo(27.25f, 18.9807f)
        verticalLineTo(3.25f)
        horizontalLineTo(2.75f)
        verticalLineTo(27.75f)
        horizontalLineTo(18.8703f)
        curveTo(19.25f, 27.75f, 19.5638f, 28.0322f, 19.6134f, 28.3982f)
        lineTo(19.6203f, 28.5f)
        curveTo(19.6203f, 28.8797f, 19.3381f, 29.1935f, 18.9721f, 29.2432f)
        lineTo(18.8703f, 29.25f)
        horizontalLineTo(2.0f)
        curveTo(1.6203f, 29.25f, 1.3065f, 28.9678f, 1.2569f, 28.6018f)
        lineTo(1.25f, 28.5f)
        verticalLineTo(2.5f)
        curveTo(1.25f, 2.1203f, 1.5322f, 1.8065f, 1.8982f, 1.7569f)
        lineTo(2.0f, 1.75f)
        horizontalLineTo(28.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
