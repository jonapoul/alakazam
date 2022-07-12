package com.jonapoul.common.ui

import android.view.View
import com.jonapoul.common.ui.notifier.Notifier

sealed class SnackbarMessage(val notify: Notifier.(View) -> Unit) {
    data class Info(
        val message: String,
        val action: Notifier.Action = Notifier.EMPTY_ACTION
    ) : SnackbarMessage({ v -> info(v, message, action) })

    data class Success(
        val message: String,
        val action: Notifier.Action = Notifier.EMPTY_ACTION
    ) : SnackbarMessage({ v -> success(v, message, action) })

    data class Caution(
        val message: String,
        val action: Notifier.Action = Notifier.EMPTY_ACTION
    ) : SnackbarMessage({ v -> caution(v, message, action) })

    data class Warning(
        val message: String,
        val action: Notifier.Action = Notifier.EMPTY_ACTION
    ) : SnackbarMessage({ v -> warning(v, message, action) })
}
