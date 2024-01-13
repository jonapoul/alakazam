package dev.jonpoulton.alakazam.tak.compose.icons.radial

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
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.Cas: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Cas",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      group {
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4f,
          pathFillType = NonZero,
        ) {
          moveTo(17.3319f, 3.505f)
          curveTo(15.885f, 3.5904f, 14.7369f, 4.7713f, 14.7369f, 6.2262f)
          lineTo(14.7361f, 13.053f)
          lineTo(4.0001f, 19.6402f)
          verticalLineTo(23.7096f)
          lineTo(14.7361f, 20.416f)
          verticalLineTo(26.268f)
          lineTo(12.0528f, 28.2446f)
          verticalLineTo(31.5893f)
          lineTo(17.5001f, 30.061f)
          lineTo(22.9475f, 31.5893f)
          verticalLineTo(28.2446f)
          lineTo(20.2631f, 26.268f)
          verticalLineTo(20.416f)
          lineTo(31.0001f, 23.7096f)
          verticalLineTo(19.6402f)
          lineTo(20.2631f, 13.053f)
          lineTo(20.2633f, 6.2262f)
          curveTo(20.2633f, 4.7153f, 19.0252f, 3.5f, 17.5001f, 3.5f)
          lineTo(17.3319f, 3.505f)
          close()
          moveTo(17.5001f, 5f)
          curveTo(18.2029f, 5f, 18.7633f, 5.55f, 18.7633f, 6.2262f)
          verticalLineTo(13.8922f)
          lineTo(29.5001f, 20.48f)
          verticalLineTo(21.68f)
          lineTo(18.7633f, 18.3866f)
          verticalLineTo(27.0267f)
          lineTo(21.4471f, 29.002f)
          verticalLineTo(29.61f)
          lineTo(17.5002f, 28.5036f)
          lineTo(13.5521f, 29.61f)
          verticalLineTo(29.002f)
          lineTo(16.237f, 27.0267f)
          verticalLineTo(18.3867f)
          lineTo(5.5001f, 21.68f)
          verticalLineTo(20.479f)
          lineTo(16.2369f, 13.8922f)
          verticalLineTo(6.2262f)
          curveTo(16.2369f, 5.55f, 16.7973f, 5f, 17.5001f, 5f)
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
          moveTo(34.323f, 0.6729f)
          horizontalLineTo(0.323f)
          verticalLineTo(34.6729f)
          horizontalLineTo(34.323f)
          verticalLineTo(0.6729f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
