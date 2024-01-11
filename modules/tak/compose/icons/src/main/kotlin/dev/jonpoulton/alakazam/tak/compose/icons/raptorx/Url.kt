package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

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
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

val RaptorXTakIcons.Url: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Url",
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
        moveTo(18.8829f, 8.0683f)
        lineTo(16.7615f, 10.1896f)
        curveTo(16.2935f, 10.6576f, 16.0498f, 11.2651f, 16.0306f, 11.8783f)
        curveTo(15.7724f, 11.9755f, 15.5303f, 12.128f, 15.3225f, 12.3358f)
        lineTo(14.6651f, 12.9932f)
        curveTo(14.3087f, 11.6587f, 14.654f, 10.1759f, 15.7009f, 9.129f)
        lineTo(17.8222f, 7.0076f)
        curveTo(19.3843f, 5.4455f, 21.917f, 5.4455f, 23.4791f, 7.0076f)
        curveTo(25.0412f, 8.5697f, 25.0412f, 11.1024f, 23.4791f, 12.6645f)
        lineTo(21.3577f, 14.7858f)
        curveTo(20.3108f, 15.8327f, 18.828f, 16.178f, 17.4935f, 15.8216f)
        lineTo(18.1509f, 15.1642f)
        curveTo(18.3587f, 14.9564f, 18.5112f, 14.7143f, 18.6084f, 14.4561f)
        curveTo(19.2216f, 14.4368f, 19.829f, 14.1932f, 20.2971f, 13.7251f)
        lineTo(22.4184f, 11.6038f)
        curveTo(23.3947f, 10.6275f, 23.3947f, 9.0446f, 22.4184f, 8.0683f)
        curveTo(21.4421f, 7.092f, 19.8592f, 7.092f, 18.8829f, 8.0683f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(7.5693f, 19.3821f)
        lineTo(9.6906f, 17.2608f)
        curveTo(10.2185f, 16.7329f, 10.9239f, 16.4904f, 11.6147f, 16.5334f)
        curveTo(11.6869f, 16.1523f, 11.8705f, 15.7881f, 12.1655f, 15.493f)
        lineTo(12.4942f, 15.1643f)
        curveTo(11.1597f, 14.808f, 9.6768f, 15.1532f, 8.6299f, 16.2002f)
        lineTo(6.5086f, 18.3215f)
        curveTo(4.9465f, 19.8836f, 4.9465f, 22.4162f, 6.5086f, 23.9783f)
        curveTo(8.0707f, 25.5404f, 10.6034f, 25.5404f, 12.1655f, 23.9783f)
        lineTo(14.2868f, 21.857f)
        curveTo(15.3337f, 20.8101f, 15.679f, 19.3272f, 15.3226f, 17.9928f)
        lineTo(14.9939f, 18.3215f)
        curveTo(14.6989f, 18.6165f, 14.3347f, 18.8001f, 13.9535f, 18.8722f)
        curveTo(13.9965f, 19.5631f, 13.7541f, 20.2684f, 13.2261f, 20.7963f)
        lineTo(11.1048f, 22.9177f)
        curveTo(10.1285f, 23.894f, 8.5456f, 23.894f, 7.5693f, 22.9177f)
        curveTo(6.5929f, 21.9414f, 6.5929f, 20.3584f, 7.5693f, 19.3821f)
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
        moveTo(12.8726f, 16.2001f)
        lineTo(15.701f, 13.3717f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 17.1152f, 13.3717f)
        lineTo(17.1152f, 13.3717f)
        arcTo(1.0f, 1.0f, 0.0f, false, true, 17.1152f, 14.7859f)
        lineTo(14.2868f, 17.6143f)
        arcTo(1.0f, 1.0f, 78.097f, false, true, 12.8726f, 17.6143f)
        lineTo(12.8726f, 17.6143f)
        arcTo(1.0f, 1.0f, 78.097f, false, true, 12.8726f, 16.2001f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
