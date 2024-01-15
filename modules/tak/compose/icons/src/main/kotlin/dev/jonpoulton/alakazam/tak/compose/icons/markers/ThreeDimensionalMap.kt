package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val MarkersTakIcons.ThreeDimensionalMap: ImageVector
  get() {
    if (nullableIcons != null) {
      return nullableIcons!!
    }
    nullableIcons = Builder(
      name = "ThreeDimensionalMap",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Black),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0f, 16.5f)
        moveToRelative(-15.25f, 0.0f)
        arcToRelative(15.25f, 15.25f, 0.0f, true, true, 30.5f, 0.0f)
        arcToRelative(15.25f, 15.25f, 0.0f, true, true, -30.5f, 0.0f)
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(7.0889f, 9.5127f)
        lineTo(15.8884f, 4.8613f)
        lineTo(24.688f, 9.5127f)
        lineTo(15.8884f, 14.1641f)
        lineTo(7.0889f, 9.5127f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.7773f, 11.2906f)
        lineTo(24.7773f, 24.6239f)
        lineTo(20.3775f, 26.9496f)
        lineTo(18.1776f, 28.1125f)
        lineTo(17.0777f, 28.6939f)
        lineTo(16.5277f, 28.9846f)
        lineTo(16.5277f, 15.6513f)
        lineTo(17.0777f, 15.3606f)
        lineTo(18.1776f, 14.7792f)
        lineTo(20.3775f, 13.6163f)
        lineTo(24.7773f, 11.2906f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(6.9993f, 11.2906f)
        lineTo(6.9993f, 24.6239f)
        lineTo(11.3991f, 26.9496f)
        lineTo(13.599f, 28.1125f)
        lineTo(14.6989f, 28.6939f)
        lineTo(15.2489f, 28.9846f)
        lineTo(15.2489f, 15.6513f)
        lineTo(14.6989f, 15.3606f)
        lineTo(13.599f, 14.7792f)
        lineTo(11.3991f, 13.6163f)
        lineTo(6.9993f, 11.2906f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(7.7281f, 12.3237f)
        lineTo(7.7281f, 13.7799f)
        lineTo(8.2086f, 14.0339f)
        lineTo(8.4489f, 14.1609f)
        lineTo(8.569f, 14.2244f)
        lineTo(8.6291f, 14.2561f)
        lineTo(8.6291f, 12.7999f)
        lineTo(8.569f, 12.7682f)
        lineTo(8.4489f, 12.7047f)
        lineTo(8.2086f, 12.5777f)
        lineTo(7.7281f, 12.3237f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(7.7281f, 15.1449f)
        lineTo(7.7281f, 16.6011f)
        lineTo(8.2086f, 16.8551f)
        lineTo(8.4489f, 16.9821f)
        lineTo(8.569f, 17.0456f)
        lineTo(8.6291f, 17.0774f)
        lineTo(8.6291f, 15.6212f)
        lineTo(8.569f, 15.5894f)
        lineTo(8.4489f, 15.5259f)
        lineTo(8.2086f, 15.3989f)
        lineTo(7.7281f, 15.1449f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(7.7281f, 17.9662f)
        lineTo(7.7281f, 19.4224f)
        lineTo(8.2086f, 19.6764f)
        lineTo(8.4489f, 19.8034f)
        lineTo(8.569f, 19.8669f)
        lineTo(8.6291f, 19.8987f)
        lineTo(8.6291f, 18.4425f)
        lineTo(8.569f, 18.4107f)
        lineTo(8.4489f, 18.3472f)
        lineTo(8.2086f, 18.2202f)
        lineTo(7.7281f, 17.9662f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(9.6091f, 13.2638f)
        lineTo(9.6091f, 14.72f)
        lineTo(10.0896f, 14.974f)
        lineTo(10.3299f, 15.101f)
        lineTo(10.45f, 15.1645f)
        lineTo(10.5101f, 15.1963f)
        lineTo(10.5101f, 13.7401f)
        lineTo(10.45f, 13.7083f)
        lineTo(10.3299f, 13.6448f)
        lineTo(10.0896f, 13.5178f)
        lineTo(9.6091f, 13.2638f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(9.6091f, 16.0854f)
        lineTo(9.6091f, 17.5416f)
        lineTo(10.0896f, 17.7956f)
        lineTo(10.3299f, 17.9226f)
        lineTo(10.45f, 17.9861f)
        lineTo(10.5101f, 18.0178f)
        lineTo(10.5101f, 16.5616f)
        lineTo(10.45f, 16.5299f)
        lineTo(10.3299f, 16.4664f)
        lineTo(10.0896f, 16.3394f)
        lineTo(9.6091f, 16.0854f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(9.6091f, 18.9069f)
        lineTo(9.6091f, 20.3631f)
        lineTo(10.0896f, 20.6171f)
        lineTo(10.3299f, 20.7441f)
        lineTo(10.45f, 20.8076f)
        lineTo(10.5101f, 20.8394f)
        lineTo(10.5101f, 19.3832f)
        lineTo(10.45f, 19.3514f)
        lineTo(10.3299f, 19.2879f)
        lineTo(10.0896f, 19.1609f)
        lineTo(9.6091f, 18.9069f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(11.4901f, 14.2045f)
        lineTo(11.4901f, 15.6607f)
        lineTo(11.9706f, 15.9147f)
        lineTo(12.2108f, 16.0417f)
        lineTo(12.331f, 16.1052f)
        lineTo(12.391f, 16.137f)
        lineTo(12.391f, 14.6808f)
        lineTo(12.331f, 14.649f)
        lineTo(12.2108f, 14.5855f)
        lineTo(11.9706f, 14.4585f)
        lineTo(11.4901f, 14.2045f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(11.4901f, 17.0258f)
        lineTo(11.4901f, 18.482f)
        lineTo(11.9706f, 18.736f)
        lineTo(12.2108f, 18.863f)
        lineTo(12.331f, 18.9265f)
        lineTo(12.391f, 18.9583f)
        lineTo(12.391f, 17.5021f)
        lineTo(12.331f, 17.4703f)
        lineTo(12.2108f, 17.4068f)
        lineTo(11.9706f, 17.2798f)
        lineTo(11.4901f, 17.0258f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(11.4901f, 19.8471f)
        lineTo(11.4901f, 21.3033f)
        lineTo(11.9706f, 21.5573f)
        lineTo(12.2108f, 21.6843f)
        lineTo(12.331f, 21.7478f)
        lineTo(12.391f, 21.7795f)
        lineTo(12.391f, 20.3233f)
        lineTo(12.331f, 20.2916f)
        lineTo(12.2108f, 20.2281f)
        lineTo(11.9706f, 20.1011f)
        lineTo(11.4901f, 19.8471f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(13.3709f, 15.1449f)
        verticalLineTo(16.6011f)
        lineTo(13.8514f, 16.8551f)
        lineTo(14.0917f, 16.9821f)
        lineTo(14.2118f, 17.0456f)
        lineTo(14.2719f, 17.0774f)
        lineTo(14.2719f, 15.6212f)
        lineTo(14.2118f, 15.5894f)
        lineTo(14.0917f, 15.5259f)
        lineTo(13.8514f, 15.3989f)
        lineTo(13.3709f, 15.1449f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(13.3709f, 17.9662f)
        lineTo(13.3709f, 19.4224f)
        lineTo(13.8514f, 19.6764f)
        lineTo(14.0917f, 19.8034f)
        lineTo(14.2118f, 19.8669f)
        lineTo(14.2719f, 19.8987f)
        lineTo(14.2719f, 18.4425f)
        lineTo(14.2118f, 18.4107f)
        lineTo(14.0917f, 18.3472f)
        lineTo(13.8514f, 18.2202f)
        lineTo(13.3709f, 17.9662f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(13.3709f, 20.7878f)
        verticalLineTo(22.244f)
        lineTo(13.8514f, 22.498f)
        lineTo(14.0917f, 22.625f)
        lineTo(14.2118f, 22.6885f)
        lineTo(14.2719f, 22.7202f)
        lineTo(14.2719f, 21.264f)
        lineTo(14.2118f, 21.2323f)
        lineTo(14.0917f, 21.1688f)
        lineTo(13.8514f, 21.0418f)
        lineTo(13.3709f, 20.7878f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.0497f, 12.3237f)
        lineTo(24.0497f, 13.7799f)
        lineTo(23.5692f, 14.0339f)
        lineTo(23.329f, 14.1609f)
        lineTo(23.2088f, 14.2244f)
        lineTo(23.1488f, 14.2561f)
        lineTo(23.1488f, 12.7999f)
        lineTo(23.2088f, 12.7682f)
        lineTo(23.329f, 12.7047f)
        lineTo(23.5692f, 12.5777f)
        lineTo(24.0497f, 12.3237f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.0497f, 15.1449f)
        verticalLineTo(16.6011f)
        lineTo(23.5692f, 16.8551f)
        lineTo(23.329f, 16.9821f)
        lineTo(23.2088f, 17.0456f)
        lineTo(23.1488f, 17.0774f)
        lineTo(23.1488f, 15.6212f)
        lineTo(23.2088f, 15.5894f)
        lineTo(23.329f, 15.5259f)
        lineTo(23.5692f, 15.3989f)
        lineTo(24.0497f, 15.1449f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.0497f, 17.9662f)
        lineTo(24.0497f, 19.4224f)
        lineTo(23.5692f, 19.6764f)
        lineTo(23.329f, 19.8034f)
        lineTo(23.2088f, 19.8669f)
        lineTo(23.1488f, 19.8987f)
        lineTo(23.1488f, 18.4425f)
        lineTo(23.2088f, 18.4107f)
        lineTo(23.329f, 18.3472f)
        lineTo(23.5692f, 18.2202f)
        lineTo(24.0497f, 17.9662f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(22.1688f, 13.2638f)
        verticalLineTo(14.72f)
        lineTo(21.6882f, 14.974f)
        lineTo(21.448f, 15.101f)
        lineTo(21.3278f, 15.1645f)
        lineTo(21.2678f, 15.1963f)
        lineTo(21.2678f, 13.7401f)
        lineTo(21.3278f, 13.7083f)
        lineTo(21.448f, 13.6448f)
        lineTo(21.6882f, 13.5178f)
        lineTo(22.1688f, 13.2638f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(22.1688f, 16.0854f)
        lineTo(22.1688f, 17.5416f)
        lineTo(21.6882f, 17.7956f)
        lineTo(21.448f, 17.9226f)
        lineTo(21.3278f, 17.9861f)
        lineTo(21.2678f, 18.0178f)
        lineTo(21.2678f, 16.5616f)
        lineTo(21.3278f, 16.5299f)
        lineTo(21.448f, 16.4664f)
        lineTo(21.6882f, 16.3394f)
        lineTo(22.1688f, 16.0854f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(22.1688f, 18.9069f)
        lineTo(22.1688f, 20.3631f)
        lineTo(21.6882f, 20.6171f)
        lineTo(21.448f, 20.7441f)
        lineTo(21.3278f, 20.8076f)
        lineTo(21.2678f, 20.8394f)
        lineTo(21.2678f, 19.3832f)
        lineTo(21.3278f, 19.3514f)
        lineTo(21.448f, 19.2879f)
        lineTo(21.6882f, 19.1609f)
        lineTo(22.1688f, 18.9069f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(20.2878f, 14.2045f)
        lineTo(20.2878f, 15.6607f)
        lineTo(19.8072f, 15.9147f)
        lineTo(19.567f, 16.0417f)
        lineTo(19.4469f, 16.1052f)
        lineTo(19.3868f, 16.137f)
        lineTo(19.3868f, 14.6808f)
        lineTo(19.4469f, 14.649f)
        lineTo(19.567f, 14.5855f)
        lineTo(19.8072f, 14.4585f)
        lineTo(20.2878f, 14.2045f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(20.2878f, 17.0258f)
        lineTo(20.2878f, 18.482f)
        lineTo(19.8072f, 18.736f)
        lineTo(19.567f, 18.863f)
        lineTo(19.4469f, 18.9265f)
        lineTo(19.3868f, 18.9583f)
        lineTo(19.3868f, 17.5021f)
        lineTo(19.4469f, 17.4703f)
        lineTo(19.567f, 17.4068f)
        lineTo(19.8072f, 17.2798f)
        lineTo(20.2878f, 17.0258f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(20.2878f, 19.8471f)
        lineTo(20.2878f, 21.3033f)
        lineTo(19.8072f, 21.5573f)
        lineTo(19.567f, 21.6843f)
        lineTo(19.4469f, 21.7478f)
        lineTo(19.3868f, 21.7795f)
        lineTo(19.3868f, 20.3233f)
        lineTo(19.4469f, 20.2916f)
        lineTo(19.567f, 20.2281f)
        lineTo(19.8072f, 20.1011f)
        lineTo(20.2878f, 19.8471f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(18.4069f, 15.1449f)
        lineTo(18.4069f, 16.6011f)
        lineTo(17.9264f, 16.8551f)
        lineTo(17.6861f, 16.9821f)
        lineTo(17.566f, 17.0456f)
        lineTo(17.5059f, 17.0774f)
        lineTo(17.5059f, 15.6212f)
        lineTo(17.566f, 15.5894f)
        lineTo(17.6861f, 15.5259f)
        lineTo(17.9264f, 15.3989f)
        lineTo(18.4069f, 15.1449f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(18.4069f, 17.9662f)
        lineTo(18.4069f, 19.4224f)
        lineTo(17.9264f, 19.6764f)
        lineTo(17.6861f, 19.8034f)
        lineTo(17.566f, 19.8669f)
        lineTo(17.5059f, 19.8987f)
        lineTo(17.5059f, 18.4425f)
        lineTo(17.566f, 18.4107f)
        lineTo(17.6861f, 18.3472f)
        lineTo(17.9264f, 18.2202f)
        lineTo(18.4069f, 17.9662f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(18.4069f, 20.7878f)
        lineTo(18.4069f, 22.244f)
        lineTo(17.9264f, 22.498f)
        lineTo(17.6861f, 22.625f)
        lineTo(17.566f, 22.6885f)
        lineTo(17.5059f, 22.7202f)
        lineTo(17.5059f, 21.264f)
        lineTo(17.566f, 21.2323f)
        lineTo(17.6861f, 21.1688f)
        lineTo(17.9264f, 21.0418f)
        lineTo(18.4069f, 20.7878f)
        close()
      }
      group {
        path(
          fill = SolidColor(Color.Black),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(9.5862f, 22.6273f)
          lineTo(9.5862f, 26.0397f)
          lineTo(10.7122f, 26.6349f)
          lineTo(11.2752f, 26.9325f)
          lineTo(11.5567f, 27.0813f)
          lineTo(11.6974f, 27.1557f)
          lineTo(11.6974f, 23.7433f)
          lineTo(11.5567f, 23.6689f)
          lineTo(11.2752f, 23.5201f)
          lineTo(10.7122f, 23.2225f)
          lineTo(9.5862f, 22.6273f)
          close()
        }
        path(
          fill = SolidColor(TakColors.Ash),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(16.3333f, 21.8891f)
          lineTo(9.2311f, 26.3335f)
          verticalLineTo(19.2224f)
          lineTo(16.3333f, 21.8891f)
          close()
        }
      }
    }
      .build()
    return nullableIcons!!
  }

private var nullableIcons: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.ThreeDimensionalMap)
