package dev.jonpoulton.alakazam.ui.view

import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import dev.jonpoulton.alakazam.core.throwsSpecific
import dev.jonpoulton.alakazam.coroutines.collectFlow
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow

/**
 * If the view (and therefore the [ViewBinding]) is inaccessible, meaning we have reached
 * [onDestroyView], then grabbing the lifecycle will throw an [IllegalStateException]. So this
 * can be used to check that state, e.g. with a ListAdapter's submitList callback.
 */
fun Fragment.viewIsAccessible(): Boolean =
  !throwsSpecific<IllegalStateException> { viewLifecycleOwner }

/**
 * Easily collect a [Flow] from a [Fragment] without needing to explicitly launch a
 * suspending coroutine to do so. This is tied to the lifecycle of the view, NOT the lifecycle of
 * the [Fragment] itself.
 */
fun <T> Fragment.collectFlow(flow: Flow<T>, call: suspend (T) -> Unit): Job {
  return viewLifecycleOwner.lifecycleScope.collectFlow(flow, call)
}
