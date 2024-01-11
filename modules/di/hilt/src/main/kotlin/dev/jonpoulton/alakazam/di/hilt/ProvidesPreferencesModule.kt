package dev.jonpoulton.alakazam.di.hilt

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.fredporciuncula.flow.preferences.FlowSharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.jonpoulton.alakazam.kotlin.core.IODispatcher

@InstallIn(SingletonComponent::class)
@Module
class ProvidesPreferencesModule {
  @Provides
  fun sharedPrefs(
    @ApplicationContext context: Context,
  ): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)

  @Provides
  fun flowPrefs(
    prefs: SharedPreferences,
    io: IODispatcher,
  ): FlowSharedPreferences = FlowSharedPreferences(prefs, io)
}
