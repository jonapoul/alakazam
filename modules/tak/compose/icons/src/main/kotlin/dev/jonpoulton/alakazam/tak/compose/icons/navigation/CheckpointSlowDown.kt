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

public val NavigationTakIcons.CheckpointSlowDown: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "CheckpointSlowDown",
      defaultWidth = 29.0.dp,
      defaultHeight = 29.0.dp,
      viewportWidth = 29.0f,
      viewportHeight = 29.0f,
    ).apply {
      group {
        path(
          fill = SolidColor(Color(0xFF007DBF)),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = EvenOdd,
        ) {
          moveTo(9.1154f, 19.0f)
          lineTo(7.5f, 20.5f)
          lineTo(14.5f, 27.0f)
          lineTo(21.5f, 20.5f)
          lineTo(19.8846f, 19.0f)
          lineTo(14.5f, 24.0f)
          lineTo(9.1154f, 19.0f)
          close()
        }
        path(
          fill = SolidColor(Color(0xFF007DBF)),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = EvenOdd,
        ) {
          moveTo(9.1154f, 10.6459f)
          lineTo(7.5f, 12.3334f)
          lineTo(14.5f, 19.6459f)
          lineTo(21.5f, 12.3334f)
          lineTo(19.8846f, 10.6459f)
          lineTo(14.5f, 16.2709f)
          lineTo(9.1154f, 10.6459f)
          close()
        }
        path(
          fill = SolidColor(Color(0xFF007DBF)),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = EvenOdd,
        ) {
          moveTo(9.1154f, 3.2916f)
          lineTo(7.5f, 4.7916f)
          lineTo(14.5f, 11.2916f)
          lineTo(21.5f, 4.7916f)
          lineTo(19.8846f, 3.2916f)
          lineTo(14.5f, 8.2916f)
          lineTo(9.1154f, 3.2916f)
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
private fun Preview() = PreviewIcon(icon = NavigationTakIcons.CheckpointSlowDown)
