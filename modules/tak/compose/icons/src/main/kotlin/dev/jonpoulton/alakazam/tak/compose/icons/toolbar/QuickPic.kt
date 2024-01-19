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

public val ToolbarTakIcons.QuickPic: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "QuickPic",
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
        moveTo(23.2498f, 6.5005f)
        horizontalLineTo(16.2498f)
        curveTo(15.9185f, 6.5005f, 15.6266f, 6.7177f, 15.5314f, 7.035f)
        lineTo(14.1917f, 11.5005f)
        horizontalLineTo(12.5001f)
        verticalLineTo(9.2506f)
        curveTo(12.5001f, 8.8364f, 12.1643f, 8.5006f, 11.7501f, 8.5006f)
        horizontalLineTo(7.7501f)
        curveTo(7.3358f, 8.5006f, 7.0001f, 8.8364f, 7.0001f, 9.2506f)
        verticalLineTo(11.5005f)
        horizontalLineTo(5.7498f)
        lineTo(5.648f, 11.5073f)
        curveTo(5.2819f, 11.557f, 4.9998f, 11.8708f, 4.9998f, 12.2505f)
        verticalLineTo(32.2505f)
        lineTo(5.0066f, 32.3523f)
        curveTo(5.0563f, 32.7183f, 5.3701f, 33.0005f, 5.7498f, 33.0005f)
        horizontalLineTo(24.2908f)
        lineTo(24.3925f, 32.9936f)
        curveTo(24.7586f, 32.944f, 25.0408f, 32.6302f, 25.0408f, 32.2505f)
        lineTo(25.0339f, 32.1487f)
        curveTo(24.9842f, 31.7826f, 24.6705f, 31.5005f, 24.2908f, 31.5005f)
        lineTo(6.4991f, 31.5001f)
        verticalLineTo(13.0001f)
        horizontalLineTo(7.7224f)
        curveTo(7.7316f, 13.0004f, 7.7408f, 13.0006f, 7.7501f, 13.0006f)
        horizontalLineTo(11.7501f)
        curveTo(11.7593f, 13.0006f, 11.7685f, 13.0004f, 11.7777f, 13.0001f)
        horizontalLineTo(14.7248f)
        curveTo(14.7331f, 13.0004f, 14.7414f, 13.0005f, 14.7498f, 13.0005f)
        horizontalLineTo(24.7498f)
        curveTo(24.7581f, 13.0005f, 24.7664f, 13.0004f, 24.7747f, 13.0001f)
        horizontalLineTo(32.9991f)
        lineTo(32.9998f, 22.7615f)
        lineTo(33.0066f, 22.8633f)
        curveTo(33.0563f, 23.2293f, 33.3701f, 23.5115f, 33.7498f, 23.5115f)
        curveTo(34.164f, 23.5115f, 34.4998f, 23.1757f, 34.4998f, 22.7615f)
        verticalLineTo(12.2505f)
        lineTo(34.4929f, 12.1487f)
        curveTo(34.4432f, 11.7826f, 34.1295f, 11.5005f, 33.7498f, 11.5005f)
        horizontalLineTo(25.3078f)
        lineTo(23.9681f, 7.035f)
        curveTo(23.873f, 6.7177f, 23.581f, 6.5005f, 23.2498f, 6.5005f)
        close()
        moveTo(22.6911f, 8.0001f)
        lineTo(23.7411f, 11.5001f)
        horizontalLineTo(15.7581f)
        lineTo(16.8081f, 8.0001f)
        horizontalLineTo(22.6911f)
        close()
        moveTo(19.7498f, 15.5005f)
        curveTo(16.0222f, 15.5005f, 12.9998f, 18.5226f, 12.9998f, 22.2505f)
        curveTo(12.9998f, 25.9777f, 16.0225f, 29.0005f, 19.7498f, 29.0005f)
        curveTo(23.4776f, 29.0005f, 26.4998f, 25.978f, 26.4998f, 22.2505f)
        curveTo(26.4998f, 18.5223f, 23.478f, 15.5005f, 19.7498f, 15.5005f)
        close()
        moveTo(19.7498f, 17.0005f)
        curveTo(22.6495f, 17.0005f, 24.9998f, 19.3507f, 24.9998f, 22.2505f)
        curveTo(24.9998f, 25.1496f, 22.6492f, 27.5005f, 19.7498f, 27.5005f)
        curveTo(16.851f, 27.5005f, 14.4998f, 25.1493f, 14.4998f, 22.2505f)
        curveTo(14.4998f, 19.3511f, 16.8506f, 17.0005f, 19.7498f, 17.0005f)
        close()
        moveTo(26.8505f, 16.8245f)
        curveTo(26.8505f, 15.541f, 27.8915f, 14.5005f, 29.1755f, 14.5005f)
        curveTo(30.4587f, 14.5005f, 31.4995f, 15.5413f, 31.4995f, 16.8245f)
        curveTo(31.4995f, 18.1085f, 30.4589f, 19.1495f, 29.1755f, 19.1495f)
        curveTo(27.8912f, 19.1495f, 26.8505f, 18.1087f, 26.8505f, 16.8245f)
        close()
        moveTo(29.9995f, 16.8245f)
        curveTo(29.9995f, 16.3697f, 29.6302f, 16.0005f, 29.1755f, 16.0005f)
        curveTo(28.7198f, 16.0005f, 28.3505f, 16.3696f, 28.3505f, 16.8245f)
        curveTo(28.3505f, 17.2803f, 28.7197f, 17.6495f, 29.1755f, 17.6495f)
        curveTo(29.6303f, 17.6495f, 29.9995f, 17.2802f, 29.9995f, 16.8245f)
        close()
        moveTo(9.9929f, 15.6487f)
        curveTo(9.9432f, 15.2826f, 9.6294f, 15.0005f, 9.2498f, 15.0005f)
        curveTo(8.8355f, 15.0005f, 8.4998f, 15.3363f, 8.4998f, 15.7505f)
        verticalLineTo(28.7505f)
        lineTo(8.5066f, 28.8523f)
        curveTo(8.5563f, 29.2183f, 8.8701f, 29.5005f, 9.2498f, 29.5005f)
        curveTo(9.664f, 29.5005f, 9.9998f, 29.1647f, 9.9998f, 28.7505f)
        verticalLineTo(15.7505f)
        lineTo(9.9929f, 15.6487f)
        close()
        moveTo(16.9998f, 22.2505f)
        curveTo(16.9998f, 20.7316f, 18.2313f, 19.5005f, 19.7498f, 19.5005f)
        curveTo(21.2683f, 19.5005f, 22.4998f, 20.7316f, 22.4998f, 22.2505f)
        curveTo(22.4998f, 23.7687f, 21.268f, 25.0005f, 19.7498f, 25.0005f)
        curveTo(18.2315f, 25.0005f, 16.9998f, 23.7687f, 16.9998f, 22.2505f)
        close()
        moveTo(20.9998f, 22.2505f)
        curveTo(20.9998f, 21.5601f, 20.4399f, 21.0005f, 19.7498f, 21.0005f)
        curveTo(19.0596f, 21.0005f, 18.4998f, 21.5601f, 18.4998f, 22.2505f)
        curveTo(18.4998f, 22.9403f, 19.06f, 23.5005f, 19.7498f, 23.5005f)
        curveTo(20.4395f, 23.5005f, 20.9998f, 22.9403f, 20.9998f, 22.2505f)
        close()
        moveTo(11.0001f, 11.5001f)
        verticalLineTo(10.0001f)
        horizontalLineTo(8.5001f)
        verticalLineTo(11.5001f)
        horizontalLineTo(11.0001f)
        close()
        moveTo(21.9998f, 9.7505f)
        curveTo(21.9998f, 9.3363f, 21.664f, 9.0005f, 21.2498f, 9.0005f)
        horizontalLineTo(18.2498f)
        lineTo(18.148f, 9.0073f)
        curveTo(17.7819f, 9.057f, 17.4998f, 9.3708f, 17.4998f, 9.7505f)
        curveTo(17.4998f, 10.1647f, 17.8355f, 10.5005f, 18.2498f, 10.5005f)
        horizontalLineTo(21.2498f)
        lineTo(21.3515f, 10.4936f)
        curveTo(21.7176f, 10.444f, 21.9998f, 10.1302f, 21.9998f, 9.7505f)
        close()
        moveTo(31.3367f, 25.7612f)
        curveTo(31.7164f, 25.7612f, 32.0301f, 26.0433f, 32.0798f, 26.4094f)
        lineTo(32.0867f, 26.5112f)
        verticalLineTo(29.4976f)
        horizontalLineTo(35.072f)
        curveTo(35.4862f, 29.4976f, 35.822f, 29.8334f, 35.822f, 30.2476f)
        curveTo(35.822f, 30.6273f, 35.5398f, 30.9411f, 35.1737f, 30.9907f)
        lineTo(35.072f, 30.9976f)
        horizontalLineTo(32.0867f)
        verticalLineTo(33.9842f)
        curveTo(32.0867f, 34.3984f, 31.7509f, 34.7342f, 31.3367f, 34.7342f)
        curveTo(30.957f, 34.7342f, 30.6432f, 34.452f, 30.5935f, 34.086f)
        lineTo(30.5867f, 33.9842f)
        verticalLineTo(30.9976f)
        horizontalLineTo(27.6f)
        curveTo(27.1857f, 30.9976f, 26.85f, 30.6618f, 26.85f, 30.2476f)
        curveTo(26.85f, 29.8679f, 27.1321f, 29.5541f, 27.4982f, 29.5044f)
        lineTo(27.6f, 29.4976f)
        horizontalLineTo(30.5867f)
        verticalLineTo(26.5112f)
        curveTo(30.5867f, 26.097f, 30.9224f, 25.7612f, 31.3367f, 25.7612f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.QuickPic)
