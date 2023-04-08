package com.jonapoul.alakazam.ui.core

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class Toaster constructor(
    private val context: Context,
    private val main: CoroutineDispatcher,
) {
    fun toast(message: String, length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(context, message, length).show()
    }

    fun toast(@StringRes message: Int, length: Int = Toast.LENGTH_LONG) {
        toast(context.getString(message), length)
    }

    suspend fun coToast(message: String, length: Int = Toast.LENGTH_LONG) {
        withContext(main) {
            Toast.makeText(context, message, length).show()
        }
    }

    suspend fun coToast(@StringRes message: Int, length: Int = Toast.LENGTH_LONG) {
        coToast(context.getString(message), length)
    }
}
