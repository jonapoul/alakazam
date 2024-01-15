package dev.jonpoulton.alakazam.tak.compose.icons.sidemenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.SideMenuTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val SideMenuTakIcons.Folder: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Folder",
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
        pathFillType = NonZero,
      ) {
        moveTo(25.7704f, 15.5624f)
        verticalLineTo(16.5763f)
        horizontalLineTo(12.5901f)
        curveTo(10.0555f, 16.5763f, 9.0416f, 18.604f, 9.0416f, 18.604f)
        lineTo(6f, 23.6734f)
        verticalLineTo(13.5347f)
        curveTo(6f, 13.5347f, 6f, 11f, 8.0277f, 11f)
        horizontalLineTo(14.6179f)
        curveTo(17.1526f, 11f, 17.1526f, 14.0416f, 17.1526f, 14.0416f)
        horizontalLineTo(24.2496f)
        curveTo(25.7704f, 14.0416f, 25.7704f, 15.5624f, 25.7704f, 15.5624f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(25.7704f, 16.5763f)
        verticalLineTo(17.0763f)
        horizontalLineTo(26.2704f)
        verticalLineTo(16.5763f)
        horizontalLineTo(25.7704f)
        close()
        moveTo(17.1526f, 14.0416f)
        horizontalLineTo(16.6526f)
        verticalLineTo(14.5416f)
        horizontalLineTo(17.1526f)
        verticalLineTo(14.0416f)
        close()
        moveTo(6f, 23.6734f)
        horizontalLineTo(5.5f)
        curveTo(5.5f, 23.8981f, 5.65f, 24.0952f, 5.8665f, 24.1552f)
        curveTo(6.0831f, 24.2152f, 6.3131f, 24.1233f, 6.4288f, 23.9306f)
        lineTo(6f, 23.6734f)
        close()
        moveTo(9.0416f, 18.604f)
        lineTo(9.4704f, 18.8613f)
        lineTo(9.4802f, 18.8448f)
        lineTo(9.4888f, 18.8276f)
        lineTo(9.0416f, 18.604f)
        close()
        moveTo(26.2704f, 16.5763f)
        verticalLineTo(15.5624f)
        horizontalLineTo(25.2704f)
        verticalLineTo(16.5763f)
        horizontalLineTo(26.2704f)
        close()
        moveTo(25.7704f, 15.5624f)
        curveTo(26.2704f, 15.5624f, 26.2704f, 15.5622f, 26.2704f, 15.5619f)
        curveTo(26.2704f, 15.5618f, 26.2704f, 15.5615f, 26.2704f, 15.5614f)
        curveTo(26.2704f, 15.561f, 26.2704f, 15.5606f, 26.2704f, 15.5602f)
        curveTo(26.2704f, 15.5593f, 26.2704f, 15.5584f, 26.2704f, 15.5573f)
        curveTo(26.2704f, 15.5553f, 26.2704f, 15.5528f, 26.2703f, 15.55f)
        curveTo(26.2702f, 15.5443f, 26.2701f, 15.5372f, 26.2698f, 15.5287f)
        curveTo(26.2692f, 15.5116f, 26.2682f, 15.489f, 26.2662f, 15.4614f)
        curveTo(26.2623f, 15.4066f, 26.2547f, 15.3314f, 26.2399f, 15.2426f)
        curveTo(26.2106f, 15.0673f, 26.1513f, 14.8259f, 26.0275f, 14.5784f)
        curveTo(25.9028f, 14.329f, 25.7079f, 14.0644f, 25.4062f, 13.8632f)
        curveTo(25.1013f, 13.66f, 24.7173f, 13.5416f, 24.2496f, 13.5416f)
        verticalLineTo(14.5416f)
        curveTo(24.5423f, 14.5416f, 24.7286f, 14.6133f, 24.8515f, 14.6953f)
        curveTo(24.9775f, 14.7793f, 25.0677f, 14.8948f, 25.1331f, 15.0256f)
        curveTo(25.1995f, 15.1584f, 25.2352f, 15.2972f, 25.2535f, 15.407f)
        curveTo(25.2624f, 15.4607f, 25.2667f, 15.5044f, 25.2687f, 15.5327f)
        curveTo(25.2697f, 15.5467f, 25.2702f, 15.5567f, 25.2703f, 15.562f)
        curveTo(25.2704f, 15.5646f, 25.2705f, 15.566f, 25.2705f, 15.5661f)
        curveTo(25.2705f, 15.5662f, 25.2705f, 15.5659f, 25.2704f, 15.5653f)
        curveTo(25.2704f, 15.565f, 25.2704f, 15.5646f, 25.2704f, 15.5641f)
        curveTo(25.2704f, 15.5639f, 25.2704f, 15.5636f, 25.2704f, 15.5633f)
        curveTo(25.2704f, 15.5632f, 25.2704f, 15.5629f, 25.2704f, 15.5629f)
        curveTo(25.2704f, 15.5626f, 25.2704f, 15.5624f, 25.7704f, 15.5624f)
        close()
        moveTo(24.2496f, 13.5416f)
        horizontalLineTo(17.1526f)
        verticalLineTo(14.5416f)
        horizontalLineTo(24.2496f)
        verticalLineTo(13.5416f)
        close()
        moveTo(17.1526f, 14.0416f)
        curveTo(17.6526f, 14.0416f, 17.6526f, 14.0414f, 17.6526f, 14.0412f)
        curveTo(17.6526f, 14.0411f, 17.6526f, 14.0408f, 17.6526f, 14.0406f)
        curveTo(17.6526f, 14.0403f, 17.6525f, 14.0399f, 17.6525f, 14.0394f)
        curveTo(17.6525f, 14.0385f, 17.6525f, 14.0374f, 17.6525f, 14.0361f)
        curveTo(17.6525f, 14.0335f, 17.6525f, 14.0302f, 17.6524f, 14.0262f)
        curveTo(17.6523f, 14.0181f, 17.6521f, 14.0072f, 17.6517f, 13.9936f)
        curveTo(17.651f, 13.9664f, 17.6495f, 13.9284f, 17.6467f, 13.8812f)
        curveTo(17.6411f, 13.7869f, 17.6301f, 13.6549f, 17.6082f, 13.4976f)
        curveTo(17.5648f, 13.1854f, 17.4772f, 12.7604f, 17.2973f, 12.3285f)
        curveTo(17.1175f, 11.897f, 16.8367f, 11.4377f, 16.3956f, 11.0848f)
        curveTo(15.9466f, 10.7257f, 15.36f, 10.5f, 14.6179f, 10.5f)
        verticalLineTo(11.5f)
        curveTo(15.1431f, 11.5f, 15.507f, 11.6546f, 15.7709f, 11.8657f)
        curveTo(16.0426f, 12.0831f, 16.2371f, 12.3842f, 16.3742f, 12.7131f)
        curveTo(16.511f, 13.0416f, 16.5818f, 13.377f, 16.6177f, 13.6351f)
        curveTo(16.6354f, 13.7629f, 16.6442f, 13.8685f, 16.6485f, 13.9406f)
        curveTo(16.6506f, 13.9766f, 16.6516f, 14.004f, 16.6521f, 14.0213f)
        curveTo(16.6524f, 14.03f, 16.6525f, 14.0362f, 16.6525f, 14.0396f)
        curveTo(16.6525f, 14.0413f, 16.6526f, 14.0424f, 16.6526f, 14.0427f)
        curveTo(16.6526f, 14.0429f, 16.6526f, 14.0429f, 16.6526f, 14.0427f)
        curveTo(16.6526f, 14.0426f, 16.6526f, 14.0425f, 16.6526f, 14.0423f)
        curveTo(16.6526f, 14.0422f, 16.6526f, 14.042f, 16.6526f, 14.042f)
        curveTo(16.6526f, 14.0418f, 16.6526f, 14.0416f, 17.1526f, 14.0416f)
        close()
        moveTo(14.6179f, 10.5f)
        horizontalLineTo(8.0277f)
        verticalLineTo(11.5f)
        horizontalLineTo(14.6179f)
        verticalLineTo(10.5f)
        close()
        moveTo(8.0277f, 10.5f)
        curveTo(7.4069f, 10.5f, 6.9127f, 10.6975f, 6.5354f, 11.0119f)
        curveTo(6.1669f, 11.319f, 5.9357f, 11.7155f, 5.7892f, 12.0816f)
        curveTo(5.6423f, 12.4489f, 5.5712f, 12.8091f, 5.5361f, 13.0725f)
        curveTo(5.5183f, 13.2056f, 5.5093f, 13.3173f, 5.5048f, 13.3972f)
        curveTo(5.5025f, 13.4373f, 5.5013f, 13.4696f, 5.5007f, 13.4929f)
        curveTo(5.5004f, 13.5045f, 5.5002f, 13.5139f, 5.5001f, 13.5209f)
        curveTo(5.5001f, 13.5245f, 5.5f, 13.5274f, 5.5f, 13.5297f)
        curveTo(5.5f, 13.5308f, 5.5f, 13.5318f, 5.5f, 13.5326f)
        curveTo(5.5f, 13.5331f, 5.5f, 13.5334f, 5.5f, 13.5338f)
        curveTo(5.5f, 13.5339f, 5.5f, 13.5342f, 5.5f, 13.5343f)
        curveTo(5.5f, 13.5345f, 5.5f, 13.5347f, 6f, 13.5347f)
        curveTo(6.5f, 13.5347f, 6.5f, 13.5349f, 6.5f, 13.535f)
        curveTo(6.5f, 13.5351f, 6.5f, 13.5352f, 6.5f, 13.5353f)
        curveTo(6.5f, 13.5355f, 6.5f, 13.5357f, 6.5f, 13.5358f)
        curveTo(6.5f, 13.536f, 6.5f, 13.5361f, 6.5f, 13.536f)
        curveTo(6.5f, 13.5359f, 6.5f, 13.5351f, 6.5f, 13.5339f)
        curveTo(6.5001f, 13.5313f, 6.5001f, 13.5264f, 6.5003f, 13.5195f)
        curveTo(6.5007f, 13.5057f, 6.5015f, 13.4835f, 6.5031f, 13.4543f)
        curveTo(6.5065f, 13.3956f, 6.5134f, 13.3093f, 6.5273f, 13.2047f)
        curveTo(6.5555f, 12.993f, 6.6111f, 12.7195f, 6.7177f, 12.453f)
        curveTo(6.8247f, 12.1855f, 6.9738f, 11.9483f, 7.1755f, 11.7802f)
        curveTo(7.3685f, 11.6194f, 7.6347f, 11.5f, 8.0277f, 11.5f)
        verticalLineTo(10.5f)
        close()
        moveTo(5.5f, 13.5347f)
        verticalLineTo(23.6734f)
        horizontalLineTo(6.5f)
        verticalLineTo(13.5347f)
        horizontalLineTo(5.5f)
        close()
        moveTo(6.4288f, 23.9306f)
        lineTo(9.4704f, 18.8613f)
        lineTo(8.6129f, 18.3468f)
        lineTo(5.5712f, 23.4161f)
        lineTo(6.4288f, 23.9306f)
        close()
        moveTo(9.0416f, 18.604f)
        curveTo(9.4888f, 18.8276f, 9.4887f, 18.8278f, 9.4886f, 18.828f)
        curveTo(9.4886f, 18.8281f, 9.4885f, 18.8283f, 9.4884f, 18.8284f)
        curveTo(9.4883f, 18.8286f, 9.4882f, 18.8288f, 9.4881f, 18.829f)
        curveTo(9.488f, 18.8293f, 9.4878f, 18.8296f, 9.4878f, 18.8297f)
        curveTo(9.4877f, 18.8299f, 9.4878f, 18.8296f, 9.4882f, 18.8289f)
        curveTo(9.4889f, 18.8275f, 9.4906f, 18.8243f, 9.4933f, 18.8194f)
        curveTo(9.4986f, 18.8096f, 9.5077f, 18.793f, 9.5209f, 18.7707f)
        curveTo(9.5472f, 18.7261f, 9.5892f, 18.6587f, 9.6476f, 18.5762f)
        curveTo(9.765f, 18.4106f, 9.9462f, 18.1872f, 10.1976f, 17.9638f)
        curveTo(10.696f, 17.5208f, 11.4692f, 17.0763f, 12.5901f, 17.0763f)
        verticalLineTo(16.0763f)
        curveTo(11.1764f, 16.0763f, 10.1754f, 16.6456f, 9.5332f, 17.2164f)
        curveTo(9.2142f, 17.5f, 8.9836f, 17.7836f, 8.8316f, 17.9982f)
        curveTo(8.7554f, 18.1057f, 8.6984f, 18.1968f, 8.6594f, 18.263f)
        curveTo(8.6398f, 18.2962f, 8.6247f, 18.3232f, 8.614f, 18.3431f)
        curveTo(8.6086f, 18.353f, 8.6043f, 18.3612f, 8.601f, 18.3675f)
        curveTo(8.5994f, 18.3706f, 8.598f, 18.3732f, 8.5969f, 18.3754f)
        curveTo(8.5964f, 18.3765f, 8.5959f, 18.3774f, 8.5955f, 18.3783f)
        curveTo(8.5953f, 18.3787f, 8.595f, 18.3791f, 8.5949f, 18.3794f)
        curveTo(8.5948f, 18.3796f, 8.5947f, 18.3799f, 8.5946f, 18.3799f)
        curveTo(8.5945f, 18.3802f, 8.5944f, 18.3804f, 9.0416f, 18.604f)
        close()
        moveTo(12.5901f, 17.0763f)
        horizontalLineTo(25.7704f)
        verticalLineTo(16.0763f)
        horizontalLineTo(12.5901f)
        verticalLineTo(17.0763f)
        close()
      }
      path(
        fill = SolidColor(TakColors.Sand),
        stroke = SolidColor(TakColors.Sand),
        strokeLineWidth = 1f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(28.9388f, 19.111f)
        horizontalLineTo(13.7308f)
        curveTo(12.21f, 19.111f, 11.703f, 20.1248f, 11.703f, 20.1248f)
        lineTo(7.6476f, 25.7011f)
        lineTo(7.1406f, 26.715f)
        horizontalLineTo(24.8833f)
        curveTo(24.8833f, 26.715f, 25.8972f, 26.715f, 26.9111f, 25.7011f)
        curveTo(27.9249f, 24.6872f, 29.9527f, 19.6179f, 29.9527f, 19.6179f)
        curveTo(29.9527f, 19.6179f, 30.3329f, 19.111f, 28.9388f, 19.111f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = SideMenuTakIcons.Folder)
