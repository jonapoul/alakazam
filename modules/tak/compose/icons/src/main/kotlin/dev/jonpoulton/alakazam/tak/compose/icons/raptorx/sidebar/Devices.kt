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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXSidebarTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RaptorXSidebarTakIcons.Devices: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Devices",
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
          moveTo(5.0f, 2.0f)
          curveTo(5.0f, 0.8954f, 5.8954f, 0.0f, 7.0f, 0.0f)
          horizontalLineTo(23.0f)
          curveTo(24.1046f, 0.0f, 25.0f, 0.8954f, 25.0f, 2.0f)
          verticalLineTo(28.0f)
          curveTo(25.0f, 29.1046f, 24.1046f, 30.0f, 23.0f, 30.0f)
          horizontalLineTo(7.0f)
          curveTo(5.8954f, 30.0f, 5.0f, 29.1046f, 5.0f, 28.0f)
          verticalLineTo(2.0f)
          close()
          moveTo(7.4999f, 3.4997f)
          curveTo(7.4999f, 2.9474f, 7.9476f, 2.4997f, 8.4999f, 2.4997f)
          horizontalLineTo(21.4999f)
          curveTo(22.0522f, 2.4997f, 22.4999f, 2.9474f, 22.4999f, 3.4997f)
          verticalLineTo(23.9997f)
          curveTo(22.4999f, 24.552f, 22.0522f, 24.9997f, 21.4999f, 24.9997f)
          horizontalLineTo(8.4999f)
          curveTo(7.9476f, 24.9997f, 7.4999f, 24.552f, 7.4999f, 23.9997f)
          verticalLineTo(3.4997f)
          close()
          moveTo(15.0001f, 26.25f)
          curveTo(14.3097f, 26.25f, 13.7501f, 26.8096f, 13.7501f, 27.5f)
          curveTo(13.7501f, 28.1904f, 14.3097f, 28.75f, 15.0001f, 28.75f)
          curveTo(15.6904f, 28.75f, 16.2501f, 28.1904f, 16.2501f, 27.5f)
          curveTo(16.2501f, 26.8096f, 15.6904f, 26.25f, 15.0001f, 26.25f)
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
private fun Preview() = PreviewIcon(icon = RaptorXSidebarTakIcons.Devices)
