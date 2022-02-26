package com.jonapoul.common.domain

import android.content.SharedPreferences
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

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
    onPreferenceUpdated: (key: String) -> Unit,
) {
    lifecycle.addObserver(
        object : SharedPreferences.OnSharedPreferenceChangeListener, LifecycleEventObserver {
            override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
                if (event == Lifecycle.Event.ON_CREATE) {
                    prefs.registerOnSharedPreferenceChangeListener(this)
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    prefs.unregisterOnSharedPreferenceChangeListener(this)
                    lifecycle.removeObserver(this)
                }
            }

            override fun onSharedPreferenceChanged(sp: SharedPreferences, key: String) {
                onPreferenceUpdated.invoke(key)
            }
        }
    )
}
