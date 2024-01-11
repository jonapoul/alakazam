package dev.jonpoulton.alakazam.tak.compose.icons.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.NavigationTakIcons

val NavigationTakIcons.BloodhoundRouteDisabled: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "BloodhoundRouteDisabled",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Ash),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(2.0f, 1.25f)
        lineTo(30.0f, 1.25f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 31.25f, 2.5f)
        lineTo(31.25f, 30.5f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 30.0f, 31.75f)
        lineTo(2.0f, 31.75f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 0.75f, 30.5f)
        lineTo(0.75f, 2.5f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 2.0f, 1.25f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Stone),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(2.0f, 1.25f)
        lineTo(30.0f, 1.25f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 31.25f, 2.5f)
        lineTo(31.25f, 30.5f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 30.0f, 31.75f)
        lineTo(2.0f, 31.75f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 0.75f, 30.5f)
        lineTo(0.75f, 2.5f)
        arcTo(1.25f, 1.25f, 0.0f, false, true, 2.0f, 1.25f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Stone),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(8.0f, 19.2131f)
        curveTo(8.0f, 17.4183f, 9.3512f, 15.9628f, 11.0177f, 15.9628f)
        curveTo(12.6846f, 15.9628f, 14.0359f, 17.4182f, 14.0359f, 19.2131f)
        curveTo(14.0359f, 19.7932f, 13.7627f, 20.5247f, 13.2765f, 21.3998f)
        curveTo(13.0913f, 21.7331f, 12.8778f, 22.0814f, 12.6415f, 22.4399f)
        curveTo(12.346f, 22.8881f, 12.0301f, 23.3299f, 11.7141f, 23.7465f)
        curveTo(11.6865f, 23.783f, 11.6593f, 23.8186f, 11.6327f, 23.8533f)
        lineTo(11.4084f, 24.1414f)
        lineTo(11.0168f, 24.6222f)
        lineTo(10.6756f, 24.2025f)
        curveTo(10.6164f, 24.1285f, 10.5485f, 24.0424f, 10.4736f, 23.9455f)
        lineTo(10.2288f, 23.6237f)
        curveTo(9.912f, 23.2007f, 9.6012f, 22.7601f, 9.3146f, 22.3181f)
        curveTo(8.4881f, 21.0442f, 8.0f, 19.9895f, 8.0f, 19.2131f)
        close()
        moveTo(9.9464f, 19.2825f)
        curveTo(9.9464f, 18.6453f, 10.4262f, 18.1285f, 11.0179f, 18.1285f)
        curveTo(11.6098f, 18.1285f, 12.0894f, 18.6452f, 12.0894f, 19.2825f)
        curveTo(12.0894f, 19.9197f, 11.6098f, 20.4364f, 11.0179f, 20.4364f)
        curveTo(10.4262f, 20.4364f, 9.9464f, 19.9196f, 9.9464f, 19.2825f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Stone),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(19.0984f, 11.632f)
        curveTo(19.0984f, 10.1782f, 20.1926f, 8.9999f, 21.5425f, 8.9999f)
        curveTo(22.8924f, 8.9999f, 23.9866f, 10.1782f, 23.9866f, 11.632f)
        curveTo(23.9866f, 12.1063f, 23.7683f, 12.6911f, 23.3806f, 13.3888f)
        curveTo(23.2343f, 13.6523f, 23.0657f, 13.9272f, 22.8793f, 14.2101f)
        curveTo(22.6466f, 14.5631f, 22.3979f, 14.9107f, 22.1492f, 15.2385f)
        curveTo(22.1202f, 15.2768f, 22.0919f, 15.3139f, 22.0643f, 15.3497f)
        lineTo(21.9085f, 15.5494f)
        lineTo(21.5425f, 15.9982f)
        lineTo(21.2699f, 15.6658f)
        lineTo(21.1011f, 15.4535f)
        lineTo(20.9358f, 15.2385f)
        curveTo(20.6871f, 14.9107f, 20.4385f, 14.5631f, 20.2058f, 14.2101f)
        curveTo(20.0193f, 13.9272f, 19.8508f, 13.6523f, 19.7044f, 13.3888f)
        curveTo(19.3168f, 12.6911f, 19.0984f, 12.1063f, 19.0984f, 11.632f)
        close()
        moveTo(20.624f, 11.6863f)
        curveTo(20.624f, 11.1402f, 21.0354f, 10.6974f, 21.5423f, 10.6974f)
        curveTo(22.0495f, 10.6974f, 22.4611f, 11.14f, 22.4611f, 11.6863f)
        curveTo(22.4611f, 12.2326f, 22.0495f, 12.6752f, 21.5423f, 12.6752f)
        curveTo(21.0354f, 12.6752f, 20.624f, 12.2324f, 20.624f, 11.6863f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Stone),
        strokeLineWidth = 2.0f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(19.4286f, 16.3846f)
        horizontalLineTo(17.5543f)
        curveTo(16.5863f, 16.3846f, 15.7948f, 17.3345f, 15.7948f, 18.4341f)
        verticalLineTo(18.3847f)
        curveTo(15.7948f, 19.4844f, 16.5863f, 20.3844f, 17.5543f, 20.3844f)
        horizontalLineTo(19.5352f)
        horizontalLineTo(20.5262f)
        curveTo(21.4938f, 20.3844f, 22.2857f, 21.2844f, 22.2857f, 22.3845f)
        curveTo(22.2857f, 23.4842f, 21.4938f, 24.3846f, 20.5262f, 24.3846f)
        horizontalLineTo(14.0f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
