package dev.jonpoulton.alakazam.kotlin.core

public inline fun <reified E : Enum<E>> enumFromString(string: String): E {
  return enumFromStringOrNull<E>(string) ?: error("No value matching $string")
}

public inline fun <reified E : Enum<E>> enumFromStringOrNull(string: String): E? {
  return enumValues<E>().firstOrNull { it.toString() == string }
}
