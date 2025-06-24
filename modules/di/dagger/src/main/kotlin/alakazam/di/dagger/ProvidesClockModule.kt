package alakazam.di.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import kotlin.time.Clock

@Module
public class ProvidesClockModule {
  @Provides
  @Singleton
  public fun clock(): Clock = Clock.System
}
