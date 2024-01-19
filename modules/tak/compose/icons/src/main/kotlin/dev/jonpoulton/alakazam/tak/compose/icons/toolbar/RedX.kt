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

public val ToolbarTakIcons.RedX: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RedX",
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
        moveTo(7.397f, 13.0358f)
        lineTo(7.4696f, 12.9517f)
        lineTo(12.4506f, 7.9697f)
        curveTo(12.7435f, 7.6768f, 13.2184f, 7.6768f, 13.5113f, 7.9697f)
        lineTo(20.143f, 14.601f)
        lineTo(26.7757f, 7.9696f)
        curveTo(27.042f, 7.7034f, 27.4586f, 7.6792f, 27.7522f, 7.897f)
        lineTo(27.8363f, 7.9697f)
        lineTo(32.8183f, 12.9517f)
        curveTo(33.1112f, 13.2446f, 33.1112f, 13.7194f, 32.8183f, 14.0123f)
        lineTo(26.187f, 20.644f)
        lineTo(32.8183f, 27.2757f)
        curveTo(33.0846f, 27.5419f, 33.1088f, 27.9586f, 32.8909f, 28.2522f)
        lineTo(32.8183f, 28.3363f)
        lineTo(27.8363f, 33.3183f)
        curveTo(27.5435f, 33.6112f, 27.0686f, 33.6112f, 26.7757f, 33.3184f)
        lineTo(20.143f, 26.686f)
        lineTo(13.5113f, 33.3183f)
        curveTo(13.245f, 33.5846f, 12.8283f, 33.6088f, 12.5347f, 33.3909f)
        lineTo(12.4506f, 33.3183f)
        lineTo(7.4696f, 28.3363f)
        curveTo(7.1768f, 28.0434f, 7.1768f, 27.5686f, 7.4696f, 27.2757f)
        lineTo(14.1f, 20.644f)
        lineTo(7.4696f, 14.0123f)
        curveTo(7.2034f, 13.746f, 7.1792f, 13.3294f, 7.397f, 13.0358f)
        close()
        moveTo(31.227f, 13.482f)
        lineTo(27.305f, 9.56f)
        lineTo(20.6733f, 16.1924f)
        curveTo(20.3804f, 16.4852f, 19.9055f, 16.4852f, 19.6127f, 16.1923f)
        lineTo(12.981f, 9.561f)
        lineTo(9.06f, 13.481f)
        lineTo(15.6914f, 20.1137f)
        curveTo(15.9576f, 20.38f, 15.9818f, 20.7966f, 15.764f, 21.0902f)
        lineTo(15.6914f, 21.1743f)
        lineTo(9.06f, 27.806f)
        lineTo(12.981f, 31.726f)
        lineTo(19.6127f, 25.0957f)
        curveTo(19.8789f, 24.8294f, 20.2956f, 24.8052f, 20.5892f, 25.023f)
        lineTo(20.6733f, 25.0956f)
        lineTo(27.305f, 31.727f)
        lineTo(31.227f, 27.806f)
        lineTo(24.5957f, 21.1743f)
        curveTo(24.3294f, 20.9081f, 24.3052f, 20.4914f, 24.5231f, 20.1978f)
        lineTo(24.5957f, 20.1137f)
        lineTo(31.227f, 13.482f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.RedX)
