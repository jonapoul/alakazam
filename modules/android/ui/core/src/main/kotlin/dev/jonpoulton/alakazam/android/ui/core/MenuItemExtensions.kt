package dev.jonpoulton.alakazam.android.ui.core

import android.view.MenuItem

public fun MenuItem.show() {
  isVisible = true
}

public fun MenuItem.hide() {
  isVisible = false
}

public fun MenuItem.showIfTrue(condition: Boolean) {
  if (condition) show() else hide()
}

public fun MenuItem.hideIfTrue(condition: Boolean) {
  showIfTrue(!condition)
}
