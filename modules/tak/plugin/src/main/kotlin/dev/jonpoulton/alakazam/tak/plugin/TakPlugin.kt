package dev.jonpoulton.alakazam.tak.plugin

import androidx.annotation.CallSuper
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.core.AppContext
import dev.jonpoulton.alakazam.tak.core.PluginContext
import dev.jonpoulton.alakazam.tak.core.TakContexts
import gov.tak.api.plugin.IPlugin
import gov.tak.api.plugin.IServiceController
import timber.log.Timber

public abstract class TakPlugin(serviceController: IServiceController) : IPlugin {
  protected val mapView: MapView = MapView.getMapView()
  protected val pluginContext: PluginContext = PluginContext(serviceController)
  protected val appContext: AppContext = AppContext(mapView)
  protected val contexts: TakContexts = TakContexts(pluginContext, appContext)

  protected open val timberTree: Timber.Tree? = null

  protected open fun startDI() {
    // No-op by default
  }

  protected open fun stopDI() {
    // No-op by default
  }

  @CallSuper
  override fun onStart() {
    timberTree?.let(Timber::plant)
    startDI()
  }

  @CallSuper
  override fun onStop() {
    stopDI()
    timberTree?.let(Timber::uproot)
  }
}
