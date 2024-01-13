package dev.jonpoulton.alakazam.tak.compose.icons.utility

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

public val UtilityTakIcons.Aircraft: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Aircraft",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(27.7917f, 20.6625f)
        verticalLineTo(17.8834f)
        lineTo(16.5987f, 10.9354f)
        verticalLineTo(3.2927f)
        curveTo(16.5987f, 2.1394f, 15.6613f, 1.2084f, 14.5f, 1.2084f)
        curveTo(13.3387f, 1.2084f, 12.4013f, 2.1394f, 12.4013f, 3.2927f)
        verticalLineTo(10.9354f)
        lineTo(1.2084f, 17.8834f)
        verticalLineTo(20.6625f)
        lineTo(12.4014f, 17.1886f)
        verticalLineTo(24.8313f)
        lineTo(9.6031f, 26.9157f)
        verticalLineTo(29f)
        lineTo(14.5001f, 27.6105f)
        lineTo(19.397f, 29f)
        verticalLineTo(26.9157f)
        lineTo(16.5987f, 24.8313f)
        verticalLineTo(17.1885f)
        lineTo(27.7917f, 20.6625f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
