package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.AlphaReverse: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "AlphaReverse",
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
        moveTo(17.178f, 28.372f)
        curveTo(17.262f, 28.5493f, 17.304f, 28.722f, 17.304f, 28.89f)
        curveTo(17.304f, 29.198f, 17.178f, 29.4593f, 16.926f, 29.674f)
        curveTo(16.6833f, 29.8887f, 16.4033f, 29.996f, 16.086f, 29.996f)
        curveTo(15.8713f, 29.996f, 15.6753f, 29.94f, 15.498f, 29.828f)
        curveTo(15.3207f, 29.716f, 15.1807f, 29.548f, 15.078f, 29.324f)
        lineTo(14.448f, 27.91f)
        horizontalLineTo(9.912f)
        lineTo(9.268f, 29.324f)
        curveTo(9.1653f, 29.548f, 9.0207f, 29.716f, 8.834f, 29.828f)
        curveTo(8.6567f, 29.94f, 8.4607f, 29.996f, 8.246f, 29.996f)
        curveTo(7.9287f, 29.996f, 7.6393f, 29.8887f, 7.378f, 29.674f)
        curveTo(7.126f, 29.4593f, 7f, 29.198f, 7f, 28.89f)
        curveTo(7f, 28.722f, 7.042f, 28.5493f, 7.126f, 28.372f)
        lineTo(10.822f, 20.784f)
        curveTo(10.9433f, 20.532f, 11.1207f, 20.3407f, 11.354f, 20.21f)
        curveTo(11.5967f, 20.07f, 11.8627f, 20f, 12.152f, 20f)
        curveTo(12.432f, 20f, 12.6933f, 20.07f, 12.936f, 20.21f)
        curveTo(13.1787f, 20.3407f, 13.3607f, 20.532f, 13.482f, 20.784f)
        lineTo(17.178f, 28.372f)
        close()
        moveTo(10.78f, 25.978f)
        horizontalLineTo(13.58f)
        lineTo(12.18f, 22.856f)
        lineTo(10.78f, 25.978f)
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
        moveTo(14.72f, 13.854f)
        curveTo(15.1307f, 13.854f, 15.434f, 13.9333f, 15.63f, 14.092f)
        curveTo(15.8353f, 14.2507f, 15.938f, 14.5027f, 15.938f, 14.848f)
        curveTo(15.938f, 15.2027f, 15.84f, 15.464f, 15.644f, 15.632f)
        curveTo(15.448f, 15.7907f, 15.14f, 15.87f, 14.72f, 15.87f)
        horizontalLineTo(9.12f)
        curveTo(8.7747f, 15.87f, 8.4993f, 15.7673f, 8.294f, 15.562f)
        curveTo(8.098f, 15.3567f, 8f, 15.1f, 8f, 14.792f)
        curveTo(8f, 14.484f, 8.1073f, 14.1807f, 8.322f, 13.882f)
        lineTo(12.634f, 8.016f)
        horizontalLineTo(9.246f)
        curveTo(8.826f, 8.016f, 8.5133f, 7.9367f, 8.308f, 7.778f)
        curveTo(8.112f, 7.61f, 8.014f, 7.358f, 8.014f, 7.022f)
        curveTo(8.014f, 6.6673f, 8.112f, 6.4107f, 8.308f, 6.252f)
        curveTo(8.5133f, 6.084f, 8.826f, 6f, 9.246f, 6f)
        horizontalLineTo(14.622f)
        curveTo(14.958f, 6f, 15.224f, 6.1027f, 15.42f, 6.308f)
        curveTo(15.6253f, 6.504f, 15.728f, 6.756f, 15.728f, 7.064f)
        curveTo(15.728f, 7.3813f, 15.6207f, 7.6893f, 15.406f, 7.988f)
        lineTo(11.094f, 13.854f)
        horizontalLineTo(14.72f)
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
        moveTo(29.9652f, 12.537f)
        curveTo(30.0267f, 12.3888f, 30.0054f, 12.2146f, 29.9112f, 12.0903f)
        lineTo(25.7863f, 6.6483f)
        curveTo(25.7147f, 6.5541f, 25.6101f, 6.5f, 25.4999f, 6.5f)
        curveTo(25.3897f, 6.5f, 25.285f, 6.554f, 25.2134f, 6.6482f)
        lineTo(21.0885f, 12.0903f)
        curveTo(21.0304f, 12.1673f, 21f, 12.2636f, 21f, 12.3607f)
        curveTo(21f, 12.4206f, 21.0112f, 12.4805f, 21.0349f, 12.537f)
        curveTo(21.0964f, 12.6847f, 21.2288f, 12.7794f, 21.375f, 12.7794f)
        lineTo(23.5781f, 12.7803f)
        lineTo(23.5772f, 29.2441f)
        curveTo(23.5772f, 29.9833f, 24.5165f, 30.5753f, 25.6221f, 30.4922f)
        lineTo(25.7811f, 30.4757f)
        curveTo(26.6533f, 30.3601f, 27.2524f, 29.8021f, 27.2524f, 29.1947f)
        lineTo(27.2532f, 12.7803f)
        lineTo(29.6248f, 12.7794f)
        curveTo(29.7466f, 12.7794f, 29.8589f, 12.7137f, 29.9287f, 12.6062f)
        lineTo(29.9652f, 12.537f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.AlphaReverse)
