package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val SideMenuTakIcons.Attach: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Attach",
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
        pathFillType = NonZero,
      ) {
        moveTo(21.6343f, 16.9933f)
        curveTo(21.6343f, 16.9933f, 22.8521f, 15.8871f, 21.7002f, 14.7347f)
        curveTo(20.5484f, 13.5823f, 19.3763f, 14.7341f, 19.3763f, 14.7341f)
        lineTo(17.3679f, 16.7437f)
        curveTo(15.3446f, 18.7688f, 15.0949f, 21.8122f, 17.118f, 23.8355f)
        curveTo(19.1421f, 25.8606f, 22.2548f, 25.6815f, 24.2773f, 23.6566f)
        lineTo(27.6657f, 20.2681f)
        curveTo(30.7781f, 17.1541f, 30.7781f, 12.0868f, 27.6657f, 8.9729f)
        lineTo(27.5295f, 8.8366f)
        curveTo(24.4155f, 5.7211f, 19.3508f, 5.7211f, 16.2384f, 8.8366f)
        lineTo(8.3349f, 16.7431f)
        curveTo(5.2217f, 19.857f, 5.2217f, 24.9243f, 8.3349f, 28.0398f)
        lineTo(8.4711f, 28.1761f)
        curveTo(10.8946f, 30.6003f, 14.5388f, 31.1783f, 17.6147f, 29.6719f)
        curveTo(18.4404f, 29.2675f, 19.3377f, 28.5017f, 18.7454f, 27.4275f)
        curveTo(18.1187f, 26.2911f, 17.0179f, 26.5386f, 16.4358f, 26.8041f)
        curveTo(14.6988f, 27.5202f, 12.138f, 27.326f, 10.7291f, 25.9172f)
        lineTo(10.5929f, 25.7793f)
        curveTo(8.7248f, 23.9118f, 8.7248f, 20.8711f, 10.5929f, 19.0021f)
        lineTo(18.4964f, 11.0956f)
        curveTo(20.3645f, 9.2266f, 23.4037f, 9.2266f, 25.2702f, 11.0956f)
        lineTo(25.408f, 11.2319f)
        curveTo(27.2745f, 13.101f, 27.2745f, 16.14f, 25.408f, 18.0091f)
        lineTo(22.0194f, 21.3976f)
        curveTo(21.2413f, 22.1761f, 20.1541f, 22.3553f, 19.376f, 21.5766f)
        curveTo(18.5979f, 20.7979f, 18.8478f, 19.7814f, 19.6259f, 19.0027f)
        lineTo(21.6343f, 16.9933f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Attach)
