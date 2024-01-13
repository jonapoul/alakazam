package dev.jonpoulton.alakazam.tak.compose.icons.radial

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
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.Back: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Back",
      defaultWidth = 33.dp,
      defaultHeight = 35.dp,
      viewportWidth = 33f,
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
          moveTo(19.6688f, 10.1705f)
          curveTo(19.403f, 10.4372f, 19.3794f, 10.8539f, 19.5978f, 11.1472f)
          lineTo(19.6705f, 11.2312f)
          lineTo(25.209f, 16.75f)
          horizontalLineTo(5.75f)
          curveTo(5.3358f, 16.75f, 5f, 17.0858f, 5f, 17.5f)
          curveTo(5f, 17.8797f, 5.2821f, 18.1935f, 5.6482f, 18.2432f)
          lineTo(5.75f, 18.25f)
          horizontalLineTo(25.209f)
          lineTo(19.6706f, 23.7687f)
          curveTo(19.4039f, 24.0345f, 19.3789f, 24.4512f, 19.5963f, 24.7451f)
          lineTo(19.6687f, 24.8294f)
          curveTo(19.9345f, 25.0961f, 20.3512f, 25.1211f, 20.6452f, 24.9037f)
          lineTo(20.7294f, 24.8313f)
          lineTo(27.5294f, 18.0551f)
          curveTo(27.6424f, 17.9425f, 27.7158f, 17.7976f, 27.7406f, 17.6421f)
          lineTo(27.75f, 17.5238f)
          verticalLineTo(17.478f)
          curveTo(27.75f, 17.3185f, 27.6992f, 17.1643f, 27.6066f, 17.037f)
          lineTo(27.5295f, 16.9468f)
          lineTo(20.7295f, 10.1688f)
          curveTo(20.4361f, 9.8764f, 19.9612f, 9.8772f, 19.6688f, 10.1705f)
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
          moveTo(-1.0501f, 0.5f)
          horizontalLineTo(32.95f)
          verticalLineTo(34.5f)
          horizontalLineTo(-1.0501f)
          verticalLineTo(0.5f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
