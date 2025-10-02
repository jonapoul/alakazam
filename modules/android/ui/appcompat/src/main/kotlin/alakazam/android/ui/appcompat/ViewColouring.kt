/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.ui.appcompat

import android.widget.ImageButton
import androidx.annotation.ColorInt
import androidx.appcompat.widget.Toolbar

/**
 * Applies the given [ColorInt] colour to the text and icons of a [Toolbar].
 */
public fun Toolbar.tintForeground(
  @ColorInt color: Int,
) {
  setTitleTextColor(color)
  setSubtitleTextColor(color)
  for (i in 0 until childCount) {
    val child = getChildAt(i) as? ImageButton
    child?.setColorFilter(color)
  }
}
