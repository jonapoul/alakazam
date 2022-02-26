package com.jonapoul.common.ui.prefs

import android.content.Context
import android.text.InputType
import android.util.AttributeSet
import android.util.Log
import androidx.preference.EditTextPreference

class EditFloatPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : EditTextPreference(
    context,
    attrs,
) {
    init {
        setOnBindEditTextListener {
            it.inputType = InputType.TYPE_CLASS_NUMBER or
                InputType.TYPE_NUMBER_FLAG_DECIMAL or
                InputType.TYPE_NUMBER_FLAG_SIGNED
        }
    }

    override fun getPersistedString(defaultReturnValue: String): String {
        return getPersistedFloat(DEFAULT_VALUE).toString()
    }

    override fun persistString(value: String?): Boolean {
        return try {
            persistFloat(value?.toFloat() ?: DEFAULT_VALUE)
        } catch (e: NumberFormatException) {
            Log.e(TAG, "Failed to parse '$value' as a float")
            false
        }
    }

    private companion object {
        val TAG: String = EditFloatPreference::class.java.simpleName
        const val DEFAULT_VALUE = -1.0f
    }
}
