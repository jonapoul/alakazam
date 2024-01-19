package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.Lock: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Lock",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      group {
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(17.3845f, 4.5f)
          curveTo(17.7642f, 4.5f, 18.078f, 4.7821f, 18.1277f, 5.1482f)
          lineTo(18.1345f, 5.25f)
          lineTo(18.1342f, 6.8224f)
          curveTo(23.6595f, 7.1913f, 28.0772f, 11.6085f, 28.4467f, 17.1338f)
          lineTo(30.0181f, 17.1345f)
          curveTo(30.4323f, 17.1345f, 30.7681f, 17.4703f, 30.7681f, 17.8845f)
          curveTo(30.7681f, 18.2642f, 30.4859f, 18.578f, 30.1198f, 18.6276f)
          lineTo(30.0181f, 18.6345f)
          lineTo(28.4467f, 18.6343f)
          curveTo(28.0777f, 24.1602f, 23.6599f, 28.5778f, 18.1342f, 28.9468f)
          lineTo(18.1345f, 30.5191f)
          curveTo(18.1345f, 30.9333f, 17.7988f, 31.2691f, 17.3845f, 31.2691f)
          curveTo(17.0049f, 31.2691f, 16.6911f, 30.9869f, 16.6414f, 30.6208f)
          lineTo(16.6345f, 30.5191f)
          lineTo(16.6338f, 28.9467f)
          curveTo(11.1079f, 28.5773f, 6.6904f, 24.16f, 6.3214f, 18.6343f)
          lineTo(4.7499f, 18.6345f)
          curveTo(4.3357f, 18.6345f, 3.9999f, 18.2987f, 3.9999f, 17.8845f)
          curveTo(3.9999f, 17.5048f, 4.282f, 17.191f, 4.6481f, 17.1413f)
          lineTo(4.7499f, 17.1345f)
          lineTo(6.3215f, 17.1338f)
          curveTo(6.6909f, 11.6086f, 11.1083f, 7.1919f, 16.6338f, 6.8224f)
          lineTo(16.6345f, 5.25f)
          curveTo(16.6345f, 4.8358f, 16.9703f, 4.5f, 17.3845f, 4.5f)
          close()
          moveTo(18.1348f, 8.3264f)
          lineTo(18.1345f, 9.8452f)
          curveTo(18.1345f, 10.2595f, 17.7988f, 10.5952f, 17.3845f, 10.5952f)
          curveTo(17.0049f, 10.5952f, 16.6911f, 10.3131f, 16.6414f, 9.947f)
          lineTo(16.6345f, 9.8452f)
          lineTo(16.6342f, 8.3264f)
          curveTo(11.9371f, 8.6899f, 8.189f, 12.4376f, 7.8254f, 17.1343f)
          lineTo(9.3442f, 17.1345f)
          curveTo(9.7584f, 17.1345f, 10.0942f, 17.4703f, 10.0942f, 17.8845f)
          curveTo(10.0942f, 18.2642f, 9.812f, 18.578f, 9.4459f, 18.6276f)
          lineTo(9.3442f, 18.6345f)
          lineTo(7.8254f, 18.6349f)
          curveTo(8.189f, 23.3315f, 11.9371f, 27.0792f, 16.6342f, 27.4428f)
          lineTo(16.6345f, 25.9248f)
          curveTo(16.6345f, 25.5106f, 16.9703f, 25.1748f, 17.3845f, 25.1748f)
          curveTo(17.7642f, 25.1748f, 18.078f, 25.4569f, 18.1277f, 25.823f)
          lineTo(18.1345f, 25.9248f)
          lineTo(18.1348f, 27.4428f)
          curveTo(22.8311f, 27.0792f, 26.5792f, 23.3314f, 26.9428f, 18.6348f)
          lineTo(25.4238f, 18.6345f)
          curveTo(25.0096f, 18.6345f, 24.6738f, 18.2987f, 24.6738f, 17.8845f)
          curveTo(24.6738f, 17.5048f, 24.9559f, 17.191f, 25.322f, 17.1413f)
          lineTo(25.4238f, 17.1345f)
          lineTo(26.9428f, 17.1343f)
          curveTo(26.5792f, 12.4377f, 22.8311f, 8.6899f, 18.1348f, 8.3264f)
          close()
          moveTo(17.3845f, 11.9212f)
          curveTo(18.7276f, 11.9212f, 19.8335f, 12.9734f, 19.9198f, 14.2954f)
          lineTo(19.9253f, 14.462f)
          lineTo(19.9249f, 15.404f)
          lineTo(20.8193f, 15.4041f)
          curveTo(21.1989f, 15.4041f, 21.5127f, 15.6862f, 21.5624f, 16.0523f)
          lineTo(21.5693f, 16.1541f)
          verticalLineTo(22.7239f)
          curveTo(21.5693f, 23.1381f, 21.2335f, 23.4739f, 20.8193f, 23.4739f)
          horizontalLineTo(13.9479f)
          curveTo(13.5337f, 23.4739f, 13.1979f, 23.1381f, 13.1979f, 22.7239f)
          verticalLineTo(16.1541f)
          curveTo(13.1979f, 15.7398f, 13.5337f, 15.4041f, 13.9479f, 15.4041f)
          lineTo(14.8419f, 15.404f)
          lineTo(14.8427f, 14.462f)
          curveTo(14.8427f, 13.1189f, 15.8949f, 12.013f, 17.2169f, 11.9266f)
          lineTo(17.3845f, 11.9212f)
          close()
          moveTo(20.0689f, 16.9034f)
          horizontalLineTo(14.6979f)
          verticalLineTo(21.9734f)
          horizontalLineTo(20.0689f)
          verticalLineTo(16.9034f)
          close()
          moveTo(17.3845f, 13.4212f)
          curveTo(16.8509f, 13.4212f, 16.4058f, 13.8307f, 16.3488f, 14.3493f)
          lineTo(16.3427f, 14.462f)
          lineTo(16.3419f, 15.404f)
          horizontalLineTo(18.4249f)
          lineTo(18.4253f, 14.462f)
          curveTo(18.4253f, 13.9294f, 18.0157f, 13.4843f, 17.4971f, 13.4274f)
          lineTo(17.3845f, 13.4212f)
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
          moveTo(34.032f, 0.5324f)
          horizontalLineTo(0.032f)
          verticalLineTo(34.5324f)
          horizontalLineTo(34.032f)
          verticalLineTo(0.5324f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.Lock)
