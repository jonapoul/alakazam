package dev.jonpoulton.alakazam.tak.compose.icons.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.NavigationTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Unknown
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val NavigationTakIcons.RoverReceptionOff: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RoverReceptionOff",
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
        moveTo(23.9906f, 9.0094f)
        curveTo(21.5841f, 7.7131f, 19.072f, 7.0856f, 16.7176f, 7.0f)
        curveTo(12.1329f, 7.0f, 7.907f, 8.5427f, 5.1163f, 10.938f)
        lineTo(5.0126f, 11.0265f)
        curveTo(4.2795f, 11.651f, 3.4834f, 12.3292f, 4.3588f, 13.4145f)
        curveTo(5.1646f, 14.3471f, 5.8695f, 13.8059f, 6.5662f, 13.271f)
        lineTo(6.5662f, 13.271f)
        curveTo(6.6278f, 13.2237f, 6.6893f, 13.1765f, 6.7508f, 13.1303f)
        curveTo(11.6715f, 9.4136f, 16.8318f, 8.735f, 21.8836f, 11.1164f)
        lineTo(23.9906f, 9.0094f)
        close()
        moveTo(26.5537f, 10.6889f)
        lineTo(24.5657f, 12.6769f)
        curveTo(24.7939f, 12.8352f, 25.0217f, 12.9999f, 25.2491f, 13.1709f)
        lineTo(25.3416f, 13.2418f)
        curveTo(26.1053f, 13.8277f, 26.8364f, 14.3886f, 27.6412f, 13.3739f)
        curveTo(28.4784f, 12.3184f, 27.7209f, 11.6282f, 26.9634f, 11.0192f)
        curveTo(26.8276f, 10.9065f, 26.691f, 10.7964f, 26.5537f, 10.6889f)
        close()
        moveTo(20.1478f, 12.8522f)
        curveTo(16.0942f, 11.552f, 10.7844f, 12.2617f, 8.1861f, 14.9979f)
        curveTo(7.6279f, 15.6069f, 7.3488f, 16.2158f, 7.907f, 16.9466f)
        curveTo(8.4253f, 17.6368f, 9.103f, 17.6774f, 9.8206f, 17.1496f)
        curveTo(12.5109f, 15.1739f, 15.2013f, 14.4972f, 17.9025f, 15.0975f)
        lineTo(20.1478f, 12.8522f)
        close()
        moveTo(20.9375f, 16.3051f)
        lineTo(22.9758f, 14.2668f)
        curveTo(23.2619f, 14.4803f, 23.529f, 14.7104f, 23.7741f, 14.9573f)
        curveTo(24.093f, 15.2821f, 24.412f, 15.6069f, 24.412f, 16.1346f)
        curveTo(24.412f, 17.2714f, 23.2957f, 17.921f, 22.299f, 17.1902f)
        curveTo(21.8447f, 16.8597f, 21.3909f, 16.5647f, 20.9375f, 16.3051f)
        close()
        moveTo(15.7831f, 17.2169f)
        curveTo(14.4927f, 17.3802f, 13.1478f, 17.6415f, 12.0532f, 18.4487f)
        curveTo(11.2957f, 18.9765f, 10.9369f, 19.6261f, 11.4951f, 20.4786f)
        curveTo(11.639f, 20.7185f, 11.8087f, 20.8928f, 11.9986f, 21.0014f)
        lineTo(15.7831f, 17.2169f)
        close()
        moveTo(17.1395f, 20.1032f)
        lineTo(19.2436f, 17.999f)
        curveTo(19.5115f, 18.1277f, 19.7727f, 18.2763f, 20.0266f, 18.4487f)
        curveTo(20.7442f, 18.9765f, 21.1828f, 19.6261f, 20.6246f, 20.4786f)
        curveTo(20.1462f, 21.1688f, 19.5083f, 21.3718f, 18.7509f, 20.844f)
        curveTo(18.2137f, 20.4915f, 17.6766f, 20.2446f, 17.1395f, 20.1032f)
        close()
        moveTo(17.5947f, 24.4166f)
        curveTo(17.5947f, 23.4017f, 16.9568f, 22.8739f, 15.9602f, 22.7521f)
        curveTo(15.0034f, 22.9145f, 14.3655f, 23.4423f, 14.4452f, 24.4572f)
        curveTo(14.4851f, 25.391f, 15.0831f, 25.9594f, 15.9602f, 26.0f)
        curveTo(16.9568f, 26.0406f, 17.5947f, 25.4316f, 17.5947f, 24.4166f)
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
        moveTo(27.5303f, 7.5303f)
        lineTo(9.1455f, 25.9151f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = NavigationTakIcons.RoverReceptionOff)
