package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.Remarks: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Remarks",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      group {
        path(
          fill = SolidColor(TakColors.Sand),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = EvenOdd,
        ) {
          moveTo(20.7698f, 29.5764f)
          verticalLineTo(21.2692f)
          horizontalLineTo(29.0771f)
          lineTo(20.7698f, 29.5764f)
          close()
          moveTo(14.7916f, 22.3601f)
          horizontalLineTo(10.332f)
          curveTo(9.7287f, 22.3601f, 9.2411f, 21.8724f, 9.2411f, 21.2692f)
          curveTo(9.2411f, 20.667f, 9.7287f, 20.1782f, 10.332f, 20.1782f)
          horizontalLineTo(14.7916f)
          curveTo(15.3938f, 20.1782f, 15.8825f, 20.667f, 15.8825f, 21.2692f)
          curveTo(15.8825f, 21.8724f, 15.3938f, 22.3601f, 14.7916f, 22.3601f)
          close()
          moveTo(10.332f, 15.1252f)
          horizontalLineTo(25.104f)
          curveTo(25.7051f, 15.1252f, 26.1949f, 15.6128f, 26.1949f, 16.2161f)
          curveTo(26.1949f, 16.8182f, 25.7051f, 17.307f, 25.104f, 17.307f)
          horizontalLineTo(10.332f)
          curveTo(9.7287f, 17.307f, 9.2411f, 16.8182f, 9.2411f, 16.2161f)
          curveTo(9.2411f, 15.6128f, 9.7287f, 15.1252f, 10.332f, 15.1252f)
          close()
          moveTo(10.332f, 10.1681f)
          horizontalLineTo(22.5884f)
          curveTo(23.1905f, 10.1681f, 23.6793f, 10.6557f, 23.6793f, 11.259f)
          curveTo(23.6793f, 11.8612f, 23.1905f, 12.3499f, 22.5884f, 12.3499f)
          horizontalLineTo(10.332f)
          curveTo(9.7287f, 12.3499f, 9.2411f, 11.8612f, 9.2411f, 11.259f)
          curveTo(9.2411f, 10.6557f, 9.7287f, 10.1681f, 10.332f, 10.1681f)
          close()
          moveTo(29.2495f, 6.5004f)
          horizontalLineTo(6.7495f)
          curveTo(6.3371f, 6.5004f, 6f, 6.8353f, 6f, 7.2499f)
          verticalLineTo(29.7499f)
          curveTo(6f, 30.1633f, 6.3371f, 30.5004f, 6.7495f, 30.5004f)
          horizontalLineTo(21.7495f)
          curveTo(21.948f, 30.5004f, 22.14f, 30.4208f, 22.2807f, 30.2812f)
          lineTo(29.7807f, 22.7812f)
          curveTo(29.9215f, 22.6404f, 30f, 22.4484f, 30f, 22.2499f)
          verticalLineTo(7.2499f)
          curveTo(30f, 6.8353f, 29.6629f, 6.5004f, 29.2495f, 6.5004f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Remarks)
