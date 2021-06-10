package com.jonapoul.extensions

import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavDirections

fun NavController.safelyNavigate(@IdRes destination: Int) {
    safelyNavigate { navigate(destination) }
}

fun NavController.safelyNavigate(directions: NavDirections) {
    safelyNavigate { navigate(directions) }
}

private fun NavController.safelyNavigate(call: NavController.() -> Unit) {
    try {
        this.call()
    } catch (e: IllegalArgumentException) {
        /* Thrown if the user double taps on the menu item before the app has a chance to remove
         * the button. No-op, we just put this here to avoid app crashing */
    }
}
