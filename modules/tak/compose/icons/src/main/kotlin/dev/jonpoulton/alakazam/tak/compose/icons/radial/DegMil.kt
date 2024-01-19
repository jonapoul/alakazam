package dev.jonpoulton.alakazam.tak.compose.icons.radial

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.DegMil: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "DegMil",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(10.4571f, 15.8f)
        curveTo(12.4371f, 15.8f, 13.8051f, 14.423f, 13.8051f, 12.65f)
        verticalLineTo(12.632f)
        curveTo(13.8051f, 10.859f, 12.4371f, 9.5f, 10.4571f, 9.5f)
        horizontalLineTo(8.6931f)
        curveTo(8.3061f, 9.5f, 8.0001f, 9.806f, 8.0001f, 10.193f)
        verticalLineTo(15.107f)
        curveTo(8.0001f, 15.494f, 8.3061f, 15.8f, 8.6931f, 15.8f)
        horizontalLineTo(10.4571f)
        close()
        moveTo(10.4571f, 14.549f)
        horizontalLineTo(9.3861f)
        verticalLineTo(10.751f)
        horizontalLineTo(10.4571f)
        curveTo(11.5911f, 10.751f, 12.3561f, 11.534f, 12.3561f, 12.65f)
        verticalLineTo(12.668f)
        curveTo(12.3561f, 13.784f, 11.5911f, 14.549f, 10.4571f, 14.549f)
        close()
        moveTo(17.5551f, 15.908f)
        curveTo(18.2571f, 15.908f, 18.8061f, 15.683f, 19.2291f, 15.323f)
        curveTo(19.3281f, 15.233f, 19.4091f, 15.098f, 19.4091f, 14.918f)
        curveTo(19.4091f, 14.612f, 19.1841f, 14.378f, 18.8781f, 14.378f)
        curveTo(18.7341f, 14.378f, 18.6441f, 14.414f, 18.5451f, 14.486f)
        curveTo(18.2661f, 14.693f, 17.9511f, 14.81f, 17.5731f, 14.81f)
        curveTo(16.9611f, 14.81f, 16.5291f, 14.486f, 16.3941f, 13.865f)
        horizontalLineTo(19.1031f)
        curveTo(19.4631f, 13.865f, 19.7421f, 13.604f, 19.7421f, 13.208f)
        curveTo(19.7421f, 12.209f, 19.0311f, 10.886f, 17.4201f, 10.886f)
        curveTo(16.0161f, 10.886f, 15.0351f, 12.02f, 15.0351f, 13.397f)
        verticalLineTo(13.415f)
        curveTo(15.0351f, 14.891f, 16.1061f, 15.908f, 17.5551f, 15.908f)
        close()
        moveTo(18.4371f, 13.01f)
        horizontalLineTo(16.3761f)
        curveTo(16.4841f, 12.389f, 16.8531f, 11.984f, 17.4201f, 11.984f)
        curveTo(17.9961f, 11.984f, 18.3561f, 12.398f, 18.4371f, 13.01f)
        close()
        moveTo(23.3211f, 17.258f)
        curveTo(24.2571f, 17.258f, 24.9501f, 17.06f, 25.4001f, 16.61f)
        curveTo(25.8051f, 16.205f, 26.0121f, 15.575f, 26.0121f, 14.711f)
        verticalLineTo(11.606f)
        curveTo(26.0121f, 11.228f, 25.7061f, 10.922f, 25.3281f, 10.922f)
        curveTo(24.9501f, 10.922f, 24.6441f, 11.228f, 24.6441f, 11.597f)
        verticalLineTo(11.606f)
        curveTo(24.2751f, 11.201f, 23.8341f, 10.886f, 23.0871f, 10.886f)
        curveTo(21.9801f, 10.886f, 20.9451f, 11.696f, 20.9451f, 13.136f)
        verticalLineTo(13.154f)
        curveTo(20.9451f, 14.585f, 21.9621f, 15.404f, 23.0871f, 15.404f)
        curveTo(23.8161f, 15.404f, 24.2571f, 15.107f, 24.6621f, 14.621f)
        verticalLineTo(14.855f)
        curveTo(24.6621f, 15.719f, 24.2211f, 16.169f, 23.2851f, 16.169f)
        curveTo(22.7721f, 16.169f, 22.3491f, 16.061f, 21.9531f, 15.881f)
        curveTo(21.8901f, 15.854f, 21.8181f, 15.836f, 21.7281f, 15.836f)
        curveTo(21.4221f, 15.836f, 21.1701f, 16.088f, 21.1701f, 16.394f)
        curveTo(21.1701f, 16.646f, 21.3231f, 16.835f, 21.5571f, 16.925f)
        curveTo(22.1241f, 17.15f, 22.6821f, 17.258f, 23.3211f, 17.258f)
        close()
        moveTo(23.4831f, 14.27f)
        curveTo(22.8171f, 14.27f, 22.3131f, 13.82f, 22.3131f, 13.154f)
        verticalLineTo(13.136f)
        curveTo(22.3131f, 12.479f, 22.8171f, 12.02f, 23.4831f, 12.02f)
        curveTo(24.1491f, 12.02f, 24.6621f, 12.479f, 24.6621f, 13.136f)
        verticalLineTo(13.154f)
        curveTo(24.6621f, 13.811f, 24.1491f, 14.27f, 23.4831f, 14.27f)
        close()
        moveTo(16.8561f, 24.854f)
        curveTo(17.2341f, 24.854f, 17.5401f, 24.548f, 17.5401f, 24.17f)
        verticalLineTo(21.659f)
        curveTo(17.5401f, 20.498f, 16.9281f, 19.886f, 15.9111f, 19.886f)
        curveTo(15.2541f, 19.886f, 14.7501f, 20.156f, 14.3271f, 20.651f)
        curveTo(14.0751f, 20.165f, 13.5981f, 19.886f, 12.9681f, 19.886f)
        curveTo(12.2751f, 19.886f, 11.8611f, 20.255f, 11.5461f, 20.66f)
        verticalLineTo(20.606f)
        curveTo(11.5461f, 20.228f, 11.2401f, 19.922f, 10.8621f, 19.922f)
        curveTo(10.4841f, 19.922f, 10.1781f, 20.228f, 10.1781f, 20.606f)
        verticalLineTo(24.17f)
        curveTo(10.1781f, 24.548f, 10.4841f, 24.854f, 10.8621f, 24.854f)
        curveTo(11.2401f, 24.854f, 11.5461f, 24.548f, 11.5461f, 24.17f)
        verticalLineTo(22.109f)
        curveTo(11.5461f, 21.461f, 11.8611f, 21.128f, 12.3741f, 21.128f)
        curveTo(12.8871f, 21.128f, 13.1751f, 21.461f, 13.1751f, 22.109f)
        verticalLineTo(24.17f)
        curveTo(13.1751f, 24.548f, 13.4811f, 24.854f, 13.8591f, 24.854f)
        curveTo(14.2371f, 24.854f, 14.5431f, 24.548f, 14.5431f, 24.17f)
        verticalLineTo(22.109f)
        curveTo(14.5431f, 21.461f, 14.8581f, 21.128f, 15.3711f, 21.128f)
        curveTo(15.8841f, 21.128f, 16.1721f, 21.461f, 16.1721f, 22.109f)
        verticalLineTo(24.17f)
        curveTo(16.1721f, 24.548f, 16.4781f, 24.854f, 16.8561f, 24.854f)
        close()
        moveTo(19.8501f, 19.49f)
        curveTo(20.2821f, 19.49f, 20.6151f, 19.238f, 20.6151f, 18.842f)
        verticalLineTo(18.824f)
        curveTo(20.6151f, 18.428f, 20.2821f, 18.185f, 19.8501f, 18.185f)
        curveTo(19.4181f, 18.185f, 19.0851f, 18.428f, 19.0851f, 18.824f)
        verticalLineTo(18.842f)
        curveTo(19.0851f, 19.238f, 19.4181f, 19.49f, 19.8501f, 19.49f)
        close()
        moveTo(19.8501f, 24.854f)
        curveTo(20.2281f, 24.854f, 20.5341f, 24.548f, 20.5341f, 24.17f)
        verticalLineTo(20.606f)
        curveTo(20.5341f, 20.228f, 20.2281f, 19.922f, 19.8501f, 19.922f)
        curveTo(19.4721f, 19.922f, 19.1661f, 20.228f, 19.1661f, 20.606f)
        verticalLineTo(24.17f)
        curveTo(19.1661f, 24.548f, 19.4721f, 24.854f, 19.8501f, 24.854f)
        close()
        moveTo(22.9431f, 24.854f)
        curveTo(23.3211f, 24.854f, 23.6271f, 24.548f, 23.6271f, 24.17f)
        verticalLineTo(18.86f)
        curveTo(23.6271f, 18.482f, 23.3211f, 18.176f, 22.9431f, 18.176f)
        curveTo(22.5651f, 18.176f, 22.2591f, 18.482f, 22.2591f, 18.86f)
        verticalLineTo(24.17f)
        curveTo(22.2591f, 24.548f, 22.5651f, 24.854f, 22.9431f, 24.854f)
        close()
      }
    }.build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.DegMil)
