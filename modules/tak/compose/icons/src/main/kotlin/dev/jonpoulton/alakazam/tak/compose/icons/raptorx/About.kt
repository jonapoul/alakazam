package dev.jonpoulton.alakazam.tak.compose.icons.raptorx

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RaptorXTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RaptorXTakIcons.About: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "About",
      defaultWidth = 30.0.dp,
      defaultHeight = 31.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 31.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(25.25f, 15.5f)
        curveTo(25.25f, 21.1609f, 20.6609f, 25.75f, 15.0f, 25.75f)
        verticalLineTo(27.25f)
        curveTo(21.4893f, 27.25f, 26.75f, 21.9893f, 26.75f, 15.5f)
        horizontalLineTo(25.25f)
        close()
        moveTo(15.0f, 25.75f)
        curveTo(9.3391f, 25.75f, 4.75f, 21.1609f, 4.75f, 15.5f)
        horizontalLineTo(3.25f)
        curveTo(3.25f, 21.9893f, 8.5106f, 27.25f, 15.0f, 27.25f)
        verticalLineTo(25.75f)
        close()
        moveTo(4.75f, 15.5f)
        curveTo(4.75f, 9.8391f, 9.3391f, 5.25f, 15.0f, 5.25f)
        verticalLineTo(3.75f)
        curveTo(8.5106f, 3.75f, 3.25f, 9.0106f, 3.25f, 15.5f)
        horizontalLineTo(4.75f)
        close()
        moveTo(15.0f, 5.25f)
        curveTo(20.6609f, 5.25f, 25.25f, 9.8391f, 25.25f, 15.5f)
        horizontalLineTo(26.75f)
        curveTo(26.75f, 9.0106f, 21.4893f, 3.75f, 15.0f, 3.75f)
        verticalLineTo(5.25f)
        close()
      }
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(14.9947f, 13.0412f)
        curveTo(15.9533f, 13.0412f, 16.7303f, 12.2641f, 16.7303f, 11.3055f)
        curveTo(16.7303f, 10.3469f, 15.9533f, 9.5698f, 14.9947f, 9.5698f)
        curveTo(14.0361f, 9.5698f, 13.259f, 10.3469f, 13.259f, 11.3055f)
        curveTo(13.259f, 12.2641f, 14.0361f, 13.0412f, 14.9947f, 13.0412f)
        close()
        moveTo(13.43f, 13.9089f)
        curveTo(13.0158f, 13.9089f, 12.68f, 14.2447f, 12.68f, 14.6589f)
        verticalLineTo(15.1839f)
        curveTo(12.68f, 15.5981f, 13.0158f, 15.9339f, 13.43f, 15.9339f)
        horizontalLineTo(13.5478f)
        lineTo(13.5478f, 19.4054f)
        horizontalLineTo(13.43f)
        curveTo(13.0158f, 19.4054f, 12.68f, 19.7412f, 12.68f, 20.1554f)
        verticalLineTo(20.6804f)
        curveTo(12.68f, 21.0946f, 13.0158f, 21.4304f, 13.43f, 21.4304f)
        horizontalLineTo(16.5584f)
        curveTo(16.9726f, 21.4304f, 17.3084f, 21.0946f, 17.3084f, 20.6804f)
        verticalLineTo(20.1554f)
        curveTo(17.3084f, 19.7412f, 16.9726f, 19.4054f, 16.5584f, 19.4054f)
        horizontalLineTo(16.4405f)
        lineTo(16.4405f, 15.527f)
        curveTo(16.4405f, 15.468f, 16.4337f, 15.4107f, 16.4209f, 15.3557f)
        curveTo(16.4338f, 15.3005f, 16.4407f, 15.243f, 16.4407f, 15.1839f)
        verticalLineTo(14.6589f)
        curveTo(16.4407f, 14.2447f, 16.1049f, 13.9089f, 15.6907f, 13.9089f)
        horizontalLineTo(13.43f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RaptorXTakIcons.About)
