package dev.jonpoulton.alakazam.tak.dagger

import dagger.Module
import dagger.Provides
import dev.jonpoulton.alakazam.kotlin.core.MainDispatcher
import dev.jonpoulton.alakazam.tak.core.AppContext
import dev.jonpoulton.alakazam.tak.core.PluginContext
import dev.jonpoulton.alakazam.tak.core.TakToaster

@Module
class TakToasterModule {
  @Provides
  fun toaster(
    appContext: AppContext,
    pluginContext: PluginContext,
    main: MainDispatcher,
  ): TakToaster = TakToaster(appContext, pluginContext, main)
}
