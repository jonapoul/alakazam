package dev.jonpoulton.alakazam.tak.ui

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.isActive

abstract class TakViewModel : ViewModel() {
  protected var viewModelScope: CoroutineScope = buildScope()
    private set

  @CallSuper
  open fun init() {
    if (!viewModelScope.isActive) {
      viewModelScope = buildScope()
    }
  }

  override fun onCleared() {
    super.onCleared()
    viewModelScope.cancel()
  }

  private fun buildScope(): CoroutineScope = CoroutineScope(context = Dispatchers.Main.immediate)
}
