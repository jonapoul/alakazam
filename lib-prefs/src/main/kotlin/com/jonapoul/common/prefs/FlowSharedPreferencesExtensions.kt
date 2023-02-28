@file:OptIn(ExperimentalCoroutinesApi::class)

package com.jonapoul.common.prefs

import com.fredporciuncula.flow.preferences.FlowSharedPreferences
import com.fredporciuncula.flow.preferences.Preference
import kotlinx.coroutines.ExperimentalCoroutinesApi

fun FlowSharedPreferences.getInt(pref: PrefPair<Int>): Preference<Int> =
    getInt(pref.key, pref.default)

fun FlowSharedPreferences.getString(pref: PrefPair<String>): Preference<String> =
    getString(pref.key, pref.default)

fun FlowSharedPreferences.getNullableString(pref: PrefPair<String?>): Preference<String?> =
    getNullableString(pref.key, pref.default)

fun FlowSharedPreferences.getBoolean(pref: PrefPair<Boolean>): Preference<Boolean> =
    getBoolean(pref.key, pref.default)

fun FlowSharedPreferences.getFloat(pref: PrefPair<Float>): Preference<Float> =
    getFloat(pref.key, pref.default)

fun FlowSharedPreferences.getStringSet(pref: PrefPair<Set<String>>): Preference<Set<String>> =
    getStringSet(pref.key, pref.default)
