package dev.jonpoulton.alakazam.tak.compose.dialog

import android.view.View
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

/**
 * Use this in conjunction with the various DialogCard composables, e.g.:
 * - [TakDialogTextCard] for text display
 * - [TakDialogTextInputCard] for text input from the user
 * - [TakDialogLoadingCard] for displaying a loading wheel
 *
 * Or use [TakDialogCard] to roll your own layouts.
 */
@Composable
public fun TakDialog(
  onDismissRequest: () -> Unit,
  mapView: View, // This should be an ATAK MapView
  properties: DialogProperties = DialogProperties(),
  content: @Composable () -> Unit,
) {
  CompositionLocalProvider(LocalView provides mapView) {
    Dialog(
      onDismissRequest = onDismissRequest,
      properties = properties,
      content = content,
    )
  }
}
