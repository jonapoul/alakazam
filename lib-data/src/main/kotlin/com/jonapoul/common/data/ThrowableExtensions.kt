package com.jonapoul.common.data

fun Throwable.requireMessage(): String = this.message ?: "unknown error"
