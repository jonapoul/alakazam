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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val ToolbarTakIcons.Brightness: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Brightness",
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
        moveTo(19.5724f, 11.3832f)
        curveTo(19.1584f, 11.3832f, 18.8224f, 11.0472f, 18.8224f, 10.6332f)
        verticalLineTo(6.2502f)
        curveTo(18.8224f, 5.8362f, 19.1584f, 5.5002f, 19.5724f, 5.5002f)
        curveTo(19.9864f, 5.5002f, 20.3224f, 5.8362f, 20.3224f, 6.2502f)
        verticalLineTo(10.6332f)
        curveTo(20.3224f, 11.0472f, 19.9864f, 11.3832f, 19.5724f, 11.3832f)
        close()
        moveTo(19.5724f, 14.4819f)
        curveTo(16.5864f, 14.4819f, 14.1574f, 16.9109f, 14.1574f, 19.8969f)
        curveTo(14.1574f, 22.8829f, 16.5864f, 25.3119f, 19.5724f, 25.3119f)
        curveTo(22.5584f, 25.3119f, 24.9874f, 22.8829f, 24.9874f, 19.8969f)
        curveTo(24.9874f, 16.9109f, 22.5584f, 14.4819f, 19.5724f, 14.4819f)
        close()
        moveTo(19.5724f, 26.8119f)
        curveTo(15.7594f, 26.8119f, 12.6574f, 23.7099f, 12.6574f, 19.8969f)
        curveTo(12.6574f, 16.0839f, 15.7594f, 12.9819f, 19.5724f, 12.9819f)
        curveTo(23.3854f, 12.9819f, 26.4874f, 16.0839f, 26.4874f, 19.8969f)
        curveTo(26.4874f, 23.7099f, 23.3854f, 26.8119f, 19.5724f, 26.8119f)
        close()
        moveTo(18.8224f, 33.8935f)
        curveTo(18.8224f, 34.3075f, 19.1584f, 34.6435f, 19.5724f, 34.6435f)
        curveTo(19.9864f, 34.6435f, 20.3224f, 34.3075f, 20.3224f, 33.8935f)
        verticalLineTo(29.5105f)
        curveTo(20.3224f, 29.0965f, 19.9864f, 28.7605f, 19.5724f, 28.7605f)
        curveTo(19.1584f, 28.7605f, 18.8224f, 29.0965f, 18.8224f, 29.5105f)
        verticalLineTo(33.8935f)
        close()
        moveTo(33.3937f, 20.8217f)
        horizontalLineTo(29.0107f)
        curveTo(28.5967f, 20.8217f, 28.2607f, 20.4857f, 28.2607f, 20.0717f)
        curveTo(28.2607f, 19.6577f, 28.5967f, 19.3217f, 29.0107f, 19.3217f)
        horizontalLineTo(33.3937f)
        curveTo(33.8077f, 19.3217f, 34.1437f, 19.6577f, 34.1437f, 20.0717f)
        curveTo(34.1437f, 20.4857f, 33.8077f, 20.8217f, 33.3937f, 20.8217f)
        close()
        moveTo(28.8158f, 30.3752f)
        curveTo(28.9618f, 30.5222f, 29.1538f, 30.5952f, 29.3458f, 30.5952f)
        curveTo(29.5378f, 30.5952f, 29.7298f, 30.5222f, 29.8758f, 30.3752f)
        curveTo(30.1688f, 30.0822f, 30.1688f, 29.6082f, 29.8758f, 29.3152f)
        lineTo(26.7768f, 26.2152f)
        curveTo(26.4838f, 25.9222f, 26.0088f, 25.9222f, 25.7158f, 26.2152f)
        curveTo(25.4228f, 26.5082f, 25.4228f, 26.9832f, 25.7158f, 27.2762f)
        lineTo(28.8158f, 30.3752f)
        close()
        moveTo(12.8985f, 14.1479f)
        curveTo(12.7065f, 14.1479f, 12.5145f, 14.0749f, 12.3685f, 13.9279f)
        lineTo(9.2685f, 10.8289f)
        curveTo(8.9755f, 10.5359f, 8.9755f, 10.0609f, 9.2685f, 9.7679f)
        curveTo(9.5615f, 9.4749f, 10.0365f, 9.4749f, 10.3295f, 9.7679f)
        lineTo(13.4285f, 12.8679f)
        curveTo(13.7215f, 13.1609f, 13.7215f, 13.6349f, 13.4285f, 13.9279f)
        curveTo(13.2825f, 14.0749f, 13.0905f, 14.1479f, 12.8985f, 14.1479f)
        close()
        moveTo(9.2689f, 30.3752f)
        curveTo(9.4149f, 30.5222f, 9.6069f, 30.5952f, 9.7989f, 30.5952f)
        curveTo(9.9909f, 30.5952f, 10.1829f, 30.5222f, 10.3289f, 30.3752f)
        lineTo(13.4289f, 27.2762f)
        curveTo(13.7219f, 26.9832f, 13.7219f, 26.5082f, 13.4289f, 26.2152f)
        curveTo(13.1359f, 25.9222f, 12.6609f, 25.9222f, 12.3679f, 26.2152f)
        lineTo(9.2689f, 29.3152f)
        curveTo(8.9759f, 29.6082f, 8.9759f, 30.0822f, 9.2689f, 30.3752f)
        close()
        moveTo(26.2462f, 14.1479f)
        curveTo(26.0542f, 14.1479f, 25.8622f, 14.0749f, 25.7162f, 13.9279f)
        curveTo(25.4232f, 13.6349f, 25.4232f, 13.1609f, 25.7162f, 12.8679f)
        lineTo(28.8152f, 9.7679f)
        curveTo(29.1082f, 9.4749f, 29.5832f, 9.4749f, 29.8762f, 9.7679f)
        curveTo(30.1692f, 10.0609f, 30.1692f, 10.5359f, 29.8762f, 10.8289f)
        lineTo(26.7762f, 13.9279f)
        curveTo(26.6302f, 14.0749f, 26.4382f, 14.1479f, 26.2462f, 14.1479f)
        close()
        moveTo(5.7501f, 20.8218f)
        horizontalLineTo(10.1331f)
        curveTo(10.5471f, 20.8218f, 10.8831f, 20.4858f, 10.8831f, 20.0718f)
        curveTo(10.8831f, 19.6578f, 10.5471f, 19.3218f, 10.1331f, 19.3218f)
        horizontalLineTo(5.7501f)
        curveTo(5.3361f, 19.3218f, 5.0001f, 19.6578f, 5.0001f, 20.0718f)
        curveTo(5.0001f, 20.4858f, 5.3361f, 20.8218f, 5.7501f, 20.8218f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Brightness)
