package com.jonapoul.extensions.throwable

fun Throwable.requireMessage(): String {
    return this.message ?: "unknown error"
}
