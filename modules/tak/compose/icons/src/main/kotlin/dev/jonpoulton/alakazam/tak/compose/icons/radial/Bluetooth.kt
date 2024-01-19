package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.Bluetooth: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Bluetooth",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color.White),
        strokeLineWidth = 1.5f,
        strokeLineCap = Round,
        strokeLineJoin = StrokeJoin.Companion.Round,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(16.8008f, 17.345f)
        verticalLineTo(6.5f)
        lineTo(22.8538f, 12.553f)
        lineTo(16.8008f, 17.345f)
        close()
        moveTo(16.8008f, 17.345f)
        verticalLineTo(28.19f)
        lineTo(22.8538f, 22.137f)
        lineTo(16.8008f, 17.345f)
        close()
        moveTo(16.8008f, 17.345f)
        lineTo(11f, 11.5442f)
        moveTo(16.8008f, 17.345f)
        lineTo(11f, 23.1458f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.Bluetooth)
