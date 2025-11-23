/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.ui.core

import alakazam.kotlin.core.collectFlow
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow

/**
 * Easily collect a flow from a [ComponentActivity] without needing to explicitly launch a
 * suspending coroutine to do so.
 */
public fun <T> ComponentActivity.collectFlow(flow: Flow<T>, call: suspend (T) -> Unit): Job =
  lifecycleScope.collectFlow(flow, call)

/**
 * Easily collect a flow from a [Fragment] without needing to explicitly launch a
 * suspending coroutine to do so. This is tied to the lifecycle of the view, NOT the lifecycle of
 * the [Fragment] itself.
 */
public fun <T> Fragment.collectFlow(flow: Flow<T>, call: suspend (T) -> Unit): Job =
  viewLifecycleOwner.lifecycleScope.collectFlow(flow, call)

/**
 * Easily collect a flow from a [ViewModel] without needing to explicitly launch a
 * suspending coroutine to do so.
 */
public fun <T> ViewModel.collectFlow(flow: Flow<T>, call: suspend (T) -> Unit): Job =
  viewModelScope.collectFlow(flow, call)
