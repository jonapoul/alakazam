package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

val ToolbarTakIcons.RubberSheet: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "RubberSheet",
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
        pathFillType = NonZero,
      ) {
        moveTo(15.9678f, 31.8015f)
        curveTo(11.602f, 28.7307f, 7.3102f, 25.7154f, 3.0f, 22.6815f)
        curveTo(6.4778f, 18.4823f, 10.7881f, 17.1874f, 16.0233f, 18.6303f)
        curveTo(16.0233f, 18.5193f, 16.0233f, 18.4268f, 16.0233f, 18.3158f)
        curveTo(15.5608f, 18.0568f, 15.0983f, 17.7978f, 14.6358f, 17.5388f)
        curveTo(12.6934f, 16.4474f, 11.9165f, 14.764f, 12.3235f, 12.5811f)
        curveTo(12.7304f, 10.4537f, 14.5433f, 8.6223f, 16.5412f, 8.5113f)
        curveTo(17.4292f, 8.4558f, 18.4096f, 8.6039f, 19.2236f, 8.9553f)
        curveTo(23.6078f, 10.8052f, 27.9366f, 12.8401f, 32.3393f, 14.616f)
        curveTo(36.0206f, 16.0959f, 36.4276f, 19.4257f, 35.7246f, 21.9416f)
        curveTo(34.7442f, 25.4379f, 31.8954f, 27.7133f, 28.3436f, 27.1028f)
        curveTo(23.2008f, 26.1963f, 19.2606f, 27.9167f, 15.9678f, 31.8015f)
        close()
        moveTo(15.7273f, 30.4326f)
        curveTo(15.9308f, 30.2476f, 16.1158f, 30.0811f, 16.3007f, 29.9146f)
        curveTo(19.6306f, 26.5848f, 23.4783f, 25.0309f, 28.2696f, 25.9559f)
        curveTo(31.8954f, 26.6588f, 35.0772f, 23.7915f, 35.0402f, 20.0917f)
        curveTo(35.0217f, 18.5008f, 34.4667f, 17.0949f, 33.0238f, 16.2809f)
        curveTo(31.7104f, 15.541f, 30.3599f, 15.6334f, 29.065f, 16.3734f)
        curveTo(27.3261f, 17.3723f, 26.3272f, 19.6107f, 26.7896f, 21.5346f)
        curveTo(27.0856f, 22.8295f, 27.8256f, 23.7545f, 29.213f, 24.032f)
        curveTo(31.4884f, 24.4944f, 33.5233f, 22.4596f, 33.2458f, 19.9992f)
        curveTo(33.0793f, 18.5378f, 31.8769f, 17.6313f, 30.4339f, 17.8903f)
        curveTo(29.176f, 18.1123f, 28.2881f, 19.5737f, 28.621f, 20.8686f)
        curveTo(28.8615f, 21.8491f, 29.9715f, 22.4226f, 30.7669f, 21.9231f)
        curveTo(31.0999f, 21.7011f, 31.3774f, 21.2386f, 31.4699f, 20.8316f)
        curveTo(31.5254f, 20.5727f, 31.2109f, 20.0362f, 30.9704f, 19.9807f)
        curveTo(30.2304f, 19.7957f, 30.2859f, 19.3517f, 30.3414f, 18.8338f)
        curveTo(31.5069f, 18.5933f, 32.3393f, 19.1667f, 32.4873f, 20.2582f)
        curveTo(32.6723f, 21.7566f, 31.5994f, 23.144f, 30.138f, 23.255f)
        curveTo(28.7505f, 23.366f, 27.5851f, 22.2561f, 27.4926f, 20.7577f)
        curveTo(27.3631f, 18.8893f, 28.6395f, 17.1319f, 30.3784f, 16.7804f)
        curveTo(32.0248f, 16.4474f, 33.4678f, 17.2614f, 34.0412f, 18.8523f)
        curveTo(34.6887f, 20.6282f, 34.0412f, 22.848f, 32.4688f, 24.1985f)
        curveTo(30.9704f, 25.4749f, 29.25f, 25.6229f, 27.4186f, 24.6054f)
        curveTo(24.3663f, 22.922f, 21.314f, 21.2386f, 18.2801f, 19.5552f)
        curveTo(18.0211f, 19.4072f, 17.7252f, 19.2777f, 17.4292f, 19.2592f)
        curveTo(15.9678f, 19.1852f, 14.4878f, 19.2222f, 13.0449f, 19.0558f)
        curveTo(9.5671f, 18.6673f, 6.8663f, 20.1102f, 4.4059f, 22.4966f)
        curveTo(8.2537f, 25.1974f, 11.972f, 27.8058f, 15.7273f, 30.4326f)
        close()
        moveTo(30.0455f, 14.6715f)
        curveTo(29.2685f, 14.3385f, 28.6025f, 14.061f, 27.9181f, 13.7651f)
        curveTo(24.7918f, 12.3961f, 21.6839f, 10.9902f, 18.5391f, 9.6583f)
        curveTo(16.6337f, 8.8628f, 14.5618f, 9.7693f, 13.6184f, 11.7487f)
        curveTo(12.6565f, 13.7466f, 13.2299f, 15.6704f, 15.1353f, 16.7249f)
        curveTo(18.3911f, 18.5378f, 21.6469f, 20.3322f, 24.9028f, 22.1266f)
        curveTo(25.1802f, 22.2746f, 25.4577f, 22.4041f, 25.8092f, 22.589f)
        curveTo(25.0692f, 18.9448f, 26.7711f, 15.9294f, 30.0455f, 14.6715f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
