package dev.jonpoulton.alakazam.kotlin.core

/**
 * Returns a copied new map instance.
 */
public fun <K, V> Map<K, V>.deepCopy(): Map<K, V> {
  return mutableMapOf<K, V>().also {
    it.putAll(this)
  }
}

/**
 * Clears the map and inserts a new set of values.
 */
public fun <K, V> MutableMap<K, V>.replaceAllWith(list: Map<K, V>) {
  clear()
  putAll(list)
}
