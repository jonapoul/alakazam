package dev.jonpoulton.alakazam.tak.compose.icons.dropdown

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.DropdownTakIcons

public val DropdownTakIcons.RAndBBullseye: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RAndBBullseye",
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
        pathFillType = NonZero,
      ) {
        moveTo(15.302f, 2.3591f)
        curveTo(15.6817f, 2.3591f, 15.9955f, 2.6413f, 16.0452f, 3.0074f)
        lineTo(16.052f, 3.1091f)
        verticalLineTo(27.6637f)
        curveTo(16.052f, 28.0779f, 15.7162f, 28.4137f, 15.302f, 28.4137f)
        curveTo(14.9223f, 28.4137f, 14.6085f, 28.1315f, 14.5588f, 27.7655f)
        lineTo(14.552f, 27.6637f)
        verticalLineTo(3.1091f)
        curveTo(14.552f, 2.6949f, 14.8878f, 2.3591f, 15.302f, 2.3591f)
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
        moveTo(27.9752f, 14.6362f)
        curveTo(28.3894f, 14.6362f, 28.7252f, 14.972f, 28.7252f, 15.3862f)
        curveTo(28.7252f, 15.7659f, 28.443f, 16.0797f, 28.077f, 16.1294f)
        lineTo(27.9752f, 16.1362f)
        horizontalLineTo(2.6285f)
        curveTo(2.2143f, 16.1362f, 1.8785f, 15.8004f, 1.8785f, 15.3862f)
        curveTo(1.8785f, 15.0065f, 2.1607f, 14.6927f, 2.5268f, 14.6431f)
        lineTo(2.6285f, 14.6362f)
        horizontalLineTo(27.9752f)
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
        moveTo(23.7414f, 6.1664f)
        curveTo(24.0389f, 5.8782f, 24.5137f, 5.8857f, 24.8019f, 6.1832f)
        curveTo(25.0639f, 6.4537f, 25.0815f, 6.8707f, 24.859f, 7.1608f)
        lineTo(24.7851f, 7.2438f)
        lineTo(6.8627f, 24.6061f)
        curveTo(6.5652f, 24.8943f, 6.0904f, 24.8867f, 5.8021f, 24.5892f)
        curveTo(5.5401f, 24.3188f, 5.5225f, 23.9018f, 5.745f, 23.6117f)
        lineTo(5.819f, 23.5287f)
        lineTo(23.7414f, 6.1664f)
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
        moveTo(5.8021f, 6.1832f)
        curveTo(6.0641f, 5.9128f, 6.4804f, 5.882f, 6.7774f, 6.0951f)
        lineTo(6.8627f, 6.1664f)
        lineTo(24.7851f, 23.5287f)
        curveTo(25.0826f, 23.8169f, 25.0901f, 24.2917f, 24.8019f, 24.5892f)
        curveTo(24.5399f, 24.8597f, 24.1237f, 24.8905f, 23.8266f, 24.6773f)
        lineTo(23.7414f, 24.6061f)
        lineTo(5.819f, 7.2438f)
        curveTo(5.5215f, 6.9556f, 5.5139f, 6.4807f, 5.8021f, 6.1832f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
