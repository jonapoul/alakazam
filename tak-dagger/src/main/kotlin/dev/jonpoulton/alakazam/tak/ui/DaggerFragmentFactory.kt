package dev.jonpoulton.alakazam.tak.ui

import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.core.PluginContext
import dev.jonpoulton.alakazam.tak.di.DaggerInjector

fun interface DaggerFragmentFactory {
  fun create(
    pluginContext: PluginContext,
    mapView: MapView,
    injector: DaggerInjector,
    navigationHandler: DaggerNavigationHandler,
  ): DaggerTakFragment
}
