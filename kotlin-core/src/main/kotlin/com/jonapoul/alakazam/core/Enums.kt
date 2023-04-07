package com.jonapoul.alakazam.core

/**
 * A small collection of [Enum] helper methods, mostly to do with grabbing a value that matches
 * some condition.
 */
object Enums {
    /**
     * Returns the first enum value which matches the given [predicate], or null if none.
     */
    inline fun <reified E : Enum<E>> firstOrNull(
        predicate: (item: E) -> Boolean,
    ): E? = enumValues<E>().firstOrNull { predicate.invoke(it) }

    /**
     * Returns the first enum value which matches the given [predicate], or throws a
     * [NoSuchElementException] if none.
     */
    @Throws(NoSuchElementException::class)
    inline fun <reified E : Enum<E>> first(
        predicate: (item: E) -> Boolean,
    ): E = enumValues<E>().first { predicate.invoke(it) }

    /**
     * Returns the first enum value which matches the given string value, or null if none.
     */
    inline fun <reified E : Enum<E>> firstOrNullFromString(
        str: String,
    ): E? = firstOrNull<E> { it.name.equals(str, ignoreCase = true) }

    /**
     * Returns the first enum value which matches the given string value, or throws a
     * [NoSuchElementException] if none.
     */
    @Throws(NoSuchElementException::class)
    inline fun <reified E : Enum<E>> firstFromString(
        str: String,
    ): E = first { it.name.equals(str, ignoreCase = true) }
}
