package dev.jonpoulton.alakazam.android.prefs

import com.fredporciuncula.flow.preferences.FlowSharedPreferences
import com.fredporciuncula.flow.preferences.NullableSerializer
import com.fredporciuncula.flow.preferences.Preference
import com.fredporciuncula.flow.preferences.Serializer

public fun FlowSharedPreferences.getInt(pref: PrefPair<Int>): Preference<Int> =
  getInt(pref.key, pref.default)

public fun FlowSharedPreferences.getString(pref: PrefPair<String>): Preference<String> =
  getString(pref.key, pref.default)

public fun FlowSharedPreferences.getNullableString(pref: PrefPair<String?>): Preference<String?> =
  getNullableString(pref.key, pref.default)

public fun FlowSharedPreferences.getBoolean(pref: PrefPair<Boolean>): Preference<Boolean> =
  getBoolean(pref.key, pref.default)

public fun FlowSharedPreferences.getFloat(pref: PrefPair<Float>): Preference<Float> =
  getFloat(pref.key, pref.default)

public fun FlowSharedPreferences.getStringSet(pref: PrefPair<Set<String>>): Preference<Set<String>> =
  getStringSet(pref.key, pref.default)

public fun <T : Any> FlowSharedPreferences.getObject(
  pair: PrefPair<T>,
  serializer: Serializer<T>,
): Preference<T> = getObject(pair.key, serializer, pair.default)

public fun <T : Any> FlowSharedPreferences.getNullableObject(
  pair: PrefPair<T?>,
  serializer: NullableSerializer<T>,
): Preference<T?> = getNullableObject(pair.key, serializer, pair.default)
