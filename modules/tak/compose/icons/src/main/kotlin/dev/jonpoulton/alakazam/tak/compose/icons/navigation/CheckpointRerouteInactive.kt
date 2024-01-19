package dev.jonpoulton.alakazam.tak.compose.icons.navigation

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
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.NavigationTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val NavigationTakIcons.CheckpointRerouteInactive: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "CheckpointRerouteInactive",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Ash),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(2.0f, 1.75f)
        lineTo(30.0f, 1.75f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 31.25f, 3.0f)
        lineTo(31.25f, 31.0f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 30.0f, 32.25f)
        lineTo(2.0f, 32.25f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 0.75f, 31.0f)
        lineTo(0.75f, 3.0f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 2.0f, 1.75f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Alert),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(2.0f, 1.75f)
        lineTo(30.0f, 1.75f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 31.25f, 3.0f)
        lineTo(31.25f, 31.0f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 30.0f, 32.25f)
        lineTo(2.0f, 32.25f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 0.75f, 31.0f)
        lineTo(0.75f, 3.0f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 2.0f, 1.75f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Stone),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.0f, 9.0f)
        moveToRelative(-4.0f, 0.0f)
        arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
        arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
      }
      path(
        fill = SolidColor(TakColors.Stone),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.0f, 25.0f)
        moveToRelative(-4.0f, 0.0f)
        arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
        arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
      }
      path(
        fill = SolidColor(TakColors.Stone),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(8.0f, 9.0f)
        moveToRelative(-4.0f, 0.0f)
        arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
        arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Stone),
        strokeLineWidth = 1.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(8.0f, 13.0f)
        verticalLineTo(19.0f)
        curveTo(8.0f, 22.3137f, 10.6863f, 25.0f, 14.0f, 25.0f)
        verticalLineTo(25.0f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Stone),
        strokeLineWidth = 1.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.0f, 12.0f)
        lineTo(24.0f, 19.0f)
      }
      path(
        fill = SolidColor(TakColors.Stone),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.0f, 21.0f)
        lineTo(27.4641f, 15.0f)
        horizontalLineTo(20.5359f)
        lineTo(24.0f, 21.0f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Stone),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(19.0f, 25.0f)
        lineTo(13.0f, 21.5359f)
        lineTo(13.0f, 28.4641f)
        lineTo(19.0f, 25.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = NavigationTakIcons.CheckpointRerouteInactive)
