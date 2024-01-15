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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val ToolbarTakIcons.Lasso: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Lasso",
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
        moveTo(34.688f, 11.2594f)
        curveTo(33.5341f, 9.5318f, 32.032f, 8.3267f, 30.3569f, 7.383f)
        curveTo(27.5951f, 5.8281f, 24.6141f, 5.2234f, 21.5581f, 5.0247f)
        curveTo(19.9844f, 4.9486f, 18.4079f, 5.0484f, 16.8519f, 5.3227f)
        curveTo(14.4228f, 5.7158f, 12.0919f, 6.45f, 9.9475f, 7.8235f)
        curveTo(8.3243f, 8.8623f, 6.8703f, 10.1235f, 5.926f, 11.9915f)
        curveTo(4.7163f, 14.393f, 4.6759f, 16.8074f, 5.8991f, 19.2261f)
        curveTo(6.7491f, 20.9084f, 7.9992f, 22.1372f, 9.4397f, 23.1285f)
        curveTo(9.9032f, 23.4459f, 10.2629f, 23.7591f, 10.2629f, 24.4091f)
        curveTo(10.2803f, 24.6065f, 10.3469f, 24.7944f, 10.4552f, 24.9512f)
        curveTo(11.0322f, 26.0007f, 12.3304f, 26.5471f, 13.4266f, 26.2124f)
        curveTo(13.6189f, 26.1562f, 13.7862f, 26.0115f, 13.9882f, 26.2599f)
        curveTo(14.5796f, 26.9399f, 15.0048f, 27.7796f, 15.2229f, 28.698f)
        curveTo(15.8903f, 31.7214f, 13.9863f, 34.1639f, 11.463f, 34.0581f)
        curveTo(10.2359f, 34.0063f, 9.0051f, 34.0581f, 7.7742f, 34.0581f)
        curveTo(6.7164f, 34.0581f, 6.7164f, 34.0581f, 6.7241f, 35.2459f)
        curveTo(6.7241f, 35.87f, 6.8299f, 35.9888f, 7.4011f, 35.9931f)
        curveTo(8.1512f, 35.9931f, 8.9012f, 35.9931f, 9.8552f, 35.9931f)
        curveTo(10.6533f, 35.9261f, 11.6611f, 36.1075f, 12.6573f, 35.8851f)
        curveTo(14.1709f, 35.5482f, 15.421f, 34.7038f, 16.2134f, 33.231f)
        curveTo(17.4385f, 30.9526f, 17.3673f, 28.616f, 16.1826f, 26.3203f)
        curveTo(16.123f, 26.2016f, 15.9903f, 26.0698f, 16.0807f, 25.9402f)
        curveTo(16.1711f, 25.8107f, 16.3192f, 25.8971f, 16.4461f, 25.9208f)
        curveTo(17.6046f, 26.1338f, 18.7747f, 26.2579f, 19.9483f, 26.2923f)
        curveTo(21.364f, 26.3306f, 22.78f, 26.2272f, 24.1794f, 25.9834f)
        curveTo(26.6104f, 25.599f, 28.9414f, 24.8583f, 31.0877f, 23.4848f)
        curveTo(32.7148f, 22.4482f, 34.1418f, 21.1676f, 35.115f, 19.3168f)
        curveTo(35.7606f, 18.0766f, 36.0646f, 16.6495f, 35.9886f, 15.2155f)
        curveTo(35.9126f, 13.7815f, 35.46f, 12.4049f, 34.688f, 11.2594f)
        close()
        moveTo(33.5918f, 18.3731f)
        curveTo(32.834f, 19.7919f, 31.7301f, 20.8069f, 30.4723f, 21.6232f)
        curveTo(28.4611f, 22.9061f, 26.2454f, 23.7337f, 23.9506f, 24.0593f)
        curveTo(22.8502f, 24.2523f, 21.7389f, 24.3562f, 20.6253f, 24.3702f)
        curveTo(18.9866f, 24.3613f, 17.3525f, 24.174f, 15.746f, 23.8109f)
        curveTo(15.6144f, 23.7992f, 15.4901f, 23.7381f, 15.3931f, 23.6374f)
        curveTo(15.2961f, 23.5367f, 15.2321f, 23.4023f, 15.2114f, 23.2559f)
        curveTo(14.9306f, 22.0206f, 13.3824f, 21.1676f, 12.1707f, 21.5282f)
        curveTo(12.0446f, 21.5506f, 11.923f, 21.5974f, 11.8111f, 21.6664f)
        curveTo(11.2995f, 22.0681f, 10.8495f, 21.8954f, 10.384f, 21.5455f)
        curveTo(9.0012f, 20.5111f, 7.7434f, 19.36f, 7.078f, 17.5697f)
        curveTo(6.3452f, 15.6045f, 6.7587f, 13.8574f, 7.8704f, 12.2593f)
        curveTo(9.4301f, 10.0155f, 11.6188f, 8.8688f, 13.9536f, 8.0352f)
        curveTo(16.3581f, 7.1868f, 18.877f, 6.8213f, 21.3946f, 6.9554f)
        curveTo(24.1313f, 7.0936f, 26.8027f, 7.6572f, 29.3029f, 8.9854f)
        curveTo(31.0204f, 9.901f, 32.5917f, 11.0543f, 33.6033f, 12.9439f)
        curveTo(34.5591f, 14.745f, 34.5553f, 16.5742f, 33.5918f, 18.3731f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Lasso)
