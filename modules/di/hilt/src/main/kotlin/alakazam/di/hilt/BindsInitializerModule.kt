package alakazam.di.hilt

import alakazam.android.init.AppInitializer
import alakazam.android.init.LoggingInitializer
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@InstallIn(SingletonComponent::class)
@Module
public interface BindsInitializerModule {
  @Binds
  @IntoSet
  public fun logging(init: LoggingInitializer): AppInitializer
}
