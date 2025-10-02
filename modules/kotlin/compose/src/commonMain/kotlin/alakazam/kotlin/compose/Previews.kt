/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.kotlin.compose

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
public fun PreviewSurface(
  modifier: Modifier = Modifier,
  colours: ColorScheme = MaterialTheme.colorScheme,
  content: @Composable () -> Unit,
) {
  MaterialTheme(colours) {
    Surface(modifier) {
      content()
    }
  }
}
