package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons

public val SideMenuTakIcons.Routes: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Routes",
      defaultWidth = 36.dp,
      defaultHeight = 37.dp,
      viewportWidth = 36f,
      viewportHeight = 37f,
    ).apply {
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(5.9999f, 21.8196f)
        curveTo(5.9999f, 19.1274f, 8.0267f, 16.9441f, 10.5264f, 16.9441f)
        curveTo(13.0267f, 16.9441f, 15.0537f, 19.1273f, 15.0537f, 21.8196f)
        curveTo(15.0537f, 22.6898f, 14.6439f, 23.7871f, 13.9146f, 25.0996f)
        curveTo(13.6368f, 25.5996f, 13.3166f, 26.122f, 12.9621f, 26.6597f)
        curveTo(12.5189f, 27.3321f, 12.045f, 27.9947f, 11.5711f, 28.6197f)
        curveTo(11.5296f, 28.6744f, 11.4889f, 28.7278f, 11.4489f, 28.7799f)
        lineTo(11.1125f, 29.212f)
        lineTo(10.5251f, 29.9332f)
        lineTo(10.0133f, 29.3037f)
        curveTo(9.9244f, 29.1927f, 9.8227f, 29.0635f, 9.7103f, 28.9182f)
        lineTo(9.3431f, 28.4355f)
        curveTo(8.8679f, 27.801f, 8.4017f, 27.14f, 7.9717f, 26.4771f)
        curveTo(6.7321f, 24.5662f, 5.9999f, 22.9841f, 5.9999f, 21.8196f)
        close()
        moveTo(8.9194f, 21.9236f)
        curveTo(8.9194f, 20.9679f, 9.6392f, 20.1927f, 10.5266f, 20.1927f)
        curveTo(11.4146f, 20.1927f, 12.1339f, 20.9677f, 12.1339f, 21.9236f)
        curveTo(12.1339f, 22.8795f, 11.4146f, 23.6545f, 10.5266f, 23.6545f)
        curveTo(9.6392f, 23.6545f, 8.9194f, 22.8793f, 8.9194f, 21.9236f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = EvenOdd,
      ) {
        moveTo(22.6475f, 10.448f)
        curveTo(22.6475f, 8.2674f, 24.2888f, 6.4998f, 26.3136f, 6.4998f)
        curveTo(28.3385f, 6.4998f, 29.9798f, 8.2674f, 29.9798f, 10.448f)
        curveTo(29.9798f, 11.1594f, 29.6523f, 12.0366f, 29.0708f, 13.0832f)
        curveTo(28.8513f, 13.4785f, 28.5985f, 13.8908f, 28.3188f, 14.3151f)
        curveTo(27.9697f, 14.8446f, 27.5967f, 15.366f, 27.2237f, 15.8578f)
        curveTo(27.1802f, 15.9152f, 27.1377f, 15.9708f, 27.0963f, 16.0246f)
        lineTo(26.8626f, 16.324f)
        lineTo(26.3136f, 16.9973f)
        lineTo(25.9048f, 16.4987f)
        lineTo(25.6515f, 16.1802f)
        lineTo(25.4036f, 15.8578f)
        curveTo(25.0306f, 15.366f, 24.6576f, 14.8446f, 24.3085f, 14.3151f)
        curveTo(24.0288f, 13.8908f, 23.776f, 13.4785f, 23.5565f, 13.0832f)
        curveTo(22.975f, 12.0366f, 22.6475f, 11.1594f, 22.6475f, 10.448f)
        close()
        moveTo(24.9358f, 10.5295f)
        curveTo(24.9358f, 9.7102f, 25.5529f, 9.0461f, 26.3133f, 9.0461f)
        curveTo(27.0742f, 9.0461f, 27.6915f, 9.71f, 27.6915f, 10.5295f)
        curveTo(27.6915f, 11.3489f, 27.0742f, 12.0129f, 26.3133f, 12.0129f)
        curveTo(25.5529f, 12.0129f, 24.9358f, 11.3487f, 24.9358f, 10.5295f)
        close()
      }
      path(
        fill = SolidColor(Color.Transparent),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 2f,
        strokeLineCap = Round,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(23.1429f, 17.5769f)
        horizontalLineTo(20.3314f)
        curveTo(18.8795f, 17.5769f, 17.6922f, 19.0016f, 17.6922f, 20.6511f)
        verticalLineTo(20.5771f)
        curveTo(17.6922f, 22.2266f, 18.8795f, 23.5766f, 20.3314f, 23.5766f)
        horizontalLineTo(23.3028f)
        horizontalLineTo(24.7893f)
        curveTo(26.2407f, 23.5766f, 27.4286f, 24.9266f, 27.4286f, 26.5767f)
        curveTo(27.4286f, 28.2263f, 26.2407f, 29.5769f, 24.7893f, 29.5769f)
        horizontalLineTo(15f)
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Routes)
