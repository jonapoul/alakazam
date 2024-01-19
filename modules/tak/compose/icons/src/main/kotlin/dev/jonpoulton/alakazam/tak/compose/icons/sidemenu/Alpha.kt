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

public val SideMenuTakIcons.Alpha: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Alpha",
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
        moveTo(17.178f, 14.872f)
        curveTo(17.262f, 15.0493f, 17.304f, 15.222f, 17.304f, 15.39f)
        curveTo(17.304f, 15.698f, 17.178f, 15.9593f, 16.926f, 16.174f)
        curveTo(16.6833f, 16.3886f, 16.4033f, 16.496f, 16.086f, 16.496f)
        curveTo(15.8713f, 16.496f, 15.6753f, 16.44f, 15.498f, 16.328f)
        curveTo(15.3207f, 16.216f, 15.1807f, 16.048f, 15.078f, 15.824f)
        lineTo(14.448f, 14.41f)
        horizontalLineTo(9.912f)
        lineTo(9.268f, 15.824f)
        curveTo(9.1653f, 16.048f, 9.0207f, 16.216f, 8.834f, 16.328f)
        curveTo(8.6567f, 16.44f, 8.4607f, 16.496f, 8.246f, 16.496f)
        curveTo(7.9287f, 16.496f, 7.6393f, 16.3886f, 7.378f, 16.174f)
        curveTo(7.126f, 15.9593f, 7f, 15.698f, 7f, 15.39f)
        curveTo(7f, 15.222f, 7.042f, 15.0493f, 7.126f, 14.872f)
        lineTo(10.822f, 7.284f)
        curveTo(10.9433f, 7.032f, 11.1207f, 6.8406f, 11.354f, 6.71f)
        curveTo(11.5967f, 6.57f, 11.8627f, 6.5f, 12.152f, 6.5f)
        curveTo(12.432f, 6.5f, 12.6933f, 6.57f, 12.936f, 6.71f)
        curveTo(13.1787f, 6.8406f, 13.3607f, 7.032f, 13.482f, 7.284f)
        lineTo(17.178f, 14.872f)
        close()
        moveTo(10.78f, 12.478f)
        horizontalLineTo(13.58f)
        lineTo(12.18f, 9.356f)
        lineTo(10.78f, 12.478f)
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
        moveTo(14.72f, 28.354f)
        curveTo(15.1307f, 28.354f, 15.434f, 28.4333f, 15.63f, 28.592f)
        curveTo(15.8353f, 28.7507f, 15.938f, 29.0027f, 15.938f, 29.348f)
        curveTo(15.938f, 29.7027f, 15.84f, 29.964f, 15.644f, 30.132f)
        curveTo(15.448f, 30.2907f, 15.14f, 30.37f, 14.72f, 30.37f)
        horizontalLineTo(9.12f)
        curveTo(8.7747f, 30.37f, 8.4993f, 30.2673f, 8.294f, 30.062f)
        curveTo(8.098f, 29.8567f, 8f, 29.6f, 8f, 29.292f)
        curveTo(8f, 28.984f, 8.1073f, 28.6807f, 8.322f, 28.382f)
        lineTo(12.634f, 22.516f)
        horizontalLineTo(9.246f)
        curveTo(8.826f, 22.516f, 8.5133f, 22.4367f, 8.308f, 22.278f)
        curveTo(8.112f, 22.11f, 8.014f, 21.858f, 8.014f, 21.522f)
        curveTo(8.014f, 21.1673f, 8.112f, 20.9107f, 8.308f, 20.752f)
        curveTo(8.5133f, 20.584f, 8.826f, 20.5f, 9.246f, 20.5f)
        horizontalLineTo(14.622f)
        curveTo(14.958f, 20.5f, 15.224f, 20.6027f, 15.42f, 20.808f)
        curveTo(15.6253f, 21.004f, 15.728f, 21.256f, 15.728f, 21.564f)
        curveTo(15.728f, 21.8813f, 15.6207f, 22.1893f, 15.406f, 22.488f)
        lineTo(11.094f, 28.354f)
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
        moveTo(29.9652f, 24.463f)
        curveTo(30.0267f, 24.6112f, 30.0054f, 24.7853f, 29.9112f, 24.9096f)
        lineTo(25.7863f, 30.3517f)
        curveTo(25.7147f, 30.4459f, 25.6101f, 30.5f, 25.4999f, 30.5f)
        curveTo(25.3897f, 30.5f, 25.285f, 30.446f, 25.2134f, 30.3518f)
        lineTo(21.0885f, 24.9097f)
        curveTo(21.0304f, 24.8326f, 21f, 24.7364f, 21f, 24.6392f)
        curveTo(21f, 24.5793f, 21.0112f, 24.5195f, 21.0349f, 24.463f)
        curveTo(21.0964f, 24.3152f, 21.2288f, 24.2206f, 21.375f, 24.2206f)
        lineTo(23.5781f, 24.2196f)
        lineTo(23.5772f, 7.7559f)
        curveTo(23.5772f, 7.0166f, 24.5165f, 6.4246f, 25.6221f, 6.5078f)
        lineTo(25.7811f, 6.5243f)
        curveTo(26.6533f, 6.6398f, 27.2524f, 7.1979f, 27.2524f, 7.8053f)
        lineTo(27.2532f, 24.2196f)
        lineTo(29.6248f, 24.2206f)
        curveTo(29.7466f, 24.2206f, 29.8589f, 24.2863f, 29.9287f, 24.3937f)
        lineTo(29.9652f, 24.463f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Alpha)
