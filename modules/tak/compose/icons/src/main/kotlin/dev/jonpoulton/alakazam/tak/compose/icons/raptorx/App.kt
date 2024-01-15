package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RaptorXTakIcons.App: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "App",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(5.75f, 6.25f)
        horizontalLineToRelative(6.5f)
        verticalLineToRelative(6.5f)
        horizontalLineToRelative(-6.5f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(17.75f, 6.25f)
        horizontalLineToRelative(6.5f)
        verticalLineToRelative(6.5f)
        horizontalLineToRelative(-6.5f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(5.75f, 18.25f)
        horizontalLineToRelative(6.5f)
        verticalLineToRelative(6.5f)
        horizontalLineToRelative(-6.5f)
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
        moveTo(21.7432f, 18.1849f)
        curveTo(21.6935f, 17.7981f, 21.3797f, 17.5f, 21.0f, 17.5f)
        curveTo(20.5858f, 17.5f, 20.25f, 17.8548f, 20.25f, 18.2924f)
        verticalLineTo(20.75f)
        horizontalLineTo(17.7925f)
        lineTo(17.685f, 20.7568f)
        curveTo(17.2981f, 20.8065f, 17.0f, 21.1203f, 17.0f, 21.5f)
        curveTo(17.0f, 21.9142f, 17.3548f, 22.25f, 17.7925f, 22.25f)
        horizontalLineTo(20.25f)
        verticalLineTo(24.7076f)
        lineTo(20.2568f, 24.8151f)
        curveTo(20.3065f, 25.2019f, 20.6203f, 25.5f, 21.0f, 25.5f)
        curveTo(21.4142f, 25.5f, 21.75f, 25.1452f, 21.75f, 24.7076f)
        verticalLineTo(22.25f)
        horizontalLineTo(24.2075f)
        lineTo(24.315f, 22.2432f)
        curveTo(24.7019f, 22.1935f, 25.0f, 21.8797f, 25.0f, 21.5f)
        curveTo(25.0f, 21.0858f, 24.6452f, 20.75f, 24.2075f, 20.75f)
        horizontalLineTo(21.75f)
        verticalLineTo(18.2924f)
        lineTo(21.7432f, 18.1849f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.App)
