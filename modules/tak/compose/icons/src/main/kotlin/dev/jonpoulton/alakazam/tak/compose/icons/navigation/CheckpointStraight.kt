package dev.jonpoulton.alakazam.tak.compose.icons.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.NavigationTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val NavigationTakIcons.CheckpointStraight: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "CheckpointStraight",
      defaultWidth = 29.0.dp,
      defaultHeight = 29.0.dp,
      viewportWidth = 29.0f,
      viewportHeight = 29.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(20.7291f, 26.7709f)
        lineToRelative(-0.0f, -14.5f)
        lineToRelative(-12.0833f, -0.0f)
        lineToRelative(-0.0f, 14.5f)
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
        moveTo(14.6875f, 2.0f)
        lineTo(3.2083f, 12.875f)
        lineTo(26.1666f, 12.875f)
        lineTo(14.6875f, 2.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = NavigationTakIcons.CheckpointStraight)
