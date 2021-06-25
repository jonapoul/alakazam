package com.jonapoul.extensions

import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

/**
 * Quick method to allow changing the ColorFilter of an [TextView] just from a [ColorRes] integer.
 */
fun TextView.setTextColorRes(@ColorRes color: Int) {
    setTextColor(
        ContextCompat.getColor(context, color)
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
