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
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons

public val UtilityTakIcons.User: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "User",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
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
        moveTo(24.0792f, 24.2104f)
        curveTo(24.0369f, 20.2637f, 23.4307f, 17.2901f, 21.7516f, 16.0551f)
        curveTo(21.7516f, 16.0551f, 20.9211f, 15.0754f, 20.1799f, 14.8992f)
        curveTo(18.926f, 14.6013f, 17.2642f, 16.445f, 17.2642f, 16.445f)
        curveTo(17.2642f, 16.445f, 16.6134f, 17.29f, 14.5397f, 17.29f)
        curveTo(12.466f, 17.29f, 11.8152f, 16.4452f, 11.8152f, 16.4452f)
        curveTo(11.8152f, 16.4452f, 10.1532f, 14.6013f, 8.899f, 14.8991f)
        curveTo(8.1575f, 15.0752f, 7.3267f, 16.055f, 7.3267f, 16.055f)
        lineTo(7.1509f, 16.1939f)
        curveTo(5.6051f, 17.5035f, 5.041f, 20.402f, 5.0002f, 24.2074f)
        curveTo(4.9875f, 25.1975f, 5.7817f, 26f, 6.762f, 26f)
        horizontalLineTo(22.3162f)
        lineTo(22.4869f, 25.9919f)
        curveTo(23.3855f, 25.9053f, 24.0864f, 25.1418f, 24.0792f, 24.2104f)
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
        moveTo(14.2942f, 4f)
        curveTo(10.9682f, 4.023f, 9.4873f, 5.4103f, 9.4873f, 9.8116f)
        curveTo(9.4873f, 12.1534f, 10.383f, 13.7984f, 11.8789f, 14.7674f)
        curveTo(12.7147f, 15.3088f, 13.6531f, 15.5735f, 14.2831f, 15.6171f)
        lineTo(14.5097f, 15.6227f)
        curveTo(15.2458f, 15.5884f, 16.2318f, 15.3219f, 17.1382f, 14.7071f)
        curveTo(18.5816f, 13.7281f, 19.4386f, 12.1016f, 19.4386f, 9.8116f)
        curveTo(19.4386f, 5.4337f, 18.0129f, 4.0692f, 14.7258f, 4.0021f)
        lineTo(14.2942f, 4f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.User)
