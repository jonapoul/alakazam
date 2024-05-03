package alakazam.kotlin.core

/**
 * Small utility class to carry both a preference key and its default value in the same container.
 * This is used alongside the extension functions below to abstract away (sort-of) the fetching of
 * preference values from the local data store.
 */
public data class PrefPair<T>(
  val key: String,
  val default: T,
)
