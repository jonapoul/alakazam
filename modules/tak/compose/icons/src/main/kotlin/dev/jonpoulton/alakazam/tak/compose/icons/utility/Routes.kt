package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons

public val UtilityTakIcons.Routes: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Routes",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(10.875f, 24.1667f)
        horizontalLineTo(21.8384f)
        curveTo(22.6193f, 24.1667f, 23.253f, 23.5298f, 23.253f, 22.7451f)
        curveTo(23.253f, 21.9597f, 22.6193f, 21.3236f, 21.8384f, 21.3236f)
        horizontalLineTo(17.9482f)
        curveTo(17.1673f, 21.3236f, 16.5335f, 20.6867f, 16.5335f, 19.902f)
        verticalLineTo(19.5466f)
        curveTo(16.5335f, 18.7612f, 17.1673f, 18.125f, 17.9482f, 18.125f)
        horizontalLineTo(23.9604f)
        curveTo(24.7412f, 18.125f, 25.375f, 17.4882f, 25.375f, 16.7035f)
        curveTo(25.375f, 15.9181f, 24.7412f, 15.2819f, 23.9604f, 15.2819f)
        horizontalLineTo(16.5335f)
        curveTo(15.7527f, 15.2819f, 15.1189f, 14.645f, 15.1189f, 13.8603f)
        verticalLineTo(13.5049f)
        curveTo(15.1189f, 12.7195f, 15.7527f, 12.0834f, 16.5335f, 12.0834f)
        horizontalLineTo(20.4238f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(12.0833f, 16.134f)
        curveTo(12.0833f, 18.3706f, 7.8538f, 22.9584f, 7.8538f, 22.9584f)
        curveTo(7.8538f, 22.9584f, 3.625f, 18.3706f, 3.625f, 16.134f)
        curveTo(3.625f, 13.8975f, 5.5184f, 12.0834f, 7.8538f, 12.0834f)
        curveTo(10.1899f, 12.0834f, 12.0833f, 13.8975f, 12.0833f, 16.134f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(26.5833f, 6.7756f)
        curveTo(26.5833f, 8.5157f, 23.5625f, 12.0833f, 23.5625f, 12.0833f)
        curveTo(23.5625f, 12.0833f, 20.5416f, 8.5157f, 20.5416f, 6.7756f)
        curveTo(20.5416f, 5.0355f, 21.894f, 3.625f, 23.5625f, 3.625f)
        curveTo(25.2309f, 3.625f, 26.5833f, 5.0355f, 26.5833f, 6.7756f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.Routes)
