package alakazam.kotlin

import kotlinx.coroutines.CancellationException

/**
 * Same as `kotlin.runCatching`, but explicitly handles `CancellationException` as a special case.
 *
 * See reference, [Kotlin doc](https://kotlinlang.org/docs/cancellation-and-timeouts.html#cancellation-is-cooperative).
 */
public suspend inline fun <R> coRunCatching(block: suspend () -> R): Result<R> = try {
  Result.success(block())
} catch (e: CancellationException) {
  throw e
} catch (e: Throwable) {
  Result.failure(e)
}
