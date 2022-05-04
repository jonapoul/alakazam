package com.jonapoul.common.core

fun Throwable.requireMessage(): String = this.message ?: "unknown error"
