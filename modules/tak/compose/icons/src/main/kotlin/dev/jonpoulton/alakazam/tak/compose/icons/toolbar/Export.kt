package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.Export: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Export",
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
        pathFillType = EvenOdd,
      ) {
        moveTo(12.0502f, 14.4102f)
        horizontalLineTo(4.3652f)
        curveTo(3.9512f, 14.4102f, 3.6152f, 14.7462f, 3.6152f, 15.1602f)
        verticalLineTo(35.7502f)
        curveTo(3.6152f, 36.1642f, 3.9512f, 36.5002f, 4.3652f, 36.5002f)
        horizontalLineTo(24.9552f)
        curveTo(25.3692f, 36.5002f, 25.7052f, 36.1642f, 25.7052f, 35.7502f)
        verticalLineTo(28.0352f)
        curveTo(25.7052f, 27.6212f, 25.3692f, 27.2852f, 24.9552f, 27.2852f)
        curveTo(24.5412f, 27.2852f, 24.2052f, 27.6212f, 24.2052f, 28.0352f)
        verticalLineTo(35.0002f)
        horizontalLineTo(5.1152f)
        verticalLineTo(15.9102f)
        horizontalLineTo(12.0502f)
        curveTo(12.4642f, 15.9102f, 12.8002f, 15.5742f, 12.8002f, 15.1602f)
        curveTo(12.8002f, 14.7462f, 12.4642f, 14.4102f, 12.0502f, 14.4102f)
        close()
        moveTo(36.0002f, 4.8643f)
        curveTo(36.0002f, 4.4503f, 35.6642f, 4.1143f, 35.2502f, 4.1143f)
        horizontalLineTo(14.6602f)
        curveTo(14.2462f, 4.1143f, 13.9102f, 4.4503f, 13.9102f, 4.8643f)
        verticalLineTo(18.9353f)
        curveTo(13.9102f, 19.3493f, 14.2462f, 19.6853f, 14.6602f, 19.6853f)
        curveTo(15.0742f, 19.6853f, 15.4102f, 19.3493f, 15.4102f, 18.9353f)
        verticalLineTo(5.6143f)
        horizontalLineTo(34.5002f)
        verticalLineTo(24.7053f)
        horizontalLineTo(20.8802f)
        curveTo(20.4662f, 24.7053f, 20.1302f, 25.0413f, 20.1302f, 25.4553f)
        curveTo(20.1302f, 25.8693f, 20.4662f, 26.2053f, 20.8802f, 26.2053f)
        horizontalLineTo(35.2502f)
        curveTo(35.6642f, 26.2053f, 36.0002f, 25.8693f, 36.0002f, 25.4553f)
        verticalLineTo(4.8643f)
        close()
        moveTo(27.2236f, 11.7657f)
        curveTo(27.4176f, 11.7657f, 27.6056f, 11.8407f, 27.7446f, 11.9767f)
        curveTo(27.8946f, 12.1207f, 27.9766f, 12.3207f, 27.9736f, 12.5287f)
        lineTo(27.8276f, 21.3977f)
        curveTo(27.8216f, 21.8067f, 27.4876f, 22.1347f, 27.0776f, 22.1347f)
        horizontalLineTo(27.0656f)
        curveTo(26.6516f, 22.1277f, 26.3216f, 21.7867f, 26.3276f, 21.3717f)
        lineTo(26.4387f, 14.6331f)
        lineTo(10.593f, 30.4797f)
        curveTo(10.3f, 30.7727f, 9.825f, 30.7727f, 9.532f, 30.4797f)
        curveTo(9.239f, 30.1867f, 9.239f, 29.7127f, 9.532f, 29.4197f)
        lineTo(25.6065f, 13.3453f)
        lineTo(18.6626f, 13.6827f)
        curveTo(18.2786f, 13.7157f, 17.8986f, 13.3837f, 17.8776f, 12.9697f)
        curveTo(17.8576f, 12.5567f, 18.1766f, 12.2047f, 18.5906f, 12.1847f)
        lineTo(27.1876f, 11.7667f)
        curveTo(27.1996f, 11.7657f, 27.2116f, 11.7657f, 27.2236f, 11.7657f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Export)
