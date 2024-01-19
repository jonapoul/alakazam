package dev.jonpoulton.alakazam.tak.compose.icons.utility

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakLegacyColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.UtilityTakIcons

public val UtilityTakIcons.Walking: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Walking",
      defaultWidth = 29.dp,
      defaultHeight = 29.dp,
      viewportWidth = 29f,
      viewportHeight = 29f,
    ).apply {
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(15.551f, 3.249f)
        moveToRelative(-2.7548f, 0.4471f)
        arcToRelative(
          2.7908f, 2.7908f, 125.7816f,
          true,
          true, 5.5096f, -0.8942f,
        )
        arcToRelative(
          2.7908f, 2.7908f, 125.7816f,
          true,
          true, -5.5096f, 0.8942f,
        )
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(17.5542f, 14.0397f)
        lineTo(19.6866f, 15.5711f)
        curveTo(20.302f, 16.0147f, 21.1464f, 15.8859f, 21.6044f, 15.2705f)
        curveTo(22.0624f, 14.6551f, 21.9336f, 13.7964f, 21.3325f, 13.3384f)
        lineTo(17.8547f, 10.7623f)
        lineTo(17.5542f, 14.0397f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(20.4737f, 19.8073f)
        lineTo(16.1516f, 15.8143f)
        lineTo(16.7956f, 8.4581f)
        curveTo(16.8529f, 7.8284f, 16.4521f, 7.2559f, 15.8367f, 7.0985f)
        lineTo(12.8026f, 6.2827f)
        curveTo(12.5593f, 6.2112f, 12.3017f, 6.2398f, 12.0871f, 6.3686f)
        lineTo(8.8955f, 8.0288f)
        curveTo(8.4233f, 8.272f, 8.1227f, 8.7443f, 8.0798f, 9.2739f)
        lineTo(7.6648f, 14.7839f)
        curveTo(7.6075f, 15.5567f, 8.1943f, 16.2293f, 8.9671f, 16.2723f)
        curveTo(9.7113f, 16.3152f, 10.3553f, 15.7571f, 10.4126f, 15.0272f)
        lineTo(10.8563f, 10.3043f)
        curveTo(10.8706f, 10.1898f, 10.9278f, 10.0896f, 11.0423f, 10.0467f)
        lineTo(12.1443f, 9.4885f)
        lineTo(11.5718f, 16.0862f)
        lineTo(17.7402f, 21.5104f)
        curveTo(17.9835f, 21.7393f, 18.1552f, 22.0399f, 18.2125f, 22.3691f)
        lineTo(18.9996f, 27.1635f)
        curveTo(19.1284f, 27.9506f, 19.8297f, 28.5088f, 20.6311f, 28.4515f)
        curveTo(21.5328f, 28.3943f, 22.1911f, 27.5642f, 22.048f, 26.6769f)
        lineTo(21.0748f, 20.9379f)
        curveTo(21.0032f, 20.4942f, 20.7886f, 20.1078f, 20.4737f, 19.8073f)
        close()
      }
      path(
        fill = SolidColor(TakLegacyColors.PaleSilver),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(8.266f, 27.8505f)
        curveTo(9.0674f, 28.194f, 9.9833f, 27.8362f, 10.3555f, 27.0491f)
        lineTo(13.8904f, 19.4496f)
        lineTo(11.3287f, 17.1454f)
        lineTo(7.4359f, 25.7038f)
        curveTo(7.0638f, 26.5339f, 7.4359f, 27.4927f, 8.266f, 27.8505f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = UtilityTakIcons.Walking)
