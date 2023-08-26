@file:Suppress("TooManyFunctions")

package dev.jonpoulton.alakazam.ui.core

import android.view.View
import android.view.animation.AlphaAnimation
import android.view.inputmethod.InputMethodManager
import androidx.annotation.UiThread
import androidx.core.content.getSystemService

/**
 * Starts a fading-in animation of the given [View]. The default fade duration is 500 milliseconds.
 */
@UiThread
fun View.fadeIn(duration: Long = 500L) {
  fade(duration, 1.0f)
}

/**
 * Starts a fading-out animation of the given [View]. The default fade duration is 500 milliseconds.
 */
@UiThread
fun View.fadeOut(duration: Long = 500L) {
  fade(duration, 0.0f)
}

@UiThread
private fun View.fade(duration: Long, targetAlpha: Float) {
  this.clearAnimation()
  this.startAnimation(
    AlphaAnimation(this.alpha, targetAlpha).also {
      it.duration = duration
    }
  )
}

@UiThread
fun View.hideKeyboard() {
  val imm = context.getSystemService<InputMethodManager>()!!
  imm.hideSoftInputFromWindow(windowToken, 0)
}
