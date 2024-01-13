package dev.jonpoulton.alakazam.tak.compose.icons.markers

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

public val MarkersTakIcons.ChemEffect: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "ChemEffect",
      defaultWidth = 34.0.dp,
      defaultHeight = 35.0.dp,
      viewportWidth = 34.0f,
      viewportHeight = 35.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFFD5AD00)),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(17.0f, 17.5f)
        moveToRelative(-16.0f, 0.0f)
        arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, 0.0f)
        arcToRelative(16.0f, 16.0f, 0.0f, true, true, -32.0f, 0.0f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(20.8621f, 18.6036f)
        curveTo(20.8621f, 17.5513f, 20.4412f, 16.5973f, 19.7586f, 15.9007f)
        curveTo(19.4207f, 15.5558f, 19.0186f, 15.2741f, 18.5717f, 15.0747f)
        moveTo(13.1379f, 18.6036f)
        curveTo(13.1379f, 17.5513f, 13.5588f, 16.5973f, 14.2414f, 15.9007f)
        curveTo(14.5793f, 15.5558f, 14.9814f, 15.2741f, 15.4283f, 15.0747f)
        moveTo(14.2414f, 21.3065f)
        curveTo(14.5793f, 21.6513f, 14.9814f, 21.9331f, 15.4283f, 22.1324f)
        curveTo(15.9085f, 22.3466f, 16.4403f, 22.4656f, 17.0f, 22.4656f)
        curveTo(17.5597f, 22.4656f, 18.0916f, 22.3466f, 18.5717f, 22.1324f)
        curveTo(19.0186f, 21.9331f, 19.4207f, 21.6513f, 19.7586f, 21.3065f)
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(14.2415f, 18.6036f)
        arcToRelative(2.7586f, 2.7586f, 0.0f, true, false, 5.5172f, 0.0f)
        arcToRelative(2.7586f, 2.7586f, 0.0f, true, false, -5.5172f, 0.0f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(13.1379f, 9.7759f)
        arcToRelative(3.8621f, 3.8621f, 0.0f, true, false, 7.7241f, 0.0f)
        arcToRelative(3.8621f, 3.8621f, 0.0f, true, false, -7.7241f, 0.0f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.9999f, 11.4309f)
        lineTo(16.9999f, 11.4309f)
        arcTo(0.5517f, 0.5517f, 0.0f, false, true, 17.5517f, 11.9826f)
        lineTo(17.5517f, 14.7412f)
        arcTo(0.5517f, 0.5517f, 0.0f, false, true, 16.9999f, 15.293f)
        lineTo(16.9999f, 15.293f)
        arcTo(0.5517f, 0.5517f, 0.0f, false, true, 16.4482f, 14.7412f)
        lineTo(16.4482f, 11.9826f)
        arcTo(0.5517f, 0.5517f, 0.0f, false, true, 16.9999f, 11.4309f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(22.8141f, 25.4999f)
        arcToRelative(3.8621f, 3.8621f, 75.0f, true, true, 3.8621f, -6.6893f)
        arcToRelative(3.8621f, 3.8621f, 75.0f, true, true, -3.8621f, 6.6893f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(23.4595f, 21.8794f)
        lineTo(23.4595f, 21.8794f)
        arcTo(0.5517f, 0.5517f, 75.0f, false, false, 23.2575f, 21.1257f)
        lineTo(20.8685f, 19.7464f)
        arcTo(0.5517f, 0.5517f, 75.0f, false, false, 20.1148f, 19.9484f)
        lineTo(20.1148f, 19.9484f)
        arcTo(0.5517f, 0.5517f, 75.0f, false, false, 20.3168f, 20.702f)
        lineTo(22.7058f, 22.0813f)
        arcTo(0.5517f, 0.5517f, 75.0f, false, false, 23.4595f, 21.8794f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(11.186f, 25.4998f)
        arcToRelative(3.8621f, 3.8621f, 105.0f, true, false, -3.8621f, -6.6893f)
        arcToRelative(3.8621f, 3.8621f, 105.0f, true, false, 3.8621f, 6.6893f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(10.5405f, 21.8794f)
        lineTo(10.5405f, 21.8794f)
        arcTo(0.5517f, 0.5517f, 105.0f, false, true, 10.7425f, 21.1257f)
        lineTo(13.1315f, 19.7464f)
        arcTo(0.5517f, 0.5517f, 105.0f, false, true, 13.8852f, 19.9484f)
        lineTo(13.8852f, 19.9484f)
        arcTo(0.5517f, 0.5517f, 105.0f, false, true, 13.6832f, 20.702f)
        lineTo(11.2942f, 22.0813f)
        arcTo(0.5517f, 0.5517f, 105.0f, false, true, 10.5405f, 21.8794f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
