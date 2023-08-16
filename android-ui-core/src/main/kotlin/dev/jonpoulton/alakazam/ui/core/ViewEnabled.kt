package dev.jonpoulton.alakazam.ui.core

import android.view.View

fun View.enable() {
  isEnabled = true
}

fun View.disable() {
  isEnabled = false
}

fun View.enableIf(condition: Boolean) {
  if (condition) enable() else disable()
}

fun View.disableIf(condition: Boolean) {
  enableIf(!condition)
}

fun <A, B> View.enableIfEqual(valueA: A, valueB: B) {
  enableIf(valueA == valueB)
}

fun <A, B> View.disableIfEqual(valueA: A, valueB: B) {
  disableIf(valueA == valueB)
}

fun <T> View.enableIfNull(value: T?) {
  enableIf(value == null)
}

fun <T> View.disableIfNull(value: T?) {
  disableIf(value == null)
}
