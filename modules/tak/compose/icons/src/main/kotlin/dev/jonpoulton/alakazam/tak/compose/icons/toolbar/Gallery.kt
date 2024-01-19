package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val ToolbarTakIcons.Gallery: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Gallery",
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
        pathFillType = NonZero,
      ) {
        moveTo(33.8564f, 10.4568f)
        curveTo(34.2239f, 10.4568f, 34.5276f, 10.7298f, 34.5756f, 11.0841f)
        lineTo(34.5823f, 11.1826f)
        verticalLineTo(34.0406f)
        curveTo(34.5823f, 34.4081f, 34.3092f, 34.7118f, 33.9549f, 34.7598f)
        lineTo(33.8564f, 34.7665f)
        horizontalLineTo(10.9993f)
        curveTo(10.6319f, 34.7665f, 10.3282f, 34.4934f, 10.2802f, 34.1391f)
        lineTo(10.2735f, 34.0406f)
        verticalLineTo(11.1826f)
        curveTo(10.2735f, 10.8151f, 10.5466f, 10.5115f, 10.9009f, 10.4634f)
        lineTo(10.9993f, 10.4568f)
        horizontalLineTo(33.8564f)
        close()
        moveTo(17.1466f, 19.9414f)
        lineTo(11.7241f, 25.283f)
        lineTo(11.7244f, 33.3146f)
        horizontalLineTo(33.1299f)
        lineTo(33.1291f, 26.346f)
        lineTo(28.5205f, 22.5146f)
        lineTo(24.3141f, 25.122f)
        lineTo(26.4348f, 27.2653f)
        curveTo(26.7167f, 27.5502f, 26.7143f, 28.0098f, 26.4293f, 28.2917f)
        curveTo(26.1703f, 28.548f, 25.7669f, 28.5693f, 25.4839f, 28.357f)
        lineTo(25.4029f, 28.2863f)
        lineTo(17.1466f, 19.9414f)
        close()
        moveTo(28.583f, 5.5f)
        curveTo(28.9505f, 5.5f, 29.2541f, 5.773f, 29.3022f, 6.1273f)
        lineTo(29.3088f, 6.2258f)
        verticalLineTo(8.9181f)
        curveTo(29.3088f, 9.3189f, 28.9839f, 9.6439f, 28.583f, 9.6439f)
        curveTo(28.2156f, 9.6439f, 27.9119f, 9.3708f, 27.8638f, 9.0166f)
        lineTo(27.8572f, 8.9181f)
        lineTo(27.8566f, 6.9514f)
        horizontalLineTo(6.4511f)
        verticalLineTo(28.3579f)
        lineTo(8.5788f, 28.3581f)
        curveTo(8.9463f, 28.3581f, 9.25f, 28.6311f, 9.298f, 28.9854f)
        lineTo(9.3046f, 29.0839f)
        curveTo(9.3046f, 29.4513f, 9.0316f, 29.755f, 8.6773f, 29.8031f)
        lineTo(8.5788f, 29.8097f)
        horizontalLineTo(5.7259f)
        curveTo(5.3585f, 29.8097f, 5.0548f, 29.5366f, 5.0068f, 29.1824f)
        lineTo(5.0001f, 29.0839f)
        verticalLineTo(6.2258f)
        curveTo(5.0001f, 5.8584f, 5.2732f, 5.5547f, 5.6274f, 5.5066f)
        lineTo(5.7259f, 5.5f)
        horizontalLineTo(28.583f)
        close()
        moveTo(33.1299f, 11.9082f)
        horizontalLineTo(11.7244f)
        lineTo(11.7241f, 23.245f)
        lineTo(16.6447f, 18.4f)
        curveTo(16.9039f, 18.1447f, 17.3065f, 18.1239f, 17.589f, 18.336f)
        lineTo(17.6699f, 18.4066f)
        lineTo(23.2671f, 24.064f)
        lineTo(28.2009f, 21.0064f)
        curveTo(28.4331f, 20.8625f, 28.7231f, 20.8626f, 28.9528f, 20.9986f)
        lineTo(29.0472f, 21.0652f)
        lineTo(33.1291f, 24.459f)
        lineTo(33.1299f, 11.9082f)
        close()
        moveTo(25.0654f, 13.3419f)
        curveTo(26.7591f, 13.3419f, 28.1322f, 14.7149f, 28.1322f, 16.4087f)
        curveTo(28.1322f, 18.1017f, 26.7589f, 19.4745f, 25.0654f, 19.4745f)
        curveTo(23.3726f, 19.4745f, 21.9996f, 18.1015f, 21.9996f, 16.4087f)
        curveTo(21.9996f, 14.7151f, 23.3724f, 13.3419f, 25.0654f, 13.3419f)
        close()
        moveTo(25.0654f, 14.7935f)
        curveTo(24.1742f, 14.7935f, 23.4512f, 15.5167f, 23.4512f, 16.4087f)
        curveTo(23.4512f, 17.2998f, 24.1743f, 18.0229f, 25.0654f, 18.0229f)
        curveTo(25.9573f, 18.0229f, 26.6805f, 17.2999f, 26.6805f, 16.4087f)
        curveTo(26.6805f, 15.5166f, 25.9574f, 14.7935f, 25.0654f, 14.7935f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Gallery)
