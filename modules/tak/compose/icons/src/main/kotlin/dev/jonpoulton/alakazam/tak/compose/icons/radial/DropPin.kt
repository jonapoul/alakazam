package dev.jonpoulton.alakazam.tak.compose.icons.radial

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons

public val RadialTakIcons.DropPin: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "DropPin",
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
        moveTo(16.9126f, 4.5f)
        curveTo(11.4387f, 4.5f, 7f, 8.939f, 7f, 14.4135f)
        curveTo(7f, 16.1564f, 7.9149f, 18.431f, 9.5485f, 21.1613f)
        curveTo(10.1803f, 22.2173f, 10.9097f, 23.3222f, 11.7178f, 24.4606f)
        curveTo(12.7301f, 25.8865f, 13.8132f, 27.2928f, 14.8963f, 28.6191f)
        lineTo(15.5477f, 29.4068f)
        lineTo(16.3459f, 30.3408f)
        lineTo(16.9124f, 30.9824f)
        lineTo(17.8424f, 29.9213f)
        lineTo(18.0564f, 29.6697f)
        curveTo(18.5067f, 29.1377f, 18.9985f, 28.541f, 19.5158f, 27.8929f)
        lineTo(24.8011f, 20.2497f)
        curveTo(26.1194f, 17.881f, 26.8252f, 15.9431f, 26.8252f, 14.4135f)
        curveTo(26.8252f, 8.9387f, 22.3871f, 4.5f, 16.9126f, 4.5f)
        close()
        moveTo(16.9126f, 6.012f)
        curveTo(21.552f, 6.012f, 25.3132f, 9.7737f, 25.3132f, 14.4135f)
        curveTo(25.3132f, 15.6228f, 24.6827f, 17.3539f, 23.5181f, 19.453f)
        lineTo(18.3031f, 26.9913f)
        lineTo(17.9451f, 27.4347f)
        curveTo(17.7067f, 27.728f, 17.4698f, 28.0156f, 17.2403f, 28.2906f)
        lineTo(16.912f, 28.6803f)
        lineTo(16.5004f, 28.1886f)
        curveTo(16.3608f, 28.0205f, 16.2163f, 27.845f, 16.0675f, 27.6628f)
        curveTo(15.0045f, 26.3611f, 13.9416f, 24.9811f, 12.9508f, 23.5854f)
        curveTo(12.1641f, 22.4773f, 11.456f, 21.4047f, 10.846f, 20.385f)
        curveTo(9.3434f, 17.8736f, 8.512f, 15.8067f, 8.512f, 14.4135f)
        curveTo(8.512f, 9.7741f, 12.2738f, 6.012f, 16.9126f, 6.012f)
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
        moveTo(16.9123f, 11.4371f)
        curveTo(15.1466f, 11.4371f, 13.7146f, 12.8691f, 13.7146f, 14.6348f)
        curveTo(13.7146f, 16.4005f, 15.1466f, 17.8325f, 16.9123f, 17.8325f)
        curveTo(18.6787f, 17.8325f, 20.1109f, 16.4007f, 20.1109f, 14.6348f)
        curveTo(20.1109f, 12.8689f, 18.6787f, 11.4371f, 16.9123f, 11.4371f)
        close()
        moveTo(16.9123f, 12.9491f)
        curveTo(17.8438f, 12.9491f, 18.5989f, 13.704f, 18.5989f, 14.6348f)
        curveTo(18.5989f, 15.5656f, 17.8438f, 16.3205f, 16.9123f, 16.3205f)
        curveTo(15.9816f, 16.3205f, 15.2266f, 15.5655f, 15.2266f, 14.6348f)
        curveTo(15.2266f, 13.7041f, 15.9816f, 12.9491f, 16.9123f, 12.9491f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
