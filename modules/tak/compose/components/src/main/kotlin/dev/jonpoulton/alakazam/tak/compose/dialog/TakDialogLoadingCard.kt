package dev.jonpoulton.alakazam.tak.compose.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
public fun TakDialogLoadingCard(
  title: String,
  text: String,
  modifier: Modifier = Modifier,
  shape: Shape = TakDialogCardShape,
  positiveButton: TakDialogPositiveButton? = null,
  neutralButton: TakDialogNeutralButton? = null,
  negativeButton: TakDialogNegativeButton? = null,
) {
  TakDialogCard(
    modifier = modifier,
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
      TakDialogTitleText {
        Text(
          modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp),
          text = title,
          textAlign = TextAlign.Center,
        )
      }

      Row(
        verticalAlignment = Alignment.CenterVertically,
      ) {
        CircularProgressIndicator(
          modifier = Modifier.size(24.dp),
          strokeWidth = 2.dp,
          color = TakColors.Ink,
        )

        TakDialogContentText {
          Text(
            modifier = Modifier
              .weight(1f)
              .padding(start = 12.dp),
            text = text,
            textAlign = TextAlign.Start,
          )
        }
      }
    }
  }
}

@PreviewDark
@Composable
private fun PreviewLoadingCardWithCancelButton() = TakPreview {
  TakDialogLoadingCard(
    title = "Processing Request",
    text = "The application will close when this process is complete.",
    negativeButton = PreviewNegativeButton,
  )
}

@PreviewDark
@Composable
private fun PreviewNoButtons() = TakPreview {
  TakDialogLoadingCard(
    title = "Processing Request",
    text = "The application will close when this process is complete.",
  )
}
