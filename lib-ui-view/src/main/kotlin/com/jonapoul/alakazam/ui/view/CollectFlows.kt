package com.jonapoul.alakazam.ui.view

import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.jonapoul.alakazam.coroutines.collectFlow
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow

/**
 * Easily collect a [Flow] from a [Fragment] without needing to explicitly launch a
 * suspending coroutine to do so. This is tied to the lifecycle of the view, NOT the lifecycle of
 * the [Fragment] itself.
 */
fun <T> Fragment.collectFlow(flow: Flow<T>?, call: suspend (T) -> Unit): Job {
    return viewLifecycleOwner.lifecycleScope.collectFlow(flow, call)
}
