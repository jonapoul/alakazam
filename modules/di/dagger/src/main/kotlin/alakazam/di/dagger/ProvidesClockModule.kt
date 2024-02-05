package alakazam.di.dagger

import dagger.Module
import dagger.Provides
import kotlinx.datetime.Clock
import javax.inject.Singleton

@Module
public class ProvidesClockModule {
  @Provides
  @Singleton
  public fun clock(): Clock = Clock.System
}
