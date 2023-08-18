package dev.jonpoulton.alakazam.tak.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelStore
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.core.PluginContext
import dev.jonpoulton.alakazam.tak.di.DaggerInjector

abstract class DaggerDropDownReceiver(
  mapView: MapView,
  pluginContext: PluginContext,
  isSwitchable: Boolean = false,
) : CommonDropDownReceiver(mapView, pluginContext, isSwitchable), DaggerNavigationHandler {
  protected abstract val injector: DaggerInjector

  private val viewModelStore = ViewModelStore()

  override fun getViewModelStore(): ViewModelStore = viewModelStore

  override fun navForward(factory: DaggerFragmentFactory, args: Bundle?) {
    navForward(
      fragment = factory.create(pluginContext, mapView, injector, navigationHandler = this),
      args = args,
    )
  }

  override fun navReplace(factory: DaggerFragmentFactory, args: Bundle?) {
    navReplace(
      fragment = factory.create(pluginContext, mapView, injector, navigationHandler = this),
      args = args,
    )
  }
}
