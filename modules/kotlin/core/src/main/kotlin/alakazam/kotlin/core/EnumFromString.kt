package alakazam.kotlin.core

public inline fun <reified E : Enum<E>> enumFromString(string: String): E =
  enumFromStringOrNull<E>(string) ?: error("No value matching $string")

public inline fun <reified E : Enum<E>> enumFromStringOrNull(string: String): E? =
  enumValues<E>().firstOrNull { it.toString() == string }
