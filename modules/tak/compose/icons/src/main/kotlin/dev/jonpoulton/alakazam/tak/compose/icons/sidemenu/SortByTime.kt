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

public val SideMenuTakIcons.SortByTime: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "SortByTime",
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
        moveTo(18.5212f, 24.8509f)
        curveTo(19.107f, 24.2651f, 19.107f, 23.3154f, 18.5212f, 22.7296f)
        curveTo(17.9354f, 22.1438f, 16.9856f, 22.1438f, 16.3998f, 22.7296f)
        lineTo(14.1862f, 24.9432f)
        lineTo(14.1863f, 9.0076f)
        curveTo(14.1863f, 8.1791f, 13.5147f, 7.5076f, 12.6863f, 7.5076f)
        curveTo(11.8579f, 7.5075f, 11.1863f, 8.1791f, 11.1863f, 9.0076f)
        lineTo(11.1862f, 24.9461f)
        lineTo(8.9688f, 22.7288f)
        curveTo(8.383f, 22.143f, 7.4333f, 22.143f, 6.8475f, 22.7288f)
        curveTo(6.2617f, 23.3145f, 6.2617f, 24.2643f, 6.8475f, 24.8501f)
        lineTo(11.6241f, 29.6267f)
        curveTo(12.2099f, 30.2125f, 13.1596f, 30.2125f, 13.7454f, 29.6267f)
        lineTo(18.5212f, 24.8509f)
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
        moveTo(17.6538f, 14.5f)
        curveTo(17.6538f, 11.8278f, 19.8278f, 9.6538f, 22.5f, 9.6538f)
        curveTo(25.1721f, 9.6538f, 27.3461f, 11.8278f, 27.3461f, 14.5f)
        curveTo(27.3461f, 17.1721f, 25.1721f, 19.3461f, 22.5f, 19.3461f)
        curveTo(19.8278f, 19.3461f, 17.6538f, 17.1721f, 17.6538f, 14.5f)
        close()
        moveTo(22.4357f, 15.782f)
        curveTo(22.7587f, 15.6074f, 22.9601f, 15.2696f, 22.9601f, 14.9024f)
        verticalLineTo(11.4648f)
        curveTo(22.9601f, 11.2081f, 22.7519f, 10.9999f, 22.4952f, 10.9999f)
        curveTo(22.2422f, 10.9999f, 22.0357f, 11.2022f, 22.0304f, 11.4551f)
        lineTo(21.9733f, 14.2028f)
        curveTo(21.966f, 14.5542f, 21.7748f, 14.8759f, 21.4697f, 15.0503f)
        lineTo(20.5499f, 15.5758f)
        curveTo(20.2895f, 15.7246f, 20.2006f, 16.0574f, 20.3521f, 16.3163f)
        curveTo(20.4989f, 16.5673f, 20.8182f, 16.6566f, 21.0739f, 16.5183f)
        lineTo(22.4357f, 15.782f)
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
        moveTo(22.5f, 7.5f)
        curveTo(24.3697f, 7.5f, 26.1276f, 8.2281f, 27.4498f, 9.5503f)
        curveTo(28.7719f, 10.8724f, 29.5f, 12.6303f, 29.5f, 14.5f)
        curveTo(29.5f, 16.3697f, 28.7719f, 18.1276f, 27.4498f, 19.4498f)
        curveTo(26.1276f, 20.7719f, 24.3697f, 21.5f, 22.5f, 21.5f)
        curveTo(20.6303f, 21.5f, 18.8724f, 20.7719f, 17.5502f, 19.4498f)
        curveTo(16.2281f, 18.1276f, 15.5f, 16.3697f, 15.5f, 14.5f)
        curveTo(15.5f, 12.6303f, 16.2281f, 10.8724f, 17.5502f, 9.5503f)
        curveTo(18.8724f, 8.2281f, 20.6303f, 7.5f, 22.5f, 7.5f)
        close()
        moveTo(16.5769f, 14.5f)
        curveTo(16.5769f, 17.766f, 19.234f, 20.4231f, 22.5f, 20.4231f)
        curveTo(25.766f, 20.4231f, 28.4231f, 17.766f, 28.4231f, 14.5f)
        curveTo(28.4231f, 11.234f, 25.766f, 8.5769f, 22.5f, 8.5769f)
        curveTo(19.234f, 8.5769f, 16.5769f, 11.234f, 16.5769f, 14.5f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
