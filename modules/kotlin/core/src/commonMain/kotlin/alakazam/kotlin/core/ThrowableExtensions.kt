/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.core

public fun Throwable.requireMessage(): String = this.message ?: "unknown error"
