package dev.jonpoulton.alakazam.kotlin.core

fun Throwable.requireMessage(): String = this.message ?: "unknown error"
