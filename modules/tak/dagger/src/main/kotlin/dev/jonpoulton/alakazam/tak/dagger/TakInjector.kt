package dev.jonpoulton.alakazam.tak.dagger

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

interface TakInjector {
  val vmFactory: ViewModelProvider.Factory
}

inline fun <reified VM : ViewModel> TakInjector.viewModels(): Lazy<VM> =
  lazy { vmFactory.create(VM::class.java) }
