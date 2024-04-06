package alakazam.android.ui.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect

@Composable
public fun OnDispose(onDisposeEffect: () -> Unit) {
  DisposableEffect(Unit) {
    onDispose(onDisposeEffect)
  }
}
