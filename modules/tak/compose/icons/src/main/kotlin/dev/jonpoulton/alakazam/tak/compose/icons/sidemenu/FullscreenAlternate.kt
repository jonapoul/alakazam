package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.FullscreenAlternate: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "FullscreenAlternate",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      group {
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = EvenOdd,
        ) {
          moveTo(10.9017f, 27.1602f)
          horizontalLineTo(10.9006f)
          curveTo(10.4863f, 27.1602f, 10.1506f, 26.8244f, 10.1506f, 26.4102f)
          verticalLineTo(21.9608f)
          curveTo(10.1506f, 21.5466f, 10.4863f, 21.2108f, 10.9006f, 21.2108f)
          curveTo(11.3148f, 21.2108f, 11.6506f, 21.5466f, 11.6506f, 21.9608f)
          verticalLineTo(24.6006f)
          lineTo(15.931f, 20.3194f)
          curveTo(16.2239f, 20.0265f, 16.6988f, 20.0264f, 16.9917f, 20.3193f)
          curveTo(17.2846f, 20.6122f, 17.2847f, 21.087f, 16.9918f, 21.38f)
          lineTo(12.7123f, 25.6602f)
          horizontalLineTo(15.3492f)
          curveTo(15.7634f, 25.6602f, 16.0992f, 25.996f, 16.0992f, 26.4102f)
          curveTo(16.0992f, 26.8244f, 15.7634f, 27.1602f, 15.3492f, 27.1602f)
          horizontalLineTo(10.902f)
          curveTo(10.9019f, 27.1602f, 10.9018f, 27.1602f, 10.9017f, 27.1602f)
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
          moveTo(25.0981f, 11.5064f)
          horizontalLineTo(20.6508f)
          curveTo(20.2366f, 11.5064f, 19.9008f, 11.8422f, 19.9008f, 12.2564f)
          curveTo(19.9008f, 12.6706f, 20.2366f, 13.0064f, 20.6508f, 13.0064f)
          horizontalLineTo(23.2877f)
          lineTo(19.0082f, 17.2867f)
          curveTo(18.7153f, 17.5796f, 18.7154f, 18.0545f, 19.0083f, 18.3473f)
          curveTo(19.3012f, 18.6402f, 19.7761f, 18.6401f, 20.069f, 18.3472f)
          lineTo(24.3494f, 14.066f)
          verticalLineTo(16.7059f)
          curveTo(24.3494f, 17.1201f, 24.6852f, 17.4559f, 25.0994f, 17.4559f)
          curveTo(25.5137f, 17.4559f, 25.8494f, 17.1201f, 25.8494f, 16.7059f)
          verticalLineTo(12.2564f)
          curveTo(25.8494f, 11.8422f, 25.5137f, 11.5064f, 25.0994f, 11.5064f)
          horizontalLineTo(25.0981f)
          close()
        }
        path(
          fill = SolidColor(Color.Transparent),
          stroke = SolidColor(TakColors.Sand),
          strokeLineWidth = 1.5f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(6.75f, 7.75f)
          horizontalLineToRelative(22.5f)
          verticalLineToRelative(22.5f)
          horizontalLineToRelative(-22.5f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.FullscreenAlternate)
