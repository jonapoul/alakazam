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

public val SideMenuTakIcons.NavigateAlternate: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "NavigateAlternative",
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
        moveTo(9.6923f, 18.5f)
        curveTo(9.6923f, 13.9192f, 13.4191f, 10.1923f, 18f, 10.1923f)
        curveTo(22.5808f, 10.1923f, 26.3076f, 13.9192f, 26.3076f, 18.5f)
        curveTo(26.3076f, 23.0809f, 22.5808f, 26.8077f, 18f, 26.8077f)
        curveTo(13.4191f, 26.8077f, 9.6923f, 23.0809f, 9.6923f, 18.5f)
        close()
        moveTo(20.7757f, 21.3674f)
        curveTo(20.848f, 21.3111f, 20.9062f, 21.2335f, 20.9396f, 21.1369f)
        lineTo(23.2023f, 14.6035f)
        curveTo(23.4754f, 13.8148f, 22.7191f, 13.0582f, 21.9302f, 13.3313f)
        lineTo(15.3958f, 15.5929f)
        curveTo(15.2992f, 15.6264f, 15.2215f, 15.6846f, 15.1652f, 15.7569f)
        curveTo(15.0929f, 15.8132f, 15.0347f, 15.8908f, 15.0013f, 15.9874f)
        lineTo(12.7396f, 22.5219f)
        curveTo(12.4666f, 23.3107f, 13.2231f, 24.0671f, 14.0119f, 23.7939f)
        lineTo(20.5453f, 21.5313f)
        curveTo(20.6418f, 21.4978f, 20.7195f, 21.4396f, 20.7757f, 21.3674f)
        close()
        moveTo(18.7423f, 19.2462f)
        curveTo(18.3517f, 19.6368f, 17.7187f, 19.6368f, 17.3281f, 19.2462f)
        curveTo(16.937f, 18.8551f, 16.9375f, 18.2226f, 17.3281f, 17.832f)
        curveTo(17.7191f, 17.4409f, 18.3512f, 17.4409f, 18.7423f, 17.832f)
        curveTo(19.1329f, 18.2226f, 19.1333f, 18.8551f, 18.7423f, 19.2462f)
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
        moveTo(18f, 6.5f)
        curveTo(21.2053f, 6.5f, 24.2188f, 7.7482f, 26.4853f, 10.0147f)
        curveTo(28.7518f, 12.2812f, 30f, 15.2947f, 30f, 18.5f)
        curveTo(30f, 21.7053f, 28.7518f, 24.7188f, 26.4853f, 26.9853f)
        curveTo(24.2188f, 29.2518f, 21.2053f, 30.5f, 18f, 30.5f)
        curveTo(14.7947f, 30.5f, 11.7812f, 29.2518f, 9.5147f, 26.9853f)
        curveTo(7.2482f, 24.7188f, 6f, 21.7053f, 6f, 18.5f)
        curveTo(6f, 15.2947f, 7.2482f, 12.2812f, 9.5147f, 10.0147f)
        curveTo(11.7812f, 7.7482f, 14.7947f, 6.5f, 18f, 6.5f)
        close()
        moveTo(7.8461f, 18.5f)
        curveTo(7.8461f, 24.0989f, 12.4011f, 28.6538f, 18f, 28.6538f)
        curveTo(23.5989f, 28.6538f, 28.1538f, 24.0989f, 28.1538f, 18.5f)
        curveTo(28.1538f, 12.9011f, 23.5989f, 8.3462f, 18f, 8.3462f)
        curveTo(12.4011f, 8.3462f, 7.8461f, 12.9011f, 7.8461f, 18.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.NavigateAlternate)
