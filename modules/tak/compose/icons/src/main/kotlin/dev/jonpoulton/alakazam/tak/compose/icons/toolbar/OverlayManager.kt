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

public val ToolbarTakIcons.OverlayManager: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "OverlayManager",
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
        moveTo(7.3649f, 14.3844f)
        lineTo(20.3649f, 6.6064f)
        curveTo(20.602f, 6.4645f, 20.8979f, 6.4645f, 21.1351f, 6.6064f)
        lineTo(34.1351f, 14.3844f)
        curveTo(34.6216f, 14.6755f, 34.6216f, 15.3805f, 34.1351f, 15.6716f)
        lineTo(21.1351f, 23.4496f)
        curveTo(20.8979f, 23.5915f, 20.602f, 23.5915f, 20.3649f, 23.4496f)
        lineTo(7.3649f, 15.6716f)
        curveTo(6.8783f, 15.3805f, 6.8783f, 14.6755f, 7.3649f, 14.3844f)
        close()
        moveTo(32.288f, 15.028f)
        lineTo(20.75f, 8.124f)
        lineTo(9.211f, 15.028f)
        lineTo(20.75f, 21.931f)
        lineTo(32.288f, 15.028f)
        close()
        moveTo(33.3649f, 20.6064f)
        curveTo(33.7204f, 20.3937f, 34.1809f, 20.5095f, 34.3936f, 20.8649f)
        curveTo(34.5885f, 21.1908f, 34.5075f, 21.6049f, 34.2189f, 21.8355f)
        lineTo(34.1351f, 21.8936f)
        lineTo(21.1351f, 29.6716f)
        curveTo(20.9318f, 29.7932f, 20.6854f, 29.8106f, 20.4698f, 29.7237f)
        lineTo(20.3649f, 29.6716f)
        lineTo(7.3649f, 21.8936f)
        curveTo(7.0095f, 21.6809f, 6.8937f, 21.2204f, 7.1064f, 20.8649f)
        curveTo(7.3013f, 20.5391f, 7.7046f, 20.4147f, 8.0442f, 20.56f)
        lineTo(8.1351f, 20.6064f)
        lineTo(20.75f, 28.153f)
        lineTo(33.3649f, 20.6064f)
        close()
        moveTo(34.3936f, 26.5685f)
        curveTo(34.1809f, 26.2131f, 33.7204f, 26.0973f, 33.3649f, 26.31f)
        lineTo(20.75f, 33.857f)
        lineTo(8.1351f, 26.31f)
        lineTo(8.0442f, 26.2636f)
        curveTo(7.7046f, 26.1183f, 7.3013f, 26.2427f, 7.1064f, 26.5685f)
        curveTo(6.8937f, 26.924f, 7.0095f, 27.3845f, 7.3649f, 27.5972f)
        lineTo(20.3649f, 35.3752f)
        lineTo(20.4698f, 35.4273f)
        curveTo(20.6854f, 35.5142f, 20.9318f, 35.4968f, 21.1351f, 35.3752f)
        lineTo(34.1351f, 27.5972f)
        lineTo(34.2189f, 27.5391f)
        curveTo(34.5075f, 27.3085f, 34.5885f, 26.8944f, 34.3936f, 26.5685f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
