package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.Chat: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Chat",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      group {
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = EvenOdd,
        ) {
          moveTo(24.4329f, 15.9952f)
          horizontalLineTo(10.3542f)
          curveTo(9.8446f, 15.9952f, 9.4311f, 15.5822f, 9.4311f, 15.0713f)
          curveTo(9.4311f, 14.5603f, 9.8446f, 14.1474f, 10.3542f, 14.1474f)
          horizontalLineTo(24.4329f)
          curveTo(24.9434f, 14.1474f, 25.356f, 14.5603f, 25.356f, 15.0713f)
          curveTo(25.356f, 15.5822f, 24.9434f, 15.9952f, 24.4329f, 15.9952f)
          close()
          moveTo(15.3083f, 20.0901f)
          horizontalLineTo(10.3542f)
          curveTo(9.8446f, 20.0901f, 9.4311f, 19.6761f, 9.4311f, 19.1661f)
          curveTo(9.4311f, 18.6561f, 9.8446f, 18.2422f, 10.3542f, 18.2422f)
          horizontalLineTo(15.3083f)
          curveTo(15.8188f, 18.2422f, 16.2314f, 18.6561f, 16.2314f, 19.1661f)
          curveTo(16.2314f, 19.6761f, 15.8188f, 20.0901f, 15.3083f, 20.0901f)
          close()
          moveTo(10.3542f, 9.8058f)
          horizontalLineTo(20.7249f)
          curveTo(21.2354f, 9.8058f, 21.648f, 10.2188f, 21.648f, 10.7297f)
          curveTo(21.648f, 11.2397f, 21.2354f, 11.6537f, 20.7249f, 11.6537f)
          horizontalLineTo(10.3542f)
          curveTo(9.8446f, 11.6537f, 9.4311f, 11.2397f, 9.4311f, 10.7297f)
          curveTo(9.4311f, 10.2188f, 9.8446f, 9.8058f, 10.3542f, 9.8058f)
          close()
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
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Chat)
