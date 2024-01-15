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
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val MarkersTakIcons.Lollipop: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Lollipop",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0f, 17.25f)
        lineTo(16.0f, 17.25f)
        arcTo(2.25f, 2.25f, 0.0f, false, true, 18.25f, 19.5f)
        lineTo(18.25f, 26.5f)
        arcTo(2.25f, 2.25f, 0.0f, false, true, 16.0f, 28.75f)
        lineTo(16.0f, 28.75f)
        arcTo(2.25f, 2.25f, 0.0f, false, true, 13.75f, 26.5f)
        lineTo(13.75f, 19.5f)
        arcTo(2.25f, 2.25f, 0.0f, false, true, 16.0f, 17.25f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0f, 12.0f)
        moveToRelative(-7.25f, 0.0f)
        arcToRelative(7.25f, 7.25f, 0.0f, true, true, 14.5f, 0.0f)
        arcToRelative(7.25f, 7.25f, 0.0f, true, true, -14.5f, 0.0f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.Lollipop)
