package dev.jonpoulton.alakazam.tak.compose.icons.markers

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
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.MarkersTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val MarkersTakIcons.Moneyshot: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Moneyshot",
      defaultWidth = 32.0.dp,
      defaultHeight = 33.0.dp,
      viewportWidth = 32.0f,
      viewportHeight = 33.0f,
    ).apply {
      path(
        fill = SolidColor(Color.Black),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.5f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(16.0f, 16.5f)
        moveToRelative(-15.25f, 0.0f)
        arcToRelative(15.25f, 15.25f, 0.0f, true, true, 30.5f, 0.0f)
        arcToRelative(15.25f, 15.25f, 0.0f, true, true, -30.5f, 0.0f)
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(8.0587f, 12.0588f)
        horizontalLineTo(23.8705f)
        curveTo(24.1629f, 12.0588f, 24.3999f, 12.2959f, 24.3999f, 12.5882f)
        verticalLineTo(23.8824f)
        curveTo(24.3999f, 24.1748f, 24.1629f, 24.4118f, 23.8705f, 24.4118f)
        horizontalLineTo(8.0587f)
        curveTo(7.7663f, 24.4118f, 7.5293f, 24.1748f, 7.5293f, 23.8824f)
        verticalLineTo(12.5882f)
        curveTo(7.5293f, 12.2959f, 7.7663f, 12.0588f, 8.0587f, 12.0588f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(15.9645f, 14.3176f)
        curveTo(13.8013f, 14.3176f, 12.0469f, 16.072f, 12.0469f, 18.2353f)
        curveTo(12.0469f, 20.3985f, 13.8013f, 22.1529f, 15.9645f, 22.1529f)
        curveTo(18.1278f, 22.1529f, 19.8822f, 20.3985f, 19.8822f, 18.2353f)
        curveTo(19.8822f, 16.072f, 18.1278f, 14.3176f, 15.9645f, 14.3176f)
        close()
        moveTo(15.9645f, 15.3764f)
        curveTo(17.543f, 15.3764f, 18.8233f, 16.6568f, 18.8233f, 18.2353f)
        curveTo(18.8233f, 19.8138f, 17.543f, 21.0941f, 15.9645f, 21.0941f)
        curveTo(14.386f, 21.0941f, 13.1057f, 19.8138f, 13.1057f, 18.2353f)
        curveTo(13.1057f, 16.6568f, 14.386f, 15.3764f, 15.9645f, 15.3764f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(10.0351f, 14.0354f)
        curveTo(10.3032f, 14.0354f, 10.5247f, 14.2346f, 10.5597f, 14.493f)
        lineTo(10.5646f, 14.5648f)
        verticalLineTo(21.906f)
        curveTo(10.5646f, 22.1984f, 10.3275f, 22.4354f, 10.0351f, 22.4354f)
        curveTo(9.7671f, 22.4354f, 9.5456f, 22.2362f, 9.5106f, 21.9778f)
        lineTo(9.5057f, 21.906f)
        verticalLineTo(14.5648f)
        curveTo(9.5057f, 14.2724f, 9.7428f, 14.0354f, 10.0351f, 14.0354f)
        close()
      }
      path(
        fill = SolidColor(Color.Black),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(15.9646f, 16.5764f)
        curveTo(15.0488f, 16.5764f, 14.3058f, 17.3194f, 14.3058f, 18.2352f)
        curveTo(14.3058f, 19.1511f, 15.0488f, 19.8941f, 15.9646f, 19.8941f)
        curveTo(16.8804f, 19.8941f, 17.6234f, 19.1511f, 17.6234f, 18.2352f)
        curveTo(17.6234f, 17.3194f, 16.8804f, 16.5764f, 15.9646f, 16.5764f)
        close()
        moveTo(15.9646f, 17.6352f)
        curveTo(16.2957f, 17.6352f, 16.5646f, 17.9042f, 16.5646f, 18.2352f)
        curveTo(16.5646f, 18.5663f, 16.2957f, 18.8352f, 15.9646f, 18.8352f)
        curveTo(15.6336f, 18.8352f, 15.3646f, 18.5663f, 15.3646f, 18.2352f)
        curveTo(15.3646f, 17.9042f, 15.6336f, 17.6352f, 15.9646f, 17.6352f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(17.9411f, 9.2353f)
        horizontalLineTo(13.9881f)
        curveTo(13.7544f, 9.2353f, 13.5482f, 9.3887f, 13.4811f, 9.6126f)
        lineTo(12.634f, 12.4362f)
        curveTo(12.5321f, 12.7758f, 12.7865f, 13.1177f, 13.1411f, 13.1177f)
        horizontalLineTo(18.7881f)
        curveTo(19.1428f, 13.1177f, 19.3971f, 12.7758f, 19.2952f, 12.4362f)
        lineTo(18.4482f, 9.6126f)
        curveTo(18.381f, 9.3887f, 18.1749f, 9.2353f, 17.9411f, 9.2353f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(9.1881f, 10.3647f)
        horizontalLineTo(11.4469f)
        curveTo(11.7393f, 10.3647f, 11.9763f, 10.6018f, 11.9763f, 10.8942f)
        verticalLineTo(12.5883f)
        curveTo(11.9763f, 12.8807f, 11.7393f, 13.1177f, 11.4469f, 13.1177f)
        horizontalLineTo(9.1881f)
        curveTo(8.8957f, 13.1177f, 8.6587f, 12.8807f, 8.6587f, 12.5883f)
        verticalLineTo(10.8942f)
        curveTo(8.6587f, 10.6018f, 8.8957f, 10.3647f, 9.1881f, 10.3647f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = MarkersTakIcons.Moneyshot)
