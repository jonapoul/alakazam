package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RaptorXTakIcons.Playback: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Playback",
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
        pathFillType = EvenOdd,
      ) {
        moveTo(13.1468f, 4.7028f)
        curveTo(13.8509f, 4.5696f, 14.5778f, 4.5f, 15.321f, 4.5f)
        verticalLineTo(5.6186f)
        curveTo(14.6479f, 5.6186f, 13.9905f, 5.6817f, 13.3546f, 5.8019f)
        lineTo(13.1468f, 4.7028f)
        close()
        moveTo(5.9563f, 9.3171f)
        curveTo(6.7921f, 8.1241f, 7.8625f, 7.0999f, 9.1024f, 6.3067f)
        lineTo(9.7052f, 7.249f)
        curveTo(8.5871f, 7.9644f, 7.6235f, 8.8869f, 6.8724f, 9.959f)
        lineTo(5.9563f, 9.3171f)
        close()
        moveTo(4.0f, 15.5f)
        curveTo(4.0f, 14.7537f, 4.0766f, 14.0243f, 4.2227f, 13.3188f)
        lineTo(5.318f, 13.5457f)
        curveTo(5.1873f, 14.177f, 5.1186f, 14.8304f, 5.1186f, 15.5f)
        curveTo(5.1186f, 16.1695f, 5.1873f, 16.823f, 5.318f, 17.4543f)
        lineTo(4.2227f, 17.6812f)
        curveTo(4.0766f, 16.9757f, 4.0f, 16.2463f, 4.0f, 15.5f)
        close()
        moveTo(9.1023f, 24.6933f)
        curveTo(7.8625f, 23.9f, 6.7921f, 22.8759f, 5.9563f, 21.6829f)
        lineTo(6.8724f, 21.041f)
        curveTo(7.6235f, 22.1131f, 8.5871f, 23.0356f, 9.7052f, 23.751f)
        lineTo(9.1023f, 24.6933f)
        close()
        moveTo(15.321f, 26.5f)
        curveTo(14.5778f, 26.5f, 13.8509f, 26.4304f, 13.1468f, 26.2972f)
        lineTo(13.3546f, 25.1981f)
        curveTo(13.9905f, 25.3183f, 14.6479f, 25.3814f, 15.321f, 25.3814f)
        verticalLineTo(26.5f)
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
        moveTo(24.8813f, 15.5f)
        curveTo(24.8813f, 10.0585f, 20.3297f, 5.6186f, 14.679f, 5.6186f)
        verticalLineTo(4.5f)
        curveTo(20.9153f, 4.5f, 26.0f, 9.409f, 26.0f, 15.5f)
        curveTo(26.0f, 21.591f, 20.9153f, 26.5f, 14.679f, 26.5f)
        verticalLineTo(25.3814f)
        curveTo(20.3297f, 25.3814f, 24.8813f, 20.9415f, 24.8813f, 15.5f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(18.0945f, 14.9804f)
        curveTo(18.4654f, 15.164f, 18.4654f, 15.6931f, 18.0945f, 15.8767f)
        lineTo(13.7218f, 18.0406f)
        curveTo(13.3894f, 18.2051f, 13.0f, 17.9633f, 13.0f, 17.5925f)
        lineTo(13.0f, 13.2647f)
        curveTo(13.0f, 12.8939f, 13.3894f, 12.6521f, 13.7218f, 12.8165f)
        lineTo(18.0945f, 14.9804f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.Playback)
