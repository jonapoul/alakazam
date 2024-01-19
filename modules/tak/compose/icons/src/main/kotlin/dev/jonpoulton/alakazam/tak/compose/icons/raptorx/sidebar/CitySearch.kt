package dev.jonpoulton.alakazam.tak.compose.icons.raptorx.sidebar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXSidebarTakIcons

public val RaptorXSidebarTakIcons.CitySearch: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "CitySearch",
      defaultWidth = 30.0.dp,
      defaultHeight = 30.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 30.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(8.0573f, 4.6429f)
        curveTo(4.1757f, 7.463f, 3.3152f, 12.8958f, 6.1354f, 16.7773f)
        curveTo(8.9555f, 20.6589f, 14.3882f, 21.5194f, 18.2698f, 18.6993f)
        curveTo(22.1514f, 15.8791f, 23.0118f, 10.4464f, 20.1917f, 6.5648f)
        curveTo(17.3716f, 2.6832f, 11.9388f, 1.8228f, 8.0573f, 4.6429f)
        close()
        moveTo(4.2117f, 18.1749f)
        curveTo(0.6198f, 13.231f, 1.7157f, 6.3113f, 6.6597f, 2.7193f)
        curveTo(11.6036f, -0.8727f, 18.5233f, 0.2233f, 22.1153f, 5.1672f)
        curveTo(25.7073f, 10.1112f, 24.6113f, 17.0309f, 19.6674f, 20.6229f)
        curveTo(14.7234f, 24.2148f, 7.8037f, 23.1189f, 4.2117f, 18.1749f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.2541f, 18.5142f)
        curveTo(19.7569f, 18.092f, 20.5068f, 18.1573f, 20.9291f, 18.6601f)
        lineTo(28.3242f, 27.466f)
        curveTo(28.7465f, 27.9688f, 28.6812f, 28.7187f, 28.1784f, 29.1409f)
        curveTo(27.6756f, 29.5632f, 26.9257f, 29.4979f, 26.5034f, 28.9951f)
        lineTo(19.1083f, 20.1892f)
        curveTo(18.686f, 19.6864f, 18.7513f, 18.9365f, 19.2541f, 18.5142f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(13.1677f, 18.73f)
        curveTo(17.0662f, 18.73f, 20.2265f, 15.5696f, 20.2265f, 11.6711f)
        curveTo(20.2265f, 7.7726f, 17.0662f, 4.6123f, 13.1677f, 4.6123f)
        curveTo(9.2692f, 4.6123f, 6.1089f, 7.7726f, 6.1089f, 11.6711f)
        curveTo(6.1089f, 15.5696f, 9.2692f, 18.73f, 13.1677f, 18.73f)
        close()
        moveTo(8.0625f, 11.7186f)
        curveTo(8.0625f, 8.6293f, 10.5669f, 6.1249f, 13.6563f, 6.1249f)
        verticalLineTo(5.1249f)
        curveTo(10.0146f, 5.1249f, 7.0625f, 8.077f, 7.0625f, 11.7186f)
        curveTo(7.0625f, 13.2484f, 7.5841f, 14.6577f, 8.4587f, 15.7766f)
        lineTo(9.2466f, 15.1607f)
        curveTo(8.5045f, 14.2114f, 8.0625f, 13.0174f, 8.0625f, 11.7186f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXSidebarTakIcons.CitySearch)
