package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

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
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.DefaultTilt: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "DefaultTilt",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
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
        moveTo(10.4951f, 6.1226f)
        lineTo(8.2998f, 5.5582f)
        curveTo(8.0124f, 5.4836f, 7.8397f, 5.1905f, 7.9128f, 4.9031f)
        curveTo(7.9873f, 4.6157f, 8.2826f, 4.4437f, 8.5679f, 4.5168f)
        lineTo(12.1212f, 5.4299f)
        curveTo(12.3865f, 5.4987f, 12.5541f, 5.7537f, 12.5208f, 6.0185f)
        curveTo(12.5316f, 6.1052f, 12.5215f, 6.1956f, 12.4872f, 6.2825f)
        lineTo(11.0344f, 9.9433f)
        curveTo(10.9506f, 10.1548f, 10.7485f, 10.2831f, 10.5349f, 10.2831f)
        curveTo(10.469f, 10.2831f, 10.4016f, 10.2709f, 10.3371f, 10.2451f)
        curveTo(10.0612f, 10.1354f, 9.9257f, 9.823f, 10.0354f, 9.5477f)
        lineTo(11.0213f, 7.0616f)
        curveTo(8.002f, 8.554f, 6.045f, 11.642f, 6.045f, 15.0846f)
        curveTo(6.045f, 18.9849f, 8.5377f, 22.4085f, 12.2466f, 23.604f)
        curveTo(12.529f, 23.695f, 12.6845f, 23.9982f, 12.5935f, 24.2806f)
        curveTo(12.5197f, 24.5085f, 12.309f, 24.6532f, 12.0818f, 24.6532f)
        curveTo(12.0273f, 24.6532f, 11.9721f, 24.6446f, 11.9169f, 24.6274f)
        curveTo(7.7622f, 23.2879f, 4.97f, 19.4536f, 4.97f, 15.0846f)
        curveTo(4.97f, 11.2477f, 7.1402f, 7.8036f, 10.4951f, 6.1226f)
        close()
        moveTo(19.6281f, 21.2325f)
        lineTo(18.2292f, 23.4309f)
        curveTo(21.6251f, 22.1098f, 23.944f, 18.7698f, 23.944f, 15.085f)
        curveTo(23.944f, 11.2098f, 21.4728f, 7.7933f, 17.7954f, 6.5821f)
        curveTo(17.5137f, 6.4896f, 17.3604f, 6.1858f, 17.4535f, 5.9041f)
        curveTo(17.546f, 5.6217f, 17.847f, 5.4683f, 18.1315f, 5.5615f)
        curveTo(22.2511f, 6.9175f, 25.019f, 10.7447f, 25.019f, 15.085f)
        curveTo(25.019f, 19.3302f, 22.4165f, 23.0347f, 18.4828f, 24.486f)
        lineTo(20.5825f, 25.4765f)
        curveTo(20.8506f, 25.6033f, 20.966f, 25.923f, 20.8398f, 26.1918f)
        curveTo(20.7481f, 26.386f, 20.5539f, 26.4999f, 20.3525f, 26.4999f)
        curveTo(20.2765f, 26.4999f, 20.1977f, 26.4835f, 20.1238f, 26.4483f)
        lineTo(16.8055f, 24.8831f)
        curveTo(16.5577f, 24.7658f, 16.4403f, 24.4836f, 16.5238f, 24.2293f)
        curveTo(16.5296f, 24.1426f, 16.5566f, 24.056f, 16.6065f, 23.9774f)
        lineTo(18.7207f, 20.6548f)
        curveTo(18.8798f, 20.404f, 19.2124f, 20.3302f, 19.4632f, 20.49f)
        curveTo(19.7134f, 20.6498f, 19.7879f, 20.9816f, 19.6281f, 21.2325f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.DefaultTilt)
