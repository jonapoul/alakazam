package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons

public val UtilityTakIcons.VisibilityVisible: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "VisibilityVisible",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.35f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(26.8443f, 15.0344f)
        curveTo(26.8443f, 15.0344f, 21.2886f, 21.8717f, 14.4342f, 21.8717f)
        curveTo(7.5807f, 21.8717f, 2.025f, 15.0344f, 2.025f, 15.0344f)
        curveTo(2.025f, 15.0344f, 7.5807f, 8.198f, 14.4342f, 8.198f)
        curveTo(21.2886f, 8.198f, 26.8443f, 15.0344f, 26.8443f, 15.0344f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.35f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.0722f, 14.9853f)
        curveTo(19.0722f, 17.7105f, 16.8627f, 19.9191f, 14.1384f, 19.9191f)
        curveTo(11.4123f, 19.9191f, 9.2037f, 17.7105f, 9.2037f, 14.9853f)
        curveTo(9.2037f, 12.2601f, 11.4123f, 10.0515f, 14.1384f, 10.0515f)
        curveTo(16.8627f, 10.0515f, 19.0722f, 12.2601f, 19.0722f, 14.9853f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
