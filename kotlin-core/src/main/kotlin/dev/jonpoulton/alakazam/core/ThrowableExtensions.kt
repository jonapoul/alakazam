package dev.jonpoulton.alakazam.core

fun Throwable.requireMessage(): String = this.message ?: "unknown error"
