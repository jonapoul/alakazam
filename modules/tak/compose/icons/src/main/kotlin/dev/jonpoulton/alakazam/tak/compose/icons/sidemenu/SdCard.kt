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

val SideMenuTakIcons.SdCard: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "SdCard",
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
        moveTo(26f, 9f)
        verticalLineTo(29f)
        curveTo(26f, 30.1046f, 25.1046f, 31f, 24f, 31f)
        horizontalLineTo(12f)
        curveTo(10.8954f, 31f, 10f, 30.1095f, 10f, 29.0049f)
        verticalLineTo(13f)
        lineTo(17f, 7f)
        horizontalLineTo(24f)
        curveTo(25.1046f, 7f, 26f, 7.8954f, 26f, 9f)
        close()
        moveTo(18.5f, 9.5f)
        horizontalLineTo(16f)
        verticalLineTo(15.5f)
        horizontalLineTo(18.5f)
        verticalLineTo(9.5f)
        close()
        moveTo(19f, 9.5f)
        horizontalLineTo(21.5f)
        verticalLineTo(15.5f)
        horizontalLineTo(19f)
        verticalLineTo(9.5f)
        close()
        moveTo(24.5f, 9.5f)
        horizontalLineTo(22f)
        verticalLineTo(15.5f)
        horizontalLineTo(24.5f)
        verticalLineTo(9.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
