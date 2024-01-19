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
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.SortByStatus: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "SortByStatus",
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
        moveTo(26.5f, 7f)
        curveTo(27.4349f, 7f, 28.3138f, 7.3641f, 28.9749f, 8.0251f)
        curveTo(29.6359f, 8.6862f, 30f, 9.5651f, 30f, 10.5f)
        curveTo(30f, 11.4349f, 29.6359f, 12.3138f, 28.9749f, 12.9749f)
        curveTo(28.3138f, 13.6359f, 27.4349f, 14f, 26.5f, 14f)
        curveTo(25.5651f, 14f, 24.6862f, 13.6359f, 24.0251f, 12.9749f)
        curveTo(23.3641f, 12.3138f, 23f, 11.4349f, 23f, 10.5f)
        curveTo(23f, 9.5651f, 23.3641f, 8.6862f, 24.0251f, 8.0251f)
        curveTo(24.6862f, 7.3641f, 25.5651f, 7f, 26.5f, 7f)
        close()
        moveTo(23.5383f, 10.5f)
        curveTo(23.5383f, 12.133f, 24.8669f, 13.4615f, 26.4999f, 13.4615f)
        curveTo(28.1329f, 13.4615f, 29.4614f, 12.133f, 29.4614f, 10.5f)
        curveTo(29.4614f, 8.867f, 28.1329f, 7.5384f, 26.4999f, 7.5384f)
        curveTo(24.8669f, 7.5384f, 23.5383f, 8.867f, 23.5383f, 10.5f)
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
        moveTo(26.5f, 15.0836f)
        curveTo(27.4349f, 15.0836f, 28.3138f, 15.4477f, 28.9749f, 16.1087f)
        curveTo(29.6359f, 16.7698f, 30f, 17.6488f, 30f, 18.5836f)
        curveTo(30f, 19.5185f, 29.6359f, 20.3974f, 28.9749f, 21.0585f)
        curveTo(28.3138f, 21.7196f, 27.4349f, 22.0836f, 26.5f, 22.0836f)
        curveTo(25.5651f, 22.0836f, 24.6862f, 21.7196f, 24.0251f, 21.0585f)
        curveTo(23.3641f, 20.3974f, 23f, 19.5185f, 23f, 18.5836f)
        curveTo(23f, 17.6488f, 23.3641f, 16.7698f, 24.0251f, 16.1087f)
        curveTo(24.6862f, 15.4477f, 25.5651f, 15.0836f, 26.5f, 15.0836f)
        close()
        moveTo(23.5383f, 18.5835f)
        curveTo(23.5383f, 20.2165f, 24.8669f, 21.545f, 26.4999f, 21.545f)
        curveTo(28.1329f, 21.545f, 29.4614f, 20.2165f, 29.4614f, 18.5835f)
        curveTo(29.4614f, 16.9505f, 28.1329f, 15.6219f, 26.4999f, 15.6219f)
        curveTo(24.8669f, 15.6219f, 23.5383f, 16.9505f, 23.5383f, 18.5835f)
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
        moveTo(26.5f, 23.1672f)
        curveTo(27.4349f, 23.1672f, 28.3138f, 23.5313f, 28.9749f, 24.1924f)
        curveTo(29.6359f, 24.8534f, 30f, 25.7324f, 30f, 26.6672f)
        curveTo(30f, 27.6021f, 29.6359f, 28.4811f, 28.9749f, 29.1421f)
        curveTo(28.3138f, 29.8032f, 27.4349f, 30.1672f, 26.5f, 30.1672f)
        curveTo(25.5651f, 30.1672f, 24.6862f, 29.8032f, 24.0251f, 29.1421f)
        curveTo(23.3641f, 28.4811f, 23f, 27.6021f, 23f, 26.6672f)
        curveTo(23f, 25.7324f, 23.3641f, 24.8534f, 24.0251f, 24.1924f)
        curveTo(24.6862f, 23.5313f, 25.5651f, 23.1672f, 26.5f, 23.1672f)
        close()
        moveTo(23.5383f, 26.6671f)
        curveTo(23.5383f, 28.3001f, 24.8669f, 29.6286f, 26.4999f, 29.6286f)
        curveTo(28.1329f, 29.6286f, 29.4614f, 28.3001f, 29.4614f, 26.6671f)
        curveTo(29.4614f, 25.0341f, 28.1329f, 23.7056f, 26.4999f, 23.7056f)
        curveTo(24.8669f, 23.7056f, 23.5383f, 25.0341f, 23.5383f, 26.6671f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(26.5f, 10.5f)
        moveToRelative(-2.5f, 0f)
        arcToRelative(2.5f, 2.5f, 0f, true, true, 5f, 0f)
        arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(26.5f, 18.58f)
        moveToRelative(-2f, 0f)
        arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
        arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(26.5f, 26.67f)
        moveToRelative(-1.5f, 0f)
        arcToRelative(1.5f, 1.5f, 0f, true, true, 3f, 0f)
        arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.SortByStatus)
