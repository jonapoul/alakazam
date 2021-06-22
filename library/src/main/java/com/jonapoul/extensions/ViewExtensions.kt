package com.jonapoul.extensions

import android.view.View
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
