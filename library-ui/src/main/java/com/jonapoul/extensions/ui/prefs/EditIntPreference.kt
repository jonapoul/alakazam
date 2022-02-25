package com.jonapoul.extensions.ui.prefs

import android.content.Context
import android.text.InputType
import android.util.AttributeSet
import android.util.Log
import androidx.preference.EditTextPreference

class EditIntPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : EditTextPreference(
    context,
    attrs,
) {
    init {
        setOnBindEditTextListener {
            it.inputType = InputType.TYPE_CLASS_NUMBER or
                InputType.TYPE_NUMBER_FLAG_SIGNED
        }
    }

    override fun getPersistedString(defaultReturnValue: String?): String {
        return getPersistedInt(DEFAULT_VALUE).toString()
    }

    override fun persistString(value: String?): Boolean {
        return try {
            persistInt(value?.toInt() ?: DEFAULT_VALUE)
        } catch (e: NumberFormatException) {
            Log.e(TAG, "Failed to parse '$value' as an integer")
            false
        }
    }

    private companion object {
        val TAG: String = EditIntPreference::class.java.simpleName
        const val DEFAULT_VALUE = -1
    }
}
