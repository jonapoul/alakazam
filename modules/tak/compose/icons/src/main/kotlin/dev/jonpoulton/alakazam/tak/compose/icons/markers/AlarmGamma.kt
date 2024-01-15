package dev.jonpoulton.alakazam.tak.compose.icons.markers

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
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val MarkersTakIcons.AlarmGamma: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "AlarmGamma",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(2.0f, 1.0f)
        lineTo(30.0f, 1.0f)
        arcTo(2.0f, 2.0f, 0.0f, false, true, 32.0f, 3.0f)
        lineTo(32.0f, 31.0f)
        arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 33.0f)
        lineTo(2.0f, 33.0f)
        arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 31.0f)
        lineTo(0.0f, 3.0f)
        arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.0f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Alert),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(4.0f, 5.0f)
        horizontalLineToRelative(24.0f)
        verticalLineToRelative(24.0f)
        horizontalLineToRelative(-24.0f)
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
        moveTo(16.436f, 18.8654f)
        verticalLineTo(16.0488f)
        horizontalLineTo(23.0f)
        verticalLineTo(21.8206f)
        curveTo(21.7435f, 22.664f, 20.6307f, 23.2397f, 19.6618f, 23.5475f)
        curveTo(18.699f, 23.8492f, 17.555f, 24.0f, 16.2297f, 24.0f)
        curveTo(14.5981f, 24.0f, 13.2666f, 23.726f, 12.2351f, 23.1781f)
        curveTo(11.2099f, 22.6302f, 10.4128f, 21.8144f, 9.8439f, 20.7309f)
        curveTo(9.2813f, 19.6473f, 9.0f, 18.4037f, 9.0f, 17.0f)
        curveTo(9.0f, 15.5224f, 9.3094f, 14.2388f, 9.9283f, 13.1491f)
        curveTo(10.5472f, 12.0532f, 11.4537f, 11.2221f, 12.6477f, 10.6557f)
        curveTo(13.5791f, 10.2186f, 14.8326f, 10.0f, 16.4079f, 10.0f)
        curveTo(17.927f, 10.0f, 19.0616f, 10.1354f, 19.8118f, 10.4063f)
        curveTo(20.5682f, 10.6772f, 21.1933f, 11.0989f, 21.6872f, 11.6715f)
        curveTo(22.1873f, 12.2379f, 22.5624f, 12.9582f, 22.8125f, 13.8325f)
        lineTo(18.7147f, 14.5528f)
        curveTo(18.5459f, 14.0418f, 18.2583f, 13.6508f, 17.852f, 13.3799f)
        curveTo(17.4519f, 13.1091f, 16.9393f, 12.9736f, 16.3141f, 12.9736f)
        curveTo(15.3827f, 12.9736f, 14.6388f, 13.2938f, 14.0824f, 13.934f)
        curveTo(13.5323f, 14.5682f, 13.2572f, 15.5748f, 13.2572f, 16.9538f)
        curveTo(13.2572f, 18.4191f, 13.5354f, 19.4657f, 14.0918f, 20.0937f)
        curveTo(14.6544f, 20.7216f, 15.4358f, 21.0356f, 16.436f, 21.0356f)
        curveTo(16.9111f, 21.0356f, 17.3644f, 20.9679f, 17.7957f, 20.8325f)
        curveTo(18.2271f, 20.697f, 18.7209f, 20.4661f, 19.2773f, 20.1398f)
        verticalLineTo(18.8654f)
        horizontalLineTo(16.436f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.AlarmGamma)
