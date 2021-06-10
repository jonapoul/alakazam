package com.jonapoul.extensions

import java.io.Closeable

fun Closeable.safelyClose() {
    try {
        close()
    } catch (e: Exception) {
        /* No-op */
    }
}
