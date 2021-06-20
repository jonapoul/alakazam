package com.jonapoul.extensions

import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

fun TextView.setTextColorRes(@ColorRes color: Int) {
    setTextColor(
        ContextCompat.getColor(context, color)
    )
}

fun TextView.setTextColorAttr(@AttrRes color: Int) {
    setTextColor(
        context.getColorFromAttr(color)
    )
}
