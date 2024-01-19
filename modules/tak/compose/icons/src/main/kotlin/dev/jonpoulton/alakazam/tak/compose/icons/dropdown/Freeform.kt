package dev.jonpoulton.alakazam.tak.compose.icons.dropdown

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
import dev.jonpoulton.alakazam.tak.compose.icons.DropdownTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val DropdownTakIcons.Freeform: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Freeform",
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
        pathFillType = NonZero,
      ) {
        moveTo(24.5134f, 20.3425f)
        curveTo(24.8931f, 20.3425f, 25.2069f, 20.6247f, 25.2566f, 20.9908f)
        lineTo(25.2634f, 21.0925f)
        verticalLineTo(27.1643f)
        curveTo(25.2634f, 27.5786f, 24.9276f, 27.9143f, 24.5134f, 27.9143f)
        curveTo(24.1337f, 27.9143f, 23.8199f, 27.6322f, 23.7703f, 27.2661f)
        lineTo(23.7634f, 27.1643f)
        verticalLineTo(21.0925f)
        curveTo(23.7634f, 20.6783f, 24.0992f, 20.3425f, 24.5134f, 20.3425f)
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
        moveTo(27.5484f, 23.3784f)
        curveTo(27.9626f, 23.3784f, 28.2984f, 23.7142f, 28.2984f, 24.1284f)
        curveTo(28.2984f, 24.5081f, 28.0163f, 24.8219f, 27.6502f, 24.8716f)
        lineTo(27.5484f, 24.8784f)
        horizontalLineTo(21.4774f)
        curveTo(21.0632f, 24.8784f, 20.7274f, 24.5426f, 20.7274f, 24.1284f)
        curveTo(20.7274f, 23.7487f, 21.0096f, 23.4349f, 21.3756f, 23.3853f)
        lineTo(21.4774f, 23.3784f)
        horizontalLineTo(27.5484f)
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
        moveTo(4.8931f, 4.0353f)
        curveTo(7.0116f, 2.901f, 9.0371f, 2.6676f, 12.9541f, 2.7793f)
        lineTo(19.544f, 2.9969f)
        curveTo(21.8929f, 3.0752f, 23.296f, 3.4737f, 24.1713f, 4.7911f)
        curveTo(25.0448f, 6.1058f, 24.85f, 7.6885f, 23.9767f, 9.5972f)
        lineTo(23.6984f, 10.1817f)
        curveTo(23.1977f, 11.2256f, 22.9653f, 11.8315f, 22.8728f, 12.4482f)
        curveTo(22.8088f, 12.8749f, 22.8317f, 13.254f, 22.9476f, 13.6042f)
        curveTo(23.2455f, 14.5023f, 23.8963f, 15.1554f, 25.1853f, 15.9799f)
        lineTo(25.617f, 16.2484f)
        curveTo(25.8588f, 16.3959f, 26.235f, 16.6244f, 26.354f, 16.6982f)
        curveTo(27.8094f, 17.601f, 28.5125f, 18.2768f, 28.7343f, 19.3404f)
        curveTo(28.8188f, 19.7459f, 28.5586f, 20.1431f, 28.1531f, 20.2277f)
        curveTo(27.7814f, 20.3052f, 27.4166f, 20.093f, 27.2933f, 19.7447f)
        lineTo(27.2658f, 19.6465f)
        curveTo(27.1565f, 19.1221f, 26.6842f, 18.6682f, 25.5633f, 17.9729f)
        lineTo(24.6453f, 17.4122f)
        curveTo(22.913f, 16.3405f, 21.9821f, 15.458f, 21.5237f, 14.0759f)
        curveTo(21.3293f, 13.4884f, 21.2922f, 12.8738f, 21.3894f, 12.2257f)
        curveTo(21.4906f, 11.5513f, 21.6965f, 10.9458f, 22.0881f, 10.0837f)
        lineTo(22.5073f, 9.1978f)
        curveTo(23.2697f, 7.6122f, 23.4506f, 6.4169f, 22.9219f, 5.6212f)
        curveTo(22.4362f, 4.8901f, 21.4817f, 4.5894f, 19.7706f, 4.5072f)
        lineTo(13.3311f, 4.2917f)
        curveTo(9.3913f, 4.1599f, 7.4836f, 4.3497f, 5.6014f, 5.3576f)
        curveTo(3.3283f, 6.5759f, 2.0996f, 9.365f, 3.1224f, 11.2557f)
        curveTo(3.4404f, 11.8431f, 3.8553f, 12.2786f, 4.7994f, 13.0732f)
        lineTo(5.1017f, 13.3252f)
        curveTo(6.5777f, 14.5508f, 7.193f, 15.224f, 7.5765f, 16.3439f)
        curveTo(7.7366f, 16.8131f, 7.7987f, 17.1915f, 7.8617f, 17.9282f)
        lineTo(7.917f, 18.5906f)
        lineTo(7.9497f, 18.8813f)
        curveTo(8.0212f, 19.4226f, 8.0295f, 19.9931f, 7.9861f, 20.6273f)
        lineTo(7.9592f, 20.9637f)
        curveTo(7.9387f, 21.1881f, 7.9122f, 21.4188f, 7.8764f, 21.6924f)
        lineTo(7.7079f, 22.8997f)
        curveTo(7.3887f, 25.2977f, 7.5663f, 25.9259f, 8.7217f, 26.2834f)
        curveTo(11.7501f, 27.2204f, 15.1735f, 27.1935f, 18.7265f, 25.8016f)
        curveTo(19.1121f, 25.6505f, 19.5473f, 25.8406f, 19.6984f, 26.2263f)
        curveTo(19.8495f, 26.612f, 19.6593f, 27.0471f, 19.2736f, 27.1982f)
        curveTo(15.3888f, 28.7202f, 11.6183f, 28.7498f, 8.2783f, 27.7164f)
        curveTo(6.0689f, 27.0327f, 5.7953f, 25.7754f, 6.2549f, 22.4544f)
        lineTo(6.3872f, 21.5113f)
        curveTo(6.4382f, 21.1235f, 6.4685f, 20.8331f, 6.4896f, 20.5247f)
        curveTo(6.5193f, 20.0917f, 6.5208f, 19.7023f, 6.4909f, 19.3421f)
        lineTo(6.4248f, 18.7442f)
        lineTo(6.3854f, 18.2783f)
        curveTo(6.3247f, 17.5091f, 6.2789f, 17.1858f, 6.1572f, 16.8291f)
        curveTo(5.9093f, 16.1055f, 5.4662f, 15.5941f, 4.3589f, 14.6595f)
        lineTo(4.0518f, 14.4032f)
        curveTo(2.8107f, 13.3727f, 2.2658f, 12.8242f, 1.8032f, 11.9696f)
        curveTo(0.3405f, 9.2657f, 1.9497f, 5.6129f, 4.8931f, 4.0353f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = DropdownTakIcons.Freeform)
