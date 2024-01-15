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

public val UtilityTakIcons.Watercraft: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Watercraft",
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
        moveTo(6.9253f, 6.6243f)
        verticalLineTo(11.4359f)
        lineTo(14.0367f, 9.0156f)
        lineTo(14.5852f, 8.8289f)
        lineTo(15.1336f, 9.0156f)
        lineTo(22.2448f, 11.4359f)
        verticalLineTo(6.6243f)
        horizontalLineTo(6.9253f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(23.6734f, 25.277f)
        curveTo(23.3748f, 25.4893f, 23.2103f, 25.6063f, 22.7976f, 25.6063f)
        curveTo(22.3849f, 25.6063f, 22.2204f, 25.4893f, 21.9219f, 25.277f)
        curveTo(21.5395f, 25.0051f, 21.0159f, 24.6329f, 20.0597f, 24.6329f)
        curveTo(19.1035f, 24.6329f, 18.5799f, 25.0052f, 18.1976f, 25.2771f)
        curveTo(17.8991f, 25.4894f, 17.7348f, 25.6063f, 17.3221f, 25.6063f)
        curveTo(16.9094f, 25.6063f, 16.745f, 25.4894f, 16.4465f, 25.2771f)
        curveTo(16.0641f, 25.0052f, 15.5406f, 24.6329f, 14.5844f, 24.6329f)
        curveTo(13.6282f, 24.6329f, 13.1047f, 25.0052f, 12.7224f, 25.2771f)
        curveTo(12.4239f, 25.4894f, 12.2595f, 25.6063f, 11.8469f, 25.6063f)
        curveTo(11.4343f, 25.6063f, 11.2698f, 25.4894f, 10.9714f, 25.2771f)
        curveTo(10.5891f, 25.0052f, 10.0655f, 24.6329f, 9.1094f, 24.6329f)
        curveTo(8.1532f, 24.6329f, 7.6296f, 25.0052f, 7.2473f, 25.2771f)
        curveTo(6.9488f, 25.4894f, 6.7845f, 25.6063f, 6.3718f, 25.6063f)
        curveTo(5.9592f, 25.6063f, 5.7948f, 25.4894f, 5.4963f, 25.2771f)
        curveTo(5.114f, 25.0052f, 4.5904f, 24.6329f, 3.6343f, 24.6329f)
        verticalLineTo(26.335f)
        curveTo(4.0469f, 26.335f, 4.2113f, 26.452f, 4.5098f, 26.6642f)
        curveTo(4.8921f, 26.9361f, 5.4156f, 27.3084f, 6.3718f, 27.3084f)
        curveTo(7.328f, 27.3084f, 7.8516f, 26.9361f, 8.2339f, 26.6642f)
        curveTo(8.5324f, 26.4519f, 8.6968f, 26.335f, 9.1095f, 26.335f)
        curveTo(9.5221f, 26.335f, 9.6866f, 26.4519f, 9.985f, 26.6642f)
        curveTo(10.3673f, 26.9361f, 10.8908f, 27.3084f, 11.847f, 27.3084f)
        curveTo(12.8032f, 27.3084f, 13.3268f, 26.936f, 13.709f, 26.6642f)
        curveTo(14.0075f, 26.4519f, 14.1719f, 26.335f, 14.5845f, 26.335f)
        curveTo(14.9972f, 26.335f, 15.1616f, 26.4519f, 15.4601f, 26.6642f)
        curveTo(15.8425f, 26.9361f, 16.366f, 27.3084f, 17.3222f, 27.3084f)
        curveTo(18.2784f, 27.3084f, 18.8019f, 26.9361f, 19.1842f, 26.6642f)
        curveTo(19.4827f, 26.4519f, 19.6471f, 26.335f, 20.0598f, 26.335f)
        curveTo(20.4725f, 26.335f, 20.637f, 26.4519f, 20.9356f, 26.6642f)
        curveTo(21.3179f, 26.9361f, 21.8415f, 27.3084f, 22.7977f, 27.3084f)
        curveTo(23.754f, 27.3084f, 24.2776f, 26.936f, 24.6599f, 26.6642f)
        curveTo(24.9585f, 26.4519f, 25.123f, 26.335f, 25.5357f, 26.335f)
        verticalLineTo(24.6328f)
        curveTo(24.5794f, 24.6328f, 24.0557f, 25.0051f, 23.6734f, 25.277f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(15.436f, 2.5134f)
        verticalLineTo(1.2084f)
        horizontalLineTo(13.7338f)
        verticalLineTo(2.5134f)
        horizontalLineTo(9.7053f)
        verticalLineTo(4.9222f)
        horizontalLineTo(19.5212f)
        verticalLineTo(2.5134f)
        horizontalLineTo(15.436f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(3.9785f, 14.237f)
        lineTo(7.5805f, 23.1767f)
        curveTo(7.9978f, 23.0328f, 8.5026f, 22.9306f, 9.1095f, 22.9306f)
        curveTo(10.4985f, 22.9306f, 11.3537f, 23.466f, 11.847f, 23.8113f)
        curveTo(12.2301f, 23.543f, 12.8332f, 23.1612f, 13.7338f, 23.0036f)
        verticalLineTo(10.9167f)
        lineTo(3.9785f, 14.237f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(15.436f, 10.9167f)
        verticalLineTo(23.0037f)
        curveTo(16.3363f, 23.1614f, 16.9391f, 23.5432f, 17.3221f, 23.8114f)
        curveTo(17.8153f, 23.466f, 18.6706f, 22.9306f, 20.0597f, 22.9306f)
        curveTo(20.65f, 22.9306f, 21.1431f, 23.0278f, 21.5538f, 23.1654f)
        lineTo(25.1952f, 14.2382f)
        lineTo(15.436f, 10.9167f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.Watercraft)
