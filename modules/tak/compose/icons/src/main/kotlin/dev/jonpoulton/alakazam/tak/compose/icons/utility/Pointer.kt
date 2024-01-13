package dev.jonpoulton.alakazam.tak.compose.icons.utility

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

public val UtilityTakIcons.Pointer: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Pointer",
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
        pathFillType = EvenOdd,
      ) {
        moveTo(14.608f, 27.4243f)
        curveTo(14.608f, 27.4243f, 23.9952f, 16.7931f, 23.9952f, 11.6085f)
        curveTo(23.9952f, 6.4224f, 19.7925f, 2.2197f, 14.608f, 2.2197f)
        curveTo(9.4251f, 2.2197f, 5.2224f, 6.4224f, 5.2224f, 11.6085f)
        curveTo(5.2224f, 16.7931f, 14.608f, 27.4243f, 14.608f, 27.4243f)
        close()
        moveTo(14.6088f, 14.3387f)
        curveTo(15.9912f, 14.3387f, 17.1115f, 13.2185f, 17.1115f, 11.836f)
        curveTo(17.1115f, 10.452f, 15.9912f, 9.3333f, 14.6088f, 9.3333f)
        curveTo(13.2247f, 9.3333f, 12.1061f, 10.452f, 12.1061f, 11.836f)
        curveTo(12.1061f, 13.2185f, 13.2247f, 14.3387f, 14.6088f, 14.3387f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
