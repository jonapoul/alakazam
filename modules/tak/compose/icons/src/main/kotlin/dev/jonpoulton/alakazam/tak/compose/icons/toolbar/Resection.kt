package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.Resection: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Resection",
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
        moveTo(10.1324f, 10.4565f)
        curveTo(12.4774f, 8.3578f, 15.5246f, 7.0284f, 18.8731f, 6.8691f)
        verticalLineTo(8.8557f)
        curveTo(18.8731f, 9.2453f, 19.1894f, 9.5615f, 19.579f, 9.5615f)
        curveTo(19.9686f, 9.5615f, 20.2849f, 9.2453f, 20.2849f, 8.8557f)
        verticalLineTo(6.8716f)
        curveTo(23.6261f, 7.0427f, 26.6647f, 8.3789f, 29.0013f, 10.4808f)
        lineTo(27.5976f, 11.8845f)
        curveTo(27.3219f, 12.1602f, 27.3219f, 12.6063f, 27.5976f, 12.8821f)
        curveTo(27.735f, 13.0205f, 27.9158f, 13.0892f, 28.0965f, 13.0892f)
        curveTo(28.2772f, 13.0892f, 28.4579f, 13.0205f, 28.5953f, 12.8821f)
        lineTo(30.0023f, 11.4751f)
        curveTo(32.127f, 13.8053f, 33.4847f, 16.8464f, 33.6722f, 20.1949f)
        horizontalLineTo(31.624f)
        curveTo(31.2343f, 20.1949f, 30.9181f, 20.5111f, 30.9181f, 20.9007f)
        curveTo(30.9181f, 21.2904f, 31.2343f, 21.6066f, 31.624f, 21.6066f)
        horizontalLineTo(33.6814f)
        curveTo(33.5369f, 24.9818f, 32.2037f, 28.0542f, 30.0909f, 30.415f)
        lineTo(28.5954f, 28.9195f)
        curveTo(28.3196f, 28.6437f, 27.8735f, 28.6437f, 27.5977f, 28.9195f)
        curveTo(27.322f, 29.1952f, 27.322f, 29.6413f, 27.5977f, 29.9171f)
        lineTo(29.0992f, 31.4185f)
        curveTo(26.7498f, 33.5716f, 23.673f, 34.9431f, 20.2849f, 35.1166f)
        verticalLineTo(32.9466f)
        curveTo(20.2849f, 32.5569f, 19.9686f, 32.2407f, 19.579f, 32.2407f)
        curveTo(19.1894f, 32.2407f, 18.8731f, 32.5569f, 18.8731f, 32.9466f)
        verticalLineTo(35.1191f)
        curveTo(15.4777f, 34.9576f, 12.3921f, 33.5929f, 10.0343f, 31.4431f)
        lineTo(11.5603f, 29.9171f)
        curveTo(11.836f, 29.6413f, 11.836f, 29.1952f, 11.5603f, 28.9195f)
        curveTo(11.2845f, 28.6437f, 10.8384f, 28.6437f, 10.5626f, 28.9195f)
        lineTo(9.04f, 30.4421f)
        curveTo(6.9131f, 28.0777f, 5.5703f, 24.9947f, 5.4252f, 21.6066f)
        horizontalLineTo(7.5331f)
        curveTo(7.9227f, 21.6066f, 8.2389f, 21.2904f, 8.2389f, 20.9007f)
        curveTo(8.2389f, 20.5111f, 7.9227f, 20.1949f, 7.5331f, 20.1949f)
        horizontalLineTo(5.4345f)
        curveTo(5.6226f, 16.8335f, 6.9901f, 13.7819f, 9.1289f, 11.4483f)
        lineTo(10.5627f, 12.8821f)
        curveTo(10.7001f, 13.0205f, 10.8808f, 13.0892f, 11.0615f, 13.0892f)
        curveTo(11.2422f, 13.0892f, 11.423f, 13.0205f, 11.5604f, 12.8821f)
        curveTo(11.8361f, 12.6063f, 11.8361f, 12.1602f, 11.5604f, 11.8845f)
        lineTo(10.1324f, 10.4565f)
        close()
        moveTo(4.0004f, 20.9941f)
        curveTo(4.0004f, 29.5701f, 10.9773f, 36.547f, 19.5533f, 36.547f)
        curveTo(28.1293f, 36.547f, 35.1062f, 29.5701f, 35.1062f, 20.9941f)
        curveTo(35.1062f, 12.4181f, 28.1293f, 5.4412f, 19.5533f, 5.4412f)
        curveTo(10.9773f, 5.4412f, 4.0004f, 12.4181f, 4.0004f, 20.9941f)
        close()
        moveTo(19.4383f, 22.3271f)
        curveTo(19.3046f, 22.1294f, 19.0835f, 22.0165f, 18.8538f, 22.0165f)
        curveTo(18.7898f, 22.0165f, 18.7249f, 22.025f, 18.6618f, 22.0429f)
        lineTo(14.6279f, 23.1836f)
        lineTo(21.5381f, 15.3765f)
        lineTo(21.7865f, 25.8f)
        lineTo(19.4383f, 22.3271f)
        close()
        moveTo(21.9663f, 28.584f)
        curveTo(22.099f, 28.7817f, 22.3211f, 28.8946f, 22.5508f, 28.8946f)
        curveTo(22.6223f, 28.8946f, 22.6948f, 28.8833f, 22.7654f, 28.8607f)
        curveTo(23.0646f, 28.7657f, 23.2642f, 28.4843f, 23.2566f, 28.1718f)
        lineTo(22.9065f, 13.5459f)
        curveTo(22.899f, 13.2551f, 22.7155f, 12.9991f, 22.4425f, 12.8993f)
        curveTo(22.1677f, 12.7986f, 21.8637f, 12.8777f, 21.6717f, 13.0951f)
        lineTo(11.9757f, 24.0504f)
        curveTo(11.7686f, 24.2847f, 11.7395f, 24.6283f, 11.907f, 24.8946f)
        curveTo(12.0736f, 25.1581f, 12.3955f, 25.2833f, 12.6966f, 25.1977f)
        lineTo(18.5555f, 23.5403f)
        lineTo(21.9663f, 28.584f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
