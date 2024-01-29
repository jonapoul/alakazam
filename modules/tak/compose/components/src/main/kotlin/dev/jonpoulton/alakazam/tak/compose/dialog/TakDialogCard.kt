package dev.jonpoulton.alakazam.tak.compose.dialog

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import dev.jonpoulton.alakazam.tak.compose.core.TakColors

@Composable
public fun TakDialogCard(
  modifier: Modifier = Modifier,
  dismissDialog: () -> Unit = {},
  shape: Shape = TakDialogCardShape,
  positiveButton: TakDialogPositiveButton? = null,
  neutralButton: TakDialogNeutralButton? = null,
  negativeButton: TakDialogNegativeButton? = null,
  contents: @Composable () -> Unit,
) {
  Card(
    modifier = modifier
      .fillMaxWidth()
      .padding(16.dp),
    backgroundColor = TakColors.Sand,
    shape = shape,
    border = BorderStroke(width = 1.dp, color = TakColors.Ink),
  ) {
    Column {
      Box(modifier = Modifier.padding(16.dp)) {
        contents()
      }

      Divider(color = TakColors.Ink)

      if (positiveButton != null || negativeButton != null || neutralButton != null) {
        TakDialogButtons(
          dismissDialog = dismissDialog,
          positive = positiveButton,
          neutral = neutralButton,
          negative = negativeButton,
        )
      }
    }
  }
}

/**
 * From the design sheet, this should have a corner radius of 8dp. But if we try to actually show a dialog like that,
 * ATAK's dialog will clip off the corners/edges so it looks bad. I'd recommend sticking with this.
 */
public val TakDialogCardShape: Shape = RoundedCornerShape(0.dp)
