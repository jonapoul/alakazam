package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val MarkersTakIcons.Dip: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Dip",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Alert),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.4138f, 16.9138f)
        moveToRelative(-11.25f, 0.0f)
        arcToRelative(11.25f, 11.25f, 0.0f, true, true, 22.5f, 0.0f)
        arcToRelative(11.25f, 11.25f, 0.0f, true, true, -22.5f, 0.0f)
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(7.2176f, 9.2219f)
        lineToRelative(1.4142f, -1.4142f)
        lineToRelative(16.9706f, 16.9706f)
        lineToRelative(-1.4142f, 1.4142f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.1246f, 7.7439f)
        lineToRelative(1.4142f, 1.4142f)
        lineToRelative(-16.9706f, 16.9706f)
        lineToRelative(-1.4142f, -1.4142f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.Dip)
