package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.Settings: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Settings",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.4053f, 6.5f)
        curveTo(20.1932f, 6.5f, 20.8337f, 7.1405f, 20.8337f, 7.9276f)
        verticalLineTo(8.6461f)
        curveTo(21.5744f, 8.8588f, 22.2895f, 9.1546f, 22.9634f, 9.5284f)
        lineTo(23.471f, 9.0208f)
        curveTo(24.0171f, 8.4746f, 24.9423f, 8.4729f, 25.4919f, 9.0208f)
        lineTo(27.4784f, 11.0083f)
        curveTo(27.7476f, 11.2784f, 27.896f, 11.6359f, 27.896f, 12.0183f)
        curveTo(27.896f, 12.4008f, 27.7476f, 12.7592f, 27.4784f, 13.0284f)
        lineTo(26.9717f, 13.5351f)
        curveTo(27.3447f, 14.2073f, 27.6396f, 14.9233f, 27.8531f, 15.6667f)
        horizontalLineTo(28.5716f)
        curveTo(29.3587f, 15.6667f, 29.9991f, 16.3072f, 30f, 17.0943f)
        verticalLineTo(19.9057f)
        curveTo(30f, 20.6928f, 29.3595f, 21.3333f, 28.5716f, 21.3333f)
        horizontalLineTo(27.854f)
        curveTo(27.6413f, 22.0741f, 27.3455f, 22.7892f, 26.9717f, 23.4649f)
        lineTo(27.4793f, 23.9725f)
        curveTo(27.7485f, 24.2426f, 27.8968f, 24.601f, 27.8968f, 24.9817f)
        curveTo(27.8968f, 25.3632f, 27.7485f, 25.7216f, 27.4793f, 25.9917f)
        lineTo(25.4919f, 27.9792f)
        curveTo(24.9534f, 28.5168f, 24.0086f, 28.5159f, 23.4718f, 27.9792f)
        lineTo(22.9643f, 27.4716f)
        curveTo(22.2904f, 27.8454f, 21.5753f, 28.1421f, 20.8337f, 28.3547f)
        verticalLineTo(29.0724f)
        curveTo(20.8337f, 29.8595f, 20.1932f, 30.5f, 19.4053f, 30.5f)
        horizontalLineTo(16.5956f)
        curveTo(15.8077f, 30.5f, 15.1672f, 29.8595f, 15.1672f, 29.0724f)
        verticalLineTo(28.3547f)
        curveTo(14.4273f, 28.1421f, 13.7122f, 27.8463f, 13.0357f, 27.4716f)
        lineTo(12.5282f, 27.9792f)
        curveTo(12.2701f, 28.2381f, 11.9023f, 28.3865f, 11.519f, 28.3865f)
        curveTo(11.1349f, 28.3865f, 10.7671f, 28.2381f, 10.509f, 27.9792f)
        lineTo(8.5216f, 25.9917f)
        curveTo(8.2515f, 25.7216f, 8.1032f, 25.3623f, 8.1032f, 24.9817f)
        curveTo(8.1032f, 24.601f, 8.2515f, 24.2426f, 8.5216f, 23.9725f)
        lineTo(9.0283f, 23.4649f)
        curveTo(8.6553f, 22.7892f, 8.3587f, 22.0741f, 8.146f, 21.3333f)
        horizontalLineTo(7.4284f)
        curveTo(6.6405f, 21.3333f, 6f, 20.6928f, 6f, 19.9057f)
        verticalLineTo(17.0943f)
        curveTo(6f, 16.3072f, 6.6405f, 15.6667f, 7.4284f, 15.6667f)
        horizontalLineTo(8.146f)
        curveTo(8.3587f, 14.9259f, 8.6545f, 14.2099f, 9.0283f, 13.536f)
        lineTo(8.5216f, 13.0284f)
        curveTo(8.2515f, 12.7592f, 8.1032f, 12.4008f, 8.1032f, 12.0192f)
        curveTo(8.1032f, 11.6359f, 8.2515f, 11.2775f, 8.5216f, 11.0092f)
        lineTo(10.5081f, 9.0217f)
        curveTo(11.0474f, 8.4832f, 11.9906f, 8.4832f, 12.5282f, 9.0217f)
        lineTo(13.0349f, 9.5284f)
        curveTo(13.7088f, 9.1554f, 14.4238f, 8.8588f, 15.1672f, 8.6461f)
        verticalLineTo(7.9276f)
        curveTo(15.1672f, 7.1405f, 15.8077f, 6.5f, 16.5947f, 6.5f)
        horizontalLineTo(19.4053f)
        close()
        moveTo(18.0006f, 13.4763f)
        curveTo(15.2304f, 13.4763f, 12.9763f, 15.7305f, 12.9763f, 18.4999f)
        curveTo(12.9763f, 21.2702f, 15.2304f, 23.5235f, 18.0006f, 23.5235f)
        curveTo(20.77f, 23.5235f, 23.0232f, 21.2702f, 23.0232f, 18.4999f)
        curveTo(23.0232f, 15.7305f, 20.77f, 13.4763f, 18.0006f, 13.4763f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Settings)
