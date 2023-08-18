@file:Suppress("DEPRECATION")

package dev.jonpoulton.alakazam.tak.di

import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.fredporciuncula.flow.preferences.FlowSharedPreferences
import dagger.Module
import dagger.Provides
import dev.jonpoulton.alakazam.core.IODispatcher
import dev.jonpoulton.alakazam.tak.core.AppContext
import javax.inject.Singleton

@Module
class AlakazamPreferencesModule {
  @Provides
  @Singleton
  fun sharedPrefs(appContext: AppContext): SharedPreferences {
    return PreferenceManager.getDefaultSharedPreferences(appContext)
  }

  @Provides
  @Singleton
  fun flowPrefs(prefs: SharedPreferences, io: IODispatcher): FlowSharedPreferences {
    return FlowSharedPreferences(prefs, io)
  }
}
