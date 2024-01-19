package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.SwapHoriz
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.EmptyCallback
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.kotlin.core.ifTrue
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
public fun TakTextButtonLegacy(
  modifier: Modifier = Modifier,
  text: String,
  icon: ImageVector? = null,
  endIcon: ImageVector? = null,
  tint: Color = Color.White,
  isDisabled: Boolean = false,
  isChecked: Boolean = false,
  forceUppercase: Boolean = true,
  contentPadding: PaddingValues = PaddingValues(),
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  style: TextStyle = LocalTextStyle.current,
  onClick: () -> Unit,
) {
  val isPressed by interactionSource.collectIsPressedAsState()
  val contentColour = contentColour(isDisabled, tint)
  ButtonWithNoMinimumWidth(
    modifier = modifier
      .padding(1.dp)
      .border(1.dp, borderColour(isPressed, isChecked, isDisabled), RoundedEdges)
      .height(36.dp)
      .width(IntrinsicSize.Max)
      .defaultMinSize(minWidth = 0.dp, minHeight = ButtonDefaults.MinHeight),
    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
    contentPadding = contentPadding,
    shape = RoundedEdges,
    enabled = !isDisabled,
    onClick = { onClick() },
    minWidth = 0.dp,
    interactionSource = interactionSource,
  ) {
    Row(
      modifier = Modifier
        .fillMaxSize()
        .background(brush = backgroundGradient(isChecked, isDisabled))
        .padding(horizontal = 12.dp),
    ) {
      if (icon != null) {
        Icon(
          imageVector = icon,
          contentDescription = null,
          tint = contentColour,
          modifier = Modifier
            .align(Alignment.CenterVertically)
            .size(IconSize),
        )

        Spacer(modifier = Modifier.width(ButtonDefaults.IconSpacing))
      }

      Text(
        text = text.ifTrue(forceUppercase) { uppercase() },
        modifier = Modifier
          .align(Alignment.CenterVertically)
          .weight(1f)
          .wrapContentHeight(),
        textAlign = TextAlign.Center,
        color = contentColour,
        style = style,
      )

      if (endIcon != null) {
        Spacer(modifier = Modifier.width(ButtonDefaults.IconSpacing))

        Icon(
          imageVector = endIcon,
          contentDescription = null,
          tint = contentColour,
          modifier = Modifier
            .align(Alignment.CenterVertically)
            .size(IconSize),
        )
      }
    }
  }
}

@Composable
public fun TakIconButtonLegacy(
  modifier: Modifier = Modifier,
  icon: ImageVector,
  contentDescription: String,
  tint: Color = TakColors.Cloud,
  isDisabled: Boolean = false,
  isChecked: Boolean = false,
  onClick: () -> Unit,
) {
  val interactionSource = remember { MutableInteractionSource() }
  val isPressed by interactionSource.collectIsPressedAsState()
  IconButton(
    modifier = modifier
      .padding(1.dp)
      .border(width = 1.dp, color = borderColour(isPressed, isChecked, isDisabled), shape = RoundedEdges)
      .clip(shape = RoundedEdges)
      .background(brush = backgroundGradient(isChecked, isDisabled))
      .size(36.dp),
    onClick = { onClick() },
  ) {
    Icon(
      imageVector = icon,
      contentDescription = contentDescription,
      tint = contentColour(isDisabled, tint),
      modifier = Modifier.size(IconSize),
    )
  }
}

@Stable
private fun borderColour(isPressed: Boolean, isChecked: Boolean, isDisabled: Boolean): Color = when {
  isPressed || isChecked -> SelectedBorder
  isDisabled -> DisabledBackground
  else -> RegularBorder
}

@Stable
private fun backgroundGradient(isChecked: Boolean, isDisabled: Boolean): Brush = when {
  isChecked -> CheckedGradient
  isDisabled -> DisabledGradient
  else -> RegularGradient
}

@Stable
private fun contentColour(isDisabled: Boolean, givenColour: Color): Color = when {
  isDisabled -> DisabledContent
  else -> givenColour
}

private val RegularBorder = Color(color = 0xFF585858)
private val DisabledBackground = Color(color = 0xFF484848)
private val DisabledContent = TakColors.Stone
private val DisabledGradient = Brush.verticalGradient(colors = listOf(DisabledBackground, DisabledBackground))
private val RegularGradient = Brush.verticalGradient(colors = listOf(Color(color = 0xFF383838), Color.Black))
private val SelectedBorder = Color(color = 0xFF17B219)
private val CheckedGradient = Brush.verticalGradient(colors = listOf(Color(0xFF707070), Color(0xFF383838)))
private val RoundedEdges = RoundedCornerShape(size = 3.dp)
private val IconSize = 24.dp

@PreviewDark
@Composable
private fun RegularIconPreview() = PreviewTakIconButton()

@PreviewDark
@Composable
private fun CheckedIconPreview() = PreviewTakIconButton(isChecked = true)

@PreviewDark
@Composable
private fun DisabledIconPreview() = PreviewTakIconButton(isDisabled = true)

@Composable
private fun PreviewTakIconButton(
  isChecked: Boolean = false,
  isDisabled: Boolean = false,
) = TakPreview {
  TakIconButtonLegacy(
    icon = Icons.Filled.SwapHoriz,
    contentDescription = "Swap",
    isChecked = isChecked,
    isDisabled = isDisabled,
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun RegularTextPreview() = PreviewTakTextButton()

@PreviewDark
@Composable
private fun RegularTextEndIconPreview() = TakPreview {
  TakTextButtonLegacy(
    modifier = Modifier,
    text = "Click me",
    endIcon = Icons.Filled.SwapHoriz,
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun TinyTextButton() = TakPreview {
  TakTextButtonLegacy(
    modifier = Modifier,
    text = "A",
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun RegularTextButton() = TakPreview {
  TakTextButtonLegacy(
    modifier = Modifier,
    text = "Click me",
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun RegularTextPreviewFullWidth() = TakPreview {
  TakTextButtonLegacy(
    modifier = Modifier.fillMaxWidth(),
    text = "Click me",
    icon = Icons.Filled.SwapHoriz,
    tint = Color.White,
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun RegularTextPreviewWithMargin() = TakPreview {
  TakTextButtonLegacy(
    modifier = Modifier.padding(16.dp),
    text = "Click me",
    icon = Icons.Filled.SwapHoriz,
    tint = Color.White,
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun CheckedTextPreview() = PreviewTakTextButton(isChecked = true)

@PreviewDark
@Composable
private fun DisabledTextPreview() = PreviewTakTextButton(isDisabled = true)

@Composable
private fun PreviewTakTextButton(
  isChecked: Boolean = false,
  isDisabled: Boolean = false,
) = TakPreview {
  TakTextButtonLegacy(
    modifier = Modifier,
    text = "Click me",
    icon = Icons.Filled.SwapHoriz,
    tint = Color.White,
    isChecked = isChecked,
    isDisabled = isDisabled,
    onClick = EmptyCallback,
  )
}
