package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.ui.graphics.Color
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

val UtilityTakIcons.Edit: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Edit",
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
        pathFillType = NonZero,
      ) {
        moveTo(23.5291f, 5.7563f)
        curveTo(22.226f, 4.5257f, 20.1134f, 4.5257f, 18.8103f, 5.7563f)
        lineTo(5.5819f, 18.2487f)
        curveTo(5.4913f, 18.3343f, 5.4258f, 18.4404f, 5.3916f, 18.557f)
        lineTo(3.6521f, 24.4878f)
        curveTo(3.5805f, 24.7309f, 3.6532f, 24.9913f, 3.8421f, 25.1699f)
        curveTo(4.0312f, 25.3483f, 4.3069f, 25.4169f, 4.5644f, 25.3496f)
        lineTo(10.8447f, 23.7066f)
        curveTo(10.9681f, 23.6743f, 11.0804f, 23.6125f, 11.1711f, 23.5269f)
        lineTo(24.3992f, 11.0342f)
        curveTo(25.7003f, 9.8028f, 25.7003f, 7.8094f, 24.3992f, 6.578f)
        lineTo(23.5291f, 5.7563f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
