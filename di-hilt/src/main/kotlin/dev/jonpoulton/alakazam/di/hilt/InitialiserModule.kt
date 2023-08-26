package dev.jonpoulton.alakazam.di.hilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import dev.jonpoulton.alakazam.android.init.AppInitialisers
import dev.jonpoulton.alakazam.android.init.IAppInitialiser
import dev.jonpoulton.alakazam.android.init.LoggingInitialiser
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ProvidesInitialiserModule {
  @Provides
  @Singleton
  fun initialisers(initialisers: Set<@JvmSuppressWildcards IAppInitialiser>): AppInitialisers =
    AppInitialisers(initialisers)
}

@InstallIn(SingletonComponent::class)
@Module
interface BindsInitialiserModule {
  @Binds
  @IntoSet
  fun logging(init: LoggingInitialiser): IAppInitialiser
}
