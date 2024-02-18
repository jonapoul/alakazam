package alakazam.android.theme

import alakazam.android.prefs.core.PrefPair

internal object Constants {
  const val PREF_KEY = "app_theme"
  val PREF_PAIR = PrefPair(PREF_KEY, AppTheme.SYSTEM.string)
}
