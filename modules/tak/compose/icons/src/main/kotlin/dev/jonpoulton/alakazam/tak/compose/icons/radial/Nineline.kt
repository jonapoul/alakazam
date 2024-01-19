package dev.jonpoulton.alakazam.tak.compose.icons.radial

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.Nineline: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Nineline",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(27.1954f, 26.0053f)
        curveTo(22.3983f, 31.8248f, 13.7915f, 32.6549f, 7.972f, 27.8587f)
        curveTo(2.1507f, 23.0626f, 1.3216f, 14.4558f, 6.1177f, 8.6354f)
        curveTo(10.9138f, 2.815f, 19.5206f, 1.9849f, 25.341f, 6.7811f)
        curveTo(31.1614f, 11.5772f, 31.9915f, 20.1849f, 27.1954f, 26.0053f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(16.6566f, 24.071f)
        lineTo(18.575f, 27.3948f)
        lineTo(20.4944f, 30.7187f)
        horizontalLineTo(16.6566f)
        horizontalLineTo(12.8179f)
        lineTo(14.7372f, 27.3948f)
        lineTo(16.6566f, 24.071f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(16.6566f, 10.1468f)
        lineTo(14.7372f, 6.823f)
        lineTo(12.8179f, 3.5f)
        horizontalLineTo(16.6566f)
        horizontalLineTo(20.4944f)
        lineTo(18.575f, 6.823f)
        lineTo(16.6566f, 10.1468f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(9.6945f, 17.1089f)
        lineTo(6.3697f, 19.0283f)
        lineTo(3.0468f, 20.9467f)
        verticalLineTo(17.1089f)
        verticalLineTo(13.2711f)
        lineTo(6.3697f, 15.1896f)
        lineTo(9.6945f, 17.1089f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(23.6178f, 17.1089f)
        lineTo(26.9426f, 15.1896f)
        lineTo(30.2655f, 13.2711f)
        verticalLineTo(17.1089f)
        verticalLineTo(20.9467f)
        lineTo(26.9426f, 19.0283f)
        lineTo(23.6178f, 17.1089f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(3.0464f, 17.1089f)
        horizontalLineTo(30.0989f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(16.5728f, 3.5826f)
        verticalLineTo(30.6351f)
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(18.8423f, 17.1089f)
        curveTo(18.8423f, 18.3626f, 17.8262f, 19.3787f, 16.5725f, 19.3787f)
        curveTo(15.3197f, 19.3787f, 14.3036f, 18.3626f, 14.3036f, 17.1089f)
        curveTo(14.3036f, 15.8552f, 15.3197f, 14.8391f, 16.5725f, 14.8391f)
        curveTo(17.8262f, 14.8391f, 18.8423f, 15.8552f, 18.8423f, 17.1089f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.Nineline)
