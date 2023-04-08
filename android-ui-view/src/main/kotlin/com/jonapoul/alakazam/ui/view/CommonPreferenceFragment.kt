package com.jonapoul.alakazam.ui.view

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.annotation.CallSuper
import androidx.annotation.IdRes
import androidx.annotation.MenuRes
import androidx.annotation.XmlRes
import androidx.core.view.MenuProvider
import androidx.preference.PreferenceFragmentCompat
import com.jonapoul.alakazam.ui.core.navControllers

abstract class CommonPreferenceFragment(
  @XmlRes private val settings: Int,
  @MenuRes private val menu: Int?,
) : PreferenceFragmentCompat(), MenuProvider {

  protected val navController by navControllers()

  @CallSuper
  override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
    setPreferencesFromResource(settings, rootKey)
  }

  @CallSuper
  override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
    this.menu?.let { menuInflater.inflate(it, menu) }
  }

  protected open fun onMenuItemSelected(@IdRes menuItemId: Int): Boolean = false

  final override fun onMenuItemSelected(menuItem: MenuItem): Boolean = onMenuItemSelected(menuItem.itemId)
}
