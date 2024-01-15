package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.Hostile: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Hostile",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Bronze),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(17.2929f, 5.7071f)
        curveTo(17.6834f, 5.3166f, 18.3166f, 5.3166f, 18.7071f, 5.7071f)
        lineTo(31.447f, 18.447f)
        curveTo(31.8375f, 18.8375f, 31.8375f, 19.4707f, 31.447f, 19.8612f)
        lineTo(18.7191f, 32.5891f)
        curveTo(18.3286f, 32.9797f, 17.6954f, 32.9797f, 17.3049f, 32.5891f)
        lineTo(4.565f, 19.8492f)
        curveTo(4.1744f, 19.4587f, 4.1744f, 18.8256f, 4.565f, 18.435f)
        lineTo(17.2929f, 5.7071f)
        close()
        moveTo(18.0007f, 6.6645f)
        lineTo(5.5223f, 19.1428f)
        lineTo(18.0113f, 31.6318f)
        lineTo(30.4896f, 19.1534f)
        lineTo(18.0007f, 6.6645f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Hostile)
