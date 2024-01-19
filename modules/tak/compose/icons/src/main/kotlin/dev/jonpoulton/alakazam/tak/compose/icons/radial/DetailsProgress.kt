package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.DetailsProgress: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "DetailsProgress",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      group {
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(29.8468f, 24.2389f)
          curveTo(30.261f, 24.2389f, 30.5968f, 24.5747f, 30.5968f, 24.9889f)
          curveTo(30.5968f, 25.3686f, 30.3146f, 25.6824f, 29.9486f, 25.7321f)
          lineTo(29.8468f, 25.7389f)
          horizontalLineTo(20.5835f)
          curveTo(20.1693f, 25.7389f, 19.8335f, 25.4031f, 19.8335f, 24.9889f)
          curveTo(19.8335f, 24.6092f, 20.1156f, 24.2954f, 20.4817f, 24.2458f)
          lineTo(20.5835f, 24.2389f)
          horizontalLineTo(29.8468f)
          close()
          moveTo(29.8468f, 19.3257f)
          curveTo(30.261f, 19.3257f, 30.5968f, 19.6614f, 30.5968f, 20.0757f)
          curveTo(30.5968f, 20.4553f, 30.3146f, 20.7691f, 29.9486f, 20.8188f)
          lineTo(29.8468f, 20.8257f)
          horizontalLineTo(20.5835f)
          curveTo(20.1693f, 20.8257f, 19.8335f, 20.4899f, 19.8335f, 20.0757f)
          curveTo(19.8335f, 19.696f, 20.1156f, 19.3822f, 20.4817f, 19.3325f)
          lineTo(20.5835f, 19.3257f)
          horizontalLineTo(29.8468f)
          close()
          moveTo(29.8468f, 14.4132f)
          curveTo(30.261f, 14.4132f, 30.5968f, 14.749f, 30.5968f, 15.1632f)
          curveTo(30.5968f, 15.5429f, 30.3146f, 15.8567f, 29.9486f, 15.9064f)
          lineTo(29.8468f, 15.9132f)
          horizontalLineTo(20.5835f)
          curveTo(20.1693f, 15.9132f, 19.8335f, 15.5775f, 19.8335f, 15.1632f)
          curveTo(19.8335f, 14.7836f, 20.1156f, 14.4698f, 20.4817f, 14.4201f)
          lineTo(20.5835f, 14.4132f)
          horizontalLineTo(29.8468f)
          close()
          moveTo(29.8468f, 9.5f)
          curveTo(30.261f, 9.5f, 30.5968f, 9.8358f, 30.5968f, 10.25f)
          curveTo(30.5968f, 10.6297f, 30.3146f, 10.9435f, 29.9486f, 10.9931f)
          lineTo(29.8468f, 11f)
          horizontalLineTo(20.5835f)
          curveTo(20.1693f, 11f, 19.8335f, 10.6642f, 19.8335f, 10.25f)
          curveTo(19.8335f, 9.8703f, 20.1156f, 9.5565f, 20.4817f, 9.5068f)
          lineTo(20.5835f, 9.5f)
          horizontalLineTo(29.8468f)
          close()
        }
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(15.14f, 12.8265f)
          curveTo(15.381f, 12.4896f, 15.8495f, 12.4118f, 16.1864f, 12.6529f)
          curveTo(16.4926f, 12.8719f, 16.5847f, 13.279f, 16.4179f, 13.6043f)
          lineTo(16.36f, 13.6992f)
          lineTo(9.2061f, 23.6992f)
          curveTo(8.9556f, 24.0494f, 8.4692f, 24.1123f, 8.1392f, 23.8578f)
          lineTo(8.0602f, 23.7875f)
          lineTo(4.2141f, 19.8589f)
          curveTo(3.9243f, 19.563f, 3.9293f, 19.0881f, 4.2253f, 18.7983f)
          curveTo(4.4944f, 18.5349f, 4.9113f, 18.5151f, 5.2026f, 18.7361f)
          lineTo(5.2859f, 18.8096f)
          lineTo(8.506f, 22.0988f)
          lineTo(15.14f, 12.8265f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.DetailsProgress)
