package dev.jonpoulton.alakazam.tak.core

import android.widget.Toast

interface TakContexts {
  val plugin: PluginContext
  val app: AppContext
}

private data class TakContextsImpl(
  override val plugin: PluginContext,
  override val app: AppContext,
) : TakContexts

fun TakContexts(plugin: PluginContext, app: AppContext): TakContexts = TakContextsImpl(plugin, app)

fun TakContexts.toast(message: Int, length: Int = Toast.LENGTH_LONG) {
  toast(message = plugin.getString(message), length)
}

fun TakContexts.toast(message: String, length: Int = Toast.LENGTH_LONG) {
  app.toast(message, length)
}
