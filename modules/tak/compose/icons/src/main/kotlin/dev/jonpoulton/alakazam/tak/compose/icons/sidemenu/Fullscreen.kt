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

val SideMenuTakIcons.Fullscreen: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Fullscreen",
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
        moveTo(14.0241f, 31.1154f)
        curveTo(14.8525f, 31.1154f, 15.5241f, 30.4438f, 15.5241f, 29.6154f)
        curveTo(15.5241f, 28.7869f, 14.8525f, 28.1154f, 14.0241f, 28.1154f)
        horizontalLineTo(10.9739f)
        lineTo(16.7531f, 22.3351f)
        curveTo(17.3389f, 21.7493f, 17.3388f, 20.7995f, 16.753f, 20.2138f)
        curveTo(16.1671f, 19.6281f, 15.2174f, 19.6281f, 14.6316f, 20.214f)
        lineTo(8.8511f, 25.9955f)
        verticalLineTo(22.9412f)
        curveTo(8.8511f, 22.1128f, 8.1795f, 21.4412f, 7.3511f, 21.4412f)
        curveTo(6.5227f, 21.4412f, 5.8511f, 22.1128f, 5.8511f, 22.9412f)
        verticalLineTo(29.6154f)
        curveTo(5.8511f, 30.4438f, 6.5227f, 31.1154f, 7.3511f, 31.1154f)
        horizontalLineTo(7.353f)
        horizontalLineTo(14.0241f)
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
        moveTo(21.9759f, 6.8846f)
        curveTo(21.1475f, 6.8846f, 20.4759f, 7.5562f, 20.4759f, 8.3846f)
        curveTo(20.4759f, 9.2131f, 21.1475f, 9.8846f, 21.9759f, 9.8846f)
        horizontalLineTo(25.0261f)
        lineTo(19.2469f, 15.6649f)
        curveTo(18.6611f, 16.2507f, 18.6612f, 17.2005f, 19.247f, 17.7862f)
        curveTo(19.8329f, 18.3719f, 20.7826f, 18.3719f, 21.3684f, 17.786f)
        lineTo(27.1489f, 12.0045f)
        verticalLineTo(15.0588f)
        curveTo(27.1489f, 15.8872f, 27.8205f, 16.5588f, 28.6489f, 16.5588f)
        curveTo(29.4773f, 16.5588f, 30.1489f, 15.8872f, 30.1489f, 15.0588f)
        verticalLineTo(8.3846f)
        curveTo(30.1489f, 7.5562f, 29.4773f, 6.8846f, 28.6489f, 6.8846f)
        horizontalLineTo(28.647f)
        horizontalLineTo(21.9759f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
