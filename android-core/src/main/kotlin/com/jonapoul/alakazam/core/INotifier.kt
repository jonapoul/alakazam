package com.jonapoul.alakazam.core

import android.view.View
import androidx.annotation.StringRes

interface INotifier {
  data class Action(
    @StringRes val actionText: Int,
    val onClick: View.OnClickListener,
  )

  fun success(root: View, @StringRes message: Int, action: Action = EMPTY_ACTION)
  fun caution(root: View, @StringRes message: Int, action: Action = EMPTY_ACTION)
  fun warning(root: View, @StringRes message: Int, action: Action = EMPTY_ACTION)
  fun info(root: View, @StringRes message: Int, action: Action = EMPTY_ACTION)

  fun success(root: View, message: String, action: Action = EMPTY_ACTION)
  fun caution(root: View, message: String, action: Action = EMPTY_ACTION)
  fun warning(root: View, message: String, action: Action = EMPTY_ACTION)
  fun info(root: View, message: String, action: Action = EMPTY_ACTION)

  companion object {
    val EMPTY_ACTION = Action(android.R.string.ok) { /* No-op */ }
  }
}
