package dev.jonpoulton.alakazam.di.hilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.jonpoulton.alakazam.android.core.ActivityLauncher
import dev.jonpoulton.alakazam.android.core.SnackbarFeed
import dev.jonpoulton.alakazam.android.core.Toaster
import dev.jonpoulton.alakazam.kotlin.core.MainDispatcher
import dev.jonpoulton.alakazam.kotlin.time.Clock
import dev.jonpoulton.alakazam.kotlin.time.SystemClock
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ProvidesCoreModule {
  @Provides
  fun launcher(
    @ApplicationContext context: Context,
  ): ActivityLauncher = ActivityLauncher(context)

  @Provides
  @Singleton
  fun snackbarFeed(): SnackbarFeed = SnackbarFeed()

  @Provides
  fun clock(): Clock = SystemClock

  @Provides
  fun toaster(
    @ApplicationContext context: Context,
    main: MainDispatcher,
  ): Toaster = Toaster(main, appContext = context, resourcesContext = context)
}
