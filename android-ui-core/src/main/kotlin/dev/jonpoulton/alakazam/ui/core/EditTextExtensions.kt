package dev.jonpoulton.alakazam.ui.core

import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.annotation.UiThread
import androidx.core.content.getSystemService

@UiThread
fun EditText.showKeyboard() {
  val imm = context.getSystemService<InputMethodManager>()!!
  requestFocusFromTouch()
  val finalDotIndex = text?.lastIndexOf(char = '.')
  val selectionIndex = if (finalDotIndex == -1) text.length else finalDotIndex ?: 0
  setSelection(0, selectionIndex)
  imm.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
}

fun EditText.getString(): String {
  return text.toString()
}
