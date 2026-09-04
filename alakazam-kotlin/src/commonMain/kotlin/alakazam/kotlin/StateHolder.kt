package alakazam.kotlin

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

public open class StateHolder<T>
private constructor(
  private val initialState: T,
  private val mutableState: MutableStateFlow<T>,
) : MutableStateFlow<T> by mutableState {
  public constructor(initialState: T) : this(initialState, MutableStateFlow(initialState))

  public open fun reset(): Unit = update { initialState }
}

public open class CloseableStateHolder<T>(
  initialState: T,
  private val onClose: (T) -> Unit,
) : StateHolder<T>(initialState) {
  override var value: T
    get() = super.value
    set(new) {
      val old = value
      super.value = new
      if (old !== new) onClose(old)
    }

  override fun compareAndSet(expect: T, update: T): Boolean {
    val replaced = super.compareAndSet(expect, update)
    if (replaced && expect !== update) onClose(expect)
    return replaced
  }
}

public open class AutoCloseableStateHolder<T : AutoCloseable>(initialState: T) :
  CloseableStateHolder<AutoCloseable>(initialState, onClose = AutoCloseable::close)
