package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

val RaptorXTakIcons.GoToArea: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "GoToArea",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0f, 26.5f)
        horizontalLineTo(10.2857f)
        horizontalLineTo(4.0f)
        verticalLineTo(4.5f)
        horizontalLineTo(26.0f)
        verticalLineTo(8.4286f)
        verticalLineTo(19.0f)
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(14.9985f, 8.773f)
        curveTo(12.2048f, 8.773f, 9.993f, 10.9226f, 9.993f, 13.5108f)
        curveTo(9.993f, 14.0866f, 10.2791f, 14.9057f, 10.7992f, 15.8768f)
        curveTo(11.3072f, 16.8256f, 11.992f, 17.8363f, 12.6878f, 18.7698f)
        curveTo(13.3819f, 19.7009f, 14.0774f, 20.5427f, 14.6001f, 21.1523f)
        curveTo(14.7484f, 21.3252f, 14.8825f, 21.4792f, 14.9986f, 21.611f)
        curveTo(15.1146f, 21.4792f, 15.2488f, 21.3252f, 15.3971f, 21.1523f)
        curveTo(15.9199f, 20.5426f, 16.6155f, 19.7009f, 17.3097f, 18.7698f)
        curveTo(18.0057f, 17.8362f, 18.6906f, 16.8256f, 19.1987f, 15.8768f)
        curveTo(19.7188f, 14.9056f, 20.005f, 14.0866f, 20.005f, 13.5108f)
        curveTo(20.005f, 10.9226f, 17.7933f, 8.773f, 14.9985f, 8.773f)
        close()
        moveTo(14.9985f, 22.5639f)
        curveTo(14.5318f, 22.9966f, 14.5317f, 22.9965f, 14.5316f, 22.9964f)
        lineTo(14.5303f, 22.995f)
        lineTo(14.5268f, 22.9913f)
        lineTo(14.5139f, 22.9772f)
        lineTo(14.4649f, 22.9238f)
        curveTo(14.4224f, 22.8772f, 14.3605f, 22.8089f, 14.282f, 22.7213f)
        curveTo(14.1251f, 22.5461f, 13.9016f, 22.2933f, 13.6337f, 21.981f)
        curveTo(13.0986f, 21.3568f, 12.3836f, 20.4917f, 11.6672f, 19.5306f)
        curveTo(10.9525f, 18.5718f, 10.2268f, 17.5046f, 9.6769f, 16.4777f)
        curveTo(9.139f, 15.4732f, 8.72f, 14.4187f, 8.72f, 13.5108f)
        curveTo(8.72f, 10.1617f, 11.5609f, 7.5f, 14.9985f, 7.5f)
        curveTo(18.437f, 7.5f, 21.278f, 10.1617f, 21.278f, 13.5108f)
        curveTo(21.278f, 14.4188f, 20.8589f, 15.4733f, 20.3209f, 16.4778f)
        curveTo(19.771f, 17.5047f, 19.0451f, 18.5718f, 18.3303f, 19.5306f)
        curveTo(17.6137f, 20.4918f, 16.8986f, 21.3569f, 16.3634f, 21.981f)
        curveTo(16.0955f, 22.2934f, 15.872f, 22.5462f, 15.715f, 22.7213f)
        curveTo(15.6365f, 22.809f, 15.5746f, 22.8772f, 15.5321f, 22.9238f)
        lineTo(15.4831f, 22.9773f)
        lineTo(15.4702f, 22.9913f)
        lineTo(15.4657f, 22.9961f)
        curveTo(15.4656f, 22.9962f, 15.4652f, 22.9966f, 14.9985f, 22.5639f)
        close()
        moveTo(14.9985f, 22.5639f)
        lineTo(15.4657f, 22.9961f)
        lineTo(14.9985f, 23.5f)
        lineTo(14.5316f, 22.9964f)
        lineTo(14.9985f, 22.5639f)
        close()
        moveTo(14.9989f, 12.8448f)
        curveTo(14.4887f, 12.8448f, 14.1309f, 13.2292f, 14.1309f, 13.6409f)
        curveTo(14.1309f, 14.0519f, 14.4889f, 14.4369f, 14.9989f, 14.4369f)
        curveTo(15.5081f, 14.4369f, 15.8669f, 14.0516f, 15.8669f, 13.6409f)
        curveTo(15.8669f, 13.2294f, 15.5084f, 12.8448f, 14.9989f, 12.8448f)
        close()
        moveTo(12.8579f, 13.6409f)
        curveTo(12.8579f, 12.4681f, 13.8451f, 11.5718f, 14.9989f, 11.5718f)
        curveTo(16.1514f, 11.5718f, 17.1399f, 12.4678f, 17.1399f, 13.6409f)
        curveTo(17.1399f, 14.8127f, 16.1517f, 15.7099f, 14.9989f, 15.7099f)
        curveTo(13.8448f, 15.7099f, 12.8579f, 14.8125f, 12.8579f, 13.6409f)
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
        moveTo(25.3409f, 24.0107f)
        curveTo(25.6166f, 24.0107f, 25.8401f, 24.2343f, 25.8401f, 24.51f)
        curveTo(25.8401f, 24.7628f, 25.6523f, 24.9716f, 25.4086f, 25.0047f)
        lineTo(25.3409f, 25.0093f)
        horizontalLineTo(20.3669f)
        curveTo(20.0912f, 25.0093f, 19.8677f, 24.7857f, 19.8677f, 24.51f)
        curveTo(19.8677f, 24.2572f, 20.0555f, 24.0484f, 20.2992f, 24.0153f)
        lineTo(20.3669f, 24.0107f)
        horizontalLineTo(25.3409f)
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
        moveTo(23.6108f, 22.5896f)
        curveTo(23.7881f, 22.4123f, 24.0654f, 22.3962f, 24.2609f, 22.5412f)
        lineTo(24.3169f, 22.5896f)
        lineTo(25.8839f, 24.1566f)
        curveTo(26.0789f, 24.3516f, 26.0789f, 24.6677f, 25.8839f, 24.8627f)
        curveTo(25.7066f, 25.0399f, 25.4293f, 25.056f, 25.2338f, 24.911f)
        lineTo(25.1778f, 24.8627f)
        lineTo(23.6108f, 23.2956f)
        curveTo(23.4159f, 23.1007f, 23.4159f, 22.7846f, 23.6108f, 22.5896f)
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
        moveTo(25.1781f, 24.2375f)
        curveTo(25.3731f, 24.0426f, 25.6892f, 24.0426f, 25.8841f, 24.2375f)
        curveTo(26.0614f, 24.4148f, 26.0775f, 24.6921f, 25.9325f, 24.8876f)
        lineTo(25.8841f, 24.9436f)
        lineTo(24.3171f, 26.5106f)
        curveTo(24.1222f, 26.7056f, 23.806f, 26.7056f, 23.6111f, 26.5106f)
        curveTo(23.4338f, 26.3334f, 23.4177f, 26.056f, 23.5627f, 25.8605f)
        lineTo(23.6111f, 25.8045f)
        lineTo(25.1781f, 24.2375f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
