package com.jonapoul.extensions

import android.widget.ImageView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

fun ImageView.setColorFilterRes(@ColorRes color: Int) {
    setColorFilter(
        ContextCompat.getColor(context, color)
    )
}

fun ImageView.setColorFilterAttr(@ColorRes color: Int) {
    setColorFilter(
        context.getColorFromAttr(color)
    )
}
