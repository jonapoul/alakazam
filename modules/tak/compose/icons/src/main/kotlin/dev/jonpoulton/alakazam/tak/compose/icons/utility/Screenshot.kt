package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val UtilityTakIcons.Screenshot: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Screenshot",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(8.1379f, 18.7236f)
        horizontalLineTo(4f)
        verticalLineTo(4f)
        horizontalLineTo(18.4827f)
        verticalLineTo(6.6292f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(17.8475f, 22.4046f)
        horizontalLineTo(8.3448f)
        verticalLineTo(7.681f)
        horizontalLineTo(22.8276f)
        verticalLineTo(18.369f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(8.3448f, 15.7789f)
        lineTo(11.5869f, 11.5416f)
        lineTo(15.8591f, 15.9178f)
        lineTo(17.5078f, 17.6074f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(22.6508f, 16.7497f)
        lineTo(19.3934f, 13.7535f)
        lineTo(16.2937f, 15.8793f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(18.6665f, 10.1896f)
        curveTo(18.6665f, 11.0733f, 18.0198f, 11.7889f, 17.2212f, 11.7889f)
        curveTo(16.4227f, 11.7889f, 15.7754f, 11.0733f, 15.7754f, 10.1896f)
        curveTo(15.7754f, 9.306f, 16.4227f, 8.5903f, 17.2212f, 8.5903f)
        curveTo(18.0198f, 8.5903f, 18.6665f, 9.306f, 18.6665f, 10.1896f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(22.0034f, 20.0577f)
        verticalLineTo(24.9998f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.25f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(24.2368f, 22.5293f)
        horizontalLineTo(19.7701f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.Screenshot)
