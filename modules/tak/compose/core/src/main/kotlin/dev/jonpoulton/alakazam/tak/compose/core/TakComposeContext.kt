package dev.jonpoulton.alakazam.tak.compose.core

import android.content.Context
import android.content.ContextWrapper
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import dev.jonpoulton.alakazam.tak.core.AppContext
import dev.jonpoulton.alakazam.tak.core.PluginContext
import dev.jonpoulton.alakazam.tak.core.TakContexts

/**
 * This class is a workaround for the fact that ComposeView needs the plugin to load resources, but also uses
 * the [app]'s application context for non-resource-related work.
 */
public class TakComposeContext(plugin: PluginContext, private val app: AppContext) : ContextWrapper(plugin) {
  public constructor(contexts: TakContexts) : this(contexts.plugin, contexts.app)

  override fun getApplicationContext(): Context = app.applicationContext
}

public val LocalTakComposeContext: ProvidableCompositionLocal<TakComposeContext> = compositionLocalOf {
  error("CompositionLocal TakComposeContext not present")
}
