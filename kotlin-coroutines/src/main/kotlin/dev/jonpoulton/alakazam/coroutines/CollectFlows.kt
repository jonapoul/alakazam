package dev.jonpoulton.alakazam.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

/**
 * Cleans up some of the boilerplate associated with collecting [Flow] streams from a fragment.
 * Without this we'd need two indentations before any collected values are dealt with, but this
 * reduces that by one so it's a tad more readable.
 *
 * This is used more specifically for fragments, activities and ViewModels in the domain module of
 * this library.
 */
fun <T> CoroutineScope.collectFlow(flow: Flow<T>, call: suspend (T) -> Unit): Job =
  launch {
    flow.collect {
      call.invoke(it)
    }
  }
