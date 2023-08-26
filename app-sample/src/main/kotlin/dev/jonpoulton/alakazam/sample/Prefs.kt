package dev.jonpoulton.alakazam.sample

import androidx.appcompat.app.AppCompatDelegate
import dev.jonpoulton.alakazam.android.prefs.PrefPair

internal object Prefs {
  val APP_THEME = PrefPair(key = "app_theme", default = AppCompatDelegate.MODE_NIGHT_NO)
}
