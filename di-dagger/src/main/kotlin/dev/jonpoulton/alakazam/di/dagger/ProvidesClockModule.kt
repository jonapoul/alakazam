package dev.jonpoulton.alakazam.di.dagger

import dagger.Module
import dagger.Provides
import kotlinx.datetime.Clock
import javax.inject.Singleton

@Module
class ProvidesClockModule {
  @Provides
  @Singleton
  fun clock(): Clock = Clock.System
}
