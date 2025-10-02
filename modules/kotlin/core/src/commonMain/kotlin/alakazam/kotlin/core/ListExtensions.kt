/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.core

/**
 * Returns a copied new list instance.
 */
public fun <T> List<T>.deepCopy(): List<T> = ArrayList<T>().also { it.addAll(this) }

/**
 * Clears the list and inserts a new set of values.
 */
public fun <T> MutableList<T>.replaceAllWith(list: List<T>) {
  clear()
  addAll(list)
}
