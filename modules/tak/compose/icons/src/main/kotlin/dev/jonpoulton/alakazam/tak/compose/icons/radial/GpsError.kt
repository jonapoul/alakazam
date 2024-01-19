package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.GpsError: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "GpsError",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(7.8535f, 17.1844f)
        verticalLineTo(17.1657f)
        curveTo(7.8535f, 15.305f, 9.3035f, 13.7811f, 11.2849f, 13.7811f)
        curveTo(12.2765f, 13.7811f, 12.9313f, 14.0065f, 13.5197f, 14.4172f)
        curveTo(13.6601f, 14.5201f, 13.8191f, 14.7166f, 13.8191f, 14.9972f)
        curveTo(13.8191f, 15.3892f, 13.501f, 15.7072f, 13.1081f, 15.7072f)
        curveTo(12.9023f, 15.7072f, 12.7723f, 15.6333f, 12.6685f, 15.5585f)
        curveTo(12.2765f, 15.2779f, 11.8555f, 15.1085f, 11.2381f, 15.1085f)
        curveTo(10.1913f, 15.1085f, 9.3587f, 16.0347f, 9.3587f, 17.1479f)
        verticalLineTo(17.1657f)
        curveTo(9.3587f, 18.3631f, 10.1819f, 19.2415f, 11.3419f, 19.2415f)
        curveTo(11.8649f, 19.2415f, 12.3326f, 19.1115f, 12.6975f, 18.8486f)
        verticalLineTo(17.914f)
        horizontalLineTo(11.7245f)
        curveTo(11.3794f, 17.914f, 11.0987f, 17.6428f, 11.0987f, 17.2966f)
        curveTo(11.0987f, 16.9514f, 11.3794f, 16.6708f, 11.7245f, 16.6708f)
        horizontalLineTo(13.3701f)
        curveTo(13.7723f, 16.6708f, 14.0904f, 16.9889f, 14.0904f, 17.3911f)
        verticalLineTo(18.9796f)
        curveTo(14.0904f, 19.4005f, 13.9314f, 19.6905f, 13.5852f, 19.8954f)
        curveTo(13.0529f, 20.2238f, 12.2765f, 20.5512f, 11.2952f, 20.5512f)
        curveTo(9.2567f, 20.5512f, 7.8535f, 19.1199f, 7.8535f, 17.1844f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(18.058f, 17.1944f)
        curveTo(18.7783f, 17.1944f, 19.1993f, 16.7641f, 19.1993f, 16.2028f)
        verticalLineTo(16.1841f)
        curveTo(19.1993f, 15.5386f, 18.7502f, 15.1934f, 18.0308f, 15.1934f)
        horizontalLineTo(16.9176f)
        verticalLineTo(17.1944f)
        horizontalLineTo(18.058f)
        close()
        moveTo(15.4779f, 14.6134f)
        curveTo(15.4779f, 14.2121f, 15.796f, 13.894f, 16.1982f, 13.894f)
        horizontalLineTo(18.1525f)
        curveTo(19.7138f, 13.894f, 20.6577f, 14.8192f, 20.6577f, 16.1569f)
        verticalLineTo(16.1747f)
        curveTo(20.6577f, 17.6893f, 19.4799f, 18.4751f, 18.0112f, 18.4751f)
        horizontalLineTo(16.9176f)
        verticalLineTo(19.7744f)
        curveTo(16.9176f, 20.1767f, 16.5996f, 20.4938f, 16.1982f, 20.4938f)
        curveTo(15.796f, 20.4938f, 15.4779f, 20.1767f, 15.4779f, 19.7744f)
        verticalLineTo(14.6134f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(21.5953f, 19.7469f)
        curveTo(21.4363f, 19.6347f, 21.325f, 19.4289f, 21.325f, 19.2044f)
        curveTo(21.325f, 18.8311f, 21.6234f, 18.5402f, 21.9976f, 18.5402f)
        curveTo(22.1847f, 18.5402f, 22.3156f, 18.6057f, 22.4092f, 18.6721f)
        curveTo(22.904f, 19.036f, 23.4466f, 19.2596f, 24.0828f, 19.2596f)
        curveTo(24.6721f, 19.2596f, 25.0267f, 19.0266f, 25.0267f, 18.6431f)
        verticalLineTo(18.6253f)
        curveTo(25.0267f, 18.2595f, 24.8031f, 18.0734f, 23.7086f, 17.7927f)
        curveTo(22.3905f, 17.4559f, 21.5392f, 17.0911f, 21.5392f, 15.7917f)
        verticalLineTo(15.773f)
        curveTo(21.5392f, 14.5849f, 22.4934f, 13.801f, 23.8302f, 13.801f)
        curveTo(24.6244f, 13.801f, 25.3176f, 14.0059f, 25.9051f, 14.3801f)
        curveTo(26.0641f, 14.4727f, 26.2231f, 14.6691f, 26.2231f, 14.9498f)
        curveTo(26.2231f, 15.324f, 25.9247f, 15.614f, 25.5515f, 15.614f)
        curveTo(25.4102f, 15.614f, 25.298f, 15.5766f, 25.1857f, 15.5111f)
        curveTo(24.7086f, 15.2304f, 24.2605f, 15.0714f, 23.8115f, 15.0714f)
        curveTo(23.2595f, 15.0714f, 22.9705f, 15.324f, 22.9705f, 15.642f)
        verticalLineTo(15.6608f)
        curveTo(22.9705f, 16.0911f, 23.2511f, 16.2314f, 24.3821f, 16.5214f)
        curveTo(25.7096f, 16.8666f, 26.457f, 17.3437f, 26.457f, 18.484f)
        verticalLineTo(18.5028f)
        curveTo(26.457f, 19.8031f, 25.4663f, 20.5318f, 24.0547f, 20.5318f)
        curveTo(23.194f, 20.5318f, 22.325f, 20.2708f, 21.5953f, 19.7469f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(28.0596f, 26.6397f)
        curveTo(23.0912f, 32.667f, 14.177f, 33.5267f, 8.1497f, 28.5593f)
        curveTo(2.1205f, 23.5919f, 1.2617f, 14.6777f, 6.2291f, 8.6494f)
        curveTo(11.1966f, 2.6211f, 20.1108f, 1.7614f, 26.139f, 6.7288f)
        curveTo(32.1673f, 11.6963f, 33.027f, 20.6114f, 28.0596f, 26.6397f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(12.7576f, 22.9672f)
        lineTo(8.4403f, 28.2068f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(26.1393f, 6.7287f)
        lineTo(22.2533f, 11.4444f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.GpsError)
