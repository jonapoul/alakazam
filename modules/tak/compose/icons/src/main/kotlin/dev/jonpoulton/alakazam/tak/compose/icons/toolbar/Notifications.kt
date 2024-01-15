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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val ToolbarTakIcons.Notifications: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Notifications",
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
        moveTo(20.4026f, 9.7228f)
        lineTo(33.7566f, 32.8518f)
        horizontalLineTo(7.0486f)
        lineTo(20.4026f, 9.7228f)
        close()
        moveTo(5.7496f, 34.3518f)
        horizontalLineTo(35.0556f)
        curveTo(35.3226f, 34.3518f, 35.5706f, 34.2088f, 35.7046f, 33.9768f)
        curveTo(35.8386f, 33.7448f, 35.8386f, 33.4588f, 35.7046f, 33.2268f)
        lineTo(21.0516f, 7.8478f)
        curveTo(20.7836f, 7.3838f, 20.0206f, 7.3838f, 19.7526f, 7.8478f)
        lineTo(5.1006f, 33.2268f)
        curveTo(4.9666f, 33.4588f, 4.9666f, 33.7448f, 5.1006f, 33.9768f)
        curveTo(5.2346f, 34.2088f, 5.4826f, 34.3518f, 5.7496f, 34.3518f)
        close()
        moveTo(21.9051f, 28.4419f)
        curveTo(21.9051f, 27.6129f, 21.2651f, 26.9729f, 20.4021f, 26.9729f)
        curveTo(19.5401f, 26.9729f, 18.8991f, 27.6129f, 18.8991f, 28.4419f)
        verticalLineTo(28.4759f)
        curveTo(18.8991f, 29.3049f, 19.5401f, 29.9449f, 20.4021f, 29.9449f)
        curveTo(21.2651f, 29.9449f, 21.9051f, 29.3049f, 21.9051f, 28.4759f)
        verticalLineTo(28.4419f)
        close()
        moveTo(19.5561f, 17.6979f)
        curveTo(19.0911f, 17.6979f, 18.8151f, 18.0789f, 18.8651f, 18.5789f)
        lineTo(19.6071f, 25.0739f)
        curveTo(19.6611f, 25.5399f, 19.9701f, 25.8339f, 20.4021f, 25.8339f)
        curveTo(20.8341f, 25.8339f, 21.1471f, 25.5399f, 21.1971f, 25.0739f)
        lineTo(21.9391f, 18.5789f)
        curveTo(21.9931f, 18.0789f, 21.7161f, 17.6979f, 21.2481f, 17.6979f)
        horizontalLineTo(19.5561f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Notifications)
