package dev.jonpoulton.alakazam.di.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.jonpoulton.alakazam.android.init.AppInitializers
import dev.jonpoulton.alakazam.android.init.AppInitializer
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ProvidesInitializerModule {
  @Provides
  @Singleton
  fun initializers(initializers: Set<@JvmSuppressWildcards AppInitializer>): AppInitializers =
    AppInitializers(initializers)
}
