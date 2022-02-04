package com.jonapoul.extensions.flows

import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.LifecycleService
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

/**
 * Easily collect a [Flow] from a [Fragment] without needing to explicitly launch a
 * suspending coroutine to do so. This is tied to the lifecycle of the view, NOT the lifecycle of
 * the [Fragment] itself.
 */
fun <T> Fragment.collectFlow(flow: Flow<T>?, call: suspend (T) -> Unit): Job {
    return viewLifecycleOwner.lifecycleScope.collectFlow(flow, call)
}

/**
 * Easily collect a [Flow] from a [ComponentActivity] without needing to explicitly launch a
 * suspending coroutine to do so.
 */
fun <T> ComponentActivity.collectFlow(flow: Flow<T>?, call: suspend (T) -> Unit): Job {
    return lifecycleScope.collectFlow(flow, call)
}

/**
 * Easily collect a [Flow] from a [LifecycleService] without needing to explicitly launch a
 * suspending coroutine to do so.
 */
fun <T> LifecycleService.collectFlow(flow: Flow<T>?, call: suspend (T) -> Unit): Job {
    return lifecycleScope.collectFlow(flow, call)
}

/**
 * Cleans up some of the boilerplate associated with collecting [Flow] streams from a fragment.
 * Without this we'd need two indentations before any collected values are dealt with, but this
 * reduces that by one so it's a tad more readable.
 *
 * See the other [collectFlow] methods for shortcuts when specifically working with [Fragment]s,
 * [ComponentActivity]s and [LifecycleService]s.
 */
fun <T> LifecycleCoroutineScope.collectFlow(flow: Flow<T>?, call: suspend (T) -> Unit): Job {
    return launch {
        flow?.collect {
            call.invoke(it)
        }
    }
}
