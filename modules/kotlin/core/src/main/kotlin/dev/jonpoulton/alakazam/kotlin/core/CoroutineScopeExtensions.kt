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
public fun <T> CoroutineScope.collectFlow(flow: Flow<T>, call: suspend (T) -> Unit): Job =
  collectFlow(flow, EmptyCoroutineContext, call)

public fun <T> CoroutineScope.collectFlow(flow: Flow<T>, context: CoroutineContext, call: suspend (T) -> Unit): Job =
  launch(context) { flow.collect(call::invoke) }

/**
 * Runs an infinite loop of periodic function calls, scoped to the [CoroutineScope]'s lifecycle.
 */
public fun CoroutineScope.launchInfiniteLoop(
  loopController: LoopController = InfiniteLoopController,
  call: suspend () -> Unit,
): Job = launchInfiniteLoop(EmptyCoroutineContext, loopController, call)

public fun CoroutineScope.launchInfiniteLoop(
  context: CoroutineContext,
  loopController: LoopController = InfiniteLoopController,
  call: suspend () -> Unit,
): Job = launch(context) {
  while (loopController.shouldLoop()) {
    call()
  }
}
