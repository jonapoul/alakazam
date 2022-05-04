package com.jonapoul.common.domain

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class Toaster @Inject constructor(
    @ApplicationContext private val context: Context,
) {
    fun toast(message: String, length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(context, message, length).show()
    }

    fun toast(@StringRes message: Int, length: Int = Toast.LENGTH_LONG) {
        toast(context.getString(message), length)
    }
}
