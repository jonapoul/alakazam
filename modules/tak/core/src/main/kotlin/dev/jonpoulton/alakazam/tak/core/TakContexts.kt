package dev.jonpoulton.alakazam.tak.core

import android.widget.Toast

public interface TakContexts {
  public val plugin: PluginContext
  public val app: AppContext
}

private data class TakContextsImpl(
  override val plugin: PluginContext,
  override val app: AppContext,
) : TakContexts

public fun TakContexts(plugin: PluginContext, app: AppContext): TakContexts = TakContextsImpl(plugin, app)

public fun TakContexts.toast(message: Int, length: Int = Toast.LENGTH_LONG) {
  toast(message = plugin.getString(message), length)
}

public fun TakContexts.toast(message: String, length: Int = Toast.LENGTH_LONG) {
  app.toast(message, length)
}
