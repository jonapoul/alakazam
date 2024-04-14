package alakazam.android.ui.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal

public val <T> ProvidableCompositionLocal<T?>.currentOrThrow: T
  @Composable
  get() = current ?: error("CompositionLocal $this is null")
