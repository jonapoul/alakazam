package dev.jonpoulton.alakazam.core

import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.drawable.Drawable
import android.util.TypedValue
import android.view.LayoutInflater
import android.widget.Toast
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat

/**
 * Shows a toast with the given [message].
 */
fun Context.toast(message: String) {
  Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

/**
 * Shows a toast with the given string resource as a message.
 */
fun Context.toast(@StringRes message: Int) {
  toast(getString(message))
}

/**
 * Pulls a [ColorInt] colour from our current app theme. We assume that the user passes in a valid
 * colour attribute in the [color] parameter.
 */
@ColorInt
fun Context.getColorFromAttr(
  @AttrRes color: Int,
  value: TypedValue = TypedValue(),
  resolveRefs: Boolean = true,
): Int {
  theme.resolveAttribute(color, value, resolveRefs)
  return value.data
}

/**
 * Checks whether the given app [Context] has been granted the specified [permission].
 */
fun Context.hasPermission(permission: String): Boolean {
  val permissionState = ContextCompat.checkSelfPermission(this, permission)
  return permissionState == PackageManager.PERMISSION_GRANTED
}

/**
 * Shorthand method to start the specified [Service] class with the given [action] string.
 */
inline fun <reified S : Service> Context.startServiceWithAction(action: String) {
  startService(
    Intent(this, S::class.java).apply {
      setAction(action)
    }
  )
}

/**
 * Get color from resources
 */
fun Context.getCompatColor(@ColorRes colorInt: Int): Int {
  return ContextCompat.getColor(this, colorInt)
}

/**
 * Get drawable from resources
 */
fun Context.getCompatDrawable(@DrawableRes drawableRes: Int): Drawable {
  return ContextCompat.getDrawable(this, drawableRes)
    ?: error("Failed to get drawable from $this for $drawableRes")
}

val Context.inflater: LayoutInflater
  get() = LayoutInflater.from(this)
