package com.jonapoul.common.ui.core

import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import com.jonapoul.common.coroutines.collectFlow
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow

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
