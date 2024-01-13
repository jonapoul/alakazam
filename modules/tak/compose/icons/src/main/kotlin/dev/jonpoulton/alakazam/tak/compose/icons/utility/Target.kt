package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons

public val UtilityTakIcons.Target: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Target",
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
        moveTo(4.0073f, 14.6839f)
        curveTo(4.0073f, 8.7873f, 8.7872f, 4.0075f, 14.6838f, 4.0075f)
        curveTo(20.5804f, 4.0075f, 25.3603f, 8.7873f, 25.3603f, 14.6839f)
        curveTo(25.3603f, 20.5805f, 20.5804f, 25.3604f, 14.6838f, 25.3604f)
        curveTo(8.7872f, 25.3604f, 4.0073f, 20.5805f, 4.0073f, 14.6839f)
        close()
        moveTo(23.8603f, 14.6839f)
        curveTo(23.8603f, 9.6158f, 19.7519f, 5.5075f, 14.6838f, 5.5075f)
        curveTo(9.6157f, 5.5075f, 5.5073f, 9.6158f, 5.5073f, 14.6839f)
        curveTo(5.5073f, 19.7521f, 9.6157f, 23.8604f, 14.6838f, 23.8604f)
        curveTo(19.7519f, 23.8604f, 23.8603f, 19.7521f, 23.8603f, 14.6839f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(14.6838f, 21.6544f)
        curveTo(15.0635f, 21.6544f, 15.3773f, 21.9366f, 15.427f, 22.3026f)
        lineTo(15.4338f, 22.4044f)
        verticalLineTo(26.8162f)
        curveTo(15.4338f, 27.2304f, 15.0981f, 27.5662f, 14.6838f, 27.5662f)
        curveTo(14.3041f, 27.5662f, 13.9903f, 27.284f, 13.9407f, 26.918f)
        lineTo(13.9338f, 26.8162f)
        verticalLineTo(22.4044f)
        curveTo(13.9338f, 21.9902f, 14.2696f, 21.6544f, 14.6838f, 21.6544f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(14.6838f, 1.8015f)
        curveTo(15.0635f, 1.8015f, 15.3773f, 2.0837f, 15.427f, 2.4497f)
        lineTo(15.4338f, 2.5515f)
        verticalLineTo(6.9633f)
        curveTo(15.4338f, 7.3775f, 15.0981f, 7.7133f, 14.6838f, 7.7133f)
        curveTo(14.3041f, 7.7133f, 13.9903f, 7.4311f, 13.9407f, 7.0651f)
        lineTo(13.9338f, 6.9633f)
        verticalLineTo(2.5515f)
        curveTo(13.9338f, 2.1373f, 14.2696f, 1.8015f, 14.6838f, 1.8015f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(6.9633f, 13.9338f)
        curveTo(7.3775f, 13.9338f, 7.7133f, 14.2696f, 7.7133f, 14.6838f)
        curveTo(7.7133f, 15.0635f, 7.4311f, 15.3773f, 7.0651f, 15.427f)
        lineTo(6.9633f, 15.4338f)
        horizontalLineTo(2.5515f)
        curveTo(2.1373f, 15.4338f, 1.8015f, 15.0981f, 1.8015f, 14.6838f)
        curveTo(1.8015f, 14.3041f, 2.0837f, 13.9903f, 2.4497f, 13.9407f)
        lineTo(2.5515f, 13.9338f)
        horizontalLineTo(6.9633f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(26.8163f, 13.9338f)
        curveTo(27.2305f, 13.9338f, 27.5663f, 14.2696f, 27.5663f, 14.6838f)
        curveTo(27.5663f, 15.0635f, 27.2842f, 15.3773f, 26.9181f, 15.427f)
        lineTo(26.8163f, 15.4338f)
        horizontalLineTo(22.4045f)
        curveTo(21.9903f, 15.4338f, 21.6545f, 15.0981f, 21.6545f, 14.6838f)
        curveTo(21.6545f, 14.3041f, 21.9367f, 13.9903f, 22.3028f, 13.9407f)
        lineTo(22.4045f, 13.9338f)
        horizontalLineTo(26.8163f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(9.1545f, 14.6838f)
        curveTo(9.1545f, 11.6299f, 11.63f, 9.1544f, 14.684f, 9.1544f)
        curveTo(17.7379f, 9.1544f, 20.2134f, 11.6299f, 20.2134f, 14.6838f)
        curveTo(20.2134f, 17.7378f, 17.7379f, 20.2132f, 14.684f, 20.2132f)
        curveTo(11.63f, 20.2132f, 9.1545f, 17.7378f, 9.1545f, 14.6838f)
        close()
        moveTo(18.7134f, 14.6838f)
        curveTo(18.7134f, 12.4583f, 16.9094f, 10.6544f, 14.684f, 10.6544f)
        curveTo(12.4585f, 10.6544f, 10.6545f, 12.4583f, 10.6545f, 14.6838f)
        curveTo(10.6545f, 16.9093f, 12.4585f, 18.7132f, 14.684f, 18.7132f)
        curveTo(16.9094f, 18.7132f, 18.7134f, 16.9093f, 18.7134f, 14.6838f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
