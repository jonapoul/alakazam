package dev.jonpoulton.alakazam.tak.dagger

import android.content.SharedPreferences
import com.fredporciuncula.flow.preferences.FlowSharedPreferences
import dagger.Module
import dagger.Provides
import dev.jonpoulton.alakazam.kotlin.core.IODispatcher
import dev.jonpoulton.alakazam.tak.core.AppContext
import javax.inject.Singleton

@Module
class TakPreferencesModule {
  @Provides
  @Singleton
  @Suppress("DEPRECATION")
  fun sharedPrefs(appContext: AppContext): SharedPreferences {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(appContext)
  }

  @Provides
  @Singleton
  fun flowPrefs(prefs: SharedPreferences, io: IODispatcher): FlowSharedPreferences {
    return FlowSharedPreferences(prefs, io)
  }
}
