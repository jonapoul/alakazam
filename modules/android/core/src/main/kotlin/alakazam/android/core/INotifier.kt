package alakazam.android.core

import android.view.View
import androidx.annotation.StringRes

public interface INotifier {
  public data class Action(
    @param:StringRes val actionText: Int,
    val onClick: View.OnClickListener,
  )

  public fun success(
    root: View,
    @StringRes message: Int,
    action: Action = EMPTY_ACTION,
  )

  public fun caution(
    root: View,
    @StringRes message: Int,
    action: Action = EMPTY_ACTION,
  )

  public fun warning(
    root: View,
    @StringRes message: Int,
    action: Action = EMPTY_ACTION,
  )

  public fun info(
    root: View,
    @StringRes message: Int,
    action: Action = EMPTY_ACTION,
  )

  public fun success(root: View, message: String, action: Action = EMPTY_ACTION)

  public fun caution(root: View, message: String, action: Action = EMPTY_ACTION)

  public fun warning(root: View, message: String, action: Action = EMPTY_ACTION)

  public fun info(root: View, message: String, action: Action = EMPTY_ACTION)

  public companion object {
    public val EMPTY_ACTION: Action = Action(android.R.string.ok) { /* No-op */ }
  }
}
