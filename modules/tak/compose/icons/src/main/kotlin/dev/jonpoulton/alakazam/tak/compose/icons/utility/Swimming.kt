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
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons

public val UtilityTakIcons.Swimming: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Swimming",
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
        moveTo(5.142f, 8.2748f)
        lineTo(11.0104f, 9.0257f)
        curveTo(11.2152f, 9.5433f, 12.2471f, 12.091f, 12.4411f, 12.5469f)
        curveTo(12.4411f, 12.5469f, 12.4411f, 12.5469f, 12.4384f, 12.5469f)
        curveTo(10.7383f, 13.3836f, 9.0381f, 14.2177f, 7.3379f, 15.0544f)
        curveTo(7.928f, 14.9471f, 8.5262f, 14.8935f, 9.127f, 14.8935f)
        curveTo(9.9138f, 14.8935f, 10.6844f, 14.9873f, 11.4199f, 15.1724f)
        curveTo(12.9045f, 15.5478f, 14.2463f, 16.1485f, 15.5423f, 16.7305f)
        curveTo(16.6982f, 17.2481f, 17.7921f, 17.7389f, 18.8834f, 18.0205f)
        curveTo(19.037f, 18.0607f, 19.1851f, 18.0956f, 19.3333f, 18.125f)
        curveTo(18.04f, 15.4888f, 14.5616f, 8.3848f, 13.8745f, 6.8213f)
        curveTo(13.5512f, 6.0838f, 13.1066f, 5.8102f, 12.4762f, 5.7298f)
        lineTo(5.5839f, 4.8475f)
        curveTo(4.6328f, 4.7268f, 3.7625f, 5.3945f, 3.6386f, 6.3412f)
        curveTo(3.52f, 7.2879f, 4.1909f, 8.1541f, 5.142f, 8.2748f)
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
        moveTo(1.6793f, 22.2776f)
        curveTo(1.8799f, 22.4272f, 2.1086f, 22.4976f, 2.3374f, 22.4976f)
        curveTo(2.3882f, 22.4976f, 2.4362f, 22.4947f, 2.4843f, 22.4859f)
        curveTo(2.7836f, 22.4448f, 3.0661f, 22.2805f, 3.2553f, 22.0076f)
        curveTo(3.9868f, 20.9483f, 5.1194f, 20.115f, 6.4384f, 19.6572f)
        curveTo(7.1953f, 19.3961f, 7.9861f, 19.2641f, 8.7628f, 19.2641f)
        curveTo(11.5787f, 19.2641f, 13.9936f, 21.0129f, 16.5355f, 22.0193f)
        curveTo(17.8968f, 22.5592f, 19.3175f, 22.9583f, 20.8624f, 22.9583f)
        curveTo(21.512f, 22.9583f, 22.1842f, 22.8879f, 22.8818f, 22.7265f)
        curveTo(24.5228f, 22.3509f, 25.9293f, 21.5411f, 26.9461f, 20.4055f)
        curveTo(27.189f, 20.1326f, 27.4093f, 19.845f, 27.6042f, 19.5369f)
        curveTo(27.9488f, 18.997f, 27.8047f, 18.2693f, 27.285f, 17.9113f)
        curveTo(27.093f, 17.7793f, 26.8783f, 17.7177f, 26.6637f, 17.7177f)
        curveTo(26.2965f, 17.7177f, 25.9378f, 17.9025f, 25.7203f, 18.2429f)
        curveTo(25.6328f, 18.3808f, 25.5367f, 18.5128f, 25.4322f, 18.642f)
        curveTo(24.7261f, 19.5164f, 23.667f, 20.1443f, 22.396f, 20.4348f)
        curveTo(21.2239f, 20.7019f, 19.9304f, 20.6226f, 18.7752f, 20.3116f)
        curveTo(17.5607f, 19.983f, 16.3858f, 19.4342f, 15.1374f, 18.8503f)
        curveTo(13.81f, 18.2312f, 12.4401f, 17.5885f, 10.9546f, 17.1954f)
        curveTo(10.2485f, 17.0076f, 9.5085f, 16.9166f, 8.76f, 16.9166f)
        curveTo(7.7404f, 16.9166f, 6.7039f, 17.0897f, 5.7182f, 17.4301f)
        curveTo(4.8567f, 17.7294f, 4.0574f, 18.1461f, 3.34f, 18.6713f)
        curveTo(2.5831f, 19.2259f, 1.9363f, 19.8861f, 1.4167f, 20.6373f)
        curveTo(1.3828f, 20.6872f, 1.3545f, 20.7371f, 1.3291f, 20.7899f)
        curveTo(1.0834f, 21.2975f, 1.219f, 21.9343f, 1.6793f, 22.2776f)
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
        moveTo(21.75f, 12.0834f)
        moveToRelative(-3.625f, 0f)
        arcToRelative(3.625f, 3.625f, 0f, true, true, 7.25f, 0f)
        arcToRelative(3.625f, 3.625f, 0f, true, true, -7.25f, 0f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.Swimming)
