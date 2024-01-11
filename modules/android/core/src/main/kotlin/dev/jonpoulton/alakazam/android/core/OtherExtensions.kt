package dev.jonpoulton.alakazam.android.core

import timber.log.Timber

fun tryOrLog(block: () -> Unit) {
  try {
    block.invoke()
  } catch (e: Exception) {
    Timber.w(e)
  }
}
