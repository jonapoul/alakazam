package com.jonapoul.extensions.ui

import android.text.Editable
import android.text.TextWatcher

abstract class SimpleTextWatcher : TextWatcher {
    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        /* To be overridden */
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        /* To be overridden */
    }

    override fun afterTextChanged(s: Editable?) {
        /* To be overridden */
    }
}
