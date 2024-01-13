package dev.jonpoulton.alakazam.di.hilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import dev.jonpoulton.alakazam.android.init.AppInitializer
import dev.jonpoulton.alakazam.android.init.LoggingInitializer

@InstallIn(SingletonComponent::class)
@Module
public interface BindsInitializerModule {
  @Binds
  @IntoSet
  public fun logging(init: LoggingInitializer): AppInitializer
}
