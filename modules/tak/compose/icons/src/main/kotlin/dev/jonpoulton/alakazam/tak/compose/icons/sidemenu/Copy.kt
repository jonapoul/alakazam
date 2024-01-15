package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.Copy: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Copy",
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
        moveTo(15.4231f, 26.0338f)
        curveTo(12.8999f, 26.0338f, 10.8462f, 24.1411f, 10.8462f, 21.8157f)
        verticalLineTo(11.6429f)
        horizontalLineTo(8.9616f)
        curveTo(7.3279f, 11.6429f, 6f, 12.8665f, 6f, 14.3721f)
        verticalLineTo(27.7706f)
        curveTo(6f, 29.2763f, 7.3279f, 30.5f, 8.9616f, 30.5f)
        horizontalLineTo(22.423f)
        curveTo(24.0567f, 30.5f, 25.3846f, 29.2763f, 25.3846f, 27.7706f)
        verticalLineTo(26.0338f)
        horizontalLineTo(15.4231f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(29.9999f, 9.2501f)
        curveTo(29.9999f, 7.731f, 28.6505f, 6.5f, 26.9856f, 6.5f)
        horizontalLineTo(15.4759f)
        curveTo(13.8108f, 6.5f, 12.4614f, 7.731f, 12.4614f, 9.2501f)
        verticalLineTo(21.7499f)
        curveTo(12.4614f, 23.269f, 13.8108f, 24.5f, 15.4759f, 24.5f)
        horizontalLineTo(26.9856f)
        curveTo(28.6505f, 24.5f, 29.9999f, 23.269f, 29.9999f, 21.7499f)
        verticalLineTo(9.2501f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Copy)
