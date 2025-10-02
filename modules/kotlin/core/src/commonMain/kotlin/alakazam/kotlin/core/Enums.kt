/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
@file:Suppress("UnusedReceiverParameter")

package alakazam.kotlin.core

import kotlin.reflect.KClass

public inline fun <reified E : Enum<E>> KClass<E>.parseOrNull(string: String): E? =
  enumValues<E>().firstOrNull { it.toString() == string }

public inline fun <reified E : Enum<E>> KClass<E>.parse(string: String): E =
  parseOrNull(string) ?: error("No ${E::class.qualifiedName} matching '$string'")

public inline fun <reified E : Enum<E>> KClass<E>.parseOrNull(int: Int): E? =
  enumValues<E>().firstOrNull { it.ordinal == int }

public inline fun <reified E : Enum<E>> KClass<E>.parse(int: Int): E =
  parseOrNull(int) ?: error("No ${E::class.qualifiedName} with ordinal '$int'")

public inline fun <reified E : Enum<E>> KClass<E>.parseOrNull(long: Long): E? = parseOrNull(long.toInt())

public inline fun <reified E : Enum<E>> KClass<E>.parse(long: Long): E = parse(long.toInt())
