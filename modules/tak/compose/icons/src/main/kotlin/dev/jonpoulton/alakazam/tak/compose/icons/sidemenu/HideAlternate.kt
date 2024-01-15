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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.HideAlternate: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "HideAlternate",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
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
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(16.4603f, 20.0997f)
        lineTo(16.4614f, 20.0997f)
        curveTo(16.8756f, 20.0997f, 17.2114f, 20.4355f, 17.2114f, 20.8497f)
        verticalLineTo(25.2991f)
        curveTo(17.2114f, 25.7133f, 16.8756f, 26.0491f, 16.4614f, 26.0491f)
        curveTo(16.0472f, 26.0491f, 15.7114f, 25.7133f, 15.7114f, 25.2991f)
        verticalLineTo(22.6593f)
        lineTo(11.4309f, 26.9405f)
        curveTo(11.138f, 27.2334f, 10.6631f, 27.2334f, 10.3702f, 26.9406f)
        curveTo(10.0773f, 26.6477f, 10.0773f, 26.1728f, 10.3701f, 25.8799f)
        lineTo(14.6496f, 21.5997f)
        horizontalLineTo(12.0127f)
        curveTo(11.5985f, 21.5997f, 11.2627f, 21.2639f, 11.2627f, 20.8497f)
        curveTo(11.2627f, 20.4355f, 11.5985f, 20.0997f, 12.0127f, 20.0997f)
        lineTo(16.4599f, 20.0997f)
        curveTo(16.46f, 20.0997f, 16.4601f, 20.0997f, 16.4603f, 20.0997f)
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
        moveTo(23.9873f, 18.567f)
        curveTo(24.4015f, 18.567f, 24.7373f, 18.2312f, 24.7373f, 17.817f)
        curveTo(24.7373f, 17.4027f, 24.4015f, 17.067f, 23.9873f, 17.067f)
        horizontalLineTo(21.3504f)
        lineTo(25.6299f, 12.7867f)
        curveTo(25.9227f, 12.4938f, 25.9227f, 12.0189f, 25.6298f, 11.726f)
        curveTo(25.3369f, 11.4332f, 24.862f, 11.4332f, 24.5691f, 11.7261f)
        lineTo(20.2886f, 16.0074f)
        verticalLineTo(13.3675f)
        curveTo(20.2886f, 12.9533f, 19.9528f, 12.6175f, 19.5386f, 12.6175f)
        curveTo(19.1244f, 12.6175f, 18.7886f, 12.9533f, 18.7886f, 13.3675f)
        verticalLineTo(17.817f)
        curveTo(18.7886f, 18.2312f, 19.1244f, 18.567f, 19.5386f, 18.567f)
        horizontalLineTo(19.5399f)
        horizontalLineTo(23.9873f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.HideAlternate)
