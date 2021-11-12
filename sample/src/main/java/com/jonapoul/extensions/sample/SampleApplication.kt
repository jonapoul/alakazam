package com.jonapoul.extensions.sample

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.PreferenceManager
import com.jonapoul.extensions.dialogs.setDialogThemes
import com.jonapoul.extensions.sharedprefs.getIntFromPair

class SampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        AppCompatDelegate.setDefaultNightMode(
            prefs.getIntFromPair(Prefs.APP_THEME)
        )

        setDialogThemes(
            cautionTheme = R.style.Theme_Sample_AlertDialog_Caution,
            warningTheme = R.style.Theme_Sample_AlertDialog_Warning
        )
    }
}
