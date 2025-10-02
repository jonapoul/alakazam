/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.ui.material

import alakazam.android.core.INotifier
import alakazam.android.core.getCompatColor
import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import com.google.android.material.snackbar.Snackbar

public class Notifier(
  @param:ColorRes private val backgroundColour: Int = R.color.notifierBackground,
  @param:ColorRes private val successColour: Int = R.color.notifierSuccess,
  @param:ColorRes private val infoColour: Int = R.color.notifierInfo,
  @param:ColorRes private val cautionColour: Int = R.color.notifierCaution,
  @param:ColorRes private val warningColour: Int = R.color.notifierWarning,
) : INotifier {
  private fun snackbar(
    root: View,
    message: String,
    @ColorRes actionTextColour: Int,
    action: INotifier.Action,
  ) {
    val snackbar = Snackbar.make(root, message, Snackbar.LENGTH_LONG)
    snackbar.view.setBackgroundResource(backgroundColour)
    val text = snackbar.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
    text.maxLines = MAX_LINES // don't crop off any longer messages
    text.setTextColor(Color.WHITE)
    snackbar.setAction(action.actionText, action.onClick)
    snackbar.setActionTextColor(root.context.getCompatColor(actionTextColour))
    snackbar.show()
  }

  override fun success(root: View, message: String, action: INotifier.Action) {
    snackbar(root, message, successColour, action)
  }

  override fun success(
    root: View,
    @StringRes message: Int,
    action: INotifier.Action,
  ) {
    success(root, root.context.getString(message), action)
  }

  override fun caution(root: View, message: String, action: INotifier.Action) {
    snackbar(root, message, cautionColour, action)
  }

  override fun caution(
    root: View,
    @StringRes message: Int,
    action: INotifier.Action,
  ) {
    caution(root, root.context.getString(message), action)
  }

  override fun warning(root: View, message: String, action: INotifier.Action) {
    snackbar(root, message, warningColour, action)
  }

  override fun warning(
    root: View,
    @StringRes message: Int,
    action: INotifier.Action,
  ) {
    caution(root, root.context.getString(message), action)
  }

  override fun info(root: View, message: String, action: INotifier.Action) {
    snackbar(root, message, infoColour, action)
  }

  override fun info(
    root: View,
    @StringRes message: Int,
    action: INotifier.Action,
  ) {
    info(root, root.context.getString(message), action)
  }

  private companion object {
    const val MAX_LINES = 20
  }
}
