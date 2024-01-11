package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

val SideMenuTakIcons.Rotation: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Rotation",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
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
        moveTo(21.2774f, 12.4045f)
        curveTo(21.5703f, 12.6974f, 22.0452f, 12.6974f, 22.338f, 12.4045f)
        curveTo(22.6309f, 12.1116f, 22.6309f, 11.6367f, 22.338f, 11.3438f)
        lineTo(21.5569f, 10.5626f)
        horizontalLineTo(22.7712f)
        verticalLineTo(10.5629f)
        horizontalLineTo(26.4361f)
        curveTo(26.5742f, 10.5629f, 26.6861f, 10.6748f, 26.6861f, 10.8129f)
        verticalLineTo(12.8534f)
        curveTo(26.6836f, 12.8783f, 26.6824f, 12.9035f, 26.6824f, 12.9291f)
        verticalLineTo(16.2737f)
        lineTo(25.9f, 15.4914f)
        curveTo(25.6071f, 15.1985f, 25.1322f, 15.1985f, 24.8393f, 15.4914f)
        curveTo(24.5464f, 15.7842f, 24.5464f, 16.2591f, 24.8393f, 16.552f)
        lineTo(26.9014f, 18.6141f)
        curveTo(27.1943f, 18.907f, 27.6692f, 18.907f, 27.9621f, 18.6141f)
        lineTo(27.9627f, 18.6135f)
        lineTo(30.0242f, 16.552f)
        curveTo(30.3171f, 16.2591f, 30.3171f, 15.7842f, 30.0242f, 15.4914f)
        curveTo(29.7313f, 15.1985f, 29.2564f, 15.1985f, 28.9636f, 15.4914f)
        lineTo(28.1824f, 16.2725f)
        verticalLineTo(16.0327f)
        horizontalLineTo(28.1861f)
        verticalLineTo(10.8129f)
        curveTo(28.1861f, 9.8464f, 27.4026f, 9.0629f, 26.4361f, 9.0629f)
        horizontalLineTo(24.9188f)
        curveTo(24.9127f, 9.0627f, 24.9065f, 9.0626f, 24.9003f, 9.0626f)
        lineTo(21.5557f, 9.0626f)
        lineTo(22.338f, 8.2803f)
        curveTo(22.6309f, 7.9874f, 22.6309f, 7.5125f, 22.338f, 7.2196f)
        curveTo(22.0452f, 6.9267f, 21.5703f, 6.9267f, 21.2774f, 7.2196f)
        lineTo(19.2153f, 9.2817f)
        curveTo(18.9224f, 9.5746f, 18.9224f, 10.0495f, 19.2153f, 10.3424f)
        lineTo(19.2159f, 10.343f)
        lineTo(21.2774f, 12.4045f)
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
        moveTo(5.9956f, 15f)
        horizontalLineToRelative(16f)
        verticalLineToRelative(16f)
        horizontalLineToRelative(-16f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
