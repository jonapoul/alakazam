package com.jonapoul.extensions.context

import android.content.Context
import androidx.annotation.StringRes
import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * A different API for showing a dialog window. All configuration is passed in via the [config]
 * lambda block.
 *
 * This Will also include a single button saying "OK" which does nothing except close the dialog,
 * which can be overridden by passing a call to [MaterialAlertDialogBuilder.setPositiveButton] as
 * part of the [config] code block.
 *
 * Used as:
 *
 *      alert {
 *          setTitle("Title")
 *          setMessage("Whatever")
 *      }
 */
inline fun Context.alert(config: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder) {
    MaterialAlertDialogBuilder(this)
        .setPositiveButton(android.R.string.ok, null)
        .config()
        .show()
}

/**
 * Show a basic dialog window with a title string and a message. Will also include a single button
 * saying "OK" which does nothing except close the dialog, which can be overridden by passing a
 * call to [MaterialAlertDialogBuilder.setPositiveButton] as part of the [config] code block.
 */
fun Context.alert(
    title: String,
    message: String,
    config: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this }
) {
    alert {
        setTitle(title)
        setMessage(message)
        config()
    }
}

/**
 * Show a basic dialog window with a title string and a message. Will also include a single button
 * saying "OK" which does nothing except close the dialog, which can be overridden by passing a
 * call to [MaterialAlertDialogBuilder.setPositiveButton] as part of the [config] code block.
 */
fun Context.alert(
    @StringRes title: Int,
    @StringRes message: Int,
    config: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this }
) {
    alert(getString(title), getString(message), config)
}
