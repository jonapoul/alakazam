package alakazam.android.core.res

import alakazam.android.core.getCompatDrawable
import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes

public abstract class DrawableCreator(protected val context: Context) {
  protected fun fromRes(
    @DrawableRes res: Int,
  ): Drawable = context.getCompatDrawable(res)
}
