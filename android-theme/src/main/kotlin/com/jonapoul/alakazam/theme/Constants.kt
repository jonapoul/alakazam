package com.jonapoul.alakazam.theme

import com.jonapoul.alakazam.prefs.PrefPair

internal object Constants {
  const val PREF_KEY = "app_theme"
  val PREF_PAIR = PrefPair(PREF_KEY, AppTheme.SYSTEM.string)
}
