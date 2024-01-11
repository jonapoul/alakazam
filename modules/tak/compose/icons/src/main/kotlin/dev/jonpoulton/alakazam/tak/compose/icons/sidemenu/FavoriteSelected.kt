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

val SideMenuTakIcons.FavoriteSelected: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "FavoriteSelected",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(18.4653f, 24.7446f)
        curveTo(18.174f, 24.5915f, 17.826f, 24.5915f, 17.5347f, 24.7446f)
        lineTo(12.7401f, 27.2653f)
        curveTo(12.0064f, 27.651f, 11.149f, 27.028f, 11.2891f, 26.2111f)
        lineTo(12.2048f, 20.8723f)
        curveTo(12.2604f, 20.5479f, 12.1529f, 20.2169f, 11.9172f, 19.9871f)
        lineTo(8.0383f, 16.2061f)
        curveTo(7.4448f, 15.6276f, 7.7723f, 14.6196f, 8.5925f, 14.5004f)
        lineTo(13.953f, 13.7215f)
        curveTo(14.2787f, 13.6742f, 14.5603f, 13.4696f, 14.706f, 13.1745f)
        lineTo(17.1033f, 8.317f)
        curveTo(17.4701f, 7.5737f, 18.5299f, 7.5737f, 18.8967f, 8.317f)
        lineTo(21.294f, 13.1745f)
        curveTo(21.4397f, 13.4696f, 21.7213f, 13.6742f, 22.047f, 13.7215f)
        lineTo(27.4075f, 14.5004f)
        curveTo(28.2277f, 14.6196f, 28.5552f, 15.6276f, 27.9617f, 16.2061f)
        lineTo(24.0828f, 19.9871f)
        curveTo(23.8471f, 20.2169f, 23.7396f, 20.5479f, 23.7952f, 20.8723f)
        lineTo(24.7109f, 26.2111f)
        curveTo(24.851f, 27.028f, 23.9936f, 27.651f, 23.26f, 27.2653f)
        lineTo(18.4653f, 24.7446f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
