package com.jonapoul.alakazam.ui.view

import android.os.Build
import android.widget.AutoCompleteTextView
import androidx.annotation.RequiresApi
import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout.getString(): String =
    editText?.text?.toString() ?: ""

fun TextInputLayout.setText(text: String?) {
    editText?.setText(text)
}

@RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
fun TextInputLayout.setSpinnerText(text: String) {
    val autoCompleteTextView = editText as? AutoCompleteTextView ?: return
    autoCompleteTextView.setText(text, false)
}
