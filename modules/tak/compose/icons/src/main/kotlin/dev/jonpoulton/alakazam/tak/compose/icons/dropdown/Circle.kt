package dev.jonpoulton.alakazam.tak.compose.icons.dropdown

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.DropdownTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val DropdownTakIcons.Circle: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Circle",
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
        moveTo(15.099f, 2.3589f)
        curveTo(22.4113f, 2.3589f, 28.3396f, 8.2871f, 28.3396f, 15.5994f)
        curveTo(28.3396f, 17.0425f, 28.1083f, 18.4545f, 27.6598f, 19.7958f)
        curveTo(27.5284f, 20.1886f, 27.1035f, 20.4006f, 26.7106f, 20.2692f)
        curveTo(26.3178f, 20.1379f, 26.1059f, 19.7129f, 26.2372f, 19.3201f)
        curveTo(26.6346f, 18.1317f, 26.8396f, 16.8803f, 26.8396f, 15.5994f)
        curveTo(26.8396f, 9.1155f, 21.5829f, 3.8589f, 15.099f, 3.8589f)
        curveTo(8.6158f, 3.8589f, 3.3593f, 9.1157f, 3.3593f, 15.5994f)
        curveTo(3.3593f, 22.0825f, 8.6159f, 27.3392f, 15.099f, 27.3392f)
        curveTo(16.792f, 27.3392f, 18.4319f, 26.9812f, 19.9399f, 26.2978f)
        curveTo(20.3171f, 26.1268f, 20.7616f, 26.2941f, 20.9326f, 26.6714f)
        curveTo(21.1035f, 27.0486f, 20.9363f, 27.4931f, 20.559f, 27.6641f)
        curveTo(18.8575f, 28.4352f, 17.0066f, 28.8392f, 15.099f, 28.8392f)
        curveTo(7.7875f, 28.8392f, 1.8592f, 22.911f, 1.8592f, 15.5994f)
        curveTo(1.8592f, 8.2872f, 7.7873f, 2.3589f, 15.099f, 2.3589f)
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
        moveTo(24.5134f, 20.3428f)
        curveTo(24.8931f, 20.3428f, 25.2069f, 20.6249f, 25.2566f, 20.991f)
        lineTo(25.2634f, 21.0928f)
        verticalLineTo(27.1646f)
        curveTo(25.2634f, 27.5788f, 24.9276f, 27.9146f, 24.5134f, 27.9146f)
        curveTo(24.1337f, 27.9146f, 23.8199f, 27.6324f, 23.7703f, 27.2664f)
        lineTo(23.7634f, 27.1646f)
        verticalLineTo(21.0928f)
        curveTo(23.7634f, 20.6786f, 24.0992f, 20.3428f, 24.5134f, 20.3428f)
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
        moveTo(27.5484f, 23.3784f)
        curveTo(27.9626f, 23.3784f, 28.2984f, 23.7142f, 28.2984f, 24.1284f)
        curveTo(28.2984f, 24.5081f, 28.0163f, 24.8219f, 27.6502f, 24.8716f)
        lineTo(27.5484f, 24.8784f)
        horizontalLineTo(21.4774f)
        curveTo(21.0632f, 24.8784f, 20.7274f, 24.5426f, 20.7274f, 24.1284f)
        curveTo(20.7274f, 23.7487f, 21.0096f, 23.4349f, 21.3756f, 23.3853f)
        lineTo(21.4774f, 23.3784f)
        horizontalLineTo(27.5484f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = DropdownTakIcons.Circle)
