package com.jonapoul.extensions

import android.view.View

/* Simple wrapper for ease of reading and typing */
fun View.show() {
    visibility = View.VISIBLE
}

/* Simple wrapper for ease of reading and typing */
fun View.hide() {
    visibility = View.GONE
}

/* Simple wrapper for ease of reading and typing */
fun View.showIfTrue(condition: Boolean) {
    if (condition) show() else hide()
}

/* Simple wrapper for ease of reading and typing */
fun View.hideIfTrue(condition: Boolean) {
    showIfTrue(!condition)
}

/**
 * Registers a callback to be run when the view is detached from the window. This is useful because
 * ViewBinding objects can't be accessed in the Fragment.onDestroyView method. This means that
 * without this method we'd be blocked from doing certain cleanup tasks in onDestroyView - such as
 * removing the adapter from a RecyclerView.
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
