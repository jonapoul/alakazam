package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.Elevation: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Elevation",
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
        moveTo(25.9383f, 9.7419f)
        curveTo(25.6178f, 9.3914f, 25.0378f, 9.4224f, 24.763f, 9.8334f)
        lineTo(20.42f, 16.3284f)
        lineTo(20.3652f, 16.425f)
        curveTo(20.2087f, 16.7554f, 20.3136f, 17.1594f, 20.6266f, 17.3687f)
        lineTo(20.7233f, 17.4236f)
        curveTo(21.0537f, 17.58f, 21.4576f, 17.4752f, 21.667f, 17.1621f)
        lineTo(25.3909f, 11.5929f)
        lineTo(35.2749f, 26.1839f)
        lineTo(27.7595f, 26.1842f)
        lineTo(27.6577f, 26.1911f)
        curveTo(27.2916f, 26.2408f, 27.0095f, 26.5545f, 27.0095f, 26.9342f)
        curveTo(27.0095f, 27.3485f, 27.3453f, 27.6842f, 27.7595f, 27.6842f)
        horizontalLineTo(36.6895f)
        lineTo(36.793f, 27.6774f)
        curveTo(37.3306f, 27.6057f, 37.628f, 26.9823f, 37.3104f, 26.5136f)
        lineTo(26.0074f, 9.8296f)
        lineTo(25.9383f, 9.7419f)
        close()
        moveTo(17.1017f, 16.7181f)
        lineTo(13.9539f, 21.3629f)
        lineTo(12.6915f, 19.4991f)
        curveTo(12.394f, 19.06f, 11.7471f, 19.06f, 11.4497f, 19.4991f)
        lineTo(4.1287f, 30.3061f)
        curveTo(3.7902f, 30.8057f, 4.1504f, 31.4802f, 4.7539f, 31.4767f)
        lineTo(26.8459f, 31.3507f)
        curveTo(27.4455f, 31.3473f, 27.7988f, 30.6765f, 27.4625f, 30.1801f)
        lineTo(18.3435f, 16.7181f)
        curveTo(18.0461f, 16.279f, 17.3992f, 16.2789f, 17.1017f, 16.7181f)
        close()
        moveTo(17.7219f, 18.4759f)
        lineTo(25.4319f, 29.8579f)
        lineTo(6.1689f, 29.9679f)
        lineTo(12.0699f, 21.2569f)
        lineTo(13.3337f, 23.1214f)
        curveTo(13.6312f, 23.5605f, 14.278f, 23.5605f, 14.5755f, 23.1214f)
        lineTo(17.7219f, 18.4759f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
