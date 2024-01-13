package dev.jonpoulton.alakazam.tak.compose.core

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import dev.jonpoulton.alakazam.tak.core.TakContexts

public val LocalTakContexts: ProvidableCompositionLocal<TakContexts?> = compositionLocalOf { null }
