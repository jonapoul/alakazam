package com.jonapoul.extensions.snackbar

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.ColorInt
import androidx.annotation.StringRes
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

internal class Notifier : INotifier {
    private fun snackbar(
        root: View,
        message: String,
        @ColorInt bgColour: Int,
        @ColorInt textColour: Int
    ) {
        val snackbar = Snackbar.make(root, message, Snackbar.LENGTH_LONG)
        val view = snackbar.view
        view.setBackgroundColor(bgColour)
        val text = view.findViewById<TextView>(R.id.snackbar_text)
        text.setTextColor(textColour)
        text.maxLines = 20 // don't crop off any longer messages
        snackbar.setAction(DEFAULT_TEXT, DEFAULT_ACTION)
        snackbar.setActionTextColor(textColour)
        snackbar.show()
    }

    override fun success(root: View, message: String) {
        snackbar(root, message, DEFAULT_SUCCESS, Color.WHITE)
    }

    override fun success(root: View, message: Int) {
        success(root, root.context.getString(message))
    }

    override fun info(root: View, message: String) {
        snackbar(root, message, DEFAULT_INFO, Color.BLACK)
    }

    override fun info(root: View, message: Int) {
        info(root, root.context.getString(message))
    }

    override fun warn(root: View, message: String) {
        snackbar(root, message, DEFAULT_WARNING, Color.BLACK)
    }

    override fun warn(root: View, message: Int) {
        warn(root, root.context.getString(message))
    }

    override fun error(root: View, message: String) {
        snackbar(root, message, DEFAULT_ERROR, Color.WHITE)
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

        val DEFAULT_SUCCESS = Color.parseColor("#007E33")
        val DEFAULT_WARNING = Color.parseColor("#FF8800")
        val DEFAULT_ERROR = Color.parseColor("#CC0000")
        val DEFAULT_INFO = Color.parseColor("#0099CC")
    }
}
