package dev.jonpoulton.alakazam.theme

import dev.jonpoulton.alakazam.prefs.PrefPair

internal object Constants {
  const val PREF_KEY = "app_theme"
  val PREF_PAIR = PrefPair(PREF_KEY, AppTheme.SYSTEM.string)
}