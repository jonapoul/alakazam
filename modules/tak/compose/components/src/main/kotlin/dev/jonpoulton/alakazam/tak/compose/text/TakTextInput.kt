package dev.jonpoulton.alakazam.tak.compose.text

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakTextStyles
import dev.jonpoulton.alakazam.tak.compose.icons.TakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.input.Search
import dev.jonpoulton.alakazam.tak.compose.icons.utility.Walking
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
fun TakTextInput(
  state: MutableState<String>,
  hint: String,
  modifier: Modifier = Modifier,
  startIcon: ImageVector? = null,
  endIcon: ImageVector? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  textStyle: TextStyle = TakTextStyles.H3,
  error: Boolean = false,
  colors: TakTextInputColors = DefaultTakTextInputColors(),
  dimensions: TakTextInputDimensions = DefaultTakTextInputDimensions(),
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  TakTextInput(
    value = state.value,
    onValueChanged = { state.value = it },
    hint,
    modifier,
    startIcon,
    endIcon,
    enabled,
    readOnly,
    textStyle,
    error,
    colors,
    dimensions,
    interactionSource,
  )
}

@Composable
fun TakTextInput(
  value: String,
  onValueChanged: (String) -> Unit,
  hint: String,
  modifier: Modifier = Modifier,
  startIcon: ImageVector? = null,
  endIcon: ImageVector? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  textStyle: TextStyle = TakTextStyles.H3,
  error: Boolean = false,
  colors: TakTextInputColors = DefaultTakTextInputColors(),
  dimensions: TakTextInputDimensions = DefaultTakTextInputDimensions(),
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val entered = value.isNotBlank()
  val pressed by interactionSource.collectIsPressedAsState()
  val backgroundColor by colors.backgroundColor(enabled, pressed, error)
  val borderColor by colors.borderColor(enabled, pressed, error)

  val smallThicknessPx: Float
  val largeThicknessPx: Float
  with(LocalDensity.current) {
    smallThicknessPx = dimensions.borderThicknessSmall.toPx()
    largeThicknessPx = dimensions.borderThicknessLarge.toPx()
  }

  Box(
    modifier = modifier
      .background(backgroundColor)
      .drawBehind {
        when {
          pressed -> pressedBorder(borderColor, smallThicknessPx)
          entered -> enteredBorder(borderColor, smallThicknessPx, largeThicknessPx)
          else -> bottomBorder(borderColor, smallThicknessPx)
        }
      }
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        onClick = { /* Do nothing */ },
      ),
    contentAlignment = Alignment.Center,
  ) {
    Row {
      TakTextInputIcon(startIcon, borderColor, dimensions.iconPadding, dimensions.iconSize)

      Box(modifier = Modifier.weight(1f)) {
        val padding = calculateTextPadding(dimensions.textPadding, startIcon, endIcon)

        // Show the input text
        val textColor by colors.textColor(enabled, pressed, error)
        BasicTextField(
          value = value,
          onValueChange = onValueChanged,
          modifier = modifier.padding(padding),
          enabled = enabled,
          readOnly = readOnly,
          textStyle = textStyle.copy(color = textColor),
          interactionSource = interactionSource,
          cursorBrush = SolidColor(textColor),
        )

        if (!entered) {
          // No text to show, so show the hint instead
          val hintColor by colors.hintColor(enabled, pressed, error)
          Text(
            modifier = modifier.padding(padding),
            text = hint,
            style = TakTextStyles.H3,
            color = hintColor,
          )
        }
      }

      TakTextInputIcon(endIcon, borderColor, dimensions.iconPadding, dimensions.iconSize)
    }
  }
}

@PreviewDark
@Composable
private fun StartIcon() = TakPreview {
  val state = remember { mutableStateOf("") }
  TakTextInput(
    modifier = Modifier.width(200.dp),
    state = state,
    hint = "Walking",
    startIcon = TakIcons.Utility.Walking,
  )
}

@PreviewDark
@Composable
private fun StartIconDisabled() = TakPreview {
  val state = remember { mutableStateOf("") }
  TakTextInput(
    modifier = Modifier.width(200.dp),
    state = state,
    hint = "Walking",
    startIcon = TakIcons.Utility.Walking,
    enabled = false,
  )
}

@PreviewDark
@Composable
private fun EmptySearch() = TakPreview {
  val state = remember { mutableStateOf("") }
  TakTextInput(
    modifier = Modifier.width(200.dp),
    state = state,
    hint = "Search",
    endIcon = TakIcons.Input.Search,
  )
}

@PreviewDark
@Composable
private fun FilledSearch() = TakPreview {
  val state = remember { mutableStateOf("Some text") }
  TakTextInput(
    modifier = Modifier.width(200.dp),
    state = state,
    hint = "Search",
    endIcon = TakIcons.Input.Search,
  )
}

@PreviewDark
@Composable
private fun ErrorSearch() = TakPreview {
  val state = remember { mutableStateOf("Some text") }
  TakTextInput(
    modifier = Modifier.width(200.dp),
    state = state,
    hint = "Search",
    endIcon = TakIcons.Input.Search,
    error = true,
  )
}

@PreviewDark
@Composable
private fun ErrorEmpty() = TakPreview {
  val state = remember { mutableStateOf("") }
  TakTextInput(
    modifier = Modifier.width(200.dp),
    state = state,
    hint = "Search",
    endIcon = TakIcons.Input.Search,
    error = true,
  )
}

@PreviewDark
@Composable
private fun Disabled() = TakPreview {
  val state = remember { mutableStateOf("") }
  TakTextInput(
    modifier = Modifier.width(200.dp),
    state = state,
    hint = "Search",
    endIcon = TakIcons.Input.Search,
    enabled = false,
  )
}
