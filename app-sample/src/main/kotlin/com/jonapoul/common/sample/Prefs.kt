package com.jonapoul.common.sample

import androidx.appcompat.app.AppCompatDelegate
import com.jonapoul.common.core.PrefPair

object Prefs {
    val APP_THEME = PrefPair(key = "app_theme", default = AppCompatDelegate.MODE_NIGHT_NO)
}
