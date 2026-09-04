package alakazam.kotlin

/** Returns a copied new list instance. */
public fun <T> List<T>.deepCopy(): List<T> = ArrayList<T>().also { it.addAll(this) }

/** Clears the list and inserts a new set of values. */
public fun <T> MutableList<T>.replaceAllWith(list: List<T>) {
  clear()
  addAll(list)
}
