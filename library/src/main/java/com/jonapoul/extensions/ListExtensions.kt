package com.jonapoul.extensions

fun <T> List<T>.deepCopy(): List<T> {
    return ArrayList<T>().also {
        it.addAll(this)
    }
}

fun <T> MutableList<T>.replaceAllWith(list: List<T>) {
    clear()
    addAll(list)
}
