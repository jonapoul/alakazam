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

public val SideMenuTakIcons.Remove: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Remove",
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
        moveTo(17.8154f, 30.1308f)
        curveTo(24.3408f, 30.1308f, 29.6308f, 24.8408f, 29.6308f, 18.3154f)
        curveTo(29.6308f, 11.7899f, 24.3408f, 6.5f, 17.8154f, 6.5f)
        curveTo(11.2899f, 6.5f, 6f, 11.7899f, 6f, 18.3154f)
        curveTo(6f, 24.8408f, 11.2899f, 30.1308f, 17.8154f, 30.1308f)
        close()
        moveTo(23.393f, 18.3154f)
        curveTo(23.393f, 17.8056f, 22.9797f, 17.3923f, 22.4699f, 17.3923f)
        horizontalLineTo(13.1608f)
        lineTo(13.0532f, 17.3985f)
        curveTo(12.5941f, 17.4518f, 12.2378f, 17.842f, 12.2378f, 18.3154f)
        curveTo(12.2378f, 18.8252f, 12.651f, 19.2385f, 13.1608f, 19.2385f)
        horizontalLineTo(22.4699f)
        lineTo(22.5776f, 19.2323f)
        curveTo(23.0367f, 19.1789f, 23.393f, 18.7888f, 23.393f, 18.3154f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
