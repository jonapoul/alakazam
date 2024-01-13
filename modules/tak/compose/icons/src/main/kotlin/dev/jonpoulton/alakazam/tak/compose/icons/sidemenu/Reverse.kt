package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.Reverse: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Reverse",
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
        pathFillType = NonZero,
      ) {
        moveTo(23.7973f, 6.5363f)
        curveTo(23.9517f, 6.4721f, 24.1331f, 6.4944f, 24.2626f, 6.5927f)
        lineTo(29.9314f, 10.9027f)
        curveTo(30.0295f, 10.9775f, 30.0858f, 11.0868f, 30.0858f, 11.202f)
        curveTo(30.0858f, 11.3172f, 30.0296f, 11.4265f, 29.9314f, 11.5013f)
        lineTo(24.2626f, 15.8113f)
        curveTo(24.1823f, 15.872f, 24.0821f, 15.9037f, 23.9809f, 15.9037f)
        curveTo(23.9185f, 15.9037f, 23.8562f, 15.892f, 23.7973f, 15.8673f)
        curveTo(23.6434f, 15.803f, 23.5448f, 15.6647f, 23.5448f, 15.5119f)
        lineTo(23.5438f, 13.21f)
        lineTo(6.3941f, 13.2109f)
        curveTo(5.624f, 13.2109f, 5.0073f, 12.2294f, 5.0939f, 11.0743f)
        lineTo(5.1112f, 10.9082f)
        curveTo(5.2315f, 9.9969f, 5.8128f, 9.3709f, 6.4455f, 9.3709f)
        lineTo(23.5438f, 9.37f)
        lineTo(23.5448f, 6.8921f)
        curveTo(23.5448f, 6.7647f, 23.6133f, 6.6475f, 23.7251f, 6.5745f)
        lineTo(23.7973f, 6.5363f)
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
        moveTo(10.8232f, 20.9928f)
        curveTo(10.9527f, 20.8944f, 11.1341f, 20.8721f, 11.2885f, 20.9363f)
        curveTo(11.4425f, 21.0006f, 11.541f, 21.1389f, 11.541f, 21.2917f)
        lineTo(11.541f, 23.967f)
        lineTo(28.6403f, 23.967f)
        curveTo(29.233f, 23.967f, 29.781f, 24.5172f, 29.9467f, 25.3369f)
        lineTo(29.9746f, 25.5043f)
        curveTo(30.1369f, 26.7299f, 29.4985f, 27.807f, 28.6917f, 27.807f)
        lineTo(11.541f, 27.807f)
        lineTo(11.541f, 29.9115f)
        curveTo(11.541f, 30.0388f, 11.4726f, 30.1561f, 11.3607f, 30.2289f)
        lineTo(11.2885f, 30.2669f)
        curveTo(11.2297f, 30.2916f, 11.1673f, 30.3033f, 11.1049f, 30.3033f)
        curveTo(11.0037f, 30.3033f, 10.9034f, 30.2716f, 10.8232f, 30.2109f)
        lineTo(5.1544f, 25.9009f)
        curveTo(5.0563f, 25.8261f, 5f, 25.7168f, 5f, 25.6016f)
        curveTo(5f, 25.4864f, 5.0563f, 25.3771f, 5.1544f, 25.3027f)
        lineTo(10.8232f, 20.9928f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
