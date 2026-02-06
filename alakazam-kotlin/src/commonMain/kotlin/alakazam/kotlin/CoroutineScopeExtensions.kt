package alakazam.kotlin

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

public fun <T> CoroutineScope.collectFlow(flow: Flow<T>, collector: FlowCollector<T>): Job =
  collectFlow(flow, EmptyCoroutineContext, collector)

public fun <T> CoroutineScope.collectFlow(flow: Flow<T>, context: CoroutineContext, collector: FlowCollector<T>): Job =
  launch(context) { flow.collect(collector) }

public fun CoroutineScope.launchInfiniteLoop(
  loopController: LoopController = InfiniteLoopController,
  call: suspend () -> Unit,
): Job = launchInfiniteLoop(EmptyCoroutineContext, loopController, call)

public fun CoroutineScope.launchInfiniteLoop(
  context: CoroutineContext,
  loopController: LoopController = InfiniteLoopController,
  onEachLoop: suspend () -> Unit,
): Job = launch(context) {
  while (loopController.shouldLoop()) onEachLoop()
}
