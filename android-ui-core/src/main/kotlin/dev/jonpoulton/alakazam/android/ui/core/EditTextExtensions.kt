package dev.jonpoulton.alakazam.android.ui.core

import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.annotation.UiThread
import dev.jonpoulton.alakazam.android.core.inputMethodManager

@UiThread
fun EditText.showKeyboard() {
  requestFocusFromTouch()
  val finalDotIndex = text?.lastIndexOf(char = '.')
  val selectionIndex = if (finalDotIndex == -1) text.length else finalDotIndex ?: 0
  setSelection(0, selectionIndex)
  context.inputMethodManager.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
}

fun EditText.getString(): String {
  return text.toString()
}
