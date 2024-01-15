package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val UtilityTakIcons.Maps: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Maps",
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
        strokeLineJoin = Round,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(26.0887f, 22.3486f)
        lineTo(18.5961f, 25.4829f)
        lineTo(10.722f, 22.4255f)
        lineTo(2.6942f, 25.5598f)
        verticalLineTo(6.9051f)
        lineTo(10.722f, 3.7709f)
        lineTo(18.5961f, 6.8292f)
        lineTo(26.0887f, 3.695f)
        verticalLineTo(22.3486f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(10.6455f, 22.3486f)
        verticalLineTo(4.0005f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(18.4434f, 25.2539f)
        verticalLineTo(6.9058f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.Maps)
