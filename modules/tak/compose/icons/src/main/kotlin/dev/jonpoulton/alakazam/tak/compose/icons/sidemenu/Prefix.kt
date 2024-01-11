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

val SideMenuTakIcons.Prefix: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Prefix",
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
        moveTo(12.7301f, 26.5522f)
        curveTo(13.7078f, 26.5522f, 14.4808f, 25.7792f, 14.4808f, 24.8015f)
        verticalLineTo(13.7286f)
        horizontalLineTo(17.8459f)
        curveTo(18.7326f, 13.7286f, 19.4602f, 13.0011f, 19.4602f, 12.1143f)
        curveTo(19.4602f, 11.2276f, 18.7326f, 10.5f, 17.8459f, 10.5f)
        horizontalLineTo(7.6143f)
        curveTo(6.7276f, 10.5f, 6f, 11.2276f, 6f, 12.1143f)
        curveTo(6f, 13.0011f, 6.7276f, 13.7286f, 7.6143f, 13.7286f)
        horizontalLineTo(10.9794f)
        verticalLineTo(24.8015f)
        curveTo(10.9794f, 25.7792f, 11.7524f, 26.5522f, 12.7301f, 26.5522f)
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
        moveTo(25.7213f, 26.6147f)
        curveTo(26.4716f, 26.6147f, 28.174f, 26.6659f, 28.8107f, 26.4158f)
        curveTo(29.2881f, 26.2339f, 29.5212f, 25.5973f, 29.5212f, 24.9834f)
        curveTo(29.5212f, 24.1876f, 28.8618f, 23.551f, 28.0888f, 23.551f)
        curveTo(28.0206f, 23.551f, 27.7932f, 23.5737f, 27.6795f, 23.5737f)
        curveTo(26.9064f, 23.5737f, 26.5654f, 23.1872f, 26.5654f, 22.3914f)
        verticalLineTo(17.1846f)
        horizontalLineTo(28.0888f)
        curveTo(28.9073f, 17.1846f, 29.5667f, 16.5253f, 29.5667f, 15.7067f)
        curveTo(29.5667f, 14.8882f, 28.9073f, 14.2288f, 28.0888f, 14.2288f)
        horizontalLineTo(26.5654f)
        verticalLineTo(12.7055f)
        curveTo(26.5654f, 11.7505f, 25.7923f, 10.9775f, 24.8374f, 10.9775f)
        curveTo(23.8824f, 10.9775f, 23.1094f, 11.7505f, 23.1094f, 12.7055f)
        verticalLineTo(14.2288f)
        lineTo(22.0607f, 14.2232f)
        curveTo(21.2421f, 14.2232f, 20.5828f, 14.8825f, 20.5828f, 15.7011f)
        curveTo(20.5828f, 16.5196f, 21.2421f, 17.179f, 22.0607f, 17.179f)
        lineTo(23.1094f, 17.1846f)
        verticalLineTo(22.9598f)
        curveTo(23.1094f, 25.7792f, 23.6068f, 26.6147f, 25.7213f, 26.6147f)
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
        moveTo(18.8634f, 24.9947f)
        moveToRelative(-1.421f, 0f)
        arcToRelative(1.421f, 1.421f, 0f, true, true, 2.8421f, 0f)
        arcToRelative(1.421f, 1.421f, 0f, true, true, -2.8421f, 0f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
