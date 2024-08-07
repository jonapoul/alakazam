package alakazam.kotlin.core

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.transformWhile

/**
 * Performs the supplied [call] callback on every emission matching the [Expected] type. All values
 * are passed through as-is, regardless of the type.
 */
public inline fun <Input, reified Expected> Flow<Input>.onEachOfType(
  crossinline call: suspend (Expected) -> Unit,
): Flow<Input> = onEach {
  if (it is Expected) {
    call(it)
  }
}

/**
 * An operator to take all values emitted by the subject [Flow], only stopping when [stopOn] returns
 * true. When this condition is reached, the offending emission ***WILL NOT*** be passed onto the
 * caller and the flow will be cancelled.
 */
public fun <T> Flow<T>.takeUntilExclusive(stopOn: (T) -> Boolean): Flow<T> = transformWhile {
  val shouldStop = !stopOn(it)
  if (shouldStop) {
    emit(it)
  }
  shouldStop
}

/**
 * An operator to take all values emitted by the subject [Flow], only stopping when [stopOn] returns
 * true. When this condition is reached, the offending emission ***WILL*** be passed onto the
 * caller and the flow will be cancelled.
 */
public fun <T> Flow<T>.takeUntilInclusive(stopOn: (T) -> Boolean): Flow<T> = transformWhile {
  emit(it)
  !stopOn(it)
}
