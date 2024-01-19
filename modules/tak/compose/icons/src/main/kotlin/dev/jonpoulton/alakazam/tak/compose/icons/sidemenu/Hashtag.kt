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
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.Hashtag: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Hashtag",
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
        moveTo(6.5f, 22.5f)
        lineTo(29.5f, 22.5f)
        arcTo(0.5f, 0.5f, 0f, false, true, 30f, 23f)
        lineTo(30f, 23f)
        arcTo(0.5f, 0.5f, 0f, false, true, 29.5f, 23.5f)
        lineTo(6.5f, 23.5f)
        arcTo(0.5f, 0.5f, 0f, false, true, 6f, 23f)
        lineTo(6f, 23f)
        arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 22.5f)
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
        moveTo(6.5f, 13.5f)
        lineTo(29.5f, 13.5f)
        arcTo(0.5f, 0.5f, 0f, false, true, 30f, 14f)
        lineTo(30f, 14f)
        arcTo(0.5f, 0.5f, 0f, false, true, 29.5f, 14.5f)
        lineTo(6.5f, 14.5f)
        arcTo(0.5f, 0.5f, 0f, false, true, 6f, 14f)
        lineTo(6f, 14f)
        arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 13.5f)
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
        moveTo(13.3148f, 6.5f)
        curveTo(13.6901f, 6.5f, 13.9914f, 6.8098f, 13.981f, 7.1849f)
        lineTo(13.3513f, 29.8521f)
        curveTo(13.3413f, 30.2128f, 13.046f, 30.5f, 12.6852f, 30.5f)
        curveTo(12.3099f, 30.5f, 12.0086f, 30.1902f, 12.019f, 29.8151f)
        lineTo(12.6487f, 7.1479f)
        curveTo(12.6587f, 6.7872f, 12.954f, 6.5f, 13.3148f, 6.5f)
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
        moveTo(23.3148f, 6.5f)
        curveTo(23.6901f, 6.5f, 23.9914f, 6.8098f, 23.981f, 7.1849f)
        lineTo(23.3513f, 29.8521f)
        curveTo(23.3413f, 30.2128f, 23.046f, 30.5f, 22.6852f, 30.5f)
        curveTo(22.3099f, 30.5f, 22.0086f, 30.1902f, 22.019f, 29.8151f)
        lineTo(22.6487f, 7.1479f)
        curveTo(22.6587f, 6.7872f, 22.954f, 6.5f, 23.3148f, 6.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Hashtag)
