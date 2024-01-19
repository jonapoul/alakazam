package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.LrfSlide: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "LrfSlide",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(2f, 32.4577f)
        lineTo(10.051f, 24.4077f)
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(14.5439f, 19.9138f)
        lineTo(10.7989f, 28.8328f)
        lineTo(9.7149f, 24.7438f)
        lineTo(5.6249f, 23.6588f)
        lineTo(14.5439f, 19.9138f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(25.1016f, 13.7732f)
        curveTo(25.1016f, 16.6232f, 22.7906f, 18.9322f, 19.9416f, 18.9322f)
        curveTo(17.0926f, 18.9322f, 14.7826f, 16.6232f, 14.7826f, 13.7732f)
        curveTo(14.7826f, 10.9232f, 17.0926f, 8.6132f, 19.9416f, 8.6132f)
        curveTo(22.7906f, 8.6132f, 25.1016f, 10.9232f, 25.1016f, 13.7732f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(13.4844f, 8.613f)
        lineTo(7.3704f, 2.5f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(31.2822f, 26.4118f)
        lineTo(25.1012f, 20.2298f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.LrfSlide)
