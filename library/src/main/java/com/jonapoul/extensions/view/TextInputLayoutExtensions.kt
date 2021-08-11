package com.jonapoul.extensions.view

import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout.getString(): String = editText?.text?.toString() ?: ""
