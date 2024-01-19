package dev.jonpoulton.alakazam.tak.compose.icons.markers

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
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val MarkersTakIcons.LargeReticle: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "LargeReticle",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Alert),
        stroke = null, fillAlpha = 0.75f,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(31.2835f, 16.4999f)
        curveTo(31.2835f, 24.9408f, 24.4408f, 31.7835f, 15.9999f, 31.7835f)
        curveTo(7.559f, 31.7835f, 0.7163f, 24.9408f, 0.7163f, 16.4999f)
        curveTo(0.7163f, 8.059f, 7.559f, 1.2163f, 15.9999f, 1.2163f)
        curveTo(24.4408f, 1.2163f, 31.2835f, 8.059f, 31.2835f, 16.4999f)
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
        moveTo(16.0f, 1.9328f)
        curveTo(7.9548f, 1.9328f, 1.4328f, 8.4548f, 1.4328f, 16.5f)
        curveTo(1.4328f, 24.5452f, 7.9548f, 31.0672f, 16.0f, 31.0672f)
        curveTo(24.0452f, 31.0672f, 30.5672f, 24.5452f, 30.5672f, 16.5f)
        curveTo(30.5672f, 8.4548f, 24.0452f, 1.9328f, 16.0f, 1.9328f)
        close()
        moveTo(0.0f, 16.5f)
        curveTo(0.0f, 7.6634f, 7.1634f, 0.5f, 16.0f, 0.5f)
        curveTo(24.8366f, 0.5f, 32.0f, 7.6634f, 32.0f, 16.5f)
        curveTo(32.0f, 25.3366f, 24.8366f, 32.5f, 16.0f, 32.5f)
        curveTo(7.1634f, 32.5f, 0.0f, 25.3366f, 0.0f, 16.5f)
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
        moveTo(15.0447f, 0.7388f)
        horizontalLineTo(16.9551f)
        verticalLineTo(4.5597f)
        horizontalLineTo(15.0447f)
        verticalLineTo(0.7388f)
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
        moveTo(15.0447f, 28.4402f)
        horizontalLineTo(16.9551f)
        verticalLineTo(32.2611f)
        horizontalLineTo(15.0447f)
        verticalLineTo(28.4402f)
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
        moveTo(15.0447f, 0.7388f)
        horizontalLineTo(16.9551f)
        verticalLineTo(4.5597f)
        horizontalLineTo(15.0447f)
        verticalLineTo(0.7388f)
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
        moveTo(15.7612f, 0.7388f)
        horizontalLineTo(16.2388f)
        verticalLineTo(32.2612f)
        horizontalLineTo(15.7612f)
        verticalLineTo(0.7388f)
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
        moveTo(16.9553f, 6.9478f)
        lineTo(16.9553f, 7.4254f)
        lineTo(15.0449f, 7.4254f)
        lineTo(15.0449f, 6.9478f)
        lineTo(16.9553f, 6.9478f)
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
        moveTo(16.9553f, 19.8433f)
        lineTo(16.9553f, 20.3209f)
        lineTo(15.0449f, 20.3209f)
        lineTo(15.0449f, 19.8433f)
        lineTo(16.9553f, 19.8433f)
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
        moveTo(16.9553f, 9.8135f)
        lineTo(16.9553f, 10.2911f)
        lineTo(15.0449f, 10.2911f)
        lineTo(15.0449f, 9.8135f)
        lineTo(16.9553f, 9.8135f)
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
        moveTo(16.9553f, 22.709f)
        lineTo(16.9553f, 23.1866f)
        lineTo(15.0449f, 23.1866f)
        lineTo(15.0449f, 22.709f)
        lineTo(16.9553f, 22.709f)
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
        moveTo(16.9553f, 12.6792f)
        lineTo(16.9553f, 13.1568f)
        lineTo(15.0449f, 13.1568f)
        lineTo(15.0449f, 12.6792f)
        lineTo(16.9553f, 12.6792f)
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
        moveTo(16.9553f, 25.5747f)
        lineTo(16.9553f, 26.0523f)
        lineTo(15.0449f, 26.0523f)
        lineTo(15.0449f, 25.5747f)
        lineTo(16.9553f, 25.5747f)
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
        moveTo(15.0447f, 28.4402f)
        horizontalLineTo(16.9551f)
        verticalLineTo(32.2611f)
        horizontalLineTo(15.0447f)
        verticalLineTo(28.4402f)
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
        moveTo(31.7612f, 15.5447f)
        lineTo(31.7612f, 17.4551f)
        lineTo(27.9403f, 17.4551f)
        lineTo(27.9403f, 15.5447f)
        lineTo(31.7612f, 15.5447f)
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
        moveTo(31.7612f, 16.2612f)
        lineTo(31.7612f, 16.7388f)
        lineTo(0.2388f, 16.7388f)
        lineTo(0.2388f, 16.2612f)
        lineTo(31.7612f, 16.2612f)
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
        moveTo(25.5522f, 17.4553f)
        lineTo(25.0746f, 17.4553f)
        lineTo(25.0746f, 15.5449f)
        lineTo(25.5522f, 15.5449f)
        lineTo(25.5522f, 17.4553f)
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
        moveTo(12.6567f, 17.4553f)
        lineTo(12.1791f, 17.4553f)
        lineTo(12.1791f, 15.5449f)
        lineTo(12.6567f, 15.5449f)
        lineTo(12.6567f, 17.4553f)
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
        moveTo(22.6865f, 17.4553f)
        lineTo(22.2089f, 17.4553f)
        lineTo(22.2089f, 15.5449f)
        lineTo(22.6865f, 15.5449f)
        lineTo(22.6865f, 17.4553f)
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
        moveTo(9.791f, 17.4553f)
        lineTo(9.3134f, 17.4553f)
        lineTo(9.3134f, 15.5449f)
        lineTo(9.791f, 15.5449f)
        lineTo(9.791f, 17.4553f)
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
        moveTo(19.8208f, 17.4553f)
        lineTo(19.3432f, 17.4553f)
        lineTo(19.3432f, 15.5449f)
        lineTo(19.8208f, 15.5449f)
        lineTo(19.8208f, 17.4553f)
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
        moveTo(6.9253f, 17.4553f)
        lineTo(6.4477f, 17.4553f)
        lineTo(6.4477f, 15.5449f)
        lineTo(6.9253f, 15.5449f)
        lineTo(6.9253f, 17.4553f)
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
        moveTo(4.0598f, 15.5447f)
        lineTo(4.0598f, 17.4551f)
        lineTo(0.2389f, 17.4551f)
        lineTo(0.2389f, 15.5447f)
        lineTo(4.0598f, 15.5447f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.LargeReticle)
