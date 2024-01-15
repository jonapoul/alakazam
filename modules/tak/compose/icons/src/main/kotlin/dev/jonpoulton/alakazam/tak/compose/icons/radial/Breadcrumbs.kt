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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RadialTakIcons.Breadcrumbs: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Breadcrumbs",
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
          moveTo(24.5935f, 18.8723f)
          curveTo(25.475f, 18.8723f, 26.1892f, 19.5865f, 26.1892f, 20.4673f)
          curveTo(26.1892f, 21.348f, 25.475f, 22.0622f, 24.5935f, 22.0622f)
          curveTo(24.5342f, 22.0622f, 24.4757f, 22.059f, 24.4181f, 22.0527f)
          lineTo(20.8038f, 26.4207f)
          curveTo(20.8314f, 26.5384f, 20.8461f, 26.6611f, 20.8461f, 26.7871f)
          curveTo(20.8461f, 27.6679f, 20.1319f, 28.3821f, 19.2511f, 28.3821f)
          curveTo(18.3704f, 28.3821f, 17.6562f, 27.6679f, 17.6562f, 26.7871f)
          lineTo(17.661f, 26.668f)
          lineTo(11.4669f, 22.5734f)
          curveTo(11.2689f, 22.665f, 11.0489f, 22.7171f, 10.8168f, 22.7199f)
          lineTo(7.0522f, 28.3112f)
          curveTo(7.1407f, 28.5095f, 7.1899f, 28.7292f, 7.1899f, 28.9604f)
          curveTo(7.1899f, 29.8412f, 6.4757f, 30.5553f, 5.5949f, 30.5553f)
          curveTo(4.7134f, 30.5553f, 4f, 29.8412f, 4f, 28.9604f)
          curveTo(4f, 28.0797f, 4.7134f, 27.3655f, 5.5949f, 27.3655f)
          curveTo(5.6869f, 27.3655f, 5.777f, 27.3732f, 5.8647f, 27.3882f)
          lineTo(9.4776f, 22.0208f)
          curveTo(9.3041f, 21.7655f, 9.2027f, 21.4572f, 9.2027f, 21.1251f)
          curveTo(9.2027f, 20.2443f, 9.9169f, 19.5301f, 10.7976f, 19.5301f)
          curveTo(11.6792f, 19.5301f, 12.3926f, 20.2443f, 12.3926f, 21.1251f)
          curveTo(12.3926f, 21.2095f, 12.386f, 21.2923f, 12.3734f, 21.3732f)
          lineTo(18.4628f, 25.4003f)
          curveTo(18.6953f, 25.2679f, 18.9644f, 25.1922f, 19.2511f, 25.1922f)
          curveTo(19.4416f, 25.1922f, 19.6244f, 25.2256f, 19.7938f, 25.2869f)
          lineTo(23.1756f, 21.1984f)
          curveTo(23.0625f, 20.9794f, 22.9985f, 20.7308f, 22.9985f, 20.4673f)
          curveTo(22.9985f, 19.5865f, 23.7127f, 18.8723f, 24.5935f, 18.8723f)
          close()
          moveTo(24.4744f, 4.5f)
          curveTo(27.0783f, 4.5f, 29.1894f, 6.6111f, 29.1894f, 9.215f)
          curveTo(29.1894f, 10.0676f, 28.7699f, 11.1109f, 28.0257f, 12.3549f)
          curveTo(27.7461f, 12.8223f, 27.4244f, 13.3098f, 27.0686f, 13.8112f)
          curveTo(26.6243f, 14.4373f, 26.1496f, 15.0537f, 25.675f, 15.6351f)
          curveTo(25.6196f, 15.703f, 25.5655f, 15.7688f, 25.5129f, 15.8323f)
          lineTo(25.2154f, 16.1864f)
          lineTo(24.4745f, 17.0303f)
          lineTo(23.9122f, 16.3934f)
          lineTo(23.436f, 15.8324f)
          lineTo(22.9182f, 15.193f)
          curveTo(22.5636f, 14.7449f, 22.2132f, 14.2808f, 21.8799f, 13.8112f)
          curveTo(21.524f, 13.3098f, 21.2023f, 12.8224f, 20.9226f, 12.355f)
          curveTo(20.1783f, 11.111f, 19.7586f, 10.0677f, 19.7586f, 9.215f)
          curveTo(19.7586f, 6.6112f, 21.8704f, 4.5f, 24.4744f, 4.5f)
          close()
          moveTo(24.4744f, 6f)
          curveTo(22.6988f, 6f, 21.2586f, 7.4397f, 21.2586f, 9.215f)
          curveTo(21.2586f, 9.7207f, 21.5955f, 10.558f, 22.2098f, 11.5849f)
          curveTo(22.4679f, 12.0162f, 22.7685f, 12.4717f, 23.1031f, 12.943f)
          curveTo(23.5262f, 13.5391f, 23.981f, 14.1295f, 24.4357f, 14.6865f)
          lineTo(24.4745f, 14.7334f)
          lineTo(24.8535f, 14.263f)
          curveTo(25.0798f, 13.977f, 25.3042f, 13.6844f, 25.5226f, 13.3887f)
          lineTo(25.8453f, 12.9431f)
          curveTo(26.1798f, 12.4717f, 26.4804f, 12.0163f, 26.7384f, 11.5849f)
          curveTo(27.3527f, 10.5581f, 27.6894f, 9.7207f, 27.6894f, 9.215f)
          curveTo(27.6894f, 7.4395f, 26.2499f, 6f, 24.4744f, 6f)
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
          moveTo(33.1404f, 1.5237f)
          horizontalLineTo(-0.8596f)
          verticalLineTo(35.5237f)
          horizontalLineTo(33.1404f)
          verticalLineTo(1.5237f)
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
private fun Preview() = PreviewIcon(icon = RadialTakIcons.Breadcrumbs)
