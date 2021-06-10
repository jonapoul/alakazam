package com.jonapoul.extensions

import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

fun TextView.setTextColorRes(@ColorRes color: Int) {
    setTextColor(
        ContextCompat.getColor(context, color)
    )
}
