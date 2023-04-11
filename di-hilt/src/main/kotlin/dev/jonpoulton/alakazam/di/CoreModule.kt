package dev.jonpoulton.alakazam.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.jonpoulton.alakazam.core.ActivityLauncher
import dev.jonpoulton.alakazam.core.SnackbarFeed
import dev.jonpoulton.alakazam.core.Toaster
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class CoreModule {
  @Provides
  fun launcher(
    @ApplicationContext context: Context,
  ): ActivityLauncher = ActivityLauncher(context)

  @Provides
  @Singleton
  fun snackbarFeed(): SnackbarFeed = SnackbarFeed()

  @Provides
  fun toaster(
    @ApplicationContext context: Context,
    @MainDispatcher main: CoroutineDispatcher,
  ): Toaster = Toaster(context, main)
}
