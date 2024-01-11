package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

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
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

val RaptorXTakIcons.RangeRings: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RangeRings",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
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
          moveTo(14.9997f, 4.5f)
          curveTo(21.0748f, 4.5f, 26.0f, 9.4248f, 26.0f, 15.4997f)
          curveTo(26.0f, 21.5747f, 21.0747f, 26.5f, 14.9997f, 26.5f)
          curveTo(8.9248f, 26.5f, 4.0f, 21.5748f, 4.0f, 15.4997f)
          curveTo(4.0f, 9.4247f, 8.9247f, 4.5f, 14.9997f, 4.5f)
          close()
          moveTo(14.9997f, 5.7334f)
          curveTo(9.6058f, 5.7334f, 5.2334f, 10.1058f, 5.2334f, 15.4997f)
          curveTo(5.2334f, 20.8937f, 9.606f, 25.2666f, 14.9997f, 25.2666f)
          curveTo(20.3935f, 25.2666f, 24.7666f, 20.8935f, 24.7666f, 15.4997f)
          curveTo(24.7666f, 10.106f, 20.3937f, 5.7334f, 14.9997f, 5.7334f)
          close()
          moveTo(15.0f, 8.6537f)
          curveTo(18.7809f, 8.6537f, 21.8466f, 11.7187f, 21.8466f, 15.4997f)
          curveTo(21.8466f, 19.2812f, 18.781f, 22.3463f, 15.0f, 22.3463f)
          curveTo(11.2185f, 22.3463f, 8.1534f, 19.2814f, 8.1534f, 15.4997f)
          curveTo(8.1534f, 11.7185f, 11.2186f, 8.6537f, 15.0f, 8.6537f)
          close()
          moveTo(15.0f, 9.8871f)
          curveTo(11.8998f, 9.8871f, 9.3868f, 12.3997f, 9.3868f, 15.4997f)
          curveTo(9.3868f, 18.6002f, 11.8997f, 21.1129f, 15.0f, 21.1129f)
          curveTo(18.0999f, 21.1129f, 20.6132f, 18.5999f, 20.6132f, 15.4997f)
          curveTo(20.6132f, 12.4f, 18.0998f, 9.8871f, 15.0f, 9.8871f)
          close()
          moveTo(14.9998f, 12.3912f)
          curveTo(16.7166f, 12.3912f, 18.1083f, 13.7831f, 18.1083f, 15.4997f)
          curveTo(18.1083f, 17.2167f, 16.7167f, 18.6088f, 14.9998f, 18.6088f)
          curveTo(13.2833f, 18.6088f, 11.8913f, 17.2165f, 11.8913f, 15.4997f)
          curveTo(11.8913f, 13.7833f, 13.2835f, 12.3912f, 14.9998f, 12.3912f)
          close()
          moveTo(14.9998f, 13.6245f)
          curveTo(13.9646f, 13.6245f, 13.1247f, 14.4645f, 13.1247f, 15.4997f)
          curveTo(13.1247f, 16.5354f, 13.9646f, 17.3755f, 14.9998f, 17.3755f)
          curveTo(16.0355f, 17.3755f, 16.875f, 16.5357f, 16.875f, 15.4997f)
          curveTo(16.875f, 14.4643f, 16.0354f, 13.6245f, 14.9998f, 13.6245f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
