package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

val RadialTakIcons.ManualPointEntry: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "ManualPointEntry",
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
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(29.0035f, 24.2182f)
        horizontalLineTo(4.5582f)
        curveTo(3.5335f, 24.2182f, 2.7029f, 23.3875f, 2.7029f, 22.3628f)
        verticalLineTo(13.0591f)
        curveTo(2.7029f, 12.0344f, 3.5335f, 11.2038f, 4.5582f, 11.2038f)
        horizontalLineTo(29.0035f)
        curveTo(30.0282f, 11.2038f, 30.8588f, 12.0344f, 30.8588f, 13.0591f)
        verticalLineTo(22.3628f)
        curveTo(30.8588f, 23.3875f, 30.0282f, 24.2182f, 29.0035f, 24.2182f)
        close()
      }
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
          moveTo(10.01f, 20.4604f)
          curveTo(10.41f, 20.4604f, 10.61f, 20.6304f, 10.61f, 20.9704f)
          curveTo(10.61f, 21.3237f, 10.41f, 21.5004f, 10.01f, 21.5004f)
          horizontalLineTo(6.63f)
          curveTo(6.2233f, 21.5004f, 6.02f, 21.3237f, 6.02f, 20.9704f)
          curveTo(6.02f, 20.6304f, 6.2233f, 20.4604f, 6.63f, 20.4604f)
          horizontalLineTo(7.67f)
          verticalLineTo(15.9004f)
          lineTo(6.71f, 16.4904f)
          curveTo(6.6167f, 16.5437f, 6.5333f, 16.5704f, 6.46f, 16.5704f)
          curveTo(6.32f, 16.5704f, 6.2f, 16.5104f, 6.1f, 16.3904f)
          curveTo(6.0067f, 16.2704f, 5.96f, 16.137f, 5.96f, 15.9904f)
          curveTo(5.96f, 15.797f, 6.0467f, 15.647f, 6.22f, 15.5404f)
          lineTo(7.77f, 14.5804f)
          curveTo(7.97f, 14.4604f, 8.16f, 14.4004f, 8.34f, 14.4004f)
          curveTo(8.5267f, 14.4004f, 8.6767f, 14.457f, 8.79f, 14.5704f)
          curveTo(8.9033f, 14.6837f, 8.96f, 14.8404f, 8.96f, 15.0404f)
          verticalLineTo(20.4604f)
          horizontalLineTo(10.01f)
          close()
          moveTo(14.4261f, 16.9804f)
          curveTo(14.8461f, 16.9804f, 15.2194f, 17.077f, 15.5461f, 17.2704f)
          curveTo(15.8728f, 17.457f, 16.1261f, 17.7237f, 16.3061f, 18.0704f)
          curveTo(16.4928f, 18.4104f, 16.5861f, 18.8004f, 16.5861f, 19.2404f)
          curveTo(16.5861f, 19.6937f, 16.4828f, 20.1004f, 16.2761f, 20.4604f)
          curveTo(16.0761f, 20.8137f, 15.7961f, 21.0904f, 15.4361f, 21.2904f)
          curveTo(15.0828f, 21.4904f, 14.6794f, 21.5904f, 14.2261f, 21.5904f)
          curveTo(13.3328f, 21.5904f, 12.6428f, 21.2904f, 12.1561f, 20.6904f)
          curveTo(11.6761f, 20.0837f, 11.4361f, 19.2204f, 11.4361f, 18.1004f)
          curveTo(11.4361f, 17.3337f, 11.5494f, 16.6704f, 11.7761f, 16.1104f)
          curveTo(12.0028f, 15.5437f, 12.3261f, 15.1104f, 12.7461f, 14.8104f)
          curveTo(13.1728f, 14.5104f, 13.6728f, 14.3604f, 14.2461f, 14.3604f)
          curveTo(14.6261f, 14.3604f, 15.0061f, 14.4304f, 15.3861f, 14.5704f)
          curveTo(15.7728f, 14.7037f, 16.0994f, 14.887f, 16.3661f, 15.1204f)
          curveTo(16.4528f, 15.1937f, 16.5128f, 15.267f, 16.5461f, 15.3404f)
          curveTo(16.5861f, 15.407f, 16.6061f, 15.4904f, 16.6061f, 15.5904f)
          curveTo(16.6061f, 15.737f, 16.5628f, 15.8637f, 16.4761f, 15.9704f)
          curveTo(16.3961f, 16.0704f, 16.2994f, 16.1204f, 16.1861f, 16.1204f)
          curveTo(16.1194f, 16.1204f, 16.0561f, 16.1104f, 15.9961f, 16.0904f)
          curveTo(15.9361f, 16.0637f, 15.8628f, 16.0237f, 15.7761f, 15.9704f)
          curveTo(15.2228f, 15.5837f, 14.7294f, 15.3904f, 14.2961f, 15.3904f)
          curveTo(13.8094f, 15.3904f, 13.4261f, 15.617f, 13.1461f, 16.0704f)
          curveTo(12.8661f, 16.517f, 12.7194f, 17.147f, 12.7061f, 17.9604f)
          curveTo(12.8594f, 17.6604f, 13.0894f, 17.4237f, 13.3961f, 17.2504f)
          curveTo(13.7028f, 17.0704f, 14.0461f, 16.9804f, 14.4261f, 16.9804f)
          close()
          moveTo(14.1561f, 20.5704f)
          curveTo(14.5228f, 20.5704f, 14.8161f, 20.4537f, 15.0361f, 20.2204f)
          curveTo(15.2561f, 19.9804f, 15.3661f, 19.667f, 15.3661f, 19.2804f)
          curveTo(15.3661f, 18.8937f, 15.2561f, 18.5837f, 15.0361f, 18.3504f)
          curveTo(14.8161f, 18.117f, 14.5228f, 18.0004f, 14.1561f, 18.0004f)
          curveTo(13.7828f, 18.0004f, 13.4794f, 18.1204f, 13.2461f, 18.3604f)
          curveTo(13.0194f, 18.5937f, 12.9061f, 18.9004f, 12.9061f, 19.2804f)
          curveTo(12.9061f, 19.667f, 13.0194f, 19.9804f, 13.2461f, 20.2204f)
          curveTo(13.4794f, 20.4537f, 13.7828f, 20.5704f, 14.1561f, 20.5704f)
          close()
          moveTo(18.2322f, 21.5604f)
          curveTo(18.0189f, 21.5604f, 17.8422f, 21.4904f, 17.7022f, 21.3504f)
          curveTo(17.5622f, 21.2037f, 17.4922f, 21.0237f, 17.4922f, 20.8104f)
          curveTo(17.4922f, 20.597f, 17.5622f, 20.4204f, 17.7022f, 20.2804f)
          curveTo(17.8422f, 20.1337f, 18.0189f, 20.0604f, 18.2322f, 20.0604f)
          curveTo(18.4455f, 20.0604f, 18.6222f, 20.1337f, 18.7622f, 20.2804f)
          curveTo(18.9022f, 20.4204f, 18.9722f, 20.597f, 18.9722f, 20.8104f)
          curveTo(18.9722f, 21.0237f, 18.9022f, 21.2037f, 18.7622f, 21.3504f)
          curveTo(18.6222f, 21.4904f, 18.4455f, 21.5604f, 18.2322f, 21.5604f)
          close()
          moveTo(20.7127f, 21.5604f)
          curveTo(20.4993f, 21.5604f, 20.3227f, 21.4904f, 20.1827f, 21.3504f)
          curveTo(20.0427f, 21.2037f, 19.9727f, 21.0237f, 19.9727f, 20.8104f)
          curveTo(19.9727f, 20.597f, 20.0427f, 20.4204f, 20.1827f, 20.2804f)
          curveTo(20.3227f, 20.1337f, 20.4993f, 20.0604f, 20.7127f, 20.0604f)
          curveTo(20.926f, 20.0604f, 21.1027f, 20.1337f, 21.2427f, 20.2804f)
          curveTo(21.3827f, 20.4204f, 21.4527f, 20.597f, 21.4527f, 20.8104f)
          curveTo(21.4527f, 21.0237f, 21.3827f, 21.2037f, 21.2427f, 21.3504f)
          curveTo(21.1027f, 21.4904f, 20.926f, 21.5604f, 20.7127f, 21.5604f)
          close()
          moveTo(23.1931f, 21.5604f)
          curveTo(22.9798f, 21.5604f, 22.8031f, 21.4904f, 22.6631f, 21.3504f)
          curveTo(22.5231f, 21.2037f, 22.4531f, 21.0237f, 22.4531f, 20.8104f)
          curveTo(22.4531f, 20.597f, 22.5231f, 20.4204f, 22.6631f, 20.2804f)
          curveTo(22.8031f, 20.1337f, 22.9798f, 20.0604f, 23.1931f, 20.0604f)
          curveTo(23.4065f, 20.0604f, 23.5831f, 20.1337f, 23.7231f, 20.2804f)
          curveTo(23.8631f, 20.4204f, 23.9331f, 20.597f, 23.9331f, 20.8104f)
          curveTo(23.9331f, 21.0237f, 23.8631f, 21.2037f, 23.7231f, 21.3504f)
          curveTo(23.5831f, 21.4904f, 23.4065f, 21.5604f, 23.1931f, 21.5604f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
