package com.jonapoul.extensions.fragment

import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

/**
 * Cleans up some of the boilerplate associated with collecting [Flow] streams from a [Fragment]
 * whilst respecting its view lifecycle. Without this we'd need two indentations before any
 * collected values are dealt with, but this reduces that by one so it's a tad more readable.
 *
 * See [LifecycleOwner.collectFlow] for a similar function for an arbitrary [LifecycleOwner],
 * whereas this runs specifically based on the **view** lifecycle of the fragment.
 */
fun <T> Fragment.collectFlow(flow: Flow<T>, callback: (T) -> Unit): Job {
    return viewLifecycleOwner.lifecycleScope.launch {
        flow.collect {
            callback.invoke(it)
        }
    }
}

/**
 * Simplified method of quickly showing dialogs in the [Fragment].
 */
inline fun Fragment.alert(body: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder) {
    MaterialAlertDialogBuilder(requireContext())
        .body()
        .show()
}
