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

public val RadialTakIcons.Send: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Send",
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
        moveTo(18.2723f, 6.6799f)
        curveTo(17.7395f, 6.9509f, 17.3948f, 7.4922f, 17.3948f, 8.0936f)
        lineTo(17.394f, 11.887f)
        lineTo(17.1935f, 11.9024f)
        curveTo(15.3863f, 12.0587f, 13.8078f, 12.4627f, 12.4539f, 13.0486f)
        curveTo(11.4078f, 13.5012f, 10.6457f, 13.9912f, 10.1596f, 14.4111f)
        curveTo(7.6501f, 16.3848f, 5.9164f, 19.1689f, 5.2861f, 22.2624f)
        curveTo(4.972f, 23.7524f, 4.9159f, 25.2861f, 5.1215f, 26.8015f)
        lineTo(5.3195f, 27.9028f)
        curveTo(5.439f, 28.5621f, 5.9653f, 29.0729f, 6.631f, 29.1919f)
        curveTo(7.2912f, 29.3099f, 7.9613f, 29.0203f, 8.3144f, 28.456f)
        lineTo(8.8745f, 27.5608f)
        curveTo(10.5077f, 24.9571f, 12.5178f, 23.2526f, 14.8532f, 22.468f)
        lineTo(15.2036f, 22.3572f)
        curveTo(15.7912f, 22.185f, 16.3955f, 22.0745f, 17.0061f, 22.027f)
        lineTo(17.394f, 22.006f)
        lineTo(17.3948f, 25.9227f)
        curveTo(17.3948f, 26.5756f, 17.8009f, 27.1578f, 18.413f, 27.3998f)
        curveTo(19.0143f, 27.6378f, 19.7048f, 27.5047f, 20.1688f, 27.0574f)
        lineTo(29.4658f, 18.0981f)
        curveTo(30.1156f, 17.4719f, 30.113f, 16.4456f, 29.46f, 15.8226f)
        lineTo(20.1629f, 6.9529f)
        curveTo(19.6976f, 6.5092f, 19.0087f, 6.379f, 18.4094f, 6.6179f)
        lineTo(18.2723f, 6.6799f)
        close()
        moveTo(18.9648f, 8.0113f)
        curveTo(19.0217f, 7.9886f, 19.0888f, 8.0013f, 19.1276f, 8.0383f)
        lineTo(28.4246f, 16.9079f)
        curveTo(28.4603f, 16.942f, 28.4604f, 16.9839f, 28.425f, 17.018f)
        lineTo(19.1279f, 25.9774f)
        curveTo(19.0891f, 26.0147f, 19.0221f, 26.0276f, 18.9649f, 26.005f)
        curveTo(18.9184f, 25.9866f, 18.8948f, 25.9528f, 18.8948f, 25.9227f)
        verticalLineTo(20.545f)
        lineTo(18.1798f, 20.5116f)
        curveTo(16.8869f, 20.4512f, 15.5939f, 20.6329f, 14.3735f, 21.0467f)
        curveTo(11.6918f, 21.9477f, 9.4122f, 23.8807f, 7.6033f, 26.7644f)
        lineTo(7.0427f, 27.6604f)
        curveTo(7.0175f, 27.7007f, 6.9577f, 27.7265f, 6.8949f, 27.7153f)
        curveTo(6.8383f, 27.7052f, 6.8017f, 27.6697f, 6.7954f, 27.6352f)
        lineTo(6.6059f, 26.5864f)
        curveTo(6.4254f, 25.2546f, 6.4751f, 23.8938f, 6.7549f, 22.5668f)
        curveTo(7.3148f, 19.8188f, 8.855f, 17.3453f, 11.1136f, 15.5681f)
        curveTo(11.5148f, 15.2226f, 12.1488f, 14.815f, 13.0496f, 14.4252f)
        curveTo(14.4606f, 13.8146f, 16.1634f, 13.4208f, 18.1733f, 13.3441f)
        lineTo(18.8948f, 13.3166f)
        verticalLineTo(8.0936f)
        curveTo(18.8948f, 8.0637f, 18.9183f, 8.0298f, 18.9648f, 8.0113f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.Send)
