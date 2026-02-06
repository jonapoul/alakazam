package alakazam.kotlin

// Pulled from https://www.romainguy.dev/posts/2024/speeding-up-isblank/
@Suppress("ComplexCondition", "NOTHING_TO_INLINE", "ReplaceManualRangeWithIndicesCalls")
public inline fun CharSequence.fastIsBlank(): Boolean {
  for (i in 0 until length) {
    val c = this[i]
    if (!Character.isWhitespace(c) && c != '\u00a0' && c != '\u2007' && c != '\u202f') {
      return false
    }
  }
  return true
}
