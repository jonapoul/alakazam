package com.jonapoul.alakazam.di

import com.jonapoul.alakazam.core.IBuildConfig
import com.jonapoul.alakazam.init.AppInitialisers
import com.jonapoul.alakazam.init.IAppInitialiser
import com.jonapoul.alakazam.init.LoggingInitialiser
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
