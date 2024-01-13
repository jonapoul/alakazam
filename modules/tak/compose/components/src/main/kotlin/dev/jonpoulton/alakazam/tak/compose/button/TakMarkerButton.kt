package dev.jonpoulton.alakazam.tak.compose.button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.icons.TakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Blue
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Neutral
import dev.jonpoulton.alakazam.tak.compose.icons.markers.Purple
import dev.jonpoulton.alakazam.tak.compose.preview.EmptyCallback
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
public fun TakMarkerButton(
  markerIcon: ImageVector,
  isDisabled: Boolean = false,
  colors: TakMarkerButtonColors = DefaultTakMarkerButtonColors(),
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  onClick: () -> Unit,
) {
  val isPressed by interactionSource.collectIsPressedAsState()
  val backgroundColor by colors.backgroundColor(!isDisabled, isPressed)
  val borderColor by colors.borderColor(!isDisabled, isPressed)

  Box(
    modifier = Modifier
      .border(1.dp, color = borderColor)
      .background(shape = TakButtonRoundedEdges, color = backgroundColor)
      .clickable(interactionSource, enabled = !isDisabled, onClick = onClick, indication = null),
  ) {
    Image(
      modifier = Modifier.padding(5.dp),
      imageVector = markerIcon,
      contentDescription = null,
    )
  }
}

@PreviewDark
@Composable
private fun Purple() = TakPreview {
  TakMarkerButton(
    markerIcon = TakIcons.Markers.Purple,
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun Blue() = TakPreview {
  TakMarkerButton(
    markerIcon = TakIcons.Markers.Blue,
    onClick = EmptyCallback,
  )
}

@PreviewDark
@Composable
private fun Neutral() = TakPreview {
  TakMarkerButton(
    markerIcon = TakIcons.Markers.Neutral,
    onClick = EmptyCallback,
  )
}
