package com.jonapoul.common.ui

import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.annotation.XmlRes
import androidx.preference.PreferenceFragmentCompat

abstract class CorePreferenceFragment(
    @XmlRes private val preferenceXmlRes: Int,
) : PreferenceFragmentCompat() {

    @CallSuper
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(preferenceXmlRes, null)
    }
}
