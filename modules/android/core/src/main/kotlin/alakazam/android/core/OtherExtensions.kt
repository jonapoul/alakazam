package alakazam.android.core

import timber.log.Timber

public fun tryOrLog(block: () -> Unit) {
  try {
    block()
  } catch (e: Exception) {
    Timber.w(e)
  }
}
