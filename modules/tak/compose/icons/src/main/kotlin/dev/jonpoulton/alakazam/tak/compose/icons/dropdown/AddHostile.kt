package dev.jonpoulton.alakazam.tak.compose.icons.dropdown

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.DropdownTakIcons

public val DropdownTakIcons.AddHostile: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "AddHostile",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(14.5975f, 2.5294f)
        curveTo(14.8853f, 2.2416f, 15.3355f, 2.2155f, 15.6528f, 2.4509f)
        lineTo(15.7437f, 2.5294f)
        lineTo(28.3129f, 15.0978f)
        curveTo(28.6006f, 15.3855f, 28.6268f, 15.8358f, 28.3914f, 16.1531f)
        lineTo(28.3129f, 16.244f)
        lineTo(25.5933f, 18.9636f)
        curveTo(25.2768f, 19.2801f, 24.7636f, 19.2801f, 24.4471f, 18.9636f)
        curveTo(24.1593f, 18.6759f, 24.1332f, 18.2256f, 24.3686f, 17.9083f)
        lineTo(24.4471f, 17.8174f)
        lineTo(26.5929f, 15.671f)
        lineTo(15.1699f, 4.248f)
        lineTo(3.7479f, 15.671f)
        lineTo(15.1699f, 27.093f)
        lineTo(17.7606f, 24.5038f)
        curveTo(18.0484f, 24.2161f, 18.4986f, 24.1899f, 18.8159f, 24.4254f)
        lineTo(18.9068f, 24.5038f)
        curveTo(19.1946f, 24.7916f, 19.2207f, 25.2419f, 18.9853f, 25.5592f)
        lineTo(18.9068f, 25.6501f)
        lineTo(15.7438f, 28.8131f)
        curveTo(15.456f, 29.1009f, 15.0057f, 29.1271f, 14.6884f, 28.8916f)
        lineTo(14.5975f, 28.8131f)
        lineTo(2.0291f, 16.244f)
        curveTo(1.7414f, 15.9562f, 1.7152f, 15.506f, 1.9507f, 15.1887f)
        lineTo(2.0291f, 15.0978f)
        lineTo(14.5975f, 2.5294f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(23.5468f, 19.9844f)
        curveTo(23.9264f, 19.9844f, 24.2402f, 20.2665f, 24.2899f, 20.6326f)
        lineTo(24.2968f, 20.7344f)
        verticalLineTo(26.2857f)
        curveTo(24.2968f, 26.7f, 23.961f, 27.0357f, 23.5468f, 27.0357f)
        curveTo(23.1671f, 27.0357f, 22.8533f, 26.7536f, 22.8036f, 26.3875f)
        lineTo(22.7968f, 26.2857f)
        verticalLineTo(20.7344f)
        curveTo(22.7968f, 20.3202f, 23.1325f, 19.9844f, 23.5468f, 19.9844f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(26.3224f, 22.76f)
        curveTo(26.7366f, 22.76f, 27.0724f, 23.0958f, 27.0724f, 23.51f)
        curveTo(27.0724f, 23.8897f, 26.7902f, 24.2035f, 26.4241f, 24.2532f)
        lineTo(26.3224f, 24.26f)
        horizontalLineTo(20.771f)
        curveTo(20.3568f, 24.26f, 20.021f, 23.9242f, 20.021f, 23.51f)
        curveTo(20.021f, 23.1303f, 20.3031f, 22.8165f, 20.6692f, 22.7669f)
        lineTo(20.771f, 22.76f)
        horizontalLineTo(26.3224f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
