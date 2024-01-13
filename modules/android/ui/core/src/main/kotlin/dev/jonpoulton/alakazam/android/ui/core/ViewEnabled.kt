package dev.jonpoulton.alakazam.android.ui.core

import android.view.View

public fun View.enable() {
  isEnabled = true
}

public fun View.disable() {
  isEnabled = false
}

public fun View.enableIf(condition: Boolean) {
  if (condition) enable() else disable()
}

public fun View.disableIf(condition: Boolean) {
  enableIf(!condition)
}

public fun <A, B> View.enableIfEqual(valueA: A, valueB: B) {
  enableIf(valueA == valueB)
}

public fun <A, B> View.disableIfEqual(valueA: A, valueB: B) {
  disableIf(valueA == valueB)
}

public fun <T> View.enableIfNull(value: T?) {
  enableIf(value == null)
}

public fun <T> View.disableIfNull(value: T?) {
  disableIf(value == null)
}
