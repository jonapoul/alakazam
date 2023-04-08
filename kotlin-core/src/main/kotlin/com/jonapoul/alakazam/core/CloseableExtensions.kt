package com.jonapoul.alakazam.core

import java.io.Closeable

/**
 * Attempts to call [Closeable.close], ignoring any exceptions which might be thrown. Will still
 * allow through other [Throwable]s (e.g. [NoClassDefFoundError])
 */
fun Closeable.quietlyClose() {
  try {
    close()
  } catch (e: Exception) {
    /* No-op */
  }
}
