package com.jonapoul.extensions.dialogs

import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * Gives a best-case API to allow callbacks on pressing the "negative" button in a dialog. Here we
 * apply a default (system-translated) string of "CANCEL" and invoke the supplied [call] when it's
 * pressed. If [call] is null, the button will simply close the dialog.
 */
fun MaterialAlertDialogBuilder.setSimpleNegativeButton(
    call: (() -> Unit)? = null
): MaterialAlertDialogBuilder {
    return if (call == null) {
        setNegativeButton(android.R.string.cancel, null)
    } else {
        setNegativeButton(android.R.string.cancel) { _, _ -> call.invoke() }
    }
}

/**
 * Gives a best-case API to allow callbacks on pressing the "positive" button in a dialog. Here we
 * apply a default (system-translated) string of "OK" and invoke the supplied [call] when it's
 * pressed. If [call] is null, the button will simply close the dialog.
 */
fun MaterialAlertDialogBuilder.setSimplePositiveButton(
    call: (() -> Unit)? = null
): MaterialAlertDialogBuilder {
    return if (call == null) {
        setPositiveButton(android.R.string.ok, null)
    } else {
        setPositiveButton(android.R.string.ok) { _, _ -> call.invoke() }
    }
}
