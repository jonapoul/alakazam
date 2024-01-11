package dev.jonpoulton.alakazam.tak.compose.text

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakTextStyles
import dev.jonpoulton.alakazam.tak.compose.icons.TakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.utility.CheckEmpty
import dev.jonpoulton.alakazam.tak.compose.icons.utility.CheckSelected
import dev.jonpoulton.alakazam.tak.compose.icons.utility.Collapse
import dev.jonpoulton.alakazam.tak.compose.icons.utility.Expand
import dev.jonpoulton.alakazam.tak.compose.icons.utility.Walking
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
fun TakDropdownField(
  state: MutableState<String?>,
  options: List<String>,
  hint: String,
  modifier: Modifier = Modifier,
  startIcon: ImageVector? = null,
  enabled: Boolean = true,
  textStyle: TextStyle = TakTextStyles.H3,
  error: Boolean = false,
  colors: TakTextInputColors = DefaultTakTextInputColors(),
  dimensions: TakTextInputDimensions = DefaultTakTextInputDimensions(),
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val value by state
  require(options.isNotEmpty()) { "Cannot use an empty list for the `options` parameter" }
  require(value == null || value in options) { "The current value $value is not in $options" }

  val stringValue = value.orEmpty()
  val entered = stringValue.isNotBlank()
  val pressed by interactionSource.collectIsPressedAsState()
  val backgroundColor by colors.backgroundColor(enabled, pressed, error)
  val borderColor by colors.borderColor(enabled, pressed, error)
  var expanded by remember { mutableStateOf(false) }

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
        onClick = { expanded = !expanded },
      ),
    contentAlignment = Alignment.Center,
  ) {
    Row {
      val endIcon = if (expanded) TakIcons.Utility.Collapse else TakIcons.Utility.Expand
      TakTextInputIcon(startIcon, borderColor, dimensions.iconPadding, dimensions.iconSize)

      Box(modifier = Modifier.weight(1f)) {
        val padding = calculateTextPadding(dimensions.textPadding, startIcon, endIcon)
        val textColor by colors.textColor(enabled, pressed, error)
        Text(
          modifier = modifier.padding(padding),
          text = stringValue,
          style = textStyle.copy(color = textColor),
          color = textColor,
        )

        if (!entered) {
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

    DropdownMenu(
      expanded = expanded,
      modifier = Modifier.width(300.dp),
      onDismissRequest = { expanded = false },
    ) {
      options.forEach { option ->
        TakDropdownFieldItem(
          option,
          isSelected = option == value,
          colors = colors,
          textStyle = textStyle,
          onSelected = {
            state.value = it // set the value
            expanded = false // also close the dropdown menu
          },
        )
      }
    }
  }
}

@Composable
private fun TakDropdownFieldItem(
  option: String,
  isSelected: Boolean,
  colors: TakTextInputColors = DefaultTakTextInputColors(),
  textStyle: TextStyle = TakTextStyles.H3,
  onSelected: (String) -> Unit,
) {
  val textColor by colors.textColor(enabled = true, pressed = false, error = false)
  val iconColor by colors.borderColor(enabled = true, pressed = false, error = false)
  DropdownMenuItem(
    onClick = { onSelected(option) },
    content = {
      val matrix = ColorMatrix()
      matrix.setToSaturation(0F)

      Image(
        modifier = Modifier.padding(end = 7.dp),
        imageVector = if (isSelected) TakIcons.Utility.CheckSelected else TakIcons.Utility.CheckEmpty,
        contentDescription = null,
        colorFilter = ColorFilter.tint(iconColor, BlendMode.Modulate),
      )
      Text(
        text = option,
        style = textStyle,
        color = textColor,
      )
    },
  )
}

@PreviewDark
@Composable
private fun Empty() = TakPreview {
  val options = listOf("a", "b", "c", "d")
  val state = remember { mutableStateOf<String?>(null) }
  TakDropdownField(
    modifier = Modifier.width(200.dp),
    state = state,
    options = options,
    hint = "Hello world",
  )
}

@PreviewDark
@Composable
private fun Disabled() = TakPreview {
  val options = listOf("Alpha", "Bravo", "Charlie", "Delta")
  val state = remember { mutableStateOf<String?>("Bravo") }
  TakDropdownField(
    modifier = Modifier.width(200.dp),
    state = state,
    options = options,
    enabled = false,
    hint = "Hello world",
  )
}

@PreviewDark
@Composable
private fun Error() = TakPreview {
  val options = listOf("Alpha", "Bravo", "Charlie", "Delta")
  val state = remember { mutableStateOf<String?>("Bravo") }
  TakDropdownField(
    modifier = Modifier.width(200.dp),
    state = state,
    options = options,
    error = true,
    hint = "Hello world",
  )
}

@PreviewDark
@Composable
private fun WithStartIcon() = TakPreview {
  val options = listOf("Alpha", "Bravo", "Charlie", "Delta")
  val state = remember { mutableStateOf<String?>("Bravo") }
  TakDropdownField(
    modifier = Modifier.width(200.dp),
    state = state,
    options = options,
    startIcon = TakIcons.Utility.Walking,
    hint = "Hello world",
  )
}

@PreviewDark
@Composable
private fun SelectedItem() = TakPreview {
  TakDropdownFieldItem(
    option = "a",
    isSelected = true,
    onSelected = { /* No-op */ },
  )
}

@PreviewDark
@Composable
private fun UnselectedItem() = TakPreview {
  TakDropdownFieldItem(
    option = "b",
    isSelected = false,
    onSelected = { /* No-op */ },
  )
}
