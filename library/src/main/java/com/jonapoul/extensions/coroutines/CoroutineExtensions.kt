package com.jonapoul.extensions.coroutines

import kotlinx.coroutines.*

/**
 * Runs an infinite loop of periodic function calls, scoped to the lifecycle. Takes a
 * [LoopDelayType] parameter, which specifies whether the periodic delay is placed before the first
 * callback or after. This will only matter on the first run through. The [skipIf] lambda will be
 * run directly before invoking the main [call], to verify whether the [call] should be run.
 */
fun CoroutineScope.infiniteLoop(
    periodMs: Long,
    delayType: LoopDelayType = LoopDelayType.DELAY_AFTER,
    dispatcher: CoroutineDispatcher = Dispatchers.Main,
    skipIf: (() -> Boolean)? = null,
    call: suspend () -> Unit
): Job {
    val delayBefore = if (delayType == LoopDelayType.DELAY_BEFORE) periodMs else 0L
    val delayAfter = if (delayType == LoopDelayType.DELAY_AFTER) periodMs else 0L
    return launch(dispatcher) {
        while (true) {
            delay(delayBefore)
            if (skipIf?.invoke() == true) continue
            call.invoke()
            delay(delayAfter)
        }
    }
}

/**
 * Defines the time to perform the sleep operation on our looping coroutine in [infiniteLoop].
 */
enum class LoopDelayType { DELAY_BEFORE, DELAY_AFTER }
