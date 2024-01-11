package dev.jonpoulton.alakazam.kotlin.core

inline fun <reified E : Enum<E>> enumFromString(string: String): E {
  return enumFromStringOrNull<E>(string) ?: error("No value matching $string")
}

inline fun <reified E : Enum<E>> enumFromStringOrNull(string: String): E? {
  return enumValues<E>().firstOrNull { it.toString() == string }
}
