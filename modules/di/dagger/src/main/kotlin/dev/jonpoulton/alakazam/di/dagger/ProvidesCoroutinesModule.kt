package dev.jonpoulton.alakazam.di.dagger

import dagger.Module
import dagger.Provides
import dev.jonpoulton.alakazam.kotlin.core.DefaultDispatcher
import dev.jonpoulton.alakazam.kotlin.core.IODispatcher
import dev.jonpoulton.alakazam.kotlin.core.MainDispatcher
import dev.jonpoulton.alakazam.kotlin.core.UnconfinedDispatcher
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
