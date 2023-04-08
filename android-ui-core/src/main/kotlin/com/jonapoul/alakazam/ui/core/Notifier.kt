package com.jonapoul.alakazam.ui.core

import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import com.google.android.material.snackbar.Snackbar
import com.jonapoul.alakazam.core.getCompatColor

class Notifier(
    @ColorRes private val backgroundColour: Int = R.color.notifierBackground,
    @ColorRes private val successColour: Int = R.color.notifierSuccess,
    @ColorRes private val infoColour: Int = R.color.notifierInfo,
    @ColorRes private val cautionColour: Int = R.color.notifierCaution,
    @ColorRes private val warningColour: Int = R.color.notifierWarning,
) {
    data class Action(
        @StringRes val actionText: Int,
        val onClick: View.OnClickListener,
    )

    private fun snackbar(root: View, message: String, @ColorRes actionTextColour: Int, action: Action) {
        val snackbar = Snackbar.make(root, message, Snackbar.LENGTH_LONG)
        snackbar.view.setBackgroundResource(backgroundColour)
        val text = snackbar.view.findViewById<TextView>(R.id.snackbar_text)
        text.maxLines = MAX_LINES // don't crop off any longer messages
        text.setTextColor(Color.WHITE)
        snackbar.setAction(action.actionText, action.onClick)
        snackbar.setActionTextColor(root.context.getCompatColor(actionTextColour))
        snackbar.show()
    }

    fun success(root: View, message: String, action: Action = EMPTY_ACTION) {
        snackbar(root, message, successColour, action)
    }

    fun success(root: View, @StringRes message: Int, action: Action = EMPTY_ACTION) {
        success(root, root.context.getString(message), action)
    }

    fun caution(root: View, message: String, action: Action = EMPTY_ACTION) {
        snackbar(root, message, cautionColour, action)
    }

    fun caution(root: View, @StringRes message: Int, action: Action = EMPTY_ACTION) {
        caution(root, root.context.getString(message), action)
    }

    fun warning(root: View, message: String, action: Action = EMPTY_ACTION) {
        snackbar(root, message, warningColour, action)
    }

    fun warning(root: View, @StringRes message: Int, action: Action = EMPTY_ACTION) {
        caution(root, root.context.getString(message), action)
    }

    fun info(root: View, message: String, action: Action = EMPTY_ACTION) {
        snackbar(root, message, infoColour, action)
    }

    fun info(root: View, @StringRes message: Int, action: Action = EMPTY_ACTION) {
        info(root, root.context.getString(message), action)
    }

    companion object {
        private const val MAX_LINES = 20
        val EMPTY_ACTION = Action(android.R.string.ok) { /* No-op */ }
    }
}
