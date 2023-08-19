package dev.jonpoulton.alakazam.ui.material

import android.widget.AutoCompleteTextView
import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout.getString(): String =
  editText?.text?.toString().orEmpty()

fun TextInputLayout.setText(text: String?) {
  editText?.setText(text)
}

fun TextInputLayout.setSpinnerText(text: String) {
  val autoCompleteTextView = editText as? AutoCompleteTextView ?: return
  autoCompleteTextView.setText(text, false)
}
