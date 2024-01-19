package dev.jonpoulton.alakazam.tak.compose.icons.radial

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.AngleUnits: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "AngleUnits",
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
        moveTo(8.58f, 16.178f)
        curveTo(8.949f, 16.178f, 9.237f, 15.881f, 9.237f, 15.512f)
        curveTo(9.237f, 15.422f, 9.21f, 15.332f, 9.165f, 15.233f)
        lineTo(6.969f, 10.274f)
        curveTo(6.816f, 9.932f, 6.546f, 9.725f, 6.168f, 9.725f)
        horizontalLineTo(6.087f)
        curveTo(5.709f, 9.725f, 5.43f, 9.932f, 5.277f, 10.274f)
        lineTo(3.081f, 15.233f)
        curveTo(3.036f, 15.332f, 3f, 15.431f, 3f, 15.53f)
        curveTo(3f, 15.89f, 3.279f, 16.178f, 3.639f, 16.178f)
        curveTo(3.927f, 16.178f, 4.161f, 16.016f, 4.278f, 15.746f)
        lineTo(4.719f, 14.711f)
        horizontalLineTo(7.491f)
        lineTo(7.914f, 15.701f)
        curveTo(8.04f, 15.989f, 8.256f, 16.178f, 8.58f, 16.178f)
        close()
        moveTo(6.978f, 13.487f)
        horizontalLineTo(5.232f)
        lineTo(6.105f, 11.408f)
        lineTo(6.978f, 13.487f)
        close()
        moveTo(14.292f, 16.178f)
        curveTo(14.67f, 16.178f, 14.976f, 15.872f, 14.976f, 15.494f)
        verticalLineTo(13.001f)
        curveTo(14.976f, 11.894f, 14.373f, 11.21f, 13.338f, 11.21f)
        curveTo(12.645f, 11.21f, 12.24f, 11.579f, 11.925f, 11.984f)
        verticalLineTo(11.93f)
        curveTo(11.925f, 11.552f, 11.619f, 11.246f, 11.241f, 11.246f)
        curveTo(10.863f, 11.246f, 10.557f, 11.552f, 10.557f, 11.93f)
        verticalLineTo(15.494f)
        curveTo(10.557f, 15.872f, 10.863f, 16.178f, 11.241f, 16.178f)
        curveTo(11.619f, 16.178f, 11.925f, 15.872f, 11.925f, 15.494f)
        verticalLineTo(13.433f)
        curveTo(11.925f, 12.785f, 12.258f, 12.452f, 12.78f, 12.452f)
        curveTo(13.302f, 12.452f, 13.608f, 12.785f, 13.608f, 13.433f)
        verticalLineTo(15.494f)
        curveTo(13.608f, 15.872f, 13.914f, 16.178f, 14.292f, 16.178f)
        close()
        moveTo(18.699f, 17.582f)
        curveTo(19.635f, 17.582f, 20.328f, 17.384f, 20.778f, 16.934f)
        curveTo(21.183f, 16.529f, 21.39f, 15.899f, 21.39f, 15.035f)
        verticalLineTo(11.93f)
        curveTo(21.39f, 11.552f, 21.084f, 11.246f, 20.706f, 11.246f)
        curveTo(20.328f, 11.246f, 20.022f, 11.552f, 20.022f, 11.921f)
        verticalLineTo(11.93f)
        curveTo(19.653f, 11.525f, 19.212f, 11.21f, 18.465f, 11.21f)
        curveTo(17.358f, 11.21f, 16.323f, 12.02f, 16.323f, 13.46f)
        verticalLineTo(13.478f)
        curveTo(16.323f, 14.909f, 17.34f, 15.728f, 18.465f, 15.728f)
        curveTo(19.194f, 15.728f, 19.635f, 15.431f, 20.04f, 14.945f)
        verticalLineTo(15.179f)
        curveTo(20.04f, 16.043f, 19.599f, 16.493f, 18.663f, 16.493f)
        curveTo(18.15f, 16.493f, 17.727f, 16.385f, 17.331f, 16.205f)
        curveTo(17.268f, 16.178f, 17.196f, 16.16f, 17.106f, 16.16f)
        curveTo(16.8f, 16.16f, 16.548f, 16.412f, 16.548f, 16.718f)
        curveTo(16.548f, 16.97f, 16.701f, 17.159f, 16.935f, 17.249f)
        curveTo(17.502f, 17.474f, 18.06f, 17.582f, 18.699f, 17.582f)
        close()
        moveTo(18.861f, 14.594f)
        curveTo(18.195f, 14.594f, 17.691f, 14.144f, 17.691f, 13.478f)
        verticalLineTo(13.46f)
        curveTo(17.691f, 12.803f, 18.195f, 12.344f, 18.861f, 12.344f)
        curveTo(19.527f, 12.344f, 20.04f, 12.803f, 20.04f, 13.46f)
        verticalLineTo(13.478f)
        curveTo(20.04f, 14.135f, 19.527f, 14.594f, 18.861f, 14.594f)
        close()
        moveTo(23.736f, 16.178f)
        curveTo(24.114f, 16.178f, 24.42f, 15.872f, 24.42f, 15.494f)
        verticalLineTo(10.184f)
        curveTo(24.42f, 9.806f, 24.114f, 9.5f, 23.736f, 9.5f)
        curveTo(23.358f, 9.5f, 23.052f, 9.806f, 23.052f, 10.184f)
        verticalLineTo(15.494f)
        curveTo(23.052f, 15.872f, 23.358f, 16.178f, 23.736f, 16.178f)
        close()
        moveTo(28.368f, 16.232f)
        curveTo(29.07f, 16.232f, 29.619f, 16.007f, 30.042f, 15.647f)
        curveTo(30.141f, 15.557f, 30.222f, 15.422f, 30.222f, 15.242f)
        curveTo(30.222f, 14.936f, 29.997f, 14.702f, 29.691f, 14.702f)
        curveTo(29.547f, 14.702f, 29.457f, 14.738f, 29.358f, 14.81f)
        curveTo(29.079f, 15.017f, 28.764f, 15.134f, 28.386f, 15.134f)
        curveTo(27.774f, 15.134f, 27.342f, 14.81f, 27.207f, 14.189f)
        horizontalLineTo(29.916f)
        curveTo(30.276f, 14.189f, 30.555f, 13.928f, 30.555f, 13.532f)
        curveTo(30.555f, 12.533f, 29.844f, 11.21f, 28.233f, 11.21f)
        curveTo(26.829f, 11.21f, 25.848f, 12.344f, 25.848f, 13.721f)
        verticalLineTo(13.739f)
        curveTo(25.848f, 15.215f, 26.919f, 16.232f, 28.368f, 16.232f)
        close()
        moveTo(29.25f, 13.334f)
        horizontalLineTo(27.189f)
        curveTo(27.297f, 12.713f, 27.666f, 12.308f, 28.233f, 12.308f)
        curveTo(28.809f, 12.308f, 29.169f, 12.722f, 29.25f, 13.334f)
        close()
        moveTo(7.7745f, 25.223f)
        curveTo(9.4665f, 25.223f, 10.5375f, 24.287f, 10.5375f, 22.379f)
        verticalLineTo(19.463f)
        curveTo(10.5375f, 19.076f, 10.2315f, 18.77f, 9.8445f, 18.77f)
        curveTo(9.4575f, 18.77f, 9.1515f, 19.076f, 9.1515f, 19.463f)
        verticalLineTo(22.433f)
        curveTo(9.1515f, 23.432f, 8.6385f, 23.945f, 7.7925f, 23.945f)
        curveTo(6.9465f, 23.945f, 6.4335f, 23.414f, 6.4335f, 22.388f)
        verticalLineTo(19.463f)
        curveTo(6.4335f, 19.076f, 6.1275f, 18.77f, 5.7405f, 18.77f)
        curveTo(5.3535f, 18.77f, 5.0475f, 19.076f, 5.0475f, 19.463f)
        verticalLineTo(22.424f)
        curveTo(5.0475f, 24.278f, 6.0825f, 25.223f, 7.7745f, 25.223f)
        close()
        moveTo(15.9165f, 25.178f)
        curveTo(16.2945f, 25.178f, 16.6005f, 24.872f, 16.6005f, 24.494f)
        verticalLineTo(22.001f)
        curveTo(16.6005f, 20.894f, 15.9975f, 20.21f, 14.9625f, 20.21f)
        curveTo(14.2695f, 20.21f, 13.8645f, 20.579f, 13.5495f, 20.984f)
        verticalLineTo(20.93f)
        curveTo(13.5495f, 20.552f, 13.2435f, 20.246f, 12.8655f, 20.246f)
        curveTo(12.4875f, 20.246f, 12.1815f, 20.552f, 12.1815f, 20.93f)
        verticalLineTo(24.494f)
        curveTo(12.1815f, 24.872f, 12.4875f, 25.178f, 12.8655f, 25.178f)
        curveTo(13.2435f, 25.178f, 13.5495f, 24.872f, 13.5495f, 24.494f)
        verticalLineTo(22.433f)
        curveTo(13.5495f, 21.785f, 13.8825f, 21.452f, 14.4045f, 21.452f)
        curveTo(14.9265f, 21.452f, 15.2325f, 21.785f, 15.2325f, 22.433f)
        verticalLineTo(24.494f)
        curveTo(15.2325f, 24.872f, 15.5385f, 25.178f, 15.9165f, 25.178f)
        close()
        moveTo(18.9105f, 19.814f)
        curveTo(19.3425f, 19.814f, 19.6755f, 19.562f, 19.6755f, 19.166f)
        verticalLineTo(19.148f)
        curveTo(19.6755f, 18.752f, 19.3425f, 18.509f, 18.9105f, 18.509f)
        curveTo(18.4785f, 18.509f, 18.1455f, 18.752f, 18.1455f, 19.148f)
        verticalLineTo(19.166f)
        curveTo(18.1455f, 19.562f, 18.4785f, 19.814f, 18.9105f, 19.814f)
        close()
        moveTo(18.9105f, 25.178f)
        curveTo(19.2885f, 25.178f, 19.5945f, 24.872f, 19.5945f, 24.494f)
        verticalLineTo(20.93f)
        curveTo(19.5945f, 20.552f, 19.2885f, 20.246f, 18.9105f, 20.246f)
        curveTo(18.5325f, 20.246f, 18.2265f, 20.552f, 18.2265f, 20.93f)
        verticalLineTo(24.494f)
        curveTo(18.2265f, 24.872f, 18.5325f, 25.178f, 18.9105f, 25.178f)
        close()
        moveTo(22.8855f, 25.205f)
        curveTo(23.1825f, 25.205f, 23.4165f, 25.169f, 23.6685f, 25.07f)
        curveTo(23.8575f, 24.998f, 24.0195f, 24.8f, 24.0195f, 24.557f)
        curveTo(24.0195f, 24.242f, 23.7585f, 23.99f, 23.4525f, 23.99f)
        curveTo(23.4255f, 23.99f, 23.3355f, 23.999f, 23.2905f, 23.999f)
        curveTo(22.9845f, 23.999f, 22.8495f, 23.846f, 22.8495f, 23.531f)
        verticalLineTo(21.47f)
        horizontalLineTo(23.4525f)
        curveTo(23.7765f, 21.47f, 24.0375f, 21.209f, 24.0375f, 20.885f)
        curveTo(24.0375f, 20.561f, 23.7765f, 20.3f, 23.4525f, 20.3f)
        horizontalLineTo(22.8495f)
        verticalLineTo(19.697f)
        curveTo(22.8495f, 19.319f, 22.5435f, 19.013f, 22.1655f, 19.013f)
        curveTo(21.7875f, 19.013f, 21.4815f, 19.319f, 21.4815f, 19.697f)
        verticalLineTo(20.3f)
        horizontalLineTo(21.4365f)
        curveTo(21.1125f, 20.3f, 20.8515f, 20.561f, 20.8515f, 20.885f)
        curveTo(20.8515f, 21.209f, 21.1125f, 21.47f, 21.4365f, 21.47f)
        horizontalLineTo(21.4815f)
        verticalLineTo(23.756f)
        curveTo(21.4815f, 24.872f, 22.0485f, 25.205f, 22.8855f, 25.205f)
        close()
        moveTo(27.0585f, 25.214f)
        curveTo(28.1025f, 25.214f, 28.9035f, 24.728f, 28.9035f, 23.657f)
        verticalLineTo(23.639f)
        curveTo(28.9035f, 22.757f, 28.1205f, 22.433f, 27.4455f, 22.208f)
        curveTo(26.9235f, 22.028f, 26.4645f, 21.902f, 26.4645f, 21.632f)
        verticalLineTo(21.614f)
        curveTo(26.4645f, 21.425f, 26.6355f, 21.281f, 26.9685f, 21.281f)
        curveTo(27.2565f, 21.281f, 27.6255f, 21.398f, 28.0125f, 21.587f)
        curveTo(28.1025f, 21.632f, 28.1655f, 21.65f, 28.2645f, 21.65f)
        curveTo(28.5705f, 21.65f, 28.8135f, 21.416f, 28.8135f, 21.11f)
        curveTo(28.8135f, 20.876f, 28.6875f, 20.696f, 28.4895f, 20.597f)
        curveTo(28.0215f, 20.363f, 27.4995f, 20.228f, 26.9955f, 20.228f)
        curveTo(26.0235f, 20.228f, 25.2315f, 20.777f, 25.2315f, 21.758f)
        verticalLineTo(21.776f)
        curveTo(25.2315f, 22.712f, 25.9965f, 23.027f, 26.6715f, 23.225f)
        curveTo(27.2025f, 23.387f, 27.6705f, 23.486f, 27.6705f, 23.783f)
        verticalLineTo(23.801f)
        curveTo(27.6705f, 24.017f, 27.4905f, 24.161f, 27.0945f, 24.161f)
        curveTo(26.7075f, 24.161f, 26.2485f, 24.017f, 25.7895f, 23.729f)
        curveTo(25.7175f, 23.684f, 25.6185f, 23.657f, 25.5195f, 23.657f)
        curveTo(25.2135f, 23.657f, 24.9795f, 23.891f, 24.9795f, 24.197f)
        curveTo(24.9795f, 24.413f, 25.0965f, 24.575f, 25.2405f, 24.665f)
        curveTo(25.8255f, 25.043f, 26.4645f, 25.214f, 27.0585f, 25.214f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.AngleUnits)
