package dev.jonpoulton.alakazam.tak.compose.icons.navigation

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
import dev.jonpoulton.alakazam.tak.compose.icons.NavigationTakIcons

val NavigationTakIcons.CheckpointStop: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "CheckpointStop",
      defaultWidth = 29.0.dp,
      defaultHeight = 29.0.dp,
      viewportWidth = 29.0f,
      viewportHeight = 29.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFFB50000)),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(27.802f, 19.2521f)
        curveTo(27.802f, 19.7392f, 27.6151f, 20.1924f, 27.2696f, 20.5379f)
        lineTo(20.5463f, 27.2611f)
        curveTo(20.2008f, 27.6066f, 19.7477f, 27.7935f, 19.2606f, 27.7935f)
        horizontalLineTo(9.7506f)
        curveTo(9.2635f, 27.7935f, 8.8104f, 27.6066f, 8.4649f, 27.2611f)
        lineTo(1.7416f, 20.5379f)
        curveTo(1.3961f, 20.1924f, 1.2092f, 19.7392f, 1.2092f, 19.2521f)
        verticalLineTo(9.7422f)
        curveTo(1.2092f, 9.2607f, 1.4018f, 8.8019f, 1.7416f, 8.4621f)
        lineTo(8.4706f, 1.7388f)
        curveTo(8.8104f, 1.3933f, 9.2635f, 1.2064f, 9.7506f, 1.2064f)
        horizontalLineTo(19.2549f)
        curveTo(19.742f, 1.2064f, 20.1952f, 1.399f, 20.5407f, 1.7388f)
        lineTo(27.2696f, 8.4621f)
        curveTo(27.6151f, 8.8076f, 27.802f, 9.2607f, 27.802f, 9.7478f)
        verticalLineTo(19.2521f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(6.3013f, 13.9506f)
        lineTo(6.12f, 13.8939f)
        curveTo(5.4517f, 13.707f, 4.8343f, 13.3898f, 4.8343f, 12.3873f)
        curveTo(4.8343f, 11.5547f, 5.378f, 10.875f, 6.0464f, 10.875f)
        curveTo(6.6808f, 10.875f, 7.2132f, 11.4924f, 7.2472f, 12.2853f)
        curveTo(7.2642f, 12.6195f, 7.5247f, 12.914f, 7.8816f, 12.8574f)
        curveTo(8.2157f, 12.8404f, 8.4706f, 12.5572f, 8.4536f, 12.223f)
        curveTo(8.38f, 10.7957f, 7.3152f, 9.6742f, 6.0408f, 9.6742f)
        curveTo(4.704f, 9.6742f, 3.6222f, 10.892f, 3.6222f, 12.3929f)
        curveTo(3.6222f, 13.3275f, 4.0017f, 14.551f, 5.7859f, 15.0607f)
        lineTo(5.9671f, 15.1117f)
        curveTo(6.6355f, 15.3043f, 7.2529f, 15.6158f, 7.2529f, 16.6183f)
        curveTo(7.2529f, 17.451f, 6.7091f, 18.1306f, 6.0408f, 18.1306f)
        curveTo(5.4064f, 18.1306f, 4.8796f, 17.5076f, 4.8343f, 16.7203f)
        curveTo(4.8173f, 16.3861f, 4.5681f, 16.1256f, 4.1999f, 16.1482f)
        curveTo(3.8658f, 16.1652f, 3.6109f, 16.4484f, 3.6279f, 16.7826f)
        curveTo(3.7015f, 18.2099f, 4.7663f, 19.3314f, 6.0408f, 19.3314f)
        curveTo(7.3775f, 19.3314f, 8.4593f, 18.1136f, 8.4593f, 16.6183f)
        curveTo(8.4593f, 15.259f, 7.7343f, 14.364f, 6.3013f, 13.9506f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(13.8967f, 9.6628f)
        horizontalLineTo(9.0653f)
        curveTo(8.7311f, 9.6628f, 8.4592f, 9.9347f, 8.4592f, 10.2689f)
        curveTo(8.4592f, 10.6031f, 8.7311f, 10.875f, 9.0653f, 10.875f)
        horizontalLineTo(13.8967f)
        curveTo(14.2309f, 10.875f, 14.5028f, 10.6031f, 14.5028f, 10.2689f)
        curveTo(14.5028f, 9.9347f, 14.2309f, 9.6628f, 13.8967f, 9.6628f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(11.4839f, 9.6628f)
        curveTo(11.1497f, 9.6628f, 10.8778f, 9.9347f, 10.8778f, 10.2689f)
        verticalLineTo(18.7253f)
        curveTo(10.8778f, 19.0595f, 11.1497f, 19.3314f, 11.4839f, 19.3314f)
        curveTo(11.818f, 19.3314f, 12.0843f, 19.0652f, 12.0899f, 18.7253f)
        verticalLineTo(10.2689f)
        curveTo(12.0899f, 9.9347f, 11.818f, 9.6628f, 11.4839f, 9.6628f)
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
        moveTo(14.5028f, 12.0814f)
        curveTo(14.5028f, 10.7503f, 15.5846f, 9.6628f, 16.9214f, 9.6628f)
        curveTo(18.2581f, 9.6628f, 19.3399f, 10.7447f, 19.3399f, 12.0814f)
        verticalLineTo(16.9128f)
        curveTo(19.3343f, 18.2496f, 18.2524f, 19.3314f, 16.9214f, 19.3314f)
        curveTo(15.5903f, 19.3314f, 14.5028f, 18.2496f, 14.5028f, 16.9128f)
        verticalLineTo(12.0814f)
        close()
        moveTo(16.9214f, 18.1193f)
        curveTo(17.5897f, 18.1193f, 18.1278f, 17.5755f, 18.1278f, 16.9128f)
        verticalLineTo(12.0814f)
        curveTo(18.1278f, 11.4187f, 17.5841f, 10.875f, 16.9214f, 10.875f)
        curveTo(16.253f, 10.875f, 15.7149f, 11.4187f, 15.7149f, 12.0814f)
        verticalLineTo(16.9128f)
        curveTo(15.7149f, 17.5812f, 16.2587f, 18.1193f, 16.9214f, 18.1193f)
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
        moveTo(21.1468f, 9.6628f)
        horizontalLineTo(23.5654f)
        curveTo(24.5623f, 9.6628f, 25.3779f, 10.4785f, 25.3779f, 11.4753f)
        verticalLineTo(13.8939f)
        curveTo(25.3779f, 14.8908f, 24.5623f, 15.7064f, 23.5654f, 15.7064f)
        horizontalLineTo(21.7529f)
        verticalLineTo(18.7253f)
        curveTo(21.7529f, 19.0652f, 21.481f, 19.3314f, 21.1468f, 19.3314f)
        curveTo(20.8126f, 19.3314f, 20.5408f, 19.0595f, 20.5408f, 18.7253f)
        verticalLineTo(10.2689f)
        curveTo(20.5408f, 9.9347f, 20.8126f, 9.6628f, 21.1468f, 9.6628f)
        close()
        moveTo(23.5654f, 14.5f)
        curveTo(23.8996f, 14.5f, 24.1714f, 14.2281f, 24.1714f, 13.8939f)
        verticalLineTo(11.4753f)
        curveTo(24.1714f, 11.1412f, 23.8996f, 10.8693f, 23.5654f, 10.8693f)
        horizontalLineTo(21.7529f)
        verticalLineTo(14.5f)
        horizontalLineTo(23.5654f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
