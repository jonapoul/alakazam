package dev.jonpoulton.alakazam.tak.compose.icons.dropdown

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.DropdownTakIcons

public val DropdownTakIcons.Square: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Square",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
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
        moveTo(24.5134f, 20.3428f)
        curveTo(24.8931f, 20.3428f, 25.2069f, 20.6249f, 25.2566f, 20.991f)
        lineTo(25.2634f, 21.0928f)
        verticalLineTo(27.1646f)
        curveTo(25.2634f, 27.5788f, 24.9276f, 27.9146f, 24.5134f, 27.9146f)
        curveTo(24.1337f, 27.9146f, 23.8199f, 27.6324f, 23.7703f, 27.2664f)
        lineTo(23.7634f, 27.1646f)
        verticalLineTo(21.0928f)
        curveTo(23.7634f, 20.6786f, 24.0992f, 20.3428f, 24.5134f, 20.3428f)
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
        moveTo(27.5484f, 23.3787f)
        curveTo(27.9626f, 23.3787f, 28.2984f, 23.7144f, 28.2984f, 24.1287f)
        curveTo(28.2984f, 24.5084f, 28.0163f, 24.8222f, 27.6502f, 24.8718f)
        lineTo(27.5484f, 24.8787f)
        horizontalLineTo(21.4774f)
        curveTo(21.0632f, 24.8787f, 20.7274f, 24.5429f, 20.7274f, 24.1287f)
        curveTo(20.7274f, 23.749f, 21.0096f, 23.4352f, 21.3756f, 23.3855f)
        lineTo(21.4774f, 23.3787f)
        horizontalLineTo(27.5484f)
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
        moveTo(28.0f, 1.75f)
        curveTo(28.3797f, 1.75f, 28.6935f, 2.0322f, 28.7432f, 2.3982f)
        lineTo(28.75f, 2.5f)
        verticalLineTo(18.9807f)
        curveTo(28.75f, 19.3949f, 28.4142f, 19.7307f, 28.0f, 19.7307f)
        curveTo(27.6203f, 19.7307f, 27.3065f, 19.4486f, 27.2568f, 19.0825f)
        lineTo(27.25f, 18.9807f)
        verticalLineTo(3.25f)
        horizontalLineTo(2.75f)
        verticalLineTo(27.75f)
        horizontalLineTo(18.8703f)
        curveTo(19.25f, 27.75f, 19.5638f, 28.0322f, 19.6134f, 28.3982f)
        lineTo(19.6203f, 28.5f)
        curveTo(19.6203f, 28.8797f, 19.3381f, 29.1935f, 18.9721f, 29.2432f)
        lineTo(18.8703f, 29.25f)
        horizontalLineTo(2.0f)
        curveTo(1.6203f, 29.25f, 1.3065f, 28.9678f, 1.2569f, 28.6018f)
        lineTo(1.25f, 28.5f)
        verticalLineTo(2.5f)
        curveTo(1.25f, 2.1203f, 1.5322f, 1.8065f, 1.8982f, 1.7569f)
        lineTo(2.0f, 1.75f)
        horizontalLineTo(28.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
