package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.MinBrightness: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "MinBrightness",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null, fillAlpha = 0.85f,
        strokeAlpha = 0.85f,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(18f, 21.5f)
        curveTo(16.3458f, 21.5f, 15f, 20.1542f, 15f, 18.5f)
        curveTo(15f, 16.8457f, 16.3458f, 15.4999f, 18f, 15.4999f)
        curveTo(19.6543f, 15.4999f, 21.0001f, 16.8457f, 21.0001f, 18.5f)
        curveTo(21.0001f, 20.1542f, 19.6543f, 21.5f, 18f, 21.5f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null, fillAlpha = 0.85f,
        strokeAlpha = 0.85f,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(18f, 11.5f)
        curveTo(19.8697f, 11.5f, 21.6276f, 12.2281f, 22.9498f, 13.5502f)
        curveTo(24.2719f, 14.8724f, 25f, 16.6303f, 25f, 18.5f)
        curveTo(25f, 20.3697f, 24.2719f, 22.1276f, 22.9498f, 23.4498f)
        curveTo(21.6276f, 24.7719f, 19.8697f, 25.5f, 18f, 25.5f)
        curveTo(16.1303f, 25.5f, 14.3724f, 24.7719f, 13.0502f, 23.4498f)
        curveTo(11.7281f, 22.1276f, 11f, 20.3697f, 11f, 18.5f)
        curveTo(11f, 16.6303f, 11.7281f, 14.8724f, 13.0502f, 13.5502f)
        curveTo(14.3724f, 12.2281f, 16.1303f, 11.5f, 18f, 11.5f)
        close()
        moveTo(12.0769f, 18.5f)
        curveTo(12.0769f, 21.766f, 14.734f, 24.4231f, 18f, 24.4231f)
        curveTo(21.266f, 24.4231f, 23.9231f, 21.766f, 23.9231f, 18.5f)
        curveTo(23.9231f, 15.234f, 21.266f, 12.5769f, 18f, 12.5769f)
        curveTo(14.734f, 12.5769f, 12.0769f, 15.234f, 12.0769f, 18.5f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null, fillAlpha = 0.85f,
        strokeAlpha = 0.85f,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(18f, 8.5f)
        lineTo(18f, 8.5f)
        arcTo(0.5f, 0.5f, 0f, false, true, 18.5f, 9f)
        lineTo(18.5f, 9.5f)
        arcTo(0.5f, 0.5f, 0f, false, true, 18f, 10f)
        lineTo(18f, 10f)
        arcTo(0.5f, 0.5f, 0f, false, true, 17.5f, 9.5f)
        lineTo(17.5f, 9f)
        arcTo(0.5f, 0.5f, 0f, false, true, 18f, 8.5f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null, fillAlpha = 0.85f,
        strokeAlpha = 0.85f,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(18f, 27f)
        lineTo(18f, 27f)
        arcTo(0.5f, 0.5f, 0f, false, true, 18.5f, 27.5f)
        lineTo(18.5f, 28f)
        arcTo(0.5f, 0.5f, 0f, false, true, 18f, 28.5f)
        lineTo(18f, 28.5f)
        arcTo(0.5f, 0.5f, 0f, false, true, 17.5f, 28f)
        lineTo(17.5f, 27.5f)
        arcTo(0.5f, 0.5f, 0f, false, true, 18f, 27f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null, fillAlpha = 0.85f,
        strokeAlpha = 0.85f,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(28f, 18.5f)
        lineTo(28f, 18.5f)
        arcTo(0.5f, 0.5f, 0f, false, true, 27.5f, 19f)
        lineTo(27f, 19f)
        arcTo(0.5f, 0.5f, 0f, false, true, 26.5f, 18.5f)
        lineTo(26.5f, 18.5f)
        arcTo(0.5f, 0.5f, 0f, false, true, 27f, 18f)
        lineTo(27.5f, 18f)
        arcTo(0.5f, 0.5f, 0f, false, true, 28f, 18.5f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null, fillAlpha = 0.85f,
        strokeAlpha = 0.85f,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(9.5f, 18.5f)
        lineTo(9.5f, 18.5f)
        arcTo(0.5f, 0.5f, 0f, false, true, 9f, 19f)
        lineTo(8.5f, 19f)
        arcTo(0.5f, 0.5f, 0f, false, true, 8f, 18.5f)
        lineTo(8f, 18.5f)
        arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 18f)
        lineTo(9f, 18f)
        arcTo(0.5f, 0.5f, 0f, false, true, 9.5f, 18.5f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null, fillAlpha = 0.85f,
        strokeAlpha = 0.85f,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(25.071f, 25.5711f)
        lineTo(25.071f, 25.5711f)
        arcTo(0.5f, 0.5f, 102.1257f, false, true, 24.3639f, 25.5711f)
        lineTo(24.0104f, 25.2175f)
        arcTo(0.5f, 0.5f, 102.1257f, false, true, 24.0104f, 24.5104f)
        lineTo(24.0104f, 24.5104f)
        arcTo(0.5f, 0.5f, 102.1257f, false, true, 24.7175f, 24.5104f)
        lineTo(25.071f, 24.8639f)
        arcTo(0.5f, 0.5f, 102.1257f, false, true, 25.071f, 25.5711f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null, fillAlpha = 0.85f,
        strokeAlpha = 0.85f,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(11.9897f, 12.4896f)
        lineTo(11.9897f, 12.4896f)
        arcTo(0.5f, 0.5f, 0f, false, true, 11.2826f, 12.4896f)
        lineTo(10.9291f, 12.136f)
        arcTo(0.5f, 0.5f, 98.1444f, false, true, 10.9291f, 11.4289f)
        lineTo(10.9291f, 11.4289f)
        arcTo(0.5f, 0.5f, 98.1444f, false, true, 11.6362f, 11.4289f)
        lineTo(11.9897f, 11.7824f)
        arcTo(0.5f, 0.5f, 0f, false, true, 11.9897f, 12.4896f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null, fillAlpha = 0.85f,
        strokeAlpha = 0.85f,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(25.0711f, 11.429f)
        lineTo(25.0711f, 11.429f)
        arcTo(0.5f, 0.5f, 77.8743f, false, true, 25.0711f, 12.1361f)
        lineTo(24.7175f, 12.4896f)
        arcTo(0.5f, 0.5f, 121.5133f, false, true, 24.0104f, 12.4896f)
        lineTo(24.0104f, 12.4896f)
        arcTo(0.5f, 0.5f, 121.5133f, false, true, 24.0104f, 11.7825f)
        lineTo(24.3639f, 11.429f)
        arcTo(0.5f, 0.5f, 77.8743f, false, true, 25.0711f, 11.429f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null, fillAlpha = 0.85f,
        strokeAlpha = 0.85f,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(11.9896f, 24.5105f)
        lineTo(11.9896f, 24.5105f)
        arcTo(0.5f, 0.5f, 104.6621f, false, true, 11.9896f, 25.2176f)
        lineTo(11.636f, 25.5711f)
        arcTo(0.5f, 0.5f, 0f, false, true, 10.9289f, 25.5711f)
        lineTo(10.9289f, 25.5711f)
        arcTo(0.5f, 0.5f, 0f, false, true, 10.9289f, 24.864f)
        lineTo(11.2824f, 24.5105f)
        arcTo(0.5f, 0.5f, 104.6621f, false, true, 11.9896f, 24.5105f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.MinBrightness)
