package dev.jonpoulton.alakazam.tak.compose.icons.navigation

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
import dev.jonpoulton.alakazam.tak.compose.icons.NavigationTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val NavigationTakIcons.CheckpointSpeedUp: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "CheckpointSpeedUp",
      defaultWidth = 29.0.dp,
      defaultHeight = 29.0.dp,
      viewportWidth = 29.0f,
      viewportHeight = 29.0f,
    ).apply {
      group {
        path(
          fill = SolidColor(Color(0xFF00BF32)),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = EvenOdd,
        ) {
          moveTo(9.1154f, 11.0f)
          lineTo(7.5f, 9.5f)
          lineTo(14.5f, 3.0f)
          lineTo(21.5f, 9.5f)
          lineTo(19.8846f, 11.0f)
          lineTo(14.5f, 6.0f)
          lineTo(9.1154f, 11.0f)
          close()
        }
        path(
          fill = SolidColor(Color(0xFF00BF32)),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = EvenOdd,
        ) {
          moveTo(9.1154f, 19.3541f)
          lineTo(7.5f, 17.6666f)
          lineTo(14.5f, 10.3541f)
          lineTo(21.5f, 17.6666f)
          lineTo(19.8846f, 19.3541f)
          lineTo(14.5f, 13.7291f)
          lineTo(9.1154f, 19.3541f)
          close()
        }
        path(
          fill = SolidColor(Color(0xFF00BF32)),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = EvenOdd,
        ) {
          moveTo(9.1154f, 26.7084f)
          lineTo(7.5f, 25.2084f)
          lineTo(14.5f, 18.7084f)
          lineTo(21.5f, 25.2084f)
          lineTo(19.8846f, 26.7084f)
          lineTo(14.5f, 21.7084f)
          lineTo(9.1154f, 26.7084f)
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
private fun Preview() = PreviewIcon(icon = NavigationTakIcons.CheckpointSpeedUp)
