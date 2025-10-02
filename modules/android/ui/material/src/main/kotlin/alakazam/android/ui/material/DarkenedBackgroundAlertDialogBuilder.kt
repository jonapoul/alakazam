/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.android.ui.material

import android.content.Context
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * Simple wrapper class to apply a darkened background to any alert dialog popups. Note that this
 * doesn't apply to preference dialogs.
 */
public open class DarkenedBackgroundAlertDialogBuilder(
  context: Context,
  overrideThemeResId: Int = 0,
) : MaterialAlertDialogBuilder(context, overrideThemeResId) {
  override fun show(): AlertDialog = create().apply {
    window?.setDimAmount(DIM_AMOUNT)
    show()
  }

  private companion object {
    const val DIM_AMOUNT = 0.8f
  }
}
