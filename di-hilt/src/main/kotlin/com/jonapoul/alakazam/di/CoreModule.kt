package com.jonapoul.alakazam.di

import android.content.Context
import com.jonapoul.alakazam.core.ActivityLauncher
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class CoreModule {
    @Provides
    fun launcher(
        @ApplicationContext context: Context,
    ): ActivityLauncher = ActivityLauncher(context)
}
