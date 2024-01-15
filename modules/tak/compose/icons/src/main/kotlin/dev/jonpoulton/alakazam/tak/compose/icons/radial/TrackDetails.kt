package dev.jonpoulton.alakazam.tak.compose.icons.radial

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RadialTakIcons.TrackDetails: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "TrackDetails",
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
          moveTo(11.1045f, 9.5f)
          curveTo(14.4766f, 9.5f, 17.2098f, 12.2336f, 17.2098f, 15.6063f)
          curveTo(17.2098f, 16.6969f, 16.6579f, 18.0694f, 15.6761f, 19.7106f)
          curveTo(15.302f, 20.3358f, 14.8709f, 20.9888f, 14.3937f, 21.6611f)
          curveTo(13.7973f, 22.5012f, 13.1597f, 23.3289f, 12.5221f, 24.1097f)
          curveTo(12.4106f, 24.2463f, 12.3029f, 24.3767f, 12.1998f, 24.5002f)
          lineTo(11.9051f, 24.8496f)
          lineTo(11.1044f, 25.7624f)
          lineTo(10.5422f, 25.1255f)
          lineTo(10.0091f, 24.5001f)
          lineTo(9.6869f, 24.1096f)
          curveTo(9.0494f, 23.3289f, 8.4119f, 22.5011f, 7.8156f, 21.661f)
          curveTo(7.3385f, 20.9888f, 6.9075f, 20.3357f, 6.5335f, 19.7105f)
          curveTo(5.5518f, 18.0693f, 5f, 16.6969f, 5f, 15.6063f)
          curveTo(5f, 12.2337f, 7.7331f, 9.5f, 11.1045f, 9.5f)
          close()
          moveTo(27.387f, 23.6141f)
          curveTo(27.8013f, 23.6141f, 28.137f, 23.9499f, 28.137f, 24.3641f)
          curveTo(28.137f, 24.7438f, 27.8549f, 25.0576f, 27.4888f, 25.1073f)
          lineTo(27.387f, 25.1141f)
          horizontalLineTo(19.2875f)
          curveTo(18.8733f, 25.1141f, 18.5375f, 24.7784f, 18.5375f, 24.3641f)
          curveTo(18.5375f, 23.9845f, 18.8197f, 23.6707f, 19.1858f, 23.621f)
          lineTo(19.2875f, 23.6141f)
          horizontalLineTo(27.387f)
          close()
          moveTo(11.1045f, 11f)
          curveTo(8.5616f, 11f, 6.5f, 13.0621f, 6.5f, 15.6063f)
          curveTo(6.5f, 16.35f, 6.969f, 17.5165f, 7.8208f, 18.9405f)
          curveTo(8.1732f, 19.5297f, 8.5831f, 20.1507f, 9.0388f, 20.7928f)
          curveTo(9.6138f, 21.603f, 10.2313f, 22.4047f, 10.8488f, 23.161f)
          lineTo(11.1036f, 23.4701f)
          lineTo(11.3603f, 23.1609f)
          curveTo(11.9779f, 22.4046f, 12.5955f, 21.6029f, 13.1706f, 20.7928f)
          curveTo(13.6264f, 20.1506f, 14.0364f, 19.5296f, 14.3888f, 18.9405f)
          curveTo(15.2408f, 17.5165f, 15.7098f, 16.35f, 15.7098f, 15.6063f)
          curveTo(15.7098f, 13.062f, 13.6481f, 11f, 11.1045f, 11f)
          close()
          moveTo(27.387f, 19.3187f)
          curveTo(27.8013f, 19.3187f, 28.137f, 19.6545f, 28.137f, 20.0687f)
          curveTo(28.137f, 20.4484f, 27.8549f, 20.7622f, 27.4888f, 20.8118f)
          lineTo(27.387f, 20.8187f)
          horizontalLineTo(19.2875f)
          curveTo(18.8733f, 20.8187f, 18.5375f, 20.4829f, 18.5375f, 20.0687f)
          curveTo(18.5375f, 19.689f, 18.8197f, 19.3752f, 19.1858f, 19.3255f)
          lineTo(19.2875f, 19.3187f)
          horizontalLineTo(27.387f)
          close()
          moveTo(27.387f, 15.0232f)
          curveTo(27.8013f, 15.0232f, 28.137f, 15.359f, 28.137f, 15.7732f)
          curveTo(28.137f, 16.1529f, 27.8549f, 16.4667f, 27.4888f, 16.5164f)
          lineTo(27.387f, 16.5232f)
          horizontalLineTo(19.2875f)
          curveTo(18.8733f, 16.5232f, 18.5375f, 16.1875f, 18.5375f, 15.7732f)
          curveTo(18.5375f, 15.3935f, 18.8197f, 15.0798f, 19.1858f, 15.0301f)
          lineTo(19.2875f, 15.0232f)
          horizontalLineTo(27.387f)
          close()
          moveTo(27.387f, 10.7278f)
          curveTo(27.8013f, 10.7278f, 28.137f, 11.0636f, 28.137f, 11.4778f)
          curveTo(28.137f, 11.8575f, 27.8549f, 12.1713f, 27.4888f, 12.2209f)
          lineTo(27.387f, 12.2278f)
          horizontalLineTo(19.2875f)
          curveTo(18.8733f, 12.2278f, 18.5375f, 11.892f, 18.5375f, 11.4778f)
          curveTo(18.5375f, 11.0981f, 18.8197f, 10.7843f, 19.1858f, 10.7346f)
          lineTo(19.2875f, 10.7278f)
          horizontalLineTo(27.387f)
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
          moveTo(34.0527f, 0.5541f)
          horizontalLineTo(0.0527f)
          verticalLineTo(34.5541f)
          horizontalLineTo(34.0527f)
          verticalLineTo(0.5541f)
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
private fun Preview() = PreviewIcon(icon = RadialTakIcons.TrackDetails)
