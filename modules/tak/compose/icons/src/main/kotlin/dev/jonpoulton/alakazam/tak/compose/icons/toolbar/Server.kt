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

public val ToolbarTakIcons.Server: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Server",
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
        moveTo(27.3255f, 18.8975f)
        curveTo(29.3165f, 18.1775f, 30.0295f, 17.3545f, 30.0295f, 16.8255f)
        verticalLineTo(11.7725f)
        curveTo(29.3535f, 12.2155f, 28.6265f, 12.5735f, 27.8635f, 12.8385f)
        curveTo(25.7005f, 13.6215f, 22.8365f, 14.0535f, 19.8055f, 14.0535f)
        curveTo(16.7755f, 14.0535f, 13.9135f, 13.6215f, 11.7505f, 12.8385f)
        curveTo(10.9875f, 12.5735f, 10.2605f, 12.2155f, 9.5855f, 11.7725f)
        verticalLineTo(16.8255f)
        curveTo(9.5855f, 17.3545f, 10.2985f, 18.1775f, 12.2905f, 18.8975f)
        curveTo(14.2845f, 19.6195f, 16.9575f, 20.0165f, 19.8085f, 20.0165f)
        curveTo(22.6605f, 20.0165f, 25.3315f, 19.6195f, 27.3255f, 18.8975f)
        close()
        moveTo(27.3255f, 26.4465f)
        curveTo(29.3165f, 25.7255f, 30.0295f, 24.9035f, 30.0295f, 24.3745f)
        verticalLineTo(19.3225f)
        curveTo(29.3535f, 19.7645f, 28.6265f, 20.1225f, 27.8635f, 20.3885f)
        curveTo(25.7015f, 21.1705f, 22.8375f, 21.6015f, 19.8055f, 21.6015f)
        curveTo(16.7745f, 21.6015f, 13.9135f, 21.1705f, 11.7505f, 20.3885f)
        curveTo(10.9875f, 20.1225f, 10.2595f, 19.7645f, 9.5855f, 19.3225f)
        verticalLineTo(24.3745f)
        curveTo(9.5855f, 24.9035f, 10.2985f, 25.7255f, 12.2905f, 26.4465f)
        curveTo(14.2845f, 27.1685f, 16.9575f, 27.5655f, 19.8085f, 27.5655f)
        curveTo(22.6605f, 27.5655f, 25.3315f, 27.1685f, 27.3255f, 26.4465f)
        close()
        moveTo(28.7955f, 33.3765f)
        curveTo(29.5785f, 32.9155f, 30.0295f, 32.4045f, 30.0295f, 31.9745f)
        verticalLineTo(26.8715f)
        curveTo(29.3535f, 27.3135f, 28.6265f, 27.6715f, 27.8635f, 27.9365f)
        curveTo(25.7015f, 28.7205f, 22.8375f, 29.1505f, 19.8055f, 29.1505f)
        curveTo(16.7745f, 29.1505f, 13.9135f, 28.7205f, 11.7505f, 27.9365f)
        curveTo(10.9875f, 27.6715f, 10.2595f, 27.3135f, 9.5855f, 26.8715f)
        verticalLineTo(31.9745f)
        curveTo(9.5855f, 32.5055f, 10.2985f, 33.3275f, 12.2895f, 34.0485f)
        curveTo(14.2835f, 34.7695f, 16.9565f, 35.1675f, 19.8075f, 35.1675f)
        curveTo(21.4855f, 35.1735f, 23.1615f, 35.0235f, 24.8105f, 34.7195f)
        curveTo(26.4625f, 34.4025f, 27.8415f, 33.9375f, 28.7955f, 33.3765f)
        close()
        moveTo(19.8065f, 6.0845f)
        curveTo(16.9565f, 6.0845f, 14.2875f, 6.4825f, 12.2925f, 7.2035f)
        curveTo(10.3005f, 7.9255f, 9.5915f, 8.7475f, 9.5915f, 9.2765f)
        curveTo(9.5915f, 9.8045f, 10.3005f, 10.6275f, 12.2925f, 11.3475f)
        curveTo(14.2875f, 12.0705f, 16.9565f, 12.4675f, 19.8065f, 12.4675f)
        curveTo(22.6585f, 12.4675f, 25.3275f, 12.0705f, 27.3215f, 11.3475f)
        verticalLineTo(11.3485f)
        curveTo(29.3135f, 10.6275f, 30.0235f, 9.8055f, 30.0235f, 9.2765f)
        curveTo(30.0235f, 8.7475f, 29.3135f, 7.9255f, 27.3215f, 7.2045f)
        curveTo(25.3275f, 6.4825f, 22.6585f, 6.0845f, 19.8065f, 6.0845f)
        close()
        moveTo(19.8085f, 4.4995f)
        curveTo(22.8395f, 4.4995f, 25.7005f, 4.9305f, 27.8645f, 5.7135f)
        curveTo(30.9615f, 6.8345f, 31.6145f, 8.2695f, 31.6145f, 9.2765f)
        verticalLineTo(31.9745f)
        curveTo(31.6145f, 33.9155f, 29.2415f, 35.4835f, 25.1105f, 36.2755f)
        curveTo(23.3605f, 36.5985f, 21.5855f, 36.7585f, 19.8055f, 36.7525f)
        curveTo(16.7745f, 36.7525f, 13.9135f, 36.3205f, 11.7505f, 35.5385f)
        curveTo(8.6525f, 34.4175f, 8.0005f, 32.9825f, 8.0005f, 31.9745f)
        verticalLineTo(9.2765f)
        curveTo(8.0005f, 8.2695f, 8.6535f, 6.8345f, 11.7515f, 5.7135f)
        curveTo(13.9145f, 4.9305f, 16.7785f, 4.4995f, 19.8085f, 4.4995f)
        close()
        moveTo(17.9841f, 16.1087f)
        horizontalLineTo(21.6301f)
        curveTo(22.0671f, 16.1087f, 22.4221f, 16.4637f, 22.4221f, 16.9017f)
        curveTo(22.4221f, 17.3387f, 22.0671f, 17.6937f, 21.6301f, 17.6937f)
        horizontalLineTo(17.9841f)
        curveTo(17.5471f, 17.6937f, 17.1931f, 17.3387f, 17.1931f, 16.9017f)
        curveTo(17.1931f, 16.4637f, 17.5471f, 16.1087f, 17.9841f, 16.1087f)
        close()
        moveTo(21.6301f, 23.5579f)
        horizontalLineTo(17.9841f)
        curveTo(17.5471f, 23.5579f, 17.1931f, 23.9119f, 17.1931f, 24.3499f)
        curveTo(17.1931f, 24.7869f, 17.5471f, 25.1429f, 17.9841f, 25.1429f)
        horizontalLineTo(21.6301f)
        curveTo(22.0671f, 25.1429f, 22.4221f, 24.7869f, 22.4221f, 24.3499f)
        curveTo(22.4221f, 23.9119f, 22.0671f, 23.5579f, 21.6301f, 23.5579f)
        close()
        moveTo(17.9841f, 31.2445f)
        horizontalLineTo(21.6301f)
        curveTo(22.0671f, 31.2445f, 22.4221f, 31.5985f, 22.4221f, 32.0365f)
        curveTo(22.4221f, 32.4745f, 22.0671f, 32.8295f, 21.6301f, 32.8295f)
        horizontalLineTo(17.9841f)
        curveTo(17.5471f, 32.8295f, 17.1931f, 32.4745f, 17.1931f, 32.0365f)
        curveTo(17.1931f, 31.5985f, 17.5471f, 31.2445f, 17.9841f, 31.2445f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Server)
