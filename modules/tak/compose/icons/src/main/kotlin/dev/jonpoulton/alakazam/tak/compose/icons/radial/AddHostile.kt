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

val RadialTakIcons.AddHostile: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "AddHostile",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      group {}
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
          moveTo(17.7385f, 3.6739f)
          lineTo(17.8225f, 3.7504f)
          lineTo(30.2493f, 16.7501f)
          curveTo(30.5216f, 17.0349f, 30.5463f, 17.4686f, 30.3236f, 17.7805f)
          lineTo(30.2493f, 17.8702f)
          lineTo(27.5605f, 20.6831f)
          curveTo(27.2512f, 21.0066f, 26.7382f, 21.0182f, 26.4146f, 20.7089f)
          curveTo(26.118f, 20.4254f, 26.0835f, 19.9707f, 26.3181f, 19.6476f)
          lineTo(26.3887f, 19.563f)
          lineTo(28.5425f, 17.3095f)
          lineTo(17.2365f, 5.4825f)
          lineTo(5.9305f, 17.3095f)
          lineTo(17.2365f, 29.1365f)
          lineTo(19.778f, 26.4788f)
          curveTo(20.0615f, 26.1822f, 20.5162f, 26.1478f, 20.8393f, 26.3824f)
          lineTo(20.9239f, 26.453f)
          curveTo(21.2205f, 26.7365f, 21.255f, 27.1913f, 21.0204f, 27.5143f)
          lineTo(20.9498f, 27.5989f)
          lineTo(17.8225f, 30.8705f)
          curveTo(17.5299f, 31.1767f, 17.0573f, 31.2022f, 16.7347f, 30.9471f)
          lineTo(16.6507f, 30.8705f)
          lineTo(4.2246f, 17.8701f)
          curveTo(3.9523f, 17.5853f, 3.9276f, 17.1516f, 4.1504f, 16.8397f)
          lineTo(4.2246f, 16.7501f)
          lineTo(16.6507f, 3.7505f)
          curveTo(16.9433f, 3.4444f, 17.4159f, 3.4188f, 17.7385f, 3.6739f)
          close()
          moveTo(25.3918f, 21.4355f)
          curveTo(25.7715f, 21.4355f, 26.0853f, 21.7177f, 26.135f, 22.0837f)
          lineTo(26.1418f, 22.1855f)
          lineTo(26.141f, 24.279f)
          lineTo(28.1101f, 24.2792f)
          curveTo(28.5243f, 24.2792f, 28.8601f, 24.615f, 28.8601f, 25.0292f)
          curveTo(28.8601f, 25.4089f, 28.578f, 25.7227f, 28.2119f, 25.7724f)
          lineTo(28.1101f, 25.7792f)
          lineTo(26.141f, 25.779f)
          lineTo(26.1418f, 27.873f)
          curveTo(26.1418f, 28.2872f, 25.8061f, 28.623f, 25.3918f, 28.623f)
          curveTo(25.0121f, 28.623f, 24.6983f, 28.3408f, 24.6487f, 27.9748f)
          lineTo(24.6418f, 27.873f)
          lineTo(24.641f, 25.779f)
          lineTo(22.6736f, 25.7792f)
          curveTo(22.2593f, 25.7792f, 21.9236f, 25.4435f, 21.9236f, 25.0292f)
          curveTo(21.9236f, 24.6496f, 22.2057f, 24.3358f, 22.5718f, 24.2861f)
          lineTo(22.6736f, 24.2792f)
          lineTo(24.641f, 24.279f)
          lineTo(24.6418f, 22.1855f)
          curveTo(24.6418f, 21.7713f, 24.9776f, 21.4355f, 25.3918f, 21.4355f)
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
          moveTo(33.8105f, 0.3105f)
          horizontalLineTo(-0.1895f)
          verticalLineTo(34.3105f)
          horizontalLineTo(33.8105f)
          verticalLineTo(0.3105f)
          close()
        }
      }
    }.build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
