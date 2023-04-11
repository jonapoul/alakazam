package dev.jonpoulton.alakazam.di

import dev.jonpoulton.alakazam.core.IBuildConfig
import dev.jonpoulton.alakazam.init.AppInitialisers
import dev.jonpoulton.alakazam.init.IAppInitialiser
import dev.jonpoulton.alakazam.init.LoggingInitialiser
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class InitialiserModule {
  @Provides
  @Singleton
  fun initialisers(initialisers: Set<@JvmSuppressWildcards IAppInitialiser>): AppInitialisers =
    AppInitialisers(initialisers)

  @Provides
  @IntoSet
  fun logging(buildConfig: IBuildConfig): IAppInitialiser = LoggingInitialiser(buildConfig)
}
