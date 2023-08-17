package dev.jonpoulton.alakazam.tak.plugin

import android.app.Activity
import android.content.res.Configuration
import androidx.annotation.CallSuper
import com.atakmap.android.maps.MapComponent
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.core.AppContext
import dev.jonpoulton.alakazam.tak.core.PluginContext
import timber.log.Timber

@Suppress("DEPRECATION")
abstract class CommonLifecycle : transapps.maps.plugin.lifecycle.Lifecycle {
  protected abstract val mapComponents: List<MapComponent>
  protected abstract val pluginContext: PluginContext

  protected lateinit var mapView: MapView
  protected lateinit var appContext: AppContext

  protected open val timberTree: Timber.Tree? = null

  @CallSuper
  override fun onCreate(activity: Activity, mv: transapps.mapi.MapView) {
    Timber.v("onCreate")
    mapView = mv.view as? MapView ?: error("Plugin is only compatible with ATAK MapView")
    appContext = AppContext(mapView)
    timberTree?.let(Timber::plant)
    mapComponents.forEach { it.onCreate(pluginContext, activity.intent, mapView) }
  }

  @CallSuper
  override fun onStart() {
    Timber.v("onStart")
    mapComponents.forEach { it.onStart(pluginContext, mapView) }
  }

  @CallSuper
  override fun onPause() {
    Timber.v("onPause")
    mapComponents.forEach { it.onPause(pluginContext, mapView) }
  }

  @CallSuper
  override fun onResume() {
    Timber.v("onResume")
    mapComponents.forEach { it.onResume(pluginContext, mapView) }
  }

  @CallSuper
  override fun onStop() {
    Timber.v("onStop")
    mapComponents.forEach { it.onStop(pluginContext, mapView) }
  }

  @CallSuper
  override fun onDestroy() {
    Timber.v("onDestroy")
    mapComponents.forEach { it.onDestroy(pluginContext, mapView) }
    timberTree?.let(Timber::uproot)
  }

  @CallSuper
  override fun onConfigurationChanged(configuration: Configuration) {
    Timber.v("onConfigurationChanged $configuration")
    mapComponents.forEach { it.onConfigurationChanged(configuration) }
  }

  @CallSuper
  override fun onFinish() {
    Timber.v("onFinish")
  }
}
