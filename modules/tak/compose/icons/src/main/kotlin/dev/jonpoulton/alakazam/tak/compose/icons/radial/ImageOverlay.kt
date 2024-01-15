package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RadialTakIcons.ImageOverlay: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "ImageOverlay",
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
        moveTo(19.2486f, 6.1667f)
        horizontalLineTo(6.0846f)
        curveTo(5.8538f, 6.1667f, 5.6666f, 6.3538f, 5.6666f, 6.5847f)
        verticalLineTo(14.5667f)
        verticalLineTo(19.6067f)
        verticalLineTo(19.7487f)
        curveTo(5.6666f, 19.9795f, 5.8538f, 20.1667f, 6.0846f, 20.1667f)
        horizontalLineTo(12f)
        verticalLineTo(14.5667f)
        horizontalLineTo(6.5024f)
        verticalLineTo(7.0023f)
        horizontalLineTo(18.8304f)
        verticalLineTo(12f)
        horizontalLineTo(19.6666f)
        verticalLineTo(6.5847f)
        curveTo(19.6666f, 6.3538f, 19.4795f, 6.1667f, 19.2486f, 6.1667f)
        close()
        moveTo(15.2726f, 9.5436f)
        curveTo(15.2726f, 10.2918f, 14.6666f, 10.8977f, 13.9185f, 10.8977f)
        curveTo(13.1703f, 10.8977f, 12.5638f, 10.2918f, 12.5638f, 9.5436f)
        curveTo(12.5638f, 8.7955f, 13.1703f, 8.1895f, 13.9185f, 8.1895f)
        curveTo(14.6666f, 8.1895f, 15.2726f, 8.7955f, 15.2726f, 9.5436f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 0.75f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(22.0001f, 14f)
        horizontalLineTo(25.5938f)
        curveTo(26.9229f, 14f, 28f, 14.9575f, 28f, 16.1389f)
        verticalLineTo(25.8611f)
        curveTo(28f, 27.0425f, 26.9229f, 28f, 25.5938f, 28f)
        horizontalLineTo(16.4063f)
        curveTo(15.0771f, 28f, 14f, 27.0425f, 14f, 25.8611f)
        verticalLineTo(22f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 0.75f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(21f, 14.2222f)
        curveTo(21f, 13.5471f, 20.3845f, 13f, 19.6251f, 13f)
        horizontalLineTo(14.375f)
        curveTo(13.6155f, 13f, 13f, 13.5471f, 13f, 14.2222f)
        verticalLineTo(19.7778f)
        curveTo(13f, 20.4529f, 13.6155f, 21f, 14.375f, 21f)
        horizontalLineTo(19.6251f)
        curveTo(20.3845f, 21f, 21f, 20.4529f, 21f, 19.7778f)
        verticalLineTo(14.2222f)
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
        moveTo(19.8336f, 14.1736f)
        lineTo(19.8336f, 14.1736f)
        arcTo(0.5f, 0.5f, 0f, false, true, 19.8336f, 14.8807f)
        lineTo(14.8838f, 19.8304f)
        arcTo(0.5f, 0.5f, 82.0513f, false, true, 14.1767f, 19.8304f)
        lineTo(14.1767f, 19.8304f)
        arcTo(0.5f, 0.5f, 82.0513f, false, true, 14.1767f, 19.1233f)
        lineTo(19.1264f, 14.1736f)
        arcTo(0.5f, 0.5f, 0f, false, true, 19.8336f, 14.1736f)
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
        moveTo(19.5924f, 16.7717f)
        lineTo(19.5924f, 16.7717f)
        arcTo(0.5f, 0.5f, 104.6621f, false, true, 19.5924f, 17.4788f)
        lineTo(17.4787f, 19.5924f)
        arcTo(0.5f, 0.5f, 51.1977f, false, true, 16.7716f, 19.5924f)
        lineTo(16.7716f, 19.5924f)
        arcTo(0.5f, 0.5f, 51.1977f, false, true, 16.7716f, 18.8853f)
        lineTo(18.8852f, 16.7717f)
        arcTo(0.5f, 0.5f, 104.6621f, false, true, 19.5924f, 16.7717f)
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
        moveTo(17.1743f, 14.3536f)
        lineTo(17.1743f, 14.3536f)
        arcTo(0.5f, 0.5f, 107.7742f, false, true, 17.1743f, 15.0607f)
        lineTo(15.0606f, 17.1743f)
        arcTo(0.5f, 0.5f, 114.4745f, false, true, 14.3535f, 17.1743f)
        lineTo(14.3535f, 17.1743f)
        arcTo(0.5f, 0.5f, 114.4745f, false, true, 14.3535f, 16.4672f)
        lineTo(16.4671f, 14.3536f)
        arcTo(0.5f, 0.5f, 107.7742f, false, true, 17.1743f, 14.3536f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.ImageOverlay)
