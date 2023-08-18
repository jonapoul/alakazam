package dev.jonpoulton.alakazam.tak.domain

import dev.jonpoulton.alakazam.core.IBuildConfig
import dev.jonpoulton.alakazam.tak.core.AboutDialog
import dev.jonpoulton.alakazam.tak.core.AppContext
import dev.jonpoulton.alakazam.tak.core.PluginContext
import javax.inject.Inject

class ShowAboutDialogUseCase @Inject constructor(
  private val appContext: AppContext,
  private val pluginContext: PluginContext,
  private val buildConfig: IBuildConfig,
) {
  fun show() {
    AboutDialog.show(appContext, pluginContext, buildConfig)
  }
}
