package dev.jonpoulton.alakazam.init

import dev.jonpoulton.alakazam.logging.ConsoleLoggingTree
import timber.log.Timber
import javax.inject.Inject

class LoggingInitialiser @Inject constructor() : IAppInitialiser {
  override fun shouldGoFirst(): Boolean = true

  override fun init() {
    Timber.plant(ConsoleLoggingTree())
    Timber.d("Started console logging")
  }
}
