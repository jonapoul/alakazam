package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

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
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

val ToolbarTakIcons.Info: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Info",
      defaultWidth = 40.0.dp,
      defaultHeight = 41.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 41.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(36.22f, 20.985f)
        curveTo(36.22f, 29.6752f, 29.1752f, 36.72f, 20.485f, 36.72f)
        verticalLineTo(38.22f)
        curveTo(30.0036f, 38.22f, 37.72f, 30.5036f, 37.72f, 20.985f)
        horizontalLineTo(36.22f)
        close()
        moveTo(20.485f, 36.72f)
        curveTo(11.7948f, 36.72f, 4.75f, 29.6752f, 4.75f, 20.985f)
        horizontalLineTo(3.25f)
        curveTo(3.25f, 30.5036f, 10.9664f, 38.22f, 20.485f, 38.22f)
        verticalLineTo(36.72f)
        close()
        moveTo(4.75f, 20.985f)
        curveTo(4.75f, 12.2948f, 11.7948f, 5.25f, 20.485f, 5.25f)
        verticalLineTo(3.75f)
        curveTo(10.9664f, 3.75f, 3.25f, 11.4664f, 3.25f, 20.985f)
        horizontalLineTo(4.75f)
        close()
        moveTo(20.485f, 5.25f)
        curveTo(29.1752f, 5.25f, 36.22f, 12.2948f, 36.22f, 20.985f)
        horizontalLineTo(37.72f)
        curveTo(37.72f, 11.4664f, 30.0036f, 3.75f, 20.485f, 3.75f)
        verticalLineTo(5.25f)
        close()
      }
      group {
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(18.4426f, 21.1583f)
          horizontalLineTo(19.4426f)
          lineTo(19.4426f, 20.1583f)
          horizontalLineTo(18.4426f)
          verticalLineTo(21.1583f)
          close()
          moveTo(18.4426f, 27.0276f)
          verticalLineTo(28.0276f)
          horizontalLineTo(19.4426f)
          verticalLineTo(27.0276f)
          horizontalLineTo(18.4426f)
          close()
          moveTo(23.3337f, 27.0276f)
          horizontalLineTo(22.3337f)
          verticalLineTo(28.0276f)
          horizontalLineTo(23.3337f)
          verticalLineTo(27.0276f)
          close()
          moveTo(23.3337f, 20.4282f)
          lineTo(22.3337f, 20.4152f)
          verticalLineTo(20.4282f)
          horizontalLineTo(23.3337f)
          close()
          moveTo(23.3339f, 20.4083f)
          lineTo(24.3339f, 20.4213f)
          verticalLineTo(20.4083f)
          horizontalLineTo(23.3339f)
          close()
          moveTo(22.8237f, 13.3326f)
          curveTo(22.8237f, 14.401f, 21.9576f, 15.2672f, 20.8891f, 15.2672f)
          verticalLineTo(17.2672f)
          curveTo(23.0621f, 17.2672f, 24.8237f, 15.5056f, 24.8237f, 13.3326f)
          horizontalLineTo(22.8237f)
          close()
          moveTo(20.8891f, 11.3979f)
          curveTo(21.9576f, 11.3979f, 22.8237f, 12.2641f, 22.8237f, 13.3326f)
          horizontalLineTo(24.8237f)
          curveTo(24.8237f, 11.1595f, 23.0621f, 9.398f, 20.8891f, 9.398f)
          verticalLineTo(11.3979f)
          close()
          moveTo(18.9545f, 13.3326f)
          curveTo(18.9545f, 12.2641f, 19.8206f, 11.3979f, 20.8891f, 11.3979f)
          verticalLineTo(9.398f)
          curveTo(18.7161f, 9.398f, 16.9545f, 11.1595f, 16.9545f, 13.3326f)
          horizontalLineTo(18.9545f)
          close()
          moveTo(20.8891f, 15.2672f)
          curveTo(19.8206f, 15.2672f, 18.9545f, 14.401f, 18.9545f, 13.3326f)
          horizontalLineTo(16.9545f)
          curveTo(16.9545f, 15.5056f, 18.7161f, 17.2672f, 20.8891f, 17.2672f)
          verticalLineTo(15.2672f)
          close()
          moveTo(17.9756f, 18.4845f)
          curveTo(17.9756f, 18.6226f, 17.8636f, 18.7345f, 17.7256f, 18.7345f)
          verticalLineTo(16.7345f)
          curveTo(16.7591f, 16.7345f, 15.9756f, 17.518f, 15.9756f, 18.4845f)
          horizontalLineTo(17.9756f)
          close()
          moveTo(17.9756f, 20.4083f)
          verticalLineTo(18.4845f)
          horizontalLineTo(15.9756f)
          verticalLineTo(20.4083f)
          horizontalLineTo(17.9756f)
          close()
          moveTo(17.7256f, 20.1583f)
          curveTo(17.8636f, 20.1583f, 17.9756f, 20.2702f, 17.9756f, 20.4083f)
          horizontalLineTo(15.9756f)
          curveTo(15.9756f, 21.3748f, 16.7591f, 22.1583f, 17.7256f, 22.1583f)
          verticalLineTo(20.1583f)
          close()
          moveTo(18.4426f, 20.1583f)
          horizontalLineTo(17.7256f)
          verticalLineTo(22.1583f)
          horizontalLineTo(18.4426f)
          verticalLineTo(20.1583f)
          close()
          moveTo(19.4426f, 27.0276f)
          lineTo(19.4426f, 21.1583f)
          horizontalLineTo(17.4426f)
          lineTo(17.4426f, 27.0276f)
          horizontalLineTo(19.4426f)
          close()
          moveTo(17.7255f, 28.0276f)
          horizontalLineTo(18.4426f)
          verticalLineTo(26.0276f)
          horizontalLineTo(17.7255f)
          verticalLineTo(28.0276f)
          close()
          moveTo(17.9755f, 27.7776f)
          curveTo(17.9755f, 27.9156f, 17.8635f, 28.0276f, 17.7255f, 28.0276f)
          verticalLineTo(26.0276f)
          curveTo(16.759f, 26.0276f, 15.9755f, 26.8111f, 15.9755f, 27.7776f)
          horizontalLineTo(17.9755f)
          close()
          moveTo(17.9755f, 29.7013f)
          verticalLineTo(27.7776f)
          horizontalLineTo(15.9755f)
          verticalLineTo(29.7013f)
          horizontalLineTo(17.9755f)
          close()
          moveTo(17.7255f, 29.4513f)
          curveTo(17.8635f, 29.4513f, 17.9755f, 29.5632f, 17.9755f, 29.7013f)
          horizontalLineTo(15.9755f)
          curveTo(15.9755f, 30.6678f, 16.759f, 31.4513f, 17.7255f, 31.4513f)
          verticalLineTo(29.4513f)
          close()
          moveTo(24.0511f, 29.4513f)
          horizontalLineTo(17.7255f)
          verticalLineTo(31.4513f)
          horizontalLineTo(24.0511f)
          verticalLineTo(29.4513f)
          close()
          moveTo(23.8011f, 29.7013f)
          curveTo(23.8011f, 29.5632f, 23.9131f, 29.4513f, 24.0511f, 29.4513f)
          verticalLineTo(31.4513f)
          curveTo(25.0176f, 31.4513f, 25.8011f, 30.6678f, 25.8011f, 29.7013f)
          horizontalLineTo(23.8011f)
          close()
          moveTo(23.8011f, 27.7776f)
          verticalLineTo(29.7013f)
          horizontalLineTo(25.8011f)
          verticalLineTo(27.7776f)
          horizontalLineTo(23.8011f)
          close()
          moveTo(24.0511f, 28.0276f)
          curveTo(23.9131f, 28.0276f, 23.8011f, 27.9156f, 23.8011f, 27.7776f)
          horizontalLineTo(25.8011f)
          curveTo(25.8011f, 26.8111f, 25.0176f, 26.0276f, 24.0511f, 26.0276f)
          verticalLineTo(28.0276f)
          close()
          moveTo(23.3337f, 28.0276f)
          horizontalLineTo(24.0511f)
          verticalLineTo(26.0276f)
          horizontalLineTo(23.3337f)
          verticalLineTo(28.0276f)
          close()
          moveTo(22.3337f, 20.4282f)
          lineTo(22.3337f, 27.0276f)
          horizontalLineTo(24.3337f)
          lineTo(24.3337f, 20.4282f)
          horizontalLineTo(22.3337f)
          close()
          moveTo(22.334f, 20.3952f)
          lineTo(22.3338f, 20.4152f)
          lineTo(24.3336f, 20.4412f)
          lineTo(24.3339f, 20.4213f)
          lineTo(22.334f, 20.3952f)
          close()
          moveTo(22.3339f, 18.4845f)
          verticalLineTo(20.4083f)
          horizontalLineTo(24.3339f)
          verticalLineTo(18.4845f)
          horizontalLineTo(22.3339f)
          close()
          moveTo(22.5839f, 18.7345f)
          curveTo(22.4459f, 18.7345f, 22.3339f, 18.6226f, 22.3339f, 18.4845f)
          horizontalLineTo(24.3339f)
          curveTo(24.3339f, 17.518f, 23.5504f, 16.7345f, 22.5839f, 16.7345f)
          verticalLineTo(18.7345f)
          close()
          moveTo(17.7256f, 18.7345f)
          horizontalLineTo(22.5839f)
          verticalLineTo(16.7345f)
          horizontalLineTo(17.7256f)
          verticalLineTo(18.7345f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
