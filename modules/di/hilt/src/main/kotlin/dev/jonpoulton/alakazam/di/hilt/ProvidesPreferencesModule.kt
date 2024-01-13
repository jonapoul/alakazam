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
public class ProvidesPreferencesModule {
  @Provides
  public fun sharedPrefs(
    @ApplicationContext context: Context,
  ): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)

  @Provides
  public fun flowPrefs(
    prefs: SharedPreferences,
    io: IODispatcher,
  ): FlowSharedPreferences = FlowSharedPreferences(prefs, io)
}
