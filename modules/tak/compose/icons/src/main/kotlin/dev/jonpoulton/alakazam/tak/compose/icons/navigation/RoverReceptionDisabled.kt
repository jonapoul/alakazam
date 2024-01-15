package dev.jonpoulton.alakazam.tak.compose.icons.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Square
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.NavigationTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val NavigationTakIcons.RoverReceptionDisabled: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RoverReceptionDisabled",
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
        stroke = SolidColor(TakColors.Alert),
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
        pathFillType = NonZero,
      ) {
        moveTo(16.7176f, 7.0f)
        curveTo(20.0664f, 7.1218f, 23.7342f, 8.3397f, 26.9634f, 11.0192f)
        curveTo(27.7209f, 11.6282f, 28.4784f, 12.3184f, 27.6412f, 13.3739f)
        curveTo(26.804f, 14.4295f, 26.0465f, 13.7799f, 25.2491f, 13.1709f)
        curveTo(19.1495f, 8.5833f, 12.7707f, 8.5833f, 6.7508f, 13.1303f)
        curveTo(5.9933f, 13.6987f, 5.2359f, 14.4295f, 4.3588f, 13.4145f)
        curveTo(3.4418f, 12.2778f, 4.3588f, 11.5876f, 5.1163f, 10.938f)
        curveTo(7.907f, 8.5427f, 12.1329f, 7.0f, 16.7176f, 7.0f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Stone),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.412f, 16.1346f)
        curveTo(24.412f, 17.2714f, 23.2957f, 17.921f, 22.299f, 17.1902f)
        curveTo(18.113f, 14.1453f, 13.9668f, 14.1047f, 9.8206f, 17.1496f)
        curveTo(9.103f, 17.6774f, 8.4253f, 17.6368f, 7.907f, 16.9466f)
        curveTo(7.3488f, 16.2158f, 7.6279f, 15.6069f, 8.1861f, 14.9979f)
        curveTo(11.6944f, 11.3034f, 20.1462f, 11.3034f, 23.7741f, 14.9573f)
        curveTo(24.093f, 15.2821f, 24.412f, 15.6069f, 24.412f, 16.1346f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Stone),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0f, 17.1902f)
        curveTo(17.4751f, 17.3526f, 18.8306f, 17.6368f, 20.0266f, 18.4487f)
        curveTo(20.7442f, 18.9765f, 21.1828f, 19.6261f, 20.6246f, 20.4786f)
        curveTo(20.1462f, 21.1688f, 19.5083f, 21.3718f, 18.7509f, 20.844f)
        curveTo(16.9568f, 19.6667f, 15.1628f, 19.6667f, 13.3688f, 20.844f)
        curveTo(12.6113f, 21.3312f, 11.9336f, 21.2094f, 11.4951f, 20.4786f)
        curveTo(10.9369f, 19.6261f, 11.2957f, 18.9765f, 12.0532f, 18.4487f)
        curveTo(13.2093f, 17.5962f, 14.6446f, 17.3526f, 16.0f, 17.1902f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Stone),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(15.9602f, 22.7521f)
        curveTo(16.9568f, 22.8739f, 17.5947f, 23.4017f, 17.5947f, 24.4166f)
        curveTo(17.5947f, 25.4316f, 16.9568f, 26.0406f, 15.9602f, 26.0f)
        curveTo(15.0831f, 25.9594f, 14.4851f, 25.391f, 14.4452f, 24.4572f)
        curveTo(14.3655f, 23.4423f, 15.0034f, 22.9145f, 15.9602f, 22.7521f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color(0xFFD90F0F)),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.0002f, 23.0f)
        moveToRelative(-2.4302f, 2.0392f)
        arcToRelative(3.1724f, 3.1724f, 95.0f, true, true, 4.8604f, -4.0784f)
        arcToRelative(3.1724f, 3.1724f, 95.0f, true, true, -4.8604f, 4.0784f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(Color(0xFFD90F0F)),
        strokeLineWidth = 1.5f,
        strokeLineCap = Square,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(22.2437f, 20.6925f)
        lineTo(25.7731f, 25.1133f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = NavigationTakIcons.RoverReceptionDisabled)
