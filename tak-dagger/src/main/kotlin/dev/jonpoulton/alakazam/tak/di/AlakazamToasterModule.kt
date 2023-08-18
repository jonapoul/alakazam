package dev.jonpoulton.alakazam.tak.di

import dagger.Module
import dagger.Provides
import dev.jonpoulton.alakazam.core.MainDispatcher
import dev.jonpoulton.alakazam.tak.core.AppContext
import dev.jonpoulton.alakazam.tak.core.PluginContext
import dev.jonpoulton.alakazam.tak.core.TakToaster

@Module
class AlakazamToasterModule {
  @Provides
  fun toaster(
    appContext: AppContext,
    pluginContext: PluginContext,
    main: MainDispatcher,
  ): TakToaster = TakToaster(appContext, pluginContext, main)
}
