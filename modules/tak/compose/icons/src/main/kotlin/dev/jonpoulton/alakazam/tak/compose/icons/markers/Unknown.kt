package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val MarkersTakIcons.Unknown: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Unknown",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFFFFF89D)),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(9.317f, 23.6836f)
        curveTo(10.0162f, 26.7288f, 12.743f, 29.0f, 16.0004f, 29.0f)
        curveTo(19.2578f, 29.0f, 21.9848f, 26.7287f, 22.6838f, 23.6834f)
        curveTo(25.729f, 22.9842f, 28.0002f, 20.2573f, 28.0002f, 17.0f)
        curveTo(28.0002f, 13.7427f, 25.729f, 11.0158f, 22.6838f, 10.3167f)
        curveTo(21.9848f, 7.2713f, 19.2578f, 5.0f, 16.0004f, 5.0f)
        curveTo(12.743f, 5.0f, 10.0161f, 7.2713f, 9.317f, 10.3165f)
        curveTo(6.2715f, 11.0155f, 4.0f, 13.7425f, 4.0f, 17.0001f)
        curveTo(4.0f, 20.2576f, 6.2715f, 22.9846f, 9.317f, 23.6836f)
        close()
      }
      group {
        path(
          fill = SolidColor(Color.Black),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(9.317f, 23.6836f)
          lineTo(10.779f, 23.3479f)
          lineTo(10.5687f, 22.4318f)
          lineTo(9.6525f, 22.2216f)
          lineTo(9.317f, 23.6836f)
          close()
          moveTo(22.6838f, 23.6834f)
          lineTo(22.3482f, 22.2214f)
          lineTo(21.4321f, 22.4317f)
          lineTo(21.2219f, 23.3478f)
          lineTo(22.6838f, 23.6834f)
          close()
          moveTo(22.6838f, 10.3167f)
          lineTo(21.2219f, 10.6523f)
          lineTo(21.4321f, 11.5683f)
          lineTo(22.3482f, 11.7786f)
          lineTo(22.6838f, 10.3167f)
          close()
          moveTo(9.317f, 10.3165f)
          lineTo(9.6525f, 11.7785f)
          lineTo(10.5687f, 11.5683f)
          lineTo(10.779f, 10.6522f)
          lineTo(9.317f, 10.3165f)
          close()
          moveTo(7.8551f, 24.0192f)
          curveTo(8.7072f, 27.7307f, 12.0286f, 30.5f, 16.0004f, 30.5f)
          verticalLineTo(27.5f)
          curveTo(13.4575f, 27.5f, 11.3252f, 25.7268f, 10.779f, 23.3479f)
          lineTo(7.8551f, 24.0192f)
          close()
          moveTo(16.0004f, 30.5f)
          curveTo(19.9723f, 30.5f, 23.2938f, 27.7306f, 24.1458f, 24.019f)
          lineTo(21.2219f, 23.3478f)
          curveTo(20.6758f, 25.7267f, 18.5434f, 27.5f, 16.0004f, 27.5f)
          verticalLineTo(30.5f)
          close()
          moveTo(23.0195f, 25.1453f)
          curveTo(26.731f, 24.2932f, 29.5002f, 20.9718f, 29.5002f, 17.0f)
          horizontalLineTo(26.5002f)
          curveTo(26.5002f, 19.5429f, 24.727f, 21.6752f, 22.3482f, 22.2214f)
          lineTo(23.0195f, 25.1453f)
          close()
          moveTo(29.5002f, 17.0f)
          curveTo(29.5002f, 13.0282f, 26.731f, 9.7068f, 23.0195f, 8.8547f)
          lineTo(22.3482f, 11.7786f)
          curveTo(24.727f, 12.3248f, 26.5002f, 14.4571f, 26.5002f, 17.0f)
          horizontalLineTo(29.5002f)
          close()
          moveTo(24.1458f, 9.981f)
          curveTo(23.2938f, 6.2694f, 19.9723f, 3.5f, 16.0004f, 3.5f)
          verticalLineTo(6.5f)
          curveTo(18.5434f, 6.5f, 20.6757f, 8.2733f, 21.2219f, 10.6523f)
          lineTo(24.1458f, 9.981f)
          close()
          moveTo(16.0004f, 3.5f)
          curveTo(12.0285f, 3.5f, 8.7071f, 6.2693f, 7.855f, 9.9809f)
          lineTo(10.779f, 10.6522f)
          curveTo(11.3251f, 8.2732f, 13.4575f, 6.5f, 16.0004f, 6.5f)
          verticalLineTo(3.5f)
          close()
          moveTo(8.9815f, 8.8546f)
          curveTo(5.2696f, 9.7064f, 2.5f, 13.028f, 2.5f, 17.0001f)
          horizontalLineTo(5.5f)
          curveTo(5.5f, 14.457f, 7.2734f, 12.3245f, 9.6525f, 11.7785f)
          lineTo(8.9815f, 8.8546f)
          close()
          moveTo(2.5f, 17.0001f)
          curveTo(2.5f, 20.9721f, 5.2696f, 24.2937f, 8.9815f, 25.1456f)
          lineTo(9.6525f, 22.2216f)
          curveTo(7.2734f, 21.6756f, 5.5f, 19.5431f, 5.5f, 17.0001f)
          horizontalLineTo(2.5f)
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
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.Unknown)
