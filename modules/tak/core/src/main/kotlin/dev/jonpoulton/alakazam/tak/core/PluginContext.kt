package dev.jonpoulton.alakazam.tak.core

import android.content.Context
import android.content.ContextWrapper
import com.atak.plugins.impl.PluginContextProvider
import gov.tak.api.plugin.IServiceController

public class PluginContext(context: Context) : ContextWrapper(context) {
  public constructor(serviceController: IServiceController) : this(
    context = serviceController.getService(PluginContextProvider::class.java).pluginContext
  )
}
