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
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.SortByProximity: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "SortByProximity",
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
        moveTo(18.5212f, 24.8509f)
        curveTo(19.107f, 24.2651f, 19.107f, 23.3154f, 18.5212f, 22.7296f)
        curveTo(17.9354f, 22.1438f, 16.9856f, 22.1438f, 16.3998f, 22.7296f)
        lineTo(14.1862f, 24.9432f)
        lineTo(14.1863f, 9.0076f)
        curveTo(14.1863f, 8.1791f, 13.5147f, 7.5076f, 12.6863f, 7.5076f)
        curveTo(11.8579f, 7.5075f, 11.1863f, 8.1791f, 11.1863f, 9.0076f)
        lineTo(11.1862f, 24.9461f)
        lineTo(8.9688f, 22.7288f)
        curveTo(8.383f, 22.143f, 7.4333f, 22.143f, 6.8475f, 22.7288f)
        curveTo(6.2617f, 23.3145f, 6.2617f, 24.2643f, 6.8475f, 24.8501f)
        lineTo(11.6241f, 29.6267f)
        curveTo(12.2099f, 30.2125f, 13.1596f, 30.2125f, 13.7454f, 29.6267f)
        lineTo(18.5212f, 24.8509f)
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
        moveTo(17f, 9f)
        lineTo(29f, 9f)
        arcTo(1f, 1f, 0f, false, true, 30f, 10f)
        lineTo(30f, 10f)
        arcTo(1f, 1f, 0f, false, true, 29f, 11f)
        lineTo(17f, 11f)
        arcTo(1f, 1f, 0f, false, true, 16f, 10f)
        lineTo(16f, 10f)
        arcTo(1f, 1f, 0f, false, true, 17f, 9f)
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
        moveTo(17f, 13.5f)
        lineTo(22f, 13.5f)
        arcTo(1f, 1f, 0f, false, true, 23f, 14.5f)
        lineTo(23f, 14.5f)
        arcTo(1f, 1f, 0f, false, true, 22f, 15.5f)
        lineTo(17f, 15.5f)
        arcTo(1f, 1f, 0f, false, true, 16f, 14.5f)
        lineTo(16f, 14.5f)
        arcTo(1f, 1f, 0f, false, true, 17f, 13.5f)
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
        moveTo(17f, 18f)
        lineTo(18.5f, 18f)
        arcTo(1f, 1f, 0f, false, true, 19.5f, 19f)
        lineTo(19.5f, 19f)
        arcTo(1f, 1f, 0f, false, true, 18.5f, 20f)
        lineTo(17f, 20f)
        arcTo(1f, 1f, 0f, false, true, 16f, 19f)
        lineTo(16f, 19f)
        arcTo(1f, 1f, 0f, false, true, 17f, 18f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.SortByProximity)
