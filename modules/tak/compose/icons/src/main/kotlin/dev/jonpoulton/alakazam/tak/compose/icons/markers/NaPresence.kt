package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons

val MarkersTakIcons.NaPresence: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "NaPresence",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      group {
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(20.9419f, 25.0f)
          curveTo(17.8473f, 25.0f, 14.7491f, 25.0f, 11.6546f, 25.0f)
          curveTo(11.4764f, 24.9745f, 11.2982f, 24.9527f, 11.12f, 24.9273f)
          curveTo(9.9055f, 24.7382f, 9.0437f, 23.7563f, 9.0073f, 22.5236f)
          curveTo(8.9819f, 21.6727f, 9.0328f, 20.8291f, 9.1928f, 19.9927f)
          curveTo(9.3528f, 19.1491f, 9.6037f, 18.3418f, 10.0982f, 17.6218f)
          curveTo(10.5382f, 16.9782f, 11.1346f, 16.5673f, 11.8946f, 16.4f)
          curveTo(12.3346f, 16.3018f, 12.7491f, 16.3018f, 13.1237f, 16.6145f)
          curveTo(13.3273f, 16.7818f, 13.5637f, 16.9127f, 13.7891f, 17.0509f)
          curveTo(14.4546f, 17.4545f, 15.1782f, 17.7054f, 15.9528f, 17.7636f)
          curveTo(17.0255f, 17.8436f, 18.0073f, 17.5527f, 18.9128f, 16.9854f)
          curveTo(19.2f, 16.8036f, 19.48f, 16.6145f, 19.771f, 16.44f)
          curveTo(19.8619f, 16.3854f, 19.971f, 16.3418f, 20.0728f, 16.3418f)
          curveTo(20.9419f, 16.3527f, 21.6873f, 16.6545f, 22.2655f, 17.3236f)
          curveTo(22.6146f, 17.7273f, 22.8655f, 18.1891f, 23.0473f, 18.6836f)
          curveTo(23.4982f, 19.9236f, 23.6255f, 21.2109f, 23.5928f, 22.5236f)
          curveTo(23.5637f, 23.6473f, 22.8619f, 24.56f, 21.7819f, 24.8545f)
          curveTo(21.5019f, 24.9273f, 21.2182f, 24.9527f, 20.9419f, 25.0f)
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
          moveTo(16.4437f, 9.0f)
          curveTo(16.7637f, 9.0546f, 17.091f, 9.0836f, 17.4037f, 9.1673f)
          curveTo(18.7637f, 9.5236f, 20.1055f, 10.8836f, 20.2655f, 12.5855f)
          curveTo(20.451f, 14.6036f, 19.1819f, 16.4327f, 17.2255f, 16.8982f)
          curveTo(14.9564f, 17.44f, 12.7091f, 15.9273f, 12.3528f, 13.6182f)
          curveTo(12.0255f, 11.5127f, 13.4473f, 9.48f, 15.5273f, 9.0836f)
          curveTo(15.7455f, 9.0436f, 15.971f, 9.0254f, 16.1891f, 9.0f)
          curveTo(16.2728f, 9.0f, 16.3564f, 9.0f, 16.4437f, 9.0f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
