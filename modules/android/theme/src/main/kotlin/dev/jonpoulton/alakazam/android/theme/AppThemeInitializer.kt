package dev.jonpoulton.alakazam.android.theme

import android.content.SharedPreferences
import dev.jonpoulton.alakazam.android.init.AppInitializer
import javax.inject.Inject

class AppThemeInitializer @Inject constructor(
  private val prefs: SharedPreferences,
) : AppInitializer {
  override fun init() {
    AppTheme.init(prefs)
  }
}
