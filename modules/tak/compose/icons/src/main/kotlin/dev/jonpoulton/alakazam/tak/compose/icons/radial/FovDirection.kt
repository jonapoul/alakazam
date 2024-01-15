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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RadialTakIcons.FovDirection: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "FovDirection",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(9.6748f, 5.0269f)
        lineTo(9.1966f, 5.1277f)
        lineTo(4f, 29.7685f)
        lineTo(28.6399f, 24.5719f)
        lineTo(28.7407f, 24.0937f)
        curveTo(31.5355f, 10.8409f, 22.9273f, 2.2322f, 9.6748f, 5.0269f)
        close()
        moveTo(27.3678f, 23.3067f)
        lineTo(5.9428f, 27.8247f)
        lineTo(10.4608f, 6.3987f)
        lineTo(10.7103f, 6.3526f)
        curveTo(22.2387f, 4.2753f, 29.4923f, 11.5294f, 27.415f, 23.0581f)
        lineTo(27.3678f, 23.3067f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(16.9951f, 16f)
        lineTo(18.0434f, 17.0728f)
        lineTo(5.4956f, 29.3335f)
        lineTo(4.4473f, 28.2607f)
        lineTo(16.9951f, 16f)
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
        moveTo(20.9287f, 13.2053f)
        lineTo(18.0433f, 19.8617f)
        lineTo(17.2648f, 16.7855f)
        lineTo(14.2075f, 15.9368f)
        lineTo(20.9287f, 13.2053f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.FovDirection)
