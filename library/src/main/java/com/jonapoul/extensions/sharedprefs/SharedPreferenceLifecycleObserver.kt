package com.jonapoul.extensions.sharedprefs

import android.content.SharedPreferences
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class SharedPreferenceLifecycleObserver(
    private val prefs: SharedPreferences,
    private val onPreferenceUpdated: (key: String) -> Unit
) : SharedPreferences.OnSharedPreferenceChangeListener, LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        prefs.registerOnSharedPreferenceChangeListener(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        prefs.unregisterOnSharedPreferenceChangeListener(this)
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences, key: String) {
        onPreferenceUpdated.invoke(key)
    }
}
