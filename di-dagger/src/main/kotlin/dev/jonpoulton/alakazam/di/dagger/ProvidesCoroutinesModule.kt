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
class ProvidesCoroutinesModule {
  @Provides
  @Singleton
  fun scope(): CoroutineScope = CoroutineScope(SupervisorJob())

  @Provides
  @Singleton
  fun providesIO(): IODispatcher = IODispatcher(Dispatchers.IO)

  @Provides
  @Singleton
  fun providesMain(): MainDispatcher = MainDispatcher(Dispatchers.Main)

  @Provides
  @Singleton
  fun providesDefault(): DefaultDispatcher = DefaultDispatcher(Dispatchers.Default)

  @Provides
  @Singleton
  fun providesUnconfined(): UnconfinedDispatcher = UnconfinedDispatcher(Dispatchers.Unconfined)
}
