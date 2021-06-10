package com.jonapoul.extensions

import android.content.SharedPreferences
import androidx.core.content.edit
import com.jonapoul.sharedprefs.PrefPair

/**
 * Small utility class to carry both a preference key and its default value in the same container.
 * This is used alongside the extension functions below to abstract away (sort-of) the fetching of
 * preference values from the local data store.
 */
data class PrefPair<T>(val key: String, val default: T)

fun SharedPreferences.parseIntFromPair(pref: PrefPair<String>): Int {
    return typeSafeGet(pref) {
        this.getString(pref.key, pref.default)!!
    }.toInt()
}

fun SharedPreferences.parseDoubleFromPair(pref: PrefPair<String>): Double {
    return typeSafeGet(pref) {
        this.getString(pref.key, pref.default)!!
    }.toDouble()
}

fun SharedPreferences.parseFloatFromPair(pref: PrefPair<String>): Float {
    return typeSafeGet(pref) {
        this.getString(pref.key, pref.default)!!
    }.toFloat()
}

fun SharedPreferences.getIntFromPair(pref: PrefPair<Int>): Int {
    return typeSafeGet(pref) {
        this.getInt(pref.key, pref.default)
    }
}

fun SharedPreferences.getFloatFromPair(pref: PrefPair<Float>): Float {
    return typeSafeGet(pref) {
        this.getFloat(pref.key, pref.default)
    }
}

fun SharedPreferences.getLongFromPair(pref: PrefPair<Long>): Long {
    return typeSafeGet(pref) {
        this.getLong(pref.key, pref.default)
    }
}

fun SharedPreferences.getStringFromPair(pref: PrefPair<String>): String {
    return typeSafeGet(pref) {
        this.getString(pref.key, pref.default)!!
    }
}

fun SharedPreferences.getStringFromPairNoBlank(pref: PrefPair<String>): String {
    val result = getStringFromPair(pref)
    return if (result.isBlank()) pref.default else result
}

fun SharedPreferences.getBooleanFromPair(pref: PrefPair<Boolean>): Boolean {
    return typeSafeGet(pref) {
        this.getBoolean(pref.key, pref.default)
    }
}

fun SharedPreferences.getStringSetFromPair(pref: PrefPair<Set<String>>): Set<String> {
    return typeSafeGet(pref) {
        this.getStringSet(pref.key, pref.default)!!
    }
}

private fun <T> SharedPreferences.typeSafeGet(pref: PrefPair<T>, call: () -> T): T {
    return try {
        call.invoke()
    } catch (e: ClassCastException) {
        edit { remove(pref.key) }
        pref.default
    }
}

fun SharedPreferences.Editor.putIntIfNotNull(
    pref: PrefPair<Int>,
    value: Int?
): SharedPreferences.Editor {
    if (value != null) {
        this.putInt(pref.key, value)
    }
    return this
}

fun SharedPreferences.Editor.putFloatIfNotNull(
    pref: PrefPair<Float>,
    value: Float?
): SharedPreferences.Editor {
    if (value != null) {
        this.putFloat(pref.key, value)
    }
    return this
}

fun SharedPreferences.Editor.putBooleanIfNotNull(
    pref: PrefPair<Boolean>,
    value: Boolean?
): SharedPreferences.Editor {
    if (value != null) {
        this.putBoolean(pref.key, value)
    }
    return this
}

fun SharedPreferences.Editor.putLongIfNotNull(
    pref: PrefPair<Long>,
    value: Long?
): SharedPreferences.Editor {
    if (value != null) {
        this.putLong(pref.key, value)
    }
    return this
}

fun SharedPreferences.Editor.putStringIfNotNull(
    pref: PrefPair<String>,
    value: String?
): SharedPreferences.Editor {
    if (value != null) {
        this.putString(pref.key, value)
    }
    return this
}

fun SharedPreferences.Editor.putStringSetIfNotNull(
    pref: PrefPair<Set<String>>,
    value: Set<String>?
): SharedPreferences.Editor {
    if (value != null) {
        this.putStringSet(pref.key, value)
    }
    return this
}
