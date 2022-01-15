@file:Suppress("TooManyFunctions")

package com.jonapoul.extensions.view

import android.os.Build
import android.view.View
import android.view.animation.AlphaAnimation
import androidx.annotation.RequiresApi
import androidx.annotation.UiThread
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

/**
 * Registers a callback to be run when the view is detached from the window. This is useful because
 * ViewBinding objects can't be accessed in the [Fragment.onDestroyView] method. This means that
 * without this method we'd be blocked from doing certain cleanup tasks in onDestroyView - such as
 * removing the adapter from a [RecyclerView].
 */
@RequiresApi(Build.VERSION_CODES.HONEYCOMB_MR1)
fun <V : View> V.onDestroyView(callback: V.() -> Unit) {
    addOnAttachStateChangeListener(
        object : View.OnAttachStateChangeListener {
            override fun onViewAttachedToWindow(v: View?) {
                /* No-op */
            }

            override fun onViewDetachedFromWindow(v: View?) {
                callback()
                removeOnAttachStateChangeListener(this)
            }
        }
    )
}

/**
 * Starts a fading-in animation of the given [View]. The default fade duration is 500 milliseconds.
 */
@UiThread
@RequiresApi(Build.VERSION_CODES.HONEYCOMB)
fun View.fadeIn(duration: Long = 500L) {
    fade(duration, 1.0f)
}

/**
 * Starts a fading-out animation of the given [View]. The default fade duration is 500 milliseconds.
 */
@UiThread
@RequiresApi(Build.VERSION_CODES.HONEYCOMB)
fun View.fadeOut(duration: Long = 500L) {
    fade(duration, 0.0f)
}

@UiThread
@RequiresApi(Build.VERSION_CODES.HONEYCOMB)
private fun View.fade(duration: Long, targetAlpha: Float) {
    this.clearAnimation()
    this.startAnimation(
        AlphaAnimation(this.alpha, targetAlpha).also {
            it.duration = duration
        }
    )
}
