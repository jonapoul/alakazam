package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.Numeric: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Numeric",
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
        pathFillType = NonZero,
      ) {
        moveTo(14.3635f, 19.812f)
        curveTo(15.4438f, 19.812f, 15.984f, 19.3489f, 15.984f, 18.4226f)
        curveTo(15.984f, 17.972f, 15.8536f, 17.634f, 15.5928f, 17.4087f)
        curveTo(15.3321f, 17.1834f, 14.9223f, 17.0707f, 14.3635f, 17.0707f)
        horizontalLineTo(12.8361f)
        verticalLineTo(8.171f)
        curveTo(12.8361f, 7.6578f, 12.6839f, 7.251f, 12.3797f, 6.9506f)
        curveTo(12.0755f, 6.6502f, 11.675f, 6.5f, 11.1783f, 6.5f)
        curveTo(10.694f, 6.5f, 10.1786f, 6.6565f, 9.6322f, 6.9694f)
        lineTo(6.6519f, 8.7155f)
        curveTo(6.2173f, 8.9784f, 6f, 9.3664f, 6f, 9.8796f)
        curveTo(6f, 10.2551f, 6.1242f, 10.5962f, 6.3725f, 10.9029f)
        curveTo(6.6209f, 11.2096f, 6.9189f, 11.3629f, 7.2666f, 11.3629f)
        curveTo(7.4901f, 11.3629f, 7.7075f, 11.3003f, 7.9186f, 11.1752f)
        lineTo(9.4087f, 10.2927f)
        verticalLineTo(17.0707f)
        horizontalLineTo(7.8999f)
        curveTo(7.3411f, 17.0707f, 6.9313f, 17.1834f, 6.6706f, 17.4087f)
        curveTo(6.4098f, 17.634f, 6.2794f, 17.972f, 6.2794f, 18.4226f)
        curveTo(6.2794f, 19.3489f, 6.8196f, 19.812f, 7.8999f, 19.812f)
        horizontalLineTo(14.3635f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(27.9345f, 30.5f)
        curveTo(28.4798f, 30.5f, 28.8858f, 30.3881f, 29.1523f, 30.1644f)
        curveTo(29.4187f, 29.9407f, 29.552f, 29.5926f, 29.552f, 29.1203f)
        curveTo(29.552f, 28.6604f, 29.4187f, 28.3217f, 29.1523f, 28.1042f)
        curveTo(28.8858f, 27.8867f, 28.4798f, 27.7779f, 27.9345f, 27.7779f)
        horizontalLineTo(24.1974f)
        lineTo(26.8375f, 25.0745f)
        curveTo(27.5688f, 24.3039f, 28.0863f, 23.6047f, 28.39f, 22.977f)
        curveTo(28.6937f, 22.3493f, 28.8455f, 21.6564f, 28.8455f, 20.8982f)
        curveTo(28.8455f, 20.1649f, 28.6565f, 19.5154f, 28.2784f, 18.9499f)
        curveTo(27.9004f, 18.3843f, 27.3643f, 17.9493f, 26.6702f, 17.6448f)
        curveTo(25.9761f, 17.3402f, 25.1704f, 17.188f, 24.2532f, 17.188f)
        curveTo(23.5467f, 17.188f, 22.8309f, 17.2999f, 22.1058f, 17.5236f)
        curveTo(21.3807f, 17.7473f, 20.7269f, 18.0581f, 20.1444f, 18.4558f)
        curveTo(19.9212f, 18.605f, 19.7694f, 18.7665f, 19.6888f, 18.9405f)
        curveTo(19.6083f, 19.1146f, 19.568f, 19.3383f, 19.568f, 19.6117f)
        curveTo(19.568f, 19.9971f, 19.6733f, 20.3295f, 19.8841f, 20.6092f)
        curveTo(20.0948f, 20.8889f, 20.3551f, 21.0287f, 20.6649f, 21.0287f)
        curveTo(20.7889f, 21.0287f, 20.9066f, 21.0101f, 21.0182f, 20.9728f)
        curveTo(21.1297f, 20.9355f, 21.2568f, 20.8764f, 21.3993f, 20.7957f)
        curveTo(21.5419f, 20.7149f, 21.6379f, 20.662f, 21.6875f, 20.6372f)
        lineTo(22.0593f, 20.4507f)
        curveTo(22.456f, 20.2519f, 22.8061f, 20.0996f, 23.1098f, 19.9939f)
        curveTo(23.4135f, 19.8883f, 23.745f, 19.8355f, 24.1045f, 19.8355f)
        curveTo(24.5507f, 19.8355f, 24.8947f, 19.9473f, 25.1364f, 20.1711f)
        curveTo(25.378f, 20.3948f, 25.4989f, 20.718f, 25.4989f, 21.1406f)
        curveTo(25.4989f, 21.8615f, 25.0899f, 22.6508f, 24.2718f, 23.5084f)
        lineTo(20.3303f, 27.6288f)
        curveTo(19.9088f, 28.0638f, 19.6981f, 28.5486f, 19.6981f, 29.083f)
        curveTo(19.6981f, 29.4932f, 19.8283f, 29.8319f, 20.0886f, 30.0991f)
        curveTo(20.3489f, 30.3664f, 20.7021f, 30.5f, 21.1483f, 30.5f)
        horizontalLineTo(27.9345f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Numeric)
