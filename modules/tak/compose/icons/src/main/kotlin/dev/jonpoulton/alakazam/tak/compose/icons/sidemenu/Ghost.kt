package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

val SideMenuTakIcons.Ghost: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Ghost",
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
        moveTo(9f, 15.5f)
        curveTo(9f, 10.5294f, 13.0294f, 6.5f, 18f, 6.5f)
        curveTo(22.9706f, 6.5f, 27f, 10.5294f, 27f, 15.5f)
        verticalLineTo(29.5f)
        curveTo(26.625f, 29.5f, 26.0625f, 28.75f, 25.5f, 28f)
        curveTo(24.9375f, 27.25f, 24.375f, 26.5f, 24f, 26.5f)
        curveTo(23.625f, 26.5f, 23.0625f, 27.5f, 22.5f, 28.5f)
        curveTo(21.9375f, 29.5f, 21.375f, 30.5f, 21f, 30.5f)
        curveTo(20.625f, 30.5f, 20.0625f, 29.5f, 19.5f, 28.5f)
        curveTo(18.9375f, 27.5f, 18.375f, 26.5f, 18f, 26.5f)
        curveTo(17.625f, 26.5f, 17.0625f, 27.5f, 16.5f, 28.5f)
        curveTo(15.9375f, 29.5f, 15.375f, 30.5f, 15f, 30.5f)
        curveTo(14.625f, 30.5f, 14.0625f, 29.5f, 13.5f, 28.5f)
        curveTo(12.9375f, 27.5f, 12.375f, 26.5f, 12f, 26.5f)
        curveTo(11.625f, 26.5f, 11.0625f, 27.25f, 10.5f, 28f)
        curveTo(9.9375f, 28.75f, 9.375f, 29.5f, 9f, 29.5f)
        verticalLineTo(15.5f)
        close()
        moveTo(17f, 14.5f)
        curveTo(17f, 15.6046f, 16.1046f, 16.5f, 15f, 16.5f)
        curveTo(13.8954f, 16.5f, 13f, 15.6046f, 13f, 14.5f)
        curveTo(13f, 13.3954f, 13.8954f, 12.5f, 15f, 12.5f)
        curveTo(16.1046f, 12.5f, 17f, 13.3954f, 17f, 14.5f)
        close()
        moveTo(21f, 16.5f)
        curveTo(22.1046f, 16.5f, 23f, 15.6046f, 23f, 14.5f)
        curveTo(23f, 13.3954f, 22.1046f, 12.5f, 21f, 12.5f)
        curveTo(19.8954f, 12.5f, 19f, 13.3954f, 19f, 14.5f)
        curveTo(19f, 15.6046f, 19.8954f, 16.5f, 21f, 16.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
