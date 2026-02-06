package alakazam.kotlin

public fun Throwable.requireMessage(): String = this.message ?: "unknown error"
