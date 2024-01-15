package dev.jonpoulton.alakazam.tak.compose.icons.markers

import androidx.compose.runtime.Composable
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
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val MarkersTakIcons.Self: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Self",
      defaultWidth = 33.0.dp,
      defaultHeight = 36.0.dp,
      viewportWidth = 33.0f,
      viewportHeight = 36.0f,
    ).apply {
      path(
        fill = SolidColor(Color(0xFF44B2DD)),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(23.0062f, 5.9049f)
        lineTo(4.4791f, 23.5711f)
        lineTo(13.8213f, 24.7367f)
        lineTo(23.0062f, 5.9049f)
        close()
      }
      path(
        fill = SolidColor(Color(0xFF44B2DD)),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(23.0053f, 5.9044f)
        lineTo(20.4906f, 31.3804f)
        lineTo(13.8204f, 24.7363f)
        lineTo(23.0053f, 5.9044f)
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
          moveTo(23.0051f, 5.9044f)
          lineTo(24.0003f, 6.0027f)
          lineTo(22.1063f, 5.466f)
          lineTo(23.0051f, 5.9044f)
          close()
          moveTo(23.005f, 5.906f)
          lineTo(22.0098f, 5.8077f)
          lineTo(21.7449f, 8.4889f)
          lineTo(23.695f, 6.6298f)
          lineTo(23.005f, 5.906f)
          close()
          moveTo(23.0038f, 5.9072f)
          lineTo(23.6938f, 6.6309f)
          lineTo(23.8238f, 6.507f)
          lineTo(23.9025f, 6.3456f)
          lineTo(23.0038f, 5.9072f)
          close()
          moveTo(4.4791f, 23.5711f)
          lineTo(3.789f, 22.8474f)
          lineTo(2.2631f, 24.3023f)
          lineTo(4.3553f, 24.5634f)
          lineTo(4.4791f, 23.5711f)
          close()
          moveTo(13.8207f, 24.7367f)
          lineTo(14.5264f, 24.0282f)
          lineTo(14.284f, 23.7868f)
          lineTo(13.9445f, 23.7444f)
          lineTo(13.8207f, 24.7367f)
          close()
          moveTo(20.4904f, 31.3803f)
          lineTo(19.7847f, 32.0888f)
          lineTo(21.2785f, 33.5767f)
          lineTo(21.4856f, 31.4785f)
          lineTo(20.4904f, 31.3803f)
          close()
          moveTo(23.0048f, 5.9077f)
          lineTo(22.106f, 5.4693f)
          lineTo(22.0273f, 5.6307f)
          lineTo(22.0096f, 5.8095f)
          lineTo(23.0048f, 5.9077f)
          close()
          moveTo(23.0062f, 5.9049f)
          lineTo(23.905f, 6.3433f)
          lineTo(22.3161f, 5.1811f)
          lineTo(23.0062f, 5.9049f)
          close()
          moveTo(22.01f, 5.806f)
          lineTo(22.0098f, 5.8077f)
          lineTo(24.0001f, 6.0044f)
          lineTo(24.0003f, 6.0027f)
          lineTo(22.01f, 5.806f)
          close()
          moveTo(23.9025f, 6.3456f)
          lineTo(23.9039f, 6.3427f)
          lineTo(22.1063f, 5.466f)
          lineTo(22.105f, 5.4688f)
          lineTo(23.9025f, 6.3456f)
          close()
          moveTo(22.3137f, 5.1835f)
          lineTo(3.789f, 22.8474f)
          lineTo(5.1692f, 24.2948f)
          lineTo(23.6938f, 6.6309f)
          lineTo(22.3137f, 5.1835f)
          close()
          moveTo(4.3553f, 24.5634f)
          lineTo(13.6969f, 25.729f)
          lineTo(13.9445f, 23.7444f)
          lineTo(4.6029f, 22.5788f)
          lineTo(4.3553f, 24.5634f)
          close()
          moveTo(21.1961f, 30.6718f)
          lineTo(14.5264f, 24.0282f)
          lineTo(13.115f, 25.4452f)
          lineTo(19.7847f, 32.0888f)
          lineTo(21.1961f, 30.6718f)
          close()
          moveTo(22.0096f, 5.8095f)
          lineTo(19.4952f, 31.2821f)
          lineTo(21.4856f, 31.4785f)
          lineTo(24.0f, 6.0059f)
          lineTo(22.0096f, 5.8095f)
          close()
          moveTo(23.9036f, 6.346f)
          lineTo(23.905f, 6.3433f)
          lineTo(22.1074f, 5.4665f)
          lineTo(22.106f, 5.4693f)
          lineTo(23.9036f, 6.346f)
          close()
          moveTo(22.3161f, 5.1811f)
          lineTo(22.3149f, 5.1823f)
          lineTo(23.695f, 6.6298f)
          lineTo(23.6962f, 6.6287f)
          lineTo(22.3161f, 5.1811f)
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
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.Self)
