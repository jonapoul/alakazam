package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val UtilityTakIcons.VisibilityPartial: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "VisibilityPartial",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.35f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(26.8442f, 15.0344f)
        curveTo(26.8442f, 15.0344f, 21.2885f, 21.8717f, 14.4341f, 21.8717f)
        curveTo(7.5806f, 21.8717f, 2.0249f, 15.0344f, 2.0249f, 15.0344f)
        curveTo(2.0249f, 15.0344f, 7.5806f, 8.198f, 14.4341f, 8.198f)
        curveTo(21.2885f, 8.198f, 26.8442f, 15.0344f, 26.8442f, 15.0344f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.35f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.0721f, 14.9853f)
        curveTo(19.0721f, 17.7105f, 16.8626f, 19.9191f, 14.1383f, 19.9191f)
        curveTo(11.4122f, 19.9191f, 9.2036f, 17.7105f, 9.2036f, 14.9853f)
        curveTo(9.2036f, 12.2601f, 11.4122f, 10.0515f, 14.1383f, 10.0515f)
        curveTo(16.8626f, 10.0515f, 19.0721f, 12.2601f, 19.0721f, 14.9853f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.VisibilityPartial)
