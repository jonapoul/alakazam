/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect

@Composable
public fun OnDispose(onDisposeEffect: () -> Unit) {
  DisposableEffect(Unit) {
    onDispose(onDisposeEffect)
  }
}
