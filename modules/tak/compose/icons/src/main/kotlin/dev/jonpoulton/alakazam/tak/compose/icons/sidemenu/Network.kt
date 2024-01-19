package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.Network: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Network",
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
        pathFillType = EvenOdd,
      ) {
        moveTo(25f, 12f)
        verticalLineTo(14f)
        horizontalLineTo(26f)
        curveTo(26.5523f, 14f, 27f, 14.4477f, 27f, 15f)
        verticalLineTo(17f)
        horizontalLineTo(29f)
        curveTo(29.5523f, 17f, 30f, 17.4477f, 30f, 18f)
        verticalLineTo(26f)
        curveTo(30f, 26.5523f, 29.5523f, 27f, 29f, 27f)
        horizontalLineTo(25f)
        verticalLineTo(21f)
        horizontalLineTo(23f)
        verticalLineTo(27f)
        horizontalLineTo(21f)
        verticalLineTo(21f)
        horizontalLineTo(19f)
        verticalLineTo(27f)
        horizontalLineTo(17f)
        verticalLineTo(21f)
        horizontalLineTo(15f)
        verticalLineTo(27f)
        horizontalLineTo(13f)
        verticalLineTo(21f)
        horizontalLineTo(11f)
        verticalLineTo(27f)
        horizontalLineTo(7f)
        curveTo(6.4477f, 27f, 6f, 26.5523f, 6f, 26f)
        verticalLineTo(18f)
        curveTo(6f, 17.4477f, 6.4477f, 17f, 7f, 17f)
        horizontalLineTo(9f)
        verticalLineTo(15f)
        curveTo(9f, 14.4477f, 9.4477f, 14f, 10f, 14f)
        horizontalLineTo(11f)
        verticalLineTo(12f)
        curveTo(11f, 11.4477f, 11.4477f, 11f, 12f, 11f)
        horizontalLineTo(24f)
        curveTo(24.5523f, 11f, 25f, 11.4477f, 25f, 12f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Network)
