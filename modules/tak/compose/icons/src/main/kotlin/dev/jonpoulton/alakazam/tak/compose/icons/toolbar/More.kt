package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

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
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.More: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "More",
      defaultWidth = 44.0.dp,
      defaultHeight = 45.0.dp,
      viewportWidth = 44.0f,
      viewportHeight = 45.0f,
    ).apply {
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
          moveTo(13.5f, 18.25f)
          curveTo(11.7051f, 18.25f, 10.25f, 19.7051f, 10.25f, 21.5f)
          curveTo(10.25f, 23.2949f, 11.7051f, 24.75f, 13.5f, 24.75f)
          curveTo(15.2949f, 24.75f, 16.75f, 23.2949f, 16.75f, 21.5f)
          curveTo(16.75f, 19.7051f, 15.2949f, 18.25f, 13.5f, 18.25f)
          close()
          moveTo(13.5f, 19.75f)
          curveTo(14.4665f, 19.75f, 15.25f, 20.5335f, 15.25f, 21.5f)
          curveTo(15.25f, 22.4665f, 14.4665f, 23.25f, 13.5f, 23.25f)
          curveTo(12.5335f, 23.25f, 11.75f, 22.4665f, 11.75f, 21.5f)
          curveTo(11.75f, 20.5335f, 12.5335f, 19.75f, 13.5f, 19.75f)
          close()
          moveTo(22.0f, 18.25f)
          curveTo(20.2051f, 18.25f, 18.75f, 19.7051f, 18.75f, 21.5f)
          curveTo(18.75f, 23.2949f, 20.2051f, 24.75f, 22.0f, 24.75f)
          curveTo(23.7949f, 24.75f, 25.25f, 23.2949f, 25.25f, 21.5f)
          curveTo(25.25f, 19.7051f, 23.7949f, 18.25f, 22.0f, 18.25f)
          close()
          moveTo(22.0f, 19.75f)
          curveTo(22.9665f, 19.75f, 23.75f, 20.5335f, 23.75f, 21.5f)
          curveTo(23.75f, 22.4665f, 22.9665f, 23.25f, 22.0f, 23.25f)
          curveTo(21.0335f, 23.25f, 20.25f, 22.4665f, 20.25f, 21.5f)
          curveTo(20.25f, 20.5335f, 21.0335f, 19.75f, 22.0f, 19.75f)
          close()
          moveTo(30.5f, 18.25f)
          curveTo(28.7051f, 18.25f, 27.25f, 19.7051f, 27.25f, 21.5f)
          curveTo(27.25f, 23.2949f, 28.7051f, 24.75f, 30.5f, 24.75f)
          curveTo(32.2949f, 24.75f, 33.75f, 23.2949f, 33.75f, 21.5f)
          curveTo(33.75f, 19.7051f, 32.2949f, 18.25f, 30.5f, 18.25f)
          close()
          moveTo(30.5f, 19.75f)
          curveTo(31.4665f, 19.75f, 32.25f, 20.5335f, 32.25f, 21.5f)
          curveTo(32.25f, 22.4665f, 31.4665f, 23.25f, 30.5f, 23.25f)
          curveTo(29.5335f, 23.25f, 28.75f, 22.4665f, 28.75f, 21.5f)
          curveTo(28.75f, 20.5335f, 29.5335f, 19.75f, 30.5f, 19.75f)
          close()
          moveTo(22.0f, 4.75f)
          curveTo(12.7492f, 4.75f, 5.25f, 12.2492f, 5.25f, 21.5f)
          curveTo(5.25f, 30.7508f, 12.7492f, 38.25f, 22.0f, 38.25f)
          curveTo(31.2508f, 38.25f, 38.75f, 30.7508f, 38.75f, 21.5f)
          curveTo(38.75f, 12.2492f, 31.2508f, 4.75f, 22.0f, 4.75f)
          close()
          moveTo(22.0f, 6.25f)
          curveTo(30.4223f, 6.25f, 37.25f, 13.0777f, 37.25f, 21.5f)
          curveTo(37.25f, 29.9223f, 30.4223f, 36.75f, 22.0f, 36.75f)
          curveTo(13.5777f, 36.75f, 6.75f, 29.9223f, 6.75f, 21.5f)
          curveTo(6.75f, 13.0777f, 13.5777f, 6.25f, 22.0f, 6.25f)
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
          moveTo(13.5f, 18.25f)
          curveTo(11.7051f, 18.25f, 10.25f, 19.7051f, 10.25f, 21.5f)
          curveTo(10.25f, 23.2949f, 11.7051f, 24.75f, 13.5f, 24.75f)
          curveTo(15.2949f, 24.75f, 16.75f, 23.2949f, 16.75f, 21.5f)
          curveTo(16.75f, 19.7051f, 15.2949f, 18.25f, 13.5f, 18.25f)
          close()
          moveTo(13.5f, 19.75f)
          curveTo(14.4665f, 19.75f, 15.25f, 20.5335f, 15.25f, 21.5f)
          curveTo(15.25f, 22.4665f, 14.4665f, 23.25f, 13.5f, 23.25f)
          curveTo(12.5335f, 23.25f, 11.75f, 22.4665f, 11.75f, 21.5f)
          curveTo(11.75f, 20.5335f, 12.5335f, 19.75f, 13.5f, 19.75f)
          close()
          moveTo(22.0f, 18.25f)
          curveTo(20.2051f, 18.25f, 18.75f, 19.7051f, 18.75f, 21.5f)
          curveTo(18.75f, 23.2949f, 20.2051f, 24.75f, 22.0f, 24.75f)
          curveTo(23.7949f, 24.75f, 25.25f, 23.2949f, 25.25f, 21.5f)
          curveTo(25.25f, 19.7051f, 23.7949f, 18.25f, 22.0f, 18.25f)
          close()
          moveTo(22.0f, 19.75f)
          curveTo(22.9665f, 19.75f, 23.75f, 20.5335f, 23.75f, 21.5f)
          curveTo(23.75f, 22.4665f, 22.9665f, 23.25f, 22.0f, 23.25f)
          curveTo(21.0335f, 23.25f, 20.25f, 22.4665f, 20.25f, 21.5f)
          curveTo(20.25f, 20.5335f, 21.0335f, 19.75f, 22.0f, 19.75f)
          close()
          moveTo(30.5f, 18.25f)
          curveTo(28.7051f, 18.25f, 27.25f, 19.7051f, 27.25f, 21.5f)
          curveTo(27.25f, 23.2949f, 28.7051f, 24.75f, 30.5f, 24.75f)
          curveTo(32.2949f, 24.75f, 33.75f, 23.2949f, 33.75f, 21.5f)
          curveTo(33.75f, 19.7051f, 32.2949f, 18.25f, 30.5f, 18.25f)
          close()
          moveTo(30.5f, 19.75f)
          curveTo(31.4665f, 19.75f, 32.25f, 20.5335f, 32.25f, 21.5f)
          curveTo(32.25f, 22.4665f, 31.4665f, 23.25f, 30.5f, 23.25f)
          curveTo(29.5335f, 23.25f, 28.75f, 22.4665f, 28.75f, 21.5f)
          curveTo(28.75f, 20.5335f, 29.5335f, 19.75f, 30.5f, 19.75f)
          close()
          moveTo(22.0f, 4.75f)
          curveTo(12.7492f, 4.75f, 5.25f, 12.2492f, 5.25f, 21.5f)
          curveTo(5.25f, 30.7508f, 12.7492f, 38.25f, 22.0f, 38.25f)
          curveTo(31.2508f, 38.25f, 38.75f, 30.7508f, 38.75f, 21.5f)
          curveTo(38.75f, 12.2492f, 31.2508f, 4.75f, 22.0f, 4.75f)
          close()
          moveTo(22.0f, 6.25f)
          curveTo(30.4223f, 6.25f, 37.25f, 13.0777f, 37.25f, 21.5f)
          curveTo(37.25f, 29.9223f, 30.4223f, 36.75f, 22.0f, 36.75f)
          curveTo(13.5777f, 36.75f, 6.75f, 29.9223f, 6.75f, 21.5f)
          curveTo(6.75f, 13.0777f, 13.5777f, 6.25f, 22.0f, 6.25f)
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
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.More)
