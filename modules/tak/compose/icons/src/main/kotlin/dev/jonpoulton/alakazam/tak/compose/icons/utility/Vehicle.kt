package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons

public val UtilityTakIcons.Vehicle: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Vehicle",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(27.5906f, 10.0709f)
        curveTo(27.8074f, 10.0709f, 28.014f, 10.1695f, 28.1525f, 10.3384f)
        curveTo(28.2902f, 10.5081f, 28.3432f, 10.7292f, 28.3011f, 10.9416f)
        lineTo(27.8922f, 12.9187f)
        curveTo(27.8241f, 13.2566f, 27.5268f, 13.4973f, 27.1824f, 13.4973f)
        horizontalLineTo(26.3117f)
        curveTo(27.1462f, 14.4253f, 27.5457f, 15.6121f, 27.5413f, 16.7967f)
        curveTo(27.5348f, 18.1083f, 27.0367f, 19.422f, 25.9942f, 20.3768f)
        verticalLineTo(23.0897f)
        curveTo(25.9942f, 23.6893f, 25.5055f, 24.1772f, 24.9067f, 24.1772f)
        horizontalLineTo(22.3648f)
        curveTo(21.7645f, 24.1772f, 21.2773f, 23.6893f, 21.2773f, 23.0897f)
        verticalLineTo(21.9776f)
        horizontalLineTo(7.0376f)
        verticalLineTo(23.0897f)
        curveTo(7.0376f, 23.6893f, 6.5504f, 24.1772f, 5.9501f, 24.1772f)
        horizontalLineTo(3.4082f)
        curveTo(2.8079f, 24.1772f, 2.3207f, 23.6893f, 2.3207f, 23.0897f)
        verticalLineTo(20.3224f)
        curveTo(2.3152f, 20.3173f, 2.3095f, 20.313f, 2.3037f, 20.3087f)
        curveTo(2.2988f, 20.3051f, 2.2938f, 20.3013f, 2.2888f, 20.297f)
        curveTo(1.3065f, 19.3922f, 0.7692f, 18.1133f, 0.7743f, 16.6981f)
        curveTo(0.7794f, 15.5526f, 1.1615f, 14.4079f, 1.9495f, 13.4987f)
        horizontalLineTo(1.1332f)
        curveTo(0.7903f, 13.4987f, 0.493f, 13.258f, 0.4234f, 12.9209f)
        lineTo(0.0152f, 10.9431f)
        curveTo(-0.0297f, 10.7292f, 0.0254f, 10.5066f, 0.1631f, 10.3384f)
        curveTo(0.3002f, 10.1695f, 0.5061f, 10.0709f, 0.725f, 10.0709f)
        horizontalLineTo(3.4807f)
        curveTo(4.1644f, 8.2802f, 5.0467f, 6.5206f, 6.0545f, 5.8565f)
        curveTo(9.5381f, 3.5648f, 18.7782f, 3.5648f, 22.2619f, 5.8565f)
        curveTo(23.2689f, 6.5199f, 24.1548f, 8.2773f, 24.8349f, 10.0709f)
        horizontalLineTo(27.5906f)
        close()
        moveTo(21.0649f, 7.6726f)
        curveTo(18.2896f, 5.8449f, 10.0253f, 5.8449f, 7.2485f, 7.6726f)
        curveTo(6.7091f, 8.0279f, 6.0153f, 9.4576f, 5.3809f, 11.2084f)
        horizontalLineTo(22.9339f)
        curveTo(22.2981f, 9.4568f, 21.6043f, 8.0264f, 21.0649f, 7.6726f)
        close()
        moveTo(3.9962f, 16.9707f)
        curveTo(3.9962f, 15.789f, 4.9546f, 14.832f, 6.1357f, 14.832f)
        curveTo(7.3182f, 14.832f, 8.2752f, 15.789f, 8.2752f, 16.9707f)
        curveTo(8.2752f, 18.1525f, 7.3182f, 19.1102f, 6.1357f, 19.1102f)
        curveTo(4.9546f, 19.1102f, 3.9962f, 18.1525f, 3.9962f, 16.9707f)
        close()
        moveTo(20.068f, 16.9707f)
        curveTo(20.068f, 18.1525f, 21.0265f, 19.1102f, 22.2075f, 19.1102f)
        curveTo(23.3885f, 19.1102f, 24.347f, 18.1525f, 24.347f, 16.9707f)
        curveTo(24.347f, 15.789f, 23.39f, 14.832f, 22.2075f, 14.832f)
        curveTo(21.0265f, 14.832f, 20.068f, 15.789f, 20.068f, 16.9707f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
