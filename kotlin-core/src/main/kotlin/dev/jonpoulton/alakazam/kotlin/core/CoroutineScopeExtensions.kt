package dev.jonpoulton.alakazam.kotlin.core

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

/**
 * Cleans up some of the boilerplate associated with collecting [Flow] streams from a fragment. Without this we'd
 * need two indentations before any collected values are dealt with, but this reduces that by one so it's a tad more
 * readable.
 */
fun <T> CoroutineScope.collectFlow(flow: Flow<T>, call: suspend (T) -> Unit): Job {
  return launch {
    flow.collect {
      call.invoke(it)
    }
  }
}

/**
 * Runs an infinite loop of periodic function calls, scoped to the [CoroutineScope]'s lifecycle.
 */
fun CoroutineScope.launchInfiniteLoop(
  context: CoroutineContext = EmptyCoroutineContext,
  loopController: LoopController = InfiniteLoopController,
  call: suspend () -> Unit,
): Job {
  return launch(context) {
    while (loopController.shouldLoop()) {
      call.invoke()
    }
  }
}
