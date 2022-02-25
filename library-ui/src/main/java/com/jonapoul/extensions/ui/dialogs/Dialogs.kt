package com.jonapoul.extensions.ui.dialogs

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import androidx.annotation.StringRes
import androidx.annotation.StyleRes
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.jonapoul.extensions.data.ifNotNull
import com.jonapoul.extensions.ui.R
import com.jonapoul.extensions.ui.databinding.DialogLoadingBinding

@StyleRes
private var warningThemeNullable: Int? = null

@StyleRes
private var cautionThemeNullable: Int? = null

fun setDialogThemes(@StyleRes cautionTheme: Int?, @StyleRes warningTheme: Int?) {
    cautionThemeNullable = cautionTheme
    warningThemeNullable = warningTheme
}

@Throws(IllegalStateException::class)
private fun throwIfNoTheme(): Int {
    throw IllegalStateException("Call setDialogThemes() before showing a dialog!")
}

fun Fragment.showLoadingDialog(
    @StringRes loadingText: Int = R.string.dialog_loading,
    onClickCancel: (() -> Unit)? = null,
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
) = requireActivity().showLoadingDialog(getString(loadingText), onClickCancel, extraConfig)

fun Activity.showLoadingDialog(
    loadingText: String = getString(R.string.dialog_loading),
    onClickCancel: (() -> Unit)? = null,
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
): AlertDialog {
    val inflater = LayoutInflater.from(this)
    val binding = DialogLoadingBinding.inflate(inflater, null, false)
    binding.loadingText.text = loadingText
    return MaterialAlertDialogBuilder(this)
        .setView(binding.root)
        .ifNotNull(onClickCancel) { setSimpleNegativeButton { it.invoke() } }
        .setCancelable(false)
        .extraConfig()
        .show()
}

fun Activity.showCautionDialog(
    message: String,
    title: String = getString(R.string.dialog_caution),
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
) = showCautionDialogImpl(this, title, message, extraConfig)

fun Activity.showWarningDialog(
    message: String,
    title: String = getString(R.string.dialog_warning),
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
) = showWarningDialogImpl(this, title, message, extraConfig)

fun Fragment.showCautionDialog(
    message: String,
    title: String = getString(R.string.dialog_caution),
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
) = showCautionDialogImpl(requireActivity(), title, message, extraConfig)

fun Fragment.showWarningDialog(
    message: String,
    title: String = getString(R.string.dialog_warning),
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder = { this },
) = showWarningDialogImpl(requireActivity(), title, message, extraConfig)

private fun showWarningDialogImpl(
    context: Context,
    title: String,
    message: String,
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder,
): AlertDialog = MaterialAlertDialogBuilder(context, warningThemeNullable ?: throwIfNoTheme())
    .setTitle(title)
    .setIcon(R.drawable.ic_warning)
    .setMessage(message)
    .setSimplePositiveButton()
    .extraConfig()
    .show()

private fun showCautionDialogImpl(
    context: Context,
    title: String,
    message: String,
    extraConfig: MaterialAlertDialogBuilder.() -> MaterialAlertDialogBuilder,
): AlertDialog = MaterialAlertDialogBuilder(context, cautionThemeNullable ?: throwIfNoTheme())
    .setTitle(title)
    .setIcon(R.drawable.ic_caution)
    .setMessage(message)
    .setSimplePositiveButton()
    .extraConfig()
    .show()
