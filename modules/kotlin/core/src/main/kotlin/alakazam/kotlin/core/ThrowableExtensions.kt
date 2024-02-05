package alakazam.kotlin.core

public fun Throwable.requireMessage(): String = this.message ?: "unknown error"
