package com.jonapoul.extensions.sharedprefs

import android.content.SharedPreferences
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

/**
 * A different method of dealing with [SharedPreferences.OnSharedPreferenceChangeListener], instead
 * involving a lambda callback. The callbacks will stop when the [LifecycleOwner] reaches the
 * "destroyed" state.
 *
 * Use as:
 *
 *      override fun onCreate(savedInstanceState: Bundle?) {
 *          super.onCreate(savedInstanceState)
 *          ...
 *          observeSharedPrefs(prefs) {
 *              when (key) {
 *                  ...
 *              }
 *          }
 *      }
 */
fun LifecycleOwner.observeSharedPrefs(
    prefs: SharedPreferences,
    onPreferenceUpdated: (key: String) -> Unit
) {
    lifecycle.addObserver(
        object : SharedPreferences.OnSharedPreferenceChangeListener, LifecycleObserver {
            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            fun onCreate() {
                prefs.registerOnSharedPreferenceChangeListener(this)
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            fun onDestroy() {
                prefs.unregisterOnSharedPreferenceChangeListener(this)
                lifecycle.removeObserver(this)
            }

            override fun onSharedPreferenceChanged(sp: SharedPreferences, key: String) {
                onPreferenceUpdated.invoke(key)
            }
        }
    )
}
