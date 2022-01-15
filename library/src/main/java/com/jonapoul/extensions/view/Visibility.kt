package com.jonapoul.extensions.view

import android.view.View

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide(maintainLayout: Boolean = false) {
    visibility = if (maintainLayout) View.INVISIBLE else View.GONE
}

fun View.showIfTrue(condition: Boolean, maintainLayout: Boolean = false) {
    if (condition) show() else hide(maintainLayout)
}

fun View.hideIfTrue(condition: Boolean, maintainLayout: Boolean = false) {
    showIfTrue(!condition)
}

fun <A, B> View.showIfEquals(itemA: A, itemB: B, maintainLayout: Boolean = false) {
    if (itemA == itemB) show() else hide(maintainLayout)
}

fun <A, B> View.hideIfEquals(itemA: A, itemB: B, maintainLayout: Boolean = false) {
    if (itemA != itemB) hide(maintainLayout) else show()
}

fun <T> View.showIfNull(value: T?, maintainLayout: Boolean = false) {
    if (value == null) show() else hide(maintainLayout)
}

fun <T> View.hideIfNull(value: T?, maintainLayout: Boolean = false) {
    if (value == null) hide(maintainLayout) else show()
}
