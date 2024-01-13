package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.ReportIssue: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "ReportIssue",
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
        moveTo(15.0f, 7.4979f)
        lineTo(24.537f, 24.0159f)
        horizontalLineTo(5.463f)
        lineTo(15.0f, 7.4979f)
        close()
        moveTo(4.5353f, 25.087f)
        horizontalLineTo(25.4647f)
        curveTo(25.6554f, 25.087f, 25.8325f, 24.9849f, 25.9282f, 24.8192f)
        curveTo(26.0239f, 24.6535f, 26.0239f, 24.4493f, 25.9282f, 24.2836f)
        lineTo(15.4635f, 6.1587f)
        curveTo(15.2721f, 5.8273f, 14.7272f, 5.8273f, 14.5358f, 6.1587f)
        lineTo(4.0718f, 24.2836f)
        curveTo(3.9761f, 24.4493f, 3.9761f, 24.6535f, 4.0718f, 24.8192f)
        curveTo(4.1675f, 24.9849f, 4.3446f, 25.087f, 4.5353f, 25.087f)
        close()
        moveTo(16.0729f, 20.8665f)
        curveTo(16.0729f, 20.2744f, 15.6159f, 19.8174f, 14.9995f, 19.8174f)
        curveTo(14.3839f, 19.8174f, 13.9261f, 20.2744f, 13.9261f, 20.8665f)
        verticalLineTo(20.8908f)
        curveTo(13.9261f, 21.4828f, 14.3839f, 21.9399f, 14.9995f, 21.9399f)
        curveTo(15.6159f, 21.9399f, 16.0729f, 21.4828f, 16.0729f, 20.8908f)
        verticalLineTo(20.8665f)
        close()
        moveTo(14.3954f, 13.1934f)
        curveTo(14.0633f, 13.1934f, 13.8662f, 13.4655f, 13.9019f, 13.8226f)
        lineTo(14.4318f, 18.4611f)
        curveTo(14.4704f, 18.794f, 14.6911f, 19.0039f, 14.9996f, 19.0039f)
        curveTo(15.3081f, 19.0039f, 15.5317f, 18.794f, 15.5674f, 18.4611f)
        lineTo(16.0973f, 13.8226f)
        curveTo(16.1358f, 13.4655f, 15.938f, 13.1934f, 15.6038f, 13.1934f)
        horizontalLineTo(14.3954f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
