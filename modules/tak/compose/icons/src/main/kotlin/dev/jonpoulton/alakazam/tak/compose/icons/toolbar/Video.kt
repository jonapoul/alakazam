package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

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
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val ToolbarTakIcons.Video: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Video",
      defaultWidth = 40.0.dp,
      defaultHeight = 41.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 41.0f,
    ).apply {
      group {
        path(
          fill = SolidColor(Color.White),
          stroke = null,
          strokeLineWidth = 0.0f,
          strokeLineCap = Butt,
          strokeLineJoin = Miter,
          strokeLineMiter = 4.0f,
          pathFillType = NonZero,
        ) {
          moveTo(35.6082f, 19.7912f)
          curveTo(35.6082f, 17.6847f, 35.6082f, 15.5801f, 35.6082f, 13.4736f)
          curveTo(35.6082f, 12.0534f, 34.2696f, 11.2741f, 33.0257f, 11.9567f)
          curveTo(32.5062f, 12.2468f, 32.0151f, 12.59f, 31.5089f, 12.9048f)
          lineTo(27.11f, 15.7128f)
          curveTo(27.11f, 14.8387f, 27.11f, 14.0746f, 27.11f, 13.3086f)
          curveTo(27.11f, 12.8877f, 27.1669f, 12.4611f, 27.0532f, 12.042f)
          curveTo(26.9051f, 11.4491f, 26.5594f, 10.9243f, 26.0731f, 10.5541f)
          curveTo(25.5867f, 10.1839f, 24.9888f, 9.9905f, 24.3778f, 10.0057f)
          curveTo(21.8124f, 9.9962f, 19.249f, 10.0057f, 16.6836f, 10.0057f)
          curveTo(13.7245f, 10.0057f, 10.766f, 10.0057f, 7.8081f, 10.0057f)
          curveTo(6.2192f, 10.0057f, 4.9925f, 11.1964f, 5.0039f, 12.7872f)
          curveTo(5.0418f, 17.717f, 5.0171f, 22.6581f, 5.019f, 27.5935f)
          curveTo(5.0028f, 27.8478f, 5.0226f, 28.1032f, 5.0778f, 28.352f)
          curveTo(5.226f, 28.945f, 5.5733f, 29.4691f, 6.0617f, 29.8367f)
          curveTo(6.5501f, 30.2043f, 7.1499f, 30.393f, 7.7607f, 30.3713f)
          curveTo(10.5157f, 30.3713f, 13.2688f, 30.3713f, 16.0238f, 30.3713f)
          curveTo(18.7787f, 30.3713f, 21.5622f, 30.3713f, 24.3323f, 30.3713f)
          curveTo(26.0388f, 30.3713f, 27.1954f, 29.1199f, 27.1252f, 27.5935f)
          curveTo(27.0911f, 26.8351f, 27.1157f, 26.0767f, 27.1252f, 25.3296f)
          curveTo(27.1252f, 25.14f, 27.074f, 24.9315f, 27.1935f, 24.7248f)
          curveTo(27.2845f, 24.7779f, 27.3508f, 24.812f, 27.4153f, 24.8537f)
          curveTo(29.2185f, 25.9914f, 31.0178f, 27.129f, 32.8229f, 28.2932f)
          curveTo(33.458f, 28.7027f, 34.0932f, 28.826f, 34.772f, 28.4411f)
          curveTo(35.4186f, 28.0751f, 35.6252f, 27.4817f, 35.6233f, 26.7725f)
          curveTo(35.6044f, 24.4442f, 35.6082f, 22.1177f, 35.6082f, 19.7912f)
          close()
          moveTo(25.4093f, 27.4456f)
          curveTo(25.4093f, 28.3121f, 25.0528f, 28.6724f, 24.1787f, 28.6743f)
          curveTo(21.4724f, 28.6743f, 18.7667f, 28.6743f, 16.0617f, 28.6743f)
          curveTo(13.3882f, 28.6743f, 10.7142f, 28.6743f, 8.0395f, 28.6743f)
          curveTo(7.0383f, 28.6743f, 6.7122f, 28.3482f, 6.7122f, 27.347f)
          verticalLineTo(12.9275f)
          curveTo(6.7122f, 12.0629f, 7.0706f, 11.7008f, 7.9428f, 11.7008f)
          horizontalLineTo(24.1768f)
          curveTo(25.0509f, 11.7008f, 25.4074f, 12.0629f, 25.4074f, 12.9275f)
          lineTo(25.4093f, 27.4456f)
          close()
          moveTo(33.8771f, 26.9584f)
          curveTo(32.9423f, 26.3649f, 32.0569f, 25.8055f, 31.1733f, 25.2405f)
          curveTo(29.9446f, 24.4556f, 28.7179f, 23.6611f, 27.4798f, 22.8875f)
          curveTo(27.3559f, 22.8243f, 27.2536f, 22.7256f, 27.1861f, 22.604f)
          curveTo(27.1185f, 22.4825f, 27.0888f, 22.3435f, 27.1006f, 22.2049f)
          curveTo(27.1176f, 20.8227f, 27.1119f, 19.4386f, 27.1006f, 18.0564f)
          curveTo(27.0862f, 17.9568f, 27.1013f, 17.8553f, 27.1442f, 17.7643f)
          curveTo(27.187f, 17.6733f, 27.2555f, 17.5968f, 27.3414f, 17.5444f)
          curveTo(29.4864f, 16.2007f, 31.6258f, 14.8514f, 33.7595f, 13.4963f)
          curveTo(33.7973f, 13.4823f, 33.8369f, 13.4733f, 33.8771f, 13.4698f)
          verticalLineTo(26.9584f)
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
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Video)
