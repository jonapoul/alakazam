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

public val SideMenuTakIcons.Delete: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Delete",
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
          moveTo(23f, 27.5868f)
          curveTo(23f, 28.0909f, 22.553f, 28.5f, 22f, 28.5f)
          curveTo(21.448f, 28.5f, 21f, 28.0909f, 21f, 27.5868f)
          verticalLineTo(16.4132f)
          curveTo(21f, 15.9082f, 21.448f, 15.5f, 22f, 15.5f)
          curveTo(22.553f, 15.5f, 23f, 15.9082f, 23f, 16.4132f)
          verticalLineTo(27.5868f)
          close()
          moveTo(19f, 27.5868f)
          curveTo(19f, 28.0909f, 18.553f, 28.5f, 18f, 28.5f)
          curveTo(17.449f, 28.5f, 17f, 28.0909f, 17f, 27.5868f)
          verticalLineTo(16.4132f)
          curveTo(17f, 15.9082f, 17.449f, 15.5f, 18f, 15.5f)
          curveTo(18.553f, 15.5f, 19f, 15.9082f, 19f, 16.4132f)
          verticalLineTo(27.5868f)
          close()
          moveTo(15f, 27.5868f)
          curveTo(15f, 28.0909f, 14.551f, 28.5f, 14f, 28.5f)
          curveTo(13.447f, 28.5f, 13f, 28.0909f, 13f, 27.5868f)
          verticalLineTo(16.4132f)
          curveTo(13f, 15.9082f, 13.447f, 15.5f, 14f, 15.5f)
          curveTo(14.551f, 15.5f, 15f, 15.9082f, 15f, 16.4132f)
          verticalLineTo(27.5868f)
          close()
          moveTo(29.995f, 11.4226f)
          curveTo(29.943f, 10.786f, 29.505f, 10.2895f, 28.972f, 10.2895f)
          horizontalLineTo(23.334f)
          verticalLineTo(8.2422f)
          lineTo(23.328f, 8.1001f)
          curveTo(23.259f, 7.2049f, 22.541f, 6.5f, 21.668f, 6.5f)
          horizontalLineTo(14.334f)
          lineTo(14.198f, 6.5057f)
          curveTo(13.342f, 6.5786f, 12.667f, 7.329f, 12.667f, 8.2422f)
          lineTo(12.666f, 10.2895f)
          horizontalLineTo(7.03f)
          lineTo(6.924f, 10.2962f)
          curveTo(6.406f, 10.3606f, 6f, 10.8987f, 6f, 11.5524f)
          lineTo(6.006f, 11.6822f)
          curveTo(6.059f, 12.3188f, 6.496f, 12.8152f, 7.03f, 12.8152f)
          horizontalLineTo(8.768f)
          lineTo(10.27f, 29.0732f)
          lineTo(10.291f, 29.2125f)
          curveTo(10.44f, 29.9448f, 11.133f, 30.5f, 11.932f, 30.5f)
          horizontalLineTo(24.07f)
          lineTo(24.218f, 30.4934f)
          curveTo(25.001f, 30.4261f, 25.653f, 29.8255f, 25.734f, 29.0609f)
          lineTo(27.233f, 12.8152f)
          horizontalLineTo(28.973f)
          lineTo(29.077f, 12.8086f)
          curveTo(29.596f, 12.7442f, 30f, 12.2061f, 30f, 11.5524f)
          lineTo(29.995f, 11.4226f)
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
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Delete)
