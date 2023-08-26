package dev.jonpoulton.alakazam.kotlin.core

/**
 * Returns a copied new list instance.
 */
fun <T> List<T>.deepCopy(): List<T> {
  return ArrayList<T>().also {
    it.addAll(this)
  }
}

/**
 * Clears the list and inserts a new set of values.
 */
fun <T> MutableList<T>.replaceAllWith(list: List<T>) {
  clear()
  addAll(list)
}
