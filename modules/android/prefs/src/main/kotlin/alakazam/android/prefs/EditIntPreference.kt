package alakazam.android.prefs

import android.content.Context
import android.text.InputType
import android.util.AttributeSet
import androidx.annotation.CallSuper
import androidx.preference.EditTextPreference
import timber.log.Timber

public open class EditIntPreference @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
) : EditTextPreference(context, attrs) {
  @CallSuper
  override fun onAttached() {
    super.onAttached()
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
      Timber.e("Failed to parse '$value' as an integer")
      false
    }
  }

  private companion object {
    const val DEFAULT_VALUE = -1
  }
}
