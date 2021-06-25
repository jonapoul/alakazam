package com.jonapoul.extensions.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.core.view.children

private fun ViewGroup.setChildrenEnabled(enable: Boolean) {
    children.forEach {
        when (it) {
            is ViewGroup -> it.setChildrenEnabled(enable)
            else -> enableIf(enable)
        }
    }
}

/**
 * Recursively sets every [View] under this [ViewGroup] to a disabled state.
 */
fun ViewGroup.disableChildren() {
    setChildrenEnabled(false)
}

/**
 * Recursively sets every [View] under this [ViewGroup] to an enabled state.
 */
fun ViewGroup.enableChildren() {
    setChildrenEnabled(true)
}

/**
 * Inflates the given view. Mostly useful for the purposes of calling onCreateViewHolder in a
 * RecyclerView adapter.
 */
fun ViewGroup.inflate(@LayoutRes layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}
