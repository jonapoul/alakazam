package dev.jonpoulton.alakazam.tak.core

import android.widget.Toast

public class TakContexts(
  public val plugin: PluginContext,
  public val app: AppContext,
) {
  public fun toast(message: Int, length: Int = Toast.LENGTH_LONG) {
    toast(message = plugin.getString(message), length)
  }

  public fun toast(message: String, length: Int = Toast.LENGTH_LONG) {
    app.toast(message, length)
  }
}
