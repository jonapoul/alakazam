package com.jonapoul.alakazam.di

import android.content.Context
import com.jonapoul.alakazam.core.ActivityLauncher
import com.jonapoul.alakazam.core.SnackbarFeed
import com.jonapoul.alakazam.core.Toaster
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
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
