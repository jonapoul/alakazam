package dev.jonpoulton.alakazam.tak.compose.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.jonpoulton.alakazam.android.ui.compose.EmptyCallback
import dev.jonpoulton.alakazam.tak.compose.core.TakColors
import dev.jonpoulton.alakazam.tak.compose.icons.TakIcons
import dev.jonpoulton.alakazam.tak.compose.icons.utility.Walking

internal val PreviewPositiveButton = TakDialogPositiveButton(
  onClick = EmptyCallback
)

internal val PreviewNeutralButton = TakDialogNeutralButton(
  text = "FOOBAR",
  icon = TakIcons.Utility.Walking,
  onClick = EmptyCallback
)

internal val PreviewNegativeButton = TakDialogNegativeButton(
  onClick = EmptyCallback
)

@Composable
internal fun PreviewSandyBox(content: @Composable BoxScope.() -> Unit) {
  Box(
    modifier = Modifier.background(TakColors.Sand),
    content = content,
  )
}
