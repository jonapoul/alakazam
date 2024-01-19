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

public val RadialTakIcons.UnitFt: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "UnitFt",
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
        moveTo(10.416f, 15.908f)
        curveTo(10.794f, 15.908f, 11.1f, 15.602f, 11.1f, 15.224f)
        verticalLineTo(11.849f)
        lineTo(13.872f, 15.485f)
        curveTo(14.061f, 15.728f, 14.259f, 15.89f, 14.592f, 15.89f)
        horizontalLineTo(14.637f)
        curveTo(15.024f, 15.89f, 15.33f, 15.584f, 15.33f, 15.197f)
        verticalLineTo(10.184f)
        curveTo(15.33f, 9.806f, 15.024f, 9.5f, 14.646f, 9.5f)
        curveTo(14.268f, 9.5f, 13.962f, 9.806f, 13.962f, 10.184f)
        verticalLineTo(13.433f)
        lineTo(11.289f, 9.923f)
        curveTo(11.1f, 9.68f, 10.902f, 9.518f, 10.569f, 9.518f)
        horizontalLineTo(10.425f)
        curveTo(10.038f, 9.518f, 9.732f, 9.824f, 9.732f, 10.211f)
        verticalLineTo(15.224f)
        curveTo(9.732f, 15.602f, 10.038f, 15.908f, 10.416f, 15.908f)
        close()
        moveTo(22.824f, 15.908f)
        curveTo(23.211f, 15.908f, 23.517f, 15.602f, 23.517f, 15.215f)
        verticalLineTo(10.211f)
        curveTo(23.517f, 9.824f, 23.211f, 9.518f, 22.824f, 9.518f)
        horizontalLineTo(22.671f)
        curveTo(22.392f, 9.518f, 22.194f, 9.635f, 22.05f, 9.869f)
        lineTo(20.367f, 12.605f)
        lineTo(18.693f, 9.878f)
        curveTo(18.567f, 9.671f, 18.36f, 9.518f, 18.063f, 9.518f)
        horizontalLineTo(17.91f)
        curveTo(17.523f, 9.518f, 17.217f, 9.824f, 17.217f, 10.211f)
        verticalLineTo(15.233f)
        curveTo(17.217f, 15.611f, 17.514f, 15.908f, 17.892f, 15.908f)
        curveTo(18.27f, 15.908f, 18.576f, 15.611f, 18.576f, 15.233f)
        verticalLineTo(12.101f)
        lineTo(19.773f, 13.946f)
        curveTo(19.917f, 14.162f, 20.097f, 14.297f, 20.349f, 14.297f)
        curveTo(20.601f, 14.297f, 20.781f, 14.162f, 20.925f, 13.946f)
        lineTo(22.14f, 12.074f)
        verticalLineTo(15.215f)
        curveTo(22.14f, 15.593f, 22.446f, 15.908f, 22.824f, 15.908f)
        close()
        moveTo(15.678f, 24.908f)
        curveTo(16.056f, 24.908f, 16.362f, 24.602f, 16.362f, 24.224f)
        verticalLineTo(21.713f)
        curveTo(16.362f, 20.552f, 15.75f, 19.94f, 14.733f, 19.94f)
        curveTo(14.076f, 19.94f, 13.572f, 20.21f, 13.149f, 20.705f)
        curveTo(12.897f, 20.219f, 12.42f, 19.94f, 11.79f, 19.94f)
        curveTo(11.097f, 19.94f, 10.683f, 20.309f, 10.368f, 20.714f)
        verticalLineTo(20.66f)
        curveTo(10.368f, 20.282f, 10.062f, 19.976f, 9.684f, 19.976f)
        curveTo(9.306f, 19.976f, 9f, 20.282f, 9f, 20.66f)
        verticalLineTo(24.224f)
        curveTo(9f, 24.602f, 9.306f, 24.908f, 9.684f, 24.908f)
        curveTo(10.062f, 24.908f, 10.368f, 24.602f, 10.368f, 24.224f)
        verticalLineTo(22.163f)
        curveTo(10.368f, 21.515f, 10.683f, 21.182f, 11.196f, 21.182f)
        curveTo(11.709f, 21.182f, 11.997f, 21.515f, 11.997f, 22.163f)
        verticalLineTo(24.224f)
        curveTo(11.997f, 24.602f, 12.303f, 24.908f, 12.681f, 24.908f)
        curveTo(13.059f, 24.908f, 13.365f, 24.602f, 13.365f, 24.224f)
        verticalLineTo(22.163f)
        curveTo(13.365f, 21.515f, 13.68f, 21.182f, 14.193f, 21.182f)
        curveTo(14.706f, 21.182f, 14.994f, 21.515f, 14.994f, 22.163f)
        verticalLineTo(24.224f)
        curveTo(14.994f, 24.602f, 15.3f, 24.908f, 15.678f, 24.908f)
        close()
        moveTo(18.843f, 24.908f)
        curveTo(19.221f, 24.908f, 19.527f, 24.602f, 19.527f, 24.224f)
        verticalLineTo(21.2f)
        horizontalLineTo(20.103f)
        curveTo(20.418f, 21.2f, 20.67f, 20.957f, 20.67f, 20.642f)
        curveTo(20.67f, 20.327f, 20.418f, 20.084f, 20.103f, 20.084f)
        horizontalLineTo(19.509f)
        verticalLineTo(19.895f)
        curveTo(19.509f, 19.535f, 19.689f, 19.373f, 20.004f, 19.373f)
        horizontalLineTo(20.121f)
        curveTo(20.427f, 19.373f, 20.679f, 19.112f, 20.679f, 18.806f)
        curveTo(20.679f, 18.5f, 20.445f, 18.293f, 20.211f, 18.257f)
        curveTo(20.058f, 18.23f, 19.869f, 18.221f, 19.653f, 18.221f)
        curveTo(19.167f, 18.221f, 18.798f, 18.347f, 18.546f, 18.599f)
        curveTo(18.294f, 18.851f, 18.159f, 19.238f, 18.159f, 19.769f)
        verticalLineTo(20.075f)
        horizontalLineTo(18.105f)
        curveTo(17.79f, 20.075f, 17.538f, 20.327f, 17.538f, 20.642f)
        curveTo(17.538f, 20.957f, 17.79f, 21.2f, 18.105f, 21.2f)
        horizontalLineTo(18.159f)
        verticalLineTo(24.224f)
        curveTo(18.159f, 24.602f, 18.465f, 24.908f, 18.843f, 24.908f)
        close()
        moveTo(23.367f, 24.935f)
        curveTo(23.664f, 24.935f, 23.898f, 24.899f, 24.15f, 24.8f)
        curveTo(24.339f, 24.728f, 24.501f, 24.53f, 24.501f, 24.287f)
        curveTo(24.501f, 23.972f, 24.24f, 23.72f, 23.934f, 23.72f)
        curveTo(23.907f, 23.72f, 23.817f, 23.729f, 23.772f, 23.729f)
        curveTo(23.466f, 23.729f, 23.331f, 23.576f, 23.331f, 23.261f)
        verticalLineTo(21.2f)
        horizontalLineTo(23.934f)
        curveTo(24.258f, 21.2f, 24.519f, 20.939f, 24.519f, 20.615f)
        curveTo(24.519f, 20.291f, 24.258f, 20.03f, 23.934f, 20.03f)
        horizontalLineTo(23.331f)
        verticalLineTo(19.427f)
        curveTo(23.331f, 19.049f, 23.025f, 18.743f, 22.647f, 18.743f)
        curveTo(22.269f, 18.743f, 21.963f, 19.049f, 21.963f, 19.427f)
        verticalLineTo(20.03f)
        horizontalLineTo(21.918f)
        curveTo(21.594f, 20.03f, 21.333f, 20.291f, 21.333f, 20.615f)
        curveTo(21.333f, 20.939f, 21.594f, 21.2f, 21.918f, 21.2f)
        horizontalLineTo(21.963f)
        verticalLineTo(23.486f)
        curveTo(21.963f, 24.602f, 22.53f, 24.935f, 23.367f, 24.935f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.UnitFt)
