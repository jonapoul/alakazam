package com.jonapoul.common.ui.prefs

import android.content.Context
import android.util.TypedValue

/**
 * Copied from [androidx.core.content.res.TypedArrayUtils], because for whatever reason that class
 * is set as package-private in the Android SDK.
 */
object TypedArrayUtils2 {
    fun getAttr(context: Context, attr: Int, fallbackAttr: Int): Int {
        val value = TypedValue()
        context.theme.resolveAttribute(attr, value, true)
        return if (value.resourceId != 0) attr else fallbackAttr
    }
}
