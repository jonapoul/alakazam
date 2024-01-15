package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RaptorXTakIcons.Screenshot: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Screenshot",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(8.7349f, 19.925f)
        horizontalLineTo(4.3999f)
        verticalLineTo(4.5f)
        horizontalLineTo(19.5725f)
        verticalLineTo(7.2545f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(18.907f, 23.7814f)
        horizontalLineTo(8.9517f)
        verticalLineTo(8.3565f)
        horizontalLineTo(24.1243f)
        verticalLineTo(19.5536f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(8.9517f, 16.84f)
        lineTo(12.3482f, 12.4009f)
        lineTo(16.8238f, 16.9856f)
        lineTo(18.5511f, 18.7556f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(23.9393f, 17.8572f)
        lineTo(20.5266f, 14.7183f)
        lineTo(17.2793f, 16.9453f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.7651f, 10.9846f)
        curveTo(19.7651f, 11.9103f, 19.0876f, 12.66f, 18.251f, 12.66f)
        curveTo(17.4145f, 12.66f, 16.7363f, 11.9103f, 16.7363f, 10.9846f)
        curveTo(16.7363f, 10.0588f, 17.4145f, 9.3091f, 18.251f, 9.3091f)
        curveTo(19.0876f, 9.3091f, 19.7651f, 10.0588f, 19.7651f, 10.9846f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(23.2608f, 21.3228f)
        verticalLineTo(26.5002f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(25.6005f, 23.9119f)
        horizontalLineTo(20.9211f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.Screenshot)
