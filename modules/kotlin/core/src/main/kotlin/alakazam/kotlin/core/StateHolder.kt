package alakazam.kotlin.core

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@Suppress("UnnecessaryAbstractClass")
public abstract class StateHolder<T>(private val initialState: T) {
  private val mutableState = MutableStateFlow(initialState)

  public open val state: Flow<T> = mutableState.asStateFlow()

  public open fun set(state: T) {
    mutableState.value = state
  }

  public open fun peek(): T = mutableState.value

  public open fun reset() {
    set(initialState)
  }
}
