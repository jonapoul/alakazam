package com.jonapoul.common.ui.dialogs

import androidx.annotation.StringRes
import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * Gives a best-case API to allow callbacks on pressing the "negative" button in a dialog. Here we
 * apply a default (system-translated) string of "CANCEL" and invoke the supplied [onClick] when it's
 * pressed. If [onClick] is null, the button will simply close the dialog.
 */
fun MaterialAlertDialogBuilder.setSimpleNegativeButton(
    @StringRes text: Int = android.R.string.cancel,
    onClick: (() -> Unit)? = null,
): MaterialAlertDialogBuilder {
    return if (onClick == null) {
        setNegativeButton(text, null)
    } else {
        setNegativeButton(text) { _, _ -> onClick.invoke() }
    }
}

/**
 * Gives a best-case API to allow callbacks on pressing the "positive" button in a dialog. Here we
 * apply a default (system-translated) string of "OK" and invoke the supplied [onClick] when it's
 * pressed. If [onClick] is null, the button will simply close the dialog.
 */
fun MaterialAlertDialogBuilder.setSimplePositiveButton(
    @StringRes text: Int = android.R.string.ok,
    onClick: (() -> Unit)? = null,
): MaterialAlertDialogBuilder {
    return if (onClick == null) {
        setPositiveButton(text, null)
    } else {
        setPositiveButton(text) { _, _ -> onClick.invoke() }
    }
}
