package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.Path: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Path",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(14.4209f, 7.075f)
        curveTo(14.2538f, 7.175f, 14.2573f, 13.5577f, 14.2573f, 13.5577f)
        verticalLineTo(13.5577f)
        curveTo(14.2573f, 14.1205f, 14.553f, 14.6419f, 15.0359f, 14.9308f)
        lineTo(23.4209f, 19.9477f)
        curveTo(23.5881f, 20.0477f, 23.7967f, 20.0477f, 23.9638f, 19.9477f)
        curveTo(24.1309f, 19.8477f, 24.1274f, 13.465f, 24.1274f, 13.465f)
        verticalLineTo(13.465f)
        curveTo(24.1274f, 12.9022f, 23.8318f, 12.3808f, 23.3488f, 12.0918f)
        lineTo(14.9638f, 7.075f)
        curveTo(14.7967f, 6.975f, 14.5881f, 6.975f, 14.4209f, 7.075f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(14.3364f, 7.075f)
        curveTo(14.5035f, 7.175f, 14.5f, 13.5577f, 14.5f, 13.5577f)
        verticalLineTo(13.5577f)
        curveTo(14.5f, 14.1205f, 14.2043f, 14.6419f, 13.7214f, 14.9308f)
        lineTo(5.3364f, 19.9477f)
        curveTo(5.1693f, 20.0477f, 4.9607f, 20.0477f, 4.7935f, 19.9477f)
        curveTo(4.6264f, 19.8477f, 4.6299f, 13.465f, 4.6299f, 13.465f)
        verticalLineTo(13.465f)
        curveTo(4.6299f, 12.9022f, 4.9256f, 12.3808f, 5.4085f, 12.0918f)
        lineTo(13.7935f, 7.075f)
        curveTo(13.9607f, 6.975f, 14.1692f, 6.975f, 14.3364f, 7.075f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(23.7065f, 13.075f)
        curveTo(23.8736f, 13.175f, 23.8701f, 19.5577f, 23.8701f, 19.5577f)
        verticalLineTo(19.5577f)
        curveTo(23.8701f, 20.1205f, 23.5745f, 20.6419f, 23.0915f, 20.9308f)
        lineTo(14.7065f, 25.9477f)
        curveTo(14.5394f, 26.0477f, 14.3308f, 26.0477f, 14.1636f, 25.9477f)
        curveTo(13.9965f, 25.8477f, 14.0f, 19.465f, 14.0f, 19.465f)
        verticalLineTo(19.465f)
        curveTo(14.0f, 18.9022f, 14.2957f, 18.3808f, 14.7786f, 18.0918f)
        lineTo(23.1636f, 13.075f)
        curveTo(23.3308f, 12.975f, 23.5394f, 12.975f, 23.7065f, 13.075f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.Path)
