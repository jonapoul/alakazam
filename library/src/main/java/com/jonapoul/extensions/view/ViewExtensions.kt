package com.jonapoul.extensions.view

import android.view.View
import android.view.animation.AlphaAnimation
import androidx.annotation.UiThread
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

/**
 * Sets the supplied [View]'s visibility to [View.VISIBLE].
 */
fun View.show() {
    visibility = View.VISIBLE
}

/**
 * Sets the supplied [View]'s visibility to [View.GONE].
 */
fun View.hide() {
    visibility = View.GONE
}

/**
 * Sets the supplied [View]'s visibility to [View.VISIBLE], if the supplied [condition] is true.
 */
fun View.showIfTrue(condition: Boolean) {
    if (condition) show() else hide()
}

/**
 * Sets the supplied [View]'s visibility to [View.GONE], if the supplied [condition] is true.
 */
fun View.hideIfTrue(condition: Boolean) {
    showIfTrue(!condition)
}

/**
 * Registers a callback to be run when the view is detached from the window. This is useful because
 * ViewBinding objects can't be accessed in the [Fragment.onDestroyView] method. This means that
 * without this method we'd be blocked from doing certain cleanup tasks in onDestroyView - such as
 * removing the adapter from a [RecyclerView].
 */
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

/**
 * Sets the given [View]'s state to enabled.
 */
fun View.enable() {
    this.isEnabled = true
}

/**
 * Sets the given [View]'s state to disabled.
 */
fun View.disable() {
    this.isEnabled = false
}

/**
 * Sets the given [View]'s state to enabled if [condition] is true, else disabled.
 */
fun View.enableIf(condition: Boolean) {
    if (condition) enable() else disable()
}

/**
 * Sets the given [View]'s state to disabled if [condition] is true, else enabled.
 */
fun View.disableIf(condition: Boolean) {
    enableIf(!condition)
}
