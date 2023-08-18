package dev.jonpoulton.alakazam.tak.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Provider

abstract class DaggerViewModelFactory : ViewModelProvider.Factory {
  protected abstract val providers: Map<Class<out ViewModel>, Provider<out ViewModel>>

  override fun <T : ViewModel> create(modelClass: Class<T>): T {
    val provider = providers[modelClass]?.get()

    @Suppress("UNCHECKED_CAST")
    return provider as? T? ?: error("Failed getting ${modelClass.canonicalName} from map: $providers")
  }
}
