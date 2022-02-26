package com.jonapoul.extensions.data

/**
 * Run some "fire and forget" block of code, without worrying about any [Exception] which might be
 * thrown. Use with caution, obviously!
 */
fun justTry(block: () -> Unit) {
    try {
        block.invoke()
    } catch (e: Exception) {
        /* No-op */
    }
}
