package com.jonapoul.common.ui.view

import android.content.Context
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * Simple wrapper class to apply a darkened background to any alert dialog popups. Note that this
 * doesn't apply to preference dialogs.
 */
open class DarkenedBackgroundAlertDialogBuilder(
    context: Context,
    overrideThemeResId: Int = 0,
) : MaterialAlertDialogBuilder(
    context,
    overrideThemeResId
) {
    override fun show(): AlertDialog {
        val dialog = create()
        dialog.window?.setDimAmount(DIM_AMOUNT)
        dialog.show()
        return dialog
    }

    private companion object {
        const val DIM_AMOUNT = 0.8f
    }
}
