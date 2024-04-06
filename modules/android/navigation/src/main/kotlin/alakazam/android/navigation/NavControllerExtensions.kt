package alakazam.android.navigation

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.Navigator

/**
 * Performs navigation to the specified [destination], ignoring the effects of double-tapping the
 * button and any associated [IllegalArgumentException]
 */
public fun NavController.safelyNavigate(
  @IdRes destination: Int,
): Unit = safely {
  navigate(destination)
}

/**
 * Performs navigation to the specified [destination], ignoring the effects of double-tapping the
 * button and any associated [IllegalArgumentException]
 */
public fun NavController.safelyNavigate(
  @IdRes destination: Int,
  args: Bundle?,
  navOptions: NavOptions,
): Unit = safely {
  navigate(destination, args, navOptions)
}

/**
 * Performs navigation to the specified [destination], ignoring the effects of double-tapping the
 * button and any associated [IllegalArgumentException]
 */
public fun NavController.safelyNavigate(
  @IdRes destination: Int,
  args: Bundle?,
  navOptions: NavOptions,
  extras: Navigator.Extras,
): Unit = safely {
  navigate(destination, args, navOptions, extras)
}

/**
 * Performs navigation to the specified [directions], ignoring the effects of double-tapping the
 * button and any associated [IllegalArgumentException]
 */
public fun NavController.safelyNavigate(directions: NavDirections): Unit =
  safely {
    navigate(directions)
  }

/**
 * Performs navigation to the specified [directions], ignoring the effects of double-tapping the
 * button and any associated [IllegalArgumentException]
 */
public fun NavController.safelyNavigate(directions: NavDirections, navOptions: NavOptions): Unit =
  safely {
    navigate(directions, navOptions)
  }

/**
 * Performs navigation to the specified [directions], ignoring the effects of double-tapping the
 * button and any associated [IllegalArgumentException]
 */
public fun NavController.safelyNavigate(directions: NavDirections, navExtras: Navigator.Extras): Unit =
  safely {
    navigate(directions, navExtras)
  }

private fun NavController.safely(call: NavController.() -> Unit) {
  try {
    this.call()
  } catch (e: IllegalArgumentException) {
    /* I've seen this exception thrown sometimes if the user double taps on a menu item or
     * button very quickly before the app has a chance to actually navigate. No-op, we just put
     * this here to avoid the app crashing */
  }
}
