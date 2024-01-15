package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RaptorXTakIcons.Cylinder: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Cylinder",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.25f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(15.0f, 7.9335f)
        curveTo(16.8899f, 7.9335f, 18.6189f, 7.7743f, 19.8912f, 7.5091f)
        curveTo(20.5223f, 7.3775f, 21.0743f, 7.2133f, 21.4837f, 7.0115f)
        curveTo(21.6872f, 6.9112f, 21.888f, 6.786f, 22.046f, 6.6251f)
        curveTo(22.206f, 6.4621f, 22.3619f, 6.219f, 22.3619f, 5.9043f)
        curveTo(22.3619f, 5.5895f, 22.206f, 5.3464f, 22.046f, 5.1834f)
        curveTo(21.888f, 5.0225f, 21.6872f, 4.8973f, 21.4837f, 4.797f)
        curveTo(21.0743f, 4.5953f, 20.5223f, 4.431f, 19.8912f, 4.2994f)
        curveTo(18.6189f, 4.0342f, 16.8899f, 3.875f, 15.0f, 3.875f)
        curveTo(13.1101f, 3.875f, 11.3812f, 4.0342f, 10.1088f, 4.2994f)
        curveTo(9.4778f, 4.431f, 8.9257f, 4.5953f, 8.5163f, 4.797f)
        curveTo(8.3128f, 4.8973f, 8.112f, 5.0225f, 7.9541f, 5.1834f)
        curveTo(7.794f, 5.3464f, 7.6382f, 5.5895f, 7.6382f, 5.9043f)
        curveTo(7.6382f, 6.219f, 7.794f, 6.4621f, 7.9541f, 6.6251f)
        curveTo(8.112f, 6.786f, 8.3128f, 6.9112f, 8.5163f, 7.0115f)
        curveTo(8.9257f, 7.2133f, 9.4778f, 7.3775f, 10.1088f, 7.5091f)
        curveTo(11.3812f, 7.7743f, 13.1101f, 7.9335f, 15.0f, 7.9335f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 0.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(21.9869f, 23.6914f)
        curveTo(21.9869f, 23.4821f, 21.8705f, 23.3127f, 21.728f, 23.1852f)
        curveTo(21.5846f, 23.0569f, 21.3881f, 22.9457f, 21.1594f, 22.8478f)
        curveTo(20.7003f, 22.6511f, 20.0552f, 22.4845f, 19.2865f, 22.3544f)
        lineTo(19.2448f, 22.6009f)
        curveTo(18.816f, 22.5283f, 18.3436f, 22.4664f, 17.837f, 22.4173f)
        lineTo(17.8611f, 22.1685f)
        curveTo(16.9903f, 22.0841f, 16.021f, 22.0371f, 15.0f, 22.0371f)
        curveTo(13.9791f, 22.0371f, 13.0098f, 22.0841f, 12.1389f, 22.1685f)
        lineTo(12.1631f, 22.4173f)
        curveTo(11.6565f, 22.4664f, 11.184f, 22.5283f, 10.7552f, 22.6009f)
        lineTo(10.7135f, 22.3544f)
        curveTo(9.9449f, 22.4845f, 9.2998f, 22.6511f, 8.8406f, 22.8478f)
        curveTo(8.612f, 22.9457f, 8.4154f, 23.0569f, 8.272f, 23.1852f)
        curveTo(8.1295f, 23.3127f, 8.0132f, 23.4821f, 8.0132f, 23.6914f)
        curveTo(8.0132f, 23.9006f, 8.1295f, 24.07f, 8.272f, 24.1976f)
        curveTo(8.4154f, 24.3258f, 8.612f, 24.437f, 8.8406f, 24.5349f)
        curveTo(9.2998f, 24.7316f, 9.9449f, 24.8982f, 10.7135f, 25.0284f)
        lineTo(10.7552f, 24.7819f)
        curveTo(11.184f, 24.8545f, 11.6564f, 24.9163f, 12.1631f, 24.9654f)
        lineTo(12.1389f, 25.2142f)
        curveTo(13.0098f, 25.2986f, 13.9791f, 25.3456f, 15.0f, 25.3456f)
        curveTo(16.021f, 25.3456f, 16.9903f, 25.2986f, 17.8611f, 25.2142f)
        lineTo(17.837f, 24.9654f)
        curveTo(18.3436f, 24.9163f, 18.816f, 24.8545f, 19.2448f, 24.7819f)
        lineTo(19.2865f, 25.0284f)
        curveTo(20.0552f, 24.8982f, 20.7003f, 24.7316f, 21.1594f, 24.5349f)
        curveTo(21.3881f, 24.437f, 21.5846f, 24.3258f, 21.728f, 24.1976f)
        curveTo(21.8705f, 24.07f, 21.9869f, 23.9006f, 21.9869f, 23.6914f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(20.7113f, 24.4365f)
        lineTo(20.733f, 24.4293f)
        curveTo(21.3695f, 24.2149f, 21.7368f, 23.9621f, 21.7368f, 23.6914f)
        horizontalLineTo(23.0f)
        curveTo(23.0f, 24.3338f, 22.6829f, 24.7759f, 22.4533f, 25.0098f)
        curveTo(22.2213f, 25.2461f, 21.9507f, 25.4077f, 21.7193f, 25.5218f)
        curveTo(21.2479f, 25.7541f, 20.6444f, 25.9295f, 19.9965f, 26.0646f)
        curveTo(18.6797f, 26.339f, 16.9139f, 26.4999f, 15.0f, 26.4999f)
        curveTo(13.0861f, 26.4999f, 11.3203f, 26.339f, 10.0035f, 26.0646f)
        curveTo(9.3555f, 25.9295f, 8.7521f, 25.7541f, 8.2807f, 25.5218f)
        curveTo(8.0493f, 25.4077f, 7.7786f, 25.2461f, 7.5467f, 25.0098f)
        curveTo(7.3171f, 24.7759f, 7.0f, 24.3338f, 7.0f, 23.6914f)
        horizontalLineTo(8.2632f)
        curveTo(8.2632f, 23.9621f, 8.6305f, 24.2149f, 9.267f, 24.4293f)
        lineTo(9.2886f, 24.4365f)
        curveTo(10.48f, 24.8324f, 12.5925f, 25.0957f, 15.0f, 25.0957f)
        curveTo(17.4075f, 25.0957f, 19.52f, 24.8324f, 20.7113f, 24.4365f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(22.3684f, 5.436f)
        lineTo(22.3684f, 5.436f)
        arcTo(0.6316f, 0.6316f, 0.0f, false, true, 23.0f, 6.0676f)
        lineTo(23.0f, 23.5279f)
        arcTo(0.6316f, 0.6316f, 0.0f, false, true, 22.3684f, 24.1594f)
        lineTo(22.3684f, 24.1594f)
        arcTo(0.6316f, 0.6316f, 0.0f, false, true, 21.7368f, 23.5279f)
        lineTo(21.7368f, 6.0676f)
        arcTo(0.6316f, 0.6316f, 0.0f, false, true, 22.3684f, 5.436f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(7.6316f, 5.436f)
        lineTo(7.6316f, 5.436f)
        arcTo(0.6316f, 0.6316f, 0.0f, false, true, 8.2632f, 6.0676f)
        lineTo(8.2632f, 23.5279f)
        arcTo(0.6316f, 0.6316f, 0.0f, false, true, 7.6316f, 24.1594f)
        lineTo(7.6316f, 24.1594f)
        arcTo(0.6316f, 0.6316f, 0.0f, false, true, 7.0f, 23.5279f)
        lineTo(7.0f, 6.0676f)
        arcTo(0.6316f, 0.6316f, 0.0f, false, true, 7.6316f, 5.436f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.Cylinder)
