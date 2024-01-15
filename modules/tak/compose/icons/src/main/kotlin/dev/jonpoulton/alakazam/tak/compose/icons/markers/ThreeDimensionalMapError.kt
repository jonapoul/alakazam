package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Square
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

public val MarkersTakIcons.ThreeDimensionalMapError: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "ThreeDimensionalMapError",
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
        moveTo(16.0f, 16.0f)
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
        moveTo(7.0889f, 9.0127f)
        lineTo(15.8884f, 4.3613f)
        lineTo(24.688f, 9.0127f)
        lineTo(15.8884f, 13.6641f)
        lineTo(7.0889f, 9.0127f)
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
        moveTo(24.7774f, 10.7906f)
        lineTo(24.7774f, 24.1239f)
        lineTo(20.3776f, 26.4496f)
        lineTo(18.1778f, 27.6125f)
        lineTo(17.0778f, 28.1939f)
        lineTo(16.5278f, 28.4846f)
        lineTo(16.5278f, 15.1513f)
        lineTo(17.0778f, 14.8606f)
        lineTo(18.1778f, 14.2792f)
        lineTo(20.3776f, 13.1163f)
        lineTo(24.7774f, 10.7906f)
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
        moveTo(6.9994f, 10.7906f)
        lineTo(6.9994f, 24.1239f)
        lineTo(11.3992f, 26.4496f)
        lineTo(13.5991f, 27.6125f)
        lineTo(14.699f, 28.1939f)
        lineTo(15.249f, 28.4846f)
        lineTo(15.249f, 15.1513f)
        lineTo(14.699f, 14.8606f)
        lineTo(13.5991f, 14.2792f)
        lineTo(11.3992f, 13.1163f)
        lineTo(6.9994f, 10.7906f)
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
        moveTo(7.7281f, 11.8237f)
        lineTo(7.7281f, 13.2799f)
        lineTo(8.2086f, 13.5339f)
        lineTo(8.4489f, 13.6609f)
        lineTo(8.569f, 13.7244f)
        lineTo(8.6291f, 13.7561f)
        lineTo(8.6291f, 12.2999f)
        lineTo(8.569f, 12.2682f)
        lineTo(8.4489f, 12.2047f)
        lineTo(8.2086f, 12.0777f)
        lineTo(7.7281f, 11.8237f)
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
        moveTo(7.7281f, 14.6449f)
        lineTo(7.7281f, 16.1011f)
        lineTo(8.2086f, 16.3551f)
        lineTo(8.4489f, 16.4821f)
        lineTo(8.569f, 16.5456f)
        lineTo(8.6291f, 16.5774f)
        lineTo(8.6291f, 15.1212f)
        lineTo(8.569f, 15.0894f)
        lineTo(8.4489f, 15.0259f)
        lineTo(8.2086f, 14.8989f)
        lineTo(7.7281f, 14.6449f)
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
        moveTo(7.7281f, 17.4662f)
        lineTo(7.7281f, 18.9224f)
        lineTo(8.2086f, 19.1764f)
        lineTo(8.4489f, 19.3034f)
        lineTo(8.569f, 19.3669f)
        lineTo(8.6291f, 19.3987f)
        lineTo(8.6291f, 17.9425f)
        lineTo(8.569f, 17.9107f)
        lineTo(8.4489f, 17.8472f)
        lineTo(8.2086f, 17.7202f)
        lineTo(7.7281f, 17.4662f)
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
        moveTo(9.609f, 12.7638f)
        lineTo(9.609f, 14.22f)
        lineTo(10.0895f, 14.474f)
        lineTo(10.3297f, 14.601f)
        lineTo(10.4499f, 14.6645f)
        lineTo(10.5099f, 14.6963f)
        lineTo(10.5099f, 13.2401f)
        lineTo(10.4499f, 13.2083f)
        lineTo(10.3297f, 13.1448f)
        lineTo(10.0895f, 13.0178f)
        lineTo(9.609f, 12.7638f)
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
        moveTo(9.609f, 15.5854f)
        lineTo(9.609f, 17.0416f)
        lineTo(10.0895f, 17.2956f)
        lineTo(10.3297f, 17.4226f)
        lineTo(10.4499f, 17.4861f)
        lineTo(10.5099f, 17.5178f)
        lineTo(10.5099f, 16.0616f)
        lineTo(10.4499f, 16.0299f)
        lineTo(10.3297f, 15.9664f)
        lineTo(10.0895f, 15.8394f)
        lineTo(9.609f, 15.5854f)
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
        moveTo(9.609f, 18.4069f)
        lineTo(9.609f, 19.8631f)
        lineTo(10.0895f, 20.1171f)
        lineTo(10.3297f, 20.2441f)
        lineTo(10.4499f, 20.3076f)
        lineTo(10.5099f, 20.3394f)
        lineTo(10.5099f, 18.8832f)
        lineTo(10.4499f, 18.8514f)
        lineTo(10.3297f, 18.7879f)
        lineTo(10.0895f, 18.6609f)
        lineTo(9.609f, 18.4069f)
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
        moveTo(11.4901f, 13.7045f)
        lineTo(11.4901f, 15.1607f)
        lineTo(11.9706f, 15.4147f)
        lineTo(12.2108f, 15.5417f)
        lineTo(12.331f, 15.6052f)
        lineTo(12.391f, 15.637f)
        lineTo(12.391f, 14.1808f)
        lineTo(12.331f, 14.149f)
        lineTo(12.2108f, 14.0855f)
        lineTo(11.9706f, 13.9585f)
        lineTo(11.4901f, 13.7045f)
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
        moveTo(11.4901f, 16.5258f)
        lineTo(11.4901f, 17.982f)
        lineTo(11.9706f, 18.236f)
        lineTo(12.2108f, 18.363f)
        lineTo(12.331f, 18.4265f)
        lineTo(12.391f, 18.4583f)
        lineTo(12.391f, 17.0021f)
        lineTo(12.331f, 16.9703f)
        lineTo(12.2108f, 16.9068f)
        lineTo(11.9706f, 16.7798f)
        lineTo(11.4901f, 16.5258f)
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
        moveTo(11.4901f, 19.3471f)
        lineTo(11.4901f, 20.8033f)
        lineTo(11.9706f, 21.0573f)
        lineTo(12.2108f, 21.1843f)
        lineTo(12.331f, 21.2478f)
        lineTo(12.391f, 21.2795f)
        lineTo(12.391f, 19.8233f)
        lineTo(12.331f, 19.7916f)
        lineTo(12.2108f, 19.7281f)
        lineTo(11.9706f, 19.6011f)
        lineTo(11.4901f, 19.3471f)
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
        moveTo(13.3709f, 14.6449f)
        verticalLineTo(16.1011f)
        lineTo(13.8514f, 16.3551f)
        lineTo(14.0917f, 16.4821f)
        lineTo(14.2118f, 16.5456f)
        lineTo(14.2719f, 16.5774f)
        lineTo(14.2719f, 15.1212f)
        lineTo(14.2118f, 15.0894f)
        lineTo(14.0917f, 15.0259f)
        lineTo(13.8514f, 14.8989f)
        lineTo(13.3709f, 14.6449f)
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
        moveTo(13.3709f, 17.4662f)
        lineTo(13.3709f, 18.9224f)
        lineTo(13.8514f, 19.1764f)
        lineTo(14.0917f, 19.3034f)
        lineTo(14.2118f, 19.3669f)
        lineTo(14.2719f, 19.3987f)
        lineTo(14.2719f, 17.9425f)
        lineTo(14.2118f, 17.9107f)
        lineTo(14.0917f, 17.8472f)
        lineTo(13.8514f, 17.7202f)
        lineTo(13.3709f, 17.4662f)
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
        moveTo(13.3709f, 20.2878f)
        verticalLineTo(21.744f)
        lineTo(13.8514f, 21.998f)
        lineTo(14.0917f, 22.125f)
        lineTo(14.2118f, 22.1885f)
        lineTo(14.2719f, 22.2202f)
        lineTo(14.2719f, 20.764f)
        lineTo(14.2118f, 20.7323f)
        lineTo(14.0917f, 20.6688f)
        lineTo(13.8514f, 20.5418f)
        lineTo(13.3709f, 20.2878f)
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
        moveTo(24.0497f, 11.8237f)
        lineTo(24.0497f, 13.2799f)
        lineTo(23.5692f, 13.5339f)
        lineTo(23.329f, 13.6609f)
        lineTo(23.2088f, 13.7244f)
        lineTo(23.1488f, 13.7561f)
        lineTo(23.1488f, 12.2999f)
        lineTo(23.2088f, 12.2682f)
        lineTo(23.329f, 12.2047f)
        lineTo(23.5692f, 12.0777f)
        lineTo(24.0497f, 11.8237f)
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
        moveTo(24.0497f, 14.6449f)
        verticalLineTo(16.1011f)
        lineTo(23.5692f, 16.3551f)
        lineTo(23.329f, 16.4821f)
        lineTo(23.2088f, 16.5456f)
        lineTo(23.1488f, 16.5774f)
        lineTo(23.1488f, 15.1212f)
        lineTo(23.2088f, 15.0894f)
        lineTo(23.329f, 15.0259f)
        lineTo(23.5692f, 14.8989f)
        lineTo(24.0497f, 14.6449f)
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
        moveTo(24.0497f, 17.4662f)
        lineTo(24.0497f, 18.9224f)
        lineTo(23.5692f, 19.1764f)
        lineTo(23.329f, 19.3034f)
        lineTo(23.2088f, 19.3669f)
        lineTo(23.1488f, 19.3987f)
        lineTo(23.1488f, 17.9425f)
        lineTo(23.2088f, 17.9107f)
        lineTo(23.329f, 17.8472f)
        lineTo(23.5692f, 17.7202f)
        lineTo(24.0497f, 17.4662f)
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
        moveTo(22.1686f, 12.7638f)
        verticalLineTo(14.22f)
        lineTo(21.6881f, 14.474f)
        lineTo(21.4478f, 14.601f)
        lineTo(21.3277f, 14.6645f)
        lineTo(21.2677f, 14.6963f)
        lineTo(21.2677f, 13.2401f)
        lineTo(21.3277f, 13.2083f)
        lineTo(21.4478f, 13.1448f)
        lineTo(21.6881f, 13.0178f)
        lineTo(22.1686f, 12.7638f)
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
        moveTo(22.1686f, 15.5854f)
        lineTo(22.1686f, 17.0416f)
        lineTo(21.6881f, 17.2956f)
        lineTo(21.4478f, 17.4226f)
        lineTo(21.3277f, 17.4861f)
        lineTo(21.2677f, 17.5178f)
        lineTo(21.2677f, 16.0616f)
        lineTo(21.3277f, 16.0299f)
        lineTo(21.4478f, 15.9664f)
        lineTo(21.6881f, 15.8394f)
        lineTo(22.1686f, 15.5854f)
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
        moveTo(22.1686f, 18.4069f)
        lineTo(22.1686f, 19.8631f)
        lineTo(21.6881f, 20.1171f)
        lineTo(21.4478f, 20.2441f)
        lineTo(21.3277f, 20.3076f)
        lineTo(21.2677f, 20.3394f)
        lineTo(21.2677f, 18.8832f)
        lineTo(21.3277f, 18.8514f)
        lineTo(21.4478f, 18.7879f)
        lineTo(21.6881f, 18.6609f)
        lineTo(22.1686f, 18.4069f)
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
        moveTo(20.2878f, 13.7045f)
        lineTo(20.2878f, 15.1607f)
        lineTo(19.8072f, 15.4147f)
        lineTo(19.567f, 15.5417f)
        lineTo(19.4469f, 15.6052f)
        lineTo(19.3868f, 15.637f)
        lineTo(19.3868f, 14.1808f)
        lineTo(19.4469f, 14.149f)
        lineTo(19.567f, 14.0855f)
        lineTo(19.8072f, 13.9585f)
        lineTo(20.2878f, 13.7045f)
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
        moveTo(20.2878f, 16.5258f)
        lineTo(20.2878f, 17.982f)
        lineTo(19.8072f, 18.236f)
        lineTo(19.567f, 18.363f)
        lineTo(19.4469f, 18.4265f)
        lineTo(19.3868f, 18.4583f)
        lineTo(19.3868f, 17.0021f)
        lineTo(19.4469f, 16.9703f)
        lineTo(19.567f, 16.9068f)
        lineTo(19.8072f, 16.7798f)
        lineTo(20.2878f, 16.5258f)
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
        moveTo(20.2878f, 19.3471f)
        lineTo(20.2878f, 20.8033f)
        lineTo(19.8072f, 21.0573f)
        lineTo(19.567f, 21.1843f)
        lineTo(19.4469f, 21.2478f)
        lineTo(19.3868f, 21.2795f)
        lineTo(19.3868f, 19.8233f)
        lineTo(19.4469f, 19.7916f)
        lineTo(19.567f, 19.7281f)
        lineTo(19.8072f, 19.6011f)
        lineTo(20.2878f, 19.3471f)
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
        moveTo(18.4069f, 14.6449f)
        lineTo(18.4069f, 16.1011f)
        lineTo(17.9264f, 16.3551f)
        lineTo(17.6861f, 16.4821f)
        lineTo(17.566f, 16.5456f)
        lineTo(17.5059f, 16.5774f)
        lineTo(17.5059f, 15.1212f)
        lineTo(17.566f, 15.0894f)
        lineTo(17.6861f, 15.0259f)
        lineTo(17.9264f, 14.8989f)
        lineTo(18.4069f, 14.6449f)
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
        moveTo(18.4069f, 17.4662f)
        lineTo(18.4069f, 18.9224f)
        lineTo(17.9264f, 19.1764f)
        lineTo(17.6861f, 19.3034f)
        lineTo(17.566f, 19.3669f)
        lineTo(17.5059f, 19.3987f)
        lineTo(17.5059f, 17.9425f)
        lineTo(17.566f, 17.9107f)
        lineTo(17.6861f, 17.8472f)
        lineTo(17.9264f, 17.7202f)
        lineTo(18.4069f, 17.4662f)
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
        moveTo(18.4069f, 20.2878f)
        lineTo(18.4069f, 21.744f)
        lineTo(17.9264f, 21.998f)
        lineTo(17.6861f, 22.125f)
        lineTo(17.566f, 22.1885f)
        lineTo(17.5059f, 22.2202f)
        lineTo(17.5059f, 20.764f)
        lineTo(17.566f, 20.7323f)
        lineTo(17.6861f, 20.6688f)
        lineTo(17.9264f, 20.5418f)
        lineTo(18.4069f, 20.2878f)
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
          moveTo(9.586f, 22.1273f)
          lineTo(9.586f, 25.5397f)
          lineTo(10.712f, 26.1349f)
          lineTo(11.275f, 26.4325f)
          lineTo(11.5565f, 26.5813f)
          lineTo(11.6973f, 26.6557f)
          lineTo(11.6973f, 23.2433f)
          lineTo(11.5565f, 23.1689f)
          lineTo(11.275f, 23.0201f)
          lineTo(10.712f, 22.7225f)
          lineTo(9.586f, 22.1273f)
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
          moveTo(16.3332f, 21.3891f)
          lineTo(9.231f, 25.8335f)
          verticalLineTo(18.7224f)
          lineTo(16.3332f, 21.3891f)
          close()
        }
        path(
          fill = SolidColor(Color.Transparent),
          stroke = SolidColor(Color(0xFFD90F0F)),
          strokeLineWidth = 2.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(24.0001f, 24.0001f)
          moveToRelative(-4.8604f, 4.0784f)
          arcToRelative(6.3448f, 6.3448f, 95.0f, true, true, 9.7208f, -8.1568f)
          arcToRelative(6.3448f, 6.3448f, 95.0f, true, true, -9.7208f, 8.1568f)
        }
        path(
          fill = SolidColor(Color.Transparent),
          stroke = SolidColor(Color(0xFFD90F0F)),
          strokeLineWidth = 2.0f,
          strokeLineCap = Square,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(20.4875f, 19.385f)
          lineTo(27.5464f, 28.2266f)
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.ThreeDimensionalMapError)
