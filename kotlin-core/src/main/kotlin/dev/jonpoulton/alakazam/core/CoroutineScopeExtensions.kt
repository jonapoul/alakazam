package dev.jonpoulton.alakazam.core

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

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
 * Runs an infinite loop of periodic function calls, scoped to the lifecycle. Takes a
 * [LoopDelayType] parameter, which specifies whether the periodic delay is placed before the first
 * callback or after. This will only matter on the first run through. The [skipIf] lambda will be
 * run directly before invoking the main [call], to verify whether the [call] should be run.
 */
fun CoroutineScope.launchInfiniteLoop(
  periodMs: Long,
  delayType: LoopDelayType = LoopDelayType.DELAY_AFTER,
  context: CoroutineContext = Dispatchers.Main,
  skipIf: (() -> Boolean)? = null,
  call: suspend () -> Unit,
): Job {
  val delayBefore = delayType == LoopDelayType.DELAY_BEFORE
  val delayAfter = delayType == LoopDelayType.DELAY_AFTER
  return launch(context) {
    while (true) {
      if (delayBefore) delay(periodMs)
      if (skipIf?.invoke() == true) continue
      call.invoke()
      if (delayAfter) delay(periodMs)
    }
  }
}

/**
 * Defines the time to perform the sleep operation on our looping coroutine in [launchInfiniteLoop].
 */
enum class LoopDelayType { DELAY_BEFORE, DELAY_AFTER }
