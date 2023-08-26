package dev.jonpoulton.alakazam.core

import timber.log.Timber

fun justTry(alsoLog: Boolean = true, block: () -> Unit) {
  try {
    block.invoke()
  } catch (e: Exception) {
    if (alsoLog) {
      Timber.w(e)
    }
  }
}
