package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

val RaptorXTakIcons.TerrainDiscovery: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "TerrainDiscovery",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(11.2901f, 14.044f)
        lineTo(9.5388f, 16.5439f)
        lineTo(8.8365f, 15.5408f)
        curveTo(8.671f, 15.3044f, 8.3111f, 15.3044f, 8.1456f, 15.5408f)
        lineTo(4.0725f, 21.3572f)
        curveTo(3.8842f, 21.6261f, 4.0846f, 21.9891f, 4.4204f, 21.9873f)
        lineTo(16.7113f, 21.9195f)
        curveTo(17.0449f, 21.9176f, 17.2415f, 21.5566f, 17.0544f, 21.2894f)
        lineTo(11.981f, 14.044f)
        curveTo(11.8155f, 13.8077f, 11.4556f, 13.8077f, 11.2901f, 14.044f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.2978f, 9.2418f)
        curveTo(16.5081f, 8.9435f, 16.952f, 8.921f, 17.1972f, 9.1754f)
        lineTo(17.2501f, 9.2391f)
        lineTo(25.9002f, 21.3502f)
        curveTo(26.1433f, 21.6905f, 25.9157f, 22.143f, 25.5043f, 22.1951f)
        lineTo(25.4251f, 22.2f)
        horizontalLineTo(19.5168f)
        lineTo(13.9f, 13.9566f)
        lineTo(16.2978f, 9.2418f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
