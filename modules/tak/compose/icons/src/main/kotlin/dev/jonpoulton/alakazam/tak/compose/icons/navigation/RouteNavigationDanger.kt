package dev.jonpoulton.alakazam.tak.compose.icons.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.NavigationTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val NavigationTakIcons.RouteNavigationDanger: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RouteNavigationDanger",
      defaultWidth = 29.0.dp,
      defaultHeight = 29.0.dp,
      viewportWidth = 29.0f,
      viewportHeight = 29.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFFF3DC00)),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Round,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(14.5f, 1.2084f)
        lineTo(27.7917f, 27.7917f)
        horizontalLineTo(1.2084f)
        lineTo(14.5f, 1.2084f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(15.8085f, 20.0884f)
        curveTo(15.7527f, 20.5945f, 15.418f, 20.9132f, 14.9532f, 20.9132f)
        curveTo(14.4884f, 20.9132f, 14.1537f, 20.5945f, 14.0979f, 20.0884f)
        lineTo(13.2984f, 13.0395f)
        curveTo(13.2426f, 12.4958f, 13.5401f, 12.0834f, 14.0421f, 12.0834f)
        horizontalLineTo(15.8643f)
        curveTo(16.3663f, 12.0834f, 16.6638f, 12.4958f, 16.608f, 13.0395f)
        lineTo(15.8085f, 20.0884f)
        close()
        moveTo(16.5708f, 23.7815f)
        curveTo(16.5708f, 24.6814f, 15.8829f, 25.375f, 14.9532f, 25.375f)
        curveTo(14.0236f, 25.375f, 13.3356f, 24.6814f, 13.3356f, 23.7815f)
        verticalLineTo(23.744f)
        curveTo(13.3356f, 22.8442f, 14.0236f, 22.1505f, 14.9532f, 22.1505f)
        curveTo(15.8829f, 22.1505f, 16.5708f, 22.8442f, 16.5708f, 23.744f)
        verticalLineTo(23.7815f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = NavigationTakIcons.RouteNavigationDanger)
