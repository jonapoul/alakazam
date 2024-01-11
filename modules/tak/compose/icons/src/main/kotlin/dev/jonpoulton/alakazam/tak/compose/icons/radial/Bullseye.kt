package dev.jonpoulton.alakazam.tak.compose.icons.radial

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
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

val RadialTakIcons.Bullseye: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Bullseye",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      group {
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(17.3776f, 4.5f)
          curveTo(24.7661f, 4.5f, 30.7559f, 10.4894f, 30.7559f, 17.8776f)
          curveTo(30.7559f, 25.2659f, 24.7659f, 31.2559f, 17.3776f, 31.2559f)
          curveTo(9.9894f, 31.2559f, 4f, 25.2661f, 4f, 17.8776f)
          curveTo(4f, 10.4893f, 9.9893f, 4.5f, 17.3776f, 4.5f)
          close()
          moveTo(17.3776f, 6f)
          curveTo(10.8177f, 6f, 5.5f, 11.3177f, 5.5f, 17.8776f)
          curveTo(5.5f, 24.4377f, 10.8178f, 29.7559f, 17.3776f, 29.7559f)
          curveTo(23.9375f, 29.7559f, 29.2559f, 24.4375f, 29.2559f, 17.8776f)
          curveTo(29.2559f, 11.3178f, 23.9377f, 6f, 17.3776f, 6f)
          close()
          moveTo(17.378f, 9.5517f)
          curveTo(21.9763f, 9.5517f, 25.7047f, 13.2793f, 25.7047f, 17.8776f)
          curveTo(25.7047f, 22.4765f, 21.9764f, 26.2043f, 17.378f, 26.2043f)
          curveTo(12.779f, 26.2043f, 9.0513f, 22.4768f, 9.0513f, 17.8776f)
          curveTo(9.0513f, 13.279f, 12.7792f, 9.5517f, 17.378f, 9.5517f)
          close()
          moveTo(17.378f, 11.0516f)
          curveTo(13.6075f, 11.0516f, 10.5513f, 14.1075f, 10.5513f, 17.8776f)
          curveTo(10.5513f, 21.6483f, 13.6074f, 24.7043f, 17.378f, 24.7043f)
          curveTo(21.148f, 24.7043f, 24.2047f, 21.6481f, 24.2047f, 17.8776f)
          curveTo(24.2047f, 14.1078f, 21.1479f, 11.0516f, 17.378f, 11.0516f)
          close()
          moveTo(17.3777f, 14.0971f)
          curveTo(19.4657f, 14.0971f, 21.1583f, 15.79f, 21.1583f, 17.8776f)
          curveTo(21.1583f, 19.9658f, 19.4658f, 21.6589f, 17.3777f, 21.6589f)
          curveTo(15.2902f, 21.6589f, 13.5972f, 19.9656f, 13.5972f, 17.8776f)
          curveTo(13.5972f, 15.7902f, 15.2904f, 14.0971f, 17.3777f, 14.0971f)
          close()
          moveTo(17.3777f, 15.5971f)
          curveTo(16.1188f, 15.5971f, 15.0972f, 16.6186f, 15.0972f, 17.8776f)
          curveTo(15.0972f, 19.1372f, 16.1187f, 20.1589f, 17.3777f, 20.1589f)
          curveTo(18.6373f, 20.1589f, 19.6583f, 19.1375f, 19.6583f, 17.8776f)
          curveTo(19.6583f, 16.6183f, 18.6372f, 15.5971f, 17.3777f, 15.5971f)
          close()
        }
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(34.1765f, 0.6765f)
          horizontalLineTo(0.1765f)
          verticalLineTo(34.6765f)
          horizontalLineTo(34.1765f)
          verticalLineTo(0.6765f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
