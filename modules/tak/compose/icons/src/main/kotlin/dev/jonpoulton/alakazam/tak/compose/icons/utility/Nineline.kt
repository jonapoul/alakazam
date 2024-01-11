package dev.jonpoulton.alakazam.tak.compose.icons.utility

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
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons

val UtilityTakIcons.Nineline: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Nineline",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(22.9213f, 22.1928f)
        curveTo(18.8297f, 27.1565f, 11.4885f, 27.8645f, 6.5249f, 23.7737f)
        curveTo(1.5596f, 19.6828f, 0.8524f, 12.3417f, 4.9432f, 7.3773f)
        curveTo(9.034f, 2.4128f, 16.3752f, 1.7048f, 21.3396f, 5.7957f)
        curveTo(26.3041f, 9.8865f, 27.0121f, 17.2284f, 22.9213f, 22.1928f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(13.9323f, 20.5428f)
        lineTo(15.5686f, 23.3779f)
        lineTo(17.2057f, 26.213f)
        horizontalLineTo(13.9323f)
        horizontalLineTo(10.6581f)
        lineTo(12.2952f, 23.3779f)
        lineTo(13.9323f, 20.5428f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(13.9323f, 8.6664f)
        lineTo(12.2952f, 5.8314f)
        lineTo(10.6581f, 2.9971f)
        horizontalLineTo(13.9323f)
        horizontalLineTo(17.2057f)
        lineTo(15.5686f, 5.8314f)
        lineTo(13.9323f, 8.6664f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(7.9941f, 14.6047f)
        lineTo(5.1583f, 16.2418f)
        lineTo(2.324f, 17.8781f)
        verticalLineTo(14.6047f)
        verticalLineTo(11.3313f)
        lineTo(5.1583f, 12.9676f)
        lineTo(7.9941f, 14.6047f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.8698f, 14.6047f)
        lineTo(22.7056f, 12.9676f)
        lineTo(25.5399f, 11.3313f)
        verticalLineTo(14.6047f)
        verticalLineTo(17.8781f)
        lineTo(22.7056f, 16.2418f)
        lineTo(19.8698f, 14.6047f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(2.3236f, 14.6047f)
        horizontalLineTo(25.3978f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(13.8608f, 3.0675f)
        verticalLineTo(26.1417f)
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(15.7965f, 14.6047f)
        curveTo(15.7965f, 15.674f, 14.9298f, 16.5407f, 13.8605f, 16.5407f)
        curveTo(12.792f, 16.5407f, 11.9253f, 15.674f, 11.9253f, 14.6047f)
        curveTo(11.9253f, 13.5354f, 12.792f, 12.6687f, 13.8605f, 12.6687f)
        curveTo(14.9298f, 12.6687f, 15.7965f, 13.5354f, 15.7965f, 14.6047f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
