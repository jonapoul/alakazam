package alakazam.kotlin.core

import kotlin.reflect.KClass

@Suppress("UnusedReceiverParameter")
public inline fun <reified E : Enum<E>> KClass<E>.parseOrNull(string: String): E? =
  enumValues<E>().firstOrNull { it.toString() == string }

public inline fun <reified E : Enum<E>> KClass<E>.parse(string: String): E =
  parseOrNull(string) ?: error("No ${E::class.qualifiedName} matching '$string'")
