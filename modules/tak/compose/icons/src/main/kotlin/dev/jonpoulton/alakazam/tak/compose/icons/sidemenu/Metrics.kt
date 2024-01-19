package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val SideMenuTakIcons.Metrics: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Metrics",
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
        moveTo(18f, 11f)
        curveTo(11.3726f, 11f, 6f, 16.0565f, 6f, 22.2941f)
        curveTo(6f, 23.101f, 6.0899f, 23.8882f, 6.2608f, 24.6472f)
        curveTo(6.5968f, 26.1392f, 8.0583f, 27f, 9.5878f, 27f)
        horizontalLineTo(26.4123f)
        curveTo(27.9417f, 27f, 29.4032f, 26.1392f, 29.7392f, 24.6472f)
        curveTo(29.9101f, 23.8882f, 30f, 23.101f, 30f, 22.2941f)
        curveTo(30f, 16.0565f, 24.6274f, 11f, 18f, 11f)
        close()
        moveTo(20.7107f, 18.3318f)
        curveTo(20.3735f, 18.1485f, 19.9373f, 18.2652f, 19.7366f, 18.5924f)
        lineTo(18.0834f, 21.2874f)
        curveTo(17.3579f, 21.2533f, 16.6382f, 21.5937f, 16.25f, 22.2266f)
        curveTo(15.6977f, 23.1269f, 16.0255f, 24.2781f, 16.9821f, 24.7979f)
        curveTo(17.9386f, 25.3177f, 19.1618f, 25.0092f, 19.7141f, 24.1089f)
        curveTo(20.1802f, 23.3491f, 20.0195f, 22.4105f, 19.3829f, 21.8236f)
        lineTo(20.958f, 19.2561f)
        curveTo(21.1587f, 18.9289f, 21.048f, 18.5151f, 20.7107f, 18.3318f)
        close()
        moveTo(17.995f, 12f)
        curveTo(17.6112f, 12f, 17.3f, 12.3112f, 17.3f, 12.695f)
        verticalLineTo(14.095f)
        curveTo(17.3f, 14.4788f, 17.6112f, 14.79f, 17.995f, 14.79f)
        curveTo(18.3789f, 14.79f, 18.69f, 14.4788f, 18.69f, 14.095f)
        verticalLineTo(12.695f)
        curveTo(18.69f, 12.3112f, 18.3789f, 12f, 17.995f, 12f)
        close()
        moveTo(22.621f, 14.0385f)
        curveTo(22.8133f, 13.7053f, 23.2393f, 13.5912f, 23.5725f, 13.7835f)
        curveTo(23.9056f, 13.9759f, 24.0198f, 14.4019f, 23.8274f, 14.735f)
        lineTo(23.1309f, 15.9414f)
        curveTo(22.9385f, 16.2746f, 22.5125f, 16.3887f, 22.1794f, 16.1964f)
        curveTo(21.8462f, 16.0041f, 21.7321f, 15.5781f, 21.9244f, 15.2449f)
        lineTo(22.621f, 14.0385f)
        close()
        moveTo(12.4277f, 13.7835f)
        curveTo(12.0945f, 13.9758f, 11.9804f, 14.4018f, 12.1727f, 14.735f)
        lineTo(12.8693f, 15.9414f)
        curveTo(13.0616f, 16.2746f, 13.4876f, 16.3887f, 13.8208f, 16.1964f)
        curveTo(14.1539f, 16.004f, 14.2681f, 15.578f, 14.0757f, 15.2449f)
        lineTo(13.3792f, 14.0385f)
        curveTo(13.1868f, 13.7053f, 12.7608f, 13.5912f, 12.4277f, 13.7835f)
        close()
        moveTo(8.6035f, 18.8142f)
        curveTo(8.2703f, 18.6219f, 8.1562f, 18.1959f, 8.3485f, 17.8627f)
        curveTo(8.5409f, 17.5296f, 8.9669f, 17.4154f, 9.3f, 17.6078f)
        lineTo(10.5064f, 18.3043f)
        curveTo(10.8396f, 18.4967f, 10.9537f, 18.9227f, 10.7614f, 19.2558f)
        curveTo(10.5691f, 19.589f, 10.1431f, 19.7031f, 9.8099f, 19.5108f)
        lineTo(8.6035f, 18.8142f)
        close()
        moveTo(27.6517f, 17.8627f)
        curveTo(27.4594f, 17.5295f, 27.0334f, 17.4154f, 26.7002f, 17.6077f)
        lineTo(25.4938f, 18.3043f)
        curveTo(25.1607f, 18.4966f, 25.0465f, 18.9226f, 25.2389f, 19.2558f)
        curveTo(25.4312f, 19.5889f, 25.8572f, 19.7031f, 26.1903f, 19.5107f)
        lineTo(27.3968f, 18.8142f)
        curveTo(27.7299f, 18.6218f, 27.8441f, 18.1958f, 27.6517f, 17.8627f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Metrics)
