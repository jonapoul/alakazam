package dev.jonpoulton.alakazam.tak.compose.icons.radial

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RadialTakIcons.Tasking: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Tasking",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      group {
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(19.8997f, 8.35f)
          curveTo(20.3139f, 8.35f, 20.6497f, 8.6858f, 20.6497f, 9.1f)
          curveTo(20.6497f, 9.4797f, 20.3675f, 9.7935f, 20.0014f, 9.8432f)
          lineTo(19.8997f, 9.85f)
          horizontalLineTo(6.5f)
          verticalLineTo(25.35f)
          horizontalLineTo(22f)
          verticalLineTo(16.8594f)
          curveTo(22f, 16.4797f, 22.2822f, 16.1659f, 22.6482f, 16.1162f)
          lineTo(22.75f, 16.1094f)
          curveTo(23.1297f, 16.1094f, 23.4435f, 16.3916f, 23.4932f, 16.7576f)
          lineTo(23.5f, 16.8594f)
          verticalLineTo(26.1f)
          curveTo(23.5f, 26.4797f, 23.2178f, 26.7935f, 22.8518f, 26.8432f)
          lineTo(22.75f, 26.85f)
          horizontalLineTo(5.75f)
          curveTo(5.3703f, 26.85f, 5.0565f, 26.5678f, 5.0068f, 26.2018f)
          lineTo(5f, 26.1f)
          verticalLineTo(9.1f)
          curveTo(5f, 8.7203f, 5.2821f, 8.4065f, 5.6482f, 8.3568f)
          lineTo(5.75f, 8.35f)
          horizontalLineTo(19.8997f)
          close()
          moveTo(28.377f, 7.7163f)
          curveTo(28.6449f, 7.9809f, 28.6718f, 8.3974f, 28.4558f, 8.6924f)
          lineTo(28.3837f, 8.777f)
          lineTo(14.9546f, 22.377f)
          curveTo(14.6877f, 22.6473f, 14.2667f, 22.6719f, 13.9717f, 22.4507f)
          lineTo(13.8873f, 22.377f)
          lineTo(8.6164f, 17.04f)
          curveTo(8.3253f, 16.7453f, 8.3283f, 16.2704f, 8.623f, 15.9794f)
          curveTo(8.8909f, 15.7147f, 9.3077f, 15.6931f, 9.6f, 15.9128f)
          lineTo(9.6836f, 15.986f)
          lineTo(14.421f, 20.782f)
          lineTo(27.3163f, 7.723f)
          curveTo(27.6074f, 7.4283f, 28.0822f, 7.4253f, 28.377f, 7.7163f)
          close()
        }
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(33.8f, -0.25f)
          horizontalLineTo(-0.2f)
          verticalLineTo(33.75f)
          horizontalLineTo(33.8f)
          verticalLineTo(-0.25f)
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
private fun Preview() = PreviewIcon(icon = RadialTakIcons.Tasking)
