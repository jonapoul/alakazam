package com.jonapoul.extensions

import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavDirections

/**
 * Performs navigation to the specified [destination], ignoring the effects of double-tapping the
 * button and any associated [IllegalArgumentException]
 */
fun NavController.safelyNavigate(@IdRes destination: Int) {
    safelyNavigate { navigate(destination) }
}

/**
 * Performs navigation to the specified [directions], ignoring the effects of double-tapping the
 * button and any associated [IllegalArgumentException]
 */
fun NavController.safelyNavigate(directions: NavDirections) {
    safelyNavigate { navigate(directions) }
}

private fun NavController.safelyNavigate(call: NavController.() -> Unit) {
    try {
        this.call()
    } catch (e: IllegalArgumentException) {
        /* I've seen this exception thrown sometimes if the user double taps on a menu item very
         * quickly before the app has a chance to actually navigate. No-op, we just put this here
         * to avoid app crashing */
    }
}
