package com.jonapoul.extensions.lifecycle

import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect

/**
 * Cleans up some of the boilerplate associated with collecting [Flow] streams from a fragment.
 * Without this we'd need two indentations before any collected values are dealt with, but this
 * reduces that by one so it's a tad more readable.
 *
 * See [com.jonapoul.extensions.fragment.collectFlow] for a similar function to work
 * specifically with a [Fragment]'s view lifecycle.
 */
fun <T> LifecycleOwner.collectFlow(flow: Flow<T>, callback: (T) -> Unit): Job {
    return lifecycleScope.launch {
        flow.collect {
            callback.invoke(it)
        }
    }
}

/**
 * Runs an infinite loop of periodic function calls, scoped to the lifecycle. Takes a
 * [LoopDelayType] parameter, which specifies whether the periodic delay is placed before the first
 * callback or after. This will only matter on the first run through. The [skipIf] lambda will be
 * run directly before invoking the main [call], to verify whether the [call] should be run.
 */
fun LifecycleCoroutineScope.infiniteLoop(
    periodMs: Long,
    delayType: LoopDelayType,
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
