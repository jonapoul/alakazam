package dev.jonpoulton.alakazam.kotlin.core

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@Suppress("UnnecessaryAbstractClass")
public abstract class StateHolder<T>(private val initialState: T) {
  private val mutableState = MutableStateFlow(initialState)

  public val state: Flow<T> = mutableState.asStateFlow()

  public fun set(state: T) {
    mutableState.value = state
  }

  public fun peek(): T = mutableState.value

  public fun reset() {
    set(initialState)
  }
}
