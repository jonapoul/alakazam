package dev.jonpoulton.alakazam.init

import dev.jonpoulton.alakazam.core.IBuildConfig
import dev.jonpoulton.alakazam.logging.ConsoleLoggingTree
import timber.log.Timber

class LoggingInitialiser(private val buildConfig: IBuildConfig) : IAppInitialiser {
  override fun shouldGoFirst(): Boolean = true

  override fun init() {
    if (buildConfig.debug) {
      /* Only log to console in debug builds */
      Timber.plant(ConsoleLoggingTree())
      Timber.d("Started console logging")
    }
  }
}
