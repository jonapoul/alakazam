package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val SideMenuTakIcons.Filter: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Filter",
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
        moveTo(16.6632f, 11f)
        curveTo(16.8792f, 10.5454f, 17f, 10.0368f, 17f, 9.5f)
        curveTo(17f, 8.9632f, 16.8792f, 8.4546f, 16.6632f, 8f)
        horizontalLineTo(28.5f)
        curveTo(29.3284f, 8f, 30f, 8.6716f, 30f, 9.5f)
        curveTo(30f, 10.3284f, 29.3284f, 11f, 28.5f, 11f)
        horizontalLineTo(16.6632f)
        close()
        moveTo(10.3368f, 11f)
        horizontalLineTo(7.5f)
        curveTo(6.6716f, 11f, 6f, 10.3284f, 6f, 9.5f)
        curveTo(6f, 8.6716f, 6.6716f, 8f, 7.5f, 8f)
        horizontalLineTo(10.3368f)
        curveTo(10.1208f, 8.4546f, 10f, 8.9632f, 10f, 9.5f)
        curveTo(10f, 10.0368f, 10.1208f, 10.5454f, 10.3368f, 11f)
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
        moveTo(13.5f, 9.5f)
        moveToRelative(-2.5f, 0f)
        arcToRelative(2.5f, 2.5f, 0f, true, true, 5f, 0f)
        arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
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
        moveTo(19.3368f, 20f)
        curveTo(19.1208f, 19.5454f, 19f, 19.0368f, 19f, 18.5f)
        curveTo(19f, 17.9632f, 19.1208f, 17.4546f, 19.3368f, 17f)
        horizontalLineTo(7.5f)
        curveTo(6.6716f, 17f, 6f, 17.6716f, 6f, 18.5f)
        curveTo(6f, 19.3284f, 6.6716f, 20f, 7.5f, 20f)
        horizontalLineTo(19.3368f)
        close()
        moveTo(25.6632f, 20f)
        horizontalLineTo(28.5f)
        curveTo(29.3284f, 20f, 30f, 19.3284f, 30f, 18.5f)
        curveTo(30f, 17.6716f, 29.3284f, 17f, 28.5f, 17f)
        horizontalLineTo(25.6632f)
        curveTo(25.8792f, 17.4546f, 26f, 17.9632f, 26f, 18.5f)
        curveTo(26f, 19.0368f, 25.8792f, 19.5454f, 25.6632f, 20f)
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
        moveTo(22.5f, 18.5f)
        moveToRelative(2.5f, 0f)
        arcToRelative(2.5f, 2.5f, 0f, true, false, -5f, 0f)
        arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
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
        moveTo(16.6632f, 29f)
        curveTo(16.8792f, 28.5454f, 17f, 28.0368f, 17f, 27.5f)
        curveTo(17f, 26.9632f, 16.8792f, 26.4546f, 16.6632f, 26f)
        horizontalLineTo(28.5f)
        curveTo(29.3284f, 26f, 30f, 26.6716f, 30f, 27.5f)
        curveTo(30f, 28.3284f, 29.3284f, 29f, 28.5f, 29f)
        horizontalLineTo(16.6632f)
        close()
        moveTo(10.3368f, 29f)
        horizontalLineTo(7.5f)
        curveTo(6.6716f, 29f, 6f, 28.3284f, 6f, 27.5f)
        curveTo(6f, 26.6716f, 6.6716f, 26f, 7.5f, 26f)
        horizontalLineTo(10.3368f)
        curveTo(10.1208f, 26.4546f, 10f, 26.9632f, 10f, 27.5f)
        curveTo(10f, 28.0368f, 10.1208f, 28.5454f, 10.3368f, 29f)
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
        moveTo(13.5f, 27.5f)
        moveToRelative(-2.5f, 0f)
        arcToRelative(2.5f, 2.5f, 0f, true, true, 5f, 0f)
        arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Filter)
