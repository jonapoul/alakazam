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

val RaptorXTakIcons.TextBox: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "TextBox",
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
        moveTo(5.2222f, 10.6111f)
        verticalLineTo(20.3888f)
        horizontalLineTo(6.7222f)
        verticalLineTo(10.6111f)
        horizontalLineTo(5.2222f)
        close()
        moveTo(10.1111f, 7.2222f)
        horizontalLineTo(19.8888f)
        verticalLineTo(5.7222f)
        horizontalLineTo(10.1111f)
        verticalLineTo(7.2222f)
        close()
        moveTo(24.7777f, 10.6111f)
        horizontalLineTo(23.2777f)
        verticalLineTo(20.3888f)
        horizontalLineTo(24.7777f)
        verticalLineTo(10.6111f)
        close()
        moveTo(19.8888f, 25.2777f)
        verticalLineTo(23.7777f)
        horizontalLineTo(10.1111f)
        verticalLineTo(25.2777f)
        horizontalLineTo(19.8888f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(4.5f, 5.0f)
        horizontalLineToRelative(4.0f)
        verticalLineToRelative(4.0f)
        horizontalLineToRelative(-4.0f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(4.5f, 22.0f)
        horizontalLineToRelative(4.0f)
        verticalLineToRelative(4.0f)
        horizontalLineToRelative(-4.0f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(21.5f, 5.0f)
        horizontalLineToRelative(4.0f)
        verticalLineToRelative(4.0f)
        horizontalLineToRelative(-4.0f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(21.5f, 22.0f)
        horizontalLineToRelative(4.0f)
        verticalLineToRelative(4.0f)
        horizontalLineToRelative(-4.0f)
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
        moveTo(19.0f, 12.9419f)
        horizontalLineTo(18.5534f)
        curveTo(18.5146f, 12.7896f, 18.4434f, 12.6099f, 18.3398f, 12.4027f)
        curveTo(18.2406f, 12.1913f, 18.1284f, 11.9926f, 18.0032f, 11.8066f)
        curveTo(17.8738f, 11.6121f, 17.7314f, 11.4429f, 17.5761f, 11.2992f)
        curveTo(17.425f, 11.1512f, 17.2783f, 11.0666f, 17.1359f, 11.0455f)
        curveTo(17.0022f, 11.0285f, 16.8339f, 11.0159f, 16.6311f, 11.0074f)
        curveTo(16.4283f, 10.9989f, 16.2406f, 10.9947f, 16.068f, 10.9947f)
        horizontalLineTo(15.6926f)
        verticalLineTo(18.1934f)
        curveTo(15.6926f, 18.333f, 15.7228f, 18.4619f, 15.7832f, 18.5803f)
        curveTo(15.8436f, 18.6945f, 15.9493f, 18.7833f, 16.1003f, 18.8467f)
        curveTo(16.178f, 18.8763f, 16.3398f, 18.9165f, 16.5858f, 18.9672f)
        curveTo(16.836f, 19.018f, 17.0302f, 19.0455f, 17.1683f, 19.0497f)
        verticalLineTo(19.5f)
        horizontalLineTo(12.8317f)
        verticalLineTo(19.0497f)
        curveTo(12.9525f, 19.0412f, 13.1359f, 19.0243f, 13.3819f, 18.9989f)
        curveTo(13.6321f, 18.9736f, 13.8047f, 18.9419f, 13.8997f, 18.9038f)
        curveTo(14.0421f, 18.8488f, 14.1456f, 18.7706f, 14.2104f, 18.6691f)
        curveTo(14.2794f, 18.5634f, 14.3139f, 18.4239f, 14.3139f, 18.2505f)
        verticalLineTo(10.9947f)
        horizontalLineTo(13.9385f)
        curveTo(13.8047f, 10.9947f, 13.6386f, 10.9989f, 13.4401f, 11.0074f)
        curveTo(13.2416f, 11.0116f, 13.0518f, 11.0243f, 12.8706f, 11.0455f)
        curveTo(12.7282f, 11.0624f, 12.5793f, 11.1469f, 12.4239f, 11.2992f)
        curveTo(12.2729f, 11.4471f, 12.1327f, 11.6163f, 12.0032f, 11.8066f)
        curveTo(11.8738f, 11.9968f, 11.7594f, 12.1998f, 11.6602f, 12.4154f)
        curveTo(11.5609f, 12.6268f, 11.4919f, 12.8023f, 11.4531f, 12.9419f)
        horizontalLineTo(11.0f)
        verticalLineTo(10.5f)
        horizontalLineTo(19.0f)
        verticalLineTo(12.9419f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
