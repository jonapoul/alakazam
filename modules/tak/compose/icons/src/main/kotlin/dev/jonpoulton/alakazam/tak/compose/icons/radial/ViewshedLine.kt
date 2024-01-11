package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

val RadialTakIcons.ViewshedLine: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "ViewshedLine",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(15.3336f, 20.3876f)
        lineTo(19.7042f, 16.017f)
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.5819f, 8.8077f)
        curveTo(21.0632f, 7.6803f, 22.639f, 7f, 24.25f, 7f)
        curveTo(25.861f, 7f, 27.4368f, 7.6803f, 28.9181f, 8.8077f)
        curveTo(29.4316f, 9.1986f, 29.8972f, 9.6168f, 30.3072f, 10.0353f)
        curveTo(30.4511f, 10.1821f, 30.5779f, 10.3187f, 30.6867f, 10.4418f)
        curveTo(30.7265f, 10.4867f, 30.759f, 10.5244f, 30.7841f, 10.5539f)
        lineTo(31f, 10.8184f)
        lineTo(30.8241f, 11.0348f)
        curveTo(30.8091f, 11.0533f, 30.7865f, 11.0803f, 30.7565f, 11.1151f)
        lineTo(30.6017f, 11.2898f)
        curveTo(30.5134f, 11.387f, 30.4151f, 11.4914f, 30.3072f, 11.6015f)
        curveTo(29.8972f, 12.0199f, 29.4315f, 12.4381f, 28.918f, 12.8288f)
        curveTo(27.4368f, 13.9561f, 25.861f, 14.6363f, 24.25f, 14.6363f)
        curveTo(22.639f, 14.6363f, 21.0632f, 13.9561f, 19.582f, 12.8288f)
        curveTo(19.0685f, 12.4381f, 18.6028f, 12.0199f, 18.1928f, 11.6015f)
        curveTo(18.0489f, 11.4547f, 17.9221f, 11.318f, 17.8133f, 11.195f)
        curveTo(17.7735f, 11.15f, 17.741f, 11.1124f, 17.716f, 11.0829f)
        lineTo(17.5f, 10.8184f)
        lineTo(17.7159f, 10.5539f)
        lineTo(17.8982f, 10.347f)
        curveTo(17.9866f, 10.2498f, 18.0849f, 10.1454f, 18.1928f, 10.0353f)
        curveTo(18.6028f, 9.6168f, 19.0684f, 9.1986f, 19.5819f, 8.8077f)
        close()
        moveTo(28.5025f, 9.3538f)
        curveTo(27.13f, 8.3091f, 25.6871f, 7.6862f, 24.25f, 7.6862f)
        curveTo(22.8129f, 7.6862f, 21.3701f, 8.3091f, 19.9975f, 9.3538f)
        curveTo(19.5122f, 9.7232f, 19.0709f, 10.1195f, 18.6829f, 10.5155f)
        curveTo(18.6152f, 10.5846f, 18.5516f, 10.6512f, 18.4923f, 10.7148f)
        lineTo(18.3967f, 10.8181f)
        lineTo(18.463f, 10.8904f)
        lineTo(18.5844f, 11.0195f)
        lineTo(18.6829f, 11.1212f)
        curveTo(19.0709f, 11.5172f, 19.5122f, 11.9135f, 19.9975f, 12.2828f)
        curveTo(21.37f, 13.3273f, 22.8129f, 13.9502f, 24.25f, 13.9502f)
        curveTo(25.6871f, 13.9502f, 27.13f, 13.3273f, 28.5025f, 12.2828f)
        curveTo(28.9878f, 11.9135f, 29.4291f, 11.5172f, 29.8171f, 11.1212f)
        curveTo(29.851f, 11.0867f, 29.8838f, 11.0527f, 29.9156f, 11.0195f)
        lineTo(30.103f, 10.8181f)
        lineTo(29.9155f, 10.6172f)
        lineTo(29.8171f, 10.5155f)
        curveTo(29.4291f, 10.1195f, 28.9878f, 9.7232f, 28.5025f, 9.3538f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(21.2478f, 10.7929f)
        curveTo(21.2478f, 9.2186f, 22.5245f, 7.942f, 24.0991f, 7.942f)
        curveTo(25.6737f, 7.942f, 26.95f, 9.2186f, 26.95f, 10.7929f)
        curveTo(26.95f, 12.3676f, 25.6738f, 13.6438f, 24.0991f, 13.6438f)
        curveTo(22.5244f, 13.6438f, 21.2478f, 12.3675f, 21.2478f, 10.7929f)
        close()
        moveTo(26.2638f, 10.7929f)
        curveTo(26.2638f, 9.5975f, 25.2947f, 8.6282f, 24.0991f, 8.6282f)
        curveTo(22.9035f, 8.6282f, 21.934f, 9.5976f, 21.934f, 10.7929f)
        curveTo(21.934f, 11.9885f, 22.9033f, 12.9576f, 24.0991f, 12.9576f)
        curveTo(25.2948f, 12.9576f, 26.2638f, 11.9886f, 26.2638f, 10.7929f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(23.4447f, 9.8722f)
        curveTo(23.4447f, 9.0854f, 24.0822f, 8.4481f, 24.8688f, 8.4481f)
        curveTo(25.6554f, 8.4481f, 26.2928f, 9.0854f, 26.2928f, 9.8722f)
        curveTo(26.2928f, 10.6586f, 25.6553f, 11.2958f, 24.8688f, 11.2958f)
        curveTo(24.0823f, 11.2958f, 23.4447f, 10.6586f, 23.4447f, 9.8722f)
        close()
        moveTo(25.6067f, 9.8722f)
        curveTo(25.6067f, 9.4644f, 25.2764f, 9.1343f, 24.8688f, 9.1343f)
        curveTo(24.4611f, 9.1343f, 24.1309f, 9.4644f, 24.1309f, 9.8722f)
        curveTo(24.1309f, 10.2796f, 24.4611f, 10.6096f, 24.8688f, 10.6096f)
        curveTo(25.2764f, 10.6096f, 25.6067f, 10.2796f, 25.6067f, 9.8722f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(6.0819f, 23.1515f)
        curveTo(7.5632f, 22.0241f, 9.139f, 21.3438f, 10.75f, 21.3438f)
        curveTo(12.361f, 21.3438f, 13.9368f, 22.0241f, 15.4181f, 23.1515f)
        curveTo(15.9316f, 23.5423f, 16.3972f, 23.9605f, 16.8072f, 24.379f)
        curveTo(16.9511f, 24.5259f, 17.0779f, 24.6625f, 17.1867f, 24.7855f)
        curveTo(17.2265f, 24.8305f, 17.259f, 24.8681f, 17.2841f, 24.8977f)
        lineTo(17.5f, 25.1622f)
        lineTo(17.3241f, 25.3785f)
        curveTo(17.3091f, 25.397f, 17.2865f, 25.424f, 17.2565f, 25.4589f)
        lineTo(17.1017f, 25.6335f)
        curveTo(17.0134f, 25.7307f, 16.9151f, 25.8351f, 16.8072f, 25.9452f)
        curveTo(16.3972f, 26.3637f, 15.9315f, 26.7818f, 15.418f, 27.1726f)
        curveTo(13.9368f, 28.2999f, 12.361f, 28.9801f, 10.75f, 28.9801f)
        curveTo(9.139f, 28.9801f, 7.5633f, 28.2999f, 6.082f, 27.1726f)
        curveTo(5.5684f, 26.7818f, 5.1028f, 26.3637f, 4.6928f, 25.9452f)
        curveTo(4.5489f, 25.7984f, 4.4221f, 25.6618f, 4.3133f, 25.5388f)
        curveTo(4.2735f, 25.4938f, 4.241f, 25.4562f, 4.216f, 25.4266f)
        lineTo(4f, 25.1622f)
        lineTo(4.2159f, 24.8977f)
        lineTo(4.3982f, 24.6908f)
        curveTo(4.4866f, 24.5935f, 4.5849f, 24.4891f, 4.6928f, 24.379f)
        curveTo(5.1028f, 23.9605f, 5.5684f, 23.5423f, 6.0819f, 23.1515f)
        close()
        moveTo(15.0025f, 23.6975f)
        curveTo(13.63f, 22.6529f, 12.1871f, 22.0299f, 10.75f, 22.0299f)
        curveTo(9.3129f, 22.0299f, 7.87f, 22.6529f, 6.4975f, 23.6975f)
        curveTo(6.0122f, 24.0669f, 5.5709f, 24.4632f, 5.1829f, 24.8592f)
        curveTo(5.1152f, 24.9284f, 5.0516f, 24.995f, 4.9923f, 25.0586f)
        lineTo(4.8967f, 25.1619f)
        lineTo(4.963f, 25.2341f)
        lineTo(5.0844f, 25.3633f)
        lineTo(5.1829f, 25.465f)
        curveTo(5.5709f, 25.8609f, 6.0122f, 26.2572f, 6.4975f, 26.6266f)
        curveTo(7.87f, 27.6711f, 9.3129f, 28.2939f, 10.75f, 28.2939f)
        curveTo(12.1871f, 28.2939f, 13.63f, 27.6711f, 15.0025f, 26.6266f)
        curveTo(15.4878f, 26.2572f, 15.9291f, 25.8609f, 16.3171f, 25.465f)
        curveTo(16.351f, 25.4304f, 16.3838f, 25.3965f, 16.4156f, 25.3633f)
        lineTo(16.603f, 25.1619f)
        lineTo(16.4155f, 24.961f)
        lineTo(16.3171f, 24.8592f)
        curveTo(15.9291f, 24.4632f, 15.4878f, 24.0669f, 15.0025f, 23.6975f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(7.7478f, 25.1367f)
        curveTo(7.7478f, 23.5624f, 9.0246f, 22.2858f, 10.5991f, 22.2858f)
        curveTo(12.1737f, 22.2858f, 13.45f, 23.5623f, 13.45f, 25.1367f)
        curveTo(13.45f, 26.7113f, 12.1738f, 27.9875f, 10.5991f, 27.9875f)
        curveTo(9.0244f, 27.9875f, 7.7478f, 26.7113f, 7.7478f, 25.1367f)
        close()
        moveTo(12.7638f, 25.1367f)
        curveTo(12.7638f, 23.9413f, 11.7947f, 22.972f, 10.5991f, 22.972f)
        curveTo(9.4035f, 22.972f, 8.434f, 23.9414f, 8.434f, 25.1367f)
        curveTo(8.434f, 26.3323f, 9.4033f, 27.3014f, 10.5991f, 27.3014f)
        curveTo(11.7948f, 27.3014f, 12.7638f, 26.3324f, 12.7638f, 25.1367f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(9.9447f, 24.2159f)
        curveTo(9.9447f, 23.4291f, 10.5822f, 22.7919f, 11.3688f, 22.7919f)
        curveTo(12.1554f, 22.7919f, 12.7928f, 23.4291f, 12.7928f, 24.2159f)
        curveTo(12.7928f, 25.0024f, 12.1553f, 25.6395f, 11.3688f, 25.6395f)
        curveTo(10.5823f, 25.6395f, 9.9447f, 25.0024f, 9.9447f, 24.2159f)
        close()
        moveTo(12.1067f, 24.2159f)
        curveTo(12.1067f, 23.8082f, 11.7764f, 23.4781f, 11.3688f, 23.4781f)
        curveTo(10.9611f, 23.4781f, 10.6309f, 23.8082f, 10.6309f, 24.2159f)
        curveTo(10.6309f, 24.6233f, 10.9611f, 24.9534f, 11.3688f, 24.9534f)
        curveTo(11.7764f, 24.9534f, 12.1067f, 24.6233f, 12.1067f, 24.2159f)
        close()
      }
    }.build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

