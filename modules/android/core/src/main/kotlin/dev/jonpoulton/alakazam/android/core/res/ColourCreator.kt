package dev.jonpoulton.alakazam.android.core.res

import android.content.Context
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

public abstract class ColourCreator(protected val context: Context) {
  @ColorInt
  protected fun fromRes(@ColorRes res: Int): Int = ContextCompat.getColor(context, res)
}
