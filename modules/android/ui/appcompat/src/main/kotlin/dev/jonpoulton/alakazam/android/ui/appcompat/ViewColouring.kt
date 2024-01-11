package dev.jonpoulton.alakazam.android.ui.appcompat

import android.widget.ImageButton
import androidx.annotation.ColorInt
import androidx.appcompat.widget.Toolbar

/**
 * Applies the given [ColorInt] colour to the text and icons of a [Toolbar].
 */
fun Toolbar.tintForeground(@ColorInt color: Int) {
  setTitleTextColor(color)
  setSubtitleTextColor(color)
  for (i in 0 until childCount) {
    val child = getChildAt(i) as? ImageButton
    child?.setColorFilter(color)
  }
}
