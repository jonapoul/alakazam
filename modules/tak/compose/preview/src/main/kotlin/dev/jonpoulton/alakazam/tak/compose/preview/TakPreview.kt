package dev.jonpoulton.alakazam.tak.compose.preview

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import dev.jonpoulton.alakazam.tak.compose.core.TakTheme

@Composable
public fun TakPreview(content: @Composable () -> Unit): Unit = TakTheme {
  Surface {
    content()
  }
}
