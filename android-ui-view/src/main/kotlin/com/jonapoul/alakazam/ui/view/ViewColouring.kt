package com.jonapoul.alakazam.ui.view

import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.appcompat.widget.Toolbar
import com.jonapoul.alakazam.core.getColorFromAttr
import com.jonapoul.alakazam.core.getCompatColor

/**
 * Applies the given [ColorInt] colour to the text and icons of a [Toolbar].
 */
fun Toolbar.tintForeground(@ColorInt color: Int) {
  setTitleTextColor(color)
  setSubtitleTextColor(color)
  (0 until childCount)
    .asSequence()
    .map(::getChildAt)
    .filterIsInstance<ImageButton>()
    .forEach { it.setColorFilter(color) }
}

/**
 * Quick method to allow changing the ColorFilter of an [TextView] just from a [ColorRes] integer.
 */
fun TextView.setTextColorRes(@ColorRes color: Int) {
  setTextColor(
    context.getCompatColor(color)
  )
}

/**
 * Quick method to allow changing the ColorFilter of an [TextView] just from a color attribute.
 */
fun TextView.setTextColorAttr(@AttrRes color: Int) {
  setTextColor(
    context.getColorFromAttr(color)
  )
}

/**
 * Quick method to allow changing the ColorFilter of an [ImageView] just from a [ColorRes] integer.
 */
fun ImageView.setColorFilterRes(@ColorRes color: Int) {
  setColorFilter(
    context.getCompatColor(color)
  )
}

/**
 * Quick method to allow changing the ColorFilter of an [ImageView] just from a color attribute.
 */
fun ImageView.setColorFilterAttr(@AttrRes color: Int) {
  setColorFilter(
    context.getColorFromAttr(color)
  )
}
