/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
@file:Suppress("TooManyFunctions")

package alakazam.android.ui.core

import alakazam.android.core.inputMethodManager
import android.view.View
import android.view.animation.AlphaAnimation
import androidx.annotation.UiThread

/**
 * Starts a fading-in animation of the given [View]. The default fade duration is 500 milliseconds.
 */
@UiThread
public fun View.fadeIn(duration: Long = 500L) {
  fade(duration, 1.0f)
}

/**
 * Starts a fading-out animation of the given [View]. The default fade duration is 500 milliseconds.
 */
@UiThread
public fun View.fadeOut(duration: Long = 500L) {
  fade(duration, 0.0f)
}

@UiThread
private fun View.fade(duration: Long, targetAlpha: Float) {
  this.clearAnimation()
  this.startAnimation(
    AlphaAnimation(this.alpha, targetAlpha).also {
      it.duration = duration
    },
  )
}

@UiThread
public fun View.hideKeyboard() {
  context.inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
}
