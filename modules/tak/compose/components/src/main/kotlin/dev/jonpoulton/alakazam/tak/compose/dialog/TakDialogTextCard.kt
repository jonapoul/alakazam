package dev.jonpoulton.alakazam.tak.compose.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
public fun TakDialogTextCard(
  title: String,
  text: String,
  modifier: Modifier = Modifier,
  dismissDialog: () -> Unit = {},
  shape: Shape = TakDialogCardShape,
  positiveButton: TakDialogPositiveButton? = null,
  neutralButton: TakDialogNeutralButton? = null,
  negativeButton: TakDialogNegativeButton? = null,
) {
  TakDialogCard(
    modifier = modifier,
    dismissDialog = dismissDialog,
    shape = shape,
    positiveButton = positiveButton,
    neutralButton = neutralButton,
    negativeButton = negativeButton,
  ) {
    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      TakDialogTitleText { Text(modifier = Modifier.padding(bottom = 10.dp), text = title) }
      TakDialogContentText { Text(text = text, textAlign = TextAlign.Center) }
    }
  }
}

@PreviewDark
@Composable
private fun PreviewTextDialogCard() = TakPreview {
  TakDialogTextCard(
    title = "Hello world",
    text = "This is my wicked message. Here's a bit more to show how it behaves splitting over multiple lines.",
    positiveButton = PreviewPositiveButton,
    neutralButton = PreviewNeutralButton,
    negativeButton = PreviewNegativeButton,
  )
}

@PreviewDark
@Composable
private fun PreviewNoButtons() = TakPreview {
  TakDialogTextCard(
    title = "Hello world",
    text = "This is a similar wicked message, this time without any buttons.",
  )
}
