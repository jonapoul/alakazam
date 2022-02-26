package com.jonapoul.extensions.domain

import android.content.Context
import androidx.annotation.StringRes

/**
 * Simple class intended to be overridden for the purpose of placing all "text-creation" operations
 * inside a single class. This makes domain layer classes like ViewModels and Use Cases cleaner
 * and easier to read, as well as easier to test.
 */
abstract class TextCreator(protected val context: Context) {
    protected fun fromRes(@StringRes res: Int): String = context.getString(res)
}
