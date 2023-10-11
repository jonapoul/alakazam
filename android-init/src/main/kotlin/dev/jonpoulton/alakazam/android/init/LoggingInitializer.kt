package dev.jonpoulton.alakazam.android.init

import dev.jonpoulton.alakazam.android.logging.ConsoleLoggingTree
import timber.log.Timber
import javax.inject.Inject

class LoggingInitializer @Inject constructor() : AppInitializer {
  override fun shouldGoFirst(): Boolean = true

  override fun init() {
    Timber.plant(ConsoleLoggingTree())
    Timber.d("Started console logging")
  }
}
