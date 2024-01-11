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

val SideMenuTakIcons.Add: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Add",
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
        moveTo(17.8154f, 12.5099f)
        curveTo(18.2888f, 12.5099f, 18.6789f, 12.8663f, 18.7323f, 13.3253f)
        lineTo(18.7385f, 13.433f)
        verticalLineTo(17.3923f)
        horizontalLineTo(22.4699f)
        curveTo(22.9797f, 17.3923f, 23.393f, 17.8056f, 23.393f, 18.3154f)
        curveTo(23.393f, 18.7888f, 23.0367f, 19.1789f, 22.5776f, 19.2323f)
        lineTo(22.4699f, 19.2385f)
        horizontalLineTo(18.7385f)
        verticalLineTo(23.1978f)
        curveTo(18.7385f, 23.7076f, 18.3252f, 24.1209f, 17.8154f, 24.1209f)
        curveTo(17.342f, 24.1209f, 16.9518f, 23.7645f, 16.8985f, 23.3054f)
        lineTo(16.8923f, 23.1978f)
        verticalLineTo(19.2385f)
        horizontalLineTo(13.1608f)
        curveTo(12.651f, 19.2385f, 12.2378f, 18.8252f, 12.2378f, 18.3154f)
        curveTo(12.2378f, 17.842f, 12.5941f, 17.4518f, 13.0532f, 17.3985f)
        lineTo(13.1608f, 17.3923f)
        horizontalLineTo(16.8923f)
        verticalLineTo(13.433f)
        curveTo(16.8923f, 12.9232f, 17.3056f, 12.5099f, 17.8154f, 12.5099f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
