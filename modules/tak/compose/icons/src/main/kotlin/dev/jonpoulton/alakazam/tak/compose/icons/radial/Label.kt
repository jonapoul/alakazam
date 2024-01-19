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

public val RadialTakIcons.Label: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Label",
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
          moveTo(25.0035f, 5.5204f)
          curveTo(25.8236f, 5.4188f, 26.6436f, 5.7006f, 27.2281f, 6.2851f)
          lineTo(28.0494f, 7.1055f)
          curveTo(28.6053f, 7.6614f, 28.8889f, 8.4327f, 28.8254f, 9.2162f)
          lineTo(28.3408f, 15.2375f)
          curveTo(28.2906f, 15.8715f, 28.0146f, 16.4687f, 27.5648f, 16.9185f)
          lineTo(15.6741f, 28.8092f)
          curveTo(14.6269f, 29.8552f, 12.93f, 29.8552f, 11.8837f, 28.809f)
          lineTo(5.7847f, 22.7108f)
          curveTo(4.7384f, 21.6646f, 4.7384f, 19.9677f, 5.7847f, 18.9201f)
          lineTo(17.7086f, 6.9963f)
          curveTo(18.13f, 6.5748f, 18.68f, 6.3064f, 19.2736f, 6.2316f)
          lineTo(25.0035f, 5.5204f)
          close()
          moveTo(25.3233f, 7f)
          lineTo(25.1881f, 7.009f)
          lineTo(19.4598f, 7.72f)
          curveTo(19.1973f, 7.753f, 18.9547f, 7.8715f, 18.7692f, 8.0569f)
          lineTo(6.8457f, 19.9805f)
          curveTo(6.3848f, 20.442f, 6.3848f, 21.1896f, 6.8453f, 21.6501f)
          lineTo(12.9443f, 27.7483f)
          curveTo(13.4049f, 28.2089f, 14.1526f, 28.2089f, 14.6137f, 27.7483f)
          lineTo(26.5041f, 15.8579f)
          curveTo(26.7019f, 15.6601f, 26.8235f, 15.3969f, 26.8456f, 15.1181f)
          lineTo(27.3303f, 9.0954f)
          curveTo(27.3583f, 8.7502f, 27.2335f, 8.4109f, 26.9891f, 8.1665f)
          lineTo(26.1675f, 7.3458f)
          curveTo(25.9099f, 7.0882f, 25.5492f, 6.9643f, 25.1881f, 7.009f)
          lineTo(25.3233f, 7f)
          close()
          moveTo(21.1764f, 9.4717f)
          curveTo(22.2165f, 8.4316f, 23.9028f, 8.4316f, 24.9439f, 9.4714f)
          curveTo(25.9853f, 10.5117f, 25.9853f, 12.1996f, 24.9442f, 13.2395f)
          curveTo(23.9031f, 14.2806f, 22.2163f, 14.2806f, 21.1767f, 13.2398f)
          curveTo(20.1352f, 12.1996f, 20.1352f, 10.5117f, 21.1764f, 9.4717f)
          close()
          moveTo(23.7822f, 10.4422f)
          curveTo(23.3247f, 10.0803f, 22.659f, 10.1104f, 22.2367f, 10.5327f)
          curveTo(21.7819f, 10.987f, 21.7819f, 11.7242f, 22.2374f, 12.1792f)
          curveTo(22.6917f, 12.6341f, 23.4283f, 12.6341f, 23.8838f, 12.1785f)
          curveTo(24.3387f, 11.7242f, 24.3387f, 10.987f, 23.8838f, 10.5327f)
          lineTo(23.7822f, 10.4422f)
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
          moveTo(35.0891f, 0.5885f)
          horizontalLineTo(1.0891f)
          verticalLineTo(34.5885f)
          horizontalLineTo(35.0891f)
          verticalLineTo(0.5885f)
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
private fun Preview() = PreviewIcon(icon = RadialTakIcons.Label)
