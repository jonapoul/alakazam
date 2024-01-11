package dev.jonpoulton.alakazam.tak.compose.viewmodel

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.lifecycle.ViewModelProvider

val LocalViewModelFactory: ProvidableCompositionLocal<ViewModelProvider.Factory?> = compositionLocalOf { null }
