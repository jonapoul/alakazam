package com.jonapoul.common.ui

import android.view.View
import com.jonapoul.common.ui.notifier.Notifier

sealed class SnackbarMessage(val notify: Notifier.(View) -> Unit) {
    data class Info(val message: String) : SnackbarMessage({ v -> info(v, message) })
    data class Success(val message: String) : SnackbarMessage({ v -> success(v, message) })
    data class Caution(val message: String) : SnackbarMessage({ v -> caution(v, message) })
    data class Warning(val message: String) : SnackbarMessage({ v -> warning(v, message) })
}
