package dev.jonpoulton.alakazam.core

import android.view.View

sealed class SnackbarMessage(val notify: INotifier.(View) -> Unit) {
  data class Info(
    val message: String,
    val action: INotifier.Action = INotifier.EMPTY_ACTION,
  ) : SnackbarMessage({ v -> info(v, message, action) })

  data class Success(
    val message: String,
    val action: INotifier.Action = INotifier.EMPTY_ACTION,
  ) : SnackbarMessage({ v -> success(v, message, action) })

  data class Caution(
    val message: String,
    val action: INotifier.Action = INotifier.EMPTY_ACTION,
  ) : SnackbarMessage({ v -> caution(v, message, action) })

  data class Warning(
    val message: String,
    val action: INotifier.Action = INotifier.EMPTY_ACTION,
  ) : SnackbarMessage({ v -> warning(v, message, action) })
}
