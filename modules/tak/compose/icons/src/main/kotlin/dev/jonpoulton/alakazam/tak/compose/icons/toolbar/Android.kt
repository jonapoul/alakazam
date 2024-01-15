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

public val ToolbarTakIcons.Android: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Android",
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
        moveTo(13.3133f, 12.5821f)
        horizontalLineTo(26.1133f)
        curveTo(25.6613f, 9.6931f, 23.0683f, 7.7001f, 19.7063f, 7.7001f)
        curveTo(16.6103f, 7.4951f, 13.9103f, 9.5781f, 13.3133f, 12.5821f)
        close()
        moveTo(26.4313f, 6.0631f)
        lineTo(24.9883f, 7.5071f)
        curveTo(26.8653f, 8.8861f, 28.0293f, 11.0201f, 28.0293f, 13.5041f)
        curveTo(28.0293f, 14.0131f, 27.6153f, 14.4271f, 27.1063f, 14.4271f)
        horizontalLineTo(12.3053f)
        curveTo(11.7973f, 14.4271f, 11.3833f, 14.0131f, 11.3833f, 13.5041f)
        curveTo(11.3833f, 11.0201f, 12.5463f, 8.8871f, 14.4223f, 7.5081f)
        lineTo(12.9983f, 6.0841f)
        curveTo(12.8233f, 5.9101f, 12.7263f, 5.6781f, 12.7263f, 5.4321f)
        curveTo(12.7263f, 5.1851f, 12.8233f, 4.9531f, 12.9983f, 4.7781f)
        curveTo(13.3453f, 4.4291f, 13.9563f, 4.4311f, 14.3033f, 4.7781f)
        lineTo(16.0943f, 6.5691f)
        curveTo(17.1763f, 6.1131f, 18.3943f, 5.8541f, 19.7063f, 5.8541f)
        curveTo(21.0173f, 5.8541f, 22.2353f, 6.1131f, 23.3173f, 6.5691f)
        lineTo(25.1073f, 4.7781f)
        curveTo(25.4593f, 4.4151f, 26.0443f, 4.4061f, 26.4093f, 4.7591f)
        curveTo(26.5873f, 4.9301f, 26.6863f, 5.1611f, 26.6913f, 5.4071f)
        curveTo(26.6953f, 5.6531f, 26.6023f, 5.8871f, 26.4313f, 6.0631f)
        close()
        moveTo(8.6914f, 26.9605f)
        verticalLineTo(17.5415f)
        curveTo(8.6914f, 17.3085f, 8.5024f, 17.1185f, 8.2684f, 17.1185f)
        curveTo(8.0354f, 17.1185f, 7.8454f, 17.3085f, 7.8454f, 17.5415f)
        verticalLineTo(26.9605f)
        curveTo(7.8454f, 27.1935f, 8.0354f, 27.3835f, 8.2684f, 27.3835f)
        curveTo(8.5024f, 27.3835f, 8.6914f, 27.1935f, 8.6914f, 26.9605f)
        close()
        moveTo(6.0004f, 17.5415f)
        curveTo(6.0004f, 16.2905f, 7.0174f, 15.2725f, 8.2684f, 15.2725f)
        curveTo(9.5194f, 15.2725f, 10.5374f, 16.2905f, 10.5374f, 17.5415f)
        verticalLineTo(26.9605f)
        curveTo(10.5374f, 28.2105f, 9.5194f, 29.2285f, 8.2684f, 29.2285f)
        curveTo(7.0174f, 29.2285f, 6.0004f, 28.2105f, 6.0004f, 26.9605f)
        verticalLineTo(17.5415f)
        close()
        moveTo(31.5654f, 26.9605f)
        verticalLineTo(17.5415f)
        curveTo(31.5654f, 17.3085f, 31.3764f, 17.1185f, 31.1424f, 17.1185f)
        curveTo(30.9094f, 17.1185f, 30.7194f, 17.3085f, 30.7194f, 17.5415f)
        verticalLineTo(26.9605f)
        curveTo(30.7194f, 27.1935f, 30.9094f, 27.3835f, 31.1424f, 27.3835f)
        curveTo(31.3764f, 27.3835f, 31.5654f, 27.1935f, 31.5654f, 26.9605f)
        close()
        moveTo(28.8754f, 17.5415f)
        curveTo(28.8754f, 16.2905f, 29.8924f, 15.2725f, 31.1424f, 15.2725f)
        curveTo(32.3934f, 15.2725f, 33.4114f, 16.2905f, 33.4114f, 17.5415f)
        verticalLineTo(26.9605f)
        curveTo(33.4114f, 28.2105f, 32.3934f, 29.2285f, 31.1424f, 29.2285f)
        curveTo(29.8924f, 29.2285f, 28.8754f, 28.2105f, 28.8754f, 26.9605f)
        verticalLineTo(17.5415f)
        close()
        moveTo(21.7246f, 28.7281f)
        horizontalLineTo(17.6876f)
        curveTo(17.1786f, 28.7281f, 16.7646f, 29.1421f, 16.7646f, 29.6511f)
        verticalLineTo(35.0341f)
        curveTo(16.7646f, 35.2671f, 16.5756f, 35.4571f, 16.3416f, 35.4571f)
        curveTo(16.1086f, 35.4571f, 15.9186f, 35.2671f, 15.9186f, 35.0341f)
        verticalLineTo(29.6511f)
        curveTo(15.9186f, 29.1421f, 15.5046f, 28.7281f, 14.9956f, 28.7281f)
        curveTo(14.0216f, 28.7281f, 13.2286f, 27.9351f, 13.2286f, 26.9601f)
        verticalLineTo(17.1191f)
        horizontalLineTo(26.1836f)
        verticalLineTo(26.9601f)
        curveTo(26.1836f, 27.9351f, 25.3906f, 28.7281f, 24.4146f, 28.7281f)
        curveTo(23.9066f, 28.7281f, 23.4926f, 29.1421f, 23.4926f, 29.6511f)
        verticalLineTo(35.0341f)
        curveTo(23.4926f, 35.2671f, 23.3026f, 35.4571f, 23.0696f, 35.4571f)
        curveTo(22.8356f, 35.4571f, 22.6466f, 35.2671f, 22.6466f, 35.0341f)
        verticalLineTo(29.6511f)
        curveTo(22.6466f, 29.1421f, 22.2336f, 28.7281f, 21.7246f, 28.7281f)
        close()
        moveTo(27.1066f, 15.2731f)
        horizontalLineTo(12.3056f)
        curveTo(11.7966f, 15.2731f, 11.3826f, 15.6871f, 11.3826f, 16.1961f)
        verticalLineTo(26.9601f)
        curveTo(11.3816f, 28.6021f, 12.5006f, 30.0401f, 14.0736f, 30.4551f)
        verticalLineTo(35.0341f)
        curveTo(14.0736f, 36.2841f, 15.0906f, 37.3011f, 16.3416f, 37.3011f)
        curveTo(17.5926f, 37.3011f, 18.6106f, 36.2841f, 18.6106f, 35.0341f)
        verticalLineTo(30.5741f)
        horizontalLineTo(20.8016f)
        verticalLineTo(35.0341f)
        curveTo(20.8016f, 36.2841f, 21.8196f, 37.3011f, 23.0696f, 37.3011f)
        curveTo(24.3206f, 37.3011f, 25.3376f, 36.2841f, 25.3376f, 35.0341f)
        verticalLineTo(30.4551f)
        curveTo(26.9096f, 30.0401f, 28.0296f, 28.6021f, 28.0296f, 26.9601f)
        verticalLineTo(16.1961f)
        curveTo(28.0296f, 15.6871f, 27.6156f, 15.2731f, 27.1066f, 15.2731f)
        close()
        moveTo(16.3418f, 9.8907f)
        curveTo(15.8328f, 9.8907f, 15.4188f, 10.3047f, 15.4188f, 10.8137f)
        curveTo(15.4188f, 11.3227f, 15.8328f, 11.7367f, 16.3418f, 11.7367f)
        curveTo(16.8508f, 11.7367f, 17.2648f, 11.3227f, 17.2648f, 10.8137f)
        curveTo(17.2648f, 10.3047f, 16.8508f, 9.8907f, 16.3418f, 9.8907f)
        close()
        moveTo(22.1463f, 10.8137f)
        curveTo(22.1463f, 10.3047f, 22.5603f, 9.8907f, 23.0693f, 9.8907f)
        curveTo(23.5783f, 9.8907f, 23.9923f, 10.3047f, 23.9923f, 10.8137f)
        curveTo(23.9923f, 11.3227f, 23.5783f, 11.7367f, 23.0693f, 11.7367f)
        curveTo(22.5603f, 11.7367f, 22.1463f, 11.3227f, 22.1463f, 10.8137f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null

@Composable
@PreviewDark
private fun Preview() = PreviewIcon(icon = ToolbarTakIcons.Android)
