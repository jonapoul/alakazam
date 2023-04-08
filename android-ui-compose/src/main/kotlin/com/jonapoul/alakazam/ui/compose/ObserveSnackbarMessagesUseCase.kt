package com.jonapoul.alakazam.ui.compose

import com.jonapoul.alakazam.core.exhaustive
import com.jonapoul.alakazam.ui.compose.SnackbarMessage
import com.jonapoul.alakazam.ui.core.SnackbarFeed
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import com.jonapoul.alakazam.ui.core.SnackbarMessage as CoreSnackbarMessage

class ObserveSnackbarMessagesUseCase @Inject constructor(
  snackbarFeed: SnackbarFeed,
) {
  val snackbars: Flow<SnackbarMessage?> =
    snackbarFeed.snackbars.map { coreSnackbar ->
      when (coreSnackbar) {
        null -> null
        is CoreSnackbarMessage.Info -> SnackbarMessage.Info(coreSnackbar.message)
        is CoreSnackbarMessage.Success -> SnackbarMessage.Info(coreSnackbar.message)
        is CoreSnackbarMessage.Caution -> SnackbarMessage.Info(coreSnackbar.message)
        is CoreSnackbarMessage.Warning -> SnackbarMessage.Info(coreSnackbar.message)
      }.exhaustive
    }
}
