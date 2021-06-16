package com.jonapoul.extensions

import java.util.*

fun String.parseBoolean(): Boolean {
    return when (this.lowercase(Locale.ENGLISH)) {
        "true" -> true
        "false" -> false
        else -> error("Unable to parse boolean from '$this'")
    }
}

/*
* Mercilessly lifted from https://stackoverflow.com/a/67843987/15634757
*/
fun String.capitalized(): String {
    return this.replaceFirstChar {
        if (it.isLowerCase()) {
            it.titlecase(Locale.getDefault())
        } else {
            it.toString()
        }
    }
}
