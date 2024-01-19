package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.Hide: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Hide",
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
        moveTo(9.0193f, 19.7745f)
        curveTo(8.1909f, 19.7745f, 7.5193f, 20.4461f, 7.5193f, 21.2745f)
        curveTo(7.5193f, 22.103f, 8.1909f, 22.7745f, 9.0193f, 22.7745f)
        horizontalLineTo(12.0696f)
        lineTo(6.2903f, 28.5548f)
        curveTo(5.7046f, 29.1406f, 5.7047f, 30.0904f, 6.2905f, 30.6761f)
        curveTo(6.8763f, 31.2618f, 7.8261f, 31.2617f, 8.4118f, 30.6759f)
        lineTo(14.1924f, 24.8944f)
        lineTo(14.1924f, 27.9487f)
        curveTo(14.1924f, 28.7771f, 14.8639f, 29.4487f, 15.6924f, 29.4487f)
        curveTo(16.5208f, 29.4487f, 17.1924f, 28.7771f, 17.1924f, 27.9487f)
        verticalLineTo(21.2745f)
        curveTo(17.1924f, 20.4461f, 16.5208f, 19.7745f, 15.6924f, 19.7745f)
        horizontalLineTo(15.6904f)
        horizontalLineTo(9.0193f)
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
        moveTo(26.9804f, 18.2256f)
        curveTo(27.8088f, 18.2256f, 28.4804f, 17.554f, 28.4804f, 16.7256f)
        curveTo(28.4804f, 15.8972f, 27.8088f, 15.2256f, 26.9804f, 15.2256f)
        lineTo(23.9302f, 15.2256f)
        lineTo(29.7094f, 9.4453f)
        curveTo(30.2952f, 8.8595f, 30.2951f, 7.9098f, 29.7093f, 7.324f)
        curveTo(29.1234f, 6.7383f, 28.1737f, 6.7384f, 27.5879f, 7.3242f)
        lineTo(21.8074f, 13.1057f)
        verticalLineTo(10.0514f)
        curveTo(21.8074f, 9.223f, 21.1358f, 8.5514f, 20.3074f, 8.5514f)
        curveTo(19.479f, 8.5514f, 18.8074f, 9.223f, 18.8074f, 10.0514f)
        verticalLineTo(16.7256f)
        curveTo(18.8074f, 17.554f, 19.479f, 18.2256f, 20.3074f, 18.2256f)
        horizontalLineTo(20.3093f)
        lineTo(26.9804f, 18.2256f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Hide)
