package alakazam.kotlin

/**
 * Run some "fire and forget" block of code, without worrying about any [Exception] which might be
 * thrown. Use with caution, obviously!
 */
public fun justTry(block: () -> Unit) {
  try {
    block()
  } catch (_: Exception) {
    // No-op
  }
}

/**
 * Don't do anything
 */
public fun noOp(): Unit = Unit
