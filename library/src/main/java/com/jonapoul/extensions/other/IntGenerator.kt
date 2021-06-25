package com.jonapoul.extensions.other

/**
 * Simple method of generating semi-unique [Int] values without needing to worry about actually
 * writing any out. Useful for one-and-done things like notification IDs.
 */
object IntGenerator {
    private val lock = Any()
    private var int: Int = 0

    /**
     * Returns a new integer value.
     */
    fun next(): Int = synchronized(lock) { int++ }
}
