package com.jonapoul.common.ui.notifier

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.jonapoul.common.ui.R

class Notifier(
    @ColorRes private val backgroundColour: Int = R.color.notifierBackground,
    @ColorRes private val successColour: Int = R.color.notifierSuccess,
    @ColorRes private val infoColour: Int = R.color.notifierInfo,
    @ColorRes private val cautionColour: Int = R.color.notifierCaution,
    @ColorRes private val warningColour: Int = R.color.notifierWarning,
) {
    private fun snackbar(root: View, message: String, @ColorRes actionTextColour: Int) {
        val snackbar = Snackbar.make(root, message, Snackbar.LENGTH_LONG)
        snackbar.view.setBackgroundResource(backgroundColour)
        val text = snackbar.view.findViewById<TextView>(R.id.snackbar_text)
        text.maxLines = MAX_LINES // don't crop off any longer messages
        text.setTextColor(Color.WHITE)
        snackbar.setAction(DEFAULT_TEXT, DEFAULT_ACTION)
        snackbar.setActionTextColor(ContextCompat.getColor(root.context, actionTextColour))
        snackbar.show()
    }

    fun success(root: View, message: String) {
        snackbar(root, message, successColour)
    }

    fun success(root: View, @StringRes message: Int) {
        success(root, root.context.getString(message))
    }

    fun caution(root: View, message: String) {
        snackbar(root, message, cautionColour)
    }

    fun caution(root: View, @StringRes message: Int) {
        caution(root, root.context.getString(message))
    }

    fun warning(root: View, message: String) {
        snackbar(root, message, warningColour)
    }

    fun warning(root: View, @StringRes message: Int) {
        caution(root, root.context.getString(message))
    }

    fun info(root: View, message: String) {
        snackbar(root, message, infoColour)
    }

    fun info(root: View, @StringRes message: Int) {
        info(root, root.context.getString(message))
    }

    fun toast(context: Context, message: String) {
        Toast.makeText(context.applicationContext, message, Toast.LENGTH_LONG).show()
    }

    fun toast(context: Context, @StringRes message: Int) {
        toast(context, context.getString(message))
    }

    companion object {
        private const val DEFAULT_TEXT = "OK"
        private const val MAX_LINES = 20
        private val DEFAULT_ACTION = View.OnClickListener { /* No-op */ }
    }
}
