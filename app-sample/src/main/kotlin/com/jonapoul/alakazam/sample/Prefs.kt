package com.jonapoul.alakazam.sample

import androidx.appcompat.app.AppCompatDelegate
import com.jonapoul.alakazam.prefs.PrefPair

internal object Prefs {
  val APP_THEME = PrefPair(key = "app_theme", default = AppCompatDelegate.MODE_NIGHT_NO)
}
