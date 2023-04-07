package com.jonapoul.alakazam.core

/**
 * Simple method of generating semi-unique numeric values without needing to worry about actually
 * writing any out. Useful for one-and-done things like notification IDs.
 */
abstract class Generator<T>(protected var value: T) {
    abstract fun next(): T
}

object IntGenerator : Generator<Int>(value = 0) {
    @Synchronized
    override fun next(): Int = value++
}

object LongGenerator : Generator<Long>(value = 0L) {
    @Synchronized
    override fun next(): Long = value++
}
