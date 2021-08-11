package com.jonapoul.extensions.sharedprefs

import android.content.SharedPreferences
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.content.edit

/**
 * Small utility class to carry both a preference key and its default value in the same container.
 * This is used alongside the extension functions below to abstract away (sort-of) the fetching of
 * preference values from the local data store.
 * @param key is the [SharedPreferences] key representing the persisted value
 * @param default is the default value of this preference. The type [T] of [default] represents the
 *                expected type to be stored in this preference.
 */
data class PrefPair<T>(val key: String, val default: T)

/**
 * Parses an [Int] from a [SharedPreferences] [String] value, returning the [Int] default value if
 * the value isn't already persisted or the type is incorrect.
 */
fun SharedPreferences.parseIntFromPair(pref: PrefPair<String>): Int {
    return typeSafeGet(pref) {
        this.getString(pref.key, pref.default)!!
    }.toInt()
}

/**
 * Parses a [Long] from a [SharedPreferences] [String] value, returning the [Long] default value
 * if the value isn't already persisted or the type is incorrect.
 */
fun SharedPreferences.parseLongFromPair(pref: PrefPair<String>): Long {
    return typeSafeGet(pref) {
        this.getString(pref.key, pref.default)!!
    }.toLong()
}

/**
 * Parses a [Double] from a [SharedPreferences] [String] value, returning the [Double] default value
 * if the value isn't already persisted or the type is incorrect.
 */
fun SharedPreferences.parseDoubleFromPair(pref: PrefPair<String>): Double {
    return typeSafeGet(pref) {
        this.getString(pref.key, pref.default)!!
    }.toDouble()
}

/**
 * Parses a [Float] from a [SharedPreferences] [String] value, returning the [Float] default value
 * if the value isn't already persisted or the type is incorrect.
 */
fun SharedPreferences.parseFloatFromPair(pref: PrefPair<String>): Float {
    return typeSafeGet(pref) {
        this.getString(pref.key, pref.default)!!
    }.toFloat()
}

/**
 * Returns an [Int] from a [SharedPreferences] instance, returning the [Int] default value if either
 * the value isn't already persisted or the type is incorrect.
 */
fun SharedPreferences.getIntFromPair(pref: PrefPair<Int>): Int {
    return typeSafeGet(pref) {
        this.getInt(pref.key, pref.default)
    }
}

/**
 * Returns a [Float] from a [SharedPreferences] instance, returning the [Float] default value if
 * either the value isn't already persisted or the type is incorrect.
 */
fun SharedPreferences.getFloatFromPair(pref: PrefPair<Float>): Float {
    return typeSafeGet(pref) {
        this.getFloat(pref.key, pref.default)
    }
}

/**
 * Returns a [Long] from a [SharedPreferences] instance, returning the [Long] default value if
 * either the value isn't already persisted or the type is incorrect.
 */
fun SharedPreferences.getLongFromPair(pref: PrefPair<Long>): Long {
    return typeSafeGet(pref) {
        this.getLong(pref.key, pref.default)
    }
}

/**
 * Returns a [String] from [SharedPreferences], returning the [String] default value if either
 * the value isn't already persisted or the type is incorrect.
 */
fun SharedPreferences.getStringFromPair(pref: PrefPair<String>): String {
    return typeSafeGet(pref) {
        this.getString(pref.key, pref.default)!!
    }
}

/**
 * Returns a [String] from [SharedPreferences]. If the persisted value either a) doesn't exist, b)
 * is the wrong type, or c) is blank, the [PrefPair] default is returned.
 */
fun SharedPreferences.getStringFromPairNoBlank(pref: PrefPair<String>): String {
    val result = getStringFromPair(pref)
    return if (result.isBlank()) pref.default else result
}

/**
 * Returns a [Boolean] from [SharedPreferences], returning the [PrefPair] default if either
 * the value isn't already persisted or the type is incorrect.
 */
fun SharedPreferences.getBooleanFromPair(pref: PrefPair<Boolean>): Boolean {
    return typeSafeGet(pref) {
        this.getBoolean(pref.key, pref.default)
    }
}

/**
 * Returns a [Set] of [String]s from [SharedPreferences], returning the [PrefPair] default if either
 * the value isn't already persisted or the type is incorrect.
 */
@RequiresApi(Build.VERSION_CODES.HONEYCOMB)
fun SharedPreferences.getStringSetFromPair(pref: PrefPair<Set<String>>): Set<String> {
    return typeSafeGet(pref) {
        this.getStringSet(pref.key, pref.default)!!
    }
}

/**
 * Attempts to call a code block. If it runs into a [ClassCastException] (i.e. when the persisted
 * value is of the wrong type), that persisted value is cleared and the [PrefPair] default is
 * returned.
 */
private fun <T> SharedPreferences.typeSafeGet(pref: PrefPair<T>, call: () -> T): T {
    return try {
        call.invoke()
    } catch (e: ClassCastException) {
        edit { remove(pref.key) }
        pref.default
    }
}

/**
 * Attempts to insert an [Int] value into this [SharedPreferences.Editor] instance. Skips if the
 * supplied [value] is null.
 */
fun SharedPreferences.Editor.putIntIfNotNull(
    pref: PrefPair<Int>,
    value: Int?
): SharedPreferences.Editor {
    if (value != null) {
        this.putInt(pref.key, value)
    }
    return this
}

/**
 * Attempts to insert a [Float] value into this [SharedPreferences.Editor] instance. Skips if the
 * supplied [value] is null.
 */
fun SharedPreferences.Editor.putFloatIfNotNull(
    pref: PrefPair<Float>,
    value: Float?
): SharedPreferences.Editor {
    if (value != null) {
        this.putFloat(pref.key, value)
    }
    return this
}

/**
 * Attempts to insert a [Boolean] value into this [SharedPreferences.Editor] instance. Skips if the
 * supplied [value] is null.
 */
fun SharedPreferences.Editor.putBooleanIfNotNull(
    pref: PrefPair<Boolean>,
    value: Boolean?
): SharedPreferences.Editor {
    if (value != null) {
        this.putBoolean(pref.key, value)
    }
    return this
}

/**
 * Attempts to insert a [Long] value into this [SharedPreferences.Editor] instance. Skips if the
 * supplied [value] is null.
 */
fun SharedPreferences.Editor.putLongIfNotNull(
    pref: PrefPair<Long>,
    value: Long?
): SharedPreferences.Editor {
    if (value != null) {
        this.putLong(pref.key, value)
    }
    return this
}

/**
 * Attempts to insert a [String] value into this [SharedPreferences.Editor] instance. Skips if the
 * supplied [value] is null.
 */
fun SharedPreferences.Editor.putStringIfNotNull(
    pref: PrefPair<String>,
    value: String?
): SharedPreferences.Editor {
    if (value != null) {
        this.putString(pref.key, value)
    }
    return this
}

/**
 * Attempts to insert a [Set] value into this [SharedPreferences.Editor] instance. Skips if the
 * supplied [value] is null.
 */
@RequiresApi(Build.VERSION_CODES.HONEYCOMB)
fun SharedPreferences.Editor.putStringSetIfNotNull(
    pref: PrefPair<Set<String>>,
    value: Set<String>?
): SharedPreferences.Editor {
    if (value != null) {
        this.putStringSet(pref.key, value)
    }
    return this
}