package dev.jonpoulton.alakazam.prefs

import android.content.SharedPreferences

/**
 * Small utility class to carry both a preference key and its default value in the same container.
 * This is used alongside the extension functions below to abstract away (sort-of) the fetching of
 * preference values from the local data store.
 * @param key is the [SharedPreferences] key representing the persisted value
 * @param default is the default value of this preference. The type [T] of [default] represents the
 *                expected type to be stored in this preference.
 */
data class PrefPair<T>(
  val key: String,
  val default: T,
)
