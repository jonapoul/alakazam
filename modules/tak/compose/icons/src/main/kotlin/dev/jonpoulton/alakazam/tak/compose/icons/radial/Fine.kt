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
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.Fine: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Fine",
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
          moveTo(16.6147f, 6.5f)
          curveTo(16.7738f, 6.5f, 16.9277f, 6.5506f, 17.0549f, 6.6428f)
          lineTo(17.145f, 6.7197f)
          lineTo(20.2866f, 9.8613f)
          curveTo(20.5795f, 10.1542f, 20.5795f, 10.629f, 20.2866f, 10.9219f)
          curveTo(20.0203f, 11.1882f, 19.6037f, 11.2124f, 19.3101f, 10.9945f)
          lineTo(19.2259f, 10.9219f)
          lineTo(17.354f, 9.05f)
          verticalLineTo(16.353f)
          horizontalLineTo(24.657f)
          lineTo(22.7853f, 14.4813f)
          curveTo(22.5191f, 14.215f, 22.4948f, 13.7984f, 22.7127f, 13.5048f)
          lineTo(22.7853f, 13.4206f)
          curveTo(23.0516f, 13.1544f, 23.4683f, 13.1302f, 23.7619f, 13.348f)
          lineTo(23.846f, 13.4206f)
          lineTo(26.9884f, 16.5631f)
          curveTo(27.101f, 16.6756f, 27.174f, 16.8202f, 27.1988f, 16.9754f)
          lineTo(27.2081f, 17.1147f)
          curveTo(27.2081f, 17.2738f, 27.1575f, 17.4278f, 27.0652f, 17.555f)
          lineTo(26.9884f, 17.6451f)
          lineTo(23.8459f, 20.7867f)
          curveTo(23.553f, 21.0795f, 23.0781f, 21.0795f, 22.7852f, 20.7865f)
          curveTo(22.519f, 20.5202f, 22.4949f, 20.1036f, 22.7128f, 19.81f)
          lineTo(22.7854f, 19.7259f)
          lineTo(24.657f, 17.853f)
          horizontalLineTo(17.354f)
          verticalLineTo(25.156f)
          lineTo(19.2259f, 23.2854f)
          curveTo(19.4921f, 23.0191f, 19.9088f, 22.9948f, 20.2024f, 23.2126f)
          lineTo(20.2865f, 23.2852f)
          curveTo(20.5528f, 23.5515f, 20.5771f, 23.9681f, 20.3593f, 24.2618f)
          lineTo(20.2867f, 24.3459f)
          lineTo(17.1451f, 27.4884f)
          curveTo(17.0326f, 27.6009f, 16.8879f, 27.674f, 16.7327f, 27.6987f)
          lineTo(16.5934f, 27.7081f)
          curveTo(16.4343f, 27.7081f, 16.2803f, 27.6575f, 16.1531f, 27.5652f)
          lineTo(16.063f, 27.4884f)
          lineTo(12.9214f, 24.3459f)
          curveTo(12.6286f, 24.053f, 12.6286f, 23.5781f, 12.9216f, 23.2852f)
          curveTo(13.1879f, 23.019f, 13.6045f, 22.9949f, 13.8981f, 23.2128f)
          lineTo(13.9822f, 23.2854f)
          lineTo(15.854f, 25.158f)
          verticalLineTo(17.853f)
          horizontalLineTo(8.549f)
          lineTo(10.4227f, 19.7259f)
          curveTo(10.689f, 19.9921f, 10.7133f, 20.4088f, 10.4955f, 20.7024f)
          lineTo(10.4229f, 20.7865f)
          curveTo(10.1566f, 21.0528f, 9.74f, 21.0771f, 9.4463f, 20.8593f)
          lineTo(9.3622f, 20.7867f)
          lineTo(6.2197f, 17.6451f)
          curveTo(6.1072f, 17.5325f, 6.0341f, 17.3879f, 6.0093f, 17.2327f)
          lineTo(6f, 17.1147f)
          verticalLineTo(17.0934f)
          curveTo(6f, 16.9343f, 6.0506f, 16.7804f, 6.1428f, 16.6532f)
          lineTo(6.2197f, 16.5631f)
          lineTo(9.3621f, 13.4206f)
          curveTo(9.655f, 13.1277f, 10.1299f, 13.1277f, 10.4228f, 13.4206f)
          curveTo(10.689f, 13.6869f, 10.7133f, 14.1036f, 10.4954f, 14.3972f)
          lineTo(10.4228f, 14.4813f)
          lineTo(8.55f, 16.353f)
          horizontalLineTo(15.854f)
          verticalLineTo(9.048f)
          lineTo(13.9822f, 10.9219f)
          curveTo(13.7159f, 11.1882f, 13.2992f, 11.2124f, 13.0056f, 10.9945f)
          lineTo(12.9215f, 10.9219f)
          curveTo(12.6552f, 10.6557f, 12.631f, 10.239f, 12.8489f, 9.9454f)
          lineTo(12.9215f, 9.8613f)
          lineTo(16.0631f, 6.7197f)
          curveTo(16.1756f, 6.6071f, 16.3202f, 6.5341f, 16.4754f, 6.5093f)
          lineTo(16.5934f, 6.5f)
          horizontalLineTo(16.6147f)
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
          moveTo(33.3123f, -0.1878f)
          horizontalLineTo(-0.6877f)
          verticalLineTo(33.8122f)
          horizontalLineTo(33.3123f)
          verticalLineTo(-0.1878f)
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
private fun Preview() = PreviewIcon(icon = RadialTakIcons.Fine)
