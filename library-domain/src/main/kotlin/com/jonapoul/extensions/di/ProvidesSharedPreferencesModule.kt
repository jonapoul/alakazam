package com.jonapoul.extensions.di

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class ProvidesSharedPreferencesModule {
    @Provides
    fun providesSharedPreferences(
        @ApplicationContext context: Context,
    ): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
}
