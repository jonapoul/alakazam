package dev.jonpoulton.alakazam.tak.domain

import android.app.Activity
import dev.jonpoulton.alakazam.core.IBuildConfig
import dev.jonpoulton.alakazam.tak.core.AboutDialog
import dev.jonpoulton.alakazam.tak.core.PluginContext
import javax.inject.Inject

class ShowAboutDialogUseCase @Inject constructor(
  private val pluginContext: PluginContext,
  private val buildConfig: IBuildConfig,
) {
  fun show(activity: Activity) {
    AboutDialog.show(activity, pluginContext, buildConfig)
  }
}
