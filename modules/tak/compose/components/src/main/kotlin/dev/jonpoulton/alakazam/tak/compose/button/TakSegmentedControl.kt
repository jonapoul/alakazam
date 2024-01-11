package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakTextStyles
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
fun TakSegmentedControl(
  modifier: Modifier = Modifier,
  isDisabled: Boolean = false,
  colors: TakSegmentedControlColors = DefaultTakSegmentedControlColors(),
  textStyle: TextStyle = TakTextStyles.H4,
  activeButtonId: TakSegmentedControlButtonId,
  buttons: List<TakSegmentedControlButton>,
) {
  Row(
    modifier = Modifier.wrapContentHeight(),
  ) {
    buttons.forEach { button ->
      val isFirst = button == buttons.first()
      val isLast = button == buttons.last()
      val shape = when {
        isFirst && isLast -> TakButtonRoundedEdges
        isFirst -> TakButtonRoundedEdgesStart
        isLast -> TakButtonRoundedEdgesEnd
        else -> TakButtonRoundedEdgesMid
      }

      TakSegmentedControlButton(
        modifier = modifier,
        text = button.text,
        shape = shape,
        isActive = button.id == activeButtonId,
        isDisabled = isDisabled || button.isDisabled,
        colors = colors,
        textStyle = textStyle,
        onClick = { button.onActivated(button.id) },
      )
    }
  }
}

typealias TakSegmentedControlButtonId = Long

@Stable
@Immutable
class TakSegmentedControlButton(
  val text: String,
  val id: TakSegmentedControlButtonId,
  val isDisabled: Boolean = false,
  val onActivated: (TakSegmentedControlButtonId) -> Unit,
)

@Stable
@Composable
private fun RowScope.TakSegmentedControlButton(
  modifier: Modifier = Modifier,
  text: String,
  shape: Shape,
  isActive: Boolean = false,
  isDisabled: Boolean = false,
  colors: TakSegmentedControlColors = DefaultTakSegmentedControlColors(),
  textStyle: TextStyle = TakTextStyles.H4,
  onClick: () -> Unit,
) {
  val foregroundColor by colors.foregroundColor(!isDisabled, isActive)
  val backgroundColor by colors.backgroundColor(!isDisabled, isActive)
  val borderColor by colors.borderColor(!isDisabled, isActive)
  val interactionSource = remember { MutableInteractionSource() }

  Box(
    modifier = Modifier
      .weight(1f)
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
private fun Regular() = TakPreview {
  var activeId by remember { mutableStateOf(1L) }
  TakSegmentedControl(
    modifier = Modifier,
    activeButtonId = activeId,
    buttons = listOf(
      TakSegmentedControlButton(text = "ABCD", id = 1, onActivated = { activeId = it }),
      TakSegmentedControlButton(text = "WXYZ", id = 2, onActivated = { activeId = it }),
      TakSegmentedControlButton(text = "1234", id = 3, onActivated = { activeId = it }),
    ),
  )
}
