package dev.jonpoulton.alakazam.tak.compose.core

import android.content.Context
import android.content.ContextWrapper
import android.content.res.Resources
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.text.font.createFontFamilyResolver
import dev.jonpoulton.alakazam.tak.core.AppContext
import dev.jonpoulton.alakazam.tak.core.PluginContext
import dev.jonpoulton.alakazam.tak.core.TakContexts

/**
 * This class is a workaround for the fact that ComposeView needs the plugin to load resources, but also uses
 * the [app]'s application context for non-resource-related work.
 */
public class TakComposeContext(
  plugin: PluginContext,
  private val app: AppContext,
) : ContextWrapper(plugin) {
  public constructor(contexts: TakContexts) : this(contexts.plugin, contexts.app)

  private val applicationContext = TakComposeApplicationContext(plugin, app)

  override fun getApplicationContext(): Context = applicationContext

  /**
   * Needed for font resolution. [androidx.compose.ui.platform.AndroidComposeView] creates its own call to
   * [createFontFamilyResolver], so we can't choose which context to pass in. Internally, it calls [getResources]
   * on the [TakComposeContext]'s application context, so we need to make sure it's pointing to the right place.
   */
  private class TakComposeApplicationContext(
    private val plugin: PluginContext,
    app: AppContext,
  ) : ContextWrapper(app.applicationContext) {
    override fun getResources(): Resources = plugin.resources
  }
}

public val LocalTakComposeContext: ProvidableCompositionLocal<TakComposeContext> = compositionLocalOf {
  error("CompositionLocal TakComposeContext not present")
}
