package dev.jonpoulton.alakazam.tak.compose.icons.navigation

import androidx.compose.runtime.Composable
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
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.NavigationTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val NavigationTakIcons.BloodhoundNavUnlit: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "BloodhoundNavUnlit",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Ash),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(2.0f, 1.25f)
        lineTo(30.0f, 1.25f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 31.25f, 2.5f)
        lineTo(31.25f, 30.5f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 30.0f, 31.75f)
        lineTo(2.0f, 31.75f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 0.75f, 30.5f)
        lineTo(0.75f, 2.5f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 2.0f, 1.25f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Stone),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(2.0f, 1.25f)
        lineTo(30.0f, 1.25f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 31.25f, 2.5f)
        lineTo(31.25f, 30.5f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 30.0f, 31.75f)
        lineTo(2.0f, 31.75f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 0.75f, 30.5f)
        lineTo(0.75f, 2.5f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 2.0f, 1.25f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Stone),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(7.6923f, 16.0f)
        curveTo(7.6923f, 11.4191f, 11.4191f, 7.6923f, 16.0f, 7.6923f)
        curveTo(20.5808f, 7.6923f, 24.3076f, 11.4191f, 24.3076f, 16.0f)
        curveTo(24.3076f, 20.5808f, 20.5808f, 24.3076f, 16.0f, 24.3076f)
        curveTo(11.4191f, 24.3076f, 7.6923f, 20.5808f, 7.6923f, 16.0f)
        close()
        moveTo(18.7757f, 18.8673f)
        curveTo(18.848f, 18.811f, 18.9062f, 18.7334f, 18.9396f, 18.6368f)
        lineTo(21.2023f, 12.1035f)
        curveTo(21.4754f, 11.3147f, 20.7191f, 10.5582f, 19.9302f, 10.8312f)
        lineTo(13.3958f, 13.0929f)
        curveTo(13.2992f, 13.1263f, 13.2215f, 13.1845f, 13.1652f, 13.2568f)
        curveTo(13.0929f, 13.3131f, 13.0347f, 13.3908f, 13.0013f, 13.4874f)
        lineTo(10.7396f, 20.0218f)
        curveTo(10.4666f, 20.8106f, 11.2231f, 21.567f, 12.0119f, 21.2938f)
        lineTo(18.5453f, 19.0312f)
        curveTo(18.6418f, 18.9978f, 18.7195f, 18.9396f, 18.7757f, 18.8673f)
        close()
        moveTo(16.7423f, 16.7461f)
        curveTo(16.3517f, 17.1367f, 15.7187f, 17.1367f, 15.3281f, 16.7461f)
        curveTo(14.937f, 16.3551f, 14.9375f, 15.7225f, 15.3281f, 15.3319f)
        curveTo(15.7191f, 14.9409f, 16.3512f, 14.9409f, 16.7423f, 15.3319f)
        curveTo(17.1329f, 15.7225f, 17.1333f, 16.3551f, 16.7423f, 16.7461f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Stone),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(16.0f, 4.0f)
        curveTo(19.2053f, 4.0f, 22.2188f, 5.2482f, 24.4853f, 7.5147f)
        curveTo(26.7518f, 9.7812f, 28.0f, 12.7947f, 28.0f, 16.0f)
        curveTo(28.0f, 19.2053f, 26.7518f, 22.2188f, 24.4853f, 24.4853f)
        curveTo(22.2188f, 26.7518f, 19.2053f, 28.0f, 16.0f, 28.0f)
        curveTo(12.7947f, 28.0f, 9.7812f, 26.7518f, 7.5147f, 24.4853f)
        curveTo(5.2482f, 22.2188f, 4.0f, 19.2053f, 4.0f, 16.0f)
        curveTo(4.0f, 12.7947f, 5.2482f, 9.7812f, 7.5147f, 7.5147f)
        curveTo(9.7812f, 5.2482f, 12.7947f, 4.0f, 16.0f, 4.0f)
        close()
        moveTo(5.8461f, 16.0f)
        curveTo(5.8461f, 21.5989f, 10.4011f, 26.1538f, 16.0f, 26.1538f)
        curveTo(21.5989f, 26.1538f, 26.1538f, 21.5989f, 26.1538f, 16.0f)
        curveTo(26.1538f, 10.4011f, 21.5989f, 5.8461f, 16.0f, 5.8461f)
        curveTo(10.4011f, 5.8461f, 5.8461f, 10.4011f, 5.8461f, 16.0f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = NavigationTakIcons.BloodhoundNavUnlit)
