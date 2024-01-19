package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.RangeAndBearing: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RangeAndBearing",
      defaultWidth = 40.0.dp,
      defaultHeight = 41.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 41.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.2423f, 6.9589f)
        lineTo(13.5502f, 20.4801f)
        lineTo(13.5182f, 20.5704f)
        curveTo(13.3365f, 21.2004f, 14.0261f, 21.7657f, 14.62f, 21.4185f)
        lineTo(19.933f, 18.3119f)
        lineTo(25.2469f, 21.4185f)
        curveTo(25.8692f, 21.7823f, 26.5963f, 21.1445f, 26.3168f, 20.4801f)
        lineTo(20.6247f, 6.9589f)
        curveTo(20.367f, 6.347f, 19.5f, 6.347f, 19.2423f, 6.9589f)
        close()
        moveTo(15.805f, 18.9869f)
        lineTo(19.933f, 9.1819f)
        lineTo(24.061f, 18.9869f)
        lineTo(20.312f, 16.7955f)
        lineTo(20.2087f, 16.7453f)
        curveTo(19.9966f, 16.6616f, 19.7554f, 16.6784f, 19.5549f, 16.7955f)
        lineTo(15.805f, 18.9869f)
        close()
        moveTo(3.7499f, 26.0136f)
        curveTo(4.1296f, 26.0136f, 4.4434f, 26.2958f, 4.493f, 26.6618f)
        lineTo(4.4999f, 26.7636f)
        verticalLineTo(32.5856f)
        horizontalLineTo(6.9327f)
        verticalLineTo(30.0496f)
        curveTo(6.9327f, 29.7088f, 7.2089f, 29.4326f, 7.5497f, 29.4326f)
        curveTo(7.8595f, 29.4326f, 8.1159f, 29.6609f, 8.16f, 29.9584f)
        lineTo(8.1667f, 30.0496f)
        verticalLineTo(32.5856f)
        horizontalLineTo(11.1143f)
        verticalLineTo(30.0496f)
        curveTo(11.1143f, 29.7088f, 11.3905f, 29.4326f, 11.7313f, 29.4326f)
        curveTo(12.0411f, 29.4326f, 12.2975f, 29.6609f, 12.3416f, 29.9584f)
        lineTo(12.3483f, 30.0496f)
        verticalLineTo(32.5856f)
        horizontalLineTo(15.1055f)
        verticalLineTo(30.0496f)
        curveTo(15.1055f, 29.7088f, 15.3817f, 29.4326f, 15.7225f, 29.4326f)
        curveTo(16.0323f, 29.4326f, 16.2887f, 29.6609f, 16.3328f, 29.9584f)
        lineTo(16.3395f, 30.0496f)
        verticalLineTo(32.5856f)
        horizontalLineTo(18.9637f)
        verticalLineTo(26.7636f)
        curveTo(18.9637f, 26.3494f, 19.2995f, 26.0136f, 19.7137f, 26.0136f)
        curveTo(20.0934f, 26.0136f, 20.4072f, 26.2958f, 20.4568f, 26.6618f)
        lineTo(20.4637f, 26.7636f)
        verticalLineTo(32.5856f)
        horizontalLineTo(22.9913f)
        verticalLineTo(30.0496f)
        curveTo(22.9913f, 29.7088f, 23.2675f, 29.4326f, 23.6083f, 29.4326f)
        curveTo(23.9181f, 29.4326f, 24.1745f, 29.6609f, 24.2186f, 29.9584f)
        lineTo(24.2253f, 30.0496f)
        verticalLineTo(32.5856f)
        horizontalLineTo(27.1729f)
        verticalLineTo(30.0496f)
        curveTo(27.1729f, 29.7088f, 27.4491f, 29.4326f, 27.7899f, 29.4326f)
        curveTo(28.0997f, 29.4326f, 28.3561f, 29.6609f, 28.4002f, 29.9584f)
        lineTo(28.4069f, 30.0496f)
        verticalLineTo(32.5856f)
        horizontalLineTo(31.1641f)
        verticalLineTo(30.0496f)
        curveTo(31.1641f, 29.7088f, 31.4403f, 29.4326f, 31.7811f, 29.4326f)
        curveTo(32.0909f, 29.4326f, 32.3473f, 29.6609f, 32.3914f, 29.9584f)
        lineTo(32.3981f, 30.0496f)
        verticalLineTo(32.5856f)
        horizontalLineTo(34.9266f)
        verticalLineTo(26.7636f)
        curveTo(34.9266f, 26.3494f, 35.2624f, 26.0136f, 35.6766f, 26.0136f)
        curveTo(36.0563f, 26.0136f, 36.3701f, 26.2958f, 36.4197f, 26.6618f)
        lineTo(36.4266f, 26.7636f)
        verticalLineTo(33.3143f)
        lineTo(36.4269f, 33.3356f)
        curveTo(36.4269f, 33.7153f, 36.1447f, 34.0291f, 35.7786f, 34.0788f)
        lineTo(35.778f, 34.0788f)
        curveTo(35.745f, 34.0833f, 35.7112f, 34.0856f, 35.6769f, 34.0856f)
        lineTo(35.6769f, 34.0856f)
        lineTo(35.6766f, 34.0856f)
        horizontalLineTo(19.7137f)
        horizontalLineTo(3.7499f)
        curveTo(3.3702f, 34.0856f, 3.0564f, 33.8034f, 3.0067f, 33.4374f)
        curveTo(3.0022f, 33.4041f, 2.9999f, 33.3701f, 2.9999f, 33.3356f)
        verticalLineTo(26.7636f)
        curveTo(2.9999f, 26.3494f, 3.3357f, 26.0136f, 3.7499f, 26.0136f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.RangeAndBearing)
