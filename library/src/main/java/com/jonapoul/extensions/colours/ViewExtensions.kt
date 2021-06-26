package com.jonapoul.extensions.colours

import android.os.Build
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat

/**
 * Applies the given [ColorInt] colour to the text and icons of a [Toolbar].
 */
@RequiresApi(Build.VERSION_CODES.FROYO)
fun Toolbar.tintForeground(@ColorInt color: Int) {
    setTitleTextColor(color)
    setSubtitleTextColor(color)
    (0 until childCount)
        .asSequence()
        .map { getChildAt(it) }
        .filterIsInstance<ImageButton>()
        .forEach { it.setColorFilter(color) }
}

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

/**
 * Quick method to allow changing the ColorFilter of an [ImageView] just from a [ColorRes] integer.
 */
@RequiresApi(Build.VERSION_CODES.FROYO)
fun ImageView.setColorFilterRes(@ColorRes color: Int) {
    setColorFilter(
        ContextCompat.getColor(context, color)
    )
}

/**
 * Quick method to allow changing the ColorFilter of an [ImageView] just from a color attribute.
 */
@RequiresApi(Build.VERSION_CODES.FROYO)
fun ImageView.setColorFilterAttr(@AttrRes color: Int) {
    setColorFilter(
        context.getColorFromAttr(color)
    )
}
