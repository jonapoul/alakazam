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

public val SideMenuTakIcons.History: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "History",
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
        moveTo(9.6923f, 18.5f)
        curveTo(9.6923f, 13.9192f, 13.4191f, 10.1923f, 18f, 10.1923f)
        curveTo(22.5808f, 10.1923f, 26.3076f, 13.9192f, 26.3076f, 18.5f)
        curveTo(26.3076f, 23.0809f, 22.5808f, 26.8077f, 18f, 26.8077f)
        curveTo(13.4191f, 26.8077f, 9.6923f, 23.0809f, 9.6923f, 18.5f)
        close()
        moveTo(18.2643f, 20.4953f)
        curveTo(18.5873f, 20.3206f, 18.7887f, 19.9829f, 18.7887f, 19.6157f)
        verticalLineTo(13.2969f)
        curveTo(18.7887f, 12.8567f, 18.4319f, 12.4999f, 17.9918f, 12.4999f)
        curveTo(17.5581f, 12.4999f, 17.204f, 12.8467f, 17.195f, 13.2803f)
        lineTo(17.0887f, 18.3952f)
        curveTo(17.0813f, 18.7465f, 16.8901f, 19.0683f, 16.585f, 19.2426f)
        lineTo(14.657f, 20.3443f)
        curveTo(14.2105f, 20.5995f, 14.0581f, 21.17f, 14.3178f, 21.6138f)
        curveTo(14.5695f, 22.0439f, 15.1169f, 22.1971f, 15.5553f, 21.9601f)
        lineTo(18.2643f, 20.4953f)
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
        moveTo(18f, 6.5f)
        curveTo(21.2053f, 6.5f, 24.2188f, 7.7482f, 26.4853f, 10.0147f)
        curveTo(28.7518f, 12.2812f, 30f, 15.2947f, 30f, 18.5f)
        curveTo(30f, 21.7053f, 28.7518f, 24.7188f, 26.4853f, 26.9853f)
        curveTo(24.2188f, 29.2518f, 21.2053f, 30.5f, 18f, 30.5f)
        curveTo(14.7947f, 30.5f, 11.7812f, 29.2518f, 9.5147f, 26.9853f)
        curveTo(7.2482f, 24.7188f, 6f, 21.7053f, 6f, 18.5f)
        curveTo(6f, 15.2947f, 7.2482f, 12.2812f, 9.5147f, 10.0147f)
        curveTo(11.7812f, 7.7482f, 14.7947f, 6.5f, 18f, 6.5f)
        close()
        moveTo(7.8461f, 18.5f)
        curveTo(7.8461f, 24.0989f, 12.4011f, 28.6538f, 18f, 28.6538f)
        curveTo(23.5989f, 28.6538f, 28.1538f, 24.0989f, 28.1538f, 18.5f)
        curveTo(28.1538f, 12.9011f, 23.5989f, 8.3462f, 18f, 8.3462f)
        curveTo(12.4011f, 8.3462f, 7.8461f, 12.9011f, 7.8461f, 18.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
