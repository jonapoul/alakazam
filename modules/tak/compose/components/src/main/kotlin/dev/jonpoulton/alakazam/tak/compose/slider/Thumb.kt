package dev.jonpoulton.alakazam.tak.compose.slider

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.interaction.collectIsDraggedAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.SliderColors
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview
import kotlin.math.roundToInt

@Composable
internal fun LinearThumb(
  rawOffset: State<Float>,
  decimalPoints: Int,
  enabled: Boolean,
  interactionSource: InteractionSource,
  valueRange: ClosedFloatingPointRange<Float>,
  pixelRange: ClosedFloatingPointRange<Float>,
  textPosition: TakSliderTextPosition,
  dimensions: TakSliderDimensions = DefaultTakSliderDimensions(),
  colors: TakSliderColors = DefaultTakSliderColors(),
) {
  val thumbRadiusPx = with(LocalDensity.current) { dimensions.thumbRadius.toPx() }
  Box(Modifier.offset { IntOffset(x = (rawOffset.value - thumbRadiusPx).roundToInt(), y = 0) }) {
    val thumbIsDragged by interactionSource.collectIsDraggedAsState()
    val thumbIsPressed by interactionSource.collectIsPressedAsState()
    val mappedValue = rawOffset.value.mapToNewRange(inRange = pixelRange, outRange = valueRange)
    val text = "%.${decimalPoints}f".format(mappedValue)
    if (thumbIsPressed || thumbIsDragged) {
      ActiveLinearThumb(text, colors, dimensions, textPosition)
    } else {
      InactiveLinearThumb(text, enabled, colors, dimensions, textPosition)
    }
  }
}

@Composable
internal fun ActiveLinearThumb(
  value: String,
  colors: TakSliderColors = DefaultTakSliderColors(),
  dimensions: TakSliderDimensions = DefaultTakSliderDimensions(),
  textPosition: TakSliderTextPosition = TakSliderTextPosition.AboveThumb,
) {
  Column(horizontalAlignment = Alignment.CenterHorizontally) {
    val textColor by colors.textColor(enabled = true, active = true)
    val thumbColor by colors.thumbColor(enabled = true)

    if (textPosition == TakSliderTextPosition.AboveThumb) {
      Text(value, style = ThumbTextStyle, color = textColor, fontSize = dimensions.activeThumbTextSize)
    }

    Box(
      modifier = Modifier
        .size(dimensions.thumbRadius * 2)
        .background(thumbColor, CircleShape)
        .border(width = dimensions.thumbRadius / 2f, color = colors.secondaryThumbColor, shape = CircleShape),
    )

    if (textPosition == TakSliderTextPosition.BelowThumb) {
      Text(value, style = ThumbTextStyle, color = textColor, fontSize = dimensions.activeThumbTextSize)
    }
  }
}

@Stable
@Composable
internal fun InactiveLinearThumb(
  value: String,
  enabled: Boolean,
  colors: TakSliderColors = DefaultTakSliderColors(),
  dimensions: TakSliderDimensions = DefaultTakSliderDimensions(),
  textPosition: TakSliderTextPosition = TakSliderTextPosition.AboveThumb,
) {
  Column {
    // Placeholder text, just to take up vertical space
    if (textPosition == TakSliderTextPosition.AboveThumb) {
      Text(text = "", style = ThumbTextStyle, fontSize = dimensions.activeThumbTextSize)
    }

    val thumbColor by colors.thumbColor(enabled)
    Box(
      modifier = Modifier
        .size(dimensions.thumbRadius * 2)
        .background(thumbColor, CircleShape),
      contentAlignment = Alignment.Center,
    ) {
      if (textPosition != TakSliderTextPosition.None) {
        val textColor by colors.textColor(enabled, active = false)
        Text(text = value, style = ThumbTextStyle, color = textColor, fontSize = dimensions.inactiveThumbTextSize)
      }
    }

    if (textPosition == TakSliderTextPosition.BelowThumb) {
      Text(text = "", style = ThumbTextStyle, fontSize = dimensions.activeThumbTextSize)
    }
  }
}

@Composable
internal fun BoxScope.RangeThumb(
  modifier: Modifier,
  offset: Dp,
  interactionSource: MutableInteractionSource,
  colors: SliderColors,
  enabled: Boolean,
  thumbSize: Dp,
) {
  Box(
    Modifier
      .padding(start = offset)
      .align(Alignment.CenterStart),
  ) {
    val interactions = remember { mutableStateListOf<Interaction>() }
    LaunchedEffect(interactionSource) {
      interactionSource.interactions.collect { interaction ->
        when (interaction) {
          is PressInteraction.Press -> interactions.add(interaction)
          is PressInteraction.Release -> interactions.remove(interaction.press)
          is PressInteraction.Cancel -> interactions.remove(interaction.press)
          is DragInteraction.Start -> interactions.add(interaction)
          is DragInteraction.Stop -> interactions.remove(interaction.start)
          is DragInteraction.Cancel -> interactions.remove(interaction.start)
        }
      }
    }

    val elevation = if (interactions.isNotEmpty()) {
      ThumbPressedElevation
    } else {
      ThumbDefaultElevation
    }
    Spacer(
      modifier
        .size(thumbSize, thumbSize)
        .indication(
          interactionSource = interactionSource,
          indication = rememberRipple(bounded = false, radius = ThumbRippleRadius),
        )
        .hoverable(interactionSource = interactionSource)
        .shadow(if (enabled) elevation else 0.dp, CircleShape, clip = false)
        .background(colors.thumbColor(enabled).value, CircleShape),
    )
  }
}

@PreviewDark
@Composable
private fun ThumbInactive() = TakPreview {
  InactiveLinearThumb(value = "123", enabled = true)
}

@PreviewDark
@Composable
private fun ThumbInactiveDisabled() = TakPreview {
  InactiveLinearThumb(value = "123", enabled = false)
}

@PreviewDark
@Composable
private fun ThumbActiveDisabled() = TakPreview {
  ActiveLinearThumb(value = "123")
}

@PreviewDark
@Composable
private fun ThumbActiveAbove() = TakPreview {
  ActiveLinearThumb(value = "123", textPosition = TakSliderTextPosition.AboveThumb)
}

@PreviewDark
@Composable
private fun ThumbActiveBelow() = TakPreview {
  ActiveLinearThumb(value = "123", textPosition = TakSliderTextPosition.BelowThumb)
}

@PreviewDark
@Composable
private fun ThumbActiveNoText() = TakPreview {
  ActiveLinearThumb(value = "123", textPosition = TakSliderTextPosition.None)
}
