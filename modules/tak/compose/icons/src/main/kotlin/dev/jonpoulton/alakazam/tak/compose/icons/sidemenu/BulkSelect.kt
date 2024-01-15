package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.BulkSelect: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "BulkSelect",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
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
        moveTo(24f, 11.5f)
        curveTo(24.5523f, 11.5f, 25f, 11.9477f, 25f, 12.5f)
        verticalLineTo(29.5f)
        curveTo(25f, 30.0523f, 24.5523f, 30.5f, 24f, 30.5f)
        horizontalLineTo(12.5334f)
        horizontalLineTo(7f)
        curveTo(6.4477f, 30.5f, 6f, 30.0523f, 6f, 29.5f)
        verticalLineTo(12.5f)
        curveTo(6f, 11.9477f, 6.4477f, 11.5f, 7f, 11.5f)
        horizontalLineTo(24f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(30f, 7.5f)
        curveTo(30f, 6.9477f, 29.5523f, 6.5f, 29f, 6.5f)
        horizontalLineTo(12f)
        curveTo(11.4477f, 6.5f, 11f, 6.9477f, 11f, 7.5f)
        verticalLineTo(9.5f)
        horizontalLineTo(26f)
        curveTo(26.5523f, 9.5f, 27f, 9.9477f, 27f, 10.5f)
        verticalLineTo(25.5f)
        horizontalLineTo(29f)
        curveTo(29.5523f, 25.5f, 30f, 25.0523f, 30f, 24.5f)
        verticalLineTo(7.5f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 2f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(10.75f, 22.0409f)
        lineTo(14.6094f, 25.75f)
        lineTo(21.0417f, 17.0417f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.BulkSelect)
