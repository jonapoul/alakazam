package alakazam.android.theme

import alakazam.android.init.AppInitializer
import android.content.SharedPreferences
import javax.inject.Inject

public class AppThemeInitializer @Inject constructor(
  private val prefs: SharedPreferences,
) : AppInitializer {
  override fun init() {
    AppTheme.init(prefs)
  }
}
