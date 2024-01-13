package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

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

public val SideMenuTakIcons.Send: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Send",
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
        moveTo(19.661f, 6.7442f)
        curveTo(19.4133f, 6.5053f, 19.0417f, 6.4342f, 18.719f, 6.5643f)
        curveTo(18.3963f, 6.6944f, 18.1858f, 7.0001f, 18.1858f, 7.339f)
        verticalLineTo(11.8157f)
        curveTo(13.5141f, 11.9959f, 11.1747f, 13.8744f, 10.8172f, 14.1868f)
        curveTo(8.4602f, 16.063f, 6.8509f, 18.6775f, 6.2664f, 21.5799f)
        curveTo(5.9742f, 22.9822f, 5.9218f, 27.3187f, 6.112f, 28.7374f)
        curveTo(6.1144f, 28.7547f, 6.1164f, 28.7675f, 6.1185f, 28.78f)
        lineTo(6.3022f, 29.8048f)
        curveTo(6.3641f, 30.1498f, 6.6408f, 30.4215f, 6.9959f, 30.4858f)
        curveTo(7.3513f, 30.55f, 7.7102f, 30.393f, 7.896f, 30.0925f)
        lineTo(8.4467f, 29.2021f)
        curveTo(10.1388f, 26.4731f, 12.2474f, 21.767f, 14.7149f, 20.9283f)
        curveTo(15.8278f, 20.5465f, 17.007f, 20.3791f, 18.1858f, 20.4348f)
        verticalLineTo(25.0714f)
        curveTo(18.1858f, 25.4109f, 18.397f, 25.7174f, 18.7207f, 25.8468f)
        curveTo(19.0447f, 25.9766f, 19.417f, 25.9038f, 19.664f, 25.663f)
        lineTo(29.7482f, 16.7522f)
        curveTo(30.0851f, 16.4238f, 30.0837f, 15.8926f, 29.7452f, 15.5658f)
        lineTo(19.661f, 6.7442f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
