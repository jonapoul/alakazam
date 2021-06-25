package com.jonapoul.extensions

import android.widget.ImageView
import androidx.annotation.AttrRes
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

/**
 * Quick method to allow changing the ColorFilter of an [ImageView] just from a [ColorRes] integer.
 */
fun ImageView.setColorFilterRes(@ColorRes color: Int) {
    setColorFilter(
        ContextCompat.getColor(context, color)
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
