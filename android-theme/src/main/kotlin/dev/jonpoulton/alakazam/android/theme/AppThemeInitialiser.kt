package dev.jonpoulton.alakazam.android.theme

import android.content.SharedPreferences
import dev.jonpoulton.alakazam.android.init.IAppInitialiser
import javax.inject.Inject

class AppThemeInitialiser @Inject constructor(
  private val prefs: SharedPreferences,
) : IAppInitialiser {
  override fun init() {
    AppTheme.init(prefs)
  }
}
