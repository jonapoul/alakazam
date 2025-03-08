// linter tells me I need to opt in, then the IDE tells me the opt in isn't being used?
@file:OptIn(ExperimentalForInheritanceCoroutinesApi::class)
@file:Suppress("UnnecessaryOptInAnnotation")

package alakazam.kotlin.core

import kotlinx.coroutines.ExperimentalForInheritanceCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

public open class StateHolder<T>(
  private val initialState: T,
  private val mutableState: MutableStateFlow<T>,
) : MutableStateFlow<T> by mutableState {
  public constructor(initialState: T) : this(initialState, MutableStateFlow(initialState))

  public open fun reset(): Unit = update { initialState }
}
