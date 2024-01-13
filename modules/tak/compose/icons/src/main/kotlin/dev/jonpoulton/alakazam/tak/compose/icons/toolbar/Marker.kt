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

public val ToolbarTakIcons.Marker: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Marker",
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
        moveTo(31.75f, 17.3026f)
        curveTo(31.75f, 10.9185f, 26.4863f, 5.75f, 19.999f, 5.75f)
        curveTo(13.5134f, 5.75f, 8.25f, 10.9188f, 8.25f, 17.3026f)
        curveTo(8.25f, 19.3287f, 9.3411f, 21.993f, 11.2911f, 25.1938f)
        curveTo(12.0482f, 26.4365f, 12.9227f, 27.7372f, 13.8917f, 29.0777f)
        curveTo(15.1056f, 30.7568f, 16.4047f, 32.4129f, 17.7038f, 33.9751f)
        curveTo(18.1585f, 34.5219f, 18.5809f, 35.0181f, 18.9603f, 35.4547f)
        lineTo(19.328f, 35.8743f)
        lineTo(19.999f, 36.6216f)
        lineTo(20.6073f, 35.945f)
        lineTo(21.2706f, 35.1857f)
        curveTo(21.4291f, 35.0016f, 21.5941f, 34.8084f, 21.765f, 34.6064f)
        lineTo(22.2946f, 33.9751f)
        curveTo(23.5939f, 32.413f, 24.8932f, 30.7568f, 26.1073f, 29.0777f)
        curveTo(27.0765f, 27.7373f, 27.9511f, 26.4365f, 28.7083f, 25.1938f)
        curveTo(30.6587f, 21.993f, 31.75f, 19.3287f, 31.75f, 17.3026f)
        close()
        moveTo(9.75f, 17.3026f)
        curveTo(9.75f, 11.7534f, 14.3358f, 7.25f, 19.999f, 7.25f)
        curveTo(25.664f, 7.25f, 30.25f, 11.7531f, 30.25f, 17.3026f)
        curveTo(30.25f, 18.9759f, 29.244f, 21.4321f, 27.4274f, 24.4133f)
        curveTo(26.6922f, 25.6198f, 25.8392f, 26.8885f, 24.8918f, 28.1988f)
        curveTo(23.6993f, 29.848f, 22.4204f, 31.4782f, 21.1413f, 33.0159f)
        lineTo(20.6203f, 33.6371f)
        lineTo(19.999f, 34.362f)
        lineTo(19.378f, 33.6371f)
        lineTo(18.8571f, 33.016f)
        curveTo(17.5783f, 31.4782f, 16.2995f, 29.848f, 15.1073f, 28.1989f)
        curveTo(14.16f, 26.8885f, 13.3072f, 25.6199f, 12.5721f, 24.4134f)
        curveTo(10.7559f, 21.4321f, 9.75f, 18.976f, 9.75f, 17.3026f)
        close()
        moveTo(20.0f, 13.75f)
        curveTo(22.0719f, 13.75f, 23.75f, 15.4273f, 23.75f, 17.5f)
        curveTo(23.75f, 19.5713f, 22.0713f, 21.25f, 20.0f, 21.25f)
        curveTo(17.9273f, 21.25f, 16.25f, 19.5719f, 16.25f, 17.5f)
        curveTo(16.25f, 15.4267f, 17.9267f, 13.75f, 20.0f, 13.75f)
        close()
        moveTo(17.75f, 17.5f)
        curveTo(17.75f, 16.2551f, 18.7551f, 15.25f, 20.0f, 15.25f)
        curveTo(21.2437f, 15.25f, 22.25f, 16.2559f, 22.25f, 17.5f)
        curveTo(22.25f, 18.7429f, 21.2429f, 19.75f, 20.0f, 19.75f)
        curveTo(18.7559f, 19.75f, 17.75f, 18.7437f, 17.75f, 17.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
