package dev.jonpoulton.alakazam.tak.compose.icons.mapcontrol

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.MapControlTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val MapControlTakIcons.Compass: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Compass",
      defaultWidth = 41.0.dp,
      defaultHeight = 49.0.dp,
      viewportWidth = 41.0f,
      viewportHeight = 49.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.65f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(7.8306f, 26.9884f)
        arcToRelative(12.1808f, 12.1808f, 0.0f, true, false, 24.3616f, 0.0f)
        arcToRelative(12.1808f, 12.1808f, 0.0f, true, false, -24.3616f, 0.0f)
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
        moveTo(15.76f, 31.0946f)
        curveTo(15.76f, 31.5538f, 16.1357f, 31.9295f, 16.6088f, 31.9295f)
        curveTo(17.068f, 31.9295f, 17.4437f, 31.5538f, 17.4437f, 31.0946f)
        verticalLineTo(24.9163f)
        lineTo(22.4531f, 31.4007f)
        curveTo(22.6897f, 31.7068f, 22.9401f, 31.9155f, 23.3437f, 31.9155f)
        horizontalLineTo(23.4133f)
        curveTo(23.8864f, 31.9155f, 24.2482f, 31.5398f, 24.2482f, 31.0667f)
        verticalLineTo(22.8847f)
        curveTo(24.2482f, 22.4255f, 23.8725f, 22.0498f, 23.3993f, 22.0498f)
        curveTo(22.9401f, 22.0498f, 22.5644f, 22.4255f, 22.5644f, 22.8847f)
        verticalLineTo(28.8682f)
        lineTo(17.6942f, 22.5647f)
        curveTo(17.4576f, 22.2724f, 17.2211f, 22.0637f, 16.8036f, 22.0637f)
        horizontalLineTo(16.6227f)
        curveTo(16.1357f, 22.0637f, 15.76f, 22.4533f, 15.76f, 22.9265f)
        verticalLineTo(31.0946f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Alert),
        stroke = SolidColor(TakColors.Alert),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(13.8578f, 15.1089f)
        lineTo(20.0717f, 13.8223f)
        lineTo(26.1275f, 15.1089f)
        lineTo(29.9514f, 19.8484f)
        lineTo(20.0717f, 5.7549f)
        lineTo(10.0211f, 19.8484f)
        lineTo(13.8578f, 15.1089f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.65f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(7.8306f, 26.9889f)
        arcToRelative(12.1808f, 12.1808f, 0.0f, true, false, 24.3616f, 0.0f)
        arcToRelative(12.1808f, 12.1808f, 0.0f, true, false, -24.3616f, 0.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MapControlTakIcons.Compass)
