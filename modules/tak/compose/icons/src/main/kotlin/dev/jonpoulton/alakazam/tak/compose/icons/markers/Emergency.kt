package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons

val MarkersTakIcons.Emergency: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Emergency",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Alert),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Round,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(14.2113f, 4.0777f)
        curveTo(14.9483f, 2.6036f, 17.0519f, 2.6036f, 17.789f, 4.0777f)
        lineTo(30.5529f, 29.6056f)
        curveTo(31.2178f, 30.9354f, 30.2508f, 32.5f, 28.7641f, 32.5f)
        horizontalLineTo(3.2362f)
        curveTo(1.7494f, 32.5f, 0.7824f, 30.9354f, 1.4473f, 29.6056f)
        lineTo(14.2113f, 4.0777f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(17.0314f, 22.0233f)
        curveTo(16.9642f, 22.6326f, 16.5614f, 23.0163f, 16.0018f, 23.0163f)
        curveTo(15.4423f, 23.0163f, 15.0394f, 22.6326f, 14.9723f, 22.0233f)
        lineTo(14.0099f, 13.5381f)
        curveTo(13.9427f, 12.8837f, 14.3008f, 12.3872f, 14.9051f, 12.3872f)
        horizontalLineTo(17.0985f)
        curveTo(17.7028f, 12.3872f, 18.0609f, 12.8837f, 17.9938f, 13.5381f)
        lineTo(17.0314f, 22.0233f)
        close()
        moveTo(17.9492f, 26.469f)
        curveTo(17.9492f, 27.5522f, 17.1211f, 28.3872f, 16.002f, 28.3872f)
        curveTo(14.8829f, 28.3872f, 14.0548f, 27.5522f, 14.0548f, 26.469f)
        verticalLineTo(26.4239f)
        curveTo(14.0548f, 25.3407f, 14.8829f, 24.5057f, 16.002f, 24.5057f)
        curveTo(17.1211f, 24.5057f, 17.9492f, 25.3407f, 17.9492f, 26.4239f)
        verticalLineTo(26.469f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
