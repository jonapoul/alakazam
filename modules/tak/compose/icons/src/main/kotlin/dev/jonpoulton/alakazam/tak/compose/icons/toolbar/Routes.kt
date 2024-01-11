package dev.jonpoulton.alakazam.tak.compose.icons.toolbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.icons.ToolbarTakIcons

val ToolbarTakIcons.Routes: ImageVector
  get() {
    if (nullableIcon != null) {
      return nullableIcon!!
    }
    nullableIcon = Builder(
      name = "Routes",
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
        moveTo(26.8904f, 10.5408f)
        curveTo(26.8904f, 7.7565f, 29.1472f, 5.4998f, 31.9314f, 5.4998f)
        curveTo(34.7156f, 5.4998f, 36.9724f, 7.7565f, 36.9724f, 10.5408f)
        curveTo(36.9724f, 11.449f, 36.522f, 12.569f, 35.7225f, 13.9054f)
        curveTo(35.4206f, 14.41f, 35.073f, 14.9365f, 34.6884f, 15.4782f)
        curveTo(34.2085f, 16.1542f, 33.6956f, 16.82f, 33.1828f, 17.4479f)
        curveTo(33.1229f, 17.5212f, 33.0645f, 17.5922f, 33.0076f, 17.6609f)
        lineTo(32.6863f, 18.0432f)
        lineTo(31.9314f, 18.9028f)
        lineTo(31.3692f, 18.2662f)
        lineTo(31.021f, 17.8596f)
        lineTo(30.68f, 17.4479f)
        curveTo(30.1672f, 16.82f, 29.6543f, 16.1542f, 29.1744f, 15.4782f)
        curveTo(28.7898f, 14.9365f, 28.4422f, 14.41f, 28.1403f, 13.9054f)
        curveTo(27.3408f, 12.569f, 26.8904f, 11.449f, 26.8904f, 10.5408f)
        close()
        moveTo(35.4724f, 10.5408f)
        curveTo(35.4724f, 8.585f, 33.8872f, 6.9998f, 31.9314f, 6.9998f)
        curveTo(29.9756f, 6.9998f, 28.3904f, 8.585f, 28.3904f, 10.5408f)
        curveTo(28.3904f, 11.1021f, 28.7579f, 12.0161f, 29.4275f, 13.1353f)
        curveTo(29.7078f, 13.6038f, 30.0342f, 14.0982f, 30.3974f, 14.6098f)
        curveTo(30.8561f, 15.2559f, 31.349f, 15.8956f, 31.8418f, 16.4991f)
        lineTo(31.9311f, 16.608f)
        lineTo(32.3901f, 16.0402f)
        curveTo(32.6354f, 15.7303f, 32.8787f, 15.4132f, 33.1155f, 15.0927f)
        lineTo(33.4654f, 14.6098f)
        curveTo(33.8286f, 14.0982f, 34.155f, 13.6038f, 34.4353f, 13.1353f)
        curveTo(35.1049f, 12.0161f, 35.4724f, 11.1021f, 35.4724f, 10.5408f)
        close()
        moveTo(27.7527f, 17.2029f)
        curveTo(28.1669f, 17.2029f, 28.5027f, 17.5386f, 28.5027f, 17.9529f)
        curveTo(28.5027f, 18.3326f, 28.2205f, 18.6463f, 27.8545f, 18.696f)
        lineTo(27.7527f, 18.7029f)
        horizontalLineTo(22.2527f)
        curveTo(21.6056f, 18.7029f, 21.0732f, 19.1947f, 21.0092f, 19.825f)
        lineTo(21.0027f, 19.9529f)
        verticalLineTo(20.4529f)
        curveTo(21.0027f, 21.0995f, 21.4951f, 21.6323f, 22.125f, 21.6964f)
        lineTo(22.2527f, 21.7029f)
        horizontalLineTo(32.7527f)
        curveTo(34.2712f, 21.7029f, 35.5027f, 22.9339f, 35.5027f, 24.4529f)
        curveTo(35.5027f, 25.9148f, 34.3605f, 27.1112f, 32.9202f, 27.1978f)
        lineTo(32.7527f, 27.2029f)
        horizontalLineTo(24.2527f)
        curveTo(23.6056f, 27.2029f, 23.0732f, 27.6947f, 23.0092f, 28.325f)
        lineTo(23.0027f, 28.4529f)
        verticalLineTo(28.9529f)
        curveTo(23.0027f, 29.5995f, 23.4951f, 30.1323f, 24.125f, 30.1964f)
        lineTo(24.2527f, 30.2029f)
        horizontalLineTo(29.7527f)
        curveTo(31.2712f, 30.2029f, 32.5027f, 31.4339f, 32.5027f, 32.9529f)
        curveTo(32.5027f, 34.4148f, 31.3605f, 35.6112f, 29.9202f, 35.6978f)
        lineTo(29.7527f, 35.7029f)
        horizontalLineTo(14.2527f)
        curveTo(13.8385f, 35.7029f, 13.5027f, 35.3671f, 13.5027f, 34.9529f)
        curveTo(13.5027f, 34.5732f, 13.7849f, 34.2594f, 14.1509f, 34.2097f)
        lineTo(14.2527f, 34.2029f)
        horizontalLineTo(29.7527f)
        curveTo(30.4425f, 34.2029f, 31.0027f, 33.6426f, 31.0027f, 32.9529f)
        curveTo(31.0027f, 32.3056f, 30.5107f, 31.7733f, 29.8805f, 31.7093f)
        lineTo(29.7527f, 31.7029f)
        horizontalLineTo(24.2527f)
        curveTo(22.7907f, 31.7029f, 21.5943f, 30.5606f, 21.5077f, 29.1203f)
        lineTo(21.5027f, 28.9529f)
        verticalLineTo(28.4529f)
        curveTo(21.5027f, 26.9902f, 22.6447f, 25.7944f, 24.0852f, 25.7079f)
        lineTo(24.2527f, 25.7029f)
        horizontalLineTo(32.7527f)
        curveTo(33.4425f, 25.7029f, 34.0027f, 25.1426f, 34.0027f, 24.4529f)
        curveTo(34.0027f, 23.8056f, 33.5107f, 23.2733f, 32.8805f, 23.2093f)
        lineTo(32.7527f, 23.2029f)
        horizontalLineTo(22.2527f)
        curveTo(20.7907f, 23.2029f, 19.5943f, 22.0606f, 19.5077f, 20.6203f)
        lineTo(19.5027f, 20.4529f)
        verticalLineTo(19.9529f)
        curveTo(19.5027f, 18.4902f, 20.6447f, 17.2944f, 22.0852f, 17.2079f)
        lineTo(22.2527f, 17.2029f)
        horizontalLineTo(27.7527f)
        close()
        moveTo(4.0f, 25.0599f)
        curveTo(4.0f, 21.6225f, 6.7869f, 18.8349f, 10.224f, 18.8349f)
        curveTo(13.6619f, 18.8349f, 16.449f, 21.6223f, 16.449f, 25.0599f)
        curveTo(16.449f, 26.1709f, 15.8855f, 27.5719f, 14.8828f, 29.2477f)
        curveTo(14.5007f, 29.8861f, 14.0605f, 30.5531f, 13.5731f, 31.2396f)
        curveTo(12.9636f, 32.0982f, 12.312f, 32.9441f, 11.6604f, 33.7421f)
        curveTo(11.6034f, 33.8119f, 11.5474f, 33.8801f, 11.4924f, 33.9467f)
        lineTo(11.0298f, 34.4983f)
        lineTo(10.2221f, 35.4192f)
        lineTo(9.5185f, 34.6155f)
        curveTo(9.3962f, 34.4737f, 9.2563f, 34.3088f, 9.1018f, 34.1232f)
        lineTo(8.5969f, 33.5069f)
        curveTo(7.9436f, 32.6968f, 7.3025f, 31.8529f, 6.7112f, 31.0065f)
        curveTo(5.0068f, 28.5666f, 4.0f, 26.5467f, 4.0f, 25.0599f)
        close()
        moveTo(14.949f, 25.0599f)
        curveTo(14.949f, 22.4507f, 12.8334f, 20.3349f, 10.224f, 20.3349f)
        curveTo(7.6154f, 20.3349f, 5.5f, 22.4508f, 5.5f, 25.0599f)
        curveTo(5.5f, 26.0357f, 6.261f, 27.6473f, 7.5564f, 29.5852f)
        lineTo(7.9409f, 30.1475f)
        curveTo(8.5107f, 30.9631f, 9.1314f, 31.7803f, 9.7645f, 32.5653f)
        lineTo(10.2231f, 33.126f)
        lineTo(10.4985f, 32.7933f)
        curveTo(11.1302f, 32.0198f, 11.7617f, 31.1999f, 12.3499f, 30.3713f)
        curveTo(12.816f, 29.7148f, 13.2351f, 29.0799f, 13.5956f, 28.4775f)
        curveTo(14.4683f, 27.0189f, 14.949f, 25.8239f, 14.949f, 25.0599f)
        close()
        moveTo(10.2243f, 22.9827f)
        curveTo(9.0041f, 22.9827f, 8.0143f, 23.9724f, 8.0143f, 25.1927f)
        curveTo(8.0143f, 26.4129f, 9.0041f, 27.4027f, 10.2243f, 27.4027f)
        curveTo(11.4452f, 27.4027f, 12.4343f, 26.4131f, 12.4343f, 25.1927f)
        curveTo(12.4343f, 23.9722f, 11.4452f, 22.9827f, 10.2243f, 22.9827f)
        close()
        moveTo(10.2243f, 24.4827f)
        curveTo(10.6167f, 24.4827f, 10.9343f, 24.8004f, 10.9343f, 25.1927f)
        curveTo(10.9343f, 25.5849f, 10.6167f, 25.9027f, 10.2243f, 25.9027f)
        curveTo(9.8325f, 25.9027f, 9.5143f, 25.5844f, 9.5143f, 25.1927f)
        curveTo(9.5143f, 24.8009f, 9.8325f, 24.4827f, 10.2243f, 24.4827f)
        close()
        moveTo(31.9309f, 8.7508f)
        curveTo(30.8854f, 8.7508f, 30.0369f, 9.5988f, 30.0369f, 10.6448f)
        curveTo(30.0369f, 11.6907f, 30.8854f, 12.5388f, 31.9309f, 12.5388f)
        curveTo(32.9771f, 12.5388f, 33.8259f, 11.691f, 33.8259f, 10.6448f)
        curveTo(33.8259f, 9.5985f, 32.9771f, 8.7508f, 31.9309f, 8.7508f)
        close()
        moveTo(31.9309f, 10.2508f)
        curveTo(32.1491f, 10.2508f, 32.3259f, 10.4274f, 32.3259f, 10.6448f)
        curveTo(32.3259f, 10.8621f, 32.1491f, 11.0388f, 31.9309f, 11.0388f)
        curveTo(31.7137f, 11.0388f, 31.5369f, 10.8621f, 31.5369f, 10.6448f)
        curveTo(31.5369f, 10.4274f, 31.7137f, 10.2508f, 31.9309f, 10.2508f)
        close()
      }
    }
      .build()
    return nullableIcon!!
  }

private var nullableIcon: ImageVector? = null
