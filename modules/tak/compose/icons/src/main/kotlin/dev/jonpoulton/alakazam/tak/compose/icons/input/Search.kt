package dev.jonpoulton.alakazam.tak.compose.icons.input

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.InputTakIcons

val InputTakIcons.Search: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Search",
      defaultWidth = 24.0.dp,
      defaultHeight = 25.0.dp,
      viewportWidth = 24.0f,
      viewportHeight = 25.0f,
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
        moveTo(7.4147f, 13.3699f)
        curveTo(6.0306f, 11.465f, 6.4529f, 8.7987f, 8.3579f, 7.4147f)
        curveTo(10.2629f, 6.0306f, 12.9291f, 6.4529f, 14.3131f, 8.3579f)
        curveTo(15.6972f, 10.2629f, 15.2749f, 12.9291f, 13.3699f, 14.3131f)
        curveTo(11.465f, 15.6972f, 8.7987f, 15.2749f, 7.4147f, 13.3699f)
        close()
        moveTo(7.4174f, 6.1202f)
        curveTo(4.7976f, 8.0237f, 4.2168f, 11.6905f, 6.1202f, 14.3104f)
        curveTo(7.9736f, 16.8613f, 11.4988f, 17.479f, 14.1014f, 15.7527f)
        lineTo(17.5575f, 19.868f)
        curveTo(17.8416f, 20.2064f, 18.3462f, 20.2503f, 18.6846f, 19.9662f)
        curveTo(19.0229f, 19.682f, 19.0669f, 19.1774f, 18.7827f, 18.8391f)
        lineTo(15.3035f, 14.6961f)
        curveTo(17.0452f, 12.6819f, 17.2402f, 9.6645f, 15.6076f, 7.4174f)
        curveTo(13.7041f, 4.7976f, 10.0373f, 4.2168f, 7.4174f, 6.1202f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
