package com.jonapoul.extensions.sample

import androidx.appcompat.app.AppCompatDelegate
import com.jonapoul.extensions.data.PrefPair

object Prefs {
    val APP_THEME = PrefPair(key = "app_theme", default = AppCompatDelegate.MODE_NIGHT_NO)
}
