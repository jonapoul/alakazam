package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons

public val UtilityTakIcons.Send: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Send",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakLegacyColors.PaleSilver),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(16.8952f, 4.2455f)
        curveTo(16.6433f, 4.0053f, 16.2652f, 3.9338f, 15.937f, 4.0646f)
        curveTo(15.6088f, 4.1954f, 15.3947f, 4.5029f, 15.3947f, 4.8436f)
        verticalLineTo(9.3447f)
        curveTo(10.6429f, 9.5259f, 8.2634f, 11.4147f, 7.8998f, 11.7287f)
        curveTo(5.5024f, 13.6151f, 3.8655f, 16.244f, 3.271f, 19.1621f)
        curveTo(2.9737f, 20.5721f, 2.9205f, 22.0193f, 3.114f, 23.4457f)
        lineTo(3.1146f, 23.4507f)
        curveTo(3.1164f, 23.4632f, 3.1184f, 23.476f, 3.1205f, 23.4885f)
        lineTo(3.3074f, 24.5189f)
        curveTo(3.3703f, 24.8659f, 3.6518f, 25.1391f, 4.013f, 25.2036f)
        curveTo(4.3745f, 25.2682f, 4.7395f, 25.1104f, 4.9285f, 24.8082f)
        lineTo(5.4887f, 23.913f)
        curveTo(7.2097f, 21.1691f, 9.3545f, 19.3502f, 11.8643f, 18.507f)
        curveTo(12.9963f, 18.1231f, 14.1957f, 17.9548f, 15.3947f, 18.0108f)
        verticalLineTo(22.6727f)
        curveTo(15.3947f, 23.0141f, 15.6095f, 23.3221f, 15.9387f, 23.4523f)
        curveTo(16.2683f, 23.5828f, 16.647f, 23.5096f, 16.8983f, 23.2674f)
        lineTo(26.1954f, 14.3081f)
        curveTo(26.538f, 13.9779f, 26.5366f, 13.4438f, 26.1923f, 13.1153f)
        lineTo(16.8952f, 4.2455f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
