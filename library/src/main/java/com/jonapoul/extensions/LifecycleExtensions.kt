package com.jonapoul.extensions

import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

/**
 * Cleans up some of the boilerplate associated with collecting [Flow] streams from a fragment.
 * Without this we'd need two indentations before any collected values are dealt with, but this
 * reduces that by one so it's a tad more readable.
 *
 * See [Fragment.collectFlow] for a similar function to work specifically with a [Fragment]'s view
 * lifecycle.
 */
fun <T> LifecycleOwner.collectFlow(flow: Flow<T>, callback: (T) -> Unit): Job {
    return lifecycleScope.launch {
        flow.collect {
            callback.invoke(it)
        }
    }
}
