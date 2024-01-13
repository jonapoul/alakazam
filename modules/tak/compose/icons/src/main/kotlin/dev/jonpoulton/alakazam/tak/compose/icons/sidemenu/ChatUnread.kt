package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.ChatUnread: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "ChatUnread",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      group {
        path(
          fill = SolidColor(TakColors.Cyber),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = EvenOdd,
        ) {
          moveTo(6.9231f, 6.5f)
          curveTo(6.4135f, 6.5f, 6f, 6.9139f, 6f, 7.4239f)
          verticalLineTo(22.9413f)
          curveTo(6f, 23.4504f, 6.4135f, 23.8652f, 6.9231f, 23.8652f)
          horizontalLineTo(18.4449f)
          lineTo(18.4338f, 29.5738f)
          curveTo(18.4329f, 29.8538f, 18.5594f, 30.1189f, 18.7772f, 30.2945f)
          curveTo(19.1732f, 30.6151f, 19.7548f, 30.5541f, 20.0751f, 30.1568f)
          lineTo(24.6674f, 23.8652f)
          horizontalLineTo(29.0769f)
          curveTo(29.5874f, 23.8652f, 30f, 23.4504f, 30f, 22.9413f)
          verticalLineTo(7.4239f)
          curveTo(30f, 6.9139f, 29.5874f, 6.5f, 29.0769f, 6.5f)
          horizontalLineTo(6.9231f)
          close()
        }
        path(
          fill = SolidColor(Color.Black),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(16.4641f, 18.3434f)
          curveTo(16.9544f, 18.3434f, 17.1996f, 18.555f, 17.1996f, 18.9782f)
          curveTo(17.1996f, 19.4181f, 16.9544f, 19.638f, 16.4641f, 19.638f)
          horizontalLineTo(12.3212f)
          curveTo(11.8228f, 19.638f, 11.5735f, 19.4181f, 11.5735f, 18.9782f)
          curveTo(11.5735f, 18.555f, 11.8228f, 18.3434f, 12.3212f, 18.3434f)
          horizontalLineTo(13.596f)
          verticalLineTo(12.667f)
          lineTo(12.4193f, 13.4015f)
          curveTo(12.3049f, 13.4678f, 12.2027f, 13.501f, 12.1129f, 13.501f)
          curveTo(11.9413f, 13.501f, 11.7942f, 13.4263f, 11.6716f, 13.277f)
          curveTo(11.5572f, 13.1276f, 11.5f, 12.9616f, 11.5f, 12.779f)
          curveTo(11.5f, 12.5384f, 11.6062f, 12.3517f, 11.8187f, 12.2189f)
          lineTo(13.7185f, 11.0239f)
          curveTo(13.9637f, 10.8745f, 14.1966f, 10.7998f, 14.4172f, 10.7998f)
          curveTo(14.646f, 10.7998f, 14.8298f, 10.8703f, 14.9688f, 11.0114f)
          curveTo(15.1077f, 11.1525f, 15.1771f, 11.3475f, 15.1771f, 11.5965f)
          verticalLineTo(18.3434f)
          horizontalLineTo(16.4641f)
          close()
        }
        path(
          fill = SolidColor(Color.Black),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(21.3499f, 19.75f)
          curveTo(20.3285f, 19.75f, 19.5481f, 19.3683f, 19.0088f, 18.6048f)
          curveTo(18.4695f, 17.833f, 18.1998f, 16.7127f, 18.1998f, 15.2438f)
          curveTo(18.1998f, 13.7832f, 18.4695f, 12.6712f, 19.0088f, 11.9077f)
          curveTo(19.5481f, 11.1359f, 20.3285f, 10.75f, 21.3499f, 10.75f)
          curveTo(22.3713f, 10.75f, 23.1517f, 11.1359f, 23.691f, 11.9077f)
          curveTo(24.2303f, 12.6712f, 24.5f, 13.7832f, 24.5f, 15.2438f)
          curveTo(24.5f, 16.7044f, 24.2303f, 17.8205f, 23.691f, 18.5923f)
          curveTo(23.1517f, 19.3641f, 22.3713f, 19.75f, 21.3499f, 19.75f)
          close()
          moveTo(21.3499f, 18.4927f)
          curveTo(21.9056f, 18.4927f, 22.3101f, 18.2355f, 22.5634f, 17.721f)
          curveTo(22.8167f, 17.1981f, 22.9433f, 16.3724f, 22.9433f, 15.2438f)
          curveTo(22.9433f, 14.1068f, 22.8167f, 13.2853f, 22.5634f, 12.779f)
          curveTo(22.3101f, 12.2645f, 21.9056f, 12.0073f, 21.3499f, 12.0073f)
          curveTo(20.7943f, 12.0073f, 20.3898f, 12.2645f, 20.1365f, 12.779f)
          curveTo(19.8832f, 13.2936f, 19.7565f, 14.1151f, 19.7565f, 15.2438f)
          curveTo(19.7565f, 16.3724f, 19.8832f, 17.1981f, 20.1365f, 17.721f)
          curveTo(20.3898f, 18.2355f, 20.7943f, 18.4927f, 21.3499f, 18.4927f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
