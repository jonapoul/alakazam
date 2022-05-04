package com.jonapoul.common.domain

import android.content.SharedPreferences
import androidx.core.content.edit
import com.fredporciuncula.flow.preferences.FlowSharedPreferences
import com.jonapoul.common.core.PrefPair
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@OptIn(ExperimentalCoroutinesApi::class)
abstract class Preferences(
    protected val prefs: SharedPreferences,
    protected val flowPrefs: FlowSharedPreferences,
) {
    fun clearAll(shouldCommit: Boolean = true) {
        prefs.edit(shouldCommit) { clear() }
    }

    fun intAsFlow(pref: PrefPair<Int>): Flow<Int> =
        flowPrefs.getInt(pref.key, pref.default).asFlow()

    fun floatAsFlow(pref: PrefPair<Float>): Flow<Float> =
        flowPrefs.getFloat(pref.key, pref.default).asFlow()

    fun stringAsFlow(pref: PrefPair<String>): Flow<String> =
        flowPrefs.getString(pref.key, pref.default).asFlow()

    fun nullableStringAsFlow(pref: PrefPair<String?>): Flow<String?> =
        flowPrefs.getNullableString(pref.key, pref.default).asFlow()

    fun booleanAsFlow(pref: PrefPair<Boolean>): Flow<Boolean> =
        flowPrefs.getBoolean(pref.key, pref.default).asFlow()
}
