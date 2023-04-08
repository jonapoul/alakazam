package com.jonapoul.alakazam.logging

import android.util.Log
import org.slf4j.LoggerFactory
import timber.log.Timber

/**
 * [Timber] class to allow storage of log messages to a file on the device. See the config files at
 * <app-module>/src/main/assets/logback.xml in each app module for details like file size limits and rotation policies.
 */
class FileLoggingTree(
  private val minPriority: Int = Log.VERBOSE,
) : TaggedDebugTree() {
  override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
    if (priority < minPriority) {
      return
    }

    when (priority) {
      Log.VERBOSE -> logger.debug(message)
      Log.DEBUG -> logger.debug(message)
      Log.INFO -> logger.info(message)
      Log.WARN -> logger.warn(message)
      Log.ERROR -> logger.error(message, t)
    }
  }

  private companion object {
    private val logger = LoggerFactory.getLogger(FileLoggingTree::class.java)
  }
}