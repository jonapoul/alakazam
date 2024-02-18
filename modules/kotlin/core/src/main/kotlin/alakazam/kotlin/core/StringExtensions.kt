package alakazam.kotlin.core

import java.util.Locale

/**
 * Attempts to parse a [Boolean] value from the supplied [String], case-insensitively. If the
 * string is not "true" or "false", a [IllegalStateException] is thrown.
 */
@Throws(IllegalStateException::class)
public fun String.parseBoolean(): Boolean {
  return when {
    this.equals("true", ignoreCase = true) -> true
    this.equals("false", ignoreCase = true) -> false
    else -> error("Unable to parse boolean from '$this'")
  }
}

/**
 * Replaces the first character of the supplied [String] with a capitalised version.
 * Mercilessly lifted from https://stackoverflow.com/a/67843987/15634757
 */
public fun String.capitalized(): String {
  return this.replaceFirstChar {
    if (it.isLowerCase()) {
      it.titlecase(Locale.getDefault())
    } else {
      it.toString()
    }
  }
}

public fun String.throwIfBlank(): String {
  if (this.isBlank()) {
    error("String can't be blank!")
  } else {
    return this
  }
}

// Pulled from https://www.romainguy.dev/posts/2024/speeding-up-isblank/
public inline fun CharSequence.fastIsBlank(): Boolean {
  for (i in 0 until length) {
    val c = this[i]
    if (!Character.isWhitespace(c) && c != '\u00a0' && c != '\u2007' && c != '\u202f') {
      return false
    }
  }
  return true
}
