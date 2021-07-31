package com.jonapoul.extensions.snackbar

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.jonapoul.extensions.R

interface INotifier {
    fun success(root: View, message: String)
    fun success(root: View, @StringRes message: Int)
    fun info(root: View, message: String)
    fun info(root: View, @StringRes message: Int)
    fun warn(root: View, message: String)
    fun warn(root: View, @StringRes message: Int)
    fun error(root: View, message: String)
    fun error(root: View, @StringRes message: Int)
    fun toast(context: Context, message: String)
    fun toast(context: Context, @StringRes message: Int)
}

class Notifier(
    @ColorRes private val successColour: Int = R.color.notifier_success,
    @ColorRes private val infoColour: Int = R.color.notifier_info,
    @ColorRes private val warningColour: Int = R.color.notifier_warning,
    @ColorRes private val errorColour: Int = R.color.notifier_error,
) : INotifier {

    fun snackbar(
        root: View,
        message: String,
        @ColorRes bgColour: Int,
        @ColorInt textColour: Int
    ) {
        val snackbar = Snackbar.make(root, message, Snackbar.LENGTH_LONG)
        val view = snackbar.view
        view.setBackgroundColor(ContextCompat.getColor(view.context, bgColour))
        val text = view.findViewById<TextView>(R.id.snackbar_text)
        text.setTextColor(textColour)
        text.maxLines = 20 // don't crop off any longer messages
        snackbar.setAction(DEFAULT_TEXT, DEFAULT_ACTION)
        snackbar.setActionTextColor(textColour)
        snackbar.show()
    }

    override fun success(root: View, message: String) {
        snackbar(root, message, successColour, Color.WHITE)
    }

    override fun success(root: View, message: Int) {
        success(root, root.context.getString(message))
    }

    override fun info(root: View, message: String) {
        snackbar(root, message, infoColour, Color.BLACK)
    }

    override fun info(root: View, message: Int) {
        info(root, root.context.getString(message))
    }

    override fun warn(root: View, message: String) {
        snackbar(root, message, warningColour, Color.BLACK)
    }

    override fun warn(root: View, message: Int) {
        warn(root, root.context.getString(message))
    }

    override fun error(root: View, message: String) {
        snackbar(root, message, errorColour, Color.WHITE)
    }

    override fun error(root: View, message: Int) {
        error(root, root.context.getString(message))
    }

    override fun toast(context: Context, message: String) {
        Toast.makeText(context.applicationContext, message, Toast.LENGTH_LONG).show()
    }

    override fun toast(context: Context, message: Int) {
        toast(context, context.getString(message))
    }

    private companion object {
        const val DEFAULT_TEXT = "OK"
        val DEFAULT_ACTION = View.OnClickListener { /* No-op */ }
    }
}
