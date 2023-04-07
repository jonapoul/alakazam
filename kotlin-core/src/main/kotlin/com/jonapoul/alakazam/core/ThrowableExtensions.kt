package com.jonapoul.alakazam.core

fun Throwable.requireMessage(): String = this.message ?: "unknown error"
