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

public val RadialTakIcons.Delete: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Delete",
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
          moveTo(23.3693f, 6.5f)
          curveTo(23.7835f, 6.5f, 24.1193f, 6.8358f, 24.1193f, 7.25f)
          lineTo(24.1191f, 9.666f)
          lineTo(26.0419f, 9.6667f)
          curveTo(26.4216f, 9.6667f, 26.7354f, 9.9488f, 26.7851f, 10.3149f)
          lineTo(26.7919f, 10.4167f)
          verticalLineTo(12.7274f)
          curveTo(26.7919f, 13.1416f, 26.4561f, 13.4774f, 26.0419f, 13.4774f)
          lineTo(24.4571f, 13.477f)
          lineTo(23.9819f, 28.4328f)
          curveTo(23.9701f, 28.8038f, 23.6903f, 29.1048f, 23.3319f, 29.1524f)
          lineTo(23.2323f, 29.159f)
          horizontalLineTo(11.56f)
          curveTo(11.155f, 29.159f, 10.8232f, 28.8375f, 10.8103f, 28.4328f)
          lineTo(10.3341f, 13.477f)
          lineTo(8.7501f, 13.4774f)
          curveTo(8.3704f, 13.4774f, 8.0566f, 13.1953f, 8.007f, 12.8292f)
          lineTo(8.0001f, 12.7274f)
          verticalLineTo(10.4167f)
          curveTo(8.0001f, 10.0025f, 8.3359f, 9.6667f, 8.7501f, 9.6667f)
          lineTo(10.3901f, 9.666f)
          lineTo(10.3905f, 7.25f)
          curveTo(10.3905f, 6.8703f, 10.6727f, 6.5565f, 11.0387f, 6.5068f)
          lineTo(11.1405f, 6.5f)
          horizontalLineTo(23.3693f)
          close()
          moveTo(22.9551f, 13.477f)
          horizontalLineTo(11.8351f)
          lineTo(12.2866f, 27.6589f)
          horizontalLineTo(22.5056f)
          lineTo(22.9551f, 13.477f)
          close()
          moveTo(14.8244f, 15.8149f)
          curveTo(15.2041f, 15.8149f, 15.5179f, 16.097f, 15.5676f, 16.4631f)
          lineTo(15.5744f, 16.5649f)
          verticalLineTo(24.8118f)
          curveTo(15.5744f, 25.226f, 15.2386f, 25.5618f, 14.8244f, 25.5618f)
          curveTo(14.4447f, 25.5618f, 14.1309f, 25.2796f, 14.0813f, 24.9136f)
          lineTo(14.0744f, 24.8118f)
          verticalLineTo(16.5649f)
          curveTo(14.0744f, 16.1507f, 14.4102f, 15.8149f, 14.8244f, 15.8149f)
          close()
          moveTo(19.3668f, 15.8149f)
          curveTo(19.7465f, 15.8149f, 20.0603f, 16.097f, 20.1099f, 16.4631f)
          lineTo(20.1168f, 16.5649f)
          verticalLineTo(24.8118f)
          curveTo(20.1168f, 25.226f, 19.781f, 25.5618f, 19.3668f, 25.5618f)
          curveTo(18.9871f, 25.5618f, 18.6733f, 25.2796f, 18.6236f, 24.9136f)
          lineTo(18.6168f, 24.8118f)
          verticalLineTo(16.5649f)
          curveTo(18.6168f, 16.1507f, 18.9526f, 15.8149f, 19.3668f, 15.8149f)
          close()
          moveTo(25.2915f, 11.1659f)
          horizontalLineTo(9.4995f)
          verticalLineTo(11.9769f)
          horizontalLineTo(25.2915f)
          verticalLineTo(11.1659f)
          close()
          moveTo(22.6186f, 7.9999f)
          horizontalLineTo(11.8896f)
          verticalLineTo(9.5219f)
          horizontalLineTo(22.6186f)
          verticalLineTo(7.9999f)
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
          moveTo(34.0715f, 0.6669f)
          horizontalLineTo(0.0715f)
          verticalLineTo(34.6669f)
          horizontalLineTo(34.0715f)
          verticalLineTo(0.6669f)
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
private fun Preview() = PreviewIcon(icon = RadialTakIcons.Delete)
