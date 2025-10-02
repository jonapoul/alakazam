/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.core

import kotlinx.coroutines.CancellationException

/**
 * Same as [kotlin.runCatching], but explicitly handles [CancellationException] as a special case.
 *
 * See reference, [Kotlin doc](https://kotlinlang.org/docs/cancellation-and-timeouts.html#cancellation-is-cooperative).
 */
@Suppress("RedundantSuspendModifier")
public suspend fun <R> coRunCatching(block: () -> R): Result<R> = try {
  Result.success(block())
} catch (e: CancellationException) {
  throw e
} catch (e: Throwable) {
  Result.failure(e)
}
