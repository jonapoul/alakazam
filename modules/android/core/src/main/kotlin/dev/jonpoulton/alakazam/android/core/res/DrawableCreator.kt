package dev.jonpoulton.alakazam.android.core.res

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import dev.jonpoulton.alakazam.android.core.getCompatDrawable

abstract class DrawableCreator(protected val context: Context) {
  protected fun fromRes(@DrawableRes res: Int): Drawable = context.getCompatDrawable(res)
}
