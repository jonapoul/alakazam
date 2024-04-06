package alakazam.android.core.res

import android.content.Context
import androidx.annotation.StringRes

public abstract class TextCreator(protected val context: Context) {
  protected fun fromRes(
    @StringRes res: Int,
  ): String = context.getString(res)
}
