package dev.jonpoulton.alakazam.tak.compose.core

import android.view.View
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf

public val LocalMapView: ProvidableCompositionLocal<View> = compositionLocalOf {
  error("CompositionLocal LocalMapView not present")
}
