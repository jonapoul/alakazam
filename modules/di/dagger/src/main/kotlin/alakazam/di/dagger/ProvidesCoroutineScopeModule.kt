package alakazam.di.dagger

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import javax.inject.Singleton

@Module
public class ProvidesCoroutineScopeModule {
  @Provides
  @Singleton
  public fun scope(): CoroutineScope = CoroutineScope(SupervisorJob())
}
