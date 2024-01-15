package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.Survey: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Survey",
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
          pathFillType = NonZero,
        ) {
          moveTo(20.6931f, 8.3005f)
          curveTo(20.6931f, 9.4341f, 20.6931f, 10.551f, 20.6931f, 11.6679f)
          curveTo(20.6931f, 12.6181f, 20.1489f, 13.1683f, 19.1895f, 13.1683f)
          curveTo(18.3703f, 13.1683f, 17.5456f, 13.1738f, 16.7264f, 13.1683f)
          curveTo(15.8736f, 13.1627f, 15.3126f, 12.607f, 15.307f, 11.7513f)
          curveTo(15.3013f, 10.7122f, 15.307f, 9.6786f, 15.307f, 8.6395f)
          curveTo(15.307f, 8.5283f, 15.307f, 8.4227f, 15.307f, 8.3172f)
          curveTo(14.4373f, 8.1171f, 13.9548f, 8.6395f, 13.966f, 9.3452f)
          curveTo(13.9997f, 11.0178f, 13.9773f, 12.6959f, 13.9773f, 14.3686f)
          curveTo(13.9773f, 15.0354f, 14.3251f, 15.3688f, 14.9984f, 15.3688f)
          curveTo(15.3911f, 15.3688f, 15.7782f, 15.3688f, 16.2046f, 15.3688f)
          curveTo(16.2046f, 16.5524f, 16.2046f, 17.7193f, 16.2046f, 18.9085f)
          curveTo(17.4053f, 18.9085f, 18.5779f, 18.9085f, 19.7786f, 18.9085f)
          curveTo(19.7786f, 17.736f, 19.7786f, 16.5691f, 19.7786f, 15.3688f)
          curveTo(20.2162f, 15.3688f, 20.6258f, 15.3688f, 21.0353f, 15.3688f)
          curveTo(21.6637f, 15.3688f, 22.0228f, 15.0187f, 22.0228f, 14.3908f)
          curveTo(22.0228f, 12.746f, 21.9947f, 11.0956f, 22.034f, 9.4508f)
          curveTo(22.0565f, 8.6061f, 21.5908f, 8.1616f, 20.6931f, 8.3005f)
          close()
        }
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(20.6875f, 16.6356f)
          curveTo(20.6875f, 17.697f, 20.6875f, 18.7528f, 20.6875f, 19.8252f)
          curveTo(20.5584f, 19.8364f, 20.4462f, 19.8419f, 20.3059f, 19.853f)
          curveTo(20.4799f, 20.2809f, 20.6482f, 20.6866f, 20.8165f, 21.0978f)
          curveTo(22.0789f, 24.1485f, 23.3469f, 27.1992f, 24.6092f, 30.2499f)
          curveTo(24.6878f, 30.4444f, 24.7888f, 30.5111f, 24.9964f, 30.4999f)
          curveTo(25.4789f, 30.4833f, 25.967f, 30.4944f, 26.4944f, 30.4944f)
          curveTo(24.57f, 25.8544f, 22.6568f, 21.2478f, 20.7436f, 16.6356f)
          curveTo(20.7323f, 16.6356f, 20.7099f, 16.6356f, 20.6875f, 16.6356f)
          close()
        }
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(15.6772f, 19.8475f)
          curveTo(15.5482f, 19.842f, 15.4416f, 19.8309f, 15.3069f, 19.8253f)
          curveTo(15.3069f, 18.7584f, 15.3069f, 17.697f, 15.3069f, 16.6412f)
          curveTo(15.2901f, 16.6357f, 15.2677f, 16.6301f, 15.2508f, 16.6301f)
          curveTo(13.3376f, 21.2312f, 11.4301f, 25.8378f, 9.5f, 30.4889f)
          curveTo(10.0891f, 30.4889f, 10.6446f, 30.4945f, 11.1944f, 30.4778f)
          curveTo(11.2617f, 30.4778f, 11.3403f, 30.3333f, 11.3796f, 30.2388f)
          curveTo(11.9967f, 28.7607f, 12.6083f, 27.2826f, 13.2198f, 25.8045f)
          curveTo(14.0053f, 23.9096f, 14.7908f, 22.0092f, 15.5819f, 20.1143f)
          curveTo(15.6155f, 20.0309f, 15.6436f, 19.9476f, 15.6772f, 19.8475f)
          close()
        }
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(18.8751f, 19.8475f)
          curveTo(18.2804f, 19.8475f, 17.7137f, 19.8475f, 17.1302f, 19.8475f)
          curveTo(17.1302f, 23.3872f, 17.1302f, 26.9158f, 17.1302f, 30.4722f)
          curveTo(17.7025f, 30.4722f, 18.2804f, 30.4722f, 18.8751f, 30.4722f)
          curveTo(18.8751f, 26.9325f, 18.8751f, 23.4039f, 18.8751f, 19.8475f)
          close()
        }
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(19.7842f, 9.3562f)
          curveTo(19.7842f, 8.5894f, 19.7842f, 7.8225f, 19.7842f, 7.0501f)
          curveTo(19.7842f, 6.65f, 19.6327f, 6.5f, 19.2231f, 6.5f)
          curveTo(18.404f, 6.5f, 17.5849f, 6.5f, 16.7601f, 6.5f)
          curveTo(16.3786f, 6.5f, 16.2159f, 6.6556f, 16.2159f, 7.039f)
          curveTo(16.2159f, 8.6005f, 16.2159f, 10.1675f, 16.2159f, 11.729f)
          curveTo(16.2159f, 12.1124f, 16.373f, 12.2624f, 16.7657f, 12.2624f)
          curveTo(17.5849f, 12.268f, 18.404f, 12.268f, 19.2287f, 12.2624f)
          curveTo(19.6327f, 12.2624f, 19.7898f, 12.1069f, 19.7898f, 11.7123f)
          curveTo(19.7842f, 10.9288f, 19.7842f, 10.1397f, 19.7842f, 9.3562f)
          close()
          moveTo(17.9944f, 10.0564f)
          curveTo(17.5007f, 10.0508f, 17.0911f, 9.6396f, 17.1023f, 9.1506f)
          curveTo(17.108f, 8.6616f, 17.5344f, 8.256f, 18.0225f, 8.2671f)
          curveTo(18.4994f, 8.2782f, 18.9033f, 8.6894f, 18.9033f, 9.1617f)
          curveTo(18.9033f, 9.6452f, 18.4825f, 10.0619f, 17.9944f, 10.0564f)
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
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Survey)
