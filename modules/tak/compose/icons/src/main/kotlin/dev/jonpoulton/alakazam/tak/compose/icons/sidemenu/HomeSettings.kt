package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

val SideMenuTakIcons.HomeSettings: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "HomeSettings",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 1f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(6f, 15f)
        lineTo(17.5543f, 9.1094f)
        curveTo(17.8404f, 8.9635f, 18.1596f, 8.9635f, 18.4457f, 9.1094f)
        lineTo(30f, 15f)
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
        moveTo(8.5528f, 15.2236f)
        curveTo(8.214f, 15.393f, 8f, 15.7393f, 8f, 16.118f)
        verticalLineTo(27f)
        curveTo(8f, 27.5523f, 8.4477f, 28f, 9f, 28f)
        horizontalLineTo(27f)
        curveTo(27.5523f, 28f, 28f, 27.5523f, 28f, 27f)
        verticalLineTo(16.118f)
        curveTo(28f, 15.7393f, 27.786f, 15.393f, 27.4472f, 15.2236f)
        lineTo(18.4472f, 10.7236f)
        curveTo(18.1657f, 10.5829f, 17.8343f, 10.5829f, 17.5528f, 10.7236f)
        lineTo(8.5528f, 15.2236f)
        close()
        moveTo(19.4168f, 14.7138f)
        curveTo(19.4168f, 14.3202f, 19.0966f, 14f, 18.7026f, 14f)
        horizontalLineTo(17.2974f)
        curveTo(16.9038f, 14f, 16.5836f, 14.3202f, 16.5836f, 14.7138f)
        verticalLineTo(15.0731f)
        curveTo(16.2119f, 15.1794f, 15.8544f, 15.3277f, 15.5174f, 15.5142f)
        lineTo(15.2641f, 15.2608f)
        curveTo(14.9953f, 14.9916f, 14.5237f, 14.9916f, 14.2541f, 15.2608f)
        lineTo(13.2608f, 16.2546f)
        curveTo(13.1258f, 16.3888f, 13.0516f, 16.568f, 13.0516f, 16.7596f)
        curveTo(13.0516f, 16.9504f, 13.1258f, 17.1296f, 13.2608f, 17.2642f)
        lineTo(13.5141f, 17.518f)
        curveTo(13.3272f, 17.855f, 13.1793f, 18.2129f, 13.073f, 18.5833f)
        horizontalLineTo(12.7142f)
        curveTo(12.3202f, 18.5833f, 12f, 18.9036f, 12f, 19.2971f)
        verticalLineTo(20.7029f)
        curveTo(12f, 21.0964f, 12.3202f, 21.4167f, 12.7142f, 21.4167f)
        horizontalLineTo(13.073f)
        curveTo(13.1793f, 21.7871f, 13.3277f, 22.1446f, 13.5141f, 22.4824f)
        lineTo(13.2608f, 22.7362f)
        curveTo(13.1258f, 22.8713f, 13.0516f, 23.0505f, 13.0516f, 23.2408f)
        curveTo(13.0516f, 23.4312f, 13.1258f, 23.6108f, 13.2608f, 23.7458f)
        lineTo(14.2545f, 24.7396f)
        curveTo(14.3835f, 24.8691f, 14.5674f, 24.9432f, 14.7595f, 24.9432f)
        curveTo(14.9511f, 24.9432f, 15.135f, 24.8691f, 15.2641f, 24.7396f)
        lineTo(15.5179f, 24.4858f)
        curveTo(15.8561f, 24.6731f, 16.2136f, 24.821f, 16.5836f, 24.9274f)
        verticalLineTo(25.2862f)
        curveTo(16.5836f, 25.6798f, 16.9038f, 26f, 17.2978f, 26f)
        horizontalLineTo(18.7026f)
        curveTo(19.0966f, 26f, 19.4168f, 25.6798f, 19.4168f, 25.2862f)
        verticalLineTo(24.9274f)
        curveTo(19.7877f, 24.821f, 20.1452f, 24.6727f, 20.4821f, 24.4858f)
        lineTo(20.7359f, 24.7396f)
        curveTo(21.0043f, 25.008f, 21.4767f, 25.0084f, 21.7459f, 24.7396f)
        lineTo(22.7396f, 23.7458f)
        curveTo(22.8743f, 23.6108f, 22.9484f, 23.4316f, 22.9484f, 23.2408f)
        curveTo(22.9484f, 23.0505f, 22.8743f, 22.8713f, 22.7396f, 22.7362f)
        lineTo(22.4859f, 22.4824f)
        curveTo(22.6728f, 22.1446f, 22.8207f, 21.7871f, 22.927f, 21.4167f)
        horizontalLineTo(23.2858f)
        curveTo(23.6798f, 21.4167f, 24f, 21.0964f, 24f, 20.7029f)
        verticalLineTo(19.2971f)
        curveTo(23.9996f, 18.9036f, 23.6793f, 18.5833f, 23.2858f, 18.5833f)
        horizontalLineTo(22.9266f)
        curveTo(22.8198f, 18.2116f, 22.6723f, 17.8537f, 22.4859f, 17.5176f)
        lineTo(22.7392f, 17.2642f)
        curveTo(22.8738f, 17.1296f, 22.948f, 16.9504f, 22.948f, 16.7592f)
        curveTo(22.948f, 16.568f, 22.8738f, 16.3892f, 22.7392f, 16.2542f)
        lineTo(21.7459f, 15.2604f)
        curveTo(21.4711f, 14.9865f, 21.0086f, 14.9873f, 20.7355f, 15.2604f)
        lineTo(20.4817f, 15.5142f)
        curveTo(20.1448f, 15.3273f, 19.7872f, 15.1794f, 19.4168f, 15.0731f)
        verticalLineTo(14.7138f)
        close()
        moveTo(15.4882f, 20f)
        curveTo(15.4882f, 18.6152f, 16.6152f, 17.4881f, 18.0003f, 17.4881f)
        curveTo(19.385f, 17.4881f, 20.5116f, 18.6152f, 20.5116f, 20f)
        curveTo(20.5116f, 21.3851f, 19.385f, 22.5118f, 18.0003f, 22.5118f)
        curveTo(16.6152f, 22.5118f, 15.4882f, 21.3851f, 15.4882f, 20f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
