/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
@file:Suppress("UnreachableCode", "RedundantSuppression")

package alakazam.test.core

import java.io.InputStream

public inline fun <reified T> T.getResourceAsStream(filename: String): InputStream =
  T::class.java.classLoader?.getResourceAsStream(filename)
    ?: error("Null input stream for $filename!")

public inline fun <reified T> T.getResourceAsText(filename: String): String =
  getResourceAsStream(filename)
    .reader()
    .readText()
