package com.jonapoul.extensions.data

fun Throwable.requireMessage(): String = this.message ?: "unknown error"
