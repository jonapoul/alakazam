package com.jonapoul.extensions

import java.util.*

fun String.parseBoolean(): Boolean {
    return when (this.lowercase(Locale.ENGLISH)) {
        "true" -> true
        "false" -> false
        else -> throw IllegalArgumentException("Unable to parse boolean from '$this'")
    }
}
