package alakazam.di.dagger

import alakazam.kotlin.core.DefaultDispatcher
import alakazam.kotlin.core.IODispatcher
import alakazam.kotlin.core.MainDispatcher
import alakazam.kotlin.core.UnconfinedDispatcher
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import javax.inject.Singleton

@Suppress("InjectDispatcher")
@Module
public class ProvidesCoroutinesModule {
  @Provides
  @Singleton
  public fun scope(): CoroutineScope = CoroutineScope(SupervisorJob())

  @Provides
  @Singleton
  public fun providesIO(): IODispatcher = IODispatcher(Dispatchers.IO)

  @Provides
  @Singleton
  public fun providesMain(): MainDispatcher = MainDispatcher(Dispatchers.Main)

  @Provides
  @Singleton
  public fun providesDefault(): DefaultDispatcher = DefaultDispatcher(Dispatchers.Default)

  @Provides
  @Singleton
  public fun providesUnconfined(): UnconfinedDispatcher = UnconfinedDispatcher(Dispatchers.Unconfined)
}
