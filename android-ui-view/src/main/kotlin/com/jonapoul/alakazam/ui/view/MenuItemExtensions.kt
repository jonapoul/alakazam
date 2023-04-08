package com.jonapoul.alakazam.ui.view

import android.view.MenuItem

fun MenuItem.show() {
  isVisible = true
}

fun MenuItem.hide() {
  isVisible = false
}

fun MenuItem.showIfTrue(condition: Boolean) {
  if (condition) show() else hide()
}

fun MenuItem.hideIfTrue(condition: Boolean) {
  showIfTrue(!condition)
}
