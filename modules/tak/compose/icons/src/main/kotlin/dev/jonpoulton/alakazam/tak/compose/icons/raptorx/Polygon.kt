package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

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
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RaptorXTakIcons.Polygon: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Polygon",
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
        moveTo(24.5134f, 20.3428f)
        curveTo(24.8931f, 20.3428f, 25.2069f, 20.6249f, 25.2566f, 20.991f)
        lineTo(25.2634f, 21.0928f)
        verticalLineTo(27.1646f)
        curveTo(25.2634f, 27.5788f, 24.9276f, 27.9146f, 24.5134f, 27.9146f)
        curveTo(24.1337f, 27.9146f, 23.8199f, 27.6324f, 23.7703f, 27.2664f)
        lineTo(23.7634f, 27.1646f)
        verticalLineTo(21.0928f)
        curveTo(23.7634f, 20.6786f, 24.0992f, 20.3428f, 24.5134f, 20.3428f)
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
        moveTo(13.2951f, 1.8228f)
        curveTo(13.4378f, 1.7549f, 13.5972f, 1.7342f, 13.7508f, 1.762f)
        lineTo(13.8645f, 1.7919f)
        lineTo(28.0682f, 6.749f)
        curveTo(28.3817f, 6.8584f, 28.5817f, 7.1584f, 28.5707f, 7.482f)
        lineTo(28.5591f, 7.5906f)
        lineTo(26.5987f, 18.4295f)
        curveTo(26.525f, 18.8371f, 26.1348f, 19.1077f, 25.7272f, 19.034f)
        curveTo(25.3536f, 18.9665f, 25.095f, 18.633f, 25.1113f, 18.2639f)
        lineTo(25.1227f, 18.1625f)
        lineTo(26.968f, 7.954f)
        lineTo(13.661f, 3.309f)
        lineTo(3.118f, 8.326f)
        lineTo(11.3324f, 20.1843f)
        curveTo(11.5226f, 20.4589f, 11.5063f, 20.8216f, 11.304f, 21.0768f)
        lineTo(11.2297f, 21.1576f)
        lineTo(4.138f, 27.827f)
        lineTo(18.8458f, 26.2626f)
        curveTo(19.2233f, 26.2224f, 19.5652f, 26.4697f, 19.6533f, 26.8285f)
        lineTo(19.6709f, 26.929f)
        curveTo(19.7111f, 27.3066f, 19.4637f, 27.6484f, 19.105f, 27.7366f)
        lineTo(19.0045f, 27.7541f)
        lineTo(2.0794f, 29.5551f)
        curveTo(1.3987f, 29.6276f, 1.0016f, 28.8367f, 1.4176f, 28.3359f)
        lineTo(1.4862f, 28.263f)
        lineTo(9.731f, 20.507f)
        lineTo(1.3835f, 8.4556f)
        curveTo(1.1405f, 8.1047f, 1.2411f, 7.63f, 1.5864f, 7.4028f)
        lineTo(1.6778f, 7.3513f)
        lineTo(13.2951f, 1.8228f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.Polygon)
