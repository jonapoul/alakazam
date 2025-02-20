package alakazam.di.hilt

import alakazam.kotlin.core.CoroutineContexts
import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.fredporciuncula.flow.preferences.FlowSharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

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
    contexts: CoroutineContexts,
  ): FlowSharedPreferences = FlowSharedPreferences(prefs, contexts.io)
}
