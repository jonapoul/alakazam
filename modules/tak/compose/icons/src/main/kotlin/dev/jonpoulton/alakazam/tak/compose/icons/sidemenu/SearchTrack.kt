package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.Color
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

val SideMenuTakIcons.SearchTrack: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "SearchTrack",
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
        moveTo(9.9916f, 20.6502f)
        curveTo(7.5146f, 17.2408f, 8.2704f, 12.4689f, 11.6798f, 9.9918f)
        curveTo(15.0892f, 7.5147f, 19.8611f, 8.2705f, 22.3382f, 11.6799f)
        curveTo(24.8153f, 15.0893f, 24.0595f, 19.8612f, 20.6501f, 22.3383f)
        curveTo(17.2407f, 24.8154f, 12.4687f, 24.0596f, 9.9916f, 20.6502f)
        close()
        moveTo(10.7981f, 8.7782f)
        curveTo(6.7185f, 11.7423f, 5.8141f, 17.4523f, 8.7781f, 21.5319f)
        curveTo(11.7421f, 25.6115f, 17.4521f, 26.5159f, 21.5317f, 23.5518f)
        curveTo(21.5627f, 23.5293f, 21.5935f, 23.5067f, 21.6241f, 23.4838f)
        lineTo(27.683f, 30.6986f)
        curveTo(27.9494f, 31.0158f, 28.4225f, 31.057f, 28.7397f, 30.7906f)
        curveTo(29.0569f, 30.5242f, 29.0981f, 30.0511f, 28.8317f, 29.7339f)
        lineTo(22.7501f, 22.4921f)
        curveTo(25.7624f, 19.3642f, 26.1931f, 14.4338f, 23.5517f, 10.7982f)
        curveTo(20.5877f, 6.7186f, 14.8777f, 5.8142f, 10.7981f, 8.7782f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(14.2368f, 14.8595f)
        lineTo(13.6599f, 14.3534f)
        lineTo(16.1599f, 12.16f)
        lineTo(18.6599f, 14.3534f)
        lineTo(18.083f, 14.8595f)
        lineTo(16.1599f, 13.1723f)
        lineTo(14.2368f, 14.8595f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(14.2368f, 17.6785f)
        lineTo(13.6599f, 17.1091f)
        lineTo(16.1599f, 14.6416f)
        lineTo(18.6599f, 17.1091f)
        lineTo(18.083f, 17.6785f)
        lineTo(16.1599f, 15.7804f)
        lineTo(14.2368f, 17.6785f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(14.2368f, 20.16f)
        lineTo(13.6599f, 19.6539f)
        lineTo(16.1599f, 17.4605f)
        lineTo(18.6599f, 19.6539f)
        lineTo(18.083f, 20.16f)
        lineTo(16.1599f, 18.4729f)
        lineTo(14.2368f, 20.16f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
