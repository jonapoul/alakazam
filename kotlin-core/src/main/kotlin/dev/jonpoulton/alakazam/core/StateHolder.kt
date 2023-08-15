package dev.jonpoulton.alakazam.core

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class StateHolder<T>(initialState: T) {
  private val mutableState = MutableStateFlow(initialState)

  val state: Flow<T> = mutableState.asStateFlow()

  fun set(state: T) {
    mutableState.value = state
  }

  fun peek(): T = mutableState.value
}