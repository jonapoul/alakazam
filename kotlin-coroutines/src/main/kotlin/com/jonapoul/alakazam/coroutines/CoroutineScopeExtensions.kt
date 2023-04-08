package com.jonapoul.alakazam.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Runs an infinite loop of periodic function calls, scoped to the lifecycle. Takes a
 * [LoopDelayType] parameter, which specifies whether the periodic delay is placed before the first
 * callback or after. This will only matter on the first run through. The [skipIf] lambda will be
 * run directly before invoking the main [call], to verify whether the [call] should be run.
 */
fun CoroutineScope.launchInfiniteLoop(
    periodMs: Long,
    delayType: LoopDelayType = LoopDelayType.DELAY_AFTER,
    dispatcher: CoroutineDispatcher = Dispatchers.Main,
    skipIf: (() -> Boolean)? = null,
    call: suspend () -> Unit,
): Job {
    val delayBefore = delayType == LoopDelayType.DELAY_BEFORE
    val delayAfter = delayType == LoopDelayType.DELAY_AFTER
    return launch(dispatcher) {
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
