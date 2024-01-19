package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.runtime.Composable
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
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.PointAtSelf: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "PointAtSelf",
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
        moveTo(20.35f, 5.5f)
        curveTo(20.6879f, 5.5f, 20.9671f, 5.7511f, 21.0113f, 6.0768f)
        lineTo(21.0174f, 6.1674f)
        verticalLineTo(8.1868f)
        curveTo(27.4895f, 8.5224f, 32.6776f, 13.7105f, 33.0132f, 20.1826f)
        horizontalLineTo(35.0326f)
        curveTo(35.4012f, 20.1826f, 35.7f, 20.4814f, 35.7f, 20.85f)
        curveTo(35.7f, 21.1879f, 35.449f, 21.4671f, 35.1232f, 21.5113f)
        lineTo(35.0326f, 21.5174f)
        horizontalLineTo(33.0132f)
        curveTo(32.6776f, 27.9895f, 27.4895f, 33.1776f, 21.0174f, 33.5132f)
        verticalLineTo(35.5326f)
        curveTo(21.0174f, 35.9012f, 20.7186f, 36.2f, 20.35f, 36.2f)
        curveTo(20.0121f, 36.2f, 19.7329f, 35.9489f, 19.6887f, 35.6232f)
        lineTo(19.6826f, 35.5326f)
        verticalLineTo(33.5132f)
        curveTo(13.2105f, 33.1776f, 8.0224f, 27.9895f, 7.6868f, 21.5174f)
        horizontalLineTo(5.6674f)
        curveTo(5.2988f, 21.5174f, 5.0f, 21.2186f, 5.0f, 20.85f)
        curveTo(5.0f, 20.5121f, 5.2511f, 20.2329f, 5.5768f, 20.1887f)
        lineTo(5.6674f, 20.1826f)
        horizontalLineTo(7.6868f)
        curveTo(8.0224f, 13.7105f, 13.2105f, 8.5224f, 19.6826f, 8.1868f)
        verticalLineTo(6.1674f)
        curveTo(19.6826f, 5.7988f, 19.9814f, 5.5f, 20.35f, 5.5f)
        close()
        moveTo(21.0174f, 9.5237f)
        curveTo(26.752f, 9.8563f, 31.3436f, 14.448f, 31.6762f, 20.1826f)
        horizontalLineTo(29.6935f)
        lineTo(29.603f, 20.1887f)
        curveTo(29.2772f, 20.2329f, 29.0261f, 20.5121f, 29.0261f, 20.85f)
        curveTo(29.0261f, 21.2186f, 29.3249f, 21.5174f, 29.6935f, 21.5174f)
        horizontalLineTo(31.6762f)
        curveTo(31.3436f, 27.252f, 26.752f, 31.8437f, 21.0174f, 32.1764f)
        verticalLineTo(30.1935f)
        lineTo(21.0113f, 30.1029f)
        curveTo(20.9671f, 29.7772f, 20.6879f, 29.5261f, 20.35f, 29.5261f)
        curveTo(19.9814f, 29.5261f, 19.6826f, 29.8249f, 19.6826f, 30.1935f)
        verticalLineTo(32.1764f)
        curveTo(13.9479f, 31.8438f, 9.3562f, 27.2521f, 9.0235f, 21.5174f)
        horizontalLineTo(11.0065f)
        lineTo(11.0971f, 21.5113f)
        curveTo(11.4228f, 21.4671f, 11.6739f, 21.1879f, 11.6739f, 20.85f)
        curveTo(11.6739f, 20.4814f, 11.3751f, 20.1826f, 11.0065f, 20.1826f)
        horizontalLineTo(9.0235f)
        curveTo(9.3562f, 14.4479f, 13.9479f, 9.8562f, 19.6826f, 9.5237f)
        verticalLineTo(11.5065f)
        lineTo(19.6887f, 11.5971f)
        curveTo(19.7329f, 11.9228f, 20.0121f, 12.1739f, 20.35f, 12.1739f)
        curveTo(20.7186f, 12.1739f, 21.0174f, 11.8751f, 21.0174f, 11.5065f)
        verticalLineTo(9.5237f)
        close()
        moveTo(22.7111f, 18.4904f)
        curveTo(22.4505f, 18.2298f, 22.0279f, 18.2298f, 21.7673f, 18.4904f)
        lineTo(17.9919f, 22.2658f)
        lineTo(17.9322f, 22.3341f)
        curveTo(17.7331f, 22.5957f, 17.753f, 22.9707f, 17.9919f, 23.2096f)
        curveTo(18.2526f, 23.4702f, 18.6751f, 23.4702f, 18.9358f, 23.2096f)
        lineTo(22.7111f, 19.4343f)
        lineTo(22.7708f, 19.3659f)
        curveTo(22.9699f, 19.1043f, 22.95f, 18.7293f, 22.7111f, 18.4904f)
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
        moveTo(18.9357f, 18.4905f)
        curveTo(18.6751f, 18.2299f, 18.2525f, 18.2299f, 17.9919f, 18.4905f)
        curveTo(17.753f, 18.7295f, 17.7331f, 19.1044f, 17.9322f, 19.366f)
        lineTo(17.9919f, 19.4344f)
        lineTo(21.7672f, 23.2097f)
        curveTo(22.0279f, 23.4703f, 22.4504f, 23.4703f, 22.7111f, 23.2097f)
        curveTo(22.95f, 22.9708f, 22.9699f, 22.5958f, 22.7708f, 22.3342f)
        lineTo(22.7111f, 22.2659f)
        lineTo(18.9357f, 18.4905f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.PointAtSelf)
