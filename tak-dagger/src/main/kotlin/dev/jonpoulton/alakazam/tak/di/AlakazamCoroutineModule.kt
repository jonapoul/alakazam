package dev.jonpoulton.alakazam.tak.di

import dagger.Module
import dagger.Provides
import dev.jonpoulton.alakazam.core.DefaultDispatcher
import dev.jonpoulton.alakazam.core.IODispatcher
import dev.jonpoulton.alakazam.core.MainDispatcher
import dev.jonpoulton.alakazam.core.UnconfinedDispatcher
import kotlinx.coroutines.Dispatchers

@Module
class AlakazamCoroutineModule {
  @Provides
  fun main(): MainDispatcher = MainDispatcher(Dispatchers.Main)

  @Provides
  fun io(): IODispatcher = IODispatcher(Dispatchers.IO)

  @Provides
  fun default(): DefaultDispatcher = DefaultDispatcher(Dispatchers.Default)

  @Provides
  fun unconfined(): UnconfinedDispatcher = UnconfinedDispatcher(Dispatchers.Unconfined)
}
