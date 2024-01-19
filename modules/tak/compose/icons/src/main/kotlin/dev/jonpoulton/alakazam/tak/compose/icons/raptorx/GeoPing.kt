package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.GeoPing: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "GeoPing",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = SolidColor(Color.White),
        fillAlpha = 0.2f,
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin =
        Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(15.0f, 15.5f)
        moveToRelative(-10.25f, 0.0f)
        arcToRelative(10.25f, 10.25f, 0.0f, true, true, 20.5f, 0.0f)
        arcToRelative(10.25f, 10.25f, 0.0f, true, true, -20.5f, 0.0f)
      }
      path(
        fill = SolidColor(Color.White),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(15.0f, 15.5f)
        moveToRelative(-2.25f, 0.0f)
        arcToRelative(2.25f, 2.25f, 0.0f, true, true, 4.5f, 0.0f)
        arcToRelative(2.25f, 2.25f, 0.0f, true, true, -4.5f, 0.0f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.GeoPing)
