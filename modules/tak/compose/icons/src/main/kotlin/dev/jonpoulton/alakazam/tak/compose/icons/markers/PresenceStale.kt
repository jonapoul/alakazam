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
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val MarkersTakIcons.PresenceStale: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "PresenceStale",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFFFFF500)),
        stroke = SolidColor(Color(0xFFB7B325)),
        strokeLineWidth = 3.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(15.5862f, 16.5862f)
        moveToRelative(-10.0862f, 0.0f)
        arcToRelative(10.0862f, 10.0862f, 0.0f, true, true, 20.1724f, 0.0f)
        arcToRelative(10.0862f, 10.0862f, 0.0f, true, true, -20.1724f, 0.0f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.PresenceStale)
