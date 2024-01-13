package dev.jonpoulton.alakazam.android.core

import timber.log.Timber

public fun tryOrLog(block: () -> Unit) {
  try {
    block.invoke()
  } catch (e: Exception) {
    Timber.w(e)
  }
}
