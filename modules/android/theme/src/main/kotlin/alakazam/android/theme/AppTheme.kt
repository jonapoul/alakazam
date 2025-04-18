package alakazam.android.theme

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.edit

/**
 * An enum class to hold the three possible app theme states: light, dark and system.
 */
public enum class AppTheme(public val string: String, public val mode: Int) {
  SYSTEM(string = "system", AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM),
  LIGHT(string = "light", AppCompatDelegate.MODE_NIGHT_NO),
  DARK(string = "dark", AppCompatDelegate.MODE_NIGHT_YES),
  ;

  public companion object {
    internal var sharedPrefs: SharedPreferences? = null

    /**
     * Persists and applies the given [AppTheme] to the app.
     */
    public fun set(theme: AppTheme) {
      sharedPrefs?.edit { putString(AppThemePreference.PREF_KEY, theme.string) }
      AppCompatDelegate.setDefaultNightMode(theme.mode)
    }

    /**
     * Attempts to get the saved app theme from the app's [SharedPreferences], then applies it.
     */
    public fun setFromPrefs() {
      AppCompatDelegate.setDefaultNightMode(
        fromString(
          sharedPrefs?.getString(AppThemePreference.PREF_KEY, SYSTEM.string),
        ),
      )
    }

    /**
     * Should be called in the Application or Activity's onCreate method. Sets the initial theme state based on
     * whatever was persisted before, defaulting to "follow system".
     */
    public fun init(prefs: SharedPreferences) {
      sharedPrefs = prefs
      setFromPrefs()
    }

    /**
     * Returns the [AppCompatDelegate] constant integer corresponding to the given [str] value. [str] should take one
     * of the values "system", "light" or "dark" (case-sensitive) - or else an [IllegalStateException] is thrown.
     */
    private fun fromString(str: String?): Int = values()
      .firstOrNull { it.string == str }
      ?.mode
      ?: error("Unknown theme '$str'")
  }
}
