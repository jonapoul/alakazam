package com.jonapoul.common.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.MenuRes
import androidx.annotation.XmlRes
import androidx.preference.PreferenceFragmentCompat

abstract class CommonPreferenceFragment(
    @XmlRes private val settings: Int,
    @MenuRes private val menu: Int?,
) : PreferenceFragmentCompat() {

    protected val navController by navControllers()

    @CallSuper
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(settings, null)
    }

    @CallSuper
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        setHasOptionsMenu(menu != null)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    @CallSuper
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        this.menu?.let { inflater.inflate(it, menu) }
    }
}
