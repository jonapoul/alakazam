package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.RAndBLine: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RAndBLine",
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
        pathFillType = EvenOdd,
      ) {
        moveTo(1.8591f, 6.3301f)
        curveTo(1.8591f, 4.1375f, 3.637f, 2.3594f, 5.8291f, 2.3594f)
        curveTo(8.0224f, 2.3594f, 9.7998f, 4.1371f, 9.7998f, 6.3301f)
        curveTo(9.7998f, 8.5225f, 8.0223f, 10.3001f, 5.8291f, 10.3001f)
        curveTo(3.6371f, 10.3001f, 1.8591f, 8.5221f, 1.8591f, 6.3301f)
        close()
        moveTo(8.2998f, 6.3301f)
        curveTo(8.2998f, 4.9655f, 7.1939f, 3.8594f, 5.8291f, 3.8594f)
        curveTo(4.4654f, 3.8594f, 3.3591f, 4.9659f, 3.3591f, 6.3301f)
        curveTo(3.3591f, 7.6937f, 4.4655f, 8.8001f, 5.8291f, 8.8001f)
        curveTo(7.1938f, 8.8001f, 8.2998f, 7.6941f, 8.2998f, 6.3301f)
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
        moveTo(20.675f, 24.8702f)
        curveTo(20.675f, 22.6775f, 22.4529f, 20.8994f, 24.645f, 20.8994f)
        curveTo(26.8377f, 20.8994f, 28.6149f, 22.6773f, 28.6149f, 24.8702f)
        curveTo(28.6149f, 27.0624f, 26.8375f, 28.8401f, 24.645f, 28.8401f)
        curveTo(22.453f, 28.8401f, 20.675f, 27.0621f, 20.675f, 24.8702f)
        close()
        moveTo(27.1149f, 24.8702f)
        curveTo(27.1149f, 23.5056f, 26.0091f, 22.3994f, 24.645f, 22.3994f)
        curveTo(23.2814f, 22.3994f, 22.175f, 23.5059f, 22.175f, 24.8702f)
        curveTo(22.175f, 26.2337f, 23.2814f, 27.3401f, 24.645f, 27.3401f)
        curveTo(26.009f, 27.3401f, 27.1149f, 26.234f, 27.1149f, 24.8702f)
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
        moveTo(9.0359f, 9.0402f)
        curveTo(9.2918f, 8.7639f, 9.7073f, 8.7238f, 10.009f, 8.9302f)
        lineTo(10.0958f, 8.9996f)
        lineTo(21.912f, 19.9439f)
        curveTo(22.2159f, 20.2254f, 22.2341f, 20.6999f, 21.9526f, 21.0038f)
        curveTo(21.6967f, 21.2801f, 21.2813f, 21.3202f, 20.9796f, 21.1138f)
        lineTo(20.8927f, 21.0444f)
        lineTo(9.0765f, 10.1f)
        curveTo(8.7726f, 9.8186f, 8.7545f, 9.3441f, 9.0359f, 9.0402f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
