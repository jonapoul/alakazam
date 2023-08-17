package dev.jonpoulton.alakazam.tak.ui

import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.core.PluginContext

fun interface TakFragmentFactory {
  fun create(
    pluginContext: PluginContext,
    mapView: MapView,
    navigationHandler: NavigationHandler,
  ): TakFragment
}
