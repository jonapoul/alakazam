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

val SideMenuTakIcons.RemarksAlternate: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RemarksAlternate",
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
        moveTo(18.3856f, 30.5f)
        curveTo(18.3856f, 30.5f, 27.7728f, 20.3769f, 27.7728f, 15.4401f)
        curveTo(27.7728f, 10.5018f, 23.5701f, 6.5f, 18.3856f, 6.5f)
        curveTo(13.2027f, 6.5f, 9f, 10.5018f, 9f, 15.4401f)
        curveTo(9f, 20.3769f, 18.3856f, 30.5f, 18.3856f, 30.5f)
        close()
        moveTo(18.3276f, 9.5f)
        curveTo(18.801f, 9.5f, 19.1912f, 9.8563f, 19.2445f, 10.3154f)
        lineTo(19.2507f, 10.4231f)
        verticalLineTo(14.3824f)
        horizontalLineTo(22.9822f)
        curveTo(23.492f, 14.3824f, 23.9052f, 14.7957f, 23.9052f, 15.3055f)
        curveTo(23.9052f, 15.7789f, 23.5489f, 16.169f, 23.0898f, 16.2223f)
        lineTo(22.9822f, 16.2285f)
        horizontalLineTo(19.2507f)
        verticalLineTo(20.1879f)
        curveTo(19.2507f, 20.6977f, 18.8374f, 21.1109f, 18.3276f, 21.1109f)
        curveTo(17.8542f, 21.1109f, 17.4641f, 20.7546f, 17.4108f, 20.2955f)
        lineTo(17.4045f, 20.1879f)
        verticalLineTo(16.2285f)
        horizontalLineTo(13.6731f)
        curveTo(13.1633f, 16.2285f, 12.75f, 15.8153f, 12.75f, 15.3055f)
        curveTo(12.75f, 14.8321f, 13.1063f, 14.4419f, 13.5654f, 14.3886f)
        lineTo(13.6731f, 14.3824f)
        horizontalLineTo(17.4045f)
        verticalLineTo(10.4231f)
        curveTo(17.4045f, 9.9133f, 17.8178f, 9.5f, 18.3276f, 9.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
