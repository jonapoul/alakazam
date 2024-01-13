package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

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
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons

public val RaptorXTakIcons.Wedge: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Wedge",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
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
          moveTo(25.9907f, 15.4145f)
          curveTo(25.9773f, 13.8556f, 25.5847f, 12.3234f, 24.8468f, 10.9502f)
          curveTo(24.1089f, 9.577f, 23.0479f, 8.4039f, 21.7553f, 7.5324f)
          curveTo(20.4228f, 6.6391f, 18.8919f, 6.0854f, 17.2962f, 5.9198f)
          curveTo(16.7321f, 5.86f, 16.2783f, 5.9473f, 15.843f, 6.2892f)
          curveTo(14.6964f, 7.192f, 13.5437f, 8.0842f, 12.3909f, 8.9794f)
          curveTo(9.7176f, 11.0611f, 7.0432f, 13.1396f, 4.3678f, 15.2152f)
          curveTo(4.2481f, 15.2926f, 4.151f, 15.4003f, 4.0864f, 15.5274f)
          curveTo(4.0218f, 15.6545f, 3.992f, 15.7964f, 3.9999f, 15.9387f)
          curveTo(4.0137f, 18.468f, 3.9999f, 20.9972f, 3.9999f, 23.528f)
          curveTo(3.9999f, 24.5689f, 4.5318f, 25.1069f, 5.5619f, 25.1069f)
          horizontalLineTo(24.4977f)
          curveTo(25.4297f, 25.1069f, 25.9953f, 24.5443f, 25.9953f, 23.6169f)
          curveTo(25.9969f, 20.8807f, 26.0091f, 18.1476f, 25.9907f, 15.4145f)
          close()
          moveTo(7.9026f, 14.1881f)
          lineTo(15.7081f, 8.1087f)
          curveTo(15.8364f, 8.027f, 15.9561f, 7.9325f, 16.0653f, 7.8267f)
          curveTo(16.6677f, 7.1185f, 17.4142f, 7.2518f, 18.1807f, 7.4327f)
          curveTo(20.6517f, 8.0152f, 22.4727f, 9.4561f, 23.6776f, 11.6619f)
          curveTo(24.2479f, 12.7279f, 24.5697f, 13.9091f, 24.6188f, 15.1171f)
          curveTo(24.6341f, 15.3853f, 24.5774f, 15.4972f, 24.2724f, 15.4957f)
          curveTo(18.3707f, 15.4875f, 12.4696f, 15.485f, 6.569f, 15.488f)
          curveTo(6.5001f, 15.488f, 6.4158f, 15.5202f, 6.3268f, 15.416f)
          lineTo(7.9026f, 14.1881f)
          close()
          moveTo(24.2218f, 23.738f)
          curveTo(21.156f, 23.7258f, 18.0902f, 23.738f, 15.0244f, 23.738f)
          curveTo(11.9587f, 23.738f, 8.8929f, 23.738f, 5.8271f, 23.7472f)
          curveTo(5.447f, 23.7472f, 5.3672f, 23.6338f, 5.3672f, 23.2766f)
          curveTo(5.3841f, 21.267f, 5.3811f, 19.2574f, 5.3672f, 17.2493f)
          curveTo(5.3672f, 16.9427f, 5.4454f, 16.863f, 5.7505f, 16.863f)
          curveTo(11.9086f, 16.8722f, 18.0667f, 16.8722f, 24.2248f, 16.863f)
          curveTo(24.5529f, 16.863f, 24.6234f, 16.9657f, 24.6203f, 17.2738f)
          curveTo(24.6081f, 19.2962f, 24.6081f, 21.3181f, 24.6203f, 23.3395f)
          curveTo(24.631f, 23.6491f, 24.5467f, 23.7396f, 24.2264f, 23.738f)
          horizontalLineTo(24.2218f)
          close()
        }
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
