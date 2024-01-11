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

val SideMenuTakIcons.Elevation: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Elevation",
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
        pathFillType = NonZero,
      ) {
        moveTo(12f, 6f)
        horizontalLineToRelative(12f)
        verticalLineToRelative(12f)
        horizontalLineToRelative(-12f)
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
        moveTo(6f, 30f)
        lineToRelative(24f, -0f)
        lineToRelative(0f, -1f)
        lineToRelative(-24f, -0f)
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
        moveTo(14.8234f, 22.4326f)
        curveTo(14.5305f, 22.1397f, 14.5305f, 21.6649f, 14.8234f, 21.372f)
        lineTo(17.475f, 18.7204f)
        lineTo(17.4757f, 18.7197f)
        curveTo(17.7686f, 18.4268f, 18.2435f, 18.4268f, 18.5364f, 18.7197f)
        lineTo(21.1887f, 21.372f)
        curveTo(21.4816f, 21.6649f, 21.4816f, 22.1397f, 21.1887f, 22.4326f)
        curveTo(20.8958f, 22.7255f, 20.4209f, 22.7255f, 20.128f, 22.4326f)
        lineTo(18.7553f, 21.0599f)
        verticalLineTo(22.9201f)
        curveTo(18.7553f, 22.9216f, 18.7553f, 22.9231f, 18.7553f, 22.9246f)
        verticalLineTo(25.7447f)
        lineTo(20.128f, 24.3719f)
        curveTo(20.4209f, 24.0791f, 20.8958f, 24.0791f, 21.1887f, 24.3719f)
        curveTo(21.4816f, 24.6648f, 21.4816f, 25.1397f, 21.1887f, 25.4326f)
        lineTo(18.5364f, 28.0849f)
        curveTo(18.2435f, 28.3778f, 17.7686f, 28.3778f, 17.4757f, 28.0849f)
        lineTo(17.475f, 28.0841f)
        lineTo(14.8234f, 25.4326f)
        curveTo(14.5305f, 25.1397f, 14.5305f, 24.6648f, 14.8234f, 24.3719f)
        curveTo(15.1163f, 24.0791f, 15.5912f, 24.0791f, 15.8841f, 24.3719f)
        lineTo(17.2553f, 25.7432f)
        verticalLineTo(23.8845f)
        curveTo(17.2553f, 23.883f, 17.2553f, 23.8815f, 17.2553f, 23.88f)
        verticalLineTo(21.0614f)
        lineTo(15.8841f, 22.4326f)
        curveTo(15.5912f, 22.7255f, 15.1163f, 22.7255f, 14.8234f, 22.4326f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
