package dev.jonpoulton.alakazam.tak.compose.core

import android.content.Context
import android.content.ContextWrapper
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import com.atakmap.android.maps.MapView
import dev.jonpoulton.alakazam.tak.core.AppContext
import dev.jonpoulton.alakazam.tak.core.PluginContext
import dev.jonpoulton.alakazam.tak.core.TakContexts

/**
 * This class is a workaround for the fact that ComposeView needs the [plugin] to load resources, but also uses
 * the [app]'s application context for non-resource-related work.
 */
class TakComposeContext : ContextWrapper {
  private val app: Context

  constructor(plugin: PluginContext, app: AppContext) : super(plugin) {
    this.app = app
  }

  constructor(contexts: TakContexts) : this(contexts.plugin, contexts.app)

  constructor(plugin: PluginContext, mapView: MapView) : this(plugin, AppContext(mapView))

  override fun getApplicationContext(): Context = app.applicationContext
}

val LocalTakComposeContext: ProvidableCompositionLocal<TakComposeContext?> = compositionLocalOf { null }
