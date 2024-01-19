package dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXSidebarTakIcons

public val RaptorXSidebarTakIcons.PointDropper: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "PointDropper",
      defaultWidth = 30.0.dp,
      defaultHeight = 30.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 30.0f,
    ).apply {
      group {
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(21.3618f, 18.75f)
          curveTo(21.7178f, 18.75f, 22.012f, 19.0145f, 22.0585f, 19.3577f)
          lineTo(22.0649f, 19.4531f)
          verticalLineTo(25.1455f)
          curveTo(22.0649f, 25.5338f, 21.7501f, 25.8486f, 21.3618f, 25.8486f)
          curveTo(21.0059f, 25.8486f, 20.7117f, 25.5841f, 20.6651f, 25.2409f)
          lineTo(20.6587f, 25.1455f)
          verticalLineTo(19.4531f)
          curveTo(20.6587f, 19.0648f, 20.9735f, 18.75f, 21.3618f, 18.75f)
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
          moveTo(24.2072f, 21.5957f)
          curveTo(24.5955f, 21.5957f, 24.9103f, 21.9105f, 24.9103f, 22.2988f)
          curveTo(24.9103f, 22.6548f, 24.6458f, 22.949f, 24.3026f, 22.9955f)
          lineTo(24.2072f, 23.002f)
          horizontalLineTo(18.5156f)
          curveTo(18.1273f, 23.002f, 17.8125f, 22.6872f, 17.8125f, 22.2988f)
          curveTo(17.8125f, 21.9429f, 18.077f, 21.6487f, 18.4202f, 21.6021f)
          lineTo(18.5156f, 21.5957f)
          horizontalLineTo(24.2072f)
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
          moveTo(14.9962f, 30.0f)
          curveTo(14.9962f, 30.0f, 17.2427f, 27.4558f, 19.721f, 24.0927f)
          verticalLineTo(23.9397f)
          horizontalLineTo(18.5155f)
          curveTo(17.6094f, 23.9397f, 16.8749f, 23.2051f, 16.8749f, 22.299f)
          curveTo(16.8749f, 21.4677f, 17.4924f, 20.7821f, 18.2941f, 20.6733f)
          lineTo(18.3255f, 20.6691f)
          lineTo(18.484f, 20.6584f)
          horizontalLineTo(19.721f)
          verticalLineTo(19.4531f)
          curveTo(19.721f, 18.547f, 20.4556f, 17.8125f, 21.3616f, 17.8125f)
          curveTo(22.193f, 17.8125f, 22.8786f, 18.43f, 22.9873f, 19.2317f)
          lineTo(22.9916f, 19.2631f)
          lineTo(22.9918f, 19.2653f)
          curveTo(24.7855f, 16.3217f, 26.1694f, 13.3469f, 26.1694f, 11.1751f)
          curveTo(26.1694f, 5.0023f, 21.1672f, 0.0f, 14.9962f, 0.0f)
          curveTo(8.8272f, 0.0f, 3.8249f, 5.0023f, 3.8249f, 11.1751f)
          curveTo(3.8249f, 17.3461f, 14.9962f, 30.0f, 14.9962f, 30.0f)
          close()
          moveTo(19.721f, 21.5959f)
          horizontalLineTo(18.5155f)
          lineTo(18.4201f, 21.6023f)
          curveTo(18.0769f, 21.6489f, 17.8124f, 21.9431f, 17.8124f, 22.299f)
          curveTo(17.8124f, 22.6874f, 18.1272f, 23.0022f, 18.5155f, 23.0022f)
          horizontalLineTo(19.721f)
          verticalLineTo(21.5959f)
          close()
          moveTo(14.9973f, 14.4251f)
          curveTo(16.6427f, 14.4251f, 17.9762f, 13.0917f, 17.9762f, 11.4463f)
          curveTo(17.9762f, 9.7989f, 16.6427f, 8.4674f, 14.9973f, 8.4674f)
          curveTo(13.3499f, 8.4674f, 12.0184f, 9.7989f, 12.0184f, 11.4463f)
          curveTo(12.0184f, 13.0917f, 13.3499f, 14.4251f, 14.9973f, 14.4251f)
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
private fun Preview() = PreviewIcon(icon = RaptorXSidebarTakIcons.PointDropper)
