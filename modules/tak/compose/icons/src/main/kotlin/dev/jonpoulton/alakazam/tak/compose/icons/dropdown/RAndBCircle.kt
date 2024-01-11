package dev.jonpoulton.alakazam.tak.compose.icons.dropdown

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
import dev.jonpoulton.alakazam.tak.compose.icons.DropdownTakIcons

val DropdownTakIcons.RAndBCircle: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RAndBCircle",
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
        moveTo(1.8235f, 15.7011f)
        curveTo(1.8235f, 8.3127f, 7.8127f, 2.3235f, 15.2011f, 2.3235f)
        curveTo(22.5895f, 2.3235f, 28.5794f, 8.3129f, 28.5794f, 15.7011f)
        curveTo(28.5794f, 23.0894f, 22.5894f, 29.0794f, 15.2011f, 29.0794f)
        curveTo(7.8129f, 29.0794f, 1.8235f, 23.0895f, 1.8235f, 15.7011f)
        close()
        moveTo(27.0794f, 15.7011f)
        curveTo(27.0794f, 9.1413f, 21.7611f, 3.8235f, 15.2011f, 3.8235f)
        curveTo(8.6412f, 3.8235f, 3.3235f, 9.1412f, 3.3235f, 15.7011f)
        curveTo(3.3235f, 22.2611f, 8.6413f, 27.5794f, 15.2011f, 27.5794f)
        curveTo(21.761f, 27.5794f, 27.0794f, 22.261f, 27.0794f, 15.7011f)
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
        moveTo(6.8748f, 15.7012f)
        curveTo(6.8748f, 11.1026f, 10.6027f, 7.3752f, 15.2015f, 7.3752f)
        curveTo(19.7998f, 7.3752f, 23.5282f, 11.1029f, 23.5282f, 15.7012f)
        curveTo(23.5282f, 20.3001f, 19.7999f, 24.0279f, 15.2015f, 24.0279f)
        curveTo(10.6025f, 24.0279f, 6.8748f, 20.3004f, 6.8748f, 15.7012f)
        close()
        moveTo(22.0282f, 15.7012f)
        curveTo(22.0282f, 11.9314f, 18.9714f, 8.8752f, 15.2015f, 8.8752f)
        curveTo(11.431f, 8.8752f, 8.3748f, 11.9311f, 8.3748f, 15.7012f)
        curveTo(8.3748f, 19.4719f, 11.4309f, 22.5279f, 15.2015f, 22.5279f)
        curveTo(18.9715f, 22.5279f, 22.0282f, 19.4717f, 22.0282f, 15.7012f)
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
        moveTo(15.2001f, 14.7f)
        curveTo(15.7523f, 14.7f, 16.2001f, 15.1478f, 16.2001f, 15.7f)
        curveTo(16.2001f, 16.2524f, 15.7524f, 16.7003f, 15.2001f, 16.7003f)
        curveTo(14.648f, 16.7003f, 14.2001f, 16.2523f, 14.2001f, 15.7f)
        curveTo(14.2001f, 15.1479f, 14.648f, 14.7f, 15.2001f, 14.7f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
