package dev.jonpoulton.alakazam.prefs

import android.content.Context
import android.text.InputType
import android.util.AttributeSet
import androidx.preference.EditTextPreference
import timber.log.Timber

open class EditFloatPreference @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
) : EditTextPreference(context, attrs) {
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
      Timber.e("Failed to parse '$value' as a float")
      false
    }
  }

  private companion object {
    const val DEFAULT_VALUE = -1.0f
  }
}
