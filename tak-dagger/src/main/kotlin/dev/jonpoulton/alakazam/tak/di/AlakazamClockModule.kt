package dev.jonpoulton.alakazam.tak.di

import dagger.Module
import dagger.Provides
import dev.jonpoulton.alakazam.time.Clock
import dev.jonpoulton.alakazam.time.SystemClock

@Module
class AlakazamClockModule {
  @Provides
  fun clock(): Clock = SystemClock
}
