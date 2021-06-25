package com.jonapoul.extensions.fragment

import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.jonapoul.extensions.context.alert
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

/**
 * Cleans up some of the boilerplate associated with collecting [Flow] streams from a [Fragment]
 * whilst respecting its view lifecycle. Without this we'd need two indentations before any
 * collected values are dealt with, but this reduces that by one so it's a tad more readable.
 *
 * See [com.jonapoul.extensions.lifecycle.collectFlow] for a similar function for an arbitrary
 * [LifecycleOwner], whereas this runs specifically based on the **view** lifecycle of the fragment.
 */
fun <T> Fragment.collectFlow(flow: Flow<T>, callback: (T) -> Unit): Job {
    return viewLifecycleOwner.lifecycleScope.launch {
        flow.collect {
            callback.invoke(it)
        }
    }
}

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
inline fun Fragment.alert(config: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder) {
    requireContext().alert(config)
}

/**
 * Show a basic dialog window with a title string and a message. Will also include a single button
 * saying "OK" which does nothing except close the dialog, which can be overridden by passing a
 * call to [MaterialAlertDialogBuilder.setPositiveButton] as part of the [config] code block.
 */
fun Fragment.alert(
    title: String,
    message: String,
    config: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this }
) {
    requireContext().alert(title, message, config)
}
