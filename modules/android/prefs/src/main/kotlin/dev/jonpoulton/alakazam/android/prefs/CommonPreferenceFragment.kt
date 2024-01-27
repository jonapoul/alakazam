package dev.jonpoulton.alakazam.android.prefs

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.annotation.CallSuper
import androidx.annotation.MenuRes
import androidx.annotation.XmlRes
import androidx.core.view.MenuProvider
import androidx.preference.PreferenceFragmentCompat

public abstract class CommonPreferenceFragment(
  @XmlRes private val settings: Int,
  @MenuRes private val menu: Int?,
) : PreferenceFragmentCompat(), MenuProvider {

  @CallSuper
  override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
    setPreferencesFromResource(settings, rootKey)
  }

  @CallSuper
  override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
    this.menu?.let { menuInflater.inflate(it, menu) }
  }

  override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
    // No-op by default
    return false
  }
}
