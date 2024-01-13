package dev.jonpoulton.alakazam.tak.ui

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel

public abstract class TakViewModel : ViewModel() {
  protected val viewModelScope: CoroutineScope = CoroutineScope(context = Dispatchers.Main.immediate)

  @CallSuper
  override fun onCleared() {
    super.onCleared()
    viewModelScope.cancel()
  }
}
