package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val UtilityTakIcons.Video: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Video",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(25f, 10.4282f)
        curveTo(25f, 9.9665f, 24.8465f, 9.5841f, 24.4355f, 9.337f)
        curveTo(23.9986f, 9.0769f, 23.5655f, 9.1341f, 23.1519f, 9.3851f)
        curveTo(22.5536f, 9.7493f, 21.9645f, 10.1277f, 21.3701f, 10.4984f)
        curveTo(20.6522f, 10.9471f, 19.9395f, 11.3945f, 19.1696f, 11.8692f)
        curveTo(19.1696f, 11.1955f, 19.1423f, 10.5686f, 19.1696f, 9.9535f)
        curveTo(19.2333f, 8.7739f, 18.2878f, 8.0027f, 17.2318f, 8.0027f)
        curveTo(13.4654f, 8.0027f, 9.699f, 8.0027f, 5.9326f, 8.0027f)
        curveTo(5.6781f, 7.9979f, 5.4251f, 8.0444f, 5.189f, 8.1395f)
        curveTo(4.9528f, 8.2345f, 4.7381f, 8.3761f, 4.5578f, 8.5558f)
        curveTo(4.3775f, 8.7355f, 4.2351f, 8.9497f, 4.1393f, 9.1856f)
        curveTo(4.0435f, 9.4215f, 3.9961f, 9.6742f, 4f, 9.9288f)
        curveTo(4.0329f, 13.2998f, 4.0329f, 16.6717f, 4f, 20.0444f)
        curveTo(3.9909f, 21.2149f, 4.8896f, 21.9719f, 5.9365f, 21.9693f)
        curveTo(6.618f, 21.9719f, 7.2982f, 21.9719f, 7.9771f, 21.9719f)
        curveTo(11.075f, 21.9719f, 14.1725f, 21.9719f, 17.2695f, 21.9719f)
        curveTo(18.3984f, 21.9719f, 19.1657f, 21.1915f, 19.1683f, 20.0887f)
        curveTo(19.1683f, 19.4462f, 19.1683f, 18.8037f, 19.1683f, 18.117f)
        curveTo(19.2684f, 18.1743f, 19.3335f, 18.2068f, 19.3959f, 18.2471f)
        curveTo(20.6375f, 19.0222f, 21.8791f, 19.7991f, 23.1207f, 20.5777f)
        curveTo(23.5278f, 20.8378f, 23.9426f, 20.8911f, 24.3731f, 20.6674f)
        curveTo(24.8231f, 20.4333f, 25f, 20.0418f, 24.9987f, 19.5489f)
        curveTo(24.9987f, 16.5056f, 24.9991f, 13.4654f, 25f, 10.4282f)
        close()
        moveTo(17.0679f, 20.2291f)
        curveTo(15.2471f, 20.2161f, 13.4264f, 20.2291f, 11.5965f, 20.2291f)
        curveTo(9.7666f, 20.2291f, 7.9549f, 20.2291f, 6.1251f, 20.2291f)
        curveTo(5.8585f, 20.2291f, 5.7518f, 20.1836f, 5.7531f, 19.8806f)
        curveTo(5.7644f, 16.6179f, 5.7644f, 13.354f, 5.7531f, 10.0887f)
        curveTo(5.7531f, 9.8286f, 5.8208f, 9.7428f, 6.0939f, 9.7428f)
        curveTo(9.7528f, 9.7515f, 13.4108f, 9.7515f, 17.0679f, 9.7428f)
        curveTo(17.3618f, 9.7428f, 17.4243f, 9.8299f, 17.4243f, 10.1082f)
        curveTo(17.4156f, 13.3614f, 17.4156f, 16.6127f, 17.4243f, 19.8624f)
        curveTo(17.4282f, 20.1511f, 17.3579f, 20.2317f, 17.0679f, 20.2291f)
        close()
        moveTo(23.2377f, 18.5566f)
        curveTo(22.8645f, 18.3993f, 22.5536f, 18.1586f, 22.2233f, 17.9571f)
        curveTo(21.2869f, 17.3835f, 20.3609f, 16.7866f, 19.4258f, 16.2169f)
        curveTo(19.3406f, 16.1759f, 19.2701f, 16.1098f, 19.2236f, 16.0275f)
        curveTo(19.1771f, 15.9452f, 19.1569f, 15.8506f, 19.1657f, 15.7565f)
        curveTo(19.1852f, 15.2181f, 19.1761f, 14.6797f, 19.1657f, 14.1412f)
        curveTo(19.1576f, 14.078f, 19.1683f, 14.0138f, 19.1966f, 13.9567f)
        curveTo(19.2248f, 13.8995f, 19.2692f, 13.852f, 19.3244f, 13.82f)
        curveTo(20.6032f, 13.0267f, 21.8834f, 12.2325f, 23.1649f, 11.4374f)
        curveTo(23.1805f, 11.4283f, 23.2052f, 11.4374f, 23.2377f, 11.4374f)
        verticalLineTo(18.5566f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.Video)
