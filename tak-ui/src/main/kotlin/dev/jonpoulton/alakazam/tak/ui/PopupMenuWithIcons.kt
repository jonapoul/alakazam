package dev.jonpoulton.alakazam.tak.ui

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.text.SpannableStringBuilder
import android.text.style.ImageSpan
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import androidx.annotation.RequiresApi
import androidx.core.view.children
import androidx.core.view.forEach
import dev.jonpoulton.alakazam.tak.core.PluginContext

class PopupMenuWithIcons : PopupMenu {
  private val pluginContext: PluginContext

  @RequiresApi(Build.VERSION_CODES.LOLLIPOP_MR1)
  constructor(
    pluginContext: PluginContext,
    anchor: View,
    gravity: Int = Gravity.NO_GRAVITY,
    popupStyleAttr: Int = android.R.attr.popupMenuStyle,
    popupStyleRes: Int = 0,
  ) : super(pluginContext, anchor, gravity, popupStyleAttr, popupStyleRes) {
    this.pluginContext = pluginContext
  }

  constructor(
    pluginContext: PluginContext,
    anchor: View,
    gravity: Int = Gravity.NO_GRAVITY,
  ) : super(pluginContext, anchor, gravity) {
    this.pluginContext = pluginContext
  }

  override fun inflate(menuRes: Int) {
    super.inflate(menuRes)
    if (hasAnyIcons()) {
      menu.forEach(::insertMenuItemIcon)
    }
  }

  private fun hasAnyIcons(): Boolean = menu.children.any { it.icon != null }

  private fun insertMenuItemIcon(menuItem: MenuItem) {
    val icon = menuItem.icon ?: ColorDrawable(Color.TRANSPARENT)
    val iconSize = pluginContext.resources.getDimensionPixelSize(R.dimen.menu_item_icon_size)
    icon.setBounds(0, 0, iconSize, iconSize)
    val imageSpan = ImageSpan(icon)
    val ssb = SpannableStringBuilder("       " + menuItem.title)
    ssb.setSpan(imageSpan, 1, 2, 0)
    menuItem.title = ssb
    menuItem.icon = null // avoid android showing two icons in some weird scenarios
  }
}
