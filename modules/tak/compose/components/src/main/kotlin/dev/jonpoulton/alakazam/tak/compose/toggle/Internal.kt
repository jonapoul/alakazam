package dev.jonpoulton.alakazam.tak.compose.toggle

import androidx.compose.animation.core.animateIntOffsetAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.core.TakFonts
import kotlin.math.roundToInt

@Composable
internal fun TakToggleCommon(
  modifier: Modifier = Modifier,
  thumbOffset: Dp,
  isChecked: Boolean,
  isEnabled: Boolean,
  onCheckedChanged: ((Boolean) -> Unit)?,
  colors: TakToggleColors,
  dimensions: TakToggleDimensions,
  thumbContents: (@Composable BoxScope.() -> Unit)?,
) {
  val pxToMove = with(LocalDensity.current) { thumbOffset.toPx().roundToInt() }
  val offset by animateIntOffsetAsState(
    targetValue = if (isChecked) IntOffset(x = pxToMove, y = 0) else IntOffset.Zero,
    label = "offset",
  )

  val thumbColor by colors.thumbColor(isEnabled, isChecked)
  val trackColor by colors.trackColor(isEnabled, isChecked)
  val borderColor = colors.borderColor

  // Only make the switch clickable if we're enabled
  val boxModifier = modifier
    .wrapContentSize()
    .let { mod ->
      if (isEnabled) {
        mod.clickable(
          interactionSource = remember { MutableInteractionSource() },
          indication = null,
          onClick = { onCheckedChanged?.invoke(!isChecked) },
        )
      }
      mod
    }

  Box(
    modifier = boxModifier,
    contentAlignment = Alignment.CenterStart,
    content = {
      TakToggleTrack(dimensions, trackColor, borderColor)

      if (thumbContents == null) {
        TakToggleThumb(offset, dimensions, thumbColor, borderColor, contents = null)
      } else {
        TakToggleThumb(offset, dimensions, thumbColor, borderColor, contents = { thumbContents(this) })
      }
    },
  )
}

@Composable
internal fun TakToggleThumb(
  offset: IntOffset,
  dimensions: TakToggleDimensions,
  thumbColor: Color,
  borderColor: Color,
  contents: @Composable (BoxScope.() -> Unit)?,
) {
  val modifier = Modifier
    .offset { offset }
    .shadow(elevation = dimensions.thumbElevation, shape = CircleShape)
    .size(width = dimensions.thumbWidth, height = dimensions.height)
    .border(width = dimensions.thumbBorderWidth, color = borderColor, shape = CircleShape)
    .background(color = thumbColor, shape = CircleShape)

  if (contents == null) {
    Box(modifier = modifier)
  } else {
    Box(modifier = modifier, contentAlignment = Alignment.Center, content = contents)
  }
}

@Composable
internal fun TakToggleTrack(
  dimensions: TakToggleDimensions,
  trackColor: Color,
  borderColor: Color,
) {
  Box(
    modifier = Modifier
      .size(width = dimensions.trackWidth, height = dimensions.height)
      .border(width = dimensions.thumbBorderWidth, color = borderColor, shape = TrackShape)
      .background(color = trackColor, shape = CircleShape),
  )
}

// Track defaults
internal val TrackShape = RoundedCornerShape(corner = CornerSize(size = 8.dp))

// Thumb defaults
internal val LargeThumbTextStyle = TextStyle(
  fontFamily = TakFonts.Family,
  fontSize = 10.sp,
  fontWeight = FontWeight.Bold,
  color = TakColors.Cloud,
)
