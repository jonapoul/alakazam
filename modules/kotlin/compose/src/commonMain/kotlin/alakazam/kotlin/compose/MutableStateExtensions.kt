/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.compose

import androidx.compose.runtime.MutableState

public fun <T> MutableState<T>.set(value: T) {
  this.value = value
}
