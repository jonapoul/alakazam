package alakazam.android.prefs.core

@Deprecated(
  message = "Moved to alakazam.kotlin.core",
  replaceWith = ReplaceWith("PrefPair(i)", "alakazam.kotlin.core.PrefPair"),
  level = DeprecationLevel.ERROR,
)
public data class PrefPair<T>(
  val key: String,
  val default: T,
)
