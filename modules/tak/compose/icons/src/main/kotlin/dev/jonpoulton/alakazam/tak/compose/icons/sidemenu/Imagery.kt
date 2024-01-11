package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

val SideMenuTakIcons.Imagery: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Imagery",
      defaultWidth = 38.dp,
      defaultHeight = 40.dp,
      viewportWidth = 38f,
      viewportHeight = 40f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(11f, 13f)
        curveTo(10.4477f, 13f, 10f, 13.4477f, 10f, 14f)
        verticalLineTo(24f)
        curveTo(10f, 24.5523f, 10.4477f, 25f, 11f, 25f)
        horizontalLineTo(25f)
        curveTo(25.5523f, 25f, 26f, 24.5523f, 26f, 24f)
        verticalLineTo(14f)
        curveTo(26f, 13.4477f, 25.5523f, 13f, 25f, 13f)
        horizontalLineTo(11f)
        close()
        moveTo(12f, 14f)
        curveTo(11.4477f, 14f, 11f, 14.4477f, 11f, 15f)
        verticalLineTo(23f)
        curveTo(11f, 23.5523f, 11.4477f, 24f, 12f, 24f)
        horizontalLineTo(24f)
        curveTo(24.5523f, 24f, 25f, 23.5523f, 25f, 23f)
        verticalLineTo(15f)
        curveTo(25f, 14.4477f, 24.5523f, 14f, 24f, 14f)
        horizontalLineTo(12f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(17f, 25f)
        horizontalLineToRelative(2f)
        verticalLineToRelative(1f)
        horizontalLineToRelative(-2f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(16f, 26f)
        horizontalLineToRelative(4f)
        verticalLineToRelative(1f)
        horizontalLineToRelative(-4f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 0.25f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(15f, 15f)
        horizontalLineTo(12f)
        verticalLineTo(18f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 0.25f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(15f, 23f)
        horizontalLineTo(12f)
        verticalLineTo(20f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 0.25f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(21f, 15f)
        horizontalLineTo(24f)
        verticalLineTo(18f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 0.25f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(21f, 23f)
        horizontalLineTo(24f)
        verticalLineTo(20f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 0.5f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0167f, 14f)
        curveTo(15.9343f, 14.6667f, 16.1156f, 16f, 17.5f, 16f)
        curveTo(18.8844f, 16f, 19.0657f, 14.6667f, 18.9833f, 14f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 0.5f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(17f, 16f)
        curveTo(17.1667f, 16.5f, 17.6f, 17.6f, 18f, 18f)
        curveTo(18.5f, 18.5f, 17.5f, 24f, 17f, 24f)
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(18.801f, 19.5987f)
        lineTo(19.7962f, 22.6003f)
        lineTo(20.3691f, 21.6964f)
        lineTo(18.801f, 19.5987f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(18.8009f, 19.5988f)
        lineTo(21.3981f, 21.4028f)
        lineTo(20.369f, 21.6965f)
        lineTo(18.8009f, 19.5988f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.7962f, 22.6003f)
        lineTo(20.369f, 21.6965f)
        lineTo(21.3981f, 21.4028f)
        lineTo(18.8013f, 19.5991f)
        lineTo(18.801f, 19.5987f)
        lineTo(18.8011f, 19.5989f)
        lineTo(18.8009f, 19.5988f)
        lineTo(18.8011f, 19.5991f)
        lineTo(19.7962f, 22.6003f)
        close()
        moveTo(19.0161f, 19.8867f)
        lineTo(19.8246f, 22.3249f)
        lineTo(20.29f, 21.5907f)
        lineTo(21.1259f, 21.3521f)
        lineTo(19.0161f, 19.8867f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 0.5f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(17.5f, 23f)
        curveTo(16.6667f, 22.6667f, 15f, 21.8f, 15f, 21f)
        curveTo(15f, 20f, 14f, 19f, 15f, 18f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 0.5f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(19f, 15f)
        curveTo(19f, 15f, 19f, 16f, 22f, 16f)
        curveTo(25f, 16f, 21f, 18f, 21f, 19f)
        curveTo(21f, 20f, 22f, 21f, 22f, 21f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
