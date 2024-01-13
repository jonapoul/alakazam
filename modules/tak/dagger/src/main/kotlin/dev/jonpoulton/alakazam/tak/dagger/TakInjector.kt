package dev.jonpoulton.alakazam.tak.dagger

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

public interface TakInjector {
  public val vmFactory: ViewModelProvider.Factory
}

public inline fun <reified VM : ViewModel> TakInjector.viewModels(): Lazy<VM> =
  lazy { vmFactory.create(VM::class.java) }
