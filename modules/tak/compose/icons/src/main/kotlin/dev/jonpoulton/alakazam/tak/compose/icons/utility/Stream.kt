package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons

public val UtilityTakIcons.Stream: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Stream",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(21.9246f, 21.9246f)
        curveTo(22.8996f, 20.9495f, 23.673f, 19.792f, 24.2007f, 18.5181f)
        curveTo(24.7284f, 17.2442f, 24.9999f, 15.8788f, 24.9999f, 14.4999f)
        curveTo(24.9999f, 13.1211f, 24.7284f, 11.7557f, 24.2007f, 10.4818f)
        curveTo(23.673f, 9.2078f, 22.8996f, 8.0503f, 21.9246f, 7.0753f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(19.5f, 19f)
        curveTo(20.1341f, 18.4091f, 20.6371f, 17.7075f, 20.9802f, 16.9354f)
        curveTo(21.3234f, 16.1633f, 21.5f, 15.3357f, 21.5f, 14.5f)
        curveTo(21.5f, 13.6643f, 21.3234f, 12.8367f, 20.9802f, 12.0646f)
        curveTo(20.6371f, 11.2925f, 20.1341f, 10.5909f, 19.5f, 10f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(8.0754f, 21.9247f)
        curveTo(7.1004f, 20.9497f, 6.327f, 19.7922f, 5.7993f, 18.5182f)
        curveTo(5.2716f, 17.2443f, 5.0001f, 15.8789f, 5.0001f, 14.5001f)
        curveTo(5.0001f, 13.1212f, 5.2716f, 11.7558f, 5.7993f, 10.4819f)
        curveTo(6.327f, 9.208f, 7.1004f, 8.0505f, 8.0754f, 7.0754f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(10.5f, 19f)
        curveTo(9.8659f, 18.4091f, 9.3629f, 17.7075f, 9.0198f, 16.9354f)
        curveTo(8.6766f, 16.1633f, 8.5f, 15.3357f, 8.5f, 14.5f)
        curveTo(8.5f, 13.6643f, 8.6766f, 12.8367f, 9.0198f, 12.0646f)
        curveTo(9.3629f, 11.2925f, 9.8659f, 10.5909f, 10.5f, 10f)
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(18f, 14.5f)
        lineTo(13f, 19f)
        lineTo(13f, 10f)
        lineTo(18f, 14.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
