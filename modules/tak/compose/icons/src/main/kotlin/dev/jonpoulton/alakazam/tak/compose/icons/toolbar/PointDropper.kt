package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

public val ToolbarTakIcons.PointDropper: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "PointDropper",
      defaultWidth = 40.0.dp,
      defaultHeight = 41.0.dp,
      viewportWidth = 40.0f,
      viewportHeight = 41.0f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(30.7588f, 16.3792f)
        curveTo(30.7588f, 9.8184f, 25.4403f, 4.5002f, 18.8798f, 4.5002f)
        curveTo(12.3184f, 4.5002f, 6.9998f, 9.8182f, 6.9998f, 16.3792f)
        curveTo(6.9998f, 18.4587f, 8.1024f, 21.2f, 10.0733f, 24.4941f)
        curveTo(10.8389f, 25.7737f, 11.7232f, 27.1132f, 12.7032f, 28.4937f)
        curveTo(13.9312f, 30.2234f, 15.2455f, 31.9297f, 16.5598f, 33.5391f)
        curveTo(17.0198f, 34.1024f, 17.4472f, 34.6136f, 17.831f, 35.0634f)
        lineTo(18.0399f, 35.3073f)
        lineTo(18.8797f, 36.2633f)
        lineTo(19.4419f, 35.6267f)
        lineTo(19.7446f, 35.2782f)
        lineTo(20.4743f, 34.4172f)
        curveTo(20.9266f, 33.8764f, 21.4088f, 33.2872f, 21.9109f, 32.6581f)
        lineTo(20.7386f, 31.7224f)
        lineTo(20.3715f, 32.1796f)
        curveTo(19.8873f, 32.7791f, 19.4254f, 33.337f, 18.9957f, 33.8448f)
        lineTo(18.88f, 33.9809f)
        lineTo(18.7407f, 33.8174f)
        curveTo(18.5831f, 33.6311f, 18.4189f, 33.4352f, 18.2489f, 33.2305f)
        lineTo(17.7216f, 32.5903f)
        curveTo(16.4273f, 31.0053f, 15.133f, 29.3251f, 13.9263f, 27.6253f)
        curveTo(12.9676f, 26.2749f, 12.1045f, 24.9675f, 11.3605f, 23.7239f)
        curveTo(9.5195f, 20.6471f, 8.4998f, 18.1117f, 8.4998f, 16.3792f)
        curveTo(8.4998f, 10.6467f, 13.1468f, 6.0002f, 18.8798f, 6.0002f)
        curveTo(24.6119f, 6.0002f, 29.2588f, 10.6468f, 29.2588f, 16.3792f)
        curveTo(29.2588f, 17.8852f, 28.4842f, 20.0112f, 27.0549f, 22.5874f)
        lineTo(28.3666f, 23.3151f)
        lineTo(28.5727f, 22.9387f)
        curveTo(29.985f, 20.3232f, 30.7588f, 18.1202f, 30.7588f, 16.3792f)
        close()
        moveTo(18.8792f, 12.9312f)
        curveTo(16.8259f, 12.9312f, 15.1612f, 14.596f, 15.1612f, 16.6492f)
        curveTo(15.1612f, 18.7025f, 16.8259f, 20.3672f, 18.8792f, 20.3672f)
        curveTo(20.9324f, 20.3672f, 22.5972f, 18.7025f, 22.5972f, 16.6492f)
        curveTo(22.5972f, 14.596f, 20.9324f, 12.9312f, 18.8792f, 12.9312f)
        close()
        moveTo(18.8792f, 14.4312f)
        curveTo(20.1039f, 14.4312f, 21.0972f, 15.4245f, 21.0972f, 16.6492f)
        curveTo(21.0972f, 17.874f, 20.1039f, 18.8672f, 18.8792f, 18.8672f)
        curveTo(17.6544f, 18.8672f, 16.6612f, 17.874f, 16.6612f, 16.6492f)
        curveTo(16.6612f, 15.4245f, 17.6544f, 14.4312f, 18.8792f, 14.4312f)
        close()
        moveTo(27.5513f, 24.7889f)
        curveTo(27.931f, 24.7889f, 28.2447f, 25.0711f, 28.2944f, 25.4372f)
        lineTo(28.3013f, 25.5389f)
        verticalLineTo(28.8758f)
        horizontalLineTo(31.6383f)
        curveTo(32.0525f, 28.8758f, 32.3883f, 29.2116f, 32.3883f, 29.6258f)
        curveTo(32.3883f, 30.0055f, 32.1061f, 30.3193f, 31.74f, 30.369f)
        lineTo(31.6383f, 30.3758f)
        horizontalLineTo(28.3013f)
        verticalLineTo(33.7129f)
        curveTo(28.3013f, 34.1272f, 27.9655f, 34.4629f, 27.5513f, 34.4629f)
        curveTo(27.1716f, 34.4629f, 26.8578f, 34.1808f, 26.8081f, 33.8147f)
        lineTo(26.8013f, 33.7129f)
        verticalLineTo(30.3758f)
        horizontalLineTo(23.4643f)
        curveTo(23.05f, 30.3758f, 22.7143f, 30.0401f, 22.7143f, 29.6258f)
        curveTo(22.7143f, 29.2461f, 22.9964f, 28.9324f, 23.3625f, 28.8827f)
        lineTo(23.4643f, 28.8758f)
        horizontalLineTo(26.8013f)
        verticalLineTo(25.5389f)
        curveTo(26.8013f, 25.1247f, 27.137f, 24.7889f, 27.5513f, 24.7889f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.PointDropper)
