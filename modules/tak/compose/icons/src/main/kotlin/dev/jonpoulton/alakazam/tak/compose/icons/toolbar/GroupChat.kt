package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

val ToolbarTakIcons.GroupChat: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "GroupChat",
      defaultWidth = 40.0.dp,
      defaultHeight = 41.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 41.0f,
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
        moveTo(25.6289f, 7.5f)
        horizontalLineTo(5.7969f)
        curveTo(4.2528f, 7.5f, 2.9999f, 8.7525f, 2.9999f, 10.297f)
        verticalLineTo(21.932f)
        lineTo(3.005f, 22.1024f)
        curveTo(3.0931f, 23.5675f, 4.31f, 24.729f, 5.7969f, 24.729f)
        lineTo(7.689f, 24.7289f)
        lineTo(7.4743f, 28.1654f)
        curveTo(7.4008f, 29.0144f, 8.3499f, 29.5911f, 9.0828f, 29.1244f)
        lineTo(14.2033f, 24.7697f)
        lineTo(14.2701f, 24.7527f)
        curveTo(14.3207f, 24.7414f, 14.3924f, 24.729f, 14.4649f, 24.729f)
        horizontalLineTo(25.6289f)
        curveTo(27.1737f, 24.729f, 28.4259f, 23.4768f, 28.4259f, 21.932f)
        verticalLineTo(10.297f)
        curveTo(28.4259f, 8.7522f, 27.1737f, 7.5f, 25.6289f, 7.5f)
        close()
        moveTo(5.7969f, 8.926f)
        horizontalLineTo(25.6289f)
        curveTo(26.3861f, 8.926f, 26.9999f, 9.5398f, 26.9999f, 10.297f)
        verticalLineTo(21.932f)
        curveTo(26.9999f, 22.6892f, 26.3861f, 23.303f, 25.6289f, 23.303f)
        horizontalLineTo(14.4649f)
        lineTo(14.2695f, 23.3123f)
        curveTo(13.9457f, 23.3431f, 13.6323f, 23.4503f, 13.357f, 23.6262f)
        lineTo(8.952f, 27.3719f)
        lineTo(9.1395f, 24.3946f)
        curveTo(9.1912f, 23.8159f, 8.7204f, 23.303f, 8.1219f, 23.303f)
        horizontalLineTo(5.7969f)
        curveTo(5.0403f, 23.303f, 4.4259f, 22.6888f, 4.4259f, 21.932f)
        verticalLineTo(10.297f)
        curveTo(4.4259f, 9.5402f, 5.0403f, 8.926f, 5.7969f, 8.926f)
        close()
        moveTo(36.9222f, 19.3658f)
        curveTo(36.8385f, 18.1283f, 35.8079f, 17.1506f, 34.5487f, 17.1506f)
        horizontalLineTo(31.5347f)
        verticalLineTo(18.6506f)
        horizontalLineTo(34.5487f)
        lineTo(34.659f, 18.6574f)
        curveTo(35.0926f, 18.7116f, 35.4277f, 19.081f, 35.4277f, 19.5286f)
        verticalLineTo(28.6166f)
        lineTo(35.4208f, 28.7267f)
        curveTo(35.3666f, 29.1596f, 34.997f, 29.4946f, 34.5487f, 29.4946f)
        horizontalLineTo(32.7337f)
        lineTo(32.6193f, 29.5011f)
        curveTo(32.0944f, 29.5613f, 31.7004f, 30.0305f, 31.7464f, 30.5702f)
        lineTo(31.863f, 32.4289f)
        lineTo(28.8311f, 29.8388f)
        lineTo(28.7459f, 29.7759f)
        lineTo(28.5976f, 29.6915f)
        curveTo(28.3445f, 29.5628f, 28.0636f, 29.4946f, 27.7787f, 29.4946f)
        horizontalLineTo(19.0577f)
        lineTo(18.9476f, 29.4878f)
        curveTo(18.5147f, 29.4336f, 18.1797f, 29.0641f, 18.1797f, 28.6166f)
        verticalLineTo(27.2426f)
        horizontalLineTo(16.6797f)
        verticalLineTo(28.6166f)
        lineTo(16.6852f, 28.7794f)
        curveTo(16.7688f, 30.0167f, 17.7992f, 30.9946f, 19.0577f, 30.9946f)
        horizontalLineTo(27.7787f)
        lineTo(27.8355f, 31.0002f)
        lineTo(27.8911f, 31.0166f)
        lineTo(27.915f, 31.0279f)
        lineTo(31.7952f, 34.3354f)
        lineTo(31.8987f, 34.3967f)
        curveTo(32.6617f, 34.8025f, 33.5002f, 34.2559f, 33.4298f, 33.4559f)
        lineTo(33.275f, 30.9939f)
        lineTo(34.5487f, 30.9946f)
        lineTo(34.7116f, 30.9891f)
        curveTo(35.9496f, 30.9055f, 36.9277f, 29.8753f, 36.9277f, 28.6166f)
        verticalLineTo(19.5286f)
        lineTo(36.9222f, 19.3658f)
        close()
        moveTo(22.7003f, 11.7128f)
        curveTo(23.1145f, 11.7128f, 23.4503f, 12.0486f, 23.4503f, 12.4628f)
        curveTo(23.4503f, 12.8425f, 23.1681f, 13.1563f, 22.802f, 13.206f)
        lineTo(22.7003f, 13.2128f)
        horizontalLineTo(7.4663f)
        curveTo(7.0521f, 13.2128f, 6.7163f, 12.877f, 6.7163f, 12.4628f)
        curveTo(6.7163f, 12.0831f, 6.9984f, 11.7693f, 7.3645f, 11.7196f)
        lineTo(7.4663f, 11.7128f)
        horizontalLineTo(22.7003f)
        close()
        moveTo(11.6923f, 16.5087f)
        curveTo(11.6923f, 16.0945f, 11.3565f, 15.7587f, 10.9423f, 15.7587f)
        horizontalLineTo(7.4663f)
        lineTo(7.3645f, 15.7655f)
        curveTo(6.9984f, 15.8152f, 6.7163f, 16.129f, 6.7163f, 16.5087f)
        curveTo(6.7163f, 16.9229f, 7.0521f, 17.2587f, 7.4663f, 17.2587f)
        horizontalLineTo(10.9423f)
        lineTo(11.044f, 17.2519f)
        curveTo(11.4101f, 17.2022f, 11.6923f, 16.8884f, 11.6923f, 16.5087f)
        close()
        moveTo(21.105f, 15.7587f)
        curveTo(21.5192f, 15.7587f, 21.855f, 16.0945f, 21.855f, 16.5087f)
        curveTo(21.855f, 16.8884f, 21.5728f, 17.2022f, 21.2067f, 17.2519f)
        lineTo(21.105f, 17.2587f)
        horizontalLineTo(13.627f)
        curveTo(13.2128f, 17.2587f, 12.877f, 16.9229f, 12.877f, 16.5087f)
        curveTo(12.877f, 16.129f, 13.1591f, 15.8152f, 13.5252f, 15.7655f)
        lineTo(13.627f, 15.7587f)
        horizontalLineTo(21.105f)
        close()
        moveTo(18.4443f, 20.142f)
        curveTo(18.4443f, 19.7278f, 18.1085f, 19.392f, 17.6943f, 19.392f)
        horizontalLineTo(7.4663f)
        lineTo(7.3645f, 19.3988f)
        curveTo(6.9984f, 19.4485f, 6.7163f, 19.7623f, 6.7163f, 20.142f)
        curveTo(6.7163f, 20.5562f, 7.0521f, 20.892f, 7.4663f, 20.892f)
        horizontalLineTo(17.6943f)
        lineTo(17.796f, 20.8852f)
        curveTo(18.1621f, 20.8355f, 18.4443f, 20.5217f, 18.4443f, 20.142f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
