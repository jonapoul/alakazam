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

fun ViewGroup.disableChildren() {
    setChildrenEnabled(false)
}

fun ViewGroup.enableChildren() {
    setChildrenEnabled(true)
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}
