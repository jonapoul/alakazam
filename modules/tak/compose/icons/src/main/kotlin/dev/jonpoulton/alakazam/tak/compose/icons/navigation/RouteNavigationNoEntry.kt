package dev.jonpoulton.alakazam.tak.compose.icons.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Square
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.NavigationTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val NavigationTakIcons.RouteNavigationNoEntry: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RouteNavigationNoEntry",
      defaultWidth = 29.0.dp,
      defaultHeight = 29.0.dp,
      viewportWidth = 29.0f,
      viewportHeight = 29.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color(0xFFD90F0F)),
        strokeLineWidth = 3.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(14.4999f, 14.5f)
        moveToRelative(-8.8095f, 7.3921f)
        arcToRelative(11.5f, 11.5f, 92.3559f, true, true, 17.619f, -14.7841f)
        arcToRelative(11.5f, 11.5f, 92.3559f, true, true, -17.619f, 14.7841f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color(0xFFD90F0F)),
        strokeLineWidth = 3.0f,
        strokeLineCap = Square,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(8.1338f, 6.1351f)
        lineTo(20.9279f, 22.1604f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = NavigationTakIcons.RouteNavigationNoEntry)
