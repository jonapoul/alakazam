package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

val SideMenuTakIcons.DownloadError: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "DownloadError",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(20.4756f, 9.9702f)
        verticalLineTo(15.6117f)
        curveTo(20.4756f, 15.8703f, 20.6255f, 16.0819f, 20.8103f, 16.0819f)
        horizontalLineTo(22.1644f)
        curveTo(22.4549f, 16.0819f, 22.6075f, 16.5653f, 22.4128f, 16.8671f)
        lineTo(20.4589f, 19.9065f)
        lineTo(18.2486f, 23.3456f)
        curveTo(18.1154f, 23.5515f, 17.8845f, 23.5515f, 17.7519f, 23.3456f)
        lineTo(15.541f, 19.9065f)
        lineTo(13.5871f, 16.8671f)
        curveTo(13.3923f, 16.5653f, 13.5456f, 16.0819f, 13.8354f, 16.0819f)
        horizontalLineTo(15.1896f)
        curveTo(15.3743f, 16.0819f, 15.5243f, 15.8703f, 15.5243f, 15.6117f)
        verticalLineTo(10.9702f)
        curveTo(15.5243f, 10.7107f, 15.6742f, 10.5f, 15.859f, 10.5f)
        lineTo(20.1409f, 10.5f)
        curveTo(20.3257f, 10.5f, 20.4756f, 10.7107f, 20.4756f, 10.9702f)
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(20.184f, 26.6015f)
        horizontalLineTo(20.0971f)
        horizontalLineTo(17.9267f)
        horizontalLineTo(9.2451f)
        curveTo(9.0229f, 26.6015f, 8.8426f, 26.3924f, 8.8426f, 26.1348f)
        verticalLineTo(10.7049f)
        curveTo(8.8426f, 10.4464f, 8.6623f, 10.2383f, 8.4401f, 10.2383f)
        horizontalLineTo(6.4025f)
        curveTo(6.1803f, 10.2383f, 6f, 10.4464f, 6f, 10.7049f)
        verticalLineTo(30.0333f)
        curveTo(6f, 30.2909f, 6.1803f, 30.5f, 6.4025f, 30.5f)
        horizontalLineTo(18f)
        horizontalLineTo(22.6694f)
        curveTo(21.4452f, 29.5348f, 20.5511f, 28.1696f, 20.184f, 26.6015f)
        close()
        moveTo(30f, 18.6736f)
        verticalLineTo(10.7049f)
        curveTo(30f, 10.4464f, 29.8197f, 10.2383f, 29.5975f, 10.2383f)
        horizontalLineTo(27.5478f)
        curveTo(27.3264f, 10.2383f, 27.1469f, 10.4436f, 27.1453f, 10.7003f)
        lineTo(27.0817f, 18.0005f)
        curveTo(28.1252f, 18.0124f, 29.1139f, 18.2527f, 30f, 18.6736f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(15.5f, 6.9195f)
        verticalLineTo(8.0805f)
        curveTo(15.5f, 8.3121f, 15.6523f, 8.5f, 15.8399f, 8.5f)
        horizontalLineTo(20.1601f)
        curveTo(20.3484f, 8.5f, 20.5f, 8.3121f, 20.5f, 8.0805f)
        verticalLineTo(6.9195f)
        curveTo(20.5f, 6.6879f, 20.3484f, 6.5f, 20.1601f, 6.5f)
        lineTo(15.8399f, 6.5f)
        curveTo(15.6523f, 6.5f, 15.5f, 6.6879f, 15.5f, 6.9195f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(33f, 25f)
        curveTo(33f, 28.3137f, 30.3137f, 31f, 27f, 31f)
        curveTo(23.6863f, 31f, 21f, 28.3137f, 21f, 25f)
        curveTo(21f, 21.6863f, 23.6863f, 19f, 27f, 19f)
        curveTo(30.3137f, 19f, 33f, 21.6863f, 33f, 25f)
        close()
        moveTo(24.0717f, 27.9283f)
        curveTo(24.267f, 28.1235f, 24.5836f, 28.1235f, 24.7788f, 27.9283f)
        lineTo(27f, 25.7071f)
        lineTo(29.2212f, 27.9283f)
        curveTo(29.4164f, 28.1235f, 29.733f, 28.1235f, 29.9283f, 27.9283f)
        curveTo(30.1235f, 27.733f, 30.1235f, 27.4164f, 29.9283f, 27.2212f)
        lineTo(27.7071f, 25f)
        lineTo(29.9283f, 22.7788f)
        curveTo(30.1235f, 22.5836f, 30.1235f, 22.267f, 29.9283f, 22.0717f)
        curveTo(29.733f, 21.8765f, 29.4164f, 21.8765f, 29.2212f, 22.0717f)
        lineTo(27f, 24.2929f)
        lineTo(24.7788f, 22.0717f)
        curveTo(24.5836f, 21.8765f, 24.267f, 21.8765f, 24.0717f, 22.0717f)
        curveTo(23.8765f, 22.267f, 23.8765f, 22.5836f, 24.0717f, 22.7788f)
        lineTo(26.2929f, 25f)
        lineTo(24.0717f, 27.2212f)
        curveTo(23.8765f, 27.4164f, 23.8765f, 27.733f, 24.0717f, 27.9283f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
