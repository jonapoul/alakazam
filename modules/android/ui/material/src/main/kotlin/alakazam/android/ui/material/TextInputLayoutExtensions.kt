package alakazam.android.ui.material

import android.widget.AutoCompleteTextView
import com.google.android.material.textfield.TextInputLayout

public fun TextInputLayout.getString(): String =
  editText?.text?.toString().orEmpty()

public fun TextInputLayout.setText(text: String?) {
  editText?.setText(text)
}

public fun TextInputLayout.setSpinnerText(text: String) {
  val autoCompleteTextView = editText as? AutoCompleteTextView ?: return
  autoCompleteTextView.setText(text, false)
}
