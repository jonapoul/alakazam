package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.SwapHoriz
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakTextStyles
import dev.jonpoulton.alakazam.tak.compose.preview.EmptyCallback
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
public fun TakPrimaryButton(
  modifier: Modifier = Modifier,
  text: String,
  icon: ImageVector? = null,
  isError: Boolean = false,
  isDisabled: Boolean = false,
  colors: TakButtonColors = DefaultTakButtonColors(),
  textStyle: TextStyle = TakTextStyles.H2,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  shape: Shape = TakButtonRoundedEdges,
  onClick: () -> Unit,
) {
  val isPressed by interactionSource.collectIsPressedAsState()
  val foregroundColor by colors.foregroundColor(!isDisabled, isPressed, isError)
  val backgroundColor by colors.backgroundColor(!isDisabled, isPressed, isError)

  Row(
    modifier = Modifier
      .width(IntrinsicSize.Max)
      .height(IntrinsicSize.Max)
      .background(backgroundColor, shape = shape)
      .padding(horizontal = 16.dp, vertical = 8.dp)
      .clickable(interactionSource, indication = null, enabled = !isDisabled, onClick = onClick)
      .then(modifier),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    if (icon != null) {
      Icon(
        imageVector = icon,
        contentDescription = null,
        tint = foregroundColor,
        modifier = Modifier
          .align(Alignment.CenterVertically)
          .size(TakButtonIconSize),
      )

      Spacer(modifier = Modifier.width(ButtonDefaults.IconSpacing))
    }

    Text(
      text = text.uppercase(),
      modifier = Modifier
        .align(Alignment.CenterVertically)
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
  TakPrimaryButton(
    text = "Confirm",
    icon = Icons.Filled.SwapHoriz,
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun RegularWithoutIcon() = TakPreview {
  TakPrimaryButton(
    text = "Confirm",
    icon = null,
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun RegularWithPadding() = TakPreview {
  TakPrimaryButton(
    modifier = Modifier.padding(8.dp),
    text = "Confirm",
    icon = Icons.Filled.SwapHoriz,
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun Errored() = TakPreview {
  TakPrimaryButton(
    text = "Confirm",
    icon = Icons.Filled.SwapHoriz,
    onClick = EmptyCallback,
    isError = true,
  )
}

@PreviewDark
@Composable
private fun Disabled() = TakPreview {
  TakPrimaryButton(
    text = "Confirm",
    icon = Icons.Filled.SwapHoriz,
    onClick = EmptyCallback,
    isDisabled = true,
  )
}
