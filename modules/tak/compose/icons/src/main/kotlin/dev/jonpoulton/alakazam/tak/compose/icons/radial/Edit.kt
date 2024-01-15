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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RadialTakIcons.Edit: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Edit",
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
        moveTo(20.4206f, 7.6277f)
        lineTo(7.1922f, 20.12f)
        curveTo(7.0056f, 20.2963f, 6.8691f, 20.5175f, 6.7972f, 20.7625f)
        lineTo(5.0576f, 26.6933f)
        curveTo(4.906f, 27.2086f, 5.0599f, 27.7606f, 5.452f, 28.1315f)
        curveTo(5.8313f, 28.4892f, 6.3735f, 28.6241f, 6.8793f, 28.4919f)
        lineTo(13.1597f, 26.8488f)
        curveTo(13.4042f, 26.7849f, 13.6285f, 26.6614f, 13.8113f, 26.4888f)
        lineTo(27.0394f, 13.9961f)
        curveTo(28.6537f, 12.4683f, 28.6537f, 9.9772f, 27.04f, 8.4499f)
        lineTo(26.1693f, 7.6277f)
        curveTo(24.5772f, 6.1241f, 22.0128f, 6.1241f, 20.4206f, 7.6277f)
        close()
        moveTo(25.1394f, 8.7182f)
        lineTo(26.0095f, 9.5399f)
        curveTo(26.9974f, 10.4749f, 26.9974f, 11.9706f, 26.0089f, 12.9061f)
        lineTo(12.7801f, 25.3976f)
        lineTo(6.5202f, 27.035f)
        lineTo(8.2312f, 21.2f)
        lineTo(21.4505f, 8.7182f)
        curveTo(22.4646f, 7.7606f, 24.1254f, 7.7606f, 25.1394f, 8.7182f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.Edit)
