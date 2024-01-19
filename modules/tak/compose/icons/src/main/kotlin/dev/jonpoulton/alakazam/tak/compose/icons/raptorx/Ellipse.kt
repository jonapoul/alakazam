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

public val RaptorXTakIcons.Ellipse: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Ellipse",
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
        moveTo(14.9998f, 2.2598f)
        curveTo(22.3121f, 2.2598f, 25.2403f, 8.188f, 25.2403f, 15.5003f)
        curveTo(25.2403f, 16.9433f, 25.0091f, 18.3554f, 24.5605f, 19.6967f)
        curveTo(24.4292f, 20.0895f, 24.0042f, 20.3015f, 23.6114f, 20.1701f)
        curveTo(23.2186f, 20.0387f, 23.0066f, 19.6138f, 23.138f, 19.221f)
        curveTo(23.5354f, 18.0326f, 23.7403f, 16.7811f, 23.7403f, 15.5003f)
        curveTo(23.7403f, 9.0164f, 21.4837f, 3.7598f, 14.9998f, 3.7598f)
        curveTo(8.5165f, 3.7598f, 6.26f, 9.0165f, 6.26f, 15.5003f)
        curveTo(6.26f, 21.9834f, 8.5167f, 27.2401f, 14.9998f, 27.2401f)
        curveTo(16.6927f, 27.2401f, 18.3326f, 26.8821f, 19.8406f, 26.1987f)
        curveTo(20.2179f, 26.0277f, 20.6623f, 26.195f, 20.8333f, 26.5722f)
        curveTo(21.0043f, 26.9495f, 20.8371f, 27.394f, 20.4598f, 27.565f)
        curveTo(18.7583f, 28.336f, 16.9074f, 28.7401f, 14.9998f, 28.7401f)
        curveTo(7.6882f, 28.7401f, 4.76f, 22.8119f, 4.76f, 15.5003f)
        curveTo(4.76f, 8.1881f, 7.6881f, 2.2598f, 14.9998f, 2.2598f)
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
        moveTo(22.4009f, 20.9009f)
        curveTo(22.654f, 20.9009f, 22.8632f, 21.0872f, 22.8963f, 21.3289f)
        lineTo(22.9009f, 21.3961f)
        verticalLineTo(25.4056f)
        curveTo(22.9009f, 25.6791f, 22.677f, 25.9009f, 22.4009f, 25.9009f)
        curveTo(22.1477f, 25.9009f, 21.9386f, 25.7146f, 21.9054f, 25.4728f)
        lineTo(21.9009f, 25.4056f)
        verticalLineTo(21.3961f)
        curveTo(21.9009f, 21.1226f, 22.1247f, 20.9009f, 22.4009f, 20.9009f)
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
        moveTo(24.4056f, 22.9009f)
        curveTo(24.6791f, 22.9009f, 24.9009f, 23.1247f, 24.9009f, 23.4009f)
        curveTo(24.9009f, 23.654f, 24.7145f, 23.8632f, 24.4728f, 23.8963f)
        lineTo(24.4056f, 23.9009f)
        horizontalLineTo(20.3962f)
        curveTo(20.1226f, 23.9009f, 19.9009f, 23.677f, 19.9009f, 23.4009f)
        curveTo(19.9009f, 23.1477f, 20.0872f, 22.9386f, 20.329f, 22.9054f)
        lineTo(20.3962f, 22.9009f)
        horizontalLineTo(24.4056f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.Ellipse)
