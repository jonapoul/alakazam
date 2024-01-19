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

public val RaptorXTakIcons.Audio: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Audio",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(8.0f, 21.25f)
        lineTo(8.0f, 21.25f)
        arcTo(3.25f, 3.25f, 0.0f, false, true, 11.25f, 24.5f)
        lineTo(11.25f, 24.5f)
        arcTo(3.25f, 3.25f, 0.0f, false, true, 8.0f, 27.75f)
        lineTo(8.0f, 27.75f)
        arcTo(3.25f, 3.25f, 0.0f, false, true, 4.75f, 24.5f)
        lineTo(4.75f, 24.5f)
        arcTo(3.25f, 3.25f, 0.0f, false, true, 8.0f, 21.25f)
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
        moveTo(10.45f, 9.0f)
        horizontalLineTo(11.95f)
        verticalLineTo(24.0f)
        horizontalLineTo(11.45f)
        lineTo(10.45f, 23.2277f)
        verticalLineTo(9.0f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(22.0f, 16.75f)
        lineTo(22.0f, 16.75f)
        arcTo(3.25f, 3.25f, 0.0f, false, true, 25.25f, 20.0f)
        lineTo(25.25f, 20.0f)
        arcTo(3.25f, 3.25f, 0.0f, false, true, 22.0f, 23.25f)
        lineTo(22.0f, 23.25f)
        arcTo(3.25f, 3.25f, 0.0f, false, true, 18.75f, 20.0f)
        lineTo(18.75f, 20.0f)
        arcTo(3.25f, 3.25f, 0.0f, false, true, 22.0f, 16.75f)
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
        moveTo(24.45f, 6.5f)
        horizontalLineTo(25.95f)
        verticalLineTo(19.5f)
        horizontalLineTo(25.45f)
        lineTo(24.45f, 18.7277f)
        verticalLineTo(6.5f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(11.2f, 9.5319f)
        verticalLineTo(7.081f)
        lineTo(25.2f, 3.4681f)
        verticalLineTo(5.919f)
        lineTo(11.2f, 9.5319f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.Audio)
