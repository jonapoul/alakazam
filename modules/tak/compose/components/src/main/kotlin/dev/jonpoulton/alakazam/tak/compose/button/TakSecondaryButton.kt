package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakTextStyles
import dev.jonpoulton.alakazam.tak.compose.preview.EmptyCallback
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
fun TakSecondaryButton(
  modifier: Modifier = Modifier,
  text: String,
  isDisabled: Boolean = false,
  colors: TakSecondaryButtonColors = DefaultTakSecondaryButtonColors(),
  textStyle: TextStyle = TakTextStyles.H4,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  shape: Shape = TakButtonRoundedEdges,
  onClick: () -> Unit,
) {
  val isPressed by interactionSource.collectIsPressedAsState()
  val foregroundColor by colors.foregroundColor(!isDisabled, isPressed)
  val backgroundColor by colors.backgroundColor(!isDisabled, isPressed)
  val borderColor by colors.borderColor(!isDisabled, isPressed)

  Box(
    modifier = Modifier
      .width(IntrinsicSize.Max)
      .height(IntrinsicSize.Max)
      .background(backgroundColor, shape = shape)
      .border(width = 1.dp, color = borderColor, shape = shape)
      .padding(horizontal = 16.dp, vertical = 8.dp)
      .clickable(interactionSource, indication = null, enabled = !isDisabled, onClick = onClick)
      .then(modifier),
    contentAlignment = Alignment.Center,
  ) {
    Text(
      text = text.uppercase(),
      modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight(),
      textAlign = TextAlign.Center,
      color = foregroundColor,
      style = textStyle,
    )
  }
}

@PreviewDark
@Composable
private fun RegularWithIcon() = TakPreview {
  TakSecondaryButton(
    text = "Confirm",
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun RegularWithPadding() = TakPreview {
  TakSecondaryButton(
    modifier = Modifier.padding(8.dp),
    text = "Confirm",
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun Disabled() = TakPreview {
  TakSecondaryButton(
    text = "Confirm",
    onClick = EmptyCallback,
    isDisabled = true,
  )
}
