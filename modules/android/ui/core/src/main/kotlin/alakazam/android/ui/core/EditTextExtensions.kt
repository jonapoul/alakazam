package alakazam.android.ui.core

import alakazam.android.core.inputMethodManager
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.annotation.UiThread

@UiThread
public fun EditText.showKeyboard() {
  requestFocusFromTouch()
  val finalDotIndex = text?.lastIndexOf(char = '.')
  val selectionIndex = if (finalDotIndex == -1) text.length else finalDotIndex ?: 0
  setSelection(0, selectionIndex)
  context.inputMethodManager.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
}

public fun EditText.getString(): String {
  return text.toString()
}
