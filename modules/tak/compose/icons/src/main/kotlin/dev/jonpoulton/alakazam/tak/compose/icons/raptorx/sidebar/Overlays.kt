package dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val RaptorXSidebarTakIcons.Overlays: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Overlays",
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
          pathFillType = EvenOdd,
        ) {
          moveTo(14.6035f, 0.1101f)
          lineTo(1.1467f, 8.1615f)
          curveTo(0.643f, 8.4628f, 0.643f, 9.1925f, 1.1467f, 9.4939f)
          lineTo(14.6035f, 17.5452f)
          curveTo(14.8489f, 17.6921f, 15.1552f, 17.6921f, 15.4007f, 17.5452f)
          lineTo(28.8575f, 9.4939f)
          curveTo(29.3612f, 9.1925f, 29.3612f, 8.4628f, 28.8575f, 8.1615f)
          lineTo(15.4007f, 0.1101f)
          curveTo(15.1552f, -0.0367f, 14.8489f, -0.0367f, 14.6035f, 0.1101f)
          close()
          moveTo(28.0603f, 14.6022f)
          curveTo(28.4282f, 14.3821f, 28.905f, 14.5019f, 29.1251f, 14.8698f)
          curveTo(29.3269f, 15.2071f, 29.2431f, 15.6358f, 28.9443f, 15.8745f)
          lineTo(28.8575f, 15.9346f)
          lineTo(15.4007f, 23.986f)
          curveTo(15.1903f, 24.1118f, 14.9352f, 24.1298f, 14.712f, 24.0399f)
          lineTo(14.6035f, 23.986f)
          lineTo(1.1467f, 15.9346f)
          curveTo(0.7787f, 15.7145f, 0.6589f, 15.2378f, 0.8791f, 14.8698f)
          curveTo(1.0809f, 14.5325f, 1.4983f, 14.4038f, 1.8498f, 14.5542f)
          lineTo(1.9439f, 14.6022f)
          lineTo(15.0021f, 22.414f)
          lineTo(28.0603f, 14.6022f)
          close()
          moveTo(29.1251f, 20.7739f)
          curveTo(28.905f, 20.4059f, 28.4282f, 20.2861f, 28.0603f, 20.5062f)
          lineTo(15.0021f, 28.3184f)
          lineTo(1.9439f, 20.5062f)
          lineTo(1.8498f, 20.4582f)
          curveTo(1.4983f, 20.3078f, 1.0809f, 20.4366f, 0.8791f, 20.7739f)
          curveTo(0.6589f, 21.1418f, 0.7787f, 21.6185f, 1.1467f, 21.8387f)
          lineTo(14.6035f, 29.89f)
          lineTo(14.712f, 29.9439f)
          curveTo(14.9352f, 30.0338f, 15.1903f, 30.0159f, 15.4007f, 29.89f)
          lineTo(28.8575f, 21.8387f)
          lineTo(28.9443f, 21.7785f)
          curveTo(29.2431f, 21.5398f, 29.3269f, 21.1111f, 29.1251f, 20.7739f)
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
private fun Preview() = PreviewIcon(icon = RaptorXSidebarTakIcons.Overlays)
