package alakazam.di.dagger

import alakazam.kotlin.core.CoroutineContexts
import alakazam.kotlin.core.DefaultCoroutineContexts
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
public class ProvidesCoroutineContextsModule {
  @Provides
  @Singleton
  public fun contexts(): CoroutineContexts = DefaultCoroutineContexts()
}
