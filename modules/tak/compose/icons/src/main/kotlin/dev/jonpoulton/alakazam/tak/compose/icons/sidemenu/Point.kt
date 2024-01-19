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

public val SideMenuTakIcons.Point: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Point",
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
        moveTo(18.3856f, 30.5f)
        curveTo(18.3856f, 30.5f, 27.7728f, 20.3769f, 27.7728f, 15.4401f)
        curveTo(27.7728f, 10.5018f, 23.5701f, 6.5f, 18.3856f, 6.5f)
        curveTo(13.2027f, 6.5f, 9f, 10.5018f, 9f, 15.4401f)
        curveTo(9f, 20.3769f, 18.3856f, 30.5f, 18.3856f, 30.5f)
        close()
        moveTo(18.3864f, 18.0398f)
        curveTo(19.7688f, 18.0398f, 20.8891f, 16.9731f, 20.8891f, 15.6567f)
        curveTo(20.8891f, 14.3388f, 19.7688f, 13.2736f, 18.3864f, 13.2736f)
        curveTo(17.0023f, 13.2736f, 15.8837f, 14.3388f, 15.8837f, 15.6567f)
        curveTo(15.8837f, 16.9731f, 17.0023f, 18.0398f, 18.3864f, 18.0398f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Point)
