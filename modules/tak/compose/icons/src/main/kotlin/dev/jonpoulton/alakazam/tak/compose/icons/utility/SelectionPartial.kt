package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
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

public val UtilityTakIcons.SelectionPartial: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "SelectionPartial",
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
        moveTo(6f, 4f)
        lineTo(23f, 4f)
        arcTo(2f, 2f, 0f, false, true, 25f, 6f)
        lineTo(25f, 23f)
        arcTo(2f, 2f, 0f, false, true, 23f, 25f)
        lineTo(6f, 25f)
        arcTo(2f, 2f, 0f, false, true, 4f, 23f)
        lineTo(4f, 6f)
        arcTo(2f, 2f, 0f, false, true, 6f, 4f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(6.75f, 22.5f)
        horizontalLineTo(21.8964f)
        curveTo(22.1192f, 22.5f, 22.2307f, 22.2307f, 22.0732f, 22.0732f)
        lineTo(6.9268f, 6.9268f)
        curveTo(6.7693f, 6.7693f, 6.5f, 6.8808f, 6.5f, 7.1035f)
        verticalLineTo(22.25f)
        curveTo(6.5f, 22.3881f, 6.6119f, 22.5f, 6.75f, 22.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.SelectionPartial)
