package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.Delete: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Delete",
      defaultWidth = 40.0.dp,
      defaultHeight = 40.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 40.0f,
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
        moveTo(11.842f, 9.1765f)
        horizontalLineTo(27.158f)
        verticalLineTo(6.5775f)
        horizontalLineTo(11.842f)
        verticalLineTo(9.1765f)
        close()
        moveTo(28.736f, 9.4145f)
        verticalLineTo(5.7885f)
        curveTo(28.736f, 5.3535f, 28.383f, 4.9995f, 27.947f, 4.9995f)
        horizontalLineTo(11.053f)
        curveTo(10.617f, 4.9995f, 10.264f, 5.3535f, 10.264f, 5.7885f)
        verticalLineTo(9.4145f)
        horizontalLineTo(7.75f)
        curveTo(7.336f, 9.4145f, 7.0f, 9.7505f, 7.0f, 10.1645f)
        verticalLineTo(13.3575f)
        curveTo(7.0f, 13.7715f, 7.336f, 14.1075f, 7.75f, 14.1075f)
        horizontalLineTo(10.2001f)
        lineTo(10.866f, 35.0463f)
        curveTo(10.879f, 35.4593f, 11.218f, 35.7873f, 11.632f, 35.7873f)
        horizontalLineTo(27.758f)
        curveTo(28.172f, 35.7873f, 28.511f, 35.4593f, 28.523f, 35.0463f)
        lineTo(29.1899f, 14.1075f)
        horizontalLineTo(31.64f)
        curveTo(32.054f, 14.1075f, 32.39f, 13.7715f, 32.39f, 13.3575f)
        verticalLineTo(10.1645f)
        curveTo(32.39f, 9.7505f, 32.054f, 9.4145f, 31.64f, 9.4145f)
        horizontalLineTo(28.736f)
        close()
        moveTo(28.6036f, 12.6075f)
        horizontalLineTo(30.89f)
        verticalLineTo(10.9145f)
        horizontalLineTo(8.5f)
        verticalLineTo(12.6075f)
        horizontalLineTo(10.7854f)
        curveTo(10.8365f, 12.5968f, 10.889f, 12.5913f, 10.942f, 12.5913f)
        horizontalLineTo(28.447f)
        curveTo(28.5f, 12.5913f, 28.5525f, 12.5968f, 28.6036f, 12.6075f)
        close()
        moveTo(12.374f, 34.2553f)
        horizontalLineTo(27.016f)
        lineTo(27.656f, 14.1233f)
        horizontalLineTo(11.733f)
        lineTo(12.374f, 34.2553f)
        close()
        moveTo(16.1416f, 30.8188f)
        curveTo(15.7186f, 30.8188f, 15.3746f, 30.4758f, 15.3746f, 30.0528f)
        verticalLineTo(18.6578f)
        curveTo(15.3746f, 18.2348f, 15.7186f, 17.8918f, 16.1416f, 17.8918f)
        curveTo(16.5646f, 17.8918f, 16.9086f, 18.2348f, 16.9086f, 18.6578f)
        verticalLineTo(30.0528f)
        curveTo(16.9086f, 30.4758f, 16.5646f, 30.8188f, 16.1416f, 30.8188f)
        close()
        moveTo(21.65f, 30.0528f)
        curveTo(21.65f, 30.4758f, 21.994f, 30.8188f, 22.417f, 30.8188f)
        curveTo(22.84f, 30.8188f, 23.184f, 30.4758f, 23.184f, 30.0528f)
        verticalLineTo(18.6578f)
        curveTo(23.184f, 18.2348f, 22.84f, 17.8918f, 22.417f, 17.8918f)
        curveTo(21.994f, 17.8918f, 21.65f, 18.2348f, 21.65f, 18.6578f)
        verticalLineTo(30.0528f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Delete)
