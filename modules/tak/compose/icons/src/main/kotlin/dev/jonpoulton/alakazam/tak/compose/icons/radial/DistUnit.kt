package dev.jonpoulton.alakazam.tak.compose.icons.radial

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
import dev.jonpoulton.alakazam.tak.compose.icons.PreviewIcon
import dev.jonpoulton.alakazam.tak.compose.icons.RadialTakIcons
import dev.jonpoulton.alakazam.tak.compose.preview.PreviewDark

public val RadialTakIcons.DistUnit: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "DistUnit",
      defaultWidth = 34.dp,
      defaultHeight = 35.dp,
      viewportWidth = 34f,
      viewportHeight = 35f,
    ).apply {
      path(
        fill = SolidColor(Color.White),
        stroke = null,
        strokeLineWidth = 0f,
        strokeLineCap = Butt,
        strokeLineJoin = Miter,
        strokeLineMiter = 4f,
        pathFillType = NonZero,
      ) {
        moveTo(10.9575f, 16.115f)
        curveTo(12.9375f, 16.115f, 14.3055f, 14.738f, 14.3055f, 12.965f)
        verticalLineTo(12.947f)
        curveTo(14.3055f, 11.174f, 12.9375f, 9.815f, 10.9575f, 9.815f)
        horizontalLineTo(9.1935f)
        curveTo(8.8065f, 9.815f, 8.5005f, 10.121f, 8.5005f, 10.508f)
        verticalLineTo(15.422f)
        curveTo(8.5005f, 15.809f, 8.8065f, 16.115f, 9.1935f, 16.115f)
        horizontalLineTo(10.9575f)
        close()
        moveTo(10.9575f, 14.864f)
        horizontalLineTo(9.8865f)
        verticalLineTo(11.066f)
        horizontalLineTo(10.9575f)
        curveTo(12.0915f, 11.066f, 12.8565f, 11.849f, 12.8565f, 12.965f)
        verticalLineTo(12.983f)
        curveTo(12.8565f, 14.099f, 12.0915f, 14.864f, 10.9575f, 14.864f)
        close()
        moveTo(16.5165f, 10.805f)
        curveTo(16.9485f, 10.805f, 17.2815f, 10.553f, 17.2815f, 10.157f)
        verticalLineTo(10.139f)
        curveTo(17.2815f, 9.743f, 16.9485f, 9.5f, 16.5165f, 9.5f)
        curveTo(16.0845f, 9.5f, 15.7515f, 9.743f, 15.7515f, 10.139f)
        verticalLineTo(10.157f)
        curveTo(15.7515f, 10.553f, 16.0845f, 10.805f, 16.5165f, 10.805f)
        close()
        moveTo(16.5165f, 16.169f)
        curveTo(16.8945f, 16.169f, 17.2005f, 15.863f, 17.2005f, 15.485f)
        verticalLineTo(11.921f)
        curveTo(17.2005f, 11.543f, 16.8945f, 11.237f, 16.5165f, 11.237f)
        curveTo(16.1385f, 11.237f, 15.8325f, 11.543f, 15.8325f, 11.921f)
        verticalLineTo(15.485f)
        curveTo(15.8325f, 15.863f, 16.1385f, 16.169f, 16.5165f, 16.169f)
        close()
        moveTo(20.5545f, 16.205f)
        curveTo(21.5985f, 16.205f, 22.3995f, 15.719f, 22.3995f, 14.648f)
        verticalLineTo(14.63f)
        curveTo(22.3995f, 13.748f, 21.6165f, 13.424f, 20.9415f, 13.199f)
        curveTo(20.4195f, 13.019f, 19.9605f, 12.893f, 19.9605f, 12.623f)
        verticalLineTo(12.605f)
        curveTo(19.9605f, 12.416f, 20.1315f, 12.272f, 20.4645f, 12.272f)
        curveTo(20.7525f, 12.272f, 21.1215f, 12.389f, 21.5085f, 12.578f)
        curveTo(21.5985f, 12.623f, 21.6615f, 12.641f, 21.7605f, 12.641f)
        curveTo(22.0665f, 12.641f, 22.3095f, 12.407f, 22.3095f, 12.101f)
        curveTo(22.3095f, 11.867f, 22.1835f, 11.687f, 21.9855f, 11.588f)
        curveTo(21.5175f, 11.354f, 20.9955f, 11.219f, 20.4915f, 11.219f)
        curveTo(19.5195f, 11.219f, 18.7275f, 11.768f, 18.7275f, 12.749f)
        verticalLineTo(12.767f)
        curveTo(18.7275f, 13.703f, 19.4925f, 14.018f, 20.1675f, 14.216f)
        curveTo(20.6985f, 14.378f, 21.1665f, 14.477f, 21.1665f, 14.774f)
        verticalLineTo(14.792f)
        curveTo(21.1665f, 15.008f, 20.9865f, 15.152f, 20.5905f, 15.152f)
        curveTo(20.2035f, 15.152f, 19.7445f, 15.008f, 19.2855f, 14.72f)
        curveTo(19.2135f, 14.675f, 19.1145f, 14.648f, 19.0155f, 14.648f)
        curveTo(18.7095f, 14.648f, 18.4755f, 14.882f, 18.4755f, 15.188f)
        curveTo(18.4755f, 15.404f, 18.5925f, 15.566f, 18.7365f, 15.656f)
        curveTo(19.3215f, 16.034f, 19.9605f, 16.205f, 20.5545f, 16.205f)
        close()
        moveTo(25.2945f, 16.196f)
        curveTo(25.5915f, 16.196f, 25.8255f, 16.16f, 26.0775f, 16.061f)
        curveTo(26.2665f, 15.989f, 26.4285f, 15.791f, 26.4285f, 15.548f)
        curveTo(26.4285f, 15.233f, 26.1675f, 14.981f, 25.8615f, 14.981f)
        curveTo(25.8345f, 14.981f, 25.7445f, 14.99f, 25.6995f, 14.99f)
        curveTo(25.3935f, 14.99f, 25.2585f, 14.837f, 25.2585f, 14.522f)
        verticalLineTo(12.461f)
        horizontalLineTo(25.8615f)
        curveTo(26.1855f, 12.461f, 26.4465f, 12.2f, 26.4465f, 11.876f)
        curveTo(26.4465f, 11.552f, 26.1855f, 11.291f, 25.8615f, 11.291f)
        horizontalLineTo(25.2585f)
        verticalLineTo(10.688f)
        curveTo(25.2585f, 10.31f, 24.9525f, 10.004f, 24.5745f, 10.004f)
        curveTo(24.1965f, 10.004f, 23.8905f, 10.31f, 23.8905f, 10.688f)
        verticalLineTo(11.291f)
        horizontalLineTo(23.8455f)
        curveTo(23.5215f, 11.291f, 23.2605f, 11.552f, 23.2605f, 11.876f)
        curveTo(23.2605f, 12.2f, 23.5215f, 12.461f, 23.8455f, 12.461f)
        horizontalLineTo(23.8905f)
        verticalLineTo(14.747f)
        curveTo(23.8905f, 15.863f, 24.4575f, 16.196f, 25.2945f, 16.196f)
        close()
        moveTo(7.638f, 25.205f)
        curveTo(8.331f, 25.205f, 8.736f, 24.836f, 9.051f, 24.431f)
        verticalLineTo(24.485f)
        curveTo(9.051f, 24.863f, 9.357f, 25.169f, 9.735f, 25.169f)
        curveTo(10.113f, 25.169f, 10.419f, 24.863f, 10.419f, 24.485f)
        verticalLineTo(20.921f)
        curveTo(10.419f, 20.543f, 10.113f, 20.237f, 9.735f, 20.237f)
        curveTo(9.357f, 20.237f, 9.051f, 20.543f, 9.051f, 20.921f)
        verticalLineTo(22.982f)
        curveTo(9.051f, 23.63f, 8.718f, 23.963f, 8.196f, 23.963f)
        curveTo(7.674f, 23.963f, 7.368f, 23.63f, 7.368f, 22.982f)
        verticalLineTo(20.921f)
        curveTo(7.368f, 20.543f, 7.062f, 20.237f, 6.684f, 20.237f)
        curveTo(6.306f, 20.237f, 6f, 20.543f, 6f, 20.921f)
        verticalLineTo(23.414f)
        curveTo(6f, 24.521f, 6.603f, 25.205f, 7.638f, 25.205f)
        close()
        moveTo(15.753f, 25.169f)
        curveTo(16.131f, 25.169f, 16.437f, 24.863f, 16.437f, 24.485f)
        verticalLineTo(21.992f)
        curveTo(16.437f, 20.885f, 15.834f, 20.201f, 14.799f, 20.201f)
        curveTo(14.106f, 20.201f, 13.701f, 20.57f, 13.386f, 20.975f)
        verticalLineTo(20.921f)
        curveTo(13.386f, 20.543f, 13.08f, 20.237f, 12.702f, 20.237f)
        curveTo(12.324f, 20.237f, 12.018f, 20.543f, 12.018f, 20.921f)
        verticalLineTo(24.485f)
        curveTo(12.018f, 24.863f, 12.324f, 25.169f, 12.702f, 25.169f)
        curveTo(13.08f, 25.169f, 13.386f, 24.863f, 13.386f, 24.485f)
        verticalLineTo(22.424f)
        curveTo(13.386f, 21.776f, 13.719f, 21.443f, 14.241f, 21.443f)
        curveTo(14.763f, 21.443f, 15.069f, 21.776f, 15.069f, 22.424f)
        verticalLineTo(24.485f)
        curveTo(15.069f, 24.863f, 15.375f, 25.169f, 15.753f, 25.169f)
        close()
        moveTo(18.747f, 19.805f)
        curveTo(19.179f, 19.805f, 19.512f, 19.553f, 19.512f, 19.157f)
        verticalLineTo(19.139f)
        curveTo(19.512f, 18.743f, 19.179f, 18.5f, 18.747f, 18.5f)
        curveTo(18.315f, 18.5f, 17.982f, 18.743f, 17.982f, 19.139f)
        verticalLineTo(19.157f)
        curveTo(17.982f, 19.553f, 18.315f, 19.805f, 18.747f, 19.805f)
        close()
        moveTo(18.747f, 25.169f)
        curveTo(19.125f, 25.169f, 19.431f, 24.863f, 19.431f, 24.485f)
        verticalLineTo(20.921f)
        curveTo(19.431f, 20.543f, 19.125f, 20.237f, 18.747f, 20.237f)
        curveTo(18.369f, 20.237f, 18.063f, 20.543f, 18.063f, 20.921f)
        verticalLineTo(24.485f)
        curveTo(18.063f, 24.863f, 18.369f, 25.169f, 18.747f, 25.169f)
        close()
        moveTo(22.722f, 25.196f)
        curveTo(23.019f, 25.196f, 23.253f, 25.16f, 23.505f, 25.061f)
        curveTo(23.694f, 24.989f, 23.856f, 24.791f, 23.856f, 24.548f)
        curveTo(23.856f, 24.233f, 23.595f, 23.981f, 23.289f, 23.981f)
        curveTo(23.262f, 23.981f, 23.172f, 23.99f, 23.127f, 23.99f)
        curveTo(22.821f, 23.99f, 22.686f, 23.837f, 22.686f, 23.522f)
        verticalLineTo(21.461f)
        horizontalLineTo(23.289f)
        curveTo(23.613f, 21.461f, 23.874f, 21.2f, 23.874f, 20.876f)
        curveTo(23.874f, 20.552f, 23.613f, 20.291f, 23.289f, 20.291f)
        horizontalLineTo(22.686f)
        verticalLineTo(19.688f)
        curveTo(22.686f, 19.31f, 22.38f, 19.004f, 22.002f, 19.004f)
        curveTo(21.624f, 19.004f, 21.318f, 19.31f, 21.318f, 19.688f)
        verticalLineTo(20.291f)
        horizontalLineTo(21.273f)
        curveTo(20.949f, 20.291f, 20.688f, 20.552f, 20.688f, 20.876f)
        curveTo(20.688f, 21.2f, 20.949f, 21.461f, 21.273f, 21.461f)
        horizontalLineTo(21.318f)
        verticalLineTo(23.747f)
        curveTo(21.318f, 24.863f, 21.885f, 25.196f, 22.722f, 25.196f)
        close()
        moveTo(26.895f, 25.205f)
        curveTo(27.939f, 25.205f, 28.74f, 24.719f, 28.74f, 23.648f)
        verticalLineTo(23.63f)
        curveTo(28.74f, 22.748f, 27.957f, 22.424f, 27.282f, 22.199f)
        curveTo(26.76f, 22.019f, 26.301f, 21.893f, 26.301f, 21.623f)
        verticalLineTo(21.605f)
        curveTo(26.301f, 21.416f, 26.472f, 21.272f, 26.805f, 21.272f)
        curveTo(27.093f, 21.272f, 27.462f, 21.389f, 27.849f, 21.578f)
        curveTo(27.939f, 21.623f, 28.002f, 21.641f, 28.101f, 21.641f)
        curveTo(28.407f, 21.641f, 28.65f, 21.407f, 28.65f, 21.101f)
        curveTo(28.65f, 20.867f, 28.524f, 20.687f, 28.326f, 20.588f)
        curveTo(27.858f, 20.354f, 27.336f, 20.219f, 26.832f, 20.219f)
        curveTo(25.86f, 20.219f, 25.068f, 20.768f, 25.068f, 21.749f)
        verticalLineTo(21.767f)
        curveTo(25.068f, 22.703f, 25.833f, 23.018f, 26.508f, 23.216f)
        curveTo(27.039f, 23.378f, 27.507f, 23.477f, 27.507f, 23.774f)
        verticalLineTo(23.792f)
        curveTo(27.507f, 24.008f, 27.327f, 24.152f, 26.931f, 24.152f)
        curveTo(26.544f, 24.152f, 26.085f, 24.008f, 25.626f, 23.72f)
        curveTo(25.554f, 23.675f, 25.455f, 23.648f, 25.356f, 23.648f)
        curveTo(25.05f, 23.648f, 24.816f, 23.882f, 24.816f, 24.188f)
        curveTo(24.816f, 24.404f, 24.933f, 24.566f, 25.077f, 24.656f)
        curveTo(25.662f, 25.034f, 26.301f, 25.205f, 26.895f, 25.205f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = RadialTakIcons.DistUnit)
