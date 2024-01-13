package dev.jonpoulton.alakazam.di.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.jonpoulton.alakazam.android.init.AppInitializer
import dev.jonpoulton.alakazam.android.init.AppInitializers
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
public class ProvidesInitializerModule {
  @Provides
  @Singleton
  public fun initializers(initializers: Set<@JvmSuppressWildcards AppInitializer>): AppInitializers =
    AppInitializers(initializers)
}
