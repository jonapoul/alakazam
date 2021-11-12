package com.jonapoul.extensions.throwable

fun Throwable.requireMessage(): String = this.message ?: "unknown error"
