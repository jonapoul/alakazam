package dev.jonpoulton.alakazam.tak.compose.icons.dropdown

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
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.DropdownTakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon

public val DropdownTakIcons.RotationLockAlt: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RotationLockAlt",
      defaultWidth = 30.0.dp,
      defaultHeight = 35.0.dp,
      viewportWidth = 30.0f,
      viewportHeight = 35.0f,
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
        moveTo(24.5519f, 10.782f)
        lineTo(25.1425f, 8.4846f)
        curveTo(25.2205f, 8.1838f, 25.5273f, 8.0031f, 25.828f, 8.0796f)
        curveTo(26.1288f, 8.1576f, 26.3088f, 8.4666f, 26.2323f, 8.7651f)
        lineTo(25.2768f, 12.4836f)
        curveTo(25.2048f, 12.7612f, 24.9379f, 12.9365f, 24.6608f, 12.9017f)
        curveTo(24.5702f, 12.913f, 24.4755f, 12.9024f, 24.3847f, 12.8665f)
        lineTo(20.5537f, 11.3463f)
        curveTo(20.3324f, 11.2585f, 20.1982f, 11.047f, 20.1982f, 10.8235f)
        curveTo(20.1982f, 10.7545f, 20.2109f, 10.684f, 20.2379f, 10.6165f)
        curveTo(20.3527f, 10.3278f, 20.6797f, 10.186f, 20.9677f, 10.3008f)
        lineTo(23.5692f, 11.3324f)
        curveTo(22.0074f, 8.1729f, 18.7759f, 6.125f, 15.1734f, 6.125f)
        curveTo(11.0919f, 6.125f, 7.5091f, 8.7335f, 6.2581f, 12.6147f)
        curveTo(6.1629f, 12.9102f, 5.8456f, 13.073f, 5.5501f, 12.9777f)
        curveTo(5.3116f, 12.9005f, 5.1601f, 12.68f, 5.1601f, 12.4422f)
        curveTo(5.1601f, 12.3852f, 5.1691f, 12.3275f, 5.1871f, 12.2697f)
        curveTo(6.5889f, 7.922f, 10.6014f, 5.0f, 15.1734f, 5.0f)
        curveTo(19.1886f, 5.0f, 22.7928f, 7.2711f, 24.5519f, 10.782f)
        close()
        moveTo(8.7399f, 20.3392f)
        lineTo(6.4395f, 18.8754f)
        curveTo(7.8219f, 22.429f, 11.3171f, 24.8556f, 15.1731f, 24.8556f)
        curveTo(19.2284f, 24.8556f, 22.8036f, 22.2697f, 24.0711f, 18.4214f)
        curveTo(24.1679f, 18.1267f, 24.4859f, 17.9662f, 24.7806f, 18.0637f)
        curveTo(25.0761f, 18.1604f, 25.2366f, 18.4754f, 25.1391f, 18.7732f)
        curveTo(23.7201f, 23.0842f, 19.7151f, 25.9806f, 15.1731f, 25.9806f)
        curveTo(10.7306f, 25.9806f, 6.8539f, 23.2572f, 5.3352f, 19.1405f)
        lineTo(4.2986f, 21.338f)
        curveTo(4.1659f, 21.6185f, 3.8314f, 21.7393f, 3.5501f, 21.6073f)
        curveTo(3.3469f, 21.5113f, 3.2276f, 21.308f, 3.2276f, 21.0973f)
        curveTo(3.2276f, 21.0178f, 3.2449f, 20.9353f, 3.2816f, 20.858f)
        lineTo(4.9196f, 17.3855f)
        curveTo(5.0424f, 17.1261f, 5.3376f, 17.0034f, 5.6038f, 17.0907f)
        curveTo(5.6945f, 17.0968f, 5.7851f, 17.125f, 5.8674f, 17.1772f)
        lineTo(9.3444f, 19.3897f)
        curveTo(9.6069f, 19.5562f, 9.6841f, 19.9042f, 9.5169f, 20.1667f)
        curveTo(9.3496f, 20.4285f, 9.0024f, 20.5065f, 8.7399f, 20.3392f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Cyber),
        stroke = null, fillAlpha = 0.2f,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.0f, 25.0f)
        moveToRelative(-6.0f, 0.0f)
        arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f)
        arcToRelative(6.0f, 6.0f, 0.0f, true, true, -12.0f, 0.0f)
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Cyber),
        strokeLineWidth = 0.33f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = NonZero,
      ) {
        moveTo(24.0f, 25.0f)
        moveToRelative(-5.835f, 0.0f)
        arcToRelative(5.835f, 5.835f, 0.0f, true, true, 11.67f, 0.0f)
        arcToRelative(5.835f, 5.835f, 0.0f, true, true, -11.67f, 0.0f)
      }
      path(
        fill = SolidColor(TakColors.Cyber),
        stroke = null,
        strokeLineWidth = 0.0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4.0f,
        pathFillType = EvenOdd,
      ) {
        moveTo(25.3162f, 23.2331f)
        curveTo(25.2713f, 22.5465f, 24.697f, 22.0f, 23.9994f, 22.0f)
        lineTo(23.9124f, 22.0028f)
        curveTo(23.2258f, 22.0477f, 22.6793f, 22.622f, 22.6793f, 23.3196f)
        lineTo(22.6789f, 23.8088f)
        lineTo(22.2146f, 23.8089f)
        curveTo(21.9995f, 23.8089f, 21.8251f, 23.9832f, 21.8251f, 24.1984f)
        verticalLineTo(27.6105f)
        curveTo(21.8251f, 27.8256f, 21.9995f, 28.0f, 22.2146f, 28.0f)
        horizontalLineTo(25.7833f)
        curveTo(25.9984f, 28.0f, 26.1728f, 27.8256f, 26.1728f, 27.6105f)
        verticalLineTo(24.1984f)
        lineTo(26.1692f, 24.1455f)
        curveTo(26.1435f, 23.9554f, 25.9805f, 23.8089f, 25.7833f, 23.8089f)
        lineTo(25.3188f, 23.8088f)
        lineTo(25.319f, 23.3196f)
        lineTo(25.3162f, 23.2331f)
        close()
        moveTo(22.6041f, 24.5875f)
        horizontalLineTo(25.3935f)
        verticalLineTo(27.2207f)
        horizontalLineTo(22.6041f)
        verticalLineTo(24.5875f)
        close()
        moveTo(23.9994f, 22.779f)
        curveTo(23.7223f, 22.779f, 23.4912f, 22.9917f, 23.4616f, 23.261f)
        lineTo(23.4584f, 23.3195f)
        lineTo(23.458f, 23.8088f)
        horizontalLineTo(24.5398f)
        lineTo(24.54f, 23.3195f)
        curveTo(24.54f, 23.0429f, 24.3273f, 22.8118f, 24.058f, 22.7822f)
        lineTo(23.9994f, 22.779f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = DropdownTakIcons.RotationLockAlt)
