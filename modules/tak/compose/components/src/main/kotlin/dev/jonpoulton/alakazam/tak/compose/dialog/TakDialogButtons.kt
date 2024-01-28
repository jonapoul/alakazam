package dev.jonpoulton.alakazam.tak.compose.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.android.ui.compose.PreviewDark
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.preview.TakPreview

@Composable
public fun TakDialogButtons(
  modifier: Modifier = Modifier,
  positive: TakDialogPositiveButton? = null,
  neutral: TakDialogNeutralButton? = null,
  negative: TakDialogNegativeButton? = null,
) {
  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(48.dp)
  ) {
    if (positive != null) TakDialogButton(positive)

    if (positive != null && (neutral != null || negative != null)) {
      VerticalDivider()
    }

    if (neutral != null) TakDialogButton(neutral)

    if (neutral != null && negative != null) {
      VerticalDivider()
    }

    if (negative != null) TakDialogButton(negative)
  }
}

@Composable
private fun VerticalDivider() {
  Box(
    Modifier
      .fillMaxHeight()
      .width(1.dp)
      .background(color = TakColors.Ink),
  )
}

@PreviewDark
@Composable
private fun PreviewThree() = TakPreview {
  PreviewSandyBox {
    TakDialogButtons(
      positive = PreviewPositiveButton,
      neutral = PreviewNeutralButton,
      negative = PreviewNegativeButton,
    )
  }
}

@PreviewDark
@Composable
private fun PreviewTwo() = TakPreview {
  PreviewSandyBox {
    TakDialogButtons(
      positive = PreviewPositiveButton,
      negative = PreviewNegativeButton,
    )
  }
}

@PreviewDark
@Composable
private fun PreviewOne() = TakPreview {
  PreviewSandyBox {
    TakDialogButtons(
      positive = PreviewPositiveButton,
    )
  }
}

@PreviewDark
@Composable
private fun PreviewNegative() = TakPreview {
  PreviewSandyBox {
    TakDialogButtons(
      negative = PreviewNegativeButton,
    )
  }
}
