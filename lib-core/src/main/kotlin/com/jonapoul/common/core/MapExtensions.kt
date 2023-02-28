package com.jonapoul.common.core

/**
 * Returns a copied new map instance.
 */
fun <K, V> Map<K, V>.deepCopy(): Map<K, V> {
    return mutableMapOf<K, V>().also {
        it.putAll(this)
    }
}

/**
 * Clears the map and inserts a new set of values.
 */
fun <K, V> MutableMap<K, V>.replaceAllWith(list: Map<K, V>) {
    clear()
    putAll(list)
}
