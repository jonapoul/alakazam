package alakazam.di.hilt

import alakazam.android.init.AppInitializer
import alakazam.android.init.AppInitializers
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
public class ProvidesInitializerModule {
  @Provides
  @Singleton
  public fun initializers(initializers: Set<@JvmSuppressWildcards AppInitializer>): AppInitializers =
    AppInitializers(initializers)
}
