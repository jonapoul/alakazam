package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RadialTakIcons.FovVisibility: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "FovVisibility",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(9.6749f, 5.0269f)
        lineTo(9.1967f, 5.1277f)
        lineTo(4.0001f, 29.7685f)
        lineTo(28.64f, 24.5719f)
        lineTo(28.7408f, 24.0937f)
        curveTo(31.5356f, 10.8409f, 22.9274f, 2.2322f, 9.6749f, 5.0269f)
        close()
        moveTo(27.3679f, 23.3067f)
        lineTo(5.9429f, 27.8247f)
        lineTo(10.4609f, 6.3987f)
        lineTo(10.7105f, 6.3526f)
        curveTo(22.2389f, 4.2753f, 29.4924f, 11.5294f, 27.4151f, 23.0581f)
        lineTo(27.3679f, 23.3067f)
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
        moveTo(13.2566f, 12.2563f)
        curveTo(13.2512f, 12.3648f, 13.2464f, 12.502f, 13.2448f, 12.6628f)
        curveTo(13.2403f, 13.0962f, 13.2588f, 13.6984f, 13.3502f, 14.3729f)
        curveTo(13.5345f, 15.7316f, 14.0082f, 17.3342f, 15.1352f, 18.4612f)
        curveTo(16.2624f, 19.5883f, 17.8651f, 20.0622f, 19.2238f, 20.2465f)
        curveTo(19.8983f, 20.338f, 20.5006f, 20.3564f, 20.9339f, 20.352f)
        curveTo(21.0948f, 20.3503f, 21.232f, 20.3455f, 21.3405f, 20.3402f)
        curveTo(21.3458f, 20.2316f, 21.3506f, 20.0945f, 21.3523f, 19.9336f)
        curveTo(21.3567f, 19.5003f, 21.3382f, 18.8981f, 21.2467f, 18.2236f)
        curveTo(21.0623f, 16.865f, 20.5884f, 15.2624f, 19.4612f, 14.1352f)
        curveTo(18.3342f, 13.0082f, 16.7317f, 12.5343f, 15.3731f, 12.35f)
        curveTo(14.6986f, 12.2585f, 14.0964f, 12.24f, 13.6631f, 12.2445f)
        curveTo(13.5023f, 12.2461f, 13.3651f, 12.2509f, 13.2566f, 12.2563f)
        close()
        moveTo(21.6547f, 20.6544f)
        curveTo(21.988f, 20.6888f, 21.988f, 20.6887f, 21.988f, 20.6886f)
        lineTo(21.9882f, 20.6872f)
        lineTo(21.9885f, 20.684f)
        lineTo(21.9896f, 20.673f)
        curveTo(21.9904f, 20.6636f, 21.9917f, 20.6501f, 21.9931f, 20.6328f)
        curveTo(21.996f, 20.598f, 21.9998f, 20.5477f, 22.0038f, 20.4833f)
        curveTo(22.0117f, 20.3546f, 22.0201f, 20.1695f, 22.0224f, 19.9405f)
        curveTo(22.0271f, 19.483f, 22.0076f, 18.8474f, 21.9108f, 18.1335f)
        curveTo(21.7184f, 16.7157f, 21.2141f, 14.9402f, 19.9351f, 13.6613f)
        curveTo(18.6563f, 12.3825f, 16.881f, 11.8783f, 15.4632f, 11.6859f)
        curveTo(14.7494f, 11.5891f, 14.1137f, 11.5696f, 13.6562f, 11.5743f)
        curveTo(13.4272f, 11.5767f, 13.2422f, 11.5851f, 13.1135f, 11.593f)
        curveTo(13.0491f, 11.5969f, 12.9987f, 11.6007f, 12.964f, 11.6036f)
        curveTo(12.9466f, 11.6051f, 12.9331f, 11.6063f, 12.9237f, 11.6072f)
        lineTo(12.9127f, 11.6082f)
        lineTo(12.9095f, 11.6086f)
        lineTo(12.9085f, 11.6087f)
        curveTo(12.9084f, 11.6087f, 12.9079f, 11.6087f, 12.9424f, 11.942f)
        lineTo(12.9079f, 11.6087f)
        lineTo(12.6371f, 11.6367f)
        lineTo(12.6091f, 11.9076f)
        lineTo(12.9424f, 11.942f)
        curveTo(12.6091f, 11.9076f, 12.6091f, 11.9074f, 12.6091f, 11.9076f)
        lineTo(12.6089f, 11.9092f)
        lineTo(12.6086f, 11.9123f)
        lineTo(12.6075f, 11.9233f)
        curveTo(12.6067f, 11.9327f, 12.6054f, 11.9462f, 12.604f, 11.9636f)
        curveTo(12.6011f, 11.9984f, 12.5973f, 12.0487f, 12.5933f, 12.1131f)
        curveTo(12.5854f, 12.2418f, 12.577f, 12.4269f, 12.5746f, 12.6559f)
        curveTo(12.5699f, 13.1134f, 12.5893f, 13.7491f, 12.6861f, 14.4629f)
        curveTo(12.8784f, 15.8808f, 13.3826f, 17.6563f, 14.6613f, 18.9351f)
        curveTo(15.9403f, 20.214f, 17.7158f, 20.7183f, 19.1338f, 20.9106f)
        curveTo(19.8476f, 21.0074f, 20.4833f, 21.0268f, 20.9408f, 21.0221f)
        curveTo(21.1698f, 21.0198f, 21.3549f, 21.0114f, 21.4836f, 21.0034f)
        curveTo(21.548f, 20.9995f, 21.5984f, 20.9957f, 21.6331f, 20.9928f)
        curveTo(21.6505f, 20.9913f, 21.664f, 20.9901f, 21.6734f, 20.9892f)
        lineTo(21.6844f, 20.9881f)
        lineTo(21.6876f, 20.9878f)
        lineTo(21.6886f, 20.9877f)
        curveTo(21.6887f, 20.9877f, 21.6892f, 20.9877f, 21.6547f, 20.6544f)
        close()
        moveTo(21.6547f, 20.6544f)
        lineTo(21.6892f, 20.9877f)
        lineTo(21.96f, 20.9597f)
        lineTo(21.988f, 20.6886f)
        lineTo(21.6547f, 20.6544f)
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
        moveTo(18.9437f, 17.9088f)
        curveTo(17.987f, 18.8654f, 16.4361f, 18.8651f, 15.4798f, 17.9088f)
        curveTo(14.5229f, 16.9519f, 14.5229f, 15.4013f, 15.4795f, 14.4447f)
        curveTo(16.4361f, 13.4881f, 17.9867f, 13.4881f, 18.9437f, 14.445f)
        curveTo(19.9f, 15.4013f, 19.9003f, 16.9522f, 18.9437f, 17.9088f)
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
        moveTo(18.7066f, 14.682f)
        curveTo(17.8805f, 13.8559f, 16.5421f, 13.8559f, 15.7163f, 14.6817f)
        curveTo(14.8906f, 15.5074f, 14.8905f, 16.8458f, 15.7167f, 17.6719f)
        curveTo(16.5421f, 18.4974f, 17.8808f, 18.4977f, 18.7066f, 17.6719f)
        curveTo(19.5323f, 16.8462f, 19.5321f, 15.5075f, 18.7066f, 14.682f)
        close()
        moveTo(15.2424f, 14.2078f)
        curveTo(16.33f, 13.1203f, 18.0927f, 13.1203f, 19.1805f, 14.2081f)
        curveTo(20.2676f, 15.2952f, 20.268f, 17.0583f, 19.1805f, 18.1458f)
        curveTo(18.093f, 19.2333f, 16.3299f, 19.233f, 15.2428f, 18.1458f)
        curveTo(14.155f, 17.058f, 14.1549f, 15.2953f, 15.2424f, 14.2078f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(21.9123f, 11.3792f)
        curveTo(22.0008f, 11.2907f, 22.1511f, 11.2975f, 22.248f, 11.3945f)
        curveTo(22.345f, 11.4914f, 22.3518f, 11.6417f, 22.2633f, 11.7302f)
        lineTo(20.6609f, 13.3327f)
        curveTo(20.5724f, 13.4212f, 20.422f, 13.4143f, 20.3251f, 13.3174f)
        curveTo(20.2282f, 13.2205f, 20.2213f, 13.0701f, 20.3098f, 12.9816f)
        lineTo(21.9123f, 11.3792f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(24.1614f, 15.624f)
        curveTo(24.2938f, 15.5885f, 24.4299f, 15.6671f, 24.4654f, 15.7995f)
        curveTo(24.5008f, 15.932f, 24.4223f, 16.0681f, 24.2899f, 16.1035f)
        lineTo(22.372f, 16.6174f)
        curveTo(22.2396f, 16.6529f, 22.1035f, 16.5743f, 22.068f, 16.4419f)
        curveTo(22.0325f, 16.3095f, 22.1111f, 16.1734f, 22.2435f, 16.1379f)
        lineTo(24.1614f, 15.624f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(17.9712f, 9.4352f)
        curveTo(18.0066f, 9.3028f, 17.9281f, 9.1667f, 17.7956f, 9.1312f)
        curveTo(17.6632f, 9.0957f, 17.5271f, 9.1743f, 17.4916f, 9.3067f)
        lineTo(16.9781f, 11.2234f)
        curveTo(16.9426f, 11.3558f, 17.0212f, 11.4919f, 17.1536f, 11.5274f)
        curveTo(17.286f, 11.5629f, 17.4221f, 11.4843f, 17.4576f, 11.3519f)
        lineTo(17.9712f, 9.4352f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(14.3309f, 9.4941f)
        curveTo(14.3295f, 9.357f, 14.2171f, 9.2471f, 14.08f, 9.2486f)
        curveTo(13.943f, 9.25f, 13.833f, 9.3624f, 13.8345f, 9.4994f)
        lineTo(13.848f, 10.739f)
        curveTo(13.8495f, 10.876f, 13.9618f, 10.986f, 14.0989f, 10.9845f)
        curveTo(14.2359f, 10.983f, 14.3459f, 10.8707f, 14.3444f, 10.7336f)
        lineTo(14.3309f, 9.4941f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(24.0287f, 19.1917f)
        curveTo(24.1657f, 19.1931f, 24.2757f, 19.3055f, 24.2742f, 19.4426f)
        curveTo(24.2727f, 19.5796f, 24.1604f, 19.6895f, 24.0233f, 19.6881f)
        lineTo(22.7836f, 19.6746f)
        curveTo(22.6465f, 19.6731f, 22.5366f, 19.5608f, 22.5381f, 19.4237f)
        curveTo(22.5396f, 19.2867f, 22.6519f, 19.1767f, 22.789f, 19.1782f)
        lineTo(24.0287f, 19.1917f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.FovVisibility)
