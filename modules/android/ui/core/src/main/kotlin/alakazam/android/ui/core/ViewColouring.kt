/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.ui.core

import alakazam.android.core.getColorFromAttr
import alakazam.android.core.getCompatColor
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.annotation.ColorRes

/**
 * Quick method to allow changing the ColorFilter of an [TextView] just from a [ColorRes] integer.
 */
public fun TextView.setTextColorRes(
  @ColorRes color: Int,
) {
  setTextColor(
    context.getCompatColor(color),
  )
}

/**
 * Quick method to allow changing the ColorFilter of an [TextView] just from a color attribute.
 */
public fun TextView.setTextColorAttr(
  @AttrRes color: Int,
) {
  setTextColor(
    context.getColorFromAttr(color),
  )
}

/**
 * Quick method to allow changing the ColorFilter of an [ImageView] just from a [ColorRes] integer.
 */
public fun ImageView.setColorFilterRes(
  @ColorRes color: Int,
) {
  setColorFilter(
    context.getCompatColor(color),
  )
}

/**
 * Quick method to allow changing the ColorFilter of an [ImageView] just from a color attribute.
 */
public fun ImageView.setColorFilterAttr(
  @AttrRes color: Int,
) {
  setColorFilter(
    context.getColorFromAttr(color),
  )
}
