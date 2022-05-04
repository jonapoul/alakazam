package com.jonapoul.common.ui

import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import com.jonapoul.common.core.collectFlow
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

/**
 * Easily collect a [Flow] from a [ComponentActivity] without needing to explicitly launch a
 * suspending coroutine to do so.
 */
fun <T> ComponentActivity.collectFlow(flow: Flow<T>?, call: suspend (T) -> Unit): Job {
    return lifecycleScope.collectFlow(flow, call)
}

/**
 * Easily collect a [Flow] from a [ViewModel] without needing to explicitly launch a
 * suspending coroutine to do so.
 */
fun <T> ViewModel.collectFlow(flow: Flow<T>?, call: suspend (T) -> Unit): Job {
    return viewModelScope.collectFlow(flow, call)
}
