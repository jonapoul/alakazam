package alakazam.android.core

import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.TypedValue
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
public fun Context.toast(message: String, length: Int = Toast.LENGTH_LONG) {
  Toast.makeText(this, message, length).show()
}

/**
 * Shows a toast with the given string resource as a message.
 */
public fun Context.toast(
  @StringRes message: Int,
  length: Int = Toast.LENGTH_LONG,
) {
  toast(getString(message), length)
}

/**
 * Pulls a [ColorInt] colour from our current app theme. We assume that the user passes in a valid
 * colour attribute in the [color] parameter.
 */
@ColorInt
public fun Context.getColorFromAttr(
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
public fun Context.hasPermission(permission: String): Boolean {
  val permissionState = ContextCompat.checkSelfPermission(this, permission)
  return permissionState == PackageManager.PERMISSION_GRANTED
}

/**
 * Shorthand method to start the specified [Service] class with the given [action] string.
 */
public inline fun <reified S : Service> Context.startServiceWithAction(action: String) {
  startService(
    Intent(this, S::class.java).apply {
      setAction(action)
    },
  )
}

/**
 * Get color from resources
 */
public fun Context.getCompatColor(
  @ColorRes colorInt: Int,
): Int = ContextCompat.getColor(this, colorInt)

/**
 * Get drawable from resources
 */
public fun Context.getCompatDrawable(
  @DrawableRes drawableRes: Int,
): Drawable = ContextCompat.getDrawable(this, drawableRes)
  ?: error("Failed to get drawable from $this for $drawableRes")

public fun Context.drawableToBitmap(
  @DrawableRes drawableRes: Int,
): Bitmap {
  val drawable = getCompatDrawable(drawableRes)
  val bitmap = Bitmap.createBitmap(drawable.intrinsicWidth, drawable.intrinsicHeight, Bitmap.Config.ARGB_8888)
  val canvas = Canvas(bitmap)
  drawable.setBounds(0, 0, canvas.width, canvas.height)
  drawable.draw(canvas)
  return bitmap
}
