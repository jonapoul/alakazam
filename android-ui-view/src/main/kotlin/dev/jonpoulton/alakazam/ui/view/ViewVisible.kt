package dev.jonpoulton.alakazam.ui.view

import android.view.View
import androidx.annotation.UiThread

@UiThread
fun View.show() {
  visibility = View.VISIBLE
}

@UiThread
fun View.hide(maintainLayout: Boolean = false) {
  visibility = if (maintainLayout) View.INVISIBLE else View.GONE
}

@UiThread
fun View.showIfTrue(condition: Boolean, maintainLayout: Boolean = false) {
  if (condition) show() else hide(maintainLayout)
}

@UiThread
fun View.hideIfTrue(condition: Boolean, maintainLayout: Boolean = false) {
  showIfTrue(!condition, maintainLayout)
}

@UiThread
fun <A, B> View.showIfEquals(itemA: A, itemB: B, maintainLayout: Boolean = false) {
  if (itemA == itemB) show() else hide(maintainLayout)
}

@UiThread
fun <A, B> View.hideIfEquals(itemA: A, itemB: B, maintainLayout: Boolean = false) {
  if (itemA != itemB) hide(maintainLayout) else show()
}

@UiThread
fun <T> View.showIfNull(value: T?, maintainLayout: Boolean = false) {
  if (value == null) show() else hide(maintainLayout)
}

@UiThread
fun <T> View.hideIfNull(value: T?, maintainLayout: Boolean = false) {
  if (value == null) hide(maintainLayout) else show()
}
