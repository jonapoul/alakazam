package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val UtilityTakIcons.Trash: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Trash",
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
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.5685f, 25.5f)
        horizontalLineTo(10.0398f)
        lineTo(7.9302f, 11.5f)
        horizontalLineTo(21.6789f)
        lineTo(19.5685f, 25.5f)
        close()
      }
      group {
        path(
          fill = SolidColor(Color.Transparent),
          stroke = SolidColor(TakLegacyColors.PaleSilver),
          strokeLineWidth = 1.5f,
          strokeLineCap = Round,
          strokeLineJoin = StrokeJoin.Companion.Round,
          strokeLineMiter = 4f,
          pathFillType =
          EvenOdd,
        ) {
          moveTo(8.425f, 6.1646f)
          horizontalLineTo(20.877f)
          verticalLineTo(3.0065f)
          horizontalLineTo(8.425f)
          verticalLineTo(6.1646f)
          close()
        }
        path(
          fill = SolidColor(Color.Transparent),
          stroke = SolidColor(TakLegacyColors.PaleSilver),
          strokeLineWidth = 1.5f,
          strokeLineCap = Round,
          strokeLineJoin = StrokeJoin.Companion.Round,
          strokeLineMiter = 4f,
          pathFillType =
          EvenOdd,
        ) {
          moveTo(5.4224f, 11.3815f)
          horizontalLineTo(24.186f)
          verticalLineTo(6.3815f)
          horizontalLineTo(5.4224f)
          verticalLineTo(11.3815f)
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
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.Trash)
