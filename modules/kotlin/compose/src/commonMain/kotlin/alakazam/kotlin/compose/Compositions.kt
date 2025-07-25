package alakazam.kotlin.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable

public val <T> ProvidableCompositionLocal<T?>.currentOrThrow: T
  @Composable
  @ReadOnlyComposable
  get() = current ?: error("CompositionLocal $this is null")
