package dev.jonpoulton.alakazam.tak.di

import androidx.lifecycle.ViewModelProvider

interface DaggerInjector {
  fun vmFactory(): ViewModelProvider.Factory
}
